package com.ictech.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class index extends JFrame{
    public JPanel indexPanel;
    private JButton btnStudent;
    private JButton btnLecturer;
    private JButton btnTechnicalOfficer;
    private JButton btnAdmin;
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
        //setMinimumSize(new Dimension(1000,700));
        frame.setTitle("Welcome To learning Management System Unversity of Ruhuna");
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
