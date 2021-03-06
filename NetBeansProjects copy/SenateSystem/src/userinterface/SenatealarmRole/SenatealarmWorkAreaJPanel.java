/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SenatealarmRole;


import userinterface.DietitionRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.SenatealarmOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class SenatealarmWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise HospitalEnterprise;
    private SenatealarmOrganization sAlarmOrganization;
//    private Enterprise enterprise;
    private Network network;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public SenatealarmWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.sAlarmOrganization = (SenatealarmOrganization)organization;
        this.HospitalEnterprise = enterprise;
        network = searchNetwork();
        
        populateTable();
    }
    
    public Network searchNetwork(){
            for(Network network: business.getNetworkList()){
                if(network.getEnterpriseDirectory().getEnterpriseList().contains(HospitalEnterprise))
                    return network;
        }
            return null;
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
//        if(userAccount!=null){
//            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
//        }
        
        
        for(WorkRequest request : sAlarmOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            
            model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        requestHospital = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 560, 270));

        assignJButton.setBackground(new java.awt.Color(255, 255, 255));
        assignJButton.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 220, 50));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        requestHospital.setBackground(new java.awt.Color(255, 255, 255));
        requestHospital.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        requestHospital.setText("Request ");
        requestHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestHospitalActionPerformed(evt);
            }
        });
        add(requestHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SenatealarmRole/500_F_118386919_xzfTiT7e62SNwPI4prWKdDsQrH72Mu9A.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 500, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable(); 
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void requestHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestHospitalActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean existence = true;
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Processed")){
            JOptionPane.showMessageDialog(null, "This Request has been processed!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(network.getEnterpriseDirectory().getEnterpriseList());
//        String suppliername = String.valueOf(ComboBox.getSelectedItem());
        HospitalEnterprise hospitalEnterprise =null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if (enterprise instanceof HospitalEnterprise ){
                hospitalEnterprise = (HospitalEnterprise)enterprise;
                hospitalEnterprise.getWorkQueue().getWorkRequestList().add(request);
//                System.out.println(hospitalEnterprise.getWorkQueue().getWorkRequestList());
                }
            }
       
    }//GEN-LAST:event_requestHospitalActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        //        populateTable();
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();

        model.setRowCount(0);
        //        if(userAccount!=null){
            //            System.out.println(userAccount.getWorkQueue().getWorkRequestList());
            //        }

        for(WorkRequest c : sAlarmOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = c;
            row[1] = c.getSender().getEmployee().getName();
            row[2] = c.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = c.getStatus();

            model.addRow(row);
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton requestHospital;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
