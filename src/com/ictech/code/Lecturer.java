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
    private JComboBox subCod;
    private JTextField stuId;
    private JTextField marks;
    private JButton quizMarks;
    private JButton clearButton;
    private JTextField textAssesMarks;
    private JButton assessmentsMarks;
    private JButton clearButton1;
    private JComboBox subjCode;
    private JTextField txtStuId;
    private JTextField textMidMaark;
    private JButton midMarks;
    private JButton clearButton2;
    private JComboBox finTheo;
    private JTextField theStudId;
    private JTextField therMarks;
    private JButton finTheMark;
    private JComboBox finPracSubCod;
    private JTextField finalStudId;
    private JTextField finalMarks;
    private JButton finalPracticalMarks;
    private JButton clearButton4;
    private JButton clearButton3;
    private JTable markstable;
    private JComboBox qui;
    private JComboBox assSelect;
    private JTextField mak;
    private JLabel lblSubCod;
    private JComboBox subjCod;
    private JTextField textStudId;
    private JPanel lId;
    private JLabel detLecId;

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

        // Lecture details update....
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String fName = firstname.getText();
                String lName = lastname.getText();
                String e_mail = email.getText();
                String DOB = Date_of_Birth.getText();
                //String lecId = String.valueOf(2);

                try {
                    pst = con.prepareStatement("UPDATE lecturer set Fname = ?,Lname=? ,Email= ?,DOB= ? where Lec_id = 2 ");
                    pst.setString(1,fName);
                    pst.setString(2,lName);
                    pst.setString(3,e_mail);
                    pst.setString(4,DOB);
                   // pst.setString(5,lecId);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Recoard Updated..!!!");
                    table_load();
                    firstname.setText("");
                    lastname.setText("");
                    email.setText("");
                    Date_of_Birth.setText("");
                    firstname.requestFocus();

                }

                catch(SQLException e1){
                    e1.printStackTrace();

                }

            }
        });

        //upload the quiz marks...
        quizMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) subCod.getSelectedItem();
                String studentID = stuId.getText();
                String quizMarks = (String) qui.getSelectedItem();
                String qMarks = mak.getText();
                //System.out.println("You select " + quizMarks);

                if(quizMarks == "Quiz01"){
                    try {
                        String sql;
                        sql = "INSERT INTO marks(Course_code,Std_id,Quiz01)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);
                       // pst.setString(1,studentID);
                        pst.setString(1, subCode);
                        pst.setString(2,studentID);
                        pst.setString(3,qMarks);


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz01 Marks Uploaded..!!!");
                        stuId.setText("");
                        mak.setText("");
                        stuId.requestFocus();

                    }

                    catch(SQLException e1){
                        e1.printStackTrace();

                    }



                }
                else if (quizMarks == "Quiz02") {

                    try {

                        String sql;
                        sql = "INSERT INTO marks(Course_code,Std_id,Quiz02)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);

                        pst.setString(1, subCode);
                        pst.setString(2,studentID);
                        pst.setString(3,qMarks );


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz02 Marks Uploaded..!!!");
                        stuId.setText("");
                        mak.setText("");
                        stuId.requestFocus();

                    }

                    catch(SQLException e1){
                        e1.printStackTrace();

                    }



                } else if (quizMarks == "Quiz03") {

                    try {
                        String sql;
                        sql = "INSERT INTO marks(Course_code,Std_id,Quiz03)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);

                        pst.setString(1, subCode);
                        pst.setString(2,studentID);
                        pst.setString(3,qMarks );


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz03 Marks Uploaded..!!!");
                        stuId.setText("");
                        mak.setText("");
                        stuId.requestFocus();

                    }

                    catch(SQLException e1){
                        e1.printStackTrace();

                    }

                }

                else {
                    if(subCode == "ICT02"){
                        try {
                            String sql;
                            sql = "INSERT INTO marks(Course_code,Std_id,Quiz04)" +
                                    "VALUES(?,?,?)";
                            pst = con.prepareStatement(sql);

                            pst.setString(1, subCode);
                            pst.setString(2,studentID);
                            pst.setString(3,qMarks );


                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Quiz04 Marks Uploaded..!!!");
                            table_load();
                            stuId.setText("");
                            mak.setText("");
                            stuId.requestFocus();

                        }

                        catch(SQLException e1){
                            e1.printStackTrace();

                        }
                    }
                }

            }

        });

        //Upload the Assessment marks
        assessmentsMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) subjCod.getSelectedItem();
                String stuId = textStudId.getText();
                String asseSele = (String) assSelect.getSelectedItem();
                String assesMarks = textAssesMarks.getText();

                if(subCode != "ICT01"){
                    if(asseSele == "Assessments01"){
                        try {
                            String sql;
                            sql = "INSERT INTO marks(Course_code,Std_id,Assesment01)" +
                                    "VALUES(?,?,?)";
                            pst = con.prepareStatement(sql);

                            pst.setString(1, subCode);
                            pst.setString(2,stuId);
                            pst.setString(3,assesMarks);


                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Assessment01 Marks Uploaded..!!!");
                            textStudId.setText("");
                            textAssesMarks.setText("");
                            textStudId.requestFocus();

                        }

                        catch(SQLException e1){
                            e1.printStackTrace();

                        }



                    } else if (asseSele == "Assessments02") {
                        try {
                            String sql;
                            sql = "INSERT INTO marks(Course_code,Std_id,Assesment02)" +
                                    "VALUES(?,?,?)";
                            pst = con.prepareStatement(sql);
                            // pst.setString(1,studentID);
                            pst.setString(1, subCode);
                            pst.setString(2,stuId);
                            pst.setString(3,assesMarks);


                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Assessment02 Marks Uploaded..!!!");
                            textStudId.setText("");
                            textAssesMarks.setText("");
                            textStudId.requestFocus();

                        }

                        catch(SQLException e1){
                            e1.printStackTrace();

                        }
                    }

                    else {
                        JOptionPane.showMessageDialog(null,"Please select the assessment box...!!");
                    }

                }

                else {
                    JOptionPane.showMessageDialog(null,"ICT 01 Don't have Assessments...!11");
                }

                }
        });

        //mid marks upload...
        midMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) subjCode.getSelectedItem();
                String studId = txtStuId.getText();
                String midMark = textMidMaark.getText();

                if(subCode != "ICT03"){
                    try{
                        String sql ;
                        sql = "INSERT INTO marks(Course_code,Std_id,Mid_term)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);

                        pst.setString(1,subCode);
                        pst.setString(2,studId);
                        pst.setString(3,midMark);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Mid_term Marks Uploaded..!!!");
                        txtStuId.setText("");
                        textMidMaark.setText("");
                        txtStuId.requestFocus();
                    }

                    catch (SQLException e1){
                        e1.printStackTrace();

                    }
                }

                else {
                    JOptionPane.showMessageDialog(null,"ICT 03, ICT 04 Don't have Mid term MArks....!!! ");
                }

            }
        });

        //Final Theory Marks Upload...
        finTheMark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) finTheo.getSelectedItem();
                String studId = theStudId.getText();
                String midMark = therMarks.getText();

                    try{
                        String sql ;
                        sql = "INSERT INTO marks(Course_code,Std_id,Final_theory)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);

                        pst.setString(1,subCode);
                        pst.setString(2,studId);
                        pst.setString(3,midMark);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Final  Marks Uploaded..!!!");
                        theStudId.setText("");
                        textMidMaark.setText("");
                        therMarks.requestFocus();
                    }

                    catch (SQLException e1){
                        e1.printStackTrace();

                    }
                }
        });

        //Final Practical Marks Upload....
        finalPracticalMarks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subCode = (String) finPracSubCod.getSelectedItem();
                String studId = finalStudId.getText();
                String midMark = finalMarks.getText();

                if (subCode != "ICT02"){
                    try{
                        String sql ;
                        sql = "INSERT INTO marks(Course_code,Std_id,Final_practical)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);

                        pst.setString(1,subCode);
                        pst.setString(2,studId);
                        pst.setString(3,midMark);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Final Practical Marks Uploaded..!!!");
                        finalStudId.setText("");
                        finalMarks.setText("");
                        finalStudId.requestFocus();
                    }

                    catch (SQLException e1){
                        e1.printStackTrace();

                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"ICT02 Don't have Final Practical Exam");
                }

            }
        });
    }


    //Show student tables...
    public void table_load(){
        try{
        pst = con.prepareStatement("SELECT * FROM student");
        ResultSet stud_tab = pst.executeQuery();
        tablee1.setModel(DbUtils.resultSetToTableModel(stud_tab));
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }

// Marks Show tables...
    public void show_marks(){
        try{
            pst = con.prepareStatement("SELECT * FROM marks");
            ResultSet st_mrk = pst.executeQuery();
            markstable.setModel(DbUtils.resultSetToTableModel(st_mrk));
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    // Main function ....
    public static void main(String[] args) {
        JFrame lecture = new JFrame("PanelLecturer");
        lecture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lecture.pack();
        lecture.setContentPane(new Lecturer().PanelLecturer);
        lecture.setVisible(true);
        lecture.setSize(1200,500);
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

    // !!! Again try one
    public void lacture_details(){
        try{
            pst = con.prepareStatement("SELECT Fname FROM lecturer WHERE Lec_id = 2 ");
            ResultSet lecId = pst.executeQuery();
            detLecId.setText("Your name is : "+lecId);


        }

        catch(SQLException e){

        }


    }



}





