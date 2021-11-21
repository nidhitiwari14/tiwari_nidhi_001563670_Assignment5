/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
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
public class ManageRestaurants extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurants
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    UserAccount user;
    
    public ManageRestaurants(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateManageRestaurantTable();
        btnConfirm.setEnabled(false);
    }
    
        private void populateManageRestaurantTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageRest.getModel();
        
        model.setRowCount(0);
        
        for (UserAccount user : business.getUserAccountDirectory().getUserAccountList()) {
            
            for (Restaurant rest:business.getRestaurantDirectory().getRestaurantList()) {
            if ("Business.Role.AdminRole".equals(user.getRole().getClass().getName()) && rest.getAdminUserName().equals(user.getUsername())) {
                Object[] row = new Object[5];
               
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                row[3] = rest.getRestaurantContact();
                row[4] = rest.getRestaurantAddress();
                
                model.addRow(row);
            }
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

        btnUpdate = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblManageCustomerTitle = new javax.swing.JLabel();
        lblRestaurantName = new javax.swing.JLabel();
        lblRestaurantUsername = new javax.swing.JLabel();
        lblRestaurantPassword = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        txtRestaurantUserName = new javax.swing.JTextField();
        txtRestaurantPassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageRest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtRestaurantAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRestaurantContact = new javax.swing.JTextField();

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

        btnDelete.setBackground(new java.awt.Color(204, 51, 0));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
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

        lblManageCustomerTitle.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblManageCustomerTitle.setText("Manage Restaurant Manager");

        lblRestaurantName.setText("Restaurant Name");

        lblRestaurantUsername.setText("Username");

        lblRestaurantPassword.setText("Password");

        btnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblManageRest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant Name", "Username", "Password", "Contact", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblManageRest);

        jLabel1.setText("Restaurant Address");

        jLabel2.setText("Restaurant Contact");

        txtRestaurantContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestaurantContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRestaurantUsername)
                                    .addComponent(lblRestaurantName)
                                    .addComponent(lblRestaurantPassword)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRestaurantName)
                                    .addComponent(txtRestaurantUserName)
                                    .addComponent(txtRestaurantPassword)
                                    .addComponent(txtRestaurantAddress)
                                    .addComponent(txtRestaurantContact, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addGap(17, 17, 17))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblManageCustomerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(16, 16, 16)
                .addComponent(lblManageCustomerTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurantName)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestaurantUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRestaurantPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRestaurantContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblManageRest.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblManageRest.getValueAt(selectRow, 1);
            String pwd= (String) tblManageRest.getValueAt(selectRow, 2);
            user=business.getUserAccountDirectory().authenticateUser(username, pwd);

            txtRestaurantName.setText(user.getName()+"");
            txtRestaurantUserName.setText(user.getUsername()+"");
            txtRestaurantPassword.setText(user.getPassword()+"");

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
        String name = txtRestaurantName.getText();
        String username=txtRestaurantUserName.getText();
        String password=txtRestaurantPassword.getText();

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
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "User Name is invalid");
       
            return;
        }

        if (business.getUserAccountDirectory().checkIfUsernameIsUnique(username)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{

            business.getUserAccountDirectory().updateUserAccount(user,name,username,password);
            populateManageRestaurantTable();
            btnSubmit.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnConfirm.setEnabled(false);
            txtRestaurantName.setText("");
            txtRestaurantUserName.setText("");
            txtRestaurantPassword.setText("");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageRest.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Delete ? ","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblManageRest.getValueAt(selectedRow, 1);
                String pwd= (String) tblManageRest.getValueAt(selectedRow, 2);
                UserAccount user=business.getUserAccountDirectory().authenticateUser(username, pwd);

                business.getUserAccountDirectory().deleteUserAccount(user);
                business.getCustomerDirectory().deleteCustomer(user.getUsername());
                business.getRestaurantDirectory().deleteRestaurant();
                business.getRestaurantDirectory().deleteRestaurant(username);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row to delete!");
        }
        populateManageRestaurantTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtRestaurantName.getText();
        String username=txtRestaurantUserName.getText();
        String password=txtRestaurantPassword.getText();
        String address=txtRestaurantAddress.getText();
        String contact=txtRestaurantContact.getText();
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
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "User Name is invalid");
       
            return;
        }
        
         try {
             
            if(password==null || password.isEmpty()){
                
                throw new NullPointerException("Password cannot be empty");
                
            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                
                throw new Exception("Invalid Password");
            }
            
            
        }  catch(NullPointerException e){
            
             JOptionPane.showMessageDialog(null, "Password is Empty");
             
             return;
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "Password is invalid");
 
             return;
        }
           
        if (business.getUserAccountDirectory().checkIfUsernameIsUnique(username)==false) {
            JOptionPane.showMessageDialog(null,"User Name already exists ");
        }else{
            
        UserAccount ua1 =business.getUserAccountDirectory().createUserAccount(name,username,password,null, new AdminRole());
        Restaurant restro= business.getRestaurantDirectory().createRestaurantInfo(name, username, address, contact);
        populateManageRestaurantTable();
        
        txtRestaurantName.setText("");
        txtRestaurantUserName.setText("");
        txtRestaurantPassword.setText("");
        txtRestaurantAddress.setText("");
        txtRestaurantContact.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtRestaurantContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestaurantContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestaurantContactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageCustomerTitle;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblRestaurantPassword;
    private javax.swing.JLabel lblRestaurantUsername;
    private javax.swing.JTable tblManageRest;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantContact;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtRestaurantPassword;
    private javax.swing.JTextField txtRestaurantUserName;
    // End of variables declaration//GEN-END:variables
}
