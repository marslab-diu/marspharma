
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
import javax.swing.JOptionPane;

public class AdminDashboard extends javax.swing.JFrame {

    private String username = "";

    public AdminDashboard() {
        initComponents();
    }

    public AdminDashboard(String tempUsername) {
        initComponents();
        username = tempUsername;
        System.out.println(username);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProfile = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnViewUser = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
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
        getContentPane().add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adduserbtn.png"))); // NOI18N
        btnAddUser.setBorder(null);
        btnAddUser.setContentAreaFilled(false);
        btnAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        btnViewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewuserbtn.png"))); // NOI18N
        btnViewUser.setBorder(null);
        btnViewUser.setContentAreaFilled(false);
        btnViewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, -1, -1));

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logoutbtn.png"))); // NOI18N
        btnLogOut.setBorder(null);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        btnUpdateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updateuserbtn.png"))); // NOI18N
        btnUpdateUser.setBorder(null);
        btnUpdateUser.setContentAreaFilled(false);
        btnUpdateUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admindashboardbg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to log out?", "MarsPharma", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        new AddUser().setVisible(true);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed

        new UpdateUser().setVisible(true);
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUserActionPerformed

        new ViewUser(username).setVisible(true);
    }//GEN-LAST:event_btnViewUserActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed

        new Profile(username).setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnViewUser;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
