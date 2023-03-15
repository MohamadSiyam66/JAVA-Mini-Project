package com.ictech.code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StdRegistration extends JDialog{
    private JPanel StdRegisterPanel;
    private JLabel lblimg;
    private JPasswordField lblcpw;
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
    private JLabel txtpw;
    private JLabel lblSex;
    private JTextField txtsex;
    private JPasswordField txtconfirmpw;

    public StdRegistration(JFrame parent){
        super(parent);
        setTitle("Create a new student account");
        setContentPane(StdRegisterPanel);
        setMinimumSize(new Dimension(458,474));
        setModal(true);
        setLocationRelativeTo(parent);
        //dispose();
        btnregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registeruser();
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
         String phn = txtPhnno.getText();
         String dob  = txtxDOB.getText();
         String stdid = txtstdid.getText();
         String sex = txtsex.getText();
         String pw = String.valueOf(txtpw.getText());
         String cpw = String.valueOf(txtconfirmpw.getText());

         if(fname.isEmpty()||lname.isEmpty()||email.isEmpty()||phn.isEmpty()||dob.isEmpty()||stdid.isEmpty()||sex.isEmpty()||pw.isEmpty()||cpw.isEmpty()){
             JOptionPane.showMessageDialog(this,
                     "Fill All The Fields!!! Try Again",
                     "try again",
                     JOptionPane.ERROR_MESSAGE);
             return;
         }
        if(!pw.equals(cpw)){
            JOptionPane.showMessageDialog(this,
                    "Passwors does not match",
                    "try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        std = addUserToDatabase(stdid,phn,fname,lname,sex,email,pw,dob);
        if(std!=null){
            dispose();
        }
    }

    public Student std;

    private Student addUserToDatabase(String stdid, String phn, String fname, String lname, String sex, String email, String pw, String dob) {
        Student std = null;
        return std;
    }

    public static void main(String[] args) {
        StdRegistration myform = new StdRegistration((null));
    }
}
