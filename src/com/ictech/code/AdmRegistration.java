package com.ictech.code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JLabel;

public class AdmRegistration extends JDialog{

    private JTextField txtAdm;
    private JButton btnRegister;
    private JLabel lblcon;
    private JComboBox txtsex;
    private JPanel AdmRegPanel;
    private JButton btnCancel;
    private JLabel lblAdm;
    private JLabel lblFn;
    private JLabel lblLn;
    private JLabel lblDob;
    private JLabel lblSex;
    private JLabel lblPhn;
    private JLabel lblEmail;
    private JLabel lblpw;
    private JLabel lblcpw;
    private JTextField txtFn;
    private JTextField txtLn;
    private JTextField txtDob;
    private JTextField txtphn;
    private JTextField txtEm;
    private JTextField txtpw;
    private JTextField txtcpw;

    public AdmRegistration(JFrame parent){
        super(parent);
        setTitle("Create a new student account");
        setContentPane(AdmRegPanel);
        setMinimumSize(new Dimension(600,600));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registeradm();
                //dispose();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registeradm() {

        String fname = txtAdm.getText();
        String lname = txtLn.getText();
        String email = txtEm.getText();
        String pno = txtphn.getText();
        String dob  = txtDob.getText();
        String admid = txtAdm.getText();
        String sex = String.valueOf(txtsex.getNextFocusableComponent());
        String pw = txtpw.getText();
        String cpw = txtcpw.getText();

        if(fname.isEmpty()||lname.isEmpty()||email.isEmpty()||pno.isEmpty()||dob.isEmpty()||admid.isEmpty()||sex.isEmpty()||pw.isEmpty()){
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

        ad = addUserToDatabase(admid,pno,fname,lname,sex,email,pw,dob);
        if(ad != null){
            dispose();
        }else{
            JOptionPane.showMessageDialog(this,
                    "Failed to Register New user",
                    "try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    public Admin ad;

    private Admin addUserToDatabase(String admid, String phn, String fname, String lname, String sex, String email, String pw, String dob) {
        Admin ad = null;
        final String DB_URL = "jdbc:mysql://localhost:3306/lms-java";
        final String USERNAME = "root";
        final String PASSWORD = "1234";

        try{
            Connection con = DriverManager.getConnection(DB_URL, USERNAME,PASSWORD);
            //DB CONNECTED SUCCESSFULLY
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO Admin(ad_id,pno,fname,lname,sex,email,password,dob)"+
                    "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,admid);
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
                ad = new Admin();
                ad.admid = admid;
                ad.phn = phn;
                ad.fname = fname;
                ad.lname = lname;
                ad.sex = sex;
                ad.email = email;
                ad.pw = pw;
                ad.dob = dob;
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ad;
    }
    public static void main(String[] args) {
        AdmRegistration myform = new AdmRegistration(null);
        Admin ad = myform.ad;
        if(ad != null){
            JOptionPane.showMessageDialog(myform,"REGISTRATION SUCCESSFUL");
            System.out.println("Succeccfull Registration of: "+ad.fname+" "+ad.lname);
        }else{
            System.out.println("Registration Cancelled");
        }
    }
    public AdmRegistration(){

    }

}
