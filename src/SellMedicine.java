
/**
 * @author Minhazul Abedin
 *         ID: 221-15-4919
 */
//...Importing the required classes...//
import com.itextpdf.text.Paragraph; //To create a paragraph in the invoice pdf
import com.itextpdf.text.pdf.PdfWriter; //To create a pdf
import com.itextpdf.text.pdf.PdfPTable; //To create a table in the invoice pdf
import common.OpenPdf; //To open a pdf
import javax.swing.table.DefaultTableModel; //To create a table
import dao.ConnectionProvider; //To connect with the database
import dao.PharmacyUtils; //To save the pdf in the diskdrive
import java.io.FileOutputStream; //To open a file
import java.sql.PreparedStatement; //To perform some special queries on the SQL
import java.sql.*; 
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.TableModel;
import java.util.Calendar;

//...Creation of the SellMedicine Class...//
public class SellMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$"; //Setting number pattern to check if the user entered a numbered value or not
    public String numberPatternExtended = "^[0-9]+[.]+[0-9]*$"; //for floating values of price
    private float finalTotalPrice = 0; //Setting the final total price value to 0
    private String billId = "";
    private String username = "";

    public SellMedicine() {
        initComponents();
    }

    public SellMedicine(String tempUsername) {
        initComponents();
        username = tempUsername;
        setLocationRelativeTo(null);
    }

    private void medicineName(String nameOrUniqueId) {
        DefaultTableModel model = (DefaultTableModel) tblMedicines.getModel();
        model.setRowCount(0);
        try {
            java.sql.Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery("select *from medicine where brandName like '" + nameOrUniqueId + "%' or uniqueId like '" + nameOrUniqueId + "%'");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("uniqueId") + "- " + rs.getString("brandName")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void clearMedicineFields() {
        txtUniqueId.setText("");
        txtBrandName.setText("");
        txtGenName.setText("");
        txtCompany.setText("");
        txtPricePerUnit.setText("");
        txtAvailableUnits.setText("");
        txtNoOfUnits.setText("");
        txtTotalPrice.setText("");
    }

    public String getUniqueId(String prefix) {
        return prefix + System.nanoTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoOfUnits = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPricePerUnit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAvailableUnits = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUniqueId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGenName = new javax.swing.JTextField();
        btnDiscard = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicines = new javax.swing.JTable();
        btnCart = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblFinalTotalPrice = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel2.setText("Medicines");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel3.setText("Medicine ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        tblCart.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Brand Name", "Company", "Price Per Unit", "No. of Unit", "Total Price"
            }
        ));
        tblCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCart);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 750, 230));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel4.setText("Search");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        txtCompany.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyActionPerformed(evt);
            }
        });
        getContentPane().add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 230, 40));

        txtSearch.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 360, 54));

        txtTotalPrice.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 220, 40));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel5.setText("Brand Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, -1, -1));

        txtNoOfUnits.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtNoOfUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfUnitsActionPerformed(evt);
            }
        });
        txtNoOfUnits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoOfUnitsKeyReleased(evt);
            }
        });
        getContentPane().add(txtNoOfUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 230, 40));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel6.setText("Generic Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 150, -1, -1));

        txtPricePerUnit.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtPricePerUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricePerUnitActionPerformed(evt);
            }
        });
        getContentPane().add(txtPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 220, 40));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel7.setText("Company");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        txtAvailableUnits.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtAvailableUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailableUnitsActionPerformed(evt);
            }
        });
        getContentPane().add(txtAvailableUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 220, 40));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel8.setText("Price Per Unit");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, -1, -1));

        txtUniqueId.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtUniqueId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 230, 40));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel9.setText("Available Units");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 240, -1, -1));

        txtBrandName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 220, 40));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel10.setText("No. of Units");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel11.setText("Total Price");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        txtGenName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtGenName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtGenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 180, 220, 40));

        btnDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/discardbtn.png"))); // NOI18N
        btnDiscard.setText("jButton1");
        btnDiscard.setBorder(null);
        btnDiscard.setContentAreaFilled(false);
        btnDiscard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 227, -1));

        tblMedicines.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tblMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicinesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedicines);
        if (tblMedicines.getColumnModel().getColumnCount() > 0) {
            tblMedicines.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 360, 420));

        btnCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addtocartbtn.png"))); // NOI18N
        btnCart.setText("jButton1");
        btnCart.setBorder(null);
        btnCart.setContentAreaFilled(false);
        btnCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 360, 227, -1));

        btnPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchasebtn.png"))); // NOI18N
        btnPurchase.setText("jButton1");
        btnPurchase.setBorder(null);
        btnPurchase.setContentAreaFilled(false);
        btnPurchase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 670, 227, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        jLabel13.setText("Company");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        lblFinalTotalPrice.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lblFinalTotalPrice.setText("00");
        getContentPane().add(lblFinalTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 670, -1, -1));

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel15.setText("BDT:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sellmadicinebg.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyActionPerformed

    }//GEN-LAST:event_txtCompanyActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed

    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void txtNoOfUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfUnitsActionPerformed

    }//GEN-LAST:event_txtNoOfUnitsActionPerformed

    private void txtPricePerUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricePerUnitActionPerformed

    }//GEN-LAST:event_txtPricePerUnitActionPerformed

    private void txtAvailableUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailableUnitsActionPerformed

    }//GEN-LAST:event_txtAvailableUnitsActionPerformed

    private void txtUniqueIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIdActionPerformed

    }//GEN-LAST:event_txtUniqueIdActionPerformed

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtGenNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenNameActionPerformed
    }//GEN-LAST:event_txtGenNameActionPerformed

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnDiscardActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        medicineName("");
        txtUniqueId.setEditable(false);
        txtBrandName.setEditable(false);
        txtGenName.setEditable(false);
        txtCompany.setEditable(false);
        txtPricePerUnit.setEditable(false);
        txtAvailableUnits.setEditable(false);
        txtTotalPrice.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String search = txtSearch.getText();
        medicineName(search);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinesMouseClicked
        int index = tblMedicines.getSelectedRow();
        TableModel model = tblMedicines.getModel();
        String nameOrUniqueId = model.getValueAt(index, 0).toString();

        String uniqueId[] = nameOrUniqueId.split("-", 0);
        try {
            java.sql.Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery("select *from medicine where uniqueId = " + uniqueId[0] + "");
            while (rs.next()) {
                txtUniqueId.setText(uniqueId[0]);
                txtBrandName.setText(rs.getString("brandName"));
                txtGenName.setText(rs.getString("genName"));
                txtCompany.setText(rs.getString("company"));
                txtPricePerUnit.setText(rs.getString("price"));
                txtAvailableUnits.setText(rs.getString("quantity"));
                txtNoOfUnits.setText("");
                txtTotalPrice.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblMedicinesMouseClicked

    private void txtNoOfUnitsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoOfUnitsKeyReleased
        // TODO add your handling code here:
        String noOfUnits = txtNoOfUnits.getText();
        if (!noOfUnits.equals("")) {
            String price = txtPricePerUnit.getText();
            if (!noOfUnits.matches(numberPattern)) {
                JOptionPane.showMessageDialog(null, "Number of Unit field is invalid");

            }
            float totalPrice = Integer.parseInt(noOfUnits) * Float.parseFloat(price);
            txtTotalPrice.setText(String.valueOf(totalPrice));
        } else {
            txtTotalPrice.setText("");
        }
    }//GEN-LAST:event_txtNoOfUnitsKeyReleased

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        String noOfUnits = txtNoOfUnits.getText();
        String uniqueId = txtUniqueId.getText();
        if (!noOfUnits.equals("") && !uniqueId.equals("")) {
            String brandName = txtBrandName.getText();
            String company = txtCompany.getText();
            String pricePerUnit = txtPricePerUnit.getText();
            String totalPrice = txtTotalPrice.getText();
            int checkStock = 0;
            int checkMedicineAlreadyExistsInCart = 0;

            try {
                java.sql.Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery("select *from medicine where uniqueId = " + uniqueId + "");
                while (rs.next()) {
                    if (rs.getInt("quantity") >= Integer.parseInt(noOfUnits)) {
                        checkStock = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Medicine is out of stock");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            if (checkStock == 1) {
                DefaultTableModel dtm = (DefaultTableModel) tblCart.getModel();
                if (tblCart.getRowCount() != 0) {
                    for (int i = 0; i < tblCart.getRowCount(); i++) {
                        if (Integer.parseInt(dtm.getValueAt(i, 0).toString()) == Integer.parseInt(uniqueId)) {
                            checkMedicineAlreadyExistsInCart = 1;
                            JOptionPane.showMessageDialog(null, "Medicine alredy exists in cart");
                        }
                    }
                }
                if (checkMedicineAlreadyExistsInCart == 0) {
                    dtm.addRow(new Object[]{uniqueId, brandName, company, pricePerUnit, noOfUnits, totalPrice, finalTotalPrice});
                    finalTotalPrice = finalTotalPrice + Float.parseFloat(totalPrice);
                    lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
                    JOptionPane.showMessageDialog(null, "Added to cart");
                }
                clearMedicineFields();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Number of Unit and Medicine ID field is required");

        }
    }//GEN-LAST:event_btnCartActionPerformed

    private void tblCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCartMouseClicked
        int index = tblCart.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to remove this medicine from cart?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            TableModel model = tblCart.getModel();
            String total = model.getValueAt(index, 5).toString();
            finalTotalPrice = finalTotalPrice - Float.parseFloat(total);
            lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
            ((DefaultTableModel) tblCart.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_tblCartMouseClicked

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        if (finalTotalPrice != 0) {
            billId = getUniqueId("MPBL");
            DefaultTableModel dtm = (DefaultTableModel) tblCart.getModel();
            if (tblCart.getRowCount() != 0) {
                for (int i = 0; i < tblCart.getRowCount(); i++) {
                    try {
                        java.sql.Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        st.executeUpdate("update medicine set quantity = quantity-" + Integer.parseInt(dtm.getValueAt(i, 4).toString()) + " where uniqueId=" + Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            try {
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal = Calendar.getInstance();
                java.sql.Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into bill(billId, billDate, totalPaid, generatedBy) values(?,?,?,?)");
                ps.setString(1, billId);
                ps.setString(2, dFormat.format(cal.getTime()));
                ps.setFloat(3, finalTotalPrice);
                ps.setString(4, username);
                ps.executeUpdate();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(PharmacyUtils.billPath + "" + billId + ".pdf"));
                doc.open();
                Paragraph pharmacyName = new Paragraph("                                                                  Mars Pharmacy\n");
                doc.add(pharmacyName);
                Paragraph pharamacyAddress = new Paragraph("                                            12/C, 19/7, Pallabi, Mirpur, Dhaka-1216");
                doc.add(pharamacyAddress);
                Paragraph starLine = new Paragraph("***************************************************************************************************************");
                doc.add(starLine);
                Paragraph details = new Paragraph("\tBill ID: " + billId + "\nDate: " + new Date() + "\nGenerated By: " + username);
                doc.add(details);
                doc.add(starLine);
                PdfPTable tbl = new PdfPTable(6);
                tbl.addCell("Medicine ID");
                tbl.addCell("Name");
                tbl.addCell("Company");
                tbl.addCell("Price/Unit");
                tbl.addCell("Quantity");
                tbl.addCell("Sub Total");
                for (int i = 0; i < tblCart.getRowCount(); i++) {
                    String a = tblCart.getValueAt(i, 0).toString();
                    String b = tblCart.getValueAt(i, 1).toString();
                    String c = tblCart.getValueAt(i, 2).toString();
                    String d = tblCart.getValueAt(i, 3).toString();
                    String e = tblCart.getValueAt(i, 4).toString();
                    String f = tblCart.getValueAt(i, 5).toString();
                    tbl.addCell(a);
                    tbl.addCell(b);
                    tbl.addCell(c);
                    tbl.addCell(d);
                    tbl.addCell(e);
                    tbl.addCell(f);
                }
                doc.add(tbl);
                doc.add(starLine);
                Paragraph tPaid = new Paragraph("Total: " + finalTotalPrice);
                doc.add(tPaid);
                double vatPrice = finalTotalPrice * 0.15;
                Paragraph vat = new Paragraph("VAT(15%): " + vatPrice);
                doc.add(vat);
                double totalPaidPrice = (finalTotalPrice + vatPrice);
                Paragraph finalPaid = new Paragraph("Total Paid: " + totalPaidPrice);
                doc.add(finalPaid);
                doc.add(starLine);
                Paragraph thanksMsg = new Paragraph("                                           Thanks for your purchase. Get Well Soon!");
                doc.add(thanksMsg);
                OpenPdf.openById(String.valueOf(billId));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
            new SellMedicine(username).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please add some item to cart");
        }
    }//GEN-LAST:event_btnPurchaseActionPerformed

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
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFinalTotalPrice;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMedicines;
    private javax.swing.JTextField txtAvailableUnits;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtGenName;
    private javax.swing.JTextField txtNoOfUnits;
    private javax.swing.JTextField txtPricePerUnit;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUniqueId;
    // End of variables declaration//GEN-END:variables
}
