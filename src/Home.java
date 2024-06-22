package loginandsignup;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The Home class represents the main GUI for a restaurant ordering system.
 * It allows users to select items, calculate totals, and submit orders.
 * Orders are saved to a database upon submission.
 */

public class Home extends javax.swing.JFrame {
    
    private String userName;
    private JLabel lblTime;
    
    // Constants for item prices
    private static final int HARGA_KENTANG = 15000;
    private static final int HARGA_SPAGHETTI = 35000;
    private static final int HARGA_PANCAKE = 20000;
    private static final int HARGA_RICEBOWL = 25000;
    private static final int HARGA_HOT_LATTE = 22000;
    private static final int HARGA_HOT_BLACKCOFFEE = 20000;
    private static final int HARGA_HOT_FRAPPUCINO = 25000;
    private static final int HARGA_HOT_CAPPUCINO = 22000;
    private static final int HARGA_ICED_MATCHA_LATTE = 18000;
    private static final int HARGA_ICED_VANILLA = 18000;
    private static final int HARGA_ICED_LEMONTEA = 11000;
    private static final int HARGA_ICED_CHOCOLATE = 12000;
    
    private String getOrderTime() {
    Date date = new Date();
    SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss");
    return tf.format(date);
    }
    /**
     * Retrieves the current username.
     * 
     * @return The username.
     */
    public String getUserName() {
        return user.getText();
    }
    
    /**
     * Initializes the components of the Home frame, sets up listeners,
     * and initializes some settings.
     */
    
    public Home() {
        initComponents();
        addListeners();
        init();
      
    }
    
    /**
     * Initializes some settings upon starting the application.
     */
    
    public void init(){
        setTime(); // Set the time display
        
    }
    
    /**
     * Resets all input fields and table in the GUI to their default state.
     */
    
    public void reset(){
            // Reset spinners
            spKentang.setValue(0);
            spSpaghetti.setValue(0);
            spPancake.setValue(0);
            spRiceBowl.setValue(0);
            spHotLatte.setValue(0);
            spHotBlack.setValue(0);
            spHotFrapp.setValue(0);
            spHotCapp.setValue(0);
            spIcedMatcha.setValue(0);
            spIcedVanilla.setValue(0);
            spIcedLemon.setValue(0);
            spIcedChocolate.setValue(0);
            
            // Reset text fields
            txtSubTotal.setText("0.0");
            txtTotal.setText("0.0");
            
            // Reset checkboxes
            cbKentang.setSelected(false);
            cbSpaghetti.setSelected(false);
            cbPancake.setSelected(false);
            cbRiceBowl.setSelected(false);
            cbHotLatte.setSelected(false);
            cbHotBlack.setSelected(false);
            cbHotFrapp.setSelected(false);
            cbHotCapp.setSelected(false);
            cbIcedMatcha.setSelected(false);
            cbIcedVanilla.setSelected(false);
            cbIcedLemon.setSelected(false);
            cbIcedChocolate.setSelected(false);
            
            // Clear table
            DefaultTableModel modelTable = (DefaultTableModel) tableOrder.getModel();
            modelTable.setRowCount(0);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTxDate = new javax.swing.JLabel();
        jTxTime = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKentang = new javax.swing.JLabel();
        hargaKentang = new javax.swing.JLabel();
        spKentang = new javax.swing.JSpinner();
        cbKentang = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hargaSpaghetti = new javax.swing.JLabel();
        txtSpaghetti = new javax.swing.JLabel();
        cbSpaghetti = new javax.swing.JCheckBox();
        spSpaghetti = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        hargaPancake = new javax.swing.JLabel();
        spPancake = new javax.swing.JSpinner();
        txtPancake = new javax.swing.JLabel();
        cbPancake = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtRiceBowl = new javax.swing.JLabel();
        spRiceBowl = new javax.swing.JSpinner();
        cbRiceBowl = new javax.swing.JCheckBox();
        hargaRiceBowl = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        spHotBlack = new javax.swing.JSpinner();
        cbHotBlack = new javax.swing.JCheckBox();
        hargaHotBlack = new javax.swing.JLabel();
        txtHotBlack = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbHotFrapp = new javax.swing.JCheckBox();
        hargaHotFrapp = new javax.swing.JLabel();
        spHotFrapp = new javax.swing.JSpinner();
        txtHotFrape = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        spHotLatte = new javax.swing.JSpinner();
        txtHotLatte = new javax.swing.JLabel();
        cbHotLatte = new javax.swing.JCheckBox();
        hargaHotLatte = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        hargaHotCapp = new javax.swing.JLabel();
        txtCappucino = new javax.swing.JLabel();
        spHotCapp = new javax.swing.JSpinner();
        cbHotCapp = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        spIcedChocolate = new javax.swing.JSpinner();
        cbIcedChocolate = new javax.swing.JCheckBox();
        txtChocolate = new javax.swing.JLabel();
        hargaIcedChocolate = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtIcedVanilla = new javax.swing.JLabel();
        hargaIcedVanilla = new javax.swing.JLabel();
        spIcedVanilla = new javax.swing.JSpinner();
        cbIcedVanilla = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtIcedMatcha = new javax.swing.JLabel();
        hargaIcedMatcha = new javax.swing.JLabel();
        spIcedMatcha = new javax.swing.JSpinner();
        cbIcedMatcha = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        hargaIcedLemon = new javax.swing.JLabel();
        txtLemonTea = new javax.swing.JLabel();
        spIcedLemon = new javax.swing.JSpinner();
        cbIcedLemon = new javax.swing.JCheckBox();
        jPanel = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1302, 52));

        jTxDate.setFont(new java.awt.Font("Sitka Display", 1, 26)); // NOI18N
        jTxDate.setForeground(new java.awt.Color(255, 255, 255));

        jTxTime.setFont(new java.awt.Font("Sitka Display", 1, 26)); // NOI18N
        jTxTime.setForeground(new java.awt.Color(255, 255, 255));

        user.setFont(new java.awt.Font("Sitka Display", 1, 26)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxDate, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jTxTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\CeAF small.png")); // NOI18N

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\exit.png")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 51, 51));
        btnReset.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\reset.png")); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset)
                    .addComponent(btnExit))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\frenchfries.png")); // NOI18N

        txtKentang.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtKentang.setText("French Fries");

        hargaKentang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaKentang.setText("IDR. 15.000");

        spKentang.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        cbKentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKentangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbKentang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spKentang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKentang)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(hargaKentang)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtKentang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaKentang)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spKentang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKentang))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\spaghetti.png")); // NOI18N

        hargaSpaghetti.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaSpaghetti.setText("IDR. 35.000");

        txtSpaghetti.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtSpaghetti.setText("Spaghetti");

        spSpaghetti.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSpaghetti)
                    .addComponent(hargaSpaghetti)))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cbSpaghetti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spSpaghetti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtSpaghetti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaSpaghetti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spSpaghetti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSpaghetti))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\pencake.png")); // NOI18N

        hargaPancake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaPancake.setText("IDR. 20.000");

        spPancake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        txtPancake.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtPancake.setText("Pancake");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(cbPancake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spPancake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPancake)
                            .addComponent(hargaPancake)))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtPancake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaPancake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spPancake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPancake))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\ricebowl.png")); // NOI18N

        txtRiceBowl.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtRiceBowl.setText("Beef Rice Bowl");

        spRiceBowl.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        hargaRiceBowl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaRiceBowl.setText("IDR. 25.000");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(hargaRiceBowl)
                    .addGap(28, 28, 28))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRiceBowl)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(cbRiceBowl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spRiceBowl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(3, 3, 3)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtRiceBowl)
                .addGap(3, 3, 3)
                .addComponent(hargaRiceBowl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spRiceBowl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRiceBowl))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\blackCoffe.png")); // NOI18N

        spHotBlack.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        hargaHotBlack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaHotBlack.setText("IDR. 20.000");

        txtHotBlack.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtHotBlack.setText("Hot Black Coffee");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(hargaHotBlack))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtHotBlack))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cbHotBlack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spHotBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtHotBlack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaHotBlack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spHotBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHotBlack))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\coffeViet.png")); // NOI18N

        hargaHotFrapp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaHotFrapp.setText("IDR. 25.000");

        spHotFrapp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        txtHotFrape.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtHotFrape.setText("Hot Frappuccino");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(hargaHotFrapp))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtHotFrape))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cbHotFrapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spHotFrapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtHotFrape)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaHotFrapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spHotFrapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHotFrapp))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\coffe.png")); // NOI18N

        spHotLatte.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        txtHotLatte.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtHotLatte.setText("Hot Latte");

        hargaHotLatte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaHotLatte.setText("IDR. 22.000");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(cbHotLatte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spHotLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHotLatte)
                            .addComponent(hargaHotLatte)))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtHotLatte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaHotLatte)
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spHotLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHotLatte))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\cappCoffe.png")); // NOI18N

        hargaHotCapp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaHotCapp.setText("IDR. 22.000");

        txtCappucino.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtCappucino.setText("Hot Cappuccino");

        spHotCapp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(hargaHotCapp))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtCappucino))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cbHotCapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spHotCapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtCappucino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaHotCapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spHotCapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHotCapp))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\chocolate.png")); // NOI18N

        spIcedChocolate.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        txtChocolate.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtChocolate.setText("Iced Chocolate");

        hargaIcedChocolate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaIcedChocolate.setText("IDR. 12.000");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(cbIcedChocolate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spIcedChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtChocolate)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(hargaIcedChocolate)
                            .addGap(24, 24, 24)))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(txtChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaIcedChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spIcedChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIcedChocolate))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\dalgona.png")); // NOI18N

        txtIcedVanilla.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtIcedVanilla.setText("Iced Vanilla Latte");

        hargaIcedVanilla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaIcedVanilla.setText("IDR. 18.000");

        spIcedVanilla.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(hargaIcedVanilla))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtIcedVanilla))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cbIcedVanilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spIcedVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtIcedVanilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaIcedVanilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spIcedVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIcedVanilla))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\matcha.png")); // NOI18N

        txtIcedMatcha.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtIcedMatcha.setText("Iced Matcha Latte");

        hargaIcedMatcha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaIcedMatcha.setText("IDR. 18.000");

        spIcedMatcha.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtIcedMatcha))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(hargaIcedMatcha))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(cbIcedMatcha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spIcedMatcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtIcedMatcha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaIcedMatcha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spIcedMatcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIcedMatcha))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\lemon tea.png")); // NOI18N

        hargaIcedLemon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaIcedLemon.setText("IDR. 11.000");

        txtLemonTea.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N
        txtLemonTea.setText("Iced Lemon Tea");

        spIcedLemon.setModel(new javax.swing.SpinnerNumberModel(0, 0, 25, 1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtLemonTea))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(cbIcedLemon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spIcedLemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hargaIcedLemon)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtLemonTea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaIcedLemon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spIcedLemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIcedLemon))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel16.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Items Total");

        jLabel17.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Price Total");

        txtSubTotal.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        txtSubTotal.setText("0");
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        txtTotal.setText("0");

        submitBtn.setBackground(new java.awt.Color(51, 51, 51));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("SUBMIT");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Citra Fatika\\project_citra\\LoginAndSignUp\\src\\Icon\\cart.png")); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel19.setText("Your Order ");

        tableOrder.setFont(new java.awt.Font("Courier New", 2, 14)); // NOI18N
        tableOrder.setForeground(new java.awt.Color(51, 51, 51));
        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Items", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(tableOrder);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setUser(String name){
        user.setText("Hi, " + name);
    }
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
         saveToDatabase();
         openResultForm();
    }//GEN-LAST:event_submitBtnActionPerformed
    
    /**
     * Saves the current order details to the database.
     */
    
    private void saveToDatabase() {
    // Dapatkan model tabel
    DefaultTableModel model = (DefaultTableModel) tableOrder.getModel();
    try {
        String url = "jdbc:mysql://localhost:3306/java_user_database";
        String username = "root";
        String password = "";
        
        java.sql.Connection connection = DriverManager.getConnection(url, username, password);
    
    for (int i = 0; i < model.getRowCount(); i++) {
        String itemName = model.getValueAt(i, 1).toString();
        int quantity = Integer.parseInt(model.getValueAt(i, 2).toString());
        int price = Integer.parseInt(model.getValueAt(i, 3).toString());

        String sql = "INSERT INTO tb (Items, Qty, Price) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql); 
            
            statement.setString(1, itemName);
            statement.setInt(2, quantity);
            statement.setInt(3, price);
            
            int rowsInserted = statement.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("A new order was inserted successfully!");
            }
            
            statement.close();
        }
        
        connection.close();
        JOptionPane.showMessageDialog(this, "Orders have been successfully!");
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving orders to the database: " + ex.getMessage());
    }
    }
    
    /**
     * Opens the result form, passing current order details to display.
     */
    private void openResultForm() {
        Result resultForm = new Result();
        DefaultTableModel model = (DefaultTableModel) tableOrder.getModel();
        resultForm.setTableData(model);
        resultForm.setUserName(getUserName());
        resultForm.setOrderTime(getOrderTime());
        resultForm.setVisible(true);
        this.dispose(); // Close the current window
    }
    
    /**
     * Sets the current username.
     * 
     * @param userName The username to set.
     */
      public void setUserName(String userName) {
        this.userName = userName;
    }
    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbKentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKentangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKentangActionPerformed
    private void addListeners() {
    /**
     * Adds action listeners to all relevant components to handle user interaction.
     */
        cbKentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spKentang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });
        
        cbSpaghetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spSpaghetti.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbPancake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spPancake.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbRiceBowl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spRiceBowl.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbHotLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spHotLatte.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbHotBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spHotBlack.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbHotFrapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spHotFrapp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbHotCapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spHotCapp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbIcedMatcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spIcedMatcha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbIcedVanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spIcedVanilla.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbIcedLemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spIcedLemon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
            }
        });

        cbIcedChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotal();
            }
        });

        spIcedChocolate.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                calculateTotal();
                
            }
        });
        
        btnReset.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            reset();
    }
});

    }
      private void addToTable(String itemName, int quantity, int price) {
        DefaultTableModel modelTable = (DefaultTableModel) tableOrder.getModel();
        int idCounter = modelTable.getRowCount() + 1;
        modelTable.addRow(new Object[]{idCounter, itemName, quantity, price});
    }

      /**
     * Calculates the total cost and updates the table with selected items.
     */
    private void calculateTotal() {
        DefaultTableModel model = (DefaultTableModel) tableOrder.getModel();
        model.setRowCount(0);
      
        int total = 0;
        int itemCount = 0;
        int checkedItemCount = 0;
        
        

        if (cbKentang.isSelected()) {
            int quantity = (int) spKentang.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_KENTANG * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("French Fries", quantity, itemTotal);
                }
        }
        
        if (cbSpaghetti.isSelected()) {
            int quantity = (int) spSpaghetti.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_SPAGHETTI * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Spaghetti", quantity, itemTotal);
                }
        }

        if (cbPancake.isSelected()) {
            int quantity = (int) spPancake.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_PANCAKE * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Pancake", quantity, itemTotal);
                }
            
        }

        if (cbRiceBowl.isSelected()) {
            int quantity = (int) spRiceBowl.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_RICEBOWL * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Rice Bowl", quantity, itemTotal);
            
                }
        }

        if (cbHotLatte.isSelected()) {
            int quantity = (int) spHotLatte.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_HOT_LATTE * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Hot Latte", quantity, itemTotal);
            
                }
        }

        if (cbHotBlack.isSelected()) {
            int quantity = (int) spHotBlack.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_HOT_BLACKCOFFEE* quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Hot Black Coffee", quantity, itemTotal);
                }
        }

        if (cbHotFrapp.isSelected()) {
            int quantity = (int) spHotFrapp.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_HOT_FRAPPUCINO * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Hot Frappucino", quantity, itemTotal);
                }
        }

        if (cbHotCapp.isSelected()) {
            int quantity = (int) spHotCapp.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_HOT_CAPPUCINO * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Hot Cappucino", quantity, itemTotal);
                }
        }

        if (cbIcedMatcha.isSelected()) {
            int quantity = (int) spIcedMatcha.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_ICED_MATCHA_LATTE * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Iced Matcha Latte", quantity, itemTotal);
                }
        }

        if (cbIcedVanilla.isSelected()) {
            int quantity = (int) spIcedVanilla.getValue();
                if (quantity > 0) {
                    int itemTotal = HARGA_ICED_VANILLA * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Iced Vanilla", quantity, itemTotal);
                }
        }

        if (cbIcedLemon.isSelected()) {
            int quantity = (int) spIcedLemon.getValue();
                 if (quantity > 0) {
                    int itemTotal = HARGA_ICED_LEMONTEA * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Iced Lemontea", quantity, itemTotal);
                 }
        }

        if (cbIcedChocolate.isSelected()) {
            int quantity = (int) spIcedChocolate.getValue();
                 if (quantity > 0) {
                    int itemTotal = HARGA_ICED_CHOCOLATE * quantity;
                    total += itemTotal;
                    itemCount += quantity;
                    checkedItemCount++;
                    addToTable("Iced Chocolate", quantity, itemTotal);
                 }
        }
        
        txtTotal.setText(String.valueOf(total));
        txtSubTotal.setText(String.valueOf(itemCount));
        
        }
    /**
     * Sets up the time display to update continuously.
     */
    public void setTime(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
    
                Date date = new Date();
                SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                SimpleDateFormat df = new SimpleDateFormat("EEE, dd-MM-yyyy");
                String time = tf.format(date);
                jTxTime.setText(time.split(" ")[0]+" "+time.split(" ")[1]);
                jTxDate.setText(df.format(date));
            }
        }
    }).start();
}
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox cbHotBlack;
    private javax.swing.JCheckBox cbHotCapp;
    private javax.swing.JCheckBox cbHotFrapp;
    private javax.swing.JCheckBox cbHotLatte;
    private javax.swing.JCheckBox cbIcedChocolate;
    private javax.swing.JCheckBox cbIcedLemon;
    private javax.swing.JCheckBox cbIcedMatcha;
    private javax.swing.JCheckBox cbIcedVanilla;
    private javax.swing.JCheckBox cbKentang;
    private javax.swing.JCheckBox cbPancake;
    private javax.swing.JCheckBox cbRiceBowl;
    private javax.swing.JCheckBox cbSpaghetti;
    private javax.swing.JLabel hargaHotBlack;
    private javax.swing.JLabel hargaHotCapp;
    private javax.swing.JLabel hargaHotFrapp;
    private javax.swing.JLabel hargaHotLatte;
    private javax.swing.JLabel hargaIcedChocolate;
    private javax.swing.JLabel hargaIcedLemon;
    private javax.swing.JLabel hargaIcedMatcha;
    private javax.swing.JLabel hargaIcedVanilla;
    private javax.swing.JLabel hargaKentang;
    private javax.swing.JLabel hargaPancake;
    private javax.swing.JLabel hargaRiceBowl;
    private javax.swing.JLabel hargaSpaghetti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTxDate;
    private javax.swing.JLabel jTxTime;
    private javax.swing.JSpinner spHotBlack;
    private javax.swing.JSpinner spHotCapp;
    private javax.swing.JSpinner spHotFrapp;
    private javax.swing.JSpinner spHotLatte;
    private javax.swing.JSpinner spIcedChocolate;
    private javax.swing.JSpinner spIcedLemon;
    private javax.swing.JSpinner spIcedMatcha;
    private javax.swing.JSpinner spIcedVanilla;
    private javax.swing.JSpinner spKentang;
    private javax.swing.JSpinner spPancake;
    private javax.swing.JSpinner spRiceBowl;
    private javax.swing.JSpinner spSpaghetti;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTable tableOrder;
    private javax.swing.JLabel txtCappucino;
    private javax.swing.JLabel txtChocolate;
    private javax.swing.JLabel txtHotBlack;
    private javax.swing.JLabel txtHotFrape;
    private javax.swing.JLabel txtHotLatte;
    private javax.swing.JLabel txtIcedMatcha;
    private javax.swing.JLabel txtIcedVanilla;
    private javax.swing.JLabel txtKentang;
    private javax.swing.JLabel txtLemonTea;
    private javax.swing.JLabel txtPancake;
    private javax.swing.JLabel txtRiceBowl;
    private javax.swing.JLabel txtSpaghetti;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

}