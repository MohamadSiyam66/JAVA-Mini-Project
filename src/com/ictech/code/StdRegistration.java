package com.ictech.code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JLabel;

public class StdRegistration extends JDialog{
    private JPanel StdRegisterPanel;
    private JLabel lblimg;
    private JPasswordField txtpw;
    private JTextField txtFname;
    private JLabel lbRegstr;
    private JButton btncancel;
    private JButton btnregister;
    private JLabel lblFname;
    private JLabel lblLname;
    private JLabel lblDOB;
    private JLabel lblPhn;
    private JLabel lblEmail;
    private JTextField txtstdid;
    private JLabel lblStdid;
    private JTextField txtLName;
    private JTextField txtxDOB;
    private JTextField txtPhnno;
    private JTextField txtEmail;
    private JLabel lblpw;
    private JLabel lblSex;
    private JTextField txtsex;
    private JLabel lblconfirmpw;
    private JPasswordField txtconfirmpw;
    private JComboBox lblsex;

    public StdRegistration(JFrame parent){
        super(parent);
        setTitle("Create a new student account");
        setContentPane(StdRegisterPanel);
        setMinimumSize(new Dimension(600,600));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registeruser();
                //dispose();
            }
        });
        btncancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registeruser() {

         String fname = txtFname.getText();
         String lname = txtLName.getText();
         String email = txtEmail.getText();
         String pno = txtPhnno.getText();
         String dob  = txtxDOB.getText();
         String stdid = txtstdid.getText();
         String sex = String.valueOf(lblsex.getNextFocusableComponent());
         String pw = txtpw.getText();
         String cpw = txtconfirmpw.getText();

         if(fname.isEmpty()||lname.isEmpty()||email.isEmpty()||pno.isEmpty()||dob.isEmpty()||stdid.isEmpty()||sex.isEmpty()||pw.isEmpty()){
             JOptionPane.showMessageDialog(this,
                     "Fill All The Fields!!! Try Again",
                     "try again",
                     JOptionPane.ERROR_MESSAGE);
             return;
         }
        if(!cpw.equals(pw)){
            JOptionPane.showMessageDialog(this,
                    "Passwords does not match",
                    "try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        std = addUserToDatabase(stdid,pno,fname,lname,sex,email,pw,dob);
        if(std != null){
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Failed to Register New user",
                    "try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    public Student std;

    private Student addUserToDatabase(String stdid, String phn, String fname, String lname, String sex, String email, String pw, String dob) {
       Student std = null;
        final String DB_URL = "jdbc:mysql://localhost:3306/lms-java";
        final String USERNAME = "root";
        final String PASSWORD = "1234";

        try{
            Connection con = DriverManager.getConnection(DB_URL, USERNAME,PASSWORD);
            //DB CONNECTED SUCCESSFULLY
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO Student(std_id,pno,fname,lname,sex,email,password,dob)"+
                    "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,stdid);
            pst.setString(2,phn);
            pst.setString(3,fname);
            pst.setString(4,lname);
            pst.setString(5,sex);
            pst.setString(6,email);
            pst.setString(7,pw);
            pst.setString(8,dob);

            //INSERT ROW INTO THE TABLE
            int addedRows = pst.executeUpdate();
            if(addedRows > 0){
                std = new Student();
                std.stdid = stdid;
                std.phn = phn;
                std.fname = fname;
                std.lname = lname;
                std.sex = sex;
                std.email = email;
                std.pw = pw;
                std.dob = dob;
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return std;
    }
    public static void main(String[] args) {
        StdRegistration myform = new StdRegistration(null);
        Student std = myform.std;
        if(std != null){
            JOptionPane.showMessageDialog(myform,"REGISTRATION SUCCESSFUL");
            System.out.println("Succeccfull Registration of: "+std.fname+" "+std.lname);
        }else{
            System.out.println("Registration Cancelled");
        }
    }
    public StdRegistration(){

    }

}
