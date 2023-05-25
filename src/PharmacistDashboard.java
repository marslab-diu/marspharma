
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
//...Please refer to the AdminDashboard class for the clearifications of the lines of code...//
import javax.swing.JOptionPane;

public class PharmacistDashboard extends javax.swing.JFrame {

    private String username = "";

    public PharmacistDashboard() {
        initComponents();
    }

    public PharmacistDashboard(String tempUsername) {
        initComponents();
        username = tempUsername;
        System.out.println(username);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProfile = new javax.swing.JButton();
        btnAddMedicine = new javax.swing.JButton();
        btnViewMedicine = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnUpdateMedicine = new javax.swing.JButton();
        btnSellMedicine = new javax.swing.JButton();
        btnViewBill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profilebtn.png"))); // NOI18N
        btnProfile.setBorder(null);
        btnProfile.setContentAreaFilled(false);
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        btnAddMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addmedicine.png"))); // NOI18N
        btnAddMedicine.setBorder(null);
        btnAddMedicine.setContentAreaFilled(false);
        btnAddMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        btnViewMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewmedicinebtn.png"))); // NOI18N
        btnViewMedicine.setBorder(null);
        btnViewMedicine.setContentAreaFilled(false);
        btnViewMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logoutbtn.png"))); // NOI18N
        btnLogOut.setBorder(null);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, -1, -1));

        btnUpdateMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updatemedicinebtn.png"))); // NOI18N
        btnUpdateMedicine.setBorder(null);
        btnUpdateMedicine.setContentAreaFilled(false);
        btnUpdateMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 150, -1, -1));

        btnSellMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sellmedicinebtn.png"))); // NOI18N
        btnSellMedicine.setBorder(null);
        btnSellMedicine.setContentAreaFilled(false);
        btnSellMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSellMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(btnSellMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        btnViewBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewbillbtn.png"))); // NOI18N
        btnViewBill.setBorder(null);
        btnViewBill.setContentAreaFilled(false);
        btnViewBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/PharmacistDashboardbg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed

        new AddMedicine().setVisible(true);
    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to log out?", "MarsPharma", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed

        new Profile(username).setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnViewMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedicineActionPerformed

        new ViewMedicine().setVisible(true);
    }//GEN-LAST:event_btnViewMedicineActionPerformed

    private void btnUpdateMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMedicineActionPerformed

        new UpdateMedicine().setVisible(true);
    }//GEN-LAST:event_btnUpdateMedicineActionPerformed

    private void btnSellMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellMedicineActionPerformed

        new SellMedicine(username).setVisible(true);
    }//GEN-LAST:event_btnSellMedicineActionPerformed

    private void btnViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillActionPerformed

        new ViewBill().setVisible(true);
    }//GEN-LAST:event_btnViewBillActionPerformed

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
            java.util.logging.Logger.getLogger(PharmacistDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacistDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacistDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacistDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacistDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnSellMedicine;
    private javax.swing.JButton btnUpdateMedicine;
    private javax.swing.JButton btnViewBill;
    private javax.swing.JButton btnViewMedicine;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
