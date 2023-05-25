
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */

//...Please refer to the AddUser class for the clearificaions of the lines of codes...//
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
    public String numberPatternExtended = "^[0-9]+[.]+[0-9]*$"; //for floating values of price
    public int checkUniqueId = 0;

    public AddMedicine() {
        initComponents();
        iconLevel.setVisible(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtPricePerUnit = new javax.swing.JTextField();
        txtCompany = new javax.swing.JTextField();
        txtBrandName = new javax.swing.JTextField();
        txtGenName = new javax.swing.JTextField();
        txtUniqueId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPricePerUnit1 = new javax.swing.JTextField();
        txtPricePerUnit2 = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        iconLevel = new javax.swing.JLabel();
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

        txtPricePerUnit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 165, 43));

        txtCompany.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 420, 43));

        txtBrandName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 164, 43));

        txtGenName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtGenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 165, 43));

        txtUniqueId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtUniqueId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUniqueIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 400, 43));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Medicine ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Brand Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("Generic Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Company");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setText("Per Unit Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        txtPricePerUnit1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtPricePerUnit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 165, 43));

        txtPricePerUnit2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtPricePerUnit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 165, 43));
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 165, 43));

        iconLevel.setText("icon");
        iconLevel.setToolTipText("");
        getContentPane().add(iconLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addmedicinebg.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUniqueIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUniqueIdKeyReleased
        String uniqueId = txtUniqueId.getText();
        if (!uniqueId.equals("")) {
            iconLevel.setVisible(true);
            iconLevel.setIcon(new ImageIcon("src\\icons\\yes.png"));
            iconLevel.setText("");
            checkUniqueId = 0;

            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from medicine where uniqueId = '" + uniqueId + "'");
                while (rs.next()) {
                    checkUniqueId = 1;
                    iconLevel.setIcon(new ImageIcon("src\\icons\\no.png"));
                    iconLevel.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else {
            iconLevel.setVisible(false);
        }
    }//GEN-LAST:event_txtUniqueIdKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String brandName = txtBrandName.getText();
        String genName = txtGenName.getText();
        String company = txtCompany.getText();
        String uniqueId = txtUniqueId.getText();
        String quantity = txtQuantity.getText();
        String price = txtPricePerUnit.getText();

        if (uniqueId.equals("")) {
            JOptionPane.showMessageDialog(null, "Medicine ID field is required");
        } else if (checkUniqueId == 1) {
            JOptionPane.showMessageDialog(null, "Medicine ID exists. Use a different ID");
        } else if (brandName.equals("")) {
            JOptionPane.showMessageDialog(null, "Brand Name field is required");
        } else if (genName.equals("")) {
            JOptionPane.showMessageDialog(null, "Generic Name field is required");
        } else if (company.equals("")) {
            JOptionPane.showMessageDialog(null, "Company Name field is required");
        } else if (quantity.equals("")) {
            JOptionPane.showMessageDialog(null, "Quantity field is required");
        } else if (!quantity.matches(numberPattern)) {
            JOptionPane.showMessageDialog(null, "Quantity field is invaild. Please use a number.");
        } else if (price.equals("")) {
            JOptionPane.showMessageDialog(null, "Price Per Unit field is required");
        } else if (!price.matches(numberPattern) && !price.matches(numberPatternExtended)) {
            JOptionPane.showMessageDialog(null, "rice Per Unit field is invaild. Please use a number.");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into medicine (uniqueId,brandName,genName,company,quantity,price) values(?,?,?,?,?,?)");
                ps.setString(1, uniqueId);
                ps.setString(2, brandName);
                ps.setString(3, genName);
                ps.setString(4, company);
                ps.setString(5, quantity);
                ps.setString(6, price);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Medicine added successfully");
                setVisible(false);
                new AddMedicine().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel iconLevel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtGenName;
    private javax.swing.JTextField txtPricePerUnit;
    private javax.swing.JTextField txtPricePerUnit1;
    private javax.swing.JTextField txtPricePerUnit2;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUniqueId;
    // End of variables declaration//GEN-END:variables
}
