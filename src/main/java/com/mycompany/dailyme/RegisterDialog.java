package com.mycompany.dailyme;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class RegisterDialog extends javax.swing.JDialog {

    private final Validators val;

    private boolean loginCorrect = false;
    private boolean passwordCorrect = false;
    private boolean emailCorrect = false;
    private String passwordStr = null;
    private String passwordConfirmStr = null;
    private double weight;
    private int height;
    private int age;
    private int gender = 0;
    private TextMessageDialog msgDialog;
    
    /**
     * Creates new form RegisterDialog
     * @param parent
     * @param modal
     */
    public RegisterDialog(java.awt.Frame parent, boolean modal) {
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
        titleText = new javax.swing.JLabel();
        loginText = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        loginTextFieldBar = new javax.swing.JLabel();
        loginWarningText = new javax.swing.JLabel();
        loginCorrectText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordFieldBar = new javax.swing.JLabel();
        confirmPasswordText = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        confirmPasswordFieldBar = new javax.swing.JLabel();
        passwordWarningText = new javax.swing.JLabel();
        passwordCorrectText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailTextFieldBar = new javax.swing.JLabel();
        emailWarningText = new javax.swing.JLabel();
        emailCorrectText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameTextFieldBar = new javax.swing.JLabel();
        ageText = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        ageTextFieldBar = new javax.swing.JLabel();
        genderText = new javax.swing.JLabel();
        weightText = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        weightTextFieldBar = new javax.swing.JLabel();
        heightText = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        heightTextFieldBar = new javax.swing.JLabel();
        goalText = new javax.swing.JLabel();
        goalTextField = new javax.swing.JTextField();
        goalTextFieldBar = new javax.swing.JLabel();
        selectGenderButton = new javax.swing.JPanel();
        selectGenderFemaleButton = new javax.swing.JPanel();
        selectGenderFemaleButtonText = new javax.swing.JLabel();
        selectGenderMaleButton = new javax.swing.JPanel();
        selectGenderMaleButtonText = new javax.swing.JLabel();
        cancelButton = new javax.swing.JPanel();
        cancelButtonText = new javax.swing.JLabel();
        registerButton = new javax.swing.JPanel();
        registerButtonText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("registerDialog"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(57, 62, 70));
        mainPanel.setForeground(new java.awt.Color(238, 238, 238));
        mainPanel.setMaximumSize(new java.awt.Dimension(510, 600));
        loginWarningText.setVisible(false);
        passwordWarningText.setVisible(false);
        emailWarningText.setVisible(false);
        loginCorrectText.setVisible(false);
        passwordCorrectText.setVisible(false);
        emailCorrectText.setVisible(false);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperBar.setBackground(new java.awt.Color(0, 173, 181));
        upperBar.setOpaque(true);
        mainPanel.add(upperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 1));

        titleText.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        titleText.setForeground(new java.awt.Color(238, 238, 238));
        titleText.setText("Rejestracja");
        mainPanel.add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 410, 60));

        loginText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        loginText.setForeground(new java.awt.Color(238, 238, 238));
        loginText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginText.setText("Login:");
        mainPanel.add(loginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, -1));

        loginTextField.setBackground(new java.awt.Color(57, 62, 70));
        loginTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        loginTextField.setForeground(new java.awt.Color(238, 238, 238));
        loginTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loginTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        loginTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        loginTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loginTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        loginTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        loginTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginTextFieldKeyReleased(evt);
            }
        });
        mainPanel.add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 300, 30));

        loginTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        loginTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        loginTextFieldBar.setOpaque(true);
        mainPanel.add(loginTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 280, 1));

        loginWarningText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        loginWarningText.setForeground(new java.awt.Color(244, 120, 120));
        loginWarningText.setText("Podany login jest już zajęty.");
        mainPanel.add(loginWarningText, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 115, -1, -1));

        loginCorrectText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        loginCorrectText.setForeground(new java.awt.Color(71, 208, 130));
        loginCorrectText.setText("Podany login jest dostępny.");
        mainPanel.add(loginCorrectText, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 115, -1, -1));

        passwordText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        passwordText.setForeground(new java.awt.Color(238, 238, 238));
        passwordText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordText.setText("Hasło:");
        mainPanel.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 160, -1));

        passwordField.setBackground(new java.awt.Color(57, 62, 70));
        passwordField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(238, 238, 238));
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        passwordField.setCaretColor(new java.awt.Color(238, 238, 238));
        passwordField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        passwordField.setSelectionColor(new java.awt.Color(0, 173, 181));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });
        mainPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 300, 30));

        passwordFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        passwordFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        passwordFieldBar.setOpaque(true);
        mainPanel.add(passwordFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 280, 1));

        confirmPasswordText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        confirmPasswordText.setForeground(new java.awt.Color(238, 238, 238));
        confirmPasswordText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        confirmPasswordText.setText("Powtórz hasło:");
        mainPanel.add(confirmPasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, -1));

        confirmPasswordField.setBackground(new java.awt.Color(57, 62, 70));
        confirmPasswordField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(238, 238, 238));
        confirmPasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        confirmPasswordField.setCaretColor(new java.awt.Color(238, 238, 238));
        confirmPasswordField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        confirmPasswordField.setSelectionColor(new java.awt.Color(0, 173, 181));
        confirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmPasswordFieldKeyReleased(evt);
            }
        });
        mainPanel.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 300, 30));

        confirmPasswordFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        confirmPasswordFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        confirmPasswordFieldBar.setOpaque(true);
        mainPanel.add(confirmPasswordFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 280, 1));

        passwordWarningText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        passwordWarningText.setForeground(new java.awt.Color(244, 120, 120));
        passwordWarningText.setText("Podane hasła się różnią.");
        mainPanel.add(passwordWarningText, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 215, -1, -1));

        passwordCorrectText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        passwordCorrectText.setForeground(new java.awt.Color(71, 208, 130));
        passwordCorrectText.setText("Podane hasła są poprawne.");
        mainPanel.add(passwordCorrectText, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 215, -1, -1));

        emailText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        emailText.setForeground(new java.awt.Color(238, 238, 238));
        emailText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailText.setText("E-mail:");
        mainPanel.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, -1));

        emailTextField.setBackground(new java.awt.Color(57, 62, 70));
        emailTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(238, 238, 238));
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        emailTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        emailTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        emailTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });
        mainPanel.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 300, 30));

        emailTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        emailTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        emailTextFieldBar.setOpaque(true);
        mainPanel.add(emailTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 280, 1));

        emailWarningText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        emailWarningText.setForeground(new java.awt.Color(244, 120, 120));
        emailWarningText.setText("Podany e-mail jest już zajęty.");
        mainPanel.add(emailWarningText, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 275, -1, -1));

        emailCorrectText.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        emailCorrectText.setForeground(new java.awt.Color(71, 208, 130));
        emailCorrectText.setText("Podany e-mail jest dostępny.");
        mainPanel.add(emailCorrectText, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 275, -1, -1));

        nameText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nameText.setForeground(new java.awt.Color(238, 238, 238));
        nameText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameText.setText("Imię:");
        mainPanel.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 160, -1));

        nameTextField.setBackground(new java.awt.Color(57, 62, 70));
        nameTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(238, 238, 238));
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        nameTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        nameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        nameTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyPressed(evt);
            }
        });
        mainPanel.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 300, 30));

        nameTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        nameTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        nameTextFieldBar.setOpaque(true);
        mainPanel.add(nameTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 280, 1));

        ageText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ageText.setForeground(new java.awt.Color(238, 238, 238));
        ageText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageText.setText("Wiek:");
        mainPanel.add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 160, -1));

        ageTextField.setBackground(new java.awt.Color(57, 62, 70));
        ageTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ageTextField.setForeground(new java.awt.Color(238, 238, 238));
        ageTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ageTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        ageTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        ageTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ageTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        ageTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyPressed(evt);
            }
        });
        mainPanel.add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 80, 30));

        ageTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        ageTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        ageTextFieldBar.setOpaque(true);
        mainPanel.add(ageTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 60, 1));

        genderText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        genderText.setForeground(new java.awt.Color(238, 238, 238));
        genderText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderText.setText("Płeć:");
        mainPanel.add(genderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 160, -1));

        weightText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        weightText.setForeground(new java.awt.Color(238, 238, 238));
        weightText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        weightText.setText("Waga (kg):");
        mainPanel.add(weightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 160, -1));

        weightTextField.setBackground(new java.awt.Color(57, 62, 70));
        weightTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        weightTextField.setForeground(new java.awt.Color(238, 238, 238));
        weightTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        weightTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        weightTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        weightTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        weightTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        weightTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        weightTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                weightTextFieldKeyPressed(evt);
            }
        });
        mainPanel.add(weightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 80, 30));

        weightTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        weightTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        weightTextFieldBar.setOpaque(true);
        mainPanel.add(weightTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 60, 1));

        heightText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        heightText.setForeground(new java.awt.Color(238, 238, 238));
        heightText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        heightText.setText("Wzrost (cm):");
        mainPanel.add(heightText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 160, -1));

        heightTextField.setBackground(new java.awt.Color(57, 62, 70));
        heightTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        heightTextField.setForeground(new java.awt.Color(238, 238, 238));
        heightTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        heightTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        heightTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        heightTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        heightTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        heightTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        heightTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                heightTextFieldKeyPressed(evt);
            }
        });
        mainPanel.add(heightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 80, 30));

        heightTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        heightTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        heightTextFieldBar.setOpaque(true);
        mainPanel.add(heightTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 60, 1));

        goalText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        goalText.setForeground(new java.awt.Color(238, 238, 238));
        goalText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        goalText.setText("Cel (kg):");
        mainPanel.add(goalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 160, -1));

        goalTextField.setBackground(new java.awt.Color(57, 62, 70));
        goalTextField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        goalTextField.setForeground(new java.awt.Color(238, 238, 238));
        goalTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        goalTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        goalTextField.setCaretColor(new java.awt.Color(238, 238, 238));
        goalTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        goalTextField.setMargin(new java.awt.Insets(2, 15, 2, 2));
        goalTextField.setSelectionColor(new java.awt.Color(0, 173, 181));
        goalTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goalTextFieldKeyPressed(evt);
            }
        });
        mainPanel.add(goalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 80, 30));

        goalTextFieldBar.setBackground(new java.awt.Color(91, 97, 110));
        goalTextFieldBar.setForeground(new java.awt.Color(57, 62, 70));
        goalTextFieldBar.setOpaque(true);
        mainPanel.add(goalTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 60, 1));

        selectGenderButton.setBackground(new java.awt.Color(66, 71, 79));
        selectGenderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectGenderButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectGenderFemaleButton.setBackground(new java.awt.Color(66, 71, 79));
        selectGenderFemaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectGenderFemaleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectGenderFemaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectGenderFemaleButtonMouseExited(evt);
            }
        });
        selectGenderFemaleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectGenderFemaleButtonText.setBackground(new java.awt.Color(0, 173, 181));
        selectGenderFemaleButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        selectGenderFemaleButtonText.setForeground(new java.awt.Color(238, 238, 238));
        selectGenderFemaleButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectGenderFemaleButtonText.setText("Kobieta");
        selectGenderFemaleButtonText.setOpaque(true);
        selectGenderFemaleButton.add(selectGenderFemaleButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 97, 26));

        selectGenderButton.add(selectGenderFemaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 97, 26));

        selectGenderMaleButton.setBackground(new java.awt.Color(66, 71, 79));
        selectGenderMaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectGenderMaleButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectGenderMaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectGenderMaleButtonMouseExited(evt);
            }
        });
        selectGenderMaleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectGenderMaleButtonText.setBackground(new java.awt.Color(0, 173, 181));
        selectGenderMaleButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        selectGenderMaleButtonText.setForeground(new java.awt.Color(238, 238, 238));
        selectGenderMaleButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectGenderMaleButtonText.setText("Mężczyzna");
        selectGenderMaleButton.add(selectGenderMaleButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 97, 26));

        selectGenderButton.add(selectGenderMaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 2, 97, 26));

        mainPanel.add(selectGenderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 500, 203, 30));

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

        mainPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 560, 90, 25));

        registerButton.setBackground(new java.awt.Color(0, 173, 181));
        registerButton.setForeground(new java.awt.Color(238, 238, 238));
        registerButton.setToolTipText("");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        registerButtonText.setForeground(new java.awt.Color(238, 238, 238));
        registerButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerButtonText.setText("Zarejestruj");
        registerButton.add(registerButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        mainPanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 90, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void repaintSelectGenderButtons() {
        selectGenderFemaleButton.repaint();
        selectGenderMaleButton.repaint();
    }
    
    private void emptyFields() {
        loginTextField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        emailTextField.setText("");
        nameTextField.setText("");
        ageTextField.setText("");
        weightTextField.setText("");
        heightTextField.setText("");
        goalTextField.setText("");
        selectGenderFemaleButtonText.setOpaque(true);
        selectGenderMaleButtonText.setOpaque(false);
        repaintSelectGenderButtons();
        gender = 0;
    }
    
    private boolean isNicknameAvailable(String nickname) {
        try {
            if(DatabaseOperations.checkNicknames(nickname, null)) {
                if(nickname.equals(LoginSession.nicknameFound))
                    return false;
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Database error: " + exception.getMessage());
        }
        return true;
    }
    
    private boolean isEmailAvailable(String email) {
        try {
            if(DatabaseOperations.checkEmails(email, null)) {
                if(email.equals(LoginSession.emailFound))
                    return false;
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Database error: " + exception.getMessage());
        }
        return true;
    }
    
    private boolean isPasswordCorrect(String password1, String password2) {
        return password1.equals(password2);
    }
    
    private boolean areFieldsFilled() {
        if(!(loginTextField.getText().equals("") || (passwordField.getPassword().length == 0) || 
                (confirmPasswordField.getPassword().length == 0) || emailTextField.getText().equals("") ||
                nameTextField.getText().equals("") || ageTextField.getText().equals("") || 
                weightTextField.getText().equals("") || heightTextField.getText().equals("") ||
                goalTextField.getText().equals(""))) 
            return true;
        else
            return false;
    }
    
    private void registerButtonClicked() {
        if(loginCorrect && passwordCorrect && emailCorrect && areFieldsFilled()) {         
            String usernameStr = loginTextField.getText();
            passwordStr = new String(passwordField.getPassword());
            String emailStr = emailTextField.getText();
            String nameStr = nameTextField.getText();
            age = Integer.parseInt(ageTextField.getText());
            weight = Double.parseDouble(weightTextField.getText());
            height = Integer.parseInt(heightTextField.getText());
            double goal = Double.parseDouble(goalTextField.getText());

            try {
                DatabaseOperations.register(usernameStr, passwordStr, emailStr, nameStr, age, weight, height, goal, gender, null);
                this.msgDialog = new TextMessageDialog(null, true, 1);
                msgDialog.setVisible(true);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Database error: " + exception.getMessage());
            }
                emptyFields();
                dispose();
        }
    }
    
    private void loginTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginTextFieldKeyPressed
        val.limitCharVal(evt, loginTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_loginTextFieldKeyPressed

    private void loginTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginTextFieldKeyReleased
        if(isNicknameAvailable(loginTextField.getText())) {
            loginWarningText.setVisible(false);
            loginCorrectText.setVisible(true);
            loginCorrect = true;
        }
        else if(!isNicknameAvailable(loginTextField.getText())) {
            loginWarningText.setVisible(true);
            loginCorrectText.setVisible(false);
            loginCorrect = false;
        }
    }//GEN-LAST:event_loginTextFieldKeyReleased

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        passwordStr = new String(passwordField.getPassword());
        passwordConfirmStr = new String(confirmPasswordField.getPassword());
        if(isPasswordCorrect(passwordStr, passwordConfirmStr)) {
            passwordWarningText.setVisible(false);
            passwordCorrectText.setVisible(true);
            passwordCorrect = true;
        }
        else if(!isPasswordCorrect(passwordStr, passwordConfirmStr)) {
            passwordWarningText.setVisible(true);
            passwordCorrectText.setVisible(false);
            passwordCorrect = false;
        }
    }//GEN-LAST:event_passwordFieldKeyReleased

    private void confirmPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_confirmPasswordFieldKeyPressed

    private void confirmPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordFieldKeyReleased
        passwordStr = new String(passwordField.getPassword());
        passwordConfirmStr = new String(confirmPasswordField.getPassword());
        if(isPasswordCorrect(passwordStr, passwordConfirmStr)) {
            passwordWarningText.setVisible(false);
            passwordCorrectText.setVisible(true);
            passwordCorrect = true;
        }
        else if(!isPasswordCorrect(passwordStr, passwordConfirmStr)) {
            passwordWarningText.setVisible(true);
            passwordCorrectText.setVisible(false);
            passwordCorrect = false;
        }
    }//GEN-LAST:event_confirmPasswordFieldKeyReleased

    private void emailTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyPressed
        val.limitCharVal(evt, emailTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_emailTextFieldKeyPressed

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        if(isEmailAvailable(emailTextField.getText())) {
            emailWarningText.setVisible(false);
            emailCorrectText.setVisible(true);
            emailCorrect = true;
        }
        else if(!isEmailAvailable(emailTextField.getText())) {
            emailWarningText.setVisible(true);
            emailCorrectText.setVisible(false);
            emailCorrect = false;
        }
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void nameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyPressed
        val.lettersVal(evt, nameTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_nameTextFieldKeyPressed

    private void ageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyPressed
        val.intNumberVal(evt, ageTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_ageTextFieldKeyPressed

    private void weightTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightTextFieldKeyPressed
        val.floatNumberVal(evt, weightTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_weightTextFieldKeyPressed

    private void heightTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightTextFieldKeyPressed
        val.intNumberVal(evt, heightTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_heightTextFieldKeyPressed

    private void goalTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goalTextFieldKeyPressed
        val.floatNumberVal(evt, goalTextField);
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER)
            registerButtonClicked();
    }//GEN-LAST:event_goalTextFieldKeyPressed

    private void selectGenderFemaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGenderFemaleButtonMouseClicked
        selectGenderFemaleButtonText.setOpaque(true);
        selectGenderMaleButtonText.setOpaque(false);
        repaintSelectGenderButtons();
        gender = 0;
    }//GEN-LAST:event_selectGenderFemaleButtonMouseClicked

    private void selectGenderFemaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGenderFemaleButtonMouseEntered
        selectGenderFemaleButton.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_selectGenderFemaleButtonMouseEntered

    private void selectGenderFemaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGenderFemaleButtonMouseExited
        selectGenderFemaleButton.setBackground(Color.decode("#42474F"));
    }//GEN-LAST:event_selectGenderFemaleButtonMouseExited

    private void selectGenderMaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGenderMaleButtonMouseClicked
        selectGenderMaleButtonText.setOpaque(true);
        selectGenderFemaleButtonText.setOpaque(false);
        repaintSelectGenderButtons();
        gender = 1;
    }//GEN-LAST:event_selectGenderMaleButtonMouseClicked

    private void selectGenderMaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGenderMaleButtonMouseEntered
        selectGenderMaleButton.setBackground(Color.decode("#444952"));
    }//GEN-LAST:event_selectGenderMaleButtonMouseEntered

    private void selectGenderMaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectGenderMaleButtonMouseExited
        selectGenderMaleButton.setBackground(Color.decode("#42474F"));
    }//GEN-LAST:event_selectGenderMaleButtonMouseExited

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        emptyFields();
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(Color.decode("#42474F"));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(Color.decode("#393E46"));
    }//GEN-LAST:event_cancelButtonMouseExited

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        registerButtonClicked();
    }//GEN-LAST:event_registerButtonMouseClicked

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_registerButtonMouseExited

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
            java.util.logging.Logger.getLogger(RegisterDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterDialog dialog = new RegisterDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel ageText;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel ageTextFieldBar;
    private javax.swing.JPanel cancelButton;
    private javax.swing.JLabel cancelButtonText;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordFieldBar;
    private javax.swing.JLabel confirmPasswordText;
    private javax.swing.JLabel emailCorrectText;
    private javax.swing.JLabel emailText;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailTextFieldBar;
    private javax.swing.JLabel emailWarningText;
    private javax.swing.JLabel genderText;
    private javax.swing.JLabel goalText;
    private javax.swing.JTextField goalTextField;
    private javax.swing.JLabel goalTextFieldBar;
    private javax.swing.JLabel heightText;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel heightTextFieldBar;
    private javax.swing.JLabel loginCorrectText;
    private javax.swing.JLabel loginText;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel loginTextFieldBar;
    private javax.swing.JLabel loginWarningText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameTextFieldBar;
    private javax.swing.JLabel passwordCorrectText;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordFieldBar;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel passwordWarningText;
    private javax.swing.JPanel registerButton;
    private javax.swing.JLabel registerButtonText;
    private javax.swing.JPanel selectGenderButton;
    private javax.swing.JPanel selectGenderFemaleButton;
    private javax.swing.JLabel selectGenderFemaleButtonText;
    private javax.swing.JPanel selectGenderMaleButton;
    private javax.swing.JLabel selectGenderMaleButtonText;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel upperBar;
    private javax.swing.JLabel weightText;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JLabel weightTextFieldBar;
    // End of variables declaration//GEN-END:variables
}
