package com.ictech.code;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton updateButton;
    private JLabel lecId;

    Connection con;
    PreparedStatement pst;

    public  Lecturer() {
        connect();
        table_load();
        //stud1.addActionListener(new ActionListener() {
          //  @Override
          //  public void actionPerformed(ActionEvent e) {

         //   }
        //});
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

    public void table_load(){
        try{
        pst = con.prepareStatement("SELECT * FROM student");
        ResultSet st_tab = pst.executeQuery();
        tablee1.setModel(DbUtils.resultSetToTableModel(st_tab));
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





