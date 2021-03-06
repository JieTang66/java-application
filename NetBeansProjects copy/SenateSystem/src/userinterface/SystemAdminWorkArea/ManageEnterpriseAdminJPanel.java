/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Role.HospitalAdminRole;
import Business.Role.SenateAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount account;
    //private Employee employee;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[45];
                    row[0] = userAccount.getEmployee().getName();
                    row[1] = enterprise.getName();
                    row[2] = network.getName();
                    row[3] = userAccount.getUsername();
                    row[4] = enterprise.getEnterpriseType();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(null);

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Enterprise Name", "Network", "Username", "Type"
            }
        ));
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(39, 58, 530, 120);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Network");
        add(jLabel1);
        jLabel1.setBounds(88, 202, 110, 20);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(210, 200, 136, 27);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Username");
        add(jLabel2);
        jLabel2.setBounds(89, 306, 100, 20);

        usernameJTextField.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });
        add(usernameJTextField);
        usernameJTextField.setBounds(210, 300, 136, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Enterprise");
        add(jLabel3);
        jLabel3.setBounds(88, 260, 100, 20);

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox);
        enterpriseJComboBox.setBounds(210, 260, 136, 27);

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(420, 460, 130, 50);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Password");
        add(jLabel4);
        jLabel4.setBounds(90, 360, 100, 22);

        nameJTextField.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        add(nameJTextField);
        nameJTextField.setBounds(210, 400, 136, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Name");
        add(jLabel5);
        jLabel5.setBounds(90, 410, 90, 20);

        passwordJPasswordField.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        add(passwordJPasswordField);
        passwordJPasswordField.setBounds(210, 350, 134, 40);

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(50, 460, 120, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/Senate.jpeg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 890, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
        if(username==null||username.equals("")){
            usernameJTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            jLabel2.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "username can not be empty");
            return;
        } 
        if(password==null||password.equals("")){
            passwordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.red));
            jLabel4.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "password can not be empty");
            return;
        } 
        if(name==null||name.equals("")){
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            jLabel5.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "name can not be empty");
            return;
        } 
        
        Boolean isUnique=enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username);
        if(isUnique.equals(false)){
            JOptionPane.showMessageDialog(null, "username has exist,please use another username");
            return;
        }
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
        if(enterprise.getEnterpriseType().equals(EnterpriseType.Senate)){
             account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new SenateAdminRole());//UserAccount
        }
        if(enterprise.getEnterpriseType().equals(EnterpriseType.Hospital)){
             account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
        }
        populateTable();   
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
