/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softidea.ayolan.public_access.user.login;

import static com.softidea.ayolan.public_access.user.login.User_main.main;
import com.softidea.www.public_access.DB.MC_JavaDataBaseConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;

/**
 *
 * @author dinet
 */
public class customer_registration3 extends javax.swing.JPanel {

    /**
     * Creates new form customer_registration3
     */
    public static String bankAcountType, bankAcountName, bankAcountBranch, bankAcountFacility, bankAcountNumber, paybleLoan, permenentLocationDetails;
    public static int Cus_id;

    public customer_registration3() {
        initComponents();
        jr_pg3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page_change = new javax.swing.ButtonGroup();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_banck_account_type = new javax.swing.JTextField();
        tf_banck_account_bank_name = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_banck_account_bank_branch = new javax.swing.JTextField();
        tf_banck_account_number = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf_banck_account_facilites = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_payble_loan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_permenent_location_details = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jr_pg3 = new javax.swing.JRadioButton();
        jr_pg2 = new javax.swing.JRadioButton();
        jr_pg1 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 77, 64));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("07.Bank Account ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Type");

        tf_banck_account_type.setMaximumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_type.setMinimumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_type.setPreferredSize(new java.awt.Dimension(300, 30));

        tf_banck_account_bank_name.setMaximumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_bank_name.setMinimumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_bank_name.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Bank Name");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Bank Branch");

        tf_banck_account_bank_branch.setMaximumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_bank_branch.setMinimumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_bank_branch.setPreferredSize(new java.awt.Dimension(300, 30));

        tf_banck_account_number.setMaximumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_number.setMinimumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_number.setName(""); // NOI18N
        tf_banck_account_number.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Bank Account Number");

        tf_banck_account_facilites.setMaximumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_facilites.setMinimumSize(new java.awt.Dimension(300, 30));
        tf_banck_account_facilites.setPreferredSize(new java.awt.Dimension(300, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Bank Name", "Bank Branch", "Bank Acount Facilites", "Bank Account Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Bank Account Facilities");

        jButton1.setText("Clear");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("07. Payable Loan");

        tf_payble_loan.setMaximumSize(new java.awt.Dimension(300, 30));
        tf_payble_loan.setMinimumSize(new java.awt.Dimension(300, 30));
        tf_payble_loan.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("08.Enough Detail For Find Permenent location ");

        ta_permenent_location_details.setColumns(20);
        ta_permenent_location_details.setRows(5);
        jScrollPane1.setViewportView(ta_permenent_location_details);

        jButton2.setText("Submit");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        page_change.add(jr_pg3);
        jr_pg3.setToolTipText("3");
        jr_pg3.setContentAreaFilled(false);
        jr_pg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_pg3ActionPerformed(evt);
            }
        });

        page_change.add(jr_pg2);
        jr_pg2.setToolTipText("2");
        jr_pg2.setContentAreaFilled(false);
        jr_pg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_pg2ActionPerformed(evt);
            }
        });

        page_change.add(jr_pg1);
        jr_pg1.setToolTipText("1");
        jr_pg1.setContentAreaFilled(false);
        jr_pg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_pg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_banck_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_banck_account_bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(tf_banck_account_bank_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_banck_account_facilites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addComponent(tf_banck_account_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1322, Short.MAX_VALUE)
                    .addComponent(tf_payble_loan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jr_pg1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jr_pg2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jr_pg3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22))
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_banck_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_banck_account_bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_banck_account_bank_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_banck_account_facilites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_banck_account_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_payble_loan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jr_pg3)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jr_pg2)
                            .addComponent(jr_pg1))
                        .addGap(32, 32, 32))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jr_pg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr_pg1ActionPerformed

        bankAcountType = tf_banck_account_type.getText();
        bankAcountName = tf_banck_account_bank_name.getText();
        bankAcountBranch = tf_banck_account_bank_branch.getText();
        bankAcountFacility = tf_banck_account_facilites.getText();
        bankAcountNumber = tf_banck_account_number.getText();
        paybleLoan = tf_payble_loan.getText();
        permenentLocationDetails = ta_permenent_location_details.getText();

        customer_registration cus_registration = new customer_registration();

        main.removeAll();
        GroupLayout layout = new GroupLayout(main);
        main.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cus_registration, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cus_registration, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        System.gc();

    }//GEN-LAST:event_jr_pg1ActionPerformed

    private void jr_pg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr_pg2ActionPerformed

        bankAcountType = tf_banck_account_type.getText();
        bankAcountName = tf_banck_account_bank_name.getText();
        bankAcountBranch = tf_banck_account_bank_branch.getText();
        bankAcountFacility = tf_banck_account_facilites.getText();
        bankAcountNumber = tf_banck_account_number.getText();
        paybleLoan = tf_payble_loan.getText();
        permenentLocationDetails = ta_permenent_location_details.getText();

        customer_registration2 cus_registration2 = new customer_registration2();

        main.removeAll();
        GroupLayout layout = new GroupLayout(main);
        main.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cus_registration2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cus_registration2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        System.gc();

    }//GEN-LAST:event_jr_pg2ActionPerformed

    private void jr_pg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr_pg3ActionPerformed

        customer_registration3 cus_registration3 = new customer_registration3();

        main.removeAll();
        GroupLayout layout = new GroupLayout(main);
        main.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cus_registration3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cus_registration3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        System.gc();

    }//GEN-LAST:event_jr_pg3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        bankAcountType = tf_banck_account_type.getText();
        bankAcountName = tf_banck_account_bank_name.getText();
        bankAcountBranch = tf_banck_account_bank_branch.getText();
        bankAcountFacility = tf_banck_account_facilites.getText();
        bankAcountNumber = tf_banck_account_number.getText();
        paybleLoan = tf_payble_loan.getText();
        permenentLocationDetails = ta_permenent_location_details.getText();

        Cus_id = 0;

        try {
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("insert into customer_name (customer_id,customer_full_name,customer_name_initials_with_name)value('" + Cus_id + "','" + customer_registration.cus_fullName + "','" + customer_registration.cus_fullNameWithInitials + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `about_loan` (customer_id,`about_loan_details`,`about_loan_duration`,`about_loan_full_payment`)VALUE('" + Cus_id + "','" + customer_registration2.aboutLoan.trim() + "','" + customer_registration2.loanDuration + "','" + paybleLoan + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `bank account` (`customer_id`,`bank account_type`,`bank account_bank_name`,`bank account_bank_branch`,`bank account_facilites`,`bank account_number`)VALUE('" + Cus_id + "','" + bankAcountType + "','" + bankAcountName + "','" + bankAcountBranch + "','" + bankAcountFacility + "','" + bankAcountNumber + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `customer_address` (`customer_id`,`customer_address`)VALUE('" + Cus_id + "','" + customer_registration.cus_address + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `customer_contact` (`customer_id`,`customer_contact_mobail`)VALUE('" + Cus_id + "','" + customer_registration.cus_phoneNumber + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `customer_wife_name` (`customer_id`,`customer_full_name`)VALUE('" + Cus_id + "','" + customer_registration2.cusBeterHalfFullName + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `customer_personal` (`customer_id`,`customer_personal_dob`,`customer_personal_nic`,`customer_personal_maritial_status`,`customer_personal_any_dependences`,`customer_personal_job_or_position`,`customer_personal_salerry`,`customer_personal_employer_name`,`customer_personal_employer_address`,`customer_personal_road_near_to_home`)VALUE('" + Cus_id + "','" + customer_registration.cus_dob + "','" + customer_registration.cus_nic + "','" + customer_registration.cus_maritialStatus + "','" + customer_registration.cus_anyDependency + "','" + customer_registration.cus_position + "','" + customer_registration.cus_salary + "','" + customer_registration.cus_employerName + "','" + customer_registration.cus_employerAddress + "','" + customer_registration3.permenentLocationDetails + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `customer_Wife_personal` (`customer_id`,`customer_Wife_personal_dob`,`customer_Wife_personal_job_or_position`)VALUE('" + Cus_id + "','" + customer_registration2.cusBeterHalfdob + "','" + customer_registration2.cusBeterHalfposition + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `gerenter_address` (`customer_id`,`gerenter_address`)VALUE('" + Cus_id + "','" + customer_registration.guren_address + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `gerenter_contact` (`customer_id`,`gerenter_contact_mobail`)VALUE('" + Cus_id + "','" + customer_registration.guren_phoneNumber + "')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `gerenter_name` (`customer_id`,`gerenter_name_full`)VALUE('"+Cus_id+"','"+customer_registration.guren_fullName+"')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `gerenter_personal` (`customer_id`,`gerenter_personal_dob`,`gerenter_personal_any_dependences`,`gerenter_personal_employer_address`,`gerenter_personal_employer_name`,`gerenter_personal_job_or_position`,`gerenter_personal_maritial_status`,`gerenter_personal_nic`,`gerenter_personal_salerry`)VALUE('"+Cus_id+"','"+customer_registration.guren_dob+"','"+customer_registration.guren_anyDependency+"','"+customer_registration.guren_employerAddress+"','"+customer_registration.cus_employerName+"','"+customer_registration.guren_position+"','"+customer_registration.guren_maritialStatus+"','"+customer_registration.guren_nic+"','"+customer_registration.guren_salary+"')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `gerenter_wife_name` (`customer_id`,`customer_name_full`)VALUE('"+Cus_id+"','"+customer_registration2.gerenBeterHalfFullName+"')");
            MC_JavaDataBaseConnection.myConnection().createStatement().executeUpdate("INSERT INTO `gerenter_Wife_personal` (`customer_id`,`customer_Wife_personal_dob`,`customer_Wife_personal_job_or_position`)VALUE('"+Cus_id+"','"+customer_registration2.gerenBeterHalfdob+"','"+customer_registration2.gerenBeterHalfposition+"')");
            

        } catch (SQLException ex) {
            Logger.getLogger(customer_registration3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jr_pg1;
    private javax.swing.JRadioButton jr_pg2;
    private javax.swing.JRadioButton jr_pg3;
    private javax.swing.ButtonGroup page_change;
    private javax.swing.JTextArea ta_permenent_location_details;
    private javax.swing.JTextField tf_banck_account_bank_branch;
    private javax.swing.JTextField tf_banck_account_bank_name;
    private javax.swing.JTextField tf_banck_account_facilites;
    private javax.swing.JTextField tf_banck_account_number;
    private javax.swing.JTextField tf_banck_account_type;
    private javax.swing.JTextField tf_payble_loan;
    // End of variables declaration//GEN-END:variables
}
