
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
//.....Importing Required Classes.....//
import dao.ConnectionProvider; //To connect with database
import java.sql.Connection;  //To connect database with SQL
import java.sql.PreparedStatement;  //To perform a special type of query to SQL
import java.sql.ResultSet; // To get a database result set according to need
import java.sql.Statement; //To push SQL command using program 
import javax.swing.JOptionPane; //To open an option panel

//.....Creation of the Profile class.....//
public class Profile extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$"; //Setting an email pattern to check is user entered email is in correct format
    public String mobileNumberPattern = "^[0-9]*$"; //Setting an email pattern to check is user entered Mobile number is in correct format
    private String username = ""; //creating a private string to place the username that has been provided while login

    public Profile() {
        initComponents();
        setLocationRelativeTo(null); //...Find in AdminDashboard class.../

    }

    public Profile(String tempUsername) { //...Find in AdminDashboard class.../
        initComponents();  
        username = tempUsername; //...Find in AdminDashboard class.../
        setLocationRelativeTo(null); //...Find in AdminDashboard class.../
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
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
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savebtn.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        txtAddress.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 420, 43));

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 420, 43));

        txtName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 420, 43));

        txtMobileNumber.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 420, 43));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("Mobile No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel1.setText("Welcome,  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        lblUsername.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblUsername.setText("Profile");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 350, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profilebg.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //.....Coding the functionalities of the Save button.....//
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String name = txtName.getText(); //setting the nameField item to the name string
        String mobileNumber = txtMobileNumber.getText(); //setting the mobileNumber item to the mobileNumber string
        String email = txtEmail.getText(); //setting the email item to the email string
        String address = txtAddress.getText(); //setting the address item to the address string
        if (name.equals("")) { //Checking if name field is empty
            JOptionPane.showMessageDialog(null, "Name field is required"); //if empty, then error notification
        } else if (mobileNumber.equals("")) { //Checking if mobileNumber field is empty
            JOptionPane.showMessageDialog(null, "Mobile Number field is required");
        } else if (!mobileNumber.matches(mobileNumberPattern) || mobileNumber.length() != 11) { //Checking if mobileNumber field has the valid values
            JOptionPane.showMessageDialog(null, "Mobile Number field is invaild. Please use a number like 01700000000");
        } else if (email.equals("")) { //Checking if email field is empty
            JOptionPane.showMessageDialog(null, "Email field is required");
        } else if (!email.matches(emailPattern)) { //Checking if email field has the valid values
            JOptionPane.showMessageDialog(null, "Email field is invaild. Please use an email like abc@company.com");
        } else if (address.equals("")) { //Checking if address field is empty
            JOptionPane.showMessageDialog(null, "Address field is required");
        } else {
            try {
                Connection con = ConnectionProvider.getCon(); //...Find in Login class...//
                PreparedStatement ps = con.prepareStatement("update appuser set name=?,mobileNumber=?,email=?,address=? where username=?");
                ps.setString(1, name);
                ps.setString(2, mobileNumber);
                ps.setString(3, email);
                ps.setString(4, address);
                ps.setString(5, username);
                ps.executeUpdate(); //...Find in Login class...//
                JOptionPane.showMessageDialog(null, "Profile updated successfully"); 
                setVisible(false);
                new Profile(username).setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed
    //.....Coding the functionalities of the Close button.....//
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    setVisible(false); //Window is closed
    }//GEN-LAST:event_btnCloseActionPerformed
    //.....Coding the functionalities to do itself when the window is opened.....//
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //...Find in Login class...
        try {
            java.sql.Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from appuser where username = '" + username + "'");
            while (rs.next()) {
                txtName.setText(rs.getString("name"));
                txtMobileNumber.setText(rs.getString("mobileNumber"));
                txtEmail.setText(rs.getString("email"));
                txtAddress.setText(rs.getString("address"));
                lblUsername.setText(rs.getString("username"));
            }
            //....//

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown
    //.....The main method of the Profile Class.....//
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
