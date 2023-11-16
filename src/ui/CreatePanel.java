/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.User;
import util.DatabaseConnector;

/**
 *
 * @author bellarao
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    public CreatePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userFormPanel = new javax.swing.JPanel();
        userFormTitle = new javax.swing.JLabel();
        nameTitle = new javax.swing.JLabel();
        ageTitle = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        userFormTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        userFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userFormTitle.setText("User Form");

        nameTitle.setText("Name:");

        ageTitle.setText("Age:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userFormPanelLayout = new javax.swing.GroupLayout(userFormPanel);
        userFormPanel.setLayout(userFormPanelLayout);
        userFormPanelLayout.setHorizontalGroup(
            userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormPanelLayout.createSequentialGroup()
                .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userFormPanelLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(userFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userFormPanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTitle))
                        .addGap(116, 116, 116)
                        .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(ageTextField)))
                    .addGroup(userFormPanelLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        userFormPanelLayout.setVerticalGroup(
            userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(userFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTitle)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTitle)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(144, 144, 144))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        try {
            newUser.setAge(Integer.parseInt(ageTextField.getText()));
            newUser.setName(nameTextField.getText());
            //insert into db
            DatabaseConnector.addUser(newUser);
            JOptionPane.showMessageDialog(null, "User Registered Successfully","Submitted",JOptionPane.INFORMATION_MESSAGE);
            
            //cleanup();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed
   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel ageTitle;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameTitle;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel userFormPanel;
    private javax.swing.JLabel userFormTitle;
    // End of variables declaration//GEN-END:variables
}
