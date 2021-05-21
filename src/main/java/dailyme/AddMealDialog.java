package dailyme;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class AddMealDialog extends javax.swing.JDialog {

    private SelectProductDialog selectProductDialog;
    private final Validators val;
   
    private int productCount = 0;
    
    private int totalWeight = 0;
    private double totalKcal = 0.0;
    private double totalProteins = 0.0;
    private double totalFats = 0.0;
    private double totalCarbs = 0.0;
    
    DecimalFormat df = new DecimalFormat("##.#"); 
    
    /**
     * Creates new form AddMealDialog
     * @param parent
     * @param modal
     */
    public AddMealDialog(java.awt.Frame parent, boolean modal) {
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
        nameText = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameTextFieldBar = new javax.swing.JLabel();
        productText = new javax.swing.JLabel();
        amountText = new javax.swing.JLabel();
        kcalText = new javax.swing.JLabel();
        proteinsText = new javax.swing.JLabel();
        fatsText = new javax.swing.JLabel();
        carbsText = new javax.swing.JLabel();
        product1Panel = new javax.swing.JPanel();
        product1Button = new javax.swing.JPanel();
        product1ButtonPlusSign = new javax.swing.JLabel();
        product1NameTextField = new javax.swing.JTextField();
        product1KcalTextField = new javax.swing.JTextField();
        product1ProteinsTextField = new javax.swing.JTextField();
        product1FatsTextField = new javax.swing.JTextField();
        product1CarbsTextField = new javax.swing.JTextField();
        product1AmountTextField = new javax.swing.JTextField();
        product1NameTextFieldBar = new javax.swing.JLabel();
        product1AmountTextFieldBar = new javax.swing.JLabel();
        product1KcalTextFieldBar = new javax.swing.JLabel();
        product1ProteinsTextFieldBar = new javax.swing.JLabel();
        product1FatsTextFieldBar = new javax.swing.JLabel();
        product1CarbsTextFieldBar = new javax.swing.JLabel();
        product2Panel = new javax.swing.JPanel();
        product2Button = new javax.swing.JPanel();
        product2ButtonPlusSign = new javax.swing.JLabel();
        product2NameTextField = new javax.swing.JTextField();
        product2AmountTextField = new javax.swing.JTextField();
        product2KcalTextField = new javax.swing.JTextField();
        product2ProteinsTextField = new javax.swing.JTextField();
        product2FatsTextField = new javax.swing.JTextField();
        product2CarbsTextField = new javax.swing.JTextField();
        product2NameTextFieldBar = new javax.swing.JLabel();
        product2AmountTextFieldBar = new javax.swing.JLabel();
        product2KcalTextFieldBar = new javax.swing.JLabel();
        product2ProteinsTextFieldBar = new javax.swing.JLabel();
        product2FatsTextFieldBar = new javax.swing.JLabel();
        product2CarbsTextFieldBar = new javax.swing.JLabel();
        product3Panel = new javax.swing.JPanel();
        product3Button = new javax.swing.JPanel();
        product3ButtonPlusSign = new javax.swing.JLabel();
        product3NameTextField = new javax.swing.JTextField();
        product3AmountTextField = new javax.swing.JTextField();
        product3KcalTextField = new javax.swing.JTextField();
        product3ProteinsTextField = new javax.swing.JTextField();
        product3FatsTextField = new javax.swing.JTextField();
        product3CarbsTextField = new javax.swing.JTextField();
        product3NameTextFieldBar = new javax.swing.JLabel();
        product3AmountTextFieldBar = new javax.swing.JLabel();
        product3KcalTextFieldBar = new javax.swing.JLabel();
        product3ProteinsTextFieldBar = new javax.swing.JLabel();
        product3FatsTextFieldBar = new javax.swing.JLabel();
        product3CarbsTextFieldBar = new javax.swing.JLabel();
        product4Panel = new javax.swing.JPanel();
        product4Button = new javax.swing.JPanel();
        product4ButtonPlusSign = new javax.swing.JLabel();
        product4NameTextField = new javax.swing.JTextField();
        product4AmountTextField = new javax.swing.JTextField();
        product4KcalTextField = new javax.swing.JTextField();
        product4ProteinsTextField = new javax.swing.JTextField();
        product4FatsTextField = new javax.swing.JTextField();
        product4CarbsTextField = new javax.swing.JTextField();
        product4NameTextFieldBar = new javax.swing.JLabel();
        product4AmountTextFieldBar = new javax.swing.JLabel();
        product4KcalTextFieldBar = new javax.swing.JLabel();
        product4ProteinsTextFieldBar = new javax.swing.JLabel();
        product4FatsTextFieldBar = new javax.swing.JLabel();
        product4CarbsTextFieldBar = new javax.swing.JLabel();
        product5Panel = new javax.swing.JPanel();
        product5Button = new javax.swing.JPanel();
        product5ButtonPlusSign = new javax.swing.JLabel();
        product5NameTextField = new javax.swing.JTextField();
        product5AmountTextField = new javax.swing.JTextField();
        product5KcalTextField = new javax.swing.JTextField();
        product5ProteinsTextField = new javax.swing.JTextField();
        product5FatsTextField = new javax.swing.JTextField();
        product5CarbsTextField = new javax.swing.JTextField();
        product5NameTextFieldBar = new javax.swing.JLabel();
        product5AmountTextFieldBar = new javax.swing.JLabel();
        product5KcalTextFieldBar = new javax.swing.JLabel();
        product5ProteinsTextFieldBar = new javax.swing.JLabel();
        product5FatsTextFieldBar = new javax.swing.JLabel();
        product5CarbsTextFieldBar = new javax.swing.JLabel();
        product6Panel = new javax.swing.JPanel();
        product6Button = new javax.swing.JPanel();
        product6ButtonPlusSign = new javax.swing.JLabel();
        product6NameTextField = new javax.swing.JTextField();
        product6AmountTextField = new javax.swing.JTextField();
        product6KcalTextField = new javax.swing.JTextField();
        product6ProteinsTextField = new javax.swing.JTextField();
        product6FatsTextField = new javax.swing.JTextField();
        product6CarbsTextField = new javax.swing.JTextField();
        product6NameTextFieldBar = new javax.swing.JLabel();
        product6AmountTextFieldBar = new javax.swing.JLabel();
        product6KcalTextFieldBar = new javax.swing.JLabel();
        product6ProteinsTextFieldBar = new javax.swing.JLabel();
        product6FatsTextFieldBar = new javax.swing.JLabel();
        product6CarbsTextFieldBar = new javax.swing.JLabel();
        product7Panel = new javax.swing.JPanel();
        product7Button = new javax.swing.JPanel();
        product7ButtonPlusSign = new javax.swing.JLabel();
        product7NameTextField = new javax.swing.JTextField();
        product7AmountTextField = new javax.swing.JTextField();
        product7KcalTextField = new javax.swing.JTextField();
        product7ProteinsTextField = new javax.swing.JTextField();
        product7FatsTextField = new javax.swing.JTextField();
        product7CarbsTextField = new javax.swing.JTextField();
        product7NameTextFieldBar = new javax.swing.JLabel();
        product7AmountTextFieldBar = new javax.swing.JLabel();
        product7KcalTextFieldBar = new javax.swing.JLabel();
        product7ProteinsTextFieldBar = new javax.swing.JLabel();
        product7FatsTextFieldBar = new javax.swing.JLabel();
        product7CarbsTextFieldBar = new javax.swing.JLabel();
        product8Panel = new javax.swing.JPanel();
        product8Button = new javax.swing.JPanel();
        product8ButtonPlusSign = new javax.swing.JLabel();
        product8NameTextField = new javax.swing.JTextField();
        product8AmountTextField = new javax.swing.JTextField();
        product8KcalTextField = new javax.swing.JTextField();
        product8ProteinsTextField = new javax.swing.JTextField();
        product8FatsTextField = new javax.swing.JTextField();
        product8CarbsTextField = new javax.swing.JTextField();
        product8NameTextFieldBar = new javax.swing.JLabel();
        product8AmountTextFieldBar = new javax.swing.JLabel();
        product8KcalTextFieldBar = new javax.swing.JLabel();
        product8ProteinsTextFieldBar = new javax.swing.JLabel();
        product8FatsTextFieldBar = new javax.swing.JLabel();
        product8CarbsTextFieldBar = new javax.swing.JLabel();
        product9Panel = new javax.swing.JPanel();
        product9Button = new javax.swing.JPanel();
        product9ButtonPlusSign = new javax.swing.JLabel();
        product9NameTextField = new javax.swing.JTextField();
        product9AmountTextField = new javax.swing.JTextField();
        product9KcalTextField = new javax.swing.JTextField();
        product9ProteinsTextField = new javax.swing.JTextField();
        product9FatsTextField = new javax.swing.JTextField();
        product9CarbsTextField = new javax.swing.JTextField();
        product9NameTextFieldBar = new javax.swing.JLabel();
        product9AmountTextFieldBar = new javax.swing.JLabel();
        product9KcalTextFieldBar = new javax.swing.JLabel();
        product9ProteinsTextFieldBar = new javax.swing.JLabel();
        product9FatsTextFieldBar = new javax.swing.JLabel();
        product9CarbsTextFieldBar = new javax.swing.JLabel();
        product10Panel = new javax.swing.JPanel();
        product10Button = new javax.swing.JPanel();
        product10ButtonPlusSign = new javax.swing.JLabel();
        product10NameTextField = new javax.swing.JTextField();
        product10AmountTextField = new javax.swing.JTextField();
        product10KcalTextField = new javax.swing.JTextField();
        product10ProteinsTextField = new javax.swing.JTextField();
        product10FatsTextField = new javax.swing.JTextField();
        product10CarbsTextField = new javax.swing.JTextField();
        product10NameTextFieldBar = new javax.swing.JLabel();
        product10AmountTextFieldBar = new javax.swing.JLabel();
        product10KcalTextFieldBar = new javax.swing.JLabel();
        product10ProteinsTextFieldBar = new javax.swing.JLabel();
        product10FatsTextFieldBar = new javax.swing.JLabel();
        product10CarbsTextFieldBar = new javax.swing.JLabel();
        totalPanel = new javax.swing.JPanel();
        totalTextPanel = new javax.swing.JPanel();
        totalText = new javax.swing.JLabel();
        totalAmountTextField = new javax.swing.JTextField();
        totalKcalTextField = new javax.swing.JTextField();
        totalProteinsTextField = new javax.swing.JTextField();
        totalFatsTextField = new javax.swing.JTextField();
        totalCarbsTextField = new javax.swing.JTextField();
        totalNameTextFieldBar = new javax.swing.JLabel();
        totalAmountTextFieldBar = new javax.swing.JLabel();
        totalKcalTextFieldBar = new javax.swing.JLabel();
        totalProteinsTextFieldBar = new javax.swing.JLabel();
        totalFatsTextFieldBar = new javax.swing.JLabel();
        totalCarbsTextFieldBar = new javax.swing.JLabel();
        cancelButton = new javax.swing.JPanel();
        cancelButtonText = new javax.swing.JLabel();
        confirmButton = new javax.swing.JPanel();
        confirmButtonText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(770, 570));
        setModal(true);
        setName("newMealDialog"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(57, 62, 70));
        mainPanel.setMinimumSize(new java.awt.Dimension(770, 570));
        mainPanel.setPreferredSize(new java.awt.Dimension(770, 570));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperBar.setBackground(new java.awt.Color(0, 173, 181));
        upperBar.setOpaque(true);
        mainPanel.add(upperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 1));

        leftBorder.setBackground(new java.awt.Color(82, 86, 93));
        leftBorder.setOpaque(true);
        mainPanel.add(leftBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1, 605));

        rightBorder.setBackground(new java.awt.Color(82, 86, 93));
        rightBorder.setOpaque(true);
        mainPanel.add(rightBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 0, 1, 605));

        lowerBorder.setBackground(new java.awt.Color(82, 86, 93));
        lowerBorder.setOpaque(true);
        mainPanel.add(lowerBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 604, 765, 1));

        titleText.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        titleText.setForeground(new java.awt.Color(238, 238, 238));
        titleText.setText("Nowy posiłek");
        mainPanel.add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 410, 60));

        nameText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        nameText.setForeground(new java.awt.Color(138, 152, 173));
        nameText.setText("Nazwa posiłku:");
        nameText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 71, 80, 20));

        nameTextField.setBackground(new java.awt.Color(57, 62, 70));
        nameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(238, 238, 238));
        nameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        nameTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyPressed(evt);
            }
        });
        mainPanel.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 710, 30));

        nameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        nameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        nameTextFieldBar.setOpaque(true);
        mainPanel.add(nameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 120, 695, 1));

        productText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        productText.setForeground(new java.awt.Color(138, 152, 173));
        productText.setText("Produkt:");
        productText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(productText, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 131, 50, 20));

        amountText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        amountText.setForeground(new java.awt.Color(138, 152, 173));
        amountText.setText("Ilość (g):");
        amountText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 131, 50, 20));

        kcalText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        kcalText.setForeground(new java.awt.Color(138, 152, 173));
        kcalText.setText("Kalorie:");
        kcalText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(kcalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 131, 70, 20));

        proteinsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        proteinsText.setForeground(new java.awt.Color(138, 152, 173));
        proteinsText.setText("Białko:");
        proteinsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(proteinsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 131, 50, 20));

        fatsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        fatsText.setForeground(new java.awt.Color(138, 152, 173));
        fatsText.setText("Tłuszcz:");
        fatsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(fatsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 131, 50, 20));

        carbsText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        carbsText.setForeground(new java.awt.Color(138, 152, 173));
        carbsText.setText("Węglowodany:");
        carbsText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainPanel.add(carbsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 131, -1, 20));

        product1Panel.setBackground(new java.awt.Color(57, 62, 70));
        product1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product1Button.setBackground(new java.awt.Color(50, 54, 61));
        product1Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        product1Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product1ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product1ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product1ButtonMouseExited(evt);
            }
        });

        product1ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product1ButtonPlusSign.setForeground(new java.awt.Color(0, 173, 181));
        product1ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product1ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product1ButtonLayout = new javax.swing.GroupLayout(product1Button);
        product1Button.setLayout(product1ButtonLayout);
        product1ButtonLayout.setHorizontalGroup(
            product1ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product1ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product1ButtonLayout.setVerticalGroup(
            product1ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product1ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product1ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product1Panel.add(product1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product1NameTextField.setEditable(false);
        product1NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product1NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product1NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product1NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product1NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product1NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product1Panel.add(product1NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product1KcalTextField.setEditable(false);
        product1KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product1KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product1KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product1KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product1KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product1KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product1Panel.add(product1KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product1ProteinsTextField.setEditable(false);
        product1ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product1ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product1ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product1ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product1ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product1ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product1Panel.add(product1ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product1FatsTextField.setEditable(false);
        product1FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product1FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product1FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product1FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product1FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product1FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product1Panel.add(product1FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product1CarbsTextField.setEditable(false);
        product1CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product1CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product1CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product1CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product1CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product1CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product1Panel.add(product1CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product1AmountTextField.setEditable(false);
        product1AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product1AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product1AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product1AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product1AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product1AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product1Panel.add(product1AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product1NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product1NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product1NameTextFieldBar.setOpaque(true);
        product1Panel.add(product1NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product1AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product1AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product1AmountTextFieldBar.setOpaque(true);
        product1Panel.add(product1AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product1KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product1KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product1KcalTextFieldBar.setOpaque(true);
        product1Panel.add(product1KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product1ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product1ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product1ProteinsTextFieldBar.setOpaque(true);
        product1Panel.add(product1ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product1FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product1FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product1FatsTextFieldBar.setOpaque(true);
        product1Panel.add(product1FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product1CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product1CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product1CarbsTextFieldBar.setOpaque(true);
        product1Panel.add(product1CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        product2Panel.setBackground(new java.awt.Color(57, 62, 70));
        product2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product2Button.setBackground(new java.awt.Color(50, 54, 61));
        product2Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product2Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product2ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product2ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product2ButtonMouseExited(evt);
            }
        });

        product2ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product2ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product2ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product2ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product2ButtonLayout = new javax.swing.GroupLayout(product2Button);
        product2Button.setLayout(product2ButtonLayout);
        product2ButtonLayout.setHorizontalGroup(
            product2ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product2ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product2ButtonLayout.setVerticalGroup(
            product2ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product2ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product2ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product2Panel.add(product2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product2NameTextField.setEditable(false);
        product2NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product2NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product2NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product2NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product2NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product2NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product2Panel.add(product2NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product2AmountTextField.setEditable(false);
        product2AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product2AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product2AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product2AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product2AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product2AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product2Panel.add(product2AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product2KcalTextField.setEditable(false);
        product2KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product2KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product2KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product2KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product2KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product2KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product2Panel.add(product2KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product2ProteinsTextField.setEditable(false);
        product2ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product2ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product2ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product2ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product2ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product2ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product2Panel.add(product2ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product2FatsTextField.setEditable(false);
        product2FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product2FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product2FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product2FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product2FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product2FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product2Panel.add(product2FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product2CarbsTextField.setEditable(false);
        product2CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product2CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product2CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product2CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product2CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product2CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product2Panel.add(product2CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product2NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product2NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product2NameTextFieldBar.setOpaque(true);
        product2Panel.add(product2NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product2AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product2AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product2AmountTextFieldBar.setOpaque(true);
        product2Panel.add(product2AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product2KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product2KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product2KcalTextFieldBar.setOpaque(true);
        product2Panel.add(product2KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product2ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product2ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product2ProteinsTextFieldBar.setOpaque(true);
        product2Panel.add(product2ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product2FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product2FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product2FatsTextFieldBar.setOpaque(true);
        product2Panel.add(product2FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product2CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product2CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product2CarbsTextFieldBar.setOpaque(true);
        product2Panel.add(product2CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, -1, -1));

        product3Panel.setBackground(new java.awt.Color(57, 62, 70));
        product3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product3Button.setBackground(new java.awt.Color(50, 54, 61));
        product3Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product3Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product3ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product3ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product3ButtonMouseExited(evt);
            }
        });

        product3ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product3ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product3ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product3ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product3ButtonLayout = new javax.swing.GroupLayout(product3Button);
        product3Button.setLayout(product3ButtonLayout);
        product3ButtonLayout.setHorizontalGroup(
            product3ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product3ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product3ButtonLayout.setVerticalGroup(
            product3ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product3ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product3ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product3Panel.add(product3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product3NameTextField.setEditable(false);
        product3NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product3NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product3NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product3NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product3NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product3NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product3Panel.add(product3NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product3AmountTextField.setEditable(false);
        product3AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product3AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product3AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product3AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product3AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product3AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product3Panel.add(product3AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product3KcalTextField.setEditable(false);
        product3KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product3KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product3KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product3KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product3KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product3KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product3Panel.add(product3KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product3ProteinsTextField.setEditable(false);
        product3ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product3ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product3ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product3ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product3ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product3ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product3Panel.add(product3ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product3FatsTextField.setEditable(false);
        product3FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product3FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product3FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product3FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product3FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product3FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product3Panel.add(product3FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product3CarbsTextField.setEditable(false);
        product3CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product3CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product3CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product3CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product3CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product3CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product3Panel.add(product3CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product3NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product3NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product3NameTextFieldBar.setOpaque(true);
        product3Panel.add(product3NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product3AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product3AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product3AmountTextFieldBar.setOpaque(true);
        product3Panel.add(product3AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product3KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product3KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product3KcalTextFieldBar.setOpaque(true);
        product3Panel.add(product3KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product3ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product3ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product3ProteinsTextFieldBar.setOpaque(true);
        product3Panel.add(product3ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product3FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product3FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product3FatsTextFieldBar.setOpaque(true);
        product3Panel.add(product3FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product3CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product3CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product3CarbsTextFieldBar.setOpaque(true);
        product3Panel.add(product3CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        product4Panel.setBackground(new java.awt.Color(57, 62, 70));
        product4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product4Button.setBackground(new java.awt.Color(50, 54, 61));
        product4Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product4Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product4Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product4ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product4ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product4ButtonMouseExited(evt);
            }
        });

        product4ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product4ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product4ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product4ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product4ButtonLayout = new javax.swing.GroupLayout(product4Button);
        product4Button.setLayout(product4ButtonLayout);
        product4ButtonLayout.setHorizontalGroup(
            product4ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product4ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product4ButtonLayout.setVerticalGroup(
            product4ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product4ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product4ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product4Panel.add(product4Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product4NameTextField.setEditable(false);
        product4NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product4NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product4NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product4NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product4NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product4NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product4Panel.add(product4NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product4AmountTextField.setEditable(false);
        product4AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product4AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product4AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product4AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product4AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product4AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product4Panel.add(product4AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product4KcalTextField.setEditable(false);
        product4KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product4KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product4KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product4KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product4KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product4KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product4Panel.add(product4KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product4ProteinsTextField.setEditable(false);
        product4ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product4ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product4ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product4ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product4ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product4ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product4Panel.add(product4ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product4FatsTextField.setEditable(false);
        product4FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product4FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product4FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product4FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product4FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product4FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product4Panel.add(product4FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product4CarbsTextField.setEditable(false);
        product4CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product4CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product4CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product4CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product4CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product4CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product4Panel.add(product4CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product4NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product4NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product4NameTextFieldBar.setOpaque(true);
        product4Panel.add(product4NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product4AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product4AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product4AmountTextFieldBar.setOpaque(true);
        product4Panel.add(product4AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product4KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product4KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product4KcalTextFieldBar.setOpaque(true);
        product4Panel.add(product4KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product4ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product4ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product4ProteinsTextFieldBar.setOpaque(true);
        product4Panel.add(product4ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product4FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product4FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product4FatsTextFieldBar.setOpaque(true);
        product4Panel.add(product4FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product4CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product4CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product4CarbsTextFieldBar.setOpaque(true);
        product4Panel.add(product4CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product4Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, -1, -1));

        product5Panel.setBackground(new java.awt.Color(57, 62, 70));
        product5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product5Button.setBackground(new java.awt.Color(50, 54, 61));
        product5Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product5Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product5Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product5ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product5ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product5ButtonMouseExited(evt);
            }
        });

        product5ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product5ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product5ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product5ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product5ButtonLayout = new javax.swing.GroupLayout(product5Button);
        product5Button.setLayout(product5ButtonLayout);
        product5ButtonLayout.setHorizontalGroup(
            product5ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product5ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product5ButtonLayout.setVerticalGroup(
            product5ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product5ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product5ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product5Panel.add(product5Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product5NameTextField.setEditable(false);
        product5NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product5NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product5NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product5NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product5NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product5NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product5Panel.add(product5NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product5AmountTextField.setEditable(false);
        product5AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product5AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product5AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product5AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product5AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product5AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product5Panel.add(product5AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product5KcalTextField.setEditable(false);
        product5KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product5KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product5KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product5KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product5KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product5KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product5Panel.add(product5KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product5ProteinsTextField.setEditable(false);
        product5ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product5ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product5ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product5ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product5ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product5ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product5Panel.add(product5ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product5FatsTextField.setEditable(false);
        product5FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product5FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product5FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product5FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product5FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product5FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product5Panel.add(product5FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product5CarbsTextField.setEditable(false);
        product5CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product5CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product5CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product5CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product5CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product5CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product5Panel.add(product5CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product5NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product5NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product5NameTextFieldBar.setOpaque(true);
        product5Panel.add(product5NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product5AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product5AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product5AmountTextFieldBar.setOpaque(true);
        product5Panel.add(product5AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product5KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product5KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product5KcalTextFieldBar.setOpaque(true);
        product5Panel.add(product5KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product5ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product5ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product5ProteinsTextFieldBar.setOpaque(true);
        product5Panel.add(product5ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product5FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product5FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product5FatsTextFieldBar.setOpaque(true);
        product5Panel.add(product5FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product5CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product5CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product5CarbsTextFieldBar.setOpaque(true);
        product5Panel.add(product5CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product5Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        product6Panel.setBackground(new java.awt.Color(57, 62, 70));
        product6Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product6Button.setBackground(new java.awt.Color(50, 54, 61));
        product6Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product6Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product6Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product6ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product6ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product6ButtonMouseExited(evt);
            }
        });

        product6ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product6ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product6ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product6ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product6ButtonLayout = new javax.swing.GroupLayout(product6Button);
        product6Button.setLayout(product6ButtonLayout);
        product6ButtonLayout.setHorizontalGroup(
            product6ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product6ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product6ButtonLayout.setVerticalGroup(
            product6ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product6ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product6ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product6Panel.add(product6Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product6NameTextField.setEditable(false);
        product6NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product6NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product6NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product6NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product6NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product6NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product6Panel.add(product6NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product6AmountTextField.setEditable(false);
        product6AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product6AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product6AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product6AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product6AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product6AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product6Panel.add(product6AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 80, 30));

        product6KcalTextField.setEditable(false);
        product6KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product6KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product6KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product6KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product6KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product6KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product6Panel.add(product6KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product6ProteinsTextField.setEditable(false);
        product6ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product6ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product6ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product6ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product6ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product6ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product6Panel.add(product6ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product6FatsTextField.setEditable(false);
        product6FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product6FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product6FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product6FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product6FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product6FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product6Panel.add(product6FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product6CarbsTextField.setEditable(false);
        product6CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product6CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product6CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product6CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product6CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product6CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product6Panel.add(product6CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product6NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product6NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product6NameTextFieldBar.setOpaque(true);
        product6Panel.add(product6NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product6AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product6AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product6AmountTextFieldBar.setOpaque(true);
        product6Panel.add(product6AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product6KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product6KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product6KcalTextFieldBar.setOpaque(true);
        product6Panel.add(product6KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product6ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product6ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product6ProteinsTextFieldBar.setOpaque(true);
        product6Panel.add(product6ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product6FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product6FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product6FatsTextFieldBar.setOpaque(true);
        product6Panel.add(product6FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product6CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product6CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product6CarbsTextFieldBar.setOpaque(true);
        product6Panel.add(product6CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product6Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 325, -1, -1));

        product7Panel.setBackground(new java.awt.Color(57, 62, 70));
        product7Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product7Button.setBackground(new java.awt.Color(50, 54, 61));
        product7Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product7Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product7Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product7ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product7ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product7ButtonMouseExited(evt);
            }
        });

        product7ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product7ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product7ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product7ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product7ButtonLayout = new javax.swing.GroupLayout(product7Button);
        product7Button.setLayout(product7ButtonLayout);
        product7ButtonLayout.setHorizontalGroup(
            product7ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product7ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product7ButtonLayout.setVerticalGroup(
            product7ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product7ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product7ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product7Panel.add(product7Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product7NameTextField.setEditable(false);
        product7NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product7NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product7NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product7NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product7NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product7NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product7Panel.add(product7NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product7AmountTextField.setEditable(false);
        product7AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product7AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product7AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product7AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product7AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product7AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product7Panel.add(product7AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product7KcalTextField.setEditable(false);
        product7KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product7KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product7KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product7KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product7KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product7KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product7Panel.add(product7KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product7ProteinsTextField.setEditable(false);
        product7ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product7ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product7ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product7ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product7ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product7ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product7Panel.add(product7ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product7FatsTextField.setEditable(false);
        product7FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product7FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product7FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product7FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product7FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product7FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product7Panel.add(product7FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product7CarbsTextField.setEditable(false);
        product7CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product7CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product7CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product7CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product7CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product7CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product7Panel.add(product7CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product7NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product7NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product7NameTextFieldBar.setOpaque(true);
        product7Panel.add(product7NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product7AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product7AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product7AmountTextFieldBar.setOpaque(true);
        product7Panel.add(product7AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product7KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product7KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product7KcalTextFieldBar.setOpaque(true);
        product7Panel.add(product7KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product7ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product7ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product7ProteinsTextFieldBar.setOpaque(true);
        product7Panel.add(product7ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product7FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product7FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product7FatsTextFieldBar.setOpaque(true);
        product7Panel.add(product7FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product7CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product7CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product7CarbsTextFieldBar.setOpaque(true);
        product7Panel.add(product7CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product7Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        product8Panel.setBackground(new java.awt.Color(57, 62, 70));
        product8Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product8Button.setBackground(new java.awt.Color(50, 54, 61));
        product8Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product8Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product8Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product8ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product8ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product8ButtonMouseExited(evt);
            }
        });

        product8ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product8ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product8ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product8ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product8ButtonLayout = new javax.swing.GroupLayout(product8Button);
        product8Button.setLayout(product8ButtonLayout);
        product8ButtonLayout.setHorizontalGroup(
            product8ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product8ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product8ButtonLayout.setVerticalGroup(
            product8ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product8ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product8ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product8Panel.add(product8Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product8NameTextField.setEditable(false);
        product8NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product8NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product8NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product8NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product8NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product8NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product8Panel.add(product8NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product8AmountTextField.setEditable(false);
        product8AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product8AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product8AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product8AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product8AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product8AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product8Panel.add(product8AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product8KcalTextField.setEditable(false);
        product8KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product8KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product8KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product8KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product8KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product8KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product8Panel.add(product8KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product8ProteinsTextField.setEditable(false);
        product8ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product8ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product8ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product8ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product8ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product8ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product8Panel.add(product8ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product8FatsTextField.setEditable(false);
        product8FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product8FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product8FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product8FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product8FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product8FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product8Panel.add(product8FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product8CarbsTextField.setEditable(false);
        product8CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product8CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product8CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product8CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product8CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product8CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product8Panel.add(product8CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product8NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product8NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product8NameTextFieldBar.setOpaque(true);
        product8Panel.add(product8NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product8AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product8AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product8AmountTextFieldBar.setOpaque(true);
        product8Panel.add(product8AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product8KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product8KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product8KcalTextFieldBar.setOpaque(true);
        product8Panel.add(product8KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product8ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product8ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product8ProteinsTextFieldBar.setOpaque(true);
        product8Panel.add(product8ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product8FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product8FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product8FatsTextFieldBar.setOpaque(true);
        product8Panel.add(product8FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product8CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product8CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product8CarbsTextFieldBar.setOpaque(true);
        product8Panel.add(product8CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product8Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 395, -1, -1));

        product9Panel.setBackground(new java.awt.Color(57, 62, 70));
        product9Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product9Button.setBackground(new java.awt.Color(50, 54, 61));
        product9Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product9Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product9Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product9ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product9ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product9ButtonMouseExited(evt);
            }
        });

        product9ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product9ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product9ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product9ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product9ButtonLayout = new javax.swing.GroupLayout(product9Button);
        product9Button.setLayout(product9ButtonLayout);
        product9ButtonLayout.setHorizontalGroup(
            product9ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product9ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product9ButtonLayout.setVerticalGroup(
            product9ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product9ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product9ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product9Panel.add(product9Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product9NameTextField.setEditable(false);
        product9NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product9NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product9NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product9NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product9NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product9NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product9Panel.add(product9NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product9AmountTextField.setEditable(false);
        product9AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product9AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product9AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product9AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product9AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product9AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product9Panel.add(product9AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product9KcalTextField.setEditable(false);
        product9KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product9KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product9KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product9KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product9KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product9KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product9Panel.add(product9KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product9ProteinsTextField.setEditable(false);
        product9ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product9ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product9ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product9ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product9ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product9ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product9Panel.add(product9ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product9FatsTextField.setEditable(false);
        product9FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product9FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product9FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product9FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product9FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product9FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product9Panel.add(product9FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product9CarbsTextField.setEditable(false);
        product9CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product9CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product9CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product9CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product9CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product9CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product9Panel.add(product9CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product9NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product9NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product9NameTextFieldBar.setOpaque(true);
        product9Panel.add(product9NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product9AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product9AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product9AmountTextFieldBar.setOpaque(true);
        product9Panel.add(product9AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product9KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product9KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product9KcalTextFieldBar.setOpaque(true);
        product9Panel.add(product9KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product9ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product9ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product9ProteinsTextFieldBar.setOpaque(true);
        product9Panel.add(product9ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product9FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product9FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product9FatsTextFieldBar.setOpaque(true);
        product9Panel.add(product9FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product9CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product9CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product9CarbsTextFieldBar.setOpaque(true);
        product9Panel.add(product9CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product9Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        product10Panel.setBackground(new java.awt.Color(57, 62, 70));
        product10Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        product10Button.setBackground(new java.awt.Color(50, 54, 61));
        product10Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 117, 117)));
        product10Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product10Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product10ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                product10ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                product10ButtonMouseExited(evt);
            }
        });

        product10ButtonPlusSign.setFont(new java.awt.Font("Source Code Pro Black", 1, 20)); // NOI18N
        product10ButtonPlusSign.setForeground(new java.awt.Color(117, 117, 117));
        product10ButtonPlusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product10ButtonPlusSign.setText("+");

        javax.swing.GroupLayout product10ButtonLayout = new javax.swing.GroupLayout(product10Button);
        product10Button.setLayout(product10ButtonLayout);
        product10ButtonLayout.setHorizontalGroup(
            product10ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product10ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        product10ButtonLayout.setVerticalGroup(
            product10ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(product10ButtonLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(product10ButtonPlusSign, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        product10Panel.add(product10Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 20, 20));

        product10NameTextField.setEditable(false);
        product10NameTextField.setBackground(new java.awt.Color(57, 62, 70));
        product10NameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product10NameTextField.setForeground(new java.awt.Color(238, 238, 238));
        product10NameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product10NameTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product10NameTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product10Panel.add(product10NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 30));

        product10AmountTextField.setEditable(false);
        product10AmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        product10AmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product10AmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        product10AmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product10AmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product10AmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product10Panel.add(product10AmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        product10KcalTextField.setEditable(false);
        product10KcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        product10KcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product10KcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        product10KcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product10KcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product10KcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product10Panel.add(product10KcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        product10ProteinsTextField.setEditable(false);
        product10ProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product10ProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product10ProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product10ProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product10ProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product10ProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product10Panel.add(product10ProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        product10FatsTextField.setEditable(false);
        product10FatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product10FatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product10FatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product10FatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product10FatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product10FatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product10Panel.add(product10FatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        product10CarbsTextField.setEditable(false);
        product10CarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        product10CarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        product10CarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        product10CarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        product10CarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        product10CarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        product10Panel.add(product10CarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        product10NameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product10NameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product10NameTextFieldBar.setOpaque(true);
        product10Panel.add(product10NameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        product10AmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product10AmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product10AmountTextFieldBar.setOpaque(true);
        product10Panel.add(product10AmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        product10KcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product10KcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product10KcalTextFieldBar.setOpaque(true);
        product10Panel.add(product10KcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        product10ProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product10ProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product10ProteinsTextFieldBar.setOpaque(true);
        product10Panel.add(product10ProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        product10FatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product10FatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product10FatsTextFieldBar.setOpaque(true);
        product10Panel.add(product10FatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        product10CarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        product10CarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        product10CarbsTextFieldBar.setOpaque(true);
        product10Panel.add(product10CarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(product10Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 465, -1, -1));

        totalPanel.setBackground(new java.awt.Color(57, 62, 70));
        totalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalTextPanel.setBackground(new java.awt.Color(57, 62, 70));
        totalTextPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalText.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        totalText.setForeground(new java.awt.Color(238, 238, 238));
        totalText.setText("Ogółem:");
        totalTextPanel.add(totalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 80, 25));

        totalPanel.add(totalTextPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 2, 296, 26));

        totalAmountTextField.setEditable(false);
        totalAmountTextField.setBackground(new java.awt.Color(57, 62, 70));
        totalAmountTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        totalAmountTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalAmountTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        totalAmountTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalAmountTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        totalPanel.add(totalAmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 80, 30));

        totalKcalTextField.setEditable(false);
        totalKcalTextField.setBackground(new java.awt.Color(57, 62, 70));
        totalKcalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        totalKcalTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalKcalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        totalKcalTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalKcalTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        totalPanel.add(totalKcalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 30));

        totalProteinsTextField.setEditable(false);
        totalProteinsTextField.setBackground(new java.awt.Color(57, 62, 70));
        totalProteinsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        totalProteinsTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalProteinsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        totalProteinsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalProteinsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        totalPanel.add(totalProteinsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

        totalFatsTextField.setEditable(false);
        totalFatsTextField.setBackground(new java.awt.Color(57, 62, 70));
        totalFatsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        totalFatsTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalFatsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        totalFatsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalFatsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        totalPanel.add(totalFatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 30));

        totalCarbsTextField.setEditable(false);
        totalCarbsTextField.setBackground(new java.awt.Color(57, 62, 70));
        totalCarbsTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        totalCarbsTextField.setForeground(new java.awt.Color(238, 238, 238));
        totalCarbsTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 3, 3));
        totalCarbsTextField.setSelectedTextColor(new java.awt.Color(238, 238, 238));
        totalCarbsTextField.setSelectionColor(new java.awt.Color(57, 62, 70));
        totalPanel.add(totalCarbsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 80, 30));

        totalNameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        totalNameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        totalNameTextFieldBar.setOpaque(true);
        totalPanel.add(totalNameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 295, 1));

        totalAmountTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        totalAmountTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        totalAmountTextFieldBar.setOpaque(true);
        totalPanel.add(totalAmountTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 75, 1));

        totalKcalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        totalKcalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        totalKcalTextFieldBar.setOpaque(true);
        totalPanel.add(totalKcalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 30, 75, 1));

        totalProteinsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        totalProteinsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        totalProteinsTextFieldBar.setOpaque(true);
        totalPanel.add(totalProteinsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 30, 75, 1));

        totalFatsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        totalFatsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        totalFatsTextFieldBar.setOpaque(true);
        totalPanel.add(totalFatsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 75, 1));

        totalCarbsTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        totalCarbsTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        totalCarbsTextFieldBar.setOpaque(true);
        totalPanel.add(totalCarbsTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 30, 75, 1));

        mainPanel.add(totalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        cancelButton.setBackground(new java.awt.Color(57, 62, 70));
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

        mainPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 555, 90, 25));

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

        mainPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 555, 90, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addProductAction(JTextField nameField, JTextField amountField, JTextField kcalField, JTextField proteinsField, JTextField fatsField, JTextField carbsField) {
        this.selectProductDialog = new SelectProductDialog(null, true);
        try {
            selectProductDialog.model.removeAllElements();
            DatabaseOperations.loadProductNames(null);
            for(String productName : LoginSession.productNames) {
                selectProductDialog.model.addElement(productName);
            }
            selectProductDialog.productList.setModel(selectProductDialog.model);
            setColorsDark();
            selectProductDialog.setVisible(true);
            while(true) {
                if(!selectProductDialog.isVisible())
                    break;
            }
            if(LoginSession.isProductAdded == true) {
                totalWeight += LoginSession.selectedProductWeight;
                totalKcal += LoginSession.selectedProductKcal;
                totalProteins += LoginSession.selectedProductProteins;
                totalFats += LoginSession.selectedProductFats;
                totalCarbs += LoginSession.selectedProductCarbs;
                setProductInfo(nameField, amountField, kcalField, proteinsField, fatsField, carbsField);
                productCount++;
                if(productCount == 1)
                    setAddProductButtonActive(product2Button, product2ButtonPlusSign);
                if(productCount == 2)
                    setAddProductButtonActive(product3Button, product3ButtonPlusSign);
                if(productCount == 3)
                    setAddProductButtonActive(product4Button, product4ButtonPlusSign);
                if(productCount == 4)
                    setAddProductButtonActive(product5Button, product5ButtonPlusSign);
                if(productCount == 5)
                    setAddProductButtonActive(product6Button, product6ButtonPlusSign);
                if(productCount == 6)
                    setAddProductButtonActive(product7Button, product7ButtonPlusSign);
                if(productCount == 7)
                    setAddProductButtonActive(product8Button, product8ButtonPlusSign);
                if(productCount == 8)
                    setAddProductButtonActive(product9Button, product9ButtonPlusSign);
                if(productCount == 9)
                    setAddProductButtonActive(product10Button, product10ButtonPlusSign);
            }
            setColorsNormal();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Database error: " + exception.getMessage());
        }
    }
    
    private void setProductInfo(JTextField nameField, JTextField amountField, JTextField kcalField, JTextField proteinsField, JTextField fatsField, JTextField carbsField) {
        nameField.setText(String.valueOf(LoginSession.selectedProductName));
        amountField.setText(String.valueOf(LoginSession.selectedProductWeight) + "g");
        kcalField.setText(String.valueOf(df.format(LoginSession.selectedProductKcal)) + " kcal");
        proteinsField.setText(String.valueOf(df.format(LoginSession.selectedProductProteins)) + "g");
        fatsField.setText(String.valueOf(df.format(LoginSession.selectedProductFats))+ "g");
        carbsField.setText(String.valueOf(df.format(LoginSession.selectedProductCarbs))+ "g");
        
        totalAmountTextField.setText(String.valueOf(totalWeight) + "g");
        totalKcalTextField.setText(String.valueOf(df.format(totalKcal)) + " kcal");
        totalProteinsTextField.setText(String.valueOf(df.format(totalProteins)) + "g");
        totalFatsTextField.setText(String.valueOf(df.format(totalFats))+ "g");
        totalCarbsTextField.setText(String.valueOf(df.format(totalCarbs))+ "g");
    }
    
    private void setAddProductButtonActive(JPanel button, JLabel plusSign) {
        Border coloredBorder = new LineBorder(Color.decode("#00ADB5"), 1, false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBorder(coloredBorder);
        plusSign.setForeground(Color.decode("#00ADB5"));
    }
    
    private void setColorsDark() {
        mainPanel.setBackground(Color.decode("#242528"));
        cancelButton.setBackground(Color.decode("#242528"));
        cancelButtonText.setForeground(Color.decode("#7F7F7F"));
        confirmButton.setBackground(Color.decode("#0D4749"));
        confirmButtonText.setForeground(Color.decode("#7F7F7F"));
        upperBar.setBackground(Color.decode("#0D4749"));
        leftBorder.setBackground(Color.decode("#131415"));
        rightBorder.setBackground(Color.decode("#131415"));
        lowerBorder.setBackground(Color.decode("#131415"));
        titleText.setForeground(Color.decode("#7F7F7F"));
    }
    
    private void setColorsNormal() {
        mainPanel.setBackground(Color.decode("#393E46"));
        cancelButton.setBackground(Color.decode("#393E46"));
        cancelButtonText.setForeground(Color.decode("#EEEEEE"));
        confirmButton.setBackground(Color.decode("#00ADB5"));
        confirmButtonText.setForeground(Color.decode("#EEEEEE"));
        upperBar.setBackground(Color.decode("#00ADB5"));
        leftBorder.setBackground(Color.decode("#52565D"));
        rightBorder.setBackground(Color.decode("#52565D"));
        lowerBorder.setBackground(Color.decode("#52565D"));
        titleText.setForeground(Color.decode("#EEEEEE"));
    }
    
    private void product1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1ButtonMouseClicked
        addProductAction(product1NameTextField, product1AmountTextField, product1KcalTextField, product1ProteinsTextField, product1FatsTextField, product1CarbsTextField);
    }//GEN-LAST:event_product1ButtonMouseClicked

    private void product1ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1ButtonMouseEntered
        product1Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product1ButtonMouseEntered

    private void product1ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product1ButtonMouseExited
        product1Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product1ButtonMouseExited

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(Color.decode("#42474F"));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(Color.decode("#393E46"));
    }//GEN-LAST:event_cancelButtonMouseExited

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
           confirmButtonClicked();
    }//GEN-LAST:event_confirmButtonMouseClicked
    
    private void confirmButtonClicked() {
        if(!(nameTextField.getText().equals("") || product1NameTextField.getText().equals(""))) {
            LoginSession.mealsNumber++;
            LoginSession.mealName = nameTextField.getText();
            LoginSession.mealKcal = totalKcal;
            LoginSession.mealProteins = totalProteins;
            LoginSession.mealFats = totalFats;
            LoginSession.mealCarbs = totalCarbs;
            
            dispose();
        } 
    }
    
    private void confirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseEntered
        confirmButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_confirmButtonMouseEntered

    private void confirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseExited
        confirmButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_confirmButtonMouseExited

    private void product2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product2ButtonMouseClicked
        if(productCount == 1)
            addProductAction(product2NameTextField, product2AmountTextField, product2KcalTextField, product2ProteinsTextField, product2FatsTextField, product2CarbsTextField);
    }//GEN-LAST:event_product2ButtonMouseClicked

    private void product2ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product2ButtonMouseEntered
        if(productCount == 1)
            product2Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product2ButtonMouseEntered

    private void product2ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product2ButtonMouseExited
        if(productCount == 1)
            product2Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product2ButtonMouseExited

    private void product3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product3ButtonMouseClicked
        if(productCount == 2)
            addProductAction(product3NameTextField, product3AmountTextField, product3KcalTextField, product3ProteinsTextField, product3FatsTextField, product3CarbsTextField);
    }//GEN-LAST:event_product3ButtonMouseClicked

    private void product3ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product3ButtonMouseEntered
        if(productCount == 2)
            product3Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product3ButtonMouseEntered

    private void product3ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product3ButtonMouseExited
        if(productCount == 2)
            product3Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product3ButtonMouseExited

    private void product4ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product4ButtonMouseClicked
        if(productCount == 3)
            addProductAction(product4NameTextField, product4AmountTextField, product4KcalTextField, product4ProteinsTextField, product4FatsTextField, product4CarbsTextField);
    }//GEN-LAST:event_product4ButtonMouseClicked

    private void product4ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product4ButtonMouseEntered
        if(productCount == 3)
            product4Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product4ButtonMouseEntered

    private void product4ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product4ButtonMouseExited
        if(productCount == 3)
            product4Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product4ButtonMouseExited

    private void product5ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product5ButtonMouseClicked
        if(productCount == 4)
            addProductAction(product5NameTextField, product5AmountTextField, product5KcalTextField, product5ProteinsTextField, product5FatsTextField, product5CarbsTextField);
    }//GEN-LAST:event_product5ButtonMouseClicked

    private void product5ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product5ButtonMouseEntered
        if(productCount == 4)
            product5Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product5ButtonMouseEntered

    private void product5ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product5ButtonMouseExited
        if(productCount == 4)
            product5Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product5ButtonMouseExited

    private void product6ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product6ButtonMouseClicked
        if(productCount == 5)
            addProductAction(product6NameTextField, product6AmountTextField, product6KcalTextField, product6ProteinsTextField, product6FatsTextField, product6CarbsTextField);
    }//GEN-LAST:event_product6ButtonMouseClicked

    private void product6ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product6ButtonMouseEntered
        if(productCount == 5)
            product6Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product6ButtonMouseEntered

    private void product6ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product6ButtonMouseExited
        if(productCount == 5)
            product6Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product6ButtonMouseExited

    private void product7ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product7ButtonMouseClicked
        if(productCount == 6)
            addProductAction(product7NameTextField, product7AmountTextField, product7KcalTextField, product7ProteinsTextField, product7FatsTextField, product7CarbsTextField);
    }//GEN-LAST:event_product7ButtonMouseClicked

    private void product7ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product7ButtonMouseEntered
        if(productCount == 6)
            product7Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product7ButtonMouseEntered

    private void product7ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product7ButtonMouseExited
        if(productCount == 6)
            product7Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product7ButtonMouseExited

    private void product8ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product8ButtonMouseClicked
        if(productCount == 7)
            addProductAction(product8NameTextField, product8AmountTextField, product8KcalTextField, product8ProteinsTextField, product8FatsTextField, product8CarbsTextField);
    }//GEN-LAST:event_product8ButtonMouseClicked

    private void product8ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product8ButtonMouseEntered
        if(productCount == 7)
            product8Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product8ButtonMouseEntered

    private void product8ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product8ButtonMouseExited
        if(productCount == 7)
            product8Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product8ButtonMouseExited

    private void product9ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product9ButtonMouseClicked
        if(productCount == 8)
            addProductAction(product9NameTextField, product9AmountTextField, product9KcalTextField, product9ProteinsTextField, product9FatsTextField, product9CarbsTextField);
    }//GEN-LAST:event_product9ButtonMouseClicked

    private void product9ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product9ButtonMouseEntered
        if(productCount == 8)
            product9Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product9ButtonMouseEntered

    private void product9ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product9ButtonMouseExited
        if(productCount == 8)
            product9Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product9ButtonMouseExited

    private void product10ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product10ButtonMouseClicked
        if(productCount == 9)
            addProductAction(product10NameTextField, product10AmountTextField, product10KcalTextField, product10ProteinsTextField, product10FatsTextField, product10CarbsTextField);
    }//GEN-LAST:event_product10ButtonMouseClicked

    private void product10ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product10ButtonMouseEntered
        if(productCount == 9)
            product10Button.setBackground(Color.decode("#2D2F33"));
    }//GEN-LAST:event_product10ButtonMouseEntered

    private void product10ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product10ButtonMouseExited
        if(productCount == 9)
            product10Button.setBackground(Color.decode("#32363D"));
    }//GEN-LAST:event_product10ButtonMouseExited

    private void nameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyPressed
        val.lettersAndNumbersVal(evt, nameTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            confirmButtonClicked();
    }//GEN-LAST:event_nameTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(AddMealDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMealDialog dialog = new AddMealDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel cancelButton;
    private javax.swing.JLabel cancelButtonText;
    private javax.swing.JLabel carbsText;
    private javax.swing.JPanel confirmButton;
    private javax.swing.JLabel confirmButtonText;
    private javax.swing.JLabel fatsText;
    private javax.swing.JLabel kcalText;
    private javax.swing.JLabel leftBorder;
    private javax.swing.JLabel lowerBorder;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameTextFieldBar;
    private javax.swing.JTextField product10AmountTextField;
    private javax.swing.JLabel product10AmountTextFieldBar;
    private javax.swing.JPanel product10Button;
    private javax.swing.JLabel product10ButtonPlusSign;
    private javax.swing.JTextField product10CarbsTextField;
    private javax.swing.JLabel product10CarbsTextFieldBar;
    private javax.swing.JTextField product10FatsTextField;
    private javax.swing.JLabel product10FatsTextFieldBar;
    private javax.swing.JTextField product10KcalTextField;
    private javax.swing.JLabel product10KcalTextFieldBar;
    private javax.swing.JTextField product10NameTextField;
    private javax.swing.JLabel product10NameTextFieldBar;
    private javax.swing.JPanel product10Panel;
    private javax.swing.JTextField product10ProteinsTextField;
    private javax.swing.JLabel product10ProteinsTextFieldBar;
    private javax.swing.JTextField product1AmountTextField;
    private javax.swing.JLabel product1AmountTextFieldBar;
    private javax.swing.JPanel product1Button;
    private javax.swing.JLabel product1ButtonPlusSign;
    private javax.swing.JTextField product1CarbsTextField;
    private javax.swing.JLabel product1CarbsTextFieldBar;
    private javax.swing.JTextField product1FatsTextField;
    private javax.swing.JLabel product1FatsTextFieldBar;
    private javax.swing.JTextField product1KcalTextField;
    private javax.swing.JLabel product1KcalTextFieldBar;
    private javax.swing.JTextField product1NameTextField;
    private javax.swing.JLabel product1NameTextFieldBar;
    private javax.swing.JPanel product1Panel;
    private javax.swing.JTextField product1ProteinsTextField;
    private javax.swing.JLabel product1ProteinsTextFieldBar;
    private javax.swing.JTextField product2AmountTextField;
    private javax.swing.JLabel product2AmountTextFieldBar;
    private javax.swing.JPanel product2Button;
    private javax.swing.JLabel product2ButtonPlusSign;
    private javax.swing.JTextField product2CarbsTextField;
    private javax.swing.JLabel product2CarbsTextFieldBar;
    private javax.swing.JTextField product2FatsTextField;
    private javax.swing.JLabel product2FatsTextFieldBar;
    private javax.swing.JTextField product2KcalTextField;
    private javax.swing.JLabel product2KcalTextFieldBar;
    private javax.swing.JTextField product2NameTextField;
    private javax.swing.JLabel product2NameTextFieldBar;
    private javax.swing.JPanel product2Panel;
    private javax.swing.JTextField product2ProteinsTextField;
    private javax.swing.JLabel product2ProteinsTextFieldBar;
    private javax.swing.JTextField product3AmountTextField;
    private javax.swing.JLabel product3AmountTextFieldBar;
    private javax.swing.JPanel product3Button;
    private javax.swing.JLabel product3ButtonPlusSign;
    private javax.swing.JTextField product3CarbsTextField;
    private javax.swing.JLabel product3CarbsTextFieldBar;
    private javax.swing.JTextField product3FatsTextField;
    private javax.swing.JLabel product3FatsTextFieldBar;
    private javax.swing.JTextField product3KcalTextField;
    private javax.swing.JLabel product3KcalTextFieldBar;
    private javax.swing.JTextField product3NameTextField;
    private javax.swing.JLabel product3NameTextFieldBar;
    private javax.swing.JPanel product3Panel;
    private javax.swing.JTextField product3ProteinsTextField;
    private javax.swing.JLabel product3ProteinsTextFieldBar;
    private javax.swing.JTextField product4AmountTextField;
    private javax.swing.JLabel product4AmountTextFieldBar;
    private javax.swing.JPanel product4Button;
    private javax.swing.JLabel product4ButtonPlusSign;
    private javax.swing.JTextField product4CarbsTextField;
    private javax.swing.JLabel product4CarbsTextFieldBar;
    private javax.swing.JTextField product4FatsTextField;
    private javax.swing.JLabel product4FatsTextFieldBar;
    private javax.swing.JTextField product4KcalTextField;
    private javax.swing.JLabel product4KcalTextFieldBar;
    private javax.swing.JTextField product4NameTextField;
    private javax.swing.JLabel product4NameTextFieldBar;
    private javax.swing.JPanel product4Panel;
    private javax.swing.JTextField product4ProteinsTextField;
    private javax.swing.JLabel product4ProteinsTextFieldBar;
    private javax.swing.JTextField product5AmountTextField;
    private javax.swing.JLabel product5AmountTextFieldBar;
    private javax.swing.JPanel product5Button;
    private javax.swing.JLabel product5ButtonPlusSign;
    private javax.swing.JTextField product5CarbsTextField;
    private javax.swing.JLabel product5CarbsTextFieldBar;
    private javax.swing.JTextField product5FatsTextField;
    private javax.swing.JLabel product5FatsTextFieldBar;
    private javax.swing.JTextField product5KcalTextField;
    private javax.swing.JLabel product5KcalTextFieldBar;
    private javax.swing.JTextField product5NameTextField;
    private javax.swing.JLabel product5NameTextFieldBar;
    private javax.swing.JPanel product5Panel;
    private javax.swing.JTextField product5ProteinsTextField;
    private javax.swing.JLabel product5ProteinsTextFieldBar;
    private javax.swing.JTextField product6AmountTextField;
    private javax.swing.JLabel product6AmountTextFieldBar;
    private javax.swing.JPanel product6Button;
    private javax.swing.JLabel product6ButtonPlusSign;
    private javax.swing.JTextField product6CarbsTextField;
    private javax.swing.JLabel product6CarbsTextFieldBar;
    private javax.swing.JTextField product6FatsTextField;
    private javax.swing.JLabel product6FatsTextFieldBar;
    private javax.swing.JTextField product6KcalTextField;
    private javax.swing.JLabel product6KcalTextFieldBar;
    private javax.swing.JTextField product6NameTextField;
    private javax.swing.JLabel product6NameTextFieldBar;
    private javax.swing.JPanel product6Panel;
    private javax.swing.JTextField product6ProteinsTextField;
    private javax.swing.JLabel product6ProteinsTextFieldBar;
    private javax.swing.JTextField product7AmountTextField;
    private javax.swing.JLabel product7AmountTextFieldBar;
    private javax.swing.JPanel product7Button;
    private javax.swing.JLabel product7ButtonPlusSign;
    private javax.swing.JTextField product7CarbsTextField;
    private javax.swing.JLabel product7CarbsTextFieldBar;
    private javax.swing.JTextField product7FatsTextField;
    private javax.swing.JLabel product7FatsTextFieldBar;
    private javax.swing.JTextField product7KcalTextField;
    private javax.swing.JLabel product7KcalTextFieldBar;
    private javax.swing.JTextField product7NameTextField;
    private javax.swing.JLabel product7NameTextFieldBar;
    private javax.swing.JPanel product7Panel;
    private javax.swing.JTextField product7ProteinsTextField;
    private javax.swing.JLabel product7ProteinsTextFieldBar;
    private javax.swing.JTextField product8AmountTextField;
    private javax.swing.JLabel product8AmountTextFieldBar;
    private javax.swing.JPanel product8Button;
    private javax.swing.JLabel product8ButtonPlusSign;
    private javax.swing.JTextField product8CarbsTextField;
    private javax.swing.JLabel product8CarbsTextFieldBar;
    private javax.swing.JTextField product8FatsTextField;
    private javax.swing.JLabel product8FatsTextFieldBar;
    private javax.swing.JTextField product8KcalTextField;
    private javax.swing.JLabel product8KcalTextFieldBar;
    private javax.swing.JTextField product8NameTextField;
    private javax.swing.JLabel product8NameTextFieldBar;
    private javax.swing.JPanel product8Panel;
    private javax.swing.JTextField product8ProteinsTextField;
    private javax.swing.JLabel product8ProteinsTextFieldBar;
    private javax.swing.JTextField product9AmountTextField;
    private javax.swing.JLabel product9AmountTextFieldBar;
    private javax.swing.JPanel product9Button;
    private javax.swing.JLabel product9ButtonPlusSign;
    private javax.swing.JTextField product9CarbsTextField;
    private javax.swing.JLabel product9CarbsTextFieldBar;
    private javax.swing.JTextField product9FatsTextField;
    private javax.swing.JLabel product9FatsTextFieldBar;
    private javax.swing.JTextField product9KcalTextField;
    private javax.swing.JLabel product9KcalTextFieldBar;
    private javax.swing.JTextField product9NameTextField;
    private javax.swing.JLabel product9NameTextFieldBar;
    private javax.swing.JPanel product9Panel;
    private javax.swing.JTextField product9ProteinsTextField;
    private javax.swing.JLabel product9ProteinsTextFieldBar;
    private javax.swing.JLabel productText;
    private javax.swing.JLabel proteinsText;
    private javax.swing.JLabel rightBorder;
    private javax.swing.JLabel titleText;
    private javax.swing.JTextField totalAmountTextField;
    private javax.swing.JLabel totalAmountTextFieldBar;
    private javax.swing.JTextField totalCarbsTextField;
    private javax.swing.JLabel totalCarbsTextFieldBar;
    private javax.swing.JTextField totalFatsTextField;
    private javax.swing.JLabel totalFatsTextFieldBar;
    private javax.swing.JTextField totalKcalTextField;
    private javax.swing.JLabel totalKcalTextFieldBar;
    private javax.swing.JLabel totalNameTextFieldBar;
    private javax.swing.JPanel totalPanel;
    private javax.swing.JTextField totalProteinsTextField;
    private javax.swing.JLabel totalProteinsTextFieldBar;
    private javax.swing.JLabel totalText;
    private javax.swing.JPanel totalTextPanel;
    private javax.swing.JLabel upperBar;
    // End of variables declaration//GEN-END:variables
}
