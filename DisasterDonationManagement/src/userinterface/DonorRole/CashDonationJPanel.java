/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.HumanResource;
import Business.Organization.Organization;
import Business.Requirement.Requirement;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CashDonationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Eshanee Thakur
 */
public class CashDonationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EnterpriseDirectory directory;
    private Requirement requirement;

    /**
     * Creates new form CashDonationJPanel
     */
    public CashDonationJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EnterpriseDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.directory = directory;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDonorName = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtMessage = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCashDonation = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Donor Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Location:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Amount (in $):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Message:");

        txtDonorName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("MAKE A DIFFERENCE!");

        btnCashDonation.setBackground(new java.awt.Color(0, 153, 255));
        btnCashDonation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCashDonation.setForeground(new java.awt.Color(255, 255, 255));
        btnCashDonation.setText("DONATE");
        btnCashDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashDonationActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(120, 120, 120)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnCashDonation)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnCashDonation)
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DonorWorkAreaJPanel dwjp = (DonorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnCashDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashDonationActionPerformed
        String validationMsg = "";
        if (txtDonorName.getText() == null || txtDonorName.getText().isEmpty() || txtDonorName.getText().trim().isEmpty()) {
            validationMsg = "Donor name can't be empty.\n";
            txtDonorName.setText("");
        }

        if (txtAmount.getText() == null || txtAmount.getText().isEmpty() || txtAmount.getText().trim().isEmpty()) {
            validationMsg += "Amount can't be empty.\n";
            txtAmount.setText("");
        } else {
            try {
                Double.parseDouble(txtAmount.getText());
                if (Double.parseDouble(txtAmount.getText()) <= 0) {
                    validationMsg += "Amount should be greater than 0.\n";
                    txtAmount.setText("");
                }
            } catch (NumberFormatException e) {
                validationMsg += "Please enter a valid amount.\n";
                txtAmount.setText("");
            }
        }

        if (!validationMsg.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please review the below error(s):\n" + validationMsg);
            return;
        }

        String donorName = txtDonorName.getText();
        String location = txtLocation.getText();
        double donation = Double.parseDouble(txtAmount.getText());
        String message = txtMessage.getText();

        CashDonationWorkRequest request = new CashDonationWorkRequest();
        request.setDonorName(donorName);
        request.setDonorLocation(location);
        request.setCashDonation(donation);
        request.setDonorMessage(message);
        request.setRequestDate(new Date());
        request.setSender(userAccount);
        request.setStatus("Donation initiated.");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof HumanResource) {
                org = organization;
                break;
            }
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }

        double moneyCollected = enterprise.getRequirementDirectory().getCashDonation();
        enterprise.getRequirementDirectory().setCashDonation(donation + moneyCollected);

        JOptionPane.showMessageDialog(null, "Thank you for your generosity.");
        txtDonorName.setText("");
        txtAmount.setText("");
        txtLocation.setText("");
        txtMessage.setText("");
    }//GEN-LAST:event_btnCashDonationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCashDonation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDonorName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}