package com.ictech.code;

import javax.swing.*;

public class Student<fname, lname> extends JFrame{
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

    public String fname;
    public String lname;
    public String email;
    public String phn;
    public String dob;
    public String stdid;
    public String sex;
    public String pw;
    public String cpw;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().stdPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
