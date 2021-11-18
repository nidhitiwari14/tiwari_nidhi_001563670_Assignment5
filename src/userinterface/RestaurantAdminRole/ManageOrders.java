/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import RestaurantOrder.RestaurantOrder;
import RestaurantOrder.RestaurantOrderDirectory;
import RetaurantMenu.RestaurantMenuDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class ManageOrders extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private RestaurantMenuDirectory restaurantMenuDirectory;
    private RestaurantOrderDirectory restaurantOrderDirectory;

    /**
     * Creates new form ManageOrders
     */
    public ManageOrders(
            JPanel userProcessContainer,
            UserAccount account, 
            EcoSystem business
//          ,RestaurantDirectory restaurantDirectory, 
//           RestaurantMenuDirectory restaurantMenuDirectory, 
//           RestaurantOrderDirectory restaurantOrderDirectory
    ) {
        initComponents();
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
//        this.restaurantDirectory = business.getRestaurantDirectory();
        populateTable();
//      populateDeliveryMan();
    }
    
//    public void populateDeliveryMan(){
//     
//        comboBoxDeliveryMan.removeAllItems();
//        comboBoxDeliveryMan.addItem(" ");
//        for(DeliveryMan deliveryMan: business.getDeliveryManDirectory().getDeliveryManList()){
//            comboBoxDeliveryMan.addItem(deliveryMan.getFirstName());
//        
//        }
//    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ManageOrdersTbl.getModel();
        
        model.setRowCount(0);
        
       
        for (Restaurant restro:business.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getAdminUserName().equals(account.getUsername())) {
               for(RestaurantOrder menu:restro.getOrderList()){
                Object[] row = new Object[5];
                row[0] = menu;
                row[1] = menu.getCustomerName();
                row[2] = menu.getDeliveryAddress();
                row[3] = menu.getPrice();
                row[4] = menu.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ManageOrdersTbl = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAcceptOrder = new javax.swing.JButton();
        btnAssignDeliveryMan = new javax.swing.JButton();
        btnRejectOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewFeedback = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFeedback = new javax.swing.JTable();

        ManageOrdersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Customer Name", "Address", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(ManageOrdersTbl);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAcceptOrder.setText("Accept Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        btnAssignDeliveryMan.setText("Assign Delivery Man");
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });

        btnRejectOrder.setText("Reject Order");
        btnRejectOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectOrderActionPerformed(evt);
            }
        });

        jLabel1.setText("View Feedback");

        btnViewFeedback.setText("Click to View Customer Feedback");
        btnViewFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFeedbackActionPerformed(evt);
            }
        });

        tblFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Address", "Price", "Comment"
            }
        ));
        jScrollPane2.setViewportView(tblFeedback);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRefresh)
                                .addGap(26, 26, 26)
                                .addComponent(btnAcceptOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRejectOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAssignDeliveryMan))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnAcceptOrder)
                    .addComponent(btnAssignDeliveryMan)
                    .addComponent(btnRejectOrder))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnViewFeedback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = ManageOrdersTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table");
        }
        else{
            RestaurantOrder order  = (RestaurantOrder)ManageOrdersTbl.getValueAt(selectedRow, 0);
            if(order.getStatus().equals("Ready to Deliver")|| order.getStatus().equals("Order Rejected")){
                JOptionPane.showMessageDialog(null,"Check order status");
            }else{
                ManageOrderDetails viewOrder=new ManageOrderDetails(userProcessContainer,account,order,business);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        // TODO add your handling code here:
        int selectedRow = ManageOrdersTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details");
        }
        else{
            RestaurantOrder order  = (RestaurantOrder)ManageOrdersTbl.getValueAt(selectedRow, 0);
            if(order.getStatus().equals("Assign to Deliveryman")){
                JOptionPane.showMessageDialog(null,"Already Assigned Order");
            }else{
                DeliveryManAssign viewOrder=new DeliveryManAssign(userProcessContainer,account,order,business);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed

    private void btnRejectOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = ManageOrdersTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            RestaurantOrder order  = (RestaurantOrder)ManageOrdersTbl.getValueAt(selectedRow, 0);
            order.setStatus("Reject");           
            populateTable();
        }
    }//GEN-LAST:event_btnRejectOrderActionPerformed

    private void btnViewFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFeedbackActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblFeedback.getModel();
        model.setRowCount(0);
        
        for (Restaurant rest:business.getRestaurantDirectory().getRestaurantList()) {
           
            if (rest.getAdminUserName().equals(account.getUsername())) {
                   
               for (Customer cust:business.getCustomerDirectory().getCustomerList()) {
                       for(RestaurantOrder order:cust.getOrderList()){
                        Object[] row = new Object[5];
//                        row[0] = order;
                        row[0] = order.getCustomerName();
                        row[1] = order.getDeliveryAddress();
                        row[2] = order.getPrice();
                        row[3] = order.getComment();
                        model.addRow(row);
               }
            
        }
            }
        }
                     
//        for (Restaurant restro:business.getRestaurantDirectory().getRestaurantList()) {
//            
//           for (Customer customer:business.getCustomerDirectory().getCustomerList()) {
//             if (restro.getAdminUserName().equals(account.getUsername())) {
//               for(RestaurantOrder menu:customer.getOrderList()){
//                   if (customer.getFirstName().equals(menu.getCustomerName())) {
//                       Object[] row = new Object[5];
//                        row[0] = menu;
//                        row[1] = menu.getCustomerName();
//                        row[2] = menu.getDeliveryAddress();
//                        row[3] = menu.getPrice();
//                        row[4] = menu.getComment();
//                        model.addRow(row);
//                       
//                   }
//               }
//                
//            }
//           }
//            
//        }
    }//GEN-LAST:event_btnViewFeedbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageOrdersTbl;
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRejectOrder;
    private javax.swing.JButton btnViewFeedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFeedback;
    // End of variables declaration//GEN-END:variables
}
