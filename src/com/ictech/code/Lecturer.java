package com.ictech.code;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

public class Lecturer extends JFrame{
    private JPanel PanelLecturer;
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
    private JTextField emBox;
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
    private JTable tabCaMarks;
    private JLabel ffName;
    private JLabel eMail;
    private JLabel pNumber;
    private JLabel llName;
    private JTextField textLecPho;
    private JLabel lecDOB;
    private JTextField textAddMat;
    private JComboBox comboCourseCod;
    private JButton browserButton;
    private JTextField txtLectureId;
    private JButton addButton;
    private JLabel txtDes;
    private JTextArea textDesArea;
    private JTable tableNotice;
    private JScrollPane CA;

    Connection con;
    String s;
    PreparedStatement pst;

    public  Lecturer() {
        connect();
        table_load();
        show_marks();
        lacture_details();
        show_CAmarks();
        lactureShowDetailsShows();
        //noticeTableShow();
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
                String e_mail = emBox.getText();
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
                    emBox.setText("");
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

                        pst = con.prepareStatement("UPDATE marks set Quiz01= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,qMarks);
                        pst.setString(2,studentID);
                        pst.setString(3,subCode);


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz01 Marks Uploaded..!!!");
                        show_CAmarks();
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

                        pst = con.prepareStatement("UPDATE marks set Quiz02= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,qMarks);
                        pst.setString(2,studentID);
                        pst.setString(3,subCode);


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz02 Marks Uploaded..!!!");
                        show_CAmarks();
                        stuId.setText("");
                        mak.setText("");
                        stuId.requestFocus();

                    }

                    catch(SQLException e1){
                        e1.printStackTrace();

                    }



                } else if (quizMarks == "Quiz03") {

                    try {

                        pst = con.prepareStatement("UPDATE marks set Quiz03= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,qMarks);
                        pst.setString(2,studentID);
                        pst.setString(3,subCode);


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Quiz03 Marks Uploaded..!!!");
                        show_CAmarks();
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

                            pst = con.prepareStatement("UPDATE marks set Quiz04= ? where Std_id = ? && Course_code = ? ");
                            pst.setString(1,qMarks);
                            pst.setString(2,studentID);
                            pst.setString(3,subCode);


                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Quiz04 Marks Uploaded..!!!");
                            show_CAmarks();
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
                            /*
                            String sql;
                            sql = "INSERT INTO marks(Course_code,Std_id,Assesment01)" +
                                    "VALUES(?,?,?)";
                            pst = con.prepareStatement(sql);

                             */
                            pst = con.prepareStatement("UPDATE marks set Assesment01= ? where Std_id = ? && Course_code = ? ");
                            pst.setString(1,assesMarks);
                            pst.setString(2, subCode);
                            pst.setString(3,stuId);



                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Assessment01 Marks Uploaded..!!!");
                            show_CAmarks();
                            textStudId.setText("");
                            textAssesMarks.setText("");
                            textStudId.requestFocus();

                        }

                        catch(SQLException e1){
                            e1.printStackTrace();

                        }



                    } else if (asseSele == "Assessments02") {
                        try {
                            pst = con.prepareStatement("UPDATE marks set Assesment02= ? where Std_id = ? && Course_code = ? ");
                            pst.setString(1,assesMarks);
                            pst.setString(2, subCode);
                            pst.setString(3,stuId);

                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null,"Assessment02 Marks Uploaded..!!!");
                            show_CAmarks();
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
                       /* String sql ;
                        sql = "INSERT INTO marks(Course_code,Std_id,Mid_term)" +
                                "VALUES(?,?,?)";
                        pst = con.prepareStatement(sql);

                        */

                        pst = con.prepareStatement("UPDATE marks set Mid_term= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,midMark);
                        pst.setString(2, subCode);
                        pst.setString(3,studId);

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
                String finMark = therMarks.getText();

                    try{
                        pst = con.prepareStatement("UPDATE marks set Final_theory= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,finMark);
                        pst.setString(2, subCode);
                        pst.setString(3,studId);

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
                String finMark = finalMarks.getText();

                if (subCode != "ICT02"){
                    try{
                        pst = con.prepareStatement("UPDATE marks set Final_practical= ? where Std_id = ? && Course_code = ? ");
                        pst.setString(1,finMark);
                        pst.setString(2, subCode);
                        pst.setString(3,studId);


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

        // Browser File select..
        browserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE,*.PDF","jpg","gif","png","txt","pdf");
                fileChooser.addChoosableFileFilter(filter);
                int result = fileChooser.showSaveDialog(null);

                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile;
                    selectedFile = fileChooser.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    s=path;
                    textAddMat.setText(s);
                }

                else if (result == JFileChooser.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(null,"No Data");
                }
            }
        });

        //Add materials.....
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String LecId = txtLectureId.getText();
                    String subCode = (String) comboCourseCod.getSelectedItem();
                    String des = textDesArea.getText();


                    pst = con.prepareStatement("INSERT INTO addmetrialsdetails(Lec_id,Course_Code,Description,Matrial)"+ "Value(?,?,?,?)");
                    InputStream is = new FileInputStream(new File(s));
                    pst.setString(1,LecId);
                    pst.setString(2,subCode);
                    pst.setString(3,des);
                    pst.setBlob(4,is);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Insert....");
                }

                catch(Exception ex){
                    ex.printStackTrace();
                }


            }
        });

        //Quiz01 Clear..
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stuId.setText("");
                mak.setText("");
                stuId.requestFocus();
            }
        });

        //Assessment Clear..
        clearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textStudId.setText("");
                textAssesMarks.setText("");
                textStudId.requestFocus();
            }
        });
        //mid Marks cleaner...
        clearButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtStuId.setText("");
                textMidMaark.setText("");
                txtStuId.requestFocus();
            }
        });
        clearButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theStudId.setText("");
                therMarks.setText("");
                theStudId.requestFocus();
            }
        });
        clearButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalStudId.setText("");
                finalMarks.setText("");
                finalStudId.requestFocus();
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

    // CA Marks Show...
    public void show_CAmarks(){
        try{
            pst = con.prepareStatement("SELECT Std_id,Course_code,Assesment01,Assesment02,Quiz01,Quiz02,Quiz03,Quiz04 FROM marks");
            ResultSet caMarks_tab = pst.executeQuery();
            tabCaMarks.setModel(DbUtils.resultSetToTableModel(caMarks_tab));
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

    // Lecture Details Shows...
    public void lacture_details(){
        try{
            pst = con.prepareStatement("SELECT Lec_id,Fname,Lname,DOB,Email,Pno FROM lecturer WHERE Lec_id = 4");
            ResultSet lectDetails = pst.executeQuery();

            if(lectDetails.next() == true){
                String lecId = lectDetails.getString(1);
                String fName = lectDetails.getString(2);
                String lName = lectDetails.getString(3);
                String dob = lectDetails.getString(4);
                String email = lectDetails.getString(5);
                String no = lectDetails.getString(6);

                detLecId.setText("Lecture ID : " + lecId);
                ffName.setText("First Name : " +fName);
                llName.setText("Last Name : " + lName);
                lecDOB.setText("Date of Birth : " + dob);
                eMail.setText("E-Mail Address : " + email);
                pNumber.setText("Phone No : "+ no);
            }


        }

        catch(SQLException e){
            e.printStackTrace();

        }


    }

    //Lecture Update Details shows...
    public void lactureShowDetailsShows(){
       // String userName = String.valueOf(2);

        try {
            pst = con.prepareStatement("SELECT Fname,Lname,Email,DOB,Pno FROM lecturer WHERE Lec_id = 4");
           // pst.setString(1, userName);
            ResultSet leDetails = pst.executeQuery();

            if (leDetails.next() == true) {
                String fName = leDetails.getString(1);
                String lName = leDetails.getString(2);
                String email = leDetails.getString(3);
                String dob = leDetails.getString(4);
                String pNo = leDetails.getString(5);

                firstname.setText(fName);
                lastname.setText(lName);
                emBox.setText(email);
                Date_of_Birth.setText(dob);
                textLecPho.setText(pNo);



            } else {
                firstname.setText("");
                lastname.setText("");
                emBox.setText("");
                Date_of_Birth.setText("");
                textLecPho.setText("");
                firstname.requestFocus();

            }
            lacture_details();
        }

        catch (SQLException e){
            e.printStackTrace();
        }
        }

      //  Notice Table Show..
    /*

    public void noticeTableShow(){
        try{
            pst = con.prepareStatement("SELECT Notice_no,Details,Ndate,Description FROM notice ");
            ResultSet noticeTable = pst.executeQuery();
            tableNotice.setModel(DbUtils.resultSetToTableModel(noticeTable));
        }

        catch(SQLException e1){
            e1.printStackTrace();
        }


    }


        //CA Quiz Calculate...
/*
    public void quizMarksCalculate(){
        try{
            pst = con.prepareStatement("SELECT Std_id,(100/Mid_term)*20 AS QuizTotel from marks;");
            ResultSet caTab = pst.executeQuery();
            tableCa.setModel(DbUtils.resultSetToTableModel(caTab));
        }

        catch (SQLException e){
            e.printStackTrace();
        }
    }

 */


    }










