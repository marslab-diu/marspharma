
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;

public class AddUser extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    public int checkUsername = 0;

    public AddUser() {
        initComponents();
        iconLevel.setVisible(false);
        setLocationRelativeTo(null);

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
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        comboUserRole = new javax.swing.JComboBox<>();
        dateDOB = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        txtAddress.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 165, 43));

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 164, 43));

        txtName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 164, 43));

        txtMobileNumber.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 165, 43));

        txtPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 165, 43));

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 165, 43));

        comboUserRole.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        comboUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacist" }));
        getContentPane().add(comboUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 164, 43));

        dateDOB.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        getContentPane().add(dateDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 164, 43));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel1.setText("User Role");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel4.setText("Mobile No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel7.setText("DOB (Date of Birth)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        iconLevel.setText("icon");
        iconLevel.setToolTipText("");
        getContentPane().add(iconLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AddUserbg.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        String username = txtUsername.getText();
        if (!username.equals("")) {
            iconLevel.setVisible(true);
            iconLevel.setIcon(new ImageIcon("src\\icons\\yes.png"));
            iconLevel.setText("");
            checkUsername = 0;

            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from appuser where username = '" + username + "'");
                while (rs.next()) {
                    checkUsername = 1;
                    iconLevel.setIcon(new ImageIcon("src\\icons\\no.png"));
                    iconLevel.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else {
            iconLevel.setVisible(false);
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String userRole = (String) comboUserRole.getSelectedItem();
        String name = txtName.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateDOB.getDate();
        String dob = "";
        if (date != null) {
            dob = dFormat.format(dateDOB.getDate());
        }
        String mobileNumber = txtMobileNumber.getText();
        String email = txtEmail.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();

        if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is required");
        } else if (checkUsername == 1) {
            JOptionPane.showMessageDialog(null, "User already exists. Use a different username");
        } else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is required");
        } else if (mobileNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Mobile Number field is required");
        } else if (!mobileNumber.matches(mobileNumberPattern) || mobileNumber.length() != 11) {
            JOptionPane.showMessageDialog(null, "Mobile Number field is invaild. Please use a number like 01700000000");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is required");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Email field is invaild. Please use an email like abc@company.com");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password field is required");
        } else if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Birth field is required");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address field is required");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values(?,?,?,?,?,?,?,?)");
                ps.setString(1, userRole);
                ps.setString(2, name);
                ps.setString(3, dob);
                ps.setString(4, mobileNumber);
                ps.setString(5, email);
                ps.setString(6, username);
                ps.setString(7, password);
                ps.setString(8, address);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User added successfully");
                setVisible(false);
                new AddUser().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboUserRole;
    private com.toedter.calendar.JDateChooser dateDOB;
    private javax.swing.JLabel iconLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
