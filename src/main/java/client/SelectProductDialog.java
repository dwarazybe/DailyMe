package client;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class SelectProductDialog extends javax.swing.JDialog {

    private final Validators val;

    private String selectedProduct;
    private int productWeight;
    private double productKcal;
    private double productProteins;
    private double productFats;
    private double productCarbs;

    private Thread scrollThread;
    
    private int listMaxIndex;
    private boolean scrollDown = false;
    private boolean scrollUp = false;
    
    DefaultListModel<String> model = new DefaultListModel<String>();
    DefaultListModel<String> searchModel = new DefaultListModel<String>();
    
    DecimalFormat df = new DecimalFormat("##.#"); 
    
    /**
     * Creates new form SelectProductDialog
     * @param parent
     * @param modal
     */
    public SelectProductDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.val = new Validators();
        initComponents();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        upperBar = new javax.swing.JLabel();
        leftBorder = new javax.swing.JLabel();
        rightBorder = new javax.swing.JLabel();
        lowerBorder = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        productListScrollPane = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<>();
        searchText = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchTextFieldBar = new javax.swing.JLabel();
        amountText = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        amountTextFieldBar = new javax.swing.JLabel();
        kcalText = new javax.swing.JLabel();
        kcalTextField = new javax.swing.JTextField();
        kcalTextFieldBar = new javax.swing.JLabel();
        proteinsText = new javax.swing.JLabel();
        proteinsTextField = new javax.swing.JTextField();
        proteinsTextFieldBar = new javax.swing.JLabel();
        fatsText = new javax.swing.JLabel();
        fatsTextField = new javax.swing.JTextField();
        fatsTextFieldBar = new javax.swing.JLabel();
        carbsText = new javax.swing.JLabel();
        carbsTextField = new javax.swing.JTextField();
        carbsTextFieldBar = new javax.swing.JLabel();
        cancelButton = new javax.swing.JPanel();
        cancelButtonText = new javax.swing.JLabel();
        confirmButton = new javax.swing.JPanel();
        confirmButtonText = new javax.swing.JLabel();
        scrollUpButton = new javax.swing.JPanel();
        scrollUpSign = new javax.swing.JLabel();
        scrollUpButtonBar = new javax.swing.JLabel();
        scrollDownButton = new javax.swing.JPanel();
        scrollDownSign = new javax.swing.JLabel();
        scrollDownButtonBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 530));
        setModal(true);
        setName("selectProductDialog"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 530));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(57, 62, 70));
        mainPanel.setMinimumSize(new java.awt.Dimension(750, 530));
        mainPanel.setPreferredSize(new java.awt.Dimension(750, 530));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperBar.setBackground(new java.awt.Color(0, 173, 181));
        upperBar.setOpaque(true);
        mainPanel.add(upperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 1));

        leftBorder.setBackground(new java.awt.Color(82, 86, 93));
        leftBorder.setOpaque(true);
        mainPanel.add(leftBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1, 530));

        rightBorder.setBackground(new java.awt.Color(82, 86, 93));
        rightBorder.setOpaque(true);
        mainPanel.add(rightBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 0, 1, 530));

        lowerBorder.setBackground(new java.awt.Color(82, 86, 93));
        lowerBorder.setOpaque(true);
        mainPanel.add(lowerBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 529, 750, 1));

        titleText.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        titleText.setForeground(new java.awt.Color(238, 238, 238));
        titleText.setText("Wybierz produkt");
        mainPanel.add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 410, 60));

        productListScrollPane.setBorder(null);
        productListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        productListScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        productList.setBackground(new java.awt.Color(66, 71, 79));
        productList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productList.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        productList.setForeground(new java.awt.Color(238, 238, 238));
        productList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productList.setAutoscrolls(false);
        productList.setSelectionBackground(new java.awt.Color(0, 173, 181));
        productList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                productListValueChanged(evt);
            }
        });
        productListScrollPane.setViewportView(productList);

        mainPanel.add(productListScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 710, 290));

        searchText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        searchText.setForeground(new java.awt.Color(138, 152, 173));
        searchText.setText("Szukaj:");
        searchText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 66, 40, 20));

        searchTextField.setBackground(new java.awt.Color(57, 62, 70));
        searchTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(238, 238, 238));
        searchTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        searchTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        searchTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });
        mainPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 30));

        searchTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        searchTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        searchTextFieldBar.setOpaque(true);
        mainPanel.add(searchTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 1));

        amountText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        amountText.setForeground(new java.awt.Color(138, 152, 173));
        amountText.setText("Ilość (g):");
        amountText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 66, 50, 20));

        amountTextField.setBackground(new java.awt.Color(57, 62, 70));
        amountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        amountTextField.setForeground(new java.awt.Color(238, 238, 238));
        amountTextField.setText("100");
        amountTextField.setToolTipText("");
        amountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        amountTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        amountTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        amountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountTextFieldKeyReleased(evt);
            }
        });
        mainPanel.add(amountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 80, 30));

        amountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        amountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        amountTextFieldBar.setOpaque(true);
        mainPanel.add(amountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 1));

        kcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        kcalText.setForeground(new java.awt.Color(138, 152, 173));
        kcalText.setText("Kalorie:");
        kcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(kcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 66, 50, 20));

        kcalTextField.setEditable(false);
        kcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        kcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        kcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        kcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        kcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        kcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        mainPanel.add(kcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 100, 30));

        kcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        kcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        kcalTextFieldBar.setOpaque(true);
        kcalTextFieldBar.setVerifyInputWhenFocusTarget(false);
        mainPanel.add(kcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 95, 1));

        proteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        proteinsText.setForeground(new java.awt.Color(138, 152, 173));
        proteinsText.setText("Białko:");
        proteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(proteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 66, 50, 20));

        proteinsTextField.setEditable(false);
        proteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        proteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        proteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        proteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        proteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        proteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        mainPanel.add(proteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 80, 30));

        proteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        proteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        proteinsTextFieldBar.setOpaque(true);
        proteinsTextFieldBar.setVerifyInputWhenFocusTarget(false);
        mainPanel.add(proteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 75, 1));

        fatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        fatsText.setForeground(new java.awt.Color(138, 152, 173));
        fatsText.setText("Tłuszcz:");
        fatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(fatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 66, 50, 20));

        fatsTextField.setEditable(false);
        fatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        fatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        fatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        fatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        fatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        fatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        mainPanel.add(fatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 80, 30));

        fatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        fatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        fatsTextFieldBar.setOpaque(true);
        fatsTextFieldBar.setVerifyInputWhenFocusTarget(false);
        mainPanel.add(fatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 75, 1));

        carbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        carbsText.setForeground(new java.awt.Color(138, 152, 173));
        carbsText.setText("Węglowodany:");
        carbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(carbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 66, -1, 20));

        carbsTextField.setEditable(false);
        carbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        carbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        carbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        carbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        carbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        carbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        mainPanel.add(carbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 80, 30));

        carbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        carbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        carbsTextFieldBar.setOpaque(true);
        carbsTextFieldBar.setVerifyInputWhenFocusTarget(false);
        mainPanel.add(carbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 75, 1));

        cancelButton.setBackground(new java.awt.Color(66, 71, 79));
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 94, 94)));
        cancelButton.setForeground(new java.awt.Color(50, 54, 61));
        cancelButton.setToolTipText("");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });
        cancelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelButtonText.setBackground(new java.awt.Color(57, 62, 70));
        cancelButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cancelButtonText.setForeground(new java.awt.Color(238, 238, 238));
        cancelButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelButtonText.setText("Anuluj");
        cancelButton.add(cancelButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        mainPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 90, 25));

        confirmButton.setBackground(new java.awt.Color(0, 173, 181));
        confirmButton.setForeground(new java.awt.Color(238, 238, 238));
        confirmButton.setToolTipText("");
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmButtonMouseExited(evt);
            }
        });
        confirmButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        confirmButtonText.setForeground(new java.awt.Color(238, 238, 238));
        confirmButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmButtonText.setText("Zatwierdź");
        confirmButton.add(confirmButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        mainPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 90, 25));

        scrollUpButton.setBackground(new java.awt.Color(66, 71, 79));
        scrollUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scrollUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scrollUpButtonMouseExited(evt);
            }
        });
        scrollUpButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollUpSign.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        scrollUpSign.setForeground(new java.awt.Color(106, 113, 125));
        scrollUpSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scrollUpSign.setText("▲");
        scrollUpButton.add(scrollUpSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 10, 18));

        scrollUpButtonBar.setBackground(new java.awt.Color(64, 68, 75));
        scrollUpButtonBar.setOpaque(true);
        scrollUpButton.add(scrollUpButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 710, 1));

        mainPanel.add(scrollUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 710, 20));

        scrollDownButton.setBackground(new java.awt.Color(66, 71, 79));
        scrollDownButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scrollDownButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                scrollDownButtonMouseExited(evt);
            }
        });
        scrollDownButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollDownSign.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        scrollDownSign.setForeground(new java.awt.Color(106, 113, 125));
        scrollDownSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scrollDownSign.setText("▼");
        scrollDownButton.add(scrollDownSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 2, 10, 18));

        scrollDownButtonBar.setBackground(new java.awt.Color(64, 68, 75));
        scrollDownButtonBar.setOpaque(true);
        scrollDownButton.add(scrollDownButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 1));

        mainPanel.add(scrollDownButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 710, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setProductInfo() {
        productKcal = ((LoginSession.productKcal / LoginSession.productWeight) * productWeight);
        productProteins = ((LoginSession.productProteins / LoginSession.productWeight) * productWeight);
        productFats = ((LoginSession.productFats / LoginSession.productWeight) * productWeight);
        productCarbs = ((LoginSession.productCarbs / LoginSession.productWeight) * productWeight);
        kcalTextField.setText(String.valueOf(df.format(productKcal)) + " kcal");
        proteinsTextField.setText(String.valueOf(df.format(productProteins)) + "g");
        fatsTextField.setText(String.valueOf(df.format(productFats))+ "g");
        carbsTextField.setText(String.valueOf(df.format(productCarbs))+ "g");
        
        LoginSession.selectedProductName = selectedProduct;
        LoginSession.selectedProductWeight = productWeight;
        LoginSession.selectedProductKcal = productKcal;
        LoginSession.selectedProductProteins = productProteins;
        LoginSession.selectedProductFats = productFats;
        LoginSession.selectedProductCarbs = productCarbs;
    }
    
    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        LoginSession.isProductAdded = false;
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(Color.decode("#42474F"));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(Color.decode("#393E46"));
    }//GEN-LAST:event_cancelButtonMouseExited

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        LoginSession.isProductAdded = true;
        dispose();
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void confirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseEntered
        confirmButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_confirmButtonMouseEntered

    private void confirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseExited
        confirmButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_confirmButtonMouseExited

    private void productListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_productListValueChanged
        try {
            if(!amountTextField.getText().equals("")) {
                productWeight = Integer.parseInt(amountTextField.getText());
                selectedProduct = productList.getSelectedValue();
                DatabaseOperations.loadProductInfo(selectedProduct, null);
                setProductInfo();
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
        }
    }//GEN-LAST:event_productListValueChanged

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        searchModel.clear();
        if(!searchTextField.getText().equals("")) {
            try {
                for(String productName : LoginSession.productNames) {
                    if(productName.contains((searchTextField.getText()).substring(0,1).toUpperCase() + (searchTextField.getText()).substring(1).toLowerCase())) {
                        if(!searchModel.contains(productName))
                            searchModel.addElement(productName);
                    }
                }
                productList.setModel(searchModel);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(this, "Error: " + exception.getMessage());
            }
        }
        else if(searchTextField.getText().equals("")) {
            productList.setModel(model);
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void amountTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextFieldKeyPressed
        val.intNumberVal(evt, amountTextField);
    }//GEN-LAST:event_amountTextFieldKeyPressed

    private void amountTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextFieldKeyReleased
        if(!amountTextField.getText().equals("")) {
            productWeight = Integer.parseInt(amountTextField.getText());
            setProductInfo();
        }
    }//GEN-LAST:event_amountTextFieldKeyReleased

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        val.lettersAndNumbersVal(evt, searchTextField);
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void scrollDownButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollDownButtonMouseEntered
        scrollDown = true;
        scrollDownButton.setBackground(Color.decode("#464C54"));
        scrollDownButton.repaint();
        listMaxIndex = productList.getLastVisibleIndex();
        this.scrollThread = new Thread(new Runnable() {
            public void run() {
                while(scrollDown) {
                    productList.ensureIndexIsVisible(listMaxIndex + 1);
                    listMaxIndex++;
                    productList.repaint();
                    try {
                        sleep(60);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SelectProductDialog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        scrollThread.start();
    }//GEN-LAST:event_scrollDownButtonMouseEntered

    private void scrollDownButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollDownButtonMouseExited
        scrollDownButton.setBackground(Color.decode("#42474F"));
        scrollDownButton.repaint();
        scrollDown = false;
    }//GEN-LAST:event_scrollDownButtonMouseExited

    private void scrollUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollUpButtonMouseEntered
        scrollUp = true;
        scrollUpButton.setBackground(Color.decode("#464C54"));
        scrollUpButton.repaint();
        listMaxIndex = productList.getFirstVisibleIndex();
        this.scrollThread = new Thread(new Runnable() {
                public void run() {
                    while(scrollUp) {
                    productList.ensureIndexIsVisible(listMaxIndex - 1);
                    listMaxIndex--;
                    productList.repaint();
                    try {
                        sleep(60);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SelectProductDialog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
                }
            });
        scrollThread.start();
    }//GEN-LAST:event_scrollUpButtonMouseEntered

    private void scrollUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollUpButtonMouseExited
        scrollUpButton.setBackground(Color.decode("#42474F"));
        scrollUpButton.repaint();
        scrollUp = false;
    }//GEN-LAST:event_scrollUpButtonMouseExited

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectProductDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelectProductDialog dialog = new SelectProductDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountText;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JLabel amountTextFieldBar;
    private javax.swing.JPanel cancelButton;
    private javax.swing.JLabel cancelButtonText;
    private javax.swing.JLabel carbsText;
    private javax.swing.JTextField carbsTextField;
    private javax.swing.JLabel carbsTextFieldBar;
    private javax.swing.JPanel confirmButton;
    private javax.swing.JLabel confirmButtonText;
    private javax.swing.JLabel fatsText;
    private javax.swing.JTextField fatsTextField;
    private javax.swing.JLabel fatsTextFieldBar;
    private javax.swing.JLabel kcalText;
    private javax.swing.JTextField kcalTextField;
    private javax.swing.JLabel kcalTextFieldBar;
    private javax.swing.JLabel leftBorder;
    private javax.swing.JLabel lowerBorder;
    private javax.swing.JPanel mainPanel;
    protected javax.swing.JList<String> productList;
    protected javax.swing.JScrollPane productListScrollPane;
    private javax.swing.JLabel proteinsText;
    private javax.swing.JTextField proteinsTextField;
    private javax.swing.JLabel proteinsTextFieldBar;
    private javax.swing.JLabel rightBorder;
    private javax.swing.JPanel scrollDownButton;
    private javax.swing.JLabel scrollDownButtonBar;
    private javax.swing.JLabel scrollDownSign;
    private javax.swing.JPanel scrollUpButton;
    private javax.swing.JLabel scrollUpButtonBar;
    private javax.swing.JLabel scrollUpSign;
    private javax.swing.JLabel searchText;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel searchTextFieldBar;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel upperBar;
    // End of variables declaration//GEN-END:variables
}
