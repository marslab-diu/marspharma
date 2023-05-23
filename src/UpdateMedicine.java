
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
    public int checkMedicineExist = 0;

    public UpdateMedicine() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtCompany = new javax.swing.JTextField();
        txtBrandName = new javax.swing.JTextField();
        txtMedicineId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtGenName = new javax.swing.JTextField();
        txtAddQuantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/closebtn.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savebtn.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        txtQuantity.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 165, 43));

        txtPrice.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 164, 43));

        txtCompany.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 164, 43));

        txtBrandName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 165, 43));

        txtMedicineId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtMedicineId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineIdActionPerformed(evt);
            }
        });
        txtMedicineId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMedicineIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtMedicineId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, 43));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel1.setText("Brand Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Medicine ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Company");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("Generic Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Price Per Unit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        btnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savebtn.png"))); // NOI18N
        btnSave1.setBorder(null);
        btnSave1.setContentAreaFilled(false);
        btnSave1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchbtn.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));

        txtGenName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtGenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 165, 43));

        txtAddQuantity.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtAddQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 165, 43));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel10.setText("Add Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updatemedicinebg.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicineIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicineIdKeyReleased

    }//GEN-LAST:event_txtMedicineIdKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String company = txtCompany.getText();
        String genName = txtGenName.getText();
        String brandName = txtBrandName.getText();
        String price = txtPrice.getText();
        String uniqueId = txtMedicineId.getText();
        String quantity = txtQuantity.getText();
        String addQuantity = txtAddQuantity.getText();
        int totalQuantity = 0;
        if (addQuantity.equals("")) {
            totalQuantity = Integer.parseInt(quantity);
        } else {
            totalQuantity = Integer.parseInt(quantity) + Integer.parseInt(addQuantity);
        }

        if (uniqueId.equals("")) {
            JOptionPane.showMessageDialog(null, "Medicine ID field is required");
        } else if (brandName.equals("")) {
            JOptionPane.showMessageDialog(null, "Brand Name field is required");
        } else if (genName.equals("")) {
            JOptionPane.showMessageDialog(null, "Generic Name field is required");
        } else if (company.equals("")) {
            JOptionPane.showMessageDialog(null, "Company field is required");
        } else if (price.equals("")) {
            JOptionPane.showMessageDialog(null, "Price Per Unit field is required");
        } else if (!price.matches(numberPattern)) {
            JOptionPane.showMessageDialog(null, "Price Per Unit field is invaild. Please use a number");
        } else if (quantity.equals("")) {
            JOptionPane.showMessageDialog(null, "Quantity field is required");
        } else if (!quantity.matches(numberPattern)) {
            JOptionPane.showMessageDialog(null, "Quantity field is invaild. Please use a number");
        } else if (!addQuantity.matches(numberPattern)) {
            JOptionPane.showMessageDialog(null, "Add Quantity field is invaild. Please use a number");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update medicine set brandName=?,genName=?,company=?,quantity=?,price=? where uniqueId=?");
                ps.setString(1, brandName);
                ps.setString(2, genName);
                ps.setString(3, company);
                ps.setInt(4, totalQuantity);
                ps.setString(5, price);
                ps.setInt(6, Integer.parseInt(uniqueId));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Medicine Updated successfully");
                setVisible(false);
                new UpdateMedicine().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String uniqueId = txtMedicineId.getText();
        if (uniqueId.equals("")) {
            JOptionPane.showMessageDialog(null, "Medicine ID is required");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from medicine where uniqueId = '" + uniqueId + "'");
                while (rs.next()) {
                    txtMedicineId.setEditable(false);
                    checkMedicineExist = 1;
                    txtCompany.setText(rs.getString("company"));
                    txtGenName.setText(rs.getString("genName"));
                    txtBrandName.setText(rs.getString("brandName"));
                    txtPrice.setText(rs.getString("price"));
                    txtQuantity.setText(rs.getString("quantity"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if (checkMedicineExist == 0) {
                JOptionPane.showMessageDialog(null, "Medicine does not exist");
            }
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtMedicineIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineIdActionPerformed
    }//GEN-LAST:event_txtMedicineIdActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddQuantity;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtGenName;
    private javax.swing.JTextField txtMedicineId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
