/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class ManageCustomers extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomers
     */
    
    private JPanel userProcessContainer;
    UserAccount user;
    private EcoSystem business;
    
    public ManageCustomers(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateManageCustomerTable();
        btnConfirm.setEnabled(false);
    }
    
    private void populateManageCustomerTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageCust.getModel();
        
        model.setRowCount(0);
        
        for (UserAccount user1 : business.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.CustomerRole".equals(user1.getRole().getClass().getName())) {
                Object[] row = new Object[5];
               
                row[0] = user1.getName();
                row[1] = user1.getUsername();
                row[2] = user1.getPassword();
                row[3] = user1.getContact();
                row[4] = user1.getAddress();
                
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

        lblManageCustomerTitle = new javax.swing.JLabel();
        lblCustomerFirstName = new javax.swing.JLabel();
        lblCustomerUsername = new javax.swing.JLabel();
        lblCustomerPassword = new javax.swing.JLabel();
        txtCustomerFirstName = new javax.swing.JTextField();
        txtCustomerUsername = new javax.swing.JTextField();
        txtCustomerPassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageCust = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblManageCustomerTitle.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblManageCustomerTitle.setText("Manage Customers");

        lblCustomerFirstName.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblCustomerFirstName.setText("Customer Name");

        lblCustomerUsername.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblCustomerUsername.setText("Username");

        lblCustomerPassword.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblCustomerPassword.setText("Password");

        btnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblManageCust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblManageCust);

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(0, 153, 255));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnConfirm.setText("Confirm Update");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 255));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerFirstName)
                            .addComponent(lblCustomerUsername)
                            .addComponent(lblCustomerPassword))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmit)
                            .addComponent(txtCustomerUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(txtCustomerPassword)
                            .addComponent(txtCustomerFirstName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUpdate)
                                    .addGap(33, 33, 33)
                                    .addComponent(btnConfirm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(lblManageCustomerTitle)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblManageCustomerTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCustomerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerFirstName))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerUsername)
                    .addComponent(txtCustomerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerPassword)
                    .addComponent(txtCustomerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnSubmit)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnConfirm)
                    .addComponent(btnDelete))
                .addContainerGap(215, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageCust.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Delete ? ","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblManageCust.getValueAt(selectedRow, 1);
                String pwd= (String) tblManageCust.getValueAt(selectedRow, 2);
                UserAccount user=business.getUserAccountDirectory().authenticateUser(username, pwd);

                business.getUserAccountDirectory().deleteUserAccount(user);
                business.getCustomerDirectory().deleteCustomer(user.getUsername());
               
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row to delete!");
        }
        populateManageCustomerTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblManageCust.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblManageCust.getValueAt(selectRow, 1);
            String pwd= (String) tblManageCust.getValueAt(selectRow, 2);
            user=business.getUserAccountDirectory().authenticateUser(username, pwd);

            txtCustomerFirstName.setText(user.getName()+"");
            txtCustomerUsername.setText(user.getUsername()+"");
            txtCustomerPassword.setText(user.getPassword()+"");

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        btnSubmit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String firstName = txtCustomerFirstName.getText();
        String username=txtCustomerUsername.getText();
        String password=txtCustomerPassword.getText();
        
        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");
              
        try {
             if(firstName==null || firstName.isEmpty()){
                 
                throw new NullPointerException("Name cannot be empty");
                
                
            } else if (pattern.matcher(firstName).find() == false){
                
                throw new Exception("Please enter valid  Name");
                
            }
        } catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null, "Name is empty");
           
            return;
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Name is invalid");
       
            return;
        }
        
        try {
             if(username==null || username.isEmpty()){
                 
                throw new NullPointerException("User Name cannot be empty");
                
                
            } else if (username.length()<3){
                throw new Exception("Please enter valid User Name");
                
            }
        } catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null, "User Name is Empty");
           
            return;
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "User Name is invalid");
       
            return;
        }

            business.getUserAccountDirectory().updateUserAccount(user,firstName,username,password);
//          business.getCustomerDirectory().updateCustomer(cust,firstName,username);
            populateManageCustomerTable();
            btnSubmit.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnConfirm.setEnabled(false);

            txtCustomerFirstName.setText("");
            txtCustomerUsername.setText("");
            txtCustomerPassword.setText("");
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtCustomerFirstName.getText();
        String password=txtCustomerPassword.getText();
        String username=txtCustomerUsername.getText();
        
        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");
              
        try {
             if(name==null || name.isEmpty()){
                 
                throw new NullPointerException("Name cannot be empty");
                
                
            } else if (pattern.matcher(name).find() == false){
                
                throw new Exception("Please enter valid  Name");
                
            }
        } catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null, "Name is empty");
           
            return;
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Name is invalid");
       
            return;
        }
        
        try {
             if(username==null || username.isEmpty()){
                 
                throw new NullPointerException("User Name cannot be empty");
                
                
            } else if (username.length()<3){
                throw new Exception("Please enter valid User Name");
                
            }
        } catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null, "User Name is Empty");
           
            return;
            
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "User Name is invalid");
       
            return;
        }

        if (business.getUserAccountDirectory().checkIfUsernameIsUnique(username)==false) {
            JOptionPane.showMessageDialog(null,"User Name already exists ");
        } else {

            UserAccount ua1 =business.getUserAccountDirectory().createUserAccount(name,username,password, null, new CustomerRole());
            Customer cust= business.getCustomerDirectory().createCustomer(name,username);
            populateManageCustomerTable();
            txtCustomerFirstName.setText("");
            txtCustomerUsername.setText("");
            txtCustomerPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerFirstName;
    private javax.swing.JLabel lblCustomerPassword;
    private javax.swing.JLabel lblCustomerUsername;
    private javax.swing.JLabel lblManageCustomerTitle;
    private javax.swing.JTable tblManageCust;
    private javax.swing.JTextField txtCustomerFirstName;
    private javax.swing.JTextField txtCustomerPassword;
    private javax.swing.JTextField txtCustomerUsername;
    // End of variables declaration//GEN-END:variables
}
