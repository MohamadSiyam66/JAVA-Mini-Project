package com.ictech.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

<<<<<<< HEAD
public class index extends JFrame {
    private JPanel indexPanel;
=======
public class index extends JFrame{
    public JPanel indexPanel;
>>>>>>> cf19c96a1ff49a4e3ab0b08a510442cdda5320df
    private JLabel lblProfile;
    private JButton btnStudent;
    private JButton btnLecturer;
    private JButton btnTechnicalOfficer;
    private JButton btnAdmin;
    private JButton btnNotices;
    private JLabel lblGrp7;
    private JLabel lbluor;

    public index()
    {

    btnStudent.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Login to Student");
        }
    });
    btnLecturer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnTechnicalOfficer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    btnAdmin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //OPEN ADMiN JFRAME
        }
    });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("index");
        frame.setContentPane(new index().indexPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //DB CONNECTION
        Connection con;
        PreparedStatement pst;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms-java","root","1234");
            System.out.println("DB Connected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
