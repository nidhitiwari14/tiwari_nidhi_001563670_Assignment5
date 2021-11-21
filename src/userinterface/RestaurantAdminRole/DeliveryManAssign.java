/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import RestaurantOrder.RestaurantOrder;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class DeliveryManAssign extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManAssign
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    RestaurantOrder order;
    EcoSystem business;
    
    public DeliveryManAssign(JPanel userProcessContainer, UserAccount account, RestaurantOrder order, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.business = business;
        initComponents();
        populateOrderDeiveryTable();
    }
    
    private void populateOrderDeiveryTable() {
        jLabel1.setText("Order ID:"+order.getOrderID());
        DefaultTableModel model = (DefaultTableModel) tblDeliveryManAssign.getModel();
        
        model.setRowCount(0);
        
        for(DeliveryMan deliveryManAssign:business.getDeliveryManDirectory().getDeliveryManList()){
               Object[] row = new Object[1];
               
                row[0] = deliveryManAssign; 
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

        lblAssignDeliveryMan = new javax.swing.JLabel();
        btnAssignOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryManAssign = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lblAssignDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblAssignDeliveryMan.setText("Delivery Man Assignation");

        btnAssignOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnAssignOrder.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnAssignOrder.setText("Assign Order");
        btnAssignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignOrderActionPerformed(evt);
            }
        });

        tblDeliveryManAssign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "DeliveryMan Name"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryManAssign);

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel1.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnAssignOrder))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAssignDeliveryMan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssignDeliveryMan)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssignOrder)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryManAssign.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details");
        }
        else
        {

            DeliveryMan deliveryMan  = (DeliveryMan)tblDeliveryManAssign.getValueAt(selectedRow, 0);
            deliveryMan.getOrderList().add(order);
            order.setStatus("Assign to Deliveryman");

            for(Customer cust:business.getCustomerDirectory().getCustomerList()){
                if(order.getCustomerName().equals(cust.getUsername())){
                    for(RestaurantOrder order : cust.getOrderList()){
                        order.setStatus("Assign to Deliveryman");
                    }
                }
            }
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);

        }
    }//GEN-LAST:event_btnAssignOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignDeliveryMan;
    private javax.swing.JTable tblDeliveryManAssign;
    // End of variables declaration//GEN-END:variables
}
