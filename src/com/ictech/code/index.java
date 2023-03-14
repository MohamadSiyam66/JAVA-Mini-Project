package com.ictech.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index extends JFrame{
    private JPanel indexPanel;
    private JLabel lblProfile;
    private JButton btnStudent;
    private JButton btnLecturer;
    private JButton btnTechnicalOfficer;
    private JButton btnAdmin;
    private JButton btnNotices;
    private JLabel lblGrp7;

    public index() {

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

        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("index");
        frame.setContentPane(new index().indexPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
