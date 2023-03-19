package com.ictech.code;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Admin {
    private JPanel Adminpanel;
    private JTextField txtAdminname;
    private JTabbedPane tbbAdminPane;
    private JLabel lblgrp7;
    private JPanel tbbAdminProfile;
    private JPanel tbbmaintainUP;
    private JPanel lblL4S2;
    private JPanel tbbmaintainNotices;
    private JButton btnNewStd;
    private JTextField txtfnprfl;
    private JTextField txtlnprfl;
    private JButton updateDetailsButton;
    private JTabbedPane tabbedPane1;
    private JComboBox txtgender;
    private JPanel stdPanel;
    private JPanel lecturepanel;
    private JPanel AdminPanel;
    private JPanel TOPanel;
    private JLabel lblstdid;
    private JLabel lblfname;
    private JLabel lbllname;
    private JLabel lbldob;
    private JLabel lblphn;
    private JLabel lblemail;
    private JLabel lblgender;
    private JLabel lblpw;
    private JButton btnregister;
    private JButton btnupdate;
    private JButton btndelete;
    private JButton btngetdetails;
    private JTextField txtstdid;
    private JTextField txtfname;
    private JTextField txtlname;
    private JTextField txtdob;
    private JTextField txtphn;
    private JTextField txtemail;
    private JPasswordField txtpw;
    private JTextField txtlecid;
    private JPasswordField txtpwL;
    private JComboBox txtgenderL;
    private JButton btnregisterL;
    private JButton btndeleteL;
    private JLabel lbllecid;
    private JLabel lblfnameL;
    private JLabel lbllnameL;
    private JLabel lbldobL;
    private JLabel lblphnL;
    private JLabel lblemailL;
    private JLabel lblgenderL;
    private JLabel lblpwL;
    private JTextField txtfnameL;
    private JTextField txtlnameL;
    private JTextField txtdobL;
    private JTextField txtphnL;
    private JTextField txtemailL;
    private JButton btnupdateL;
    private JButton btngetdetailsL;
    private JLabel lbladmid;
    private JLabel lblfnameA;
    private JLabel lbllnameA;
    private JLabel lbldobA;
    private JLabel lblphnA;
    private JLabel lblemailA;
    private JLabel lblgenderA;
    private JLabel lblpwA;
    private JTextField txtadmid;
    private JTextField txtfnameA;
    private JTextField txtlnameA;
    private JTextField txtdobA;
    private JTextField txtphnA;
    private JTextField txtemailA;
    private JComboBox txtgenderA;
    private JPasswordField txtpwA;
    private JButton btnregistreA;
    private JButton btnupdateA;
    private JButton btndeleteA;
    private JButton btngdetailsA;
    private JLabel lbltoid;
    private JTextField txttoid;
    private JLabel lblfnT;
    private JTextField txtfnT;
    private JLabel lbllnT;
    private JTextField txtlnT;
    private JLabel lbldobT;
    private JTextField txtdobT;
    private JLabel lblphnT;
    private JTextField txtphnT;
    private JLabel lblemT;
    private JTextField txtemT;
    private JLabel lblgenT;
    private JComboBox txtgenT;
    private JLabel lblpwT;
    private JPasswordField txtpwT;
    private JButton btnregT;
    private JButton btnupdT;
    private JButton btndelT;
    private JButton btngdetailsT;
    private JLabel lbladidprfl;
    private JLabel lblfnprfl;
    private JLabel lbllnprfl;
    private JLabel lblconprfl;
    private JTextField txtconprfl;
    private JTextField txtadidprfl;
    private JButton btnSearchPrfl;
    private JButton btnaddnotice;
    private JButton btndeletenotice;
    private JButton btnupdatenotice;
    private JTextField txtnoticeno;
    private JLabel lblNoticeno;
    private JLabel lblnoticedate;
    private JTextField txtnoticedate;
    private JLabel lblnoticedetails;
    private JTextField txtnoticedetrails;
    private JLabel lblNoticeDescription;
    private JTextField txt_tm_L3S2_ICT;
    private JButton getInfoButton;
    private JTable table1;
    private JTable table3;
    private JLabel lblUnameL;
    private JTextField txtUnameL;
    private JTable table2;
    private JTable table4;
    private JLabel lbladmNOT;
    private JTextField txtadmNOT;
    private JTable table5;
    private JTextArea txtAreaNotice;
    private JPanel tbbmaintainCources;
    private JButton btnAddCourse;
    private JButton btnUpdateCourse;
    private JButton btnDeleteCourse;
    private JTextField txtCC;
    private JTable table6;
    private JLabel lblCC;
    private JLabel lblCName;
    private JTextField txtCName;
    private JLabel lblAdid;
    private JTextField txtAdid;
    private JLabel lblLecid;
    private JTextField txtLecid;
    private JButton btnSearchCourse;
    private JButton btnBST_L1S1_add;
    private JTable tbl_bst_l1s1;
    private JLabel lbl_tm_L1S1_bst;
    private JTextField txt_tm_L1S1_bst;
    private JButton btnSearch_bst_L1S1;
    private JButton btn_Delete_l1s1_bst;
    private JButton btn_Update_l1s1_bst;
    private JTextField txt_L1S1_BST_mon;
    private JLabel lbl_L1S1_BST_mon;
    private JTextField txt_L1S1_BST_tue;
    private JLabel lbl_L1S1_BST_tue;
    private JLabel lbl_L1S1_BST_wed;
    private JTextField txt_L1S1_BST_wed;
    private JTextField txt_L1S1_BST_thu;
    private JLabel lbl_L1S1_BST_thu;
    private JLabel lbl_L1S1_BST_fri;
    private JTextField txt_L1S1_BST_fri;
    private JTextField txt_tm_L1S1_et;
    private JLabel lbl_tm_L1S1_et;
    private JButton btnSearch_et_L1S1;
    private JButton btnET_L1S1_add;
    private JButton btn_Update_l1s1_ET;
    private JButton btn_Delete_l1s1_ET;
    private JLabel lbl_L1S1_ET_mon;
    private JTextField txt_L1S1_ET_mon;
    private JTextField txt_L1S1_ET_tue;
    private JTextField txt_L1S1_ET_wed;
    private JTextField txt_L1S1_ET_thu;
    private JTextField txt_L1S1_ET_fri;
    private JLabel lbl_tm_L1S1_ICT;
    private JTextField txt_tm_L1S1_ICT;
    private JTextField txt_L1S1_ICT_mon;
    private JTextField txt_L1S1_ICT_thu;
    private JTextField txt_L1S1_ICT_fri;
    private JTextField txt_L1S1_ICT_tue;
    private JTextField txt_L1S1_ICT_wed;
    private JButton btnSearch_ICT_L1S1;
    private JButton btnICT_L1S1_add;
    private JButton btn_Update_l1s1_ICT;
    private JButton btn_Delete_l1s1_ICT;
    private JTable tbl_ict_l1s1;
    private JTable tbl_et_l1s1;
    private JTable tbl_bst_l1s2;
    private JTable tbl_ict_l1s2;
    private JTable tbl_et_l1s2;
    private JTable tbl_bst_l2s1;
    private JTextField txt_tm_L1S2_bst;
    private JTextField txt_L1S2_BST_mon;
    private JTextField txt_L1S2_BST_thu;
    private JTextField txt_L1S2_BST_tue;
    private JTextField txt_L1S2_BST_wed;
    private JTextField txt_L1S2_BST_fri;
    private JButton btnSearch_bst_L1S2;
    private JButton btnBST_L1S2_add;
    private JButton btn_Update_l1s2_bst;
    private JButton btn_Delete_l1s2_bst;
    private JTextField txt_tm_L1S2_ICT;
    private JTextField txt_L1S2_ICT_mon;
    private JTextField txt_L1S2_ICT_thu;
    private JTextField txt_L1S2_ICT_tue;
    private JTextField txt_L1S2_ICT_fri;
    private JTextField txt_L1S2_ICT_wed;
    private JButton btnSearch_ICT_L1S2;
    private JButton btnICT_L1S2_add;
    private JButton btn_Update_l1s2_ICT;
    private JButton btn_Delete_l1s2_ICT;
    private JTextField txt_tm_L1S2_et;
    private JTextField txt_L1S2_ET_mon;
    private JTextField txt_L1S2_ET_thu;
    private JButton btnSearch_et_L1S2;
    private JButton btnET_L1S2_add;
    private JButton btn_Update_l1s2_ET;
    private JButton btn_Delete_l1s2_ET;
    private JTextField txt_L1S2_ET_tue;
    private JTextField txt_L1S2_ET_fri;
    private JTextField txt_L1S2_ET_wed;
    private JTable tbl_ict_l2s1;
    private JTable tbl_et_l2s1;
    private JTextField txt_tm_L2S1_bst;
    private JTextField txt_L2S1_BST_mon;
    private JTextField txt_L2S1_BST_thu;
    private JTextField txt_L2S1_BST_tue;
    private JTextField txt_L2S1_BST_fri;
    private JTextField txt_L2S1_BST_wed;
    private JButton btnSearch_bst_L2S1;
    private JButton btnBST_L2S1_add;
    private JButton btn_Update_l2s1_bst;
    private JButton btn_Delete_l2s1_bst;
    private JTextField txt_tm_L2S1_ICT;
    private JTextField txt_L2S1_ICT_mon;
    private JTextField txt_L2S1_ICT_thu;
    private JTextField txt_L2S1_ICT_fri;
    private JTextField txt_L2S1_ICT_tue;
    private JTextField txt_L2S1_ICT_wed;
    private JButton btnSearch_ICT_L2S1;
    private JButton btnICT_L2S1_add;
    private JButton btn_Update_l2s1_ICT;
    private JButton btn_Delete_l2s1_ICT;
    private JTextField txt_tm_L2S1_ET;
    private JTextField txt_L2S1_ET_mon;
    private JTextField txt_L2S1_ET_thu;
    private JButton btnSearch_et_L2S1;
    private JButton btnET_L2S1_add;
    private JButton btn_Update_l2s1_ET;
    private JButton btn_Delete_l2s1_ET;
    private JTextField txt_L2S1_ET_wed;
    private JTextField txt_L2S1_ET_tue;
    private JTextField txt_L2S1_ET_fri;
    private JTextField txt_tm_L2S2_bst;
    private JTextField txt_L2S2_BST_mon;
    private JTextField txt_L2S2_BST_thu;
    private JButton btnBST_L2S2_add;
    private JButton btn_Update_l2s2_bst;
    private JButton btn_Delete_l2s2_bst;
    private JTextField txt_L2S2_BST_tue;
    private JTextField txt_L2S2_BST_fri;
    private JTextField txt_L2S2_BST_wed;
    private JTextField txt_tm_L2S2_ICT;
    private JTextField txt_L2S2_ICT_mon;
    private JTextField txt_L2S2_ICT_thu;
    private JTextField txt_L2S2_ICT_tue;
    private JTextField txt_L2S2_ICT_fri;
    private JTextField txt_L2S2_ICT_wed;
    private JTextField txt_tm_L2S2_et;
    private JTextField txt_L2S2_ET_mon;
    private JTextField txt_L2S2_ET_thu;
    private JTextField txt_L2S2_ET_tue;
    private JTextField txt_L2S2_ET_wed;
    private JTextField txt_L2S2_ET_fri;
    private JButton btnSearch_et_L2S2;
    private JButton btnET_L2S2_add;
    private JButton btn_Update_l2s2_ET;
    private JButton btn_Delete_l2s2_ET;
    private JTable tbl_bst_l2s2;
    private JTable tbl_et_l2s2;
    private JTable tbl_ict_l2s2;
    private JButton btnSearch_bst_L2S2;
    private JButton btn_Delete_l2s2_ICT;
    private JButton btnICT_L2S2_add;
    private JButton btnSearch_ICT_L2S2;
    private JButton btn_Update_l2s2_ICT;
    private JTable tbl_bst_l3s1;
    private JTable tbl_ict_l3s1;
    private JTable tbl_bst_l3s2;
    private JTable tbl_ict_l3s2;
    private JTable tbl_et_l3s2;
    private JTable tbl_bst_l4s1;
    private JTable tbl_et_l4s1;
    private JTable tbl_bst_l4s2;
    private JTable tbl_ict_l4s2;
    private JTable tbl_et_l4s2;
    private JTextField txt_tm_L3S1_bst;
    private JTextField txt_L3S1_BST_mon;
    private JTextField txt_L3S1_BST_thu;
    private JTextField txt_L3S1_BST_tue;
    private JTextField txt_L3S1_BST_fri;
    private JButton btnSearch_bst_L3S1;
    private JButton btnBST_L3S1_add;
    private JButton btn_Update_l3s1_bst;
    private JButton btn_Delete_l3s1_bst;
    private JTextField txt_L3S1_BST_wed;
    private JTextField txt_tm_L3S1_ICT;
    private JTextField txt_L3S1_ICT_mon;
    private JTextField txt_L3S1_ICT_thu;
    private JTextField txt_L3S1_ICT_fri;
    private JTextField txt_L3S1_ICT_tue;
    private JTextField txt_L3S1_ICT_wed;
    private JButton btnSearch_ICT_L3S1;
    private JButton btnICT_L3S1_add;
    private JButton btn_Update_l3s1_ICT;
    private JButton btn_Delete_l3s1_ICT;
    private JTextField txt_tm_L3S1_ET;
    private JButton btnSearch_et_L3S1;
    private JButton btnET_L3S1_add;
    private JButton btn_Update_l3s1_ET;
    private JButton btn_Delete_l3s1_ET;
    private JTextField txt_L3S1_ET_mon;
    private JTextField txt_L3S1_ET_thu;
    private JTextField txt_L3S1_ET_tue;
    private JTextField txt_L3S1_ET_wed;
    private JTextField txt_L3S1_ET_fri;
    private JTextField txt_tm_L3S2_bst;
    private JButton btnSearch_bst_L3S2;
    private JTextField txt_L3S2_BST_mon;
    private JTextField txt_L3S2_BST_thu;
    private JTextField txt_L3S2_BST_tue;
    private JTextField txt_L3S2_BST_wed;
    private JTextField txt_L3S2_BST_fri;
    private JButton btnBST_L3S2_add;
    private JButton btn_Update_l3s2_bst;
    private JButton btn_Delete_l3s2_bst;
    private JTextField txt_L3S2_ICT_mon;
    private JTextField txt_L3S2_ICT_thu;
    private JTextField txt_L3S2_ICT_tue;
    private JTextField txt_L3S2_ICT_wed;
    private JTextField txt_L3S2_ICT_fri;
    private JButton btnSearch_ICT_L3S2;
    private JButton btnICT_L3S2_add;
    private JButton btn_Update_l3s2_ICT;
    private JButton btn_Delete_l3s2_ICT;
    private JTextField txt_tm_L3S2_ET;
    private JTextField txt_L3S2_ET_mon;
    private JTextField txt_L3S2_ET_thu;
    private JTextField txt_L3S2_ET_tue;
    private JTextField txt_L3S2_ET_wed;
    private JTextField txt_L3S2_ET_fri;
    private JButton btnSearch_et_L3S2;
    private JButton btnET_L3S2_add;
    private JButton btn_Update_l3s2_ET;
    private JButton btn_Delete_l3s2_ET;
    private JTextField txt_tm_L4S1_bst;
    private JTextField txt_tm_L4S2_bst;
    private JButton btnSearch_bst_L4S1;
    private JButton btnSearch_bst_L4S2;
    private JButton btnBST_L4S1_add;
    private JButton btnBST_L4S2_add;
    private JButton btn_Update_l4s1_bst;
    private JButton btn_Update_l4s2_bst;
    private JButton btn_Delete_l4s1_bst;
    private JButton btn_Delete_l4s2_bst;
    private JTextField txt_L4S1_BST_mon;
    private JTextField txt_L4S2_BST_mon;
    private JTextField txt_L4S2_BST_thu;
    private JTextField txt_L4S2_BST_tue;
    private JTextField txt_L4S2_BST_wed;
    private JTextField txt_L4S1_BST_thu;
    private JTextField txt_L4S1_BST_tue;
    private JTextField txt_L4S1_BST_wed;
    private JTextField txt_L4S1_BST_fri;
    private JTextField txt_L4S2_BST_fri;
    private JTable tbl_et_l3s1;
    private JTextField txt_tm_L4S2_ICT;
    private JTextField txt_L4S2_ICT_fri;
    private JTextField txt_L4S2_ICT_thu;
    private JTextField txt_L4S2_ICT_mon;
    private JTextField txt_L4S2_ICT_tue;
    private JTextField txt_L4S2_ICT_wed;
    private JTextField txt_L4S1_ICT_mon;
    private JTextField txt_L4S1_ICT_thu;
    private JTextField txt_L4S1_ICT_fri;
    private JTextField txt_L4S1_ICT_tue;
    private JTextField txt_L4S1_ICT_wed;
    private JButton btnSearch_ICT_L4S1;
    private JButton btnSearch_ICT_L4S2;
    private JButton btnICT_L4S2_add;
    private JButton btnICT_L4S1_add;
    private JButton btn_Update_l4s1_ICT;
    private JButton btn_Update_l4s2_ICT;
    private JButton btn_Delete_l4s1_ICT;
    private JButton btn_Delete_l4s2_ICT;
    private JTable tbl_ict_l4s1;
    private JTextField txt_tm_L4S1_ICT;
    private JTextField txt_tm_L4S2_ET;
    private JTextField txt_tm_L4S1_ET;
    private JTextField txt_L4S2_ET_fri;
    private JTextField txt_L4S2_ET_thu;
    private JTextField txt_L4S2_ET_mon;
    private JTextField txt_L4S2_ET_tue;
    private JTextField txt_L4S2_ET_wed;
    private JTextField txt_L4S1_ET_fri;
    private JTextField txt_L4S1_ET_thu;
    private JTextField txt_L4S1_ET_mon;
    private JTextField txt_L4S1_ET_tue;
    private JTextField txt_L4S1_ET_wed;
    private JButton btn_Delete_l4s2_ET;
    private JButton btn_Delete_l4s1_ET;
    private JButton btn_Update_l4s1_ET;
    private JButton btn_Update_l4s2_ET;
    private JButton btnSearch_et_L4S2;
    private JButton btnSearch_et_L4S1;
    private JButton btnET_L4S2_add;
    private JButton btnET_L4S1_add;
    private JTable tbl_Notice;
    private JButton btnTmTbleBST;
    public String admid;
    public String phn;
    public String fname;
    public String lname;
    public String sex;
    public String email;
    public String pw;
    public String dob;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Admin");
        frame.setContentPane(new Admin().Adminpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000,600);



    }

    public Admin() {
        connect();
        table_load();
        table1_load();
        table2_load();
        table3_load();
        table4_load();
        table5_load();

        Notice();

        tableBSTl1s1_load();
        tableICTl1s1_load();
        tableETl1s1_load();
        tableBSTl1s2_load();
        tableICTl1s2_load();
        tableETl1s2_load();

        tableBSTl2s1_load();
        tableICTl2s1_load();
        tableETl2s1_load();
        tableETl2s2_load();
        tableBSTl2s2_load();
        tableICTl2s2_load();

        tableBSTl3s1_load();
        tableICTl3s1_load();
        tableETl3s1_load();
        tableBSTl3s2_load();
        tableICTl3s2_load();
        tableETl3s2_load();

        tableBSTl4s2_load();
        tableBSTl4s1_load();
        tableICTl4s1_load();
        tableICTl4s2_load();
        tableETl4s2_load();
        tableETl4s1_load();

        //GET DETAILS OF ADMIN (SEARCH)
        btngdetailsA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String id = txtadmid.getText();
                    pst = con.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password from admin where ad_id = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        //String ad_id;
                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);

                        txtadmid.setText(id);
                        txtphnA.setText(pno);
                        txtpwA.setText(password);
                        txtfnameA.setText(fname);
                        txtlnameA.setText(lname);
                        lblgenderA.setText(sex);
                        txtdobA.setText(dob);
                        txtemailA.setText(email);

                    } else {
                        txtadmid.setText("");
                        txtphnA.setText("");
                        txtpwA.setText("");
                        txtfnameA.setText("");
                        txtlnameA.setText("");
                        lblgenderA.setText("");
                        txtdobA.setText("");
                        txtemailA.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Admin ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BUTTON OF ADMIN
        btnupdateA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String ad_id, pno, password, fname, lname, sex, dob, email;

                    ad_id = txtadmid.getText();
                    pno = txtphnA.getText();
                    password = txtpwA.getText();
                    fname = txtfnameA.getText();
                    lname = txtlnameA.getText();
                    sex = String.valueOf(lblgenderA.getNextFocusableComponent());
                    dob = txtdobA.getText();
                    email = txtemailA.getText();

                    pst = con.prepareStatement("UPDATE admin SET fname = ?,lname = ?,dob = ?,pno = ?,email = ?,sex = ?,password = ? where ad_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, dob);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, sex);
                    pst.setString(7, password);
                    pst.setString(8, ad_id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated");
                    table_load();

                    txtadmid.setText("");
                    txtphnA.setText("");
                    txtpwA.setText("");
                    txtfnameA.setText("");
                    txtlnameA.setText("");
                    lblgenderA.setText("");
                    txtdobA.setText("");
                    txtemailA.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });

        //DELETE BUTTON OF ADMIN
        btndeleteA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad_id;
                ad_id = txtadmid.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM admin WHERE ad_id = ?");
                    pst.setString(1, ad_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    table_load();

                    txtadmid.setText("");
                    txtphnA.setText("");
                    txtpwA.setText("");
                    txtfnameA.setText("");
                    txtlnameA.setText("");
                    lblgenderA.setText("");
                    txtdobA.setText("");
                    txtemailA.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //REGISTER BTN FOR STUDENT
        btnregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String std_id, pno, fname, lname, sex, email, password, dob;

                std_id = txtstdid.getText();
                pno = txtphn.getText();
                password = txtpw.getText();
                fname = txtfname.getText();
                lname = txtlname.getText();
                sex = String.valueOf(lblgender.getNextFocusableComponent());
                dob = txtdob.getText();
                email = txtemail.getText();

                try {
                    //Connection con = DriverManager.getConnection(DB_URL, USERNAME,PASSWORD);
                    //DB CONNECTED SUCCESSFULLY
                    String sql;
                    sql = "INSERT INTO Student(std_id,pno,password,fname,lname,sex,dob,email)" +
                            "VALUES(?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, std_id);
                    pst.setString(2, pno);
                    pst.setString(3, password);
                    pst.setString(4, fname);
                    pst.setString(5, lname);
                    pst.setString(6, sex);
                    pst.setString(7, dob);
                    pst.setString(8, email);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Added!!!");
                    table1_load();
                    txtstdid.setText("");
                    txtphn.setText("");
                    txtpw.setText("");
                    txtfname.setText("");
                    txtlname.setText("");
                    lblgender.setText("");
                    txtdob.setText("");
                    txtemail.setText("");
                    txtstdid.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //UPDATE BTN FOR STUDENT
        btnupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String std_id, pno, password, fname, lname, sex, dob, email;

                    std_id = txtstdid.getText();
                    pno = txtphn.getText();
                    password = txtpw.getText();
                    fname = txtfname.getText();
                    lname = txtlname.getText();
                    sex = String.valueOf(lblgender.getNextFocusableComponent());
                    dob = txtdob.getText();
                    email = txtemail.getText();

                    pst = con.prepareStatement("UPDATE student SET fname = ?,lname = ?,dob = ?,pno = ?,email = ?,sex = ?,password = ? where std_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, dob);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, sex);
                    pst.setString(7, password);
                    pst.setString(8, std_id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated");
                    table1_load();

                    txtstdid.setText("");
                    txtphn.setText("");
                    txtpw.setText("");
                    txtfname.setText("");
                    txtlname.setText("");
                    lblgender.setText("");
                    txtdob.setText("");
                    txtemail.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
        //GET DETAILS OF STUDENT
        btngetdetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Sid = txtstdid.getText();
                    pst = con.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password from student where std_id = ?");
                    pst.setString(1, Sid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        //String ad_id;
                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);

                        txtstdid.setText(Sid);
                        txtphn.setText(pno);
                        txtpw.setText(password);
                        txtfname.setText(fname);
                        txtlname.setText(lname);
                        lblgender.setText(sex);
                        txtdob.setText(dob);
                        txtemail.setText(email);

                    } else {
                        txtadmid.setText("");
                        txtphn.setText("");
                        txtpw.setText("");
                        txtfname.setText("");
                        txtlname.setText("");
                        lblgender.setText("");
                        txtdob.setText("");
                        txtemail.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Student ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });

        //DELETE FROM STUDENT BUTTON
        btndelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String std_id;
                std_id = txtstdid.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM student WHERE std_id = ?");
                    pst.setString(1, std_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    table1_load();

                    txtstdid.setText("");
                    txtphn.setText("");
                    txtpw.setText("");
                    txtfname.setText("");
                    txtlname.setText("");
                    lblgender.setText("");
                    txtdob.setText("");
                    txtemail.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //REGISTER BUTTON FOR LECTURER
        btnregisterL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lec_id, fname, lname,sex,pno, email, password, dob,username;

                lec_id = txtlecid.getText();
                pno = txtphnL.getText();
                password = txtpwL.getText();
                fname = txtfnameL.getText();
                lname = txtlnameL.getText();
                sex = (String) txtgenderL.getSelectedItem();
                dob = txtdobL.getText();
                email = txtemailL.getText();
                username = txtUnameL.getText();

                try {
                    String sql;
                    sql = "INSERT INTO Lecturer(lec_id,pno,password,fname,lname,sex,dob,email,username)" +
                            "VALUES(?,?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, lec_id);
                    pst.setString(2, pno);
                    pst.setString(3, password);
                    pst.setString(4, fname);
                    pst.setString(5, lname);
                    pst.setString(6, sex);
                    pst.setString(7, dob);
                    pst.setString(8, email);
                    pst.setString(9, username);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Added!!!");
                    table2_load();

                    txtlecid.setText("");
                    txtphnL.setText("");
                    txtpwL.setText("");
                    txtfnameL.setText("");
                    txtlnameL.setText("");
                    lblgenderL.setText("");
                    txtdobL.setText("");
                    txtemailL.setText("");
                    txtUnameL.setText("");
                    txtlecid.requestFocus();


                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        //GET DETALS OF LECTURER
        btngetdetailsL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Lid = txtlecid.getText();
                    pst = con.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password,username from lecturer where lec_id = ?");
                    pst.setString(1, Lid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);
                        String username = rs.getString(8);

                        txtlecid.setText(Lid);
                        txtphnL.setText(pno);
                        txtpwL.setText(password);
                        txtfnameL.setText(fname);
                        txtlnameL.setText(lname);
                        lblgenderL.setText(sex);
                        txtdobL.setText(dob);
                        txtemailL.setText(email);
                        txtUnameL.setText(username);

                    } else {
                        txtlecid.setText("");
                        txtphnL.setText("");
                        txtpwL.setText("");
                        txtfnameL.setText("");
                        txtlnameL.setText("");
                        lblgenderL.setText("");
                        txtdobL.setText("");
                        txtemailL.setText("");
                        txtUnameL.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Lecturer ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        //UPDATE LECTURER DETALS
        btnupdateL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String lec_id, pno, password, fname, lname, sex, dob, email,username;

                    lec_id = txtlecid.getText();
                    pno = txtphnL.getText();
                    password = txtpwL.getText();
                    fname = txtfnameL.getText();
                    lname = txtlnameL.getText();
                    sex = (String) txtgenderL.getSelectedItem();
                    dob = txtdobL.getText();
                    email = txtemailL.getText();
                    username = txtUnameL.getText();

                    pst = con.prepareStatement("UPDATE lecturer SET fname = ?,lname = ?,sex = ?,pno = ?,email = ?,password = ?,dob = ?,username = ? where lec_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, sex);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, password);
                    pst.setString(7, dob);
                    pst.setString(8,username);
                    pst.setString(9,lec_id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated");
                    table2_load();

                    txtlecid.setText("");
                    txtphnL.setText("");
                    txtpwL.setText("");
                    txtfnameL.setText("");
                    txtlnameL.setText("");
                    lblgenderL.setText("");
                    txtdobL.setText("");
                    txtemailL.setText("");
                    txtUnameL.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }

        });

        //DELETE BTN FOR LECTURER
        btndeleteL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lec_id;
                lec_id = txtlecid.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM lecturer WHERE lec_id = ?");
                    pst.setString(1, lec_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    table2_load();

                    txtlecid.setText("");
                    txtphnL.setText("");
                    txtpwL.setText("");
                    txtfnameL.setText("");
                    txtlnameL.setText("");
                    lblgenderL.setText("");
                    txtdobL.setText("");
                    txtemailL.setText("");
                    txtUnameL.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //REGSTER BTN NEW TECHNICAL OFFICER
        btnregT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tec_id, pno, password, fname, lname, sex, dob, email;

                tec_id = txttoid.getText(   );
                pno = txtphnT.getText();
                password = txtpwT.getText();
                fname = txtfnT.getText();
                lname = txtlnT.getText();
                sex = (String) txtgenT.getSelectedItem();
                dob = txtdobT.getText();
                email = txtemT.getText();

                try {
                    String sql;
                    sql = "INSERT INTO technical_officer(tec_id,fname,lname,sex,pno,email,password,dob)" +
                            "VALUES(?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, tec_id);
                    pst.setString(2, fname);
                    pst.setString(3, lname);
                    pst.setString(4, sex);
                    pst.setString(5, pno);
                    pst.setString(6, email);
                    pst.setString(7, password);
                    pst.setString(8, dob);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Added!!!");
                    table3_load();

                    txttoid.setText("");
                    txtphnT.setText("");
                    txtpwT.setText("");
                    txtfnT.setText("");
                    txtlnT.setText("");
                    lblgenT.setText("");
                    txtdobT.setText("");
                    txtemT.setText("");
                    txttoid.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        //GET DETALS BUTTON FOR TECHNCAL OFFCER
        btngdetailsT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tec_id = txttoid.getText();
                    pst = con.prepareStatement("SELECT fname,lname,dob,pno,email,sex,password from technical_officer where tec_id = ?");
                    pst.setString(1, tec_id);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String dob = rs.getString(3);
                        String pno = rs.getString(4);
                        String email = rs.getString(5);
                        String sex = rs.getString(6);
                        String password = rs.getString(7);

                        txttoid.setText(tec_id);
                        txtphnT.setText(pno);
                        txtpwT.setText(password);
                        txtfnT.setText(fname);
                        txtlnT.setText(lname);
                        lblgenT.setText(sex);
                        txtdobT.setText(dob);
                        txtemT.setText(email);

                    } else {
                        txttoid.setText("");
                        txtphnT.setText("");
                        txtpwT.setText("");
                        txtfnT.setText("");
                        txtlnT.setText("");
                        lblgenT.setText("");
                        txtdobT.setText("");
                        txtemT.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid technical_officer ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });

        //DELETE BTN FOR TO
        btndelT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tec_id;
                tec_id = txttoid.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM technical_officer WHERE tec_id = ?");
                    pst.setString(1, tec_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    table3_load();

                    txttoid.setText("");
                    txtphnT.setText("");
                    txtpwT.setText("");
                    txtfnT.setText("");
                    txtlnT.setText("");
                    lblgenT.setText("");
                    txtdobT.setText("");
                    txtemT.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });

        //UPDATE BTN FOR TECHNCAL OFFCER
        btnupdT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tec_id, pno, password, fname, lname, sex, dob, email;

                    tec_id = txttoid.getText();
                    pno = txtphnT.getText();
                    password = txtpwT.getText();
                    fname = txtfnT.getText();
                    lname = txtlnT.getText();
                    sex = (String) txtgenT.getSelectedItem();
                    dob = txtdobT.getText();
                    email = txtemT.getText();

                    pst = con.prepareStatement("UPDATE technical_officer SET fname = ?,lname = ?,sex = ?,pno = ?,email = ?,password = ?,dob = ? where tec_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, sex);
                    pst.setString(4, pno);
                    pst.setString(5, email);
                    pst.setString(6, password);
                    pst.setString(7, dob);
                    pst.setString(8,tec_id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated");
                    table3_load();

                    txttoid.setText("");
                    txtphnT.setText("");
                    txtpwT.setText("");
                    txtfnT.setText("");
                    txtlnT.setText("");
                    lblgenT.setText("");
                    txtdobT.setText("");
                    txtemT.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }

        });

        /* -----------------------------ENDNG USER MANTAN------------------------------------- */

        /* -----------------------------STRTNG USER PROFLE------------------------------------- */
        //SEARCH AND ASSGN DETALS TO THE FELSD
        btnSearchPrfl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = txtadidprfl.getText();
                    pst = con.prepareStatement("SELECT fname,lname,pno from admin where ad_id = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        //String ad_id;
                        String fname = rs.getString(1);
                        String lname = rs.getString(2);
                        String pno = rs.getString(3);

                        txtadidprfl.setText(id);
                        txtconprfl.setText(pno);
                        txtfnprfl.setText(fname);
                        txtlnprfl.setText(lname);

                    } else {
                        txtadidprfl.setText("");
                        txtconprfl.setText("");
                        txtfnprfl.setText("");
                        txtlnprfl.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Admin ID");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE ADMN DETALS
        updateDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String ad_id, pno,fname, lname;

                    ad_id = txtadidprfl.getText();
                    pno = txtconprfl.getText();
                    fname = txtfnprfl.getText();
                    lname = txtlnprfl.getText();

                    pst = con.prepareStatement("UPDATE admin SET fname = ?,lname = ?,pno = ? where ad_id = ?");

                    pst.setString(1, fname);
                    pst.setString(2, lname);
                    pst.setString(3, pno);
                    pst.setString(4,ad_id);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated");
                    table_load();

                    txtadidprfl.setText("");
                    txtconprfl.setText("");
                    txtfnprfl.setText("");
                    txtlnprfl.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
       /* -----------------------------Endng USER PROFLE------------------------------------- */

        /* -----------------------------Startng Mantan NOTCE------------------------------------- */
        //BTN ADD NEW NOTCE
        btnaddnotice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String notice_no, details, ndate, ad_id, description;

                notice_no = txtnoticeno.getText();
                details = txtnoticedetrails.getText();
                ndate = txtnoticedate.getText();
                ad_id = txtadmNOT.getText();
                description = txtAreaNotice.getText();

                try {
                    String sql;
                    sql = "INSERT INTO notice(notice_no, details, ndate, ad_id, description)" +
                            "VALUES(?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    //PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, notice_no);
                    pst.setString(2, details);
                    pst.setString(3, ndate);
                    pst.setString(4, ad_id);
                    pst.setString(5, description);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Notice Added!!!");
                    table4_load();

                    txtnoticeno.setText("");
                    txtnoticedetrails.setText("");
                    txtnoticedate.setText("");
                    txtadmNOT.setText("");
                    txtAreaNotice.setText("");
                    txtnoticeno.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });
        //GET NFO BTN NOTCE
        getInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Nid = txtnoticeno.getText();
                    pst = con.prepareStatement("SELECT details, ndate, ad_id, description from notice where notice_no = ?");
                    pst.setString(1, Nid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String details = rs.getString(1);
                        String ndate = rs.getString(2);
                        String ad_id = rs.getString(3);
                        String description = rs.getString(4);
                       // String notice_no = rs.getString(5);


                       // txtnoticeno.setText(notice_no);
                        txtnoticedetrails.setText(details);
                        txtadmNOT.setText(ad_id);
                        txtAreaNotice.setText(description);
                        txtnoticedate.setText(ndate);

                    } else {
                        txtnoticeno.setText("");
                        txtnoticedetrails.setText("");
                        txtadmNOT.setText("");
                        txtAreaNotice.setText("");
                        txtnoticedate.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Notice_NO");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });
        //DELETE NOTCE BTN
        btndeletenotice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String notice_no;
                notice_no = txtnoticeno.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM notice WHERE notice_no = ?");
                    pst.setString(1, notice_no);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    table4_load();

                    txtnoticeno.setText("");
                    txtnoticedetrails.setText("");
                    txtadmNOT.setText("");
                    txtAreaNotice.setText("");
                    txtnoticedate.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });

        //UPDATE NOTCE DETALS
        btnupdatenotice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String notice_no, details,ndate,ad_id,description ;

                    notice_no = txtnoticeno.getText();
                    details = txtnoticedetrails.getText();
                    ndate = txtnoticedate.getText();
                    ad_id = txtadmNOT.getText();
                    description = txtAreaNotice.getText();

                    pst = con.prepareStatement("UPDATE notice SET details = ?,ndate = ?,ad_id = ?, description = ? where notice_no = ?");

                    pst.setString(1, details);
                    pst.setString(2, ndate);
                    pst.setString(3, ad_id);
                    pst.setString(4,description);
                    pst.setString(5,notice_no);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Notice Updated");
                    table4_load();

                    txtnoticeno.setText("");
                    txtnoticedetrails.setText("");
                    txtadmNOT.setText("");
                    txtAreaNotice.setText("");
                    txtnoticedate.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------Ending Maintain NOTiCE------------------------------------- */

        /* -----------------------------Starting Maintain Course------------------------------------- */
        //BTN ADD NEW COURSE
        btnAddCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lec_id,subject_code, course_name, ad_id;

                lec_id = txtLecid.getText();
                subject_code = txtCC.getText();
                course_name = txtCName.getText();
                ad_id = txtAdid.getText();

                try {
                    String sql;
                    sql = "INSERT INTO course(lec_id, subject_code, course_name, ad_id)" +
                            "VALUES(?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, lec_id);
                    pst.setString(2, subject_code);
                    pst.setString(3, course_name);
                    pst.setString(4, ad_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Course Added!!!");
                    table5_load();

                    txtLecid.setText("");
                    txtCC.setText("");
                    txtCName.setText("");
                    txtAdid.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH COURSE
        btnSearchCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //lec_id,subject_code, course_name, ad_id;
                    //txtLecid  txtCC  txtCName  txtAdid
                    String Cid = txtCC.getText();
                    pst = con.prepareStatement("SELECT lec_id, course_name, ad_id from course where subject_code = ?");
                    pst.setString(1, Cid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String lec_id = rs.getString(1);
                        String course_name = rs.getString(2);
                        String ad_id = rs.getString(3);

                        txtLecid.setText(lec_id);
                        txtCName.setText(course_name);
                        txtAdid.setText(ad_id);

                    } else {
                        txtLecid.setText("");
                        txtCName.setText("");
                        txtAdid.setText("");
                        txtCC.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid course code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //BTN DELETE COURSE
        btnDeleteCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subject_code;
                subject_code = txtCC.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM course WHERE subject_code = ?");
                    pst.setString(1, subject_code);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    table5_load();

                    txtLecid.setText("");
                    txtCName.setText("");
                    txtAdid.setText("");
                    txtCC.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //BTN UPDATE COURSE DETALS
        btnUpdateCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //lec_id,subject_code, course_name, ad_id;
                //txtLecid  txtCC  txtCName  txtAdid
                try {
                    String subject_code, lec_id,course_name,ad_id ;

                    subject_code = txtCC.getText();
                    lec_id = txtLecid.getText();
                    course_name = txtCName.getText();
                    ad_id = txtAdid.getText();

                    pst = con.prepareStatement("UPDATE course SET lec_id = ?,course_name = ?,ad_id = ? where subject_code = ?");

                    pst.setString(1, lec_id);
                    pst.setString(2, course_name);
                    pst.setString(3, ad_id);
                    pst.setString(4,subject_code);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Course Details Updated");
                    table5_load();

                    txtLecid.setText("");
                    txtCName.setText("");
                    txtAdid.setText("");
                    txtCC.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------ENDING Maintain Course------------------------------------- */
        /* -----------------------------STARTING Maintain TIME TABLE L1S1 BST------------------------------------- */

        //BTN ADD New Row of L1 S1 BST TIME TABLE
        btnBST_L1S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L1S1_bst.getText();
                mon = txt_L1S1_BST_mon.getText();
                tue = txt_L1S1_BST_tue.getText();
                wed = txt_L1S1_BST_wed.getText();
                thu = txt_L1S1_BST_thu.getText();
                fri = txt_L1S1_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l1s1bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl1s1_load();

                    txt_tm_L1S1_bst.setText("");
                    txt_L1S1_BST_mon.setText("");
                    txt_L1S1_BST_tue.setText("");
                    txt_L1S1_BST_wed.setText("");
                    txt_L1S1_BST_thu.setText("");
                    txt_L1S1_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L1 S1 BST
        btnSearch_bst_L1S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L1S1_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s1bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                       // txt_tm_L1S1_bst.setText(tm);
                        txt_L1S1_BST_mon.setText(mon);
                        txt_L1S1_BST_tue.setText(tue);
                        txt_L1S1_BST_wed.setText(wed);
                        txt_L1S1_BST_thu.setText(thu);
                        txt_L1S1_BST_fri.setText(fri);

                    } else {
                        txt_tm_L1S1_bst.setText("");
                        txt_L1S1_BST_mon.setText("");
                        txt_L1S1_BST_tue.setText("");
                        txt_L1S1_BST_wed.setText("");
                        txt_L1S1_BST_thu.setText("");
                        txt_L1S1_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPDATE BTN FOR L1S1 BST
        btn_Update_l1s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L1S1_bst.getText();
                    mon = txt_L1S1_BST_mon.getText();
                    tue = txt_L1S1_BST_tue.getText();
                    wed = txt_L1S1_BST_wed.getText();
                    thu = txt_L1S1_BST_thu.getText();
                    fri = txt_L1S1_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l1s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl1s1_load();

                    txt_tm_L1S1_bst.setText("");
                    txt_L1S1_BST_mon.setText("");
                    txt_L1S1_BST_tue.setText("");
                    txt_L1S1_BST_wed.setText("");
                    txt_L1S1_BST_thu.setText("");
                    txt_L1S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE ROW DATA FROM L1S1 BST TME TABLE
        btn_Delete_l1s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L1S1_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l1s1bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl1s1_load();

                    txt_tm_L1S1_bst.setText("");
                    txt_L1S1_BST_mon.setText("");
                    txt_L1S1_BST_tue.setText("");
                    txt_L1S1_BST_wed.setText("");
                    txt_L1S1_BST_thu.setText("");
                    txt_L1S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        /* -----------------------------STARTING Maintain TIME TABLE L1S1 ICT------------------------------------- */

//DELETE ROW DATA FROM L1S1 ICT TME TABLE
        btn_Delete_l1s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L1S1_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l1s1ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl1s1_load();

                    txt_tm_L1S1_ICT.setText("");
                    txt_L1S1_ICT_mon.setText("");
                    txt_L1S1_ICT_tue.setText("");
                    txt_L1S1_ICT_wed.setText("");
                    txt_L1S1_ICT_thu.setText("");
                    txt_L1S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L1S1 TABLE
        btnICT_L1S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L1S1_ICT.getText();
                mon = txt_L1S1_ICT_mon.getText();
                tue = txt_L1S1_ICT_tue.getText();
                wed = txt_L1S1_ICT_wed.getText();
                thu = txt_L1S1_ICT_thu.getText();
                fri = txt_L1S1_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l1s1ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl1s1_load();

                    txt_tm_L1S1_ICT.setText("");
                    txt_L1S1_ICT_mon.setText("");
                    txt_L1S1_ICT_tue.setText("");
                    txt_L1S1_ICT_wed.setText("");
                    txt_L1S1_ICT_thu.setText("");
                    txt_L1S1_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L1 S1 ICT
        btnSearch_ICT_L1S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L1S1_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s1ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                       // txt_tm_L1S1_ICT.setText(tm);
                        txt_L1S1_ICT_mon.setText(mon);
                        txt_L1S1_ICT_tue.setText(tue);
                        txt_L1S1_ICT_wed.setText(wed);
                        txt_L1S1_ICT_thu.setText(thu);
                        txt_L1S1_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L1S1_ICT.setText("");
                        txt_L1S1_ICT_mon.setText("");
                        txt_L1S1_ICT_tue.setText("");
                        txt_L1S1_ICT_wed.setText("");
                        txt_L1S1_ICT_thu.setText("");
                        txt_L1S1_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L1S1 ict
        btn_Update_l1s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L1S1_ICT.getText();
                    mon = txt_L1S1_ICT_mon.getText();
                    tue = txt_L1S1_ICT_tue.getText();
                    wed = txt_L1S1_ICT_wed.getText();
                    thu = txt_L1S1_ICT_thu.getText();
                    fri = txt_L1S1_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l1s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl1s1_load();

                    txt_tm_L1S1_ICT.setText("");
                    txt_L1S1_ICT_mon.setText("");
                    txt_L1S1_ICT_tue.setText("");
                    txt_L1S1_ICT_wed.setText("");
                    txt_L1S1_ICT_thu.setText("");
                    txt_L1S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------STARTING Maintain TIME TABLE L1S1 ET------------------------------------- */
        //ADD NEW RECORD TO ET L1S1
        btnET_L1S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L1S1_et.getText();
                mon = txt_L1S1_ET_mon.getText();
                tue = txt_L1S1_ET_tue.getText();
                wed = txt_L1S1_ET_wed.getText();
                thu = txt_L1S1_ET_thu.getText();
                fri = txt_L1S1_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l1s1et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl1s1_load();

                    txt_tm_L1S1_et.setText("");
                    txt_L1S1_ET_mon.setText("");
                    txt_L1S1_ET_tue.setText("");
                    txt_L1S1_ET_wed.setText("");
                    txt_L1S1_ET_thu.setText("");
                    txt_L1S1_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L1S1 ET TABLE
        btnSearch_et_L1S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L1S1_et.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s1et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L1S1_et.setText(tm);
                        txt_L1S1_ET_mon.setText(mon);
                        txt_L1S1_ET_tue.setText(tue);
                        txt_L1S1_ET_wed.setText(wed);
                        txt_L1S1_ET_thu.setText(thu);
                        txt_L1S1_ET_fri.setText(fri);

                    } else {
                        txt_tm_L1S1_et.setText("");
                        txt_L1S1_ET_mon.setText("");
                        txt_L1S1_ET_tue.setText("");
                        txt_L1S1_ET_wed.setText("");
                        txt_L1S1_ET_thu.setText("");
                        txt_L1S1_ET_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L1 S1
        btn_Update_l1s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L1S1_et.getText();
                    mon = txt_L1S1_ET_mon.getText();
                    tue = txt_L1S1_ET_tue.getText();
                    wed = txt_L1S1_ET_wed.getText();
                    thu = txt_L1S1_ET_thu.getText();
                    fri = txt_L1S1_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l1s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl1s1_load();

                    txt_tm_L1S1_et.setText("");
                    txt_L1S1_ET_mon.setText("");
                    txt_L1S1_ET_tue.setText("");
                    txt_L1S1_ET_wed.setText("");
                    txt_L1S1_ET_thu.setText("");
                    txt_L1S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L1S1 TABLE
        btn_Delete_l1s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L1S1_et.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l1s1et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl1s1_load();

                    txt_tm_L1S1_et.setText("");
                    txt_L1S1_ET_mon.setText("");
                    txt_L1S1_ET_tue.setText("");
                    txt_L1S1_ET_wed.setText("");
                    txt_L1S1_ET_thu.setText("");
                    txt_L1S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
/*---------------------------------------------STRATNG BST L1S2 TME TABLE----------------------------------- */
        //ADD NEW TO BST L1S2 TABLE
        btnBST_L1S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L1S2_bst.getText();
                mon = txt_L1S2_BST_mon.getText();
                tue = txt_L1S2_BST_tue.getText();
                wed = txt_L1S2_BST_wed.getText();
                thu = txt_L1S2_BST_thu.getText();
                fri = txt_L1S2_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l1s2bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl1s2_load();

                    txt_tm_L1S2_bst.setText("");
                    txt_L1S2_BST_mon.setText("");
                    txt_L1S2_BST_tue.setText("");
                    txt_L1S2_BST_wed.setText("");
                    txt_L1S2_BST_thu.setText("");
                    txt_L1S2_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        //SEARCH BTN BST L1S2
        btnSearch_bst_L1S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L1S2_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s2bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                        // txt_tm_L1S2_bst.setText(tm);
                        txt_L1S2_BST_mon.setText(mon);
                        txt_L1S2_BST_tue.setText(tue);
                        txt_L1S2_BST_wed.setText(wed);
                        txt_L1S2_BST_thu.setText(thu);
                        txt_L1S2_BST_fri.setText(fri);

                    } else {
                        txt_tm_L1S2_bst.setText("");
                        txt_L1S2_BST_mon.setText("");
                        txt_L1S2_BST_tue.setText("");
                        txt_L1S2_BST_wed.setText("");
                        txt_L1S2_BST_thu.setText("");
                        txt_L1S2_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPADTE BTN BST L1 S2
        btn_Update_l1s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L1S2_bst.getText();
                    mon = txt_L1S2_BST_mon.getText();
                    tue = txt_L1S2_BST_tue.getText();
                    wed = txt_L1S2_BST_wed.getText();
                    thu = txt_L1S2_BST_thu.getText();
                    fri = txt_L1S2_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l1s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl1s2_load();

                    txt_tm_L1S2_bst.setText("");
                    txt_L1S2_BST_mon.setText("");
                    txt_L1S2_BST_tue.setText("");
                    txt_L1S2_BST_wed.setText("");
                    txt_L1S2_BST_thu.setText("");
                    txt_L1S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        //DELETE BTN BST L1 S2
        btn_Delete_l1s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L1S2_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l1s2bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl1s2_load();

                    txt_tm_L1S2_bst.setText("");
                    txt_L1S2_BST_mon.setText("");
                    txt_L1S2_BST_tue.setText("");
                    txt_L1S2_BST_wed.setText("");
                    txt_L1S2_BST_thu.setText("");
                    txt_L1S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L1S2 ICT------------------------------------- */

//DELETE ROW DATA FROM L1S2 ICT TME TABLE
        btn_Delete_l1s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L1S2_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l1s2ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl1s2_load();

                    txt_tm_L1S2_ICT.setText("");
                    txt_L1S2_ICT_mon.setText("");
                    txt_L1S2_ICT_tue.setText("");
                    txt_L1S2_ICT_wed.setText("");
                    txt_L1S2_ICT_thu.setText("");
                    txt_L1S2_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L1S1 TABLE
        btnICT_L1S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L1S2_ICT.getText();
                mon = txt_L1S2_ICT_mon.getText();
                tue = txt_L1S2_ICT_tue.getText();
                wed = txt_L1S2_ICT_wed.getText();
                thu = txt_L1S2_ICT_thu.getText();
                fri = txt_L1S2_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l1s2ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl1s2_load();

                    txt_tm_L1S2_ICT.setText("");
                    txt_L1S2_ICT_mon.setText("");
                    txt_L1S2_ICT_tue.setText("");
                    txt_L1S2_ICT_wed.setText("");
                    txt_L1S2_ICT_thu.setText("");
                    txt_L1S2_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L1 S2 ICT
        btnSearch_ICT_L1S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L1S2_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s2ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L1S2_ICT.setText(tm);
                        txt_L1S2_ICT_mon.setText(mon);
                        txt_L1S2_ICT_tue.setText(tue);
                        txt_L1S2_ICT_wed.setText(wed);
                        txt_L1S2_ICT_thu.setText(thu);
                        txt_L1S2_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L1S2_ICT.setText("");
                        txt_L1S2_ICT_mon.setText("");
                        txt_L1S2_ICT_tue.setText("");
                        txt_L1S2_ICT_wed.setText("");
                        txt_L1S2_ICT_thu.setText("");
                        txt_L1S2_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L1S2 ict
        btn_Update_l1s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L1S2_ICT.getText();
                    mon = txt_L1S2_ICT_mon.getText();
                    tue = txt_L1S2_ICT_tue.getText();
                    wed = txt_L1S2_ICT_wed.getText();
                    thu = txt_L1S2_ICT_thu.getText();
                    fri = txt_L1S2_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l1s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl1s2_load();

                    txt_tm_L1S2_ICT.setText("");
                    txt_L1S2_ICT_mon.setText("");
                    txt_L1S2_ICT_tue.setText("");
                    txt_L1S2_ICT_wed.setText("");
                    txt_L1S2_ICT_thu.setText("");
                    txt_L1S2_ICT_fri.setText("");;

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L1S2 ET------------------------------------- */
        //ADD NEW RECORD TO ET L1S2
        btnET_L1S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L1S2_et.getText();
                mon = txt_L1S2_ET_mon.getText();
                tue = txt_L1S2_ET_tue.getText();
                wed = txt_L1S2_ET_wed.getText();
                thu = txt_L1S2_ET_thu.getText();
                fri = txt_L1S2_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l1s2et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl1s2_load();

                    txt_tm_L1S2_et.setText("");
                    txt_L1S2_ET_mon.setText("");
                    txt_L1S2_ET_tue.setText("");
                    txt_L1S2_ET_wed.setText("");
                    txt_L1S2_ET_thu.setText("");
                    txt_L1S2_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L1S1 ET TABLE
        btnSearch_et_L1S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L1S2_et.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l1s2et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L1S2_et.setText(tm);
                        txt_L1S2_ET_mon.setText(mon);
                        txt_L1S2_ET_tue.setText(tue);
                        txt_L1S2_ET_wed.setText(wed);
                        txt_L1S2_ET_thu.setText(thu);
                        txt_L1S2_ET_fri.setText(fri);

                    } else {
                        txt_tm_L1S2_et.setText("");
                        txt_L1S2_ET_mon.setText("");
                        txt_L1S2_ET_tue.setText("");
                        txt_L1S2_ET_wed.setText("");
                        txt_L1S2_ET_thu.setText("");
                        txt_L1S2_ET_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L1 S1
        btn_Update_l1s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L1S2_et.getText();
                    mon = txt_L1S2_ET_mon.getText();
                    tue = txt_L1S2_ET_tue.getText();
                    wed = txt_L1S2_ET_wed.getText();
                    thu = txt_L1S2_ET_thu.getText();
                    fri = txt_L1S2_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l1s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl1s2_load();

                    txt_tm_L1S2_et.setText("");
                    txt_L1S2_ET_mon.setText("");
                    txt_L1S2_ET_tue.setText("");
                    txt_L1S2_ET_wed.setText("");
                    txt_L1S2_ET_thu.setText("");
                    txt_L1S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L1S2 TABLE
        btn_Delete_l1s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L1S2_et.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l1s2et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl1s2_load();

                    txt_tm_L1S2_et.setText("");
                    txt_L1S2_ET_mon.setText("");
                    txt_L1S2_ET_tue.setText("");
                    txt_L1S2_ET_wed.setText("");
                    txt_L1S2_ET_thu.setText("");
                    txt_L1S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L2S1 BST------------------------------------- */

        //BTN ADD New Row of L2 S1 BST TIME TABLE
        btnBST_L2S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L2S1_bst.getText();
                mon = txt_L2S1_BST_mon.getText();
                tue = txt_L2S1_BST_tue.getText();
                wed = txt_L2S1_BST_wed.getText();
                thu = txt_L2S1_BST_thu.getText();
                fri = txt_L2S1_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l2s1bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl2s1_load();

                    txt_tm_L2S1_bst.setText("");
                    txt_L2S1_BST_mon.setText("");
                    txt_L2S1_BST_tue.setText("");
                    txt_L2S1_BST_wed.setText("");
                    txt_L2S1_BST_thu.setText("");
                    txt_L2S1_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L2 S1 BST
        btnSearch_bst_L2S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L2S1_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s1bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                        // txt_tm_L2S1_bst.setText(tm);
                        txt_L2S1_BST_mon.setText(mon);
                        txt_L2S1_BST_tue.setText(tue);
                        txt_L2S1_BST_wed.setText(wed);
                        txt_L2S1_BST_thu.setText(thu);
                        txt_L2S1_BST_fri.setText(fri);

                    } else {
                        txt_tm_L2S1_bst.setText("");
                        txt_L2S1_BST_mon.setText("");
                        txt_L2S1_BST_tue.setText("");
                        txt_L2S1_BST_wed.setText("");
                        txt_L2S1_BST_thu.setText("");
                        txt_L2S1_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPDATE BTN FOR L2S1 BST
        btn_Update_l2s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L2S1_bst.getText();
                    mon = txt_L2S1_BST_mon.getText();
                    tue = txt_L2S1_BST_tue.getText();
                    wed = txt_L2S1_BST_wed.getText();
                    thu = txt_L2S1_BST_thu.getText();
                    fri = txt_L2S1_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l2s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl2s1_load();

                    txt_tm_L2S1_bst.setText("");
                    txt_L2S1_BST_mon.setText("");
                    txt_L2S1_BST_tue.setText("");
                    txt_L2S1_BST_wed.setText("");
                    txt_L2S1_BST_thu.setText("");
                    txt_L2S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE ROW DATA FROM L2S1 BST TME TABLE
        btn_Delete_l2s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L2S1_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l2s1bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl2s1_load();

                    txt_tm_L2S1_bst.setText("");
                    txt_L2S1_BST_mon.setText("");
                    txt_L2S1_BST_tue.setText("");
                    txt_L2S1_BST_wed.setText("");
                    txt_L2S1_BST_thu.setText("");
                    txt_L2S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L2S1 ICT------------------------------------- */

//DELETE ROW DATA FROM L2S1 ICT TME TABLE
        btn_Delete_l2s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L2S1_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l2s1ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl2s1_load();

                    txt_tm_L2S1_ICT.setText("");
                    txt_L2S1_ICT_mon.setText("");
                    txt_L2S1_ICT_tue.setText("");
                    txt_L2S1_ICT_wed.setText("");
                    txt_L2S1_ICT_thu.setText("");
                    txt_L2S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L1S1 TABLE
        btnICT_L2S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L2S1_ICT.getText();
                mon = txt_L2S1_ICT_mon.getText();
                tue = txt_L2S1_ICT_tue.getText();
                wed = txt_L2S1_ICT_wed.getText();
                thu = txt_L2S1_ICT_thu.getText();
                fri = txt_L2S1_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l2s1ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl2s1_load();

                    txt_tm_L2S1_ICT.setText("");
                    txt_L2S1_ICT_mon.setText("");
                    txt_L2S1_ICT_tue.setText("");
                    txt_L2S1_ICT_wed.setText("");
                    txt_L2S1_ICT_thu.setText("");
                    txt_L2S1_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L1 S1 ICT
        btnSearch_ICT_L2S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L2S1_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s1ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L2S1_ICT.setText(tm);
                        txt_L2S1_ICT_mon.setText(mon);
                        txt_L2S1_ICT_tue.setText(tue);
                        txt_L2S1_ICT_wed.setText(wed);
                        txt_L2S1_ICT_thu.setText(thu);
                        txt_L2S1_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L2S1_ICT.setText("");
                        txt_L2S1_ICT_mon.setText("");
                        txt_L2S1_ICT_tue.setText("");
                        txt_L2S1_ICT_wed.setText("");
                        txt_L2S1_ICT_thu.setText("");
                        txt_L2S1_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L1S1 ict
        btn_Update_l2s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L2S1_ICT.getText();
                    mon = txt_L2S1_ICT_mon.getText();
                    tue = txt_L2S1_ICT_tue.getText();
                    wed = txt_L2S1_ICT_wed.getText();
                    thu = txt_L2S1_ICT_thu.getText();
                    fri = txt_L2S1_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l2s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl2s1_load();

                    txt_tm_L2S1_ICT.setText("");
                    txt_L2S1_ICT_mon.setText("");
                    txt_L2S1_ICT_tue.setText("");
                    txt_L2S1_ICT_wed.setText("");
                    txt_L2S1_ICT_thu.setText("");
                    txt_L2S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L2S1 ET------------------------------------- */
        //ADD NEW RECORD TO ET L2S1
        btnET_L2S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L2S1_ET.getText();
                mon = txt_L2S1_ET_mon.getText();
                tue = txt_L2S1_ET_tue.getText();
                wed = txt_L2S1_ET_wed.getText();
                thu = txt_L2S1_ET_thu.getText();
                fri = txt_L2S1_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l2s1et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl2s1_load();

                    txt_tm_L2S1_ET.setText("");
                    txt_L2S1_ET_mon.setText("");
                    txt_L2S1_ET_tue.setText("");
                    txt_L2S1_ET_wed.setText("");
                    txt_L2S1_ET_thu.setText("");
                    txt_L2S1_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L2S1 ET TABLE
        btnSearch_et_L2S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L2S1_ET.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s1et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        //txt_tm_L2S1_ET.setText(tm);
                        txt_L2S1_ET_mon.setText(mon);
                        txt_L2S1_ET_tue.setText(tue);
                        txt_L2S1_ET_wed.setText(wed);
                        txt_L2S1_ET_thu.setText(thu);
                        txt_L2S1_ET_fri.setText(fri);

                    } else {
                        txt_tm_L2S1_ET.setText("");
                        txt_L2S1_ET_mon.setText("");
                        txt_L2S1_ET_tue.setText("");
                        txt_L2S1_ET_wed.setText("");
                        txt_L2S1_ET_thu.setText("");
                        txt_L2S1_ET_fri.setText("");

                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L1 S1
        btn_Update_l2s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L2S1_ET.getText();
                    mon = txt_L2S1_ET_mon.getText();
                    tue = txt_L2S1_ET_tue.getText();
                    wed = txt_L2S1_ET_wed.getText();
                    thu = txt_L2S1_ET_thu.getText();
                    fri = txt_L2S1_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l2s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl2s1_load();

                    txt_tm_L2S1_ET.setText("");
                    txt_L2S1_ET_mon.setText("");
                    txt_L2S1_ET_tue.setText("");
                    txt_L2S1_ET_wed.setText("");
                    txt_L2S1_ET_thu.setText("");
                    txt_L2S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L1S1 TABLE
        btn_Delete_l2s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L2S1_ET.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l2s1et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl2s1_load();

                    txt_tm_L2S1_ET.setText("");
                    txt_L2S1_ET_mon.setText("");
                    txt_L2S1_ET_tue.setText("");
                    txt_L2S1_ET_wed.setText("");
                    txt_L2S1_ET_thu.setText("");
                    txt_L2S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

                    /* -----------------------------LEVEL 2 SEM 2------------------------------------- */
        /* -----------------------------STARTING Maintain TIME TABLE L2S2 ET------------------------------------- */
        //ADD NEW RECORD TO ET L2S2
        btnET_L2S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L2S2_et.getText();
                mon = txt_L2S2_ET_mon.getText();
                tue = txt_L2S2_ET_tue.getText();
                wed = txt_L2S2_ET_wed.getText();
                thu = txt_L2S2_ET_thu.getText();
                fri = txt_L2S2_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l2s2et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl2s2_load();

                    txt_tm_L2S2_et.setText("");
                    txt_L2S2_ET_mon.setText("");
                    txt_L2S2_ET_tue.setText("");
                    txt_L2S2_ET_wed.setText("");
                    txt_L2S2_ET_thu.setText("");
                    txt_L2S2_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L2S2 ET TABLE
        btnSearch_et_L2S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L2S2_et.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s2et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L2S2_et.setText(tm);
                        txt_L2S2_ET_mon.setText(mon);
                        txt_L2S2_ET_tue.setText(tue);
                        txt_L2S2_ET_wed.setText(wed);
                        txt_L2S2_ET_thu.setText(thu);
                        txt_L2S2_ET_fri.setText(fri);

                    } else {
                        txt_tm_L2S2_et.setText("");
                        txt_L2S2_ET_mon.setText("");
                        txt_L2S2_ET_tue.setText("");
                        txt_L2S2_ET_wed.setText("");
                        txt_L2S2_ET_thu.setText("");
                        txt_L2S2_ET_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L2 S2
        btn_Update_l2s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L2S2_et.getText();
                    mon = txt_L2S2_ET_mon.getText();
                    tue = txt_L2S2_ET_tue.getText();
                    wed = txt_L2S2_ET_wed.getText();
                    thu = txt_L2S2_ET_thu.getText();
                    fri = txt_L2S2_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l2s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl2s2_load();

                    txt_tm_L2S2_et.setText("");
                    txt_L2S2_ET_mon.setText("");
                    txt_L2S2_ET_tue.setText("");
                    txt_L2S2_ET_wed.setText("");
                    txt_L2S2_ET_thu.setText("");
                    txt_L2S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L2 S2 TABLE
        btn_Delete_l2s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L2S2_et.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l2s2et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl2s2_load();

                    txt_tm_L2S2_et.setText("");
                    txt_L2S2_ET_mon.setText("");
                    txt_L2S2_ET_tue.setText("");
                    txt_L2S2_ET_wed.setText("");
                    txt_L2S2_ET_thu.setText("");
                    txt_L2S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /*---------------------------------------------STRATNG BST L2S2 TME TABLE----------------------------------- */
        //ADD NEW TO BST L2S2 TABLE
        btnBST_L2S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L2S2_bst.getText();
                mon = txt_L2S2_BST_mon.getText();
                tue = txt_L2S2_BST_tue.getText();
                wed = txt_L2S2_BST_wed.getText();
                thu = txt_L2S2_BST_thu.getText();
                fri = txt_L2S2_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l2s2bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl2s2_load();

                    txt_tm_L2S2_bst.setText("");
                    txt_L2S2_BST_mon.setText("");
                    txt_L2S2_BST_tue.setText("");
                    txt_L2S2_BST_wed.setText("");
                    txt_L2S2_BST_thu.setText("");
                    txt_L2S2_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        //SEARCH BTN BST L2 S2
        btnSearch_bst_L2S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L2S2_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s2bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                        // txt_tm_L2S2_bst.setText(tm);
                        txt_L2S2_BST_mon.setText(mon);
                        txt_L2S2_BST_tue.setText(tue);
                        txt_L2S2_BST_wed.setText(wed);
                        txt_L2S2_BST_thu.setText(thu);
                        txt_L2S2_BST_fri.setText(fri);

                    } else {
                        txt_tm_L2S2_bst.setText("");
                        txt_L2S2_BST_mon.setText("");
                        txt_L2S2_BST_tue.setText("");
                        txt_L2S2_BST_wed.setText("");
                        txt_L2S2_BST_thu.setText("");
                        txt_L2S2_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPADTE BTN BST L2 S2
        btn_Update_l2s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L2S2_bst.getText();
                    mon = txt_L2S2_BST_mon.getText();
                    tue = txt_L2S2_BST_tue.getText();
                    wed = txt_L2S2_BST_wed.getText();
                    thu = txt_L2S2_BST_thu.getText();
                    fri = txt_L2S2_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l2s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl2s2_load();

                    txt_tm_L2S2_bst.setText("");
                    txt_L2S2_BST_mon.setText("");
                    txt_L2S2_BST_tue.setText("");
                    txt_L2S2_BST_wed.setText("");
                    txt_L2S2_BST_thu.setText("");
                    txt_L2S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        //DELETE BTN BST L2 S2
        btn_Delete_l2s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L2S2_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l2s2bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl2s2_load();

                    txt_tm_L2S2_bst.setText("");
                    txt_L2S2_BST_mon.setText("");
                    txt_L2S2_BST_tue.setText("");
                    txt_L2S2_BST_wed.setText("");
                    txt_L2S2_BST_thu.setText("");
                    txt_L2S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L2S2 ICT------------------------------------- */

    //DELETE ROW DATA FROM L2S2 ICT TME TABLE
        btn_Delete_l2s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L2S2_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l2s2ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl2s2_load();

                    txt_tm_L2S2_ICT.setText("");
                    txt_L2S2_ICT_mon.setText("");
                    txt_L2S2_ICT_tue.setText("");
                    txt_L2S2_ICT_wed.setText("");
                    txt_L2S2_ICT_thu.setText("");
                    txt_L2S2_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L2S2 TABLE
        btnICT_L2S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L2S2_ICT.getText();
                mon = txt_L2S2_ICT_mon.getText();
                tue = txt_L2S2_ICT_tue.getText();
                wed = txt_L2S2_ICT_wed.getText();
                thu = txt_L2S2_ICT_thu.getText();
                fri = txt_L2S2_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l2s2ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl2s2_load();

                    txt_tm_L2S2_ICT.setText("");
                    txt_L2S2_ICT_mon.setText("");
                    txt_L2S2_ICT_tue.setText("");
                    txt_L2S2_ICT_wed.setText("");
                    txt_L2S2_ICT_thu.setText("");
                    txt_L2S2_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L2 S2 ICT
        btnSearch_ICT_L2S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L2S2_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l2s2ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L2S2_ICT.setText(tm);
                        txt_L2S2_ICT_mon.setText(mon);
                        txt_L2S2_ICT_tue.setText(tue);
                        txt_L2S2_ICT_wed.setText(wed);
                        txt_L2S2_ICT_thu.setText(thu);
                        txt_L2S2_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L2S2_ICT.setText("");
                        txt_L2S2_ICT_mon.setText("");
                        txt_L2S2_ICT_tue.setText("");
                        txt_L2S2_ICT_wed.setText("");
                        txt_L2S2_ICT_thu.setText("");
                        txt_L2S2_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L2S2 ict
        btn_Update_l2s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L2S2_ICT.getText();
                    mon = txt_L2S2_ICT_mon.getText();
                    tue = txt_L2S2_ICT_tue.getText();
                    wed = txt_L2S2_ICT_wed.getText();
                    thu = txt_L2S2_ICT_thu.getText();
                    fri = txt_L2S2_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l2s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl2s2_load();

                    txt_tm_L2S2_ICT.setText("");
                    txt_L2S2_ICT_mon.setText("");
                    txt_L2S2_ICT_tue.setText("");
                    txt_L2S2_ICT_wed.setText("");
                    txt_L2S2_ICT_thu.setText("");
                    txt_L2S2_ICT_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
                         /* -----------------------------LEVEL 3 SEM 1------------------------------------- */
        /* -----------------------------STARTING Maintain TIME TABLE L3S1 BST------------------------------------- */

        //BTN ADD New Row of L3 S1 BST TIME TABLE
        btnBST_L3S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L3S1_bst.getText();
                mon = txt_L3S1_BST_mon.getText();
                tue = txt_L3S1_BST_tue.getText();
                wed = txt_L3S1_BST_wed.getText();
                thu = txt_L3S1_BST_thu.getText();
                fri = txt_L3S1_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l3s1bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl3s1_load();

                    txt_tm_L3S1_bst.setText("");
                    txt_L3S1_BST_mon.setText("");
                    txt_L3S1_BST_tue.setText("");
                    txt_L3S1_BST_wed.setText("");
                    txt_L3S1_BST_thu.setText("");
                    txt_L3S1_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L3 S1 BST
        btnSearch_bst_L3S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L3S1_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s1bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                        // txt_tm_L3S1_bst.setText(tm);
                        txt_L3S1_BST_mon.setText(mon);
                        txt_L3S1_BST_tue.setText(tue);
                        txt_L3S1_BST_wed.setText(wed);
                        txt_L3S1_BST_thu.setText(thu);
                        txt_L3S1_BST_fri.setText(fri);

                    } else {
                        txt_tm_L3S1_bst.setText("");
                        txt_L3S1_BST_mon.setText("");
                        txt_L3S1_BST_tue.setText("");
                        txt_L3S1_BST_wed.setText("");
                        txt_L3S1_BST_thu.setText("");
                        txt_L3S1_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPDATE BTN FOR L3S1 BST
        btn_Update_l3s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L3S1_bst.getText();
                    mon = txt_L3S1_BST_mon.getText();
                    tue = txt_L3S1_BST_tue.getText();
                    wed = txt_L3S1_BST_wed.getText();
                    thu = txt_L3S1_BST_thu.getText();
                    fri = txt_L3S1_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l3s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl3s1_load();

                    txt_tm_L3S1_bst.setText("");
                    txt_L3S1_BST_mon.setText("");
                    txt_L3S1_BST_tue.setText("");
                    txt_L3S1_BST_wed.setText("");
                    txt_L3S1_BST_thu.setText("");
                    txt_L3S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE ROW DATA FROM L3S1 BST TME TABLE
        btn_Delete_l3s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L3S1_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l3s1bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl3s1_load();

                    txt_tm_L3S1_bst.setText("");
                    txt_L3S1_BST_mon.setText("");
                    txt_L3S1_BST_tue.setText("");
                    txt_L3S1_BST_wed.setText("");
                    txt_L3S1_BST_thu.setText("");
                    txt_L3S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        /* -----------------------------STARTING Maintain TIME TABLE L3S1 ICT------------------------------------- */

//DELETE ROW DATA FROM L3S1 ICT TME TABLE
        btn_Delete_l3s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L3S1_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l3s1ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl3s1_load();

                    txt_tm_L3S1_ICT.setText("");
                    txt_L3S1_ICT_mon.setText("");
                    txt_L3S1_ICT_tue.setText("");
                    txt_L3S1_ICT_wed.setText("");
                    txt_L3S1_ICT_thu.setText("");
                    txt_L3S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L3S1 TABLE
        btnICT_L3S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L3S1_ICT.getText();
                mon = txt_L3S1_ICT_mon.getText();
                tue = txt_L3S1_ICT_tue.getText();
                wed = txt_L3S1_ICT_wed.getText();
                thu = txt_L3S1_ICT_thu.getText();
                fri = txt_L3S1_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l3s1ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl3s1_load();

                    txt_tm_L3S1_ICT.setText("");
                    txt_L3S1_ICT_mon.setText("");
                    txt_L3S1_ICT_tue.setText("");
                    txt_L3S1_ICT_wed.setText("");
                    txt_L3S1_ICT_thu.setText("");
                    txt_L3S1_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L3 S1 ICT
        btnSearch_ICT_L3S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L3S1_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s1ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L3S1_ICT.setText(tm);
                        txt_L3S1_ICT_mon.setText(mon);
                        txt_L3S1_ICT_tue.setText(tue);
                        txt_L3S1_ICT_wed.setText(wed);
                        txt_L3S1_ICT_thu.setText(thu);
                        txt_L3S1_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L3S1_ICT.setText("");
                        txt_L3S1_ICT_mon.setText("");
                        txt_L3S1_ICT_tue.setText("");
                        txt_L3S1_ICT_wed.setText("");
                        txt_L3S1_ICT_thu.setText("");
                        txt_L3S1_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L3S1 ict
        btn_Update_l3s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L3S1_ICT.getText();
                    mon = txt_L3S1_ICT_mon.getText();
                    tue = txt_L3S1_ICT_tue.getText();
                    wed = txt_L3S1_ICT_wed.getText();
                    thu = txt_L3S1_ICT_thu.getText();
                    fri = txt_L3S1_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l3s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl3s1_load();

                    txt_tm_L3S1_ICT.setText("");
                    txt_L3S1_ICT_mon.setText("");
                    txt_L3S1_ICT_tue.setText("");
                    txt_L3S1_ICT_wed.setText("");
                    txt_L3S1_ICT_thu.setText("");
                    txt_L3S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L3S1 ET------------------------------------- */
        //ADD NEW RECORD TO ET L3S1
        btnET_L3S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L3S1_ET.getText();
                mon = txt_L3S1_ET_mon.getText();
                tue = txt_L3S1_ET_tue.getText();
                wed = txt_L3S1_ET_wed.getText();
                thu = txt_L3S1_ET_thu.getText();
                fri = txt_L3S1_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l3s1et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl3s1_load();

                    txt_tm_L3S1_ET.setText("");
                    txt_L3S1_ET_mon.setText("");
                    txt_L3S1_ET_tue.setText("");
                    txt_L3S1_ET_wed.setText("");
                    txt_L3S1_ET_thu.setText("");
                    txt_L3S1_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L3S1 ET TABLE
        btnSearch_et_L3S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L3S1_ET.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s1et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        //txt_tm_L3S1_ET.setText(tm);
                        txt_L3S1_ET_mon.setText(mon);
                        txt_L3S1_ET_tue.setText(tue);
                        txt_L3S1_ET_wed.setText(wed);
                        txt_L3S1_ET_thu.setText(thu);
                        txt_L3S1_ET_fri.setText(fri);

                    } else {
                        txt_tm_L3S1_ET.setText("");
                        txt_L3S1_ET_mon.setText("");
                        txt_L3S1_ET_tue.setText("");
                        txt_L3S1_ET_wed.setText("");
                        txt_L3S1_ET_thu.setText("");
                        txt_L3S1_ET_fri.setText("");

                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L3 S1
        btn_Update_l3s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L3S1_ET.getText();
                    mon = txt_L3S1_ET_mon.getText();
                    tue = txt_L3S1_ET_tue.getText();
                    wed = txt_L3S1_ET_wed.getText();
                    thu = txt_L3S1_ET_thu.getText();
                    fri = txt_L3S1_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l3s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl3s1_load();

                    txt_tm_L3S1_ET.setText("");
                    txt_L3S1_ET_mon.setText("");
                    txt_L3S1_ET_tue.setText("");
                    txt_L3S1_ET_wed.setText("");
                    txt_L3S1_ET_thu.setText("");
                    txt_L3S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L3S1 TABLE
        btn_Delete_l3s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L3S1_ET.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l3s1et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl3s1_load();

                    txt_tm_L3S1_ET.setText("");
                    txt_L3S1_ET_mon.setText("");
                    txt_L3S1_ET_tue.setText("");
                    txt_L3S1_ET_wed.setText("");
                    txt_L3S1_ET_thu.setText("");
                    txt_L3S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L3S2 BST------------------------------------- */

        //BTN ADD New Row of L3 S2 BST TIME TABLE
        btnBST_L3S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L3S2_bst.getText();
                mon = txt_L3S2_BST_mon.getText();
                tue = txt_L3S2_BST_tue.getText();
                wed = txt_L3S2_BST_wed.getText();
                thu = txt_L3S2_BST_thu.getText();
                fri = txt_L3S2_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l3s2bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl3s2_load();

                    txt_tm_L3S2_bst.setText("");
                    txt_L3S2_BST_mon.setText("");
                    txt_L3S2_BST_tue.setText("");
                    txt_L3S2_BST_wed.setText("");
                    txt_L3S2_BST_thu.setText("");
                    txt_L3S2_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L3 S2 BST
        btnSearch_bst_L3S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L3S2_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s2bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                        // txt_tm_L3S2_bst.setText(tm);
                        txt_L3S2_BST_mon.setText(mon);
                        txt_L3S2_BST_tue.setText(tue);
                        txt_L3S2_BST_wed.setText(wed);
                        txt_L3S2_BST_thu.setText(thu);
                        txt_L3S2_BST_fri.setText(fri);

                    } else {
                        txt_tm_L3S2_bst.setText("");
                        txt_L3S2_BST_mon.setText("");
                        txt_L3S2_BST_tue.setText("");
                        txt_L3S2_BST_wed.setText("");
                        txt_L3S2_BST_thu.setText("");
                        txt_L3S2_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPDATE BTN FOR L3S2 BST
        btn_Update_l3s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L3S2_bst.getText();
                    mon = txt_L3S2_BST_mon.getText();
                    tue = txt_L3S2_BST_tue.getText();
                    wed = txt_L3S2_BST_wed.getText();
                    thu = txt_L3S2_BST_thu.getText();
                    fri = txt_L3S2_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l3s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl3s2_load();

                    txt_tm_L3S2_bst.setText("");
                    txt_L3S2_BST_mon.setText("");
                    txt_L3S2_BST_tue.setText("");
                    txt_L3S2_BST_wed.setText("");
                    txt_L3S2_BST_thu.setText("");
                    txt_L3S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE ROW DATA FROM L3S2 BST TME TABLE
        btn_Delete_l3s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L3S2_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l3s2bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl3s2_load();

                    txt_tm_L3S2_bst.setText("");
                    txt_L3S2_BST_mon.setText("");
                    txt_L3S2_BST_tue.setText("");
                    txt_L3S2_BST_wed.setText("");
                    txt_L3S2_BST_thu.setText("");
                    txt_L3S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        /* -----------------------------STARTING Maintain TIME TABLE L3S2 ET------------------------------------- */
        //ADD NEW RECORD TO ET L3S2
        btnET_L3S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L3S2_ET.getText();
                mon = txt_L3S2_ET_mon.getText();
                tue = txt_L3S2_ET_tue.getText();
                wed = txt_L3S2_ET_wed.getText();
                thu = txt_L3S2_ET_thu.getText();
                fri = txt_L3S2_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l3s2et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl3s2_load();

                    txt_tm_L3S2_ET.setText("");
                    txt_L3S2_ET_mon.setText("");
                    txt_L3S2_ET_tue.setText("");
                    txt_L3S2_ET_wed.setText("");
                    txt_L3S2_ET_thu.setText("");
                    txt_L3S2_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L3S2 ET TABLE
        btnSearch_et_L3S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L3S2_ET.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s2et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        //txt_tm_L3S2_ET.setText(tm);
                        txt_L3S2_ET_mon.setText(mon);
                        txt_L3S2_ET_tue.setText(tue);
                        txt_L3S2_ET_wed.setText(wed);
                        txt_L3S2_ET_thu.setText(thu);
                        txt_L3S2_ET_fri.setText(fri);

                    } else {
                        txt_tm_L3S2_ET.setText("");
                        txt_L3S2_ET_mon.setText("");
                        txt_L3S2_ET_tue.setText("");
                        txt_L3S2_ET_wed.setText("");
                        txt_L3S2_ET_thu.setText("");
                        txt_L3S2_ET_fri.setText("");

                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L3 S2
        btn_Update_l3s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L3S2_ET.getText();
                    mon = txt_L3S2_ET_mon.getText();
                    tue = txt_L3S2_ET_tue.getText();
                    wed = txt_L3S2_ET_wed.getText();
                    thu = txt_L3S2_ET_thu.getText();
                    fri = txt_L3S2_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l3s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl3s2_load();

                    txt_tm_L3S2_ET.setText("");
                    txt_L3S2_ET_mon.setText("");
                    txt_L3S2_ET_tue.setText("");
                    txt_L3S2_ET_wed.setText("");
                    txt_L3S2_ET_thu.setText("");
                    txt_L3S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L3S2 TABLE
        btn_Delete_l3s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L3S2_ET.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l3s2et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl3s2_load();

                    txt_tm_L3S2_ET.setText("");
                    txt_L3S2_ET_mon.setText("");
                    txt_L3S2_ET_tue.setText("");
                    txt_L3S2_ET_wed.setText("");
                    txt_L3S2_ET_thu.setText("");
                    txt_L3S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        /* -----------------------------STARTING Maintain TIME TABLE L3S2 ICT------------------------------------- */

//DELETE ROW DATA FROM L3S2 ICT TME TABLE
        btn_Delete_l3s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L3S2_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l3s2ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl3s2_load();

                    txt_tm_L3S2_ICT.setText("");
                    txt_L3S2_ICT_mon.setText("");
                    txt_L3S2_ICT_tue.setText("");
                    txt_L3S2_ICT_wed.setText("");
                    txt_L3S2_ICT_thu.setText("");
                    txt_L3S2_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L3S2 TABLE
        btnICT_L3S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L3S2_ICT.getText();
                mon = txt_L3S2_ICT_mon.getText();
                tue = txt_L3S2_ICT_tue.getText();
                wed = txt_L3S2_ICT_wed.getText();
                thu = txt_L3S2_ICT_thu.getText();
                fri = txt_L3S2_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l3s2ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl3s2_load();

                    txt_tm_L3S2_ICT.setText("");
                    txt_L3S2_ICT_mon.setText("");
                    txt_L3S2_ICT_tue.setText("");
                    txt_L3S2_ICT_wed.setText("");
                    txt_L3S2_ICT_thu.setText("");
                    txt_L3S2_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L3 S2 ICT
        btnSearch_ICT_L3S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L3S2_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l3s2ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L3S2_ICT.setText(tm);
                        txt_L3S2_ICT_mon.setText(mon);
                        txt_L3S2_ICT_tue.setText(tue);
                        txt_L3S2_ICT_wed.setText(wed);
                        txt_L3S2_ICT_thu.setText(thu);
                        txt_L3S2_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L3S2_ICT.setText("");
                        txt_L3S2_ICT_mon.setText("");
                        txt_L3S2_ICT_tue.setText("");
                        txt_L3S2_ICT_wed.setText("");
                        txt_L3S2_ICT_thu.setText("");
                        txt_L3S2_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L3S2 ict
        btn_Update_l3s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L3S2_ICT.getText();
                    mon = txt_L3S2_ICT_mon.getText();
                    tue = txt_L3S2_ICT_tue.getText();
                    wed = txt_L3S2_ICT_wed.getText();
                    thu = txt_L3S2_ICT_thu.getText();
                    fri = txt_L3S2_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l3s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl3s2_load();

                    txt_tm_L3S2_ICT.setText("");
                    txt_L3S2_ICT_mon.setText("");
                    txt_L3S2_ICT_tue.setText("");
                    txt_L3S2_ICT_wed.setText("");
                    txt_L3S2_ICT_thu.setText("");
                    txt_L3S2_ICT_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L4S2 BST------------------------------------- */

        //BTN ADD New Row of L4 S2 BST TIME TABLE
        btnBST_L4S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L4S2_bst.getText();
                mon = txt_L4S2_BST_mon.getText();
                tue = txt_L4S2_BST_tue.getText();
                wed = txt_L4S2_BST_wed.getText();
                thu = txt_L4S2_BST_thu.getText();
                fri = txt_L4S2_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l4s2bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl4s2_load();

                    txt_tm_L4S2_bst.setText("");
                    txt_L4S2_BST_mon.setText("");
                    txt_L4S2_BST_tue.setText("");
                    txt_L4S2_BST_wed.setText("");
                    txt_L4S2_BST_thu.setText("");
                    txt_L4S2_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L4 S2 BST
        btnSearch_bst_L4S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L4S2_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s2bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                        // txt_tm_L4S2_bst.setText(tm);
                        txt_L4S2_BST_mon.setText(mon);
                        txt_L4S2_BST_tue.setText(tue);
                        txt_L4S2_BST_wed.setText(wed);
                        txt_L4S2_BST_thu.setText(thu);
                        txt_L4S2_BST_fri.setText(fri);

                    } else {
                        txt_tm_L4S2_bst.setText("");
                        txt_L4S2_BST_mon.setText("");
                        txt_L4S2_BST_tue.setText("");
                        txt_L4S2_BST_wed.setText("");
                        txt_L4S2_BST_thu.setText("");
                        txt_L4S2_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPDATE BTN FOR L4S2 BST
        btn_Update_l4s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L4S2_bst.getText();
                    mon = txt_L4S2_BST_mon.getText();
                    tue = txt_L4S2_BST_tue.getText();
                    wed = txt_L4S2_BST_wed.getText();
                    thu = txt_L4S2_BST_thu.getText();
                    fri = txt_L4S2_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l4s2bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl4s2_load();

                    txt_tm_L4S2_bst.setText("");
                    txt_L4S2_BST_mon.setText("");
                    txt_L4S2_BST_tue.setText("");
                    txt_L4S2_BST_wed.setText("");
                    txt_L4S2_BST_thu.setText("");
                    txt_L4S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE ROW DATA FROM L4S2 BST TME TABLE
        btn_Delete_l4s2_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L4S2_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l4s2bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl4s2_load();

                    txt_tm_L4S2_bst.setText("");
                    txt_L4S2_BST_mon.setText("");
                    txt_L4S2_BST_tue.setText("");
                    txt_L4S2_BST_wed.setText("");
                    txt_L4S2_BST_thu.setText("");
                    txt_L4S2_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L4S1 BST------------------------------------- */

        //BTN ADD New Row of L4 S1 BST TIME TABLE
        btnBST_L4S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L4S1_bst.getText();
                mon = txt_L4S1_BST_mon.getText();
                tue = txt_L4S1_BST_tue.getText();
                wed = txt_L4S1_BST_wed.getText();
                thu = txt_L4S1_BST_thu.getText();
                fri = txt_L4S1_BST_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l4s1bst(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableBSTl4s1_load();

                    txt_tm_L4S1_bst.setText("");
                    txt_L4S1_BST_mon.setText("");
                    txt_L4S1_BST_tue.setText("");
                    txt_L4S1_BST_wed.setText("");
                    txt_L4S1_BST_thu.setText("");
                    txt_L4S1_BST_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L4 S1 BST
        btnSearch_bst_L4S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L4S1_bst.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s1bst where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);

                        // txt_tm_L4S1_bst.setText(tm);
                        txt_L4S1_BST_mon.setText(mon);
                        txt_L4S1_BST_tue.setText(tue);
                        txt_L4S1_BST_wed.setText(wed);
                        txt_L4S1_BST_thu.setText(thu);
                        txt_L4S1_BST_fri.setText(fri);

                    } else {
                        txt_tm_L4S1_bst.setText("");
                        txt_L4S1_BST_mon.setText("");
                        txt_L4S1_BST_tue.setText("");
                        txt_L4S1_BST_wed.setText("");
                        txt_L4S1_BST_thu.setText("");
                        txt_L4S1_BST_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //UPDATE BTN FOR L4S1 BST
        btn_Update_l4s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L4S1_bst.getText();
                    mon = txt_L4S1_BST_mon.getText();
                    tue = txt_L4S1_BST_tue.getText();
                    wed = txt_L4S1_BST_wed.getText();
                    thu = txt_L4S1_BST_thu.getText();
                    fri = txt_L4S1_BST_fri.getText();

                    pst = con.prepareStatement("UPDATE l4s1bst SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableBSTl4s1_load();

                    txt_tm_L4S1_bst.setText("");
                    txt_L4S1_BST_mon.setText("");
                    txt_L4S1_BST_tue.setText("");
                    txt_L4S1_BST_wed.setText("");
                    txt_L4S1_BST_thu.setText("");
                    txt_L4S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE ROW DATA FROM L4S1 BST TME TABLE
        btn_Delete_l4s1_bst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L4S1_bst.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l4s1bst WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From BST Time table");
                    tableBSTl4s1_load();

                    txt_tm_L4S1_bst.setText("");
                    txt_L4S1_BST_mon.setText("");
                    txt_L4S1_BST_tue.setText("");
                    txt_L4S1_BST_wed.setText("");
                    txt_L4S1_BST_thu.setText("");
                    txt_L4S1_BST_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        /* -----------------------------STARTING Maintain TIME TABLE L4S2 ICT------------------------------------- */

//DELETE ROW DATA FROM L4S2 ICT TME TABLE
        btn_Delete_l4s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L4S2_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l4s2ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl4s2_load();

                    txt_tm_L4S2_ICT.setText("");
                    txt_L4S2_ICT_mon.setText("");
                    txt_L4S2_ICT_tue.setText("");
                    txt_L4S2_ICT_wed.setText("");
                    txt_L4S2_ICT_thu.setText("");
                    txt_L4S2_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L4S2 TABLE
        btnICT_L4S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L4S2_ICT.getText();
                mon = txt_L4S2_ICT_mon.getText();
                tue = txt_L4S2_ICT_tue.getText();
                wed = txt_L4S2_ICT_wed.getText();
                thu = txt_L4S2_ICT_thu.getText();
                fri = txt_L4S2_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l4s2ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl4s2_load();

                    txt_tm_L4S2_ICT.setText("");
                    txt_L4S2_ICT_mon.setText("");
                    txt_L4S2_ICT_tue.setText("");
                    txt_L4S2_ICT_wed.setText("");
                    txt_L4S2_ICT_thu.setText("");
                    txt_L4S2_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L4 S2 ICT
        btnSearch_ICT_L4S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L4S2_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s2ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L4S2_ICT.setText(tm);
                        txt_L4S2_ICT_mon.setText(mon);
                        txt_L4S2_ICT_tue.setText(tue);
                        txt_L4S2_ICT_wed.setText(wed);
                        txt_L4S2_ICT_thu.setText(thu);
                        txt_L4S2_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L4S2_ICT.setText("");
                        txt_L4S2_ICT_mon.setText("");
                        txt_L4S2_ICT_tue.setText("");
                        txt_L4S2_ICT_wed.setText("");
                        txt_L4S2_ICT_thu.setText("");
                        txt_L4S2_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L4S2 ict
        btn_Update_l4s2_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L4S2_ICT.getText();
                    mon = txt_L4S2_ICT_mon.getText();
                    tue = txt_L4S2_ICT_tue.getText();
                    wed = txt_L4S2_ICT_wed.getText();
                    thu = txt_L4S2_ICT_thu.getText();
                    fri = txt_L4S2_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l4s2ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl4s2_load();

                    txt_tm_L4S2_ICT.setText("");
                    txt_L4S2_ICT_mon.setText("");
                    txt_L4S2_ICT_tue.setText("");
                    txt_L4S2_ICT_wed.setText("");
                    txt_L4S2_ICT_thu.setText("");
                    txt_L4S2_ICT_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        /* -----------------------------STARTING Maintain TIME TABLE L4S1 ICT------------------------------------- */

//DELETE ROW DATA FROM L4S1 ICT TME TABLE
        btn_Delete_l4s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L4S1_ICT.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l4s1ict WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableICTl4s1_load();

                    txt_tm_L4S1_ICT.setText("");
                    txt_L4S1_ICT_mon.setText("");
                    txt_L4S1_ICT_tue.setText("");
                    txt_L4S1_ICT_wed.setText("");
                    txt_L4S1_ICT_thu.setText("");
                    txt_L4S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //ADD NEW RECORD TO ICT L4S1 TABLE
        btnICT_L4S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L4S1_ICT.getText();
                mon = txt_L4S1_ICT_mon.getText();
                tue = txt_L4S1_ICT_tue.getText();
                wed = txt_L4S1_ICT_wed.getText();
                thu = txt_L4S1_ICT_thu.getText();
                fri = txt_L4S1_ICT_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l4s1ict(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableICTl4s1_load();

                    txt_tm_L4S1_ICT.setText("");
                    txt_L4S1_ICT_mon.setText("");
                    txt_L4S1_ICT_tue.setText("");
                    txt_L4S1_ICT_wed.setText("");
                    txt_L4S1_ICT_thu.setText("");
                    txt_L4S1_ICT_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH FOR L4 S1 ICT
        btnSearch_ICT_L4S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L4S1_ICT.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s1ict where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        // txt_tm_L4S1_ICT.setText(tm);
                        txt_L4S1_ICT_mon.setText(mon);
                        txt_L4S1_ICT_tue.setText(tue);
                        txt_L4S1_ICT_wed.setText(wed);
                        txt_L4S1_ICT_thu.setText(thu);
                        txt_L4S1_ICT_fri.setText(fri);

                    } else {
                        txt_tm_L4S1_ICT.setText("");
                        txt_L4S1_ICT_mon.setText("");
                        txt_L4S1_ICT_tue.setText("");
                        txt_L4S1_ICT_wed.setText("");
                        txt_L4S1_ICT_thu.setText("");
                        txt_L4S1_ICT_fri.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN FOR L4S1 ict
        btn_Update_l4s1_ICT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L4S1_ICT.getText();
                    mon = txt_L4S1_ICT_mon.getText();
                    tue = txt_L4S1_ICT_tue.getText();
                    wed = txt_L4S1_ICT_wed.getText();
                    thu = txt_L4S1_ICT_thu.getText();
                    fri = txt_L4S1_ICT_fri.getText();

                    pst = con.prepareStatement("UPDATE l4s1ict SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableICTl4s1_load();

                    txt_tm_L4S1_ICT.setText("");
                    txt_L4S1_ICT_mon.setText("");
                    txt_L4S1_ICT_tue.setText("");
                    txt_L4S1_ICT_wed.setText("");
                    txt_L4S1_ICT_thu.setText("");
                    txt_L4S1_ICT_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L3S2 ET------------------------------------- */
        //ADD NEW RECORD TO ET L4S2
        btnET_L4S2_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L4S2_ET.getText();
                mon = txt_L4S2_ET_mon.getText();
                tue = txt_L4S2_ET_tue.getText();
                wed = txt_L4S2_ET_wed.getText();
                thu = txt_L4S2_ET_thu.getText();
                fri = txt_L4S2_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l4s2et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl4s2_load();

                    txt_tm_L4S2_ET.setText("");
                    txt_L4S2_ET_mon.setText("");
                    txt_L4S2_ET_tue.setText("");
                    txt_L4S2_ET_wed.setText("");
                    txt_L4S2_ET_thu.setText("");
                    txt_L4S2_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L4S2 ET TABLE
        btnSearch_et_L4S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L4S2_ET.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s2et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        //txt_tm_L4S2_ET.setText(tm);
                        txt_L4S2_ET_mon.setText(mon);
                        txt_L4S2_ET_tue.setText(tue);
                        txt_L4S2_ET_wed.setText(wed);
                        txt_L4S2_ET_thu.setText(thu);
                        txt_L4S2_ET_fri.setText(fri);

                    } else {
                        txt_tm_L4S2_ET.setText("");
                        txt_L4S2_ET_mon.setText("");
                        txt_L4S2_ET_tue.setText("");
                        txt_L4S2_ET_wed.setText("");
                        txt_L4S2_ET_thu.setText("");
                        txt_L4S2_ET_fri.setText("");

                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L4 S2
        btn_Update_l4s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L4S2_ET.getText();
                    mon = txt_L4S2_ET_mon.getText();
                    tue = txt_L4S2_ET_tue.getText();
                    wed = txt_L4S2_ET_wed.getText();
                    thu = txt_L4S2_ET_thu.getText();
                    fri = txt_L4S2_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l4s2et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl4s2_load();

                    txt_tm_L4S2_ET.setText("");
                    txt_L4S2_ET_mon.setText("");
                    txt_L4S2_ET_tue.setText("");
                    txt_L4S2_ET_wed.setText("");
                    txt_L4S2_ET_thu.setText("");
                    txt_L4S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L4S2 TABLE
        btn_Delete_l4s2_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L4S2_ET.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l4s2et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl4s2_load();

                    txt_tm_L4S2_ET.setText("");
                    txt_L4S2_ET_mon.setText("");
                    txt_L4S2_ET_tue.setText("");
                    txt_L4S2_ET_wed.setText("");
                    txt_L4S2_ET_thu.setText("");
                    txt_L4S2_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        /* -----------------------------STARTING Maintain TIME TABLE L4S1 ET------------------------------------- */
        //ADD NEW RECORD TO ET L4S1
        btnET_L4S1_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time,mon, tue, wed, thu, fri;

                time = txt_tm_L4S1_ET.getText();
                mon = txt_L4S2_ET_mon.getText();
                tue = txt_L4S1_ET_tue.getText();
                wed = txt_L4S1_ET_wed.getText();
                thu = txt_L4S1_ET_thu.getText();
                fri = txt_L4S1_ET_fri.getText();

                try {
                    String sql;
                    sql = "INSERT INTO l4s1et(time,mon, tue, wed, thu, fri)" +
                            "VALUES(?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);

                    pst.setString(1, time);
                    pst.setString(2, mon);
                    pst.setString(3, tue);
                    pst.setString(4, wed);
                    pst.setString(5, thu);
                    pst.setString(6, fri);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "New Time and data Added!!!");
                    tableETl4s1_load();

                    txt_tm_L4S1_ET.setText("");
                    txt_L4S1_ET_mon.setText("");
                    txt_L4S1_ET_tue.setText("");
                    txt_L4S1_ET_wed.setText("");
                    txt_L4S1_ET_thu.setText("");
                    txt_L4S1_ET_fri.setText("");

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        //BTN SEARCH L4S1 ET TABLE
        btnSearch_et_L4S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tm = txt_tm_L4S1_ET.getText();
                    pst = con.prepareStatement("SELECT mon, tue, wed, thu, fri from l4s1et where time = ?");
                    pst.setString(1, tm);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {

                        String mon = rs.getString(1);
                        String tue = rs.getString(2);
                        String wed = rs.getString(3);
                        String thu = rs.getString(4);
                        String fri = rs.getString(5);


                        //txt_tm_L4S1_ET.setText(tm);
                        txt_L4S1_ET_mon.setText(mon);
                        txt_L4S1_ET_tue.setText(tue);
                        txt_L4S1_ET_wed.setText(wed);
                        txt_L4S1_ET_thu.setText(thu);
                        txt_L4S1_ET_fri.setText(fri);

                    } else {
                        txt_tm_L4S1_ET.setText("");
                        txt_L4S1_ET_mon.setText("");
                        txt_L4S1_ET_tue.setText("");
                        txt_L4S1_ET_wed.setText("");
                        txt_L4S1_ET_thu.setText("");
                        txt_L4S1_ET_fri.setText("");

                        JOptionPane.showMessageDialog(null, "Invalid Time code");
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //UPDATE BTN ET L4 S1
        btn_Update_l4s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String time, mon, tue, wed, thu, fri;

                    time = txt_tm_L4S1_ET.getText();
                    mon = txt_L4S1_ET_mon.getText();
                    tue = txt_L4S1_ET_tue.getText();
                    wed = txt_L4S1_ET_wed.getText();
                    thu = txt_L4S1_ET_thu.getText();
                    fri = txt_L4S1_ET_fri.getText();

                    pst = con.prepareStatement("UPDATE l4s1et SET mon = ?,tue = ?,wed = ?,thu = ?,fri = ? where time = ?");

                    pst.setString(1, mon);
                    pst.setString(2, tue);
                    pst.setString(3, wed);
                    pst.setString(4, thu);
                    pst.setString(5, fri);
                    pst.setString(6, time);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Time Table Record Updated");
                    tableETl4s1_load();

                    txt_tm_L4S1_ET.setText("");
                    txt_L4S1_ET_mon.setText("");
                    txt_L4S1_ET_tue.setText("");
                    txt_L4S1_ET_wed.setText("");
                    txt_L4S1_ET_thu.setText("");
                    txt_L4S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //DELETE FROM ET L3S1 TABLE
        btn_Delete_l4s1_ET.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String time;
                time = txt_tm_L4S1_ET.getText();

                try {
                    pst = con.prepareStatement("DELETE FROM l4s1et WHERE time = ?");
                    pst.setString(1, time);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted From ICT Time table");
                    tableETl4s1_load();

                    txt_tm_L4S1_ET.setText("");
                    txt_L4S1_ET_mon.setText("");
                    txt_L4S1_ET_tue.setText("");
                    txt_L4S1_ET_wed.setText("");
                    txt_L4S1_ET_thu.setText("");
                    txt_L4S1_ET_fri.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });



    }





    //CON + PST
    Connection con;
    PreparedStatement pst;





    //TABLE UPDATE METHODS
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms-java", "root", "1234");
            System.out.println("DB Connected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void table_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM admin");
            ResultSet rs = pst.executeQuery();
            table3.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void table1_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM student");
            ResultSet rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void table2_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM lecturer");
            ResultSet rs = pst.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void table3_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM technical_officer");
            ResultSet rs = pst.executeQuery();
            table4.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void table4_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM notice");
            ResultSet rs = pst.executeQuery();
            table5.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void table5_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM course");
            ResultSet rs = pst.executeQuery();
            table6.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableBSTl1s1_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM l1s1bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l1s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableICTl1s1_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM l1s1ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l1s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableETl1s1_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM l1s1et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l1s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableBSTl1s2_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM l1s2bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l1s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableICTl1s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l1s2ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l1s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableETl1s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l1s2et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l1s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableBSTl2s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l2s1bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l2s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  void tableICTl2s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l2s1ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l2s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableETl2s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l2s1et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l2s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableETl2s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l2s2et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l2s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableBSTl2s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l2s2bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l2s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableICTl2s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l2s2ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l2s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableBSTl3s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l3s1bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l3s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableBSTl3s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l3s2bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l3s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableICTl3s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l3s1ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l3s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableICTl3s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l3s2ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l3s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableETl3s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l3s1et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l3s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableETl3s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l3s2et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l3s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableBSTl4s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l4s2bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l4s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableBSTl4s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l4s1bst");
            ResultSet rs = pst.executeQuery();
            tbl_bst_l4s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableICTl4s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l4s2ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l4s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableICTl4s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l4s1ict");
            ResultSet rs = pst.executeQuery();
            tbl_ict_l4s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void tableETl4s2_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l4s2et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l4s2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void tableETl4s1_load(){
        try {
            pst = con.prepareStatement("SELECT * FROM l4s1et");
            ResultSet rs = pst.executeQuery();
            tbl_et_l4s1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Notice(){
        try {
            pst = con.prepareStatement("SELECT Notice_no,Ndate,details,description FROM notice");
            ResultSet rs = pst.executeQuery();
            tbl_Notice.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
