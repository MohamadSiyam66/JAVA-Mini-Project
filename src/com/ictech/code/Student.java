package com.ictech.code;

import javax.swing.*;

public class Student extends JFrame{
    private JPanel stdPanel;
    private JTabbedPane tbbPaneStudent;
    private JTextField textField1;
    private JPanel tbbProfile;
    private JPanel tbbAttendence;
    private JPanel tbbMedical;
    private JPanel tbbCourse;
    private JPanel tbbTimeTable;
    private JLabel lblstdName;
    private JTextField txtStdName;
    private JTextField txtstdContact;
    private JLabel lblstdConatct;
    private JButton btnUpdate;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().stdPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
