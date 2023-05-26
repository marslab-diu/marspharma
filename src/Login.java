
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */

//.....Importing Required Classes.....//
import dao.ConnectionProvider; //To connect with database
import java.awt.Desktop; //To assign button opening an URL
import java.net.URL; //To assign button opening an URL
import javax.swing.JOptionPane; //To open an option panel
import java.sql.Connection; //To connect database with SQL
import java.sql.Statement; //To push SQL command using program 
import java.sql.ResultSet; // To get a database result set according to need

//.....Creation of the Login class.....//
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null); //Setting the window to the middle with respect to the desktop aspect ratio
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        helpbtn1 = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 408, 60));

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPassword.setActionCommand("<Not Set>");
        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 408, 60));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contact to the system admin to create, add, or update user");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 408, -1));

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/helpbtn.png"))); // NOI18N
        btnHelp.setBorder(null);
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        helpbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/helpbtn.png"))); // NOI18N
        helpbtn1.setBorder(null);
        getContentPane().add(helpbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/aboutbtn.png"))); // NOI18N
        btnAbout.setBorder(null);
        btnAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exitbtn.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loginbg.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //.....Coding the functionalities of the Login button.....//
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        int ifUserExists = 0; //To check if the user exists or not. 0 means user not exists, 1 means the opposite.
        try {
            Connection con = ConnectionProvider.getCon(); //Calling the getCon() method from the ConnectionProvider class to create a connection object
            Statement st = con.createStatement(); //Creating a statement 
            ResultSet rs = st.executeQuery("select *from appuser where username='" + username + "' and password='" + password + "'"); //SQL Query given to resultSet
            while (rs.next()) { //Keep browsing the database until the provided username is found and password is matched
                ifUserExists = 1; //When the while condition returns true, setting that the user has found
                if (rs.getString("userRole").equals("Admin")) { //if the userRole is admin...
                    setVisible(false); //...then the Login window is closed...
                    new AdminDashboard(username).setVisible(true); //...and the AdminDashboard window is opened
                } else { //if the userRole is not admin, i.e. pharmacist...
                    setVisible(false);//...login window is closed...
                    new PharmacistDashboard(username).setVisible(true);//...PharmacistDashboard is opened
                }
            }
            if (ifUserExists == 0) { //in case username and/or password does not matches with the given criteria...
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password"); //...giving an error notification
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    //.....Coding the functionalities of the Exit button.....//
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to exit this application?", "MarsPharma", JOptionPane.YES_NO_OPTION);
        if (a == 0) { //0 means Yes button is pressed, 1 means No button is pressed
            System.exit(0); //Killing all the processes of the program
        }
    }//GEN-LAST:event_btnExitActionPerformed

    //.....Coding the functionalities of the Help button.....//
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed

        try {
            Desktop.getDesktop().browse(new URL("https://sites.google.com/diu.edu.bd/mars-lab/marspharma/how-to-use").toURI()); //Creating a new URL object and nevigating to that URL of Help webpage
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHelpActionPerformed
    //.....Coding the functionalities of the About button.....//
    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed

        try {
            Desktop.getDesktop().browse(new URL("https://sites.google.com/diu.edu.bd/mars-lab/marspharma").toURI()); //Creating a new URL object and nevigating to that URL of About webpage
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAboutActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed
    
    //.....The main method of the Login Class.....//
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton helpbtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
