/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.dior.admin;

import Business.Conference.Conference;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.DiorAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmployeeAttendance;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author too
 */

    

public class ManageConference extends javax.swing.JPanel {

    /**
     * Creates new form ManageConference
     */
    private JPanel userProcessContainer;
    private BeautyEnterprise beautyenterprise;
    private UserAccount account;
    private DiorAdminOrganization organization;
    private EcoSystem business;
    public ManageConference(JPanel userProcessContainer, UserAccount account, DiorAdminOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        beautyenterprise = (BeautyEnterprise)enterprise;
        this.account = account;
        this.business = business;
        this.organization = (DiorAdminOrganization)organization;
        populateUpdateTable();
    }
    
    public void populateUpdateTable(){
        DefaultTableModel model = (DefaultTableModel) ManageTable.getModel();
        model.setRowCount(0);
                for(WorkRequest r: account.getWorkQueue().getWorkRequestList()){
                    if(r instanceof EmployeeAttendance && ((EmployeeAttendance)r).getConferencestatues().equals("Upcoming")){
                        Object[] row = new Object[5];
                        row[0] = ((EmployeeAttendance)r);
                        row[1] = ((EmployeeAttendance)r).getCname();
                        row[2] = ((EmployeeAttendance)r).getClocation();
                        row[3] = ((EmployeeAttendance)r).getCdate();
                        row[4] = ((EmployeeAttendance)r).getConferencestatues();
                        model.addRow(row);
                    }
                    }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ManageTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        ManageTable.setBackground(new java.awt.Color(255, 255, 204));
        ManageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Location", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ManageTable);
        if (ManageTable.getColumnModel().getColumnCount() > 0) {
            ManageTable.getColumnModel().getColumn(0).setResizable(false);
            ManageTable.getColumnModel().getColumn(1).setResizable(false);
            ManageTable.getColumnModel().getColumn(2).setResizable(false);
            ManageTable.getColumnModel().getColumn(3).setResizable(false);
            ManageTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setText("Cancle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("Conference Management");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Posted Conference List:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1070, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel5)
                .addGap(90, 90, 90)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(67, 67, 67)
                .addComponent(jButton3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = ManageTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        EmployeeAttendance  employeeattendance = (EmployeeAttendance)ManageTable.getValueAt(row, 0);
        for(Organization org:beautyenterprise.getOrganizationDirectory().getOrganizationList()){
            for(Employee e : org.getEmployeeDirectory().getEmployeeList()){
                for(WorkRequest r: e.getWorkqueue().getWorkRequestList()){
                    if(((EmployeeAttendance)r).getConferenceId() == employeeattendance.getConferenceId()){
                        ((EmployeeAttendance)r).setConferencestatues("Canceled");
                }
                }
            }
        }
        employeeattendance.setConferencestatues("Canceled");
        for(Conference c: beautyenterprise.getConferenceDir().getConferencelist()){
            if(c.getID() == employeeattendance.getConferenceId()){
                beautyenterprise.getConferenceDir().removeConference(c);
                break;
            }
        }
                 
       populateUpdateTable();
        JOptionPane.showMessageDialog(null, "Conference Cancel Successfully"); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
