/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem system;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.system = system;
        passwordJTextField.setText("");
        popOrganizationComboBox();
        popData();
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        employeeJComboBox.removeAllItems();
        employeeJComboBox.addItem("Select Option");
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organization organization) {
        roleJComboBox.removeAllItems();
        roleJComboBox.addItem("Select Option");
        for (Role role : organization.getSupportedRole()) {
            roleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                row[0] = ua;
                row[1] = ua.getRole();
                row[2] =organization;
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
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        passwordJTextField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        createUserJButton.setBackground(new java.awt.Color(0, 153, 255));
        createUserJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User Name");

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role", "Organization"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            userJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Employee");

        employeeJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        backjButton1.setBackground(new java.awt.Color(0, 153, 255));
        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Organization");

        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Role");

        roleJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Manage User Accounts");

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        passwordJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(createUserJButton)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton1)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserJButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

      boolean pwdPatternCorrect() {
        Pattern p = Pattern.compile("((?=.*[a-z])(?=.*[0-9])(?=.*[@$*#&])(?=.*[A-Z]).{6,})");
        Matcher m = p.matcher(passwordJTextField.getText());
        return m.matches();
    }
      
    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed

        if (employeeJComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select an employee.");
            return;
        }
        if (roleJComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a role for the user.");
            return;
        }

        if (!nameJTextField.getText().equals("") && !passwordJTextField.getText().equals("")) {
            
            if (!pwdPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            return;
        }

            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : enterprise1.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                            if (nameJTextField.getText().equalsIgnoreCase(userAccount.getUsername())) {
                                JOptionPane.showMessageDialog(null, "Username already exists!");
                                employeeJComboBox.setSelectedIndex(0);
                                roleJComboBox.setSelectedItem(0);
                                nameJTextField.setText("");
                                passwordJTextField.setText("");
                                return;
                            }
                        }
                    }
                }
            }

            String userName = nameJTextField.getText();
            String password = passwordJTextField.getText();
            Organization organization = (Organization) organizationJComboBox.getSelectedItem();
            Employee employee = (Employee) employeeJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();

            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

            popData();
            nameJTextField.setText("");
            passwordJTextField.setText("");
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setForeground(Color.BLACK);

        } else {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = userJTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
               // Organization organization = (Organization) organizationJComboBox.getSelectedItem();
                 Organization organization =  (Organization) userJTable.getValueAt(selectedRow, 2);
                UserAccount userAccount = (UserAccount) userJTable.getValueAt(selectedRow, 0);
                organization.getUserAccountDirectory().deleteUserAccount(userAccount);
                popData();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}