package com.ictech.code;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Lecturer extends JFrame{
    private JPanel PanelLecturer;
    private JTextField txtLecturerName;
    private JTabbedPane LecturerPane;
    private JPanel tbbProfle;
    private JPanel tbbAddMaterals;
    private JPanel tbbUploadMars;
    private JPanel tbbChecElgbty;
    private JPanel tbbShowMas;
    private JPanel tbbGrades;
    private JPanel tbbGPA;
    private JPanel tbbCA;
    private JPanel tbbAttendace;
    private JPanel tbbMedcal;
    private JLabel lblgrp7;
    private JTable tablee1;
    private JTabbedPane tabbedPane1;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField Date_of_Birth;
    private JButton updateButton;
    private JLabel lecId;
    private JTabbedPane tabbedPane2;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JRadioButton quiz1RadioButton;
    private JRadioButton quiz2RadioButton;
    private JRadioButton quiz3RadioButton;
    private JRadioButton quiz4RadioButton;
    private JTextField textField2;
    private JButton updateButton1;
    private JButton clearButton;
    private JRadioButton assessments1RadioButton;
    private JRadioButton assessments2RadioButton;
    private JTextField textField3;
    private JButton updateButton2;
    private JButton clearButton1;
    private JComboBox comboBox2;
    private JTextField textField4;
    private JTextField textField5;
    private JButton updateButton3;
    private JButton clearButton2;
    private JComboBox comboBox3;
    private JTextField textField7;
    private JTextField textField6;
    private JButton updateButton5;
    private JComboBox comboBox4;
    private JTextField textField8;
    private JTextField textField9;
    private JButton updateButton4;
    private JButton cleraButton;
    private JButton clearButton3;
    private JTable markstable;

    Connection con;
    PreparedStatement pst;

    public  Lecturer() {
        connect();
        table_load();
        show_marks();
        //stud1.addActionListener(new ActionListener() {
          //  @Override
          //  public void actionPerformed(ActionEvent e) {

         //   }
        //});
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String fName = firstname.getText();
                String lName = lastname.getText();
                String e_mail = email.getText();
                String DOB = Date_of_Birth.getText();
                int id= 2;

                try {
                    pst = con.prepareStatement("UPDATE lecture set Fname = ?,Lname=? ,Email= ?,DOB= ? where = ?");
                    pst.setString(1,fName);
                    pst.setString(2,lName);
                    pst.setString(3,e_mail);
                    pst.setString(4,DOB);
                    pst.setInt(5,id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Recoard Updated..!!!");
                    table_load();
                    firstname.setText("");
                    lastname.setText("");
                    email.setText("");
                    Date_of_Birth.setText("");

                }

                catch(SQLException e1){
                    e1.printStackTrace();

                }

            }
        });
    }
// !!! Again try one
    public void lacture_details(){
        try{
            pst = con.prepareStatement("SELECT Lec_id FROM lecturer");
            ResultSet lecId = pst.executeQuery();
            lecId.next();
        }

        catch(SQLException e){

        }


    }

    //Show student tables...
    public void table_load(){
        try{
        pst = con.prepareStatement("SELECT * FROM student");
        ResultSet marks_tab = pst.executeQuery();
        markstable.setModel(DbUtils.resultSetToTableModel(marks_tab));
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }
// Marks Show tables...
    public void show_marks(){
        try{
            pst = con.prepareStatement("SELECT * FROM marks");
            ResultSet st_tab = pst.executeQuery();
            markstable.setModel(DbUtils.resultSetToTableModel(st_tab));
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JFrame lecture = new JFrame("PanelLecturer");
        lecture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lecture.pack();
        lecture.setContentPane(new Lecturer().PanelLecturer);
        lecture.setVisible(true);
    }

    //Database connect...
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms-java","root","1234");
            System.out.println("DB Connected");
        }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch (SQLException e){
            e.printStackTrace();

        }
}



}





