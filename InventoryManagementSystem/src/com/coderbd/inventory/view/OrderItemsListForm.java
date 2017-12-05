package com.coderbd.inventory.view;

import com.coderbd.inventory.domain.ItemsEligibleForOder;
import com.coderbd.inventory.domain.StockSummary;
import com.coderbd.inventory.service.ItemsEligibleForOderService;
import com.coderbd.inventory.service.StockSummaryService;
import com.coderbd.mobile.common.CommonMenu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rajaul Islam
 */
public final class OrderItemsListForm extends javax.swing.JFrame {

    /**
     * Creates new form StockSummaryForm
     */
    public OrderItemsListForm() {
        initComponents();
          setJMenuBar(CommonMenu.displayMenu(this));
        displayProductDataWithinTable();
    }

    public void displayProductDataWithinTable() {
        List<ItemsEligibleForOder> eligibleOrderList = new ArrayList();

        StockSummaryService productService = new StockSummaryService();
        List<StockSummary> pList = productService.getListForOrdersWhenStockLow(10);
        for (StockSummary s : pList) {
            ItemsEligibleForOder item = new ItemsEligibleForOder(s.getId(), s.getProductName(), s.getProductCode(), s.getPurchaseQty(), s.getSoldQty(), s.getAvilableQty(), 0, "pending");
            eligibleOrderList.add(item);
        }

        DefaultTableModel model = (DefaultTableModel) tblDisplayStockSummary.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < eligibleOrderList.size(); i++) {
            row[0] = eligibleOrderList.get(i).getId();
            row[1] = eligibleOrderList.get(i).getProductName();
            row[2] = eligibleOrderList.get(i).getProductCode();
            row[3] = eligibleOrderList.get(i).getPurchaseQty();
            row[4] = eligibleOrderList.get(i).getSoldQty();
            row[5] = eligibleOrderList.get(i).getAvilableQty();
            row[6] = eligibleOrderList.get(i).getOrderQty();

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayStockSummary = new javax.swing.JTable();
        btnOrderItemsToHR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Eligible Items Summary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        tblDisplayStockSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Item Code", "Qty In", "Qty Out", "Available Qty", "Order Qty"
            }
        ));
        jScrollPane1.setViewportView(tblDisplayStockSummary);

        btnOrderItemsToHR.setText("Order To HR");
        btnOrderItemsToHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderItemsToHRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(btnOrderItemsToHR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrderItemsToHR)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderItemsToHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderItemsToHRActionPerformed
        ItemsEligibleForOderService orderService = new ItemsEligibleForOderService();

        //table 
        DefaultTableModel model = (DefaultTableModel) tblDisplayStockSummary.getModel();
        Vector data = model.getDataVector();
        Set<ItemsEligibleForOder> colData = new HashSet(tblDisplayStockSummary.getRowCount());
 ItemsEligibleForOder is=null;
        for (int i = 0; i < tblDisplayStockSummary.getRowCount(); i++) {
            Vector row = (Vector) data.elementAt(i);
            is = orderService.getItemsEligibleForOderByOrderStatus(Integer.parseInt(row.get(0).toString()), "Pending");
            if (is.getOrderStatus() != null) {
                if (is.getOrderStatus().equals("Pending")) {
                    continue;
                } else {
                    colData.add(new ItemsEligibleForOder(Integer.parseInt(row.get(0).toString()), row.get(1).toString(), row.get(2).toString(), Integer.parseInt(row.get(3).toString()), Integer.parseInt(row.get(4).toString()), Integer.parseInt(row.get(5).toString()), Integer.parseInt(row.get(6).toString()), "Pending"));
                }
            } else {
                colData.add(new ItemsEligibleForOder(Integer.parseInt(row.get(0).toString()), row.get(1).toString(), row.get(2).toString(), Integer.parseInt(row.get(3).toString()), Integer.parseInt(row.get(4).toString()), Integer.parseInt(row.get(5).toString()), Integer.parseInt(row.get(6).toString()), "Pending"));
            }
            ItemsEligibleForOderService itemsservice = new ItemsEligibleForOderService();
            itemsservice.saveList(colData);
        }
    }//GEN-LAST:event_btnOrderItemsToHRActionPerformed

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderItemsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderItemsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderItemsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderItemsListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderItemsListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderItemsToHR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisplayStockSummary;
    // End of variables declaration//GEN-END:variables
}
