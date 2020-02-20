/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Client.Client;
import Business.Client.ClientDirectory;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import static Business.Organization.Organization.Type.Client;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AddClient;
import userinterface.ViewClient;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountClientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private ClientDirectory clientD;

    public ManageUserAccountClientJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        clientD = new ClientDirectory();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
        employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
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

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        ViewDetails = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(null);

        createUserJButton.setBackground(new java.awt.Color(255, 255, 255));
        createUserJButton.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton);
        createUserJButton.setBounds(290, 450, 110, 50);

        nameJTextField.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        add(nameJTextField);
        nameJTextField.setBounds(240, 316, 146, 40);

        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setText("User Name");
        add(jLabel1);
        jLabel1.setBounds(120, 330, 120, 20);

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(99, 28, 710, 180);

        jLabel2.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2);
        jLabel2.setBounds(130, 360, 120, 30);

        passwordJTextField.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        add(passwordJTextField);
        passwordJTextField.setBounds(240, 360, 146, 40);

        jLabel3.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel3.setText("Employee");
        add(jLabel3);
        jLabel3.setBounds(470, 240, 94, 24);

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox);
        employeeJComboBox.setBounds(580, 230, 200, 40);

        backjButton1.setBackground(new java.awt.Color(255, 255, 255));
        backjButton1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1);
        backjButton1.setBounds(91, 452, 120, 50);

        jLabel5.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5);
        jLabel5.setBounds(100, 240, 130, 24);

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox);
        organizationJComboBox.setBounds(240, 240, 190, 27);

        jLabel4.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel4.setText("Role");
        add(jLabel4);
        jLabel4.setBounds(180, 280, 80, 30);

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox);
        roleJComboBox.setBounds(240, 280, 190, 27);

        ViewDetails.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetails.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        ViewDetails.setText("View Details");
        ViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsActionPerformed(evt);
            }
        });
        add(ViewDetails);
        ViewDetails.setBounds(500, 450, 260, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/Nursing-homes-carousel-1068x601.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 0, 900, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
        //System.out.println(role);
        
        if(userName==null||userName.equals("")){
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            jLabel1.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "username can not be empty");
            return;
        } 
        if(password==null||password.equals("")){
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.red));
            jLabel2.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "password can not be empty");
            return;
        }
        
        Boolean flag = false;
        Boolean isUnique=organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
        if(isUnique.equals(flag)){
            JOptionPane.showMessageDialog(null, "username has exist,please use another username");
            return;
        }
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        popData();
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void ViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = userJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view details","warning",JOptionPane.WARNING_MESSAGE);

        }
        else {
            UserAccount a = (UserAccount) userJTable.getValueAt(selectedRow, 0);
            System.out.println(a);
            for(Organization o :enterprise.getOrganizationDirectory().getOrganizationList()){
                for(Client e: o.getClientDirectory().getClientList()){
                    System.out.println("+"+e.getClientName());
                    if(a.getEmployee().getName().equals(e.getClientName())){
//                        System.out.println("-"+e.getClientName());
                        ViewClient view = new ViewClient(e);
                        view.setVisible(true);
                        return;
                    }
                }
            }
            
        }
    }//GEN-LAST:event_ViewDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewDetails;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}