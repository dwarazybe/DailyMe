package client;

import java.awt.Color;


public class TextMessageDialog extends javax.swing.JDialog {
    
    protected static int msgType = 1;
    
    public TextMessageDialog(java.awt.Frame parent, boolean modal, int msgType) {
        super(parent, modal);
        this.msgType = msgType;
        initComponents();
        setMessage(msgType);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        upperBar = new javax.swing.JLabel();
        leftBorder = new javax.swing.JLabel();
        rightBorder = new javax.swing.JLabel();
        lowerBorder = new javax.swing.JLabel();
        returnButton = new javax.swing.JPanel();
        returnButtonText = new javax.swing.JLabel();
        messagePositiveIcon = new javax.swing.JLabel();
        messageNegativeIcon = new javax.swing.JLabel();
        mealsLimitTextPanel = new javax.swing.JPanel();
        mealsLimitMessageText1 = new javax.swing.JLabel();
        mealsLimitMessageText2 = new javax.swing.JLabel();
        registeredTextPanel = new javax.swing.JPanel();
        registeredMessageText1 = new javax.swing.JLabel();
        mealDiaryAddedTextPanel = new javax.swing.JPanel();
        mealDiaryAddedMessageText1 = new javax.swing.JLabel();
        mealDiaryAddedMessageText2 = new javax.swing.JLabel();
        workoutAddedTextPanel = new javax.swing.JPanel();
        workoutAddedMessageText1 = new javax.swing.JLabel();
        workoutAddedMessageText2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(54, 58, 65));
        mainPanel.setMinimumSize(new java.awt.Dimension(360, 150));
        mainPanel.setPreferredSize(new java.awt.Dimension(360, 150));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperBar.setBackground(new java.awt.Color(0, 173, 181));
        upperBar.setOpaque(true);
        mainPanel.add(upperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 1));

        leftBorder.setBackground(new java.awt.Color(82, 86, 93));
        leftBorder.setOpaque(true);
        mainPanel.add(leftBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1, 150));

        rightBorder.setBackground(new java.awt.Color(82, 86, 93));
        rightBorder.setOpaque(true);
        mainPanel.add(rightBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 0, 1, 150));

        lowerBorder.setBackground(new java.awt.Color(82, 86, 93));
        lowerBorder.setOpaque(true);
        mainPanel.add(lowerBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 149, 360, 1));

        returnButton.setBackground(new java.awt.Color(0, 173, 181));
        returnButton.setForeground(new java.awt.Color(238, 238, 238));
        returnButton.setToolTipText("");
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnButtonMouseExited(evt);
            }
        });
        returnButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnButtonText.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        returnButtonText.setForeground(new java.awt.Color(238, 238, 238));
        returnButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnButtonText.setText("Powr??t");
        returnButton.add(returnButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 25));

        mainPanel.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 110, 90, 25));

        messagePositiveIcon.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        messagePositiveIcon.setForeground(new java.awt.Color(238, 238, 238));
        messagePositiveIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        messagePositiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/submit_46_46.png"))); // NOI18N
        mainPanel.add(messagePositiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 32, 50, 50));

        messageNegativeIcon.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        messageNegativeIcon.setForeground(new java.awt.Color(238, 238, 238));
        messageNegativeIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        messageNegativeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/error_46_46.png"))); // NOI18N
        mainPanel.add(messageNegativeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 32, 50, 50));

        mealsLimitTextPanel.setBackground(new java.awt.Color(54, 58, 65));
        mealsLimitTextPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mealsLimitMessageText1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mealsLimitMessageText1.setForeground(new java.awt.Color(238, 238, 238));
        mealsLimitMessageText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mealsLimitMessageText1.setText("Osi??gni??to maksymaln?? liczb??");
        mealsLimitTextPanel.add(mealsLimitMessageText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        mealsLimitMessageText2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mealsLimitMessageText2.setForeground(new java.awt.Color(238, 238, 238));
        mealsLimitMessageText2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mealsLimitMessageText2.setText("posi??k??w.");
        mealsLimitTextPanel.add(mealsLimitMessageText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, -1));

        mainPanel.add(mealsLimitTextPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 60));

        registeredTextPanel.setBackground(new java.awt.Color(54, 58, 65));
        registeredTextPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registeredMessageText1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        registeredMessageText1.setForeground(new java.awt.Color(238, 238, 238));
        registeredMessageText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registeredMessageText1.setText("Pomy??lnie zarejestrowano.");
        registeredTextPanel.add(registeredMessageText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        mainPanel.add(registeredTextPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 60));

        mealDiaryAddedTextPanel.setBackground(new java.awt.Color(54, 58, 65));
        mealDiaryAddedTextPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mealDiaryAddedMessageText1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mealDiaryAddedMessageText1.setForeground(new java.awt.Color(238, 238, 238));
        mealDiaryAddedMessageText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mealDiaryAddedMessageText1.setText("Pomy??lnie zamkni??to dzie??");
        mealDiaryAddedTextPanel.add(mealDiaryAddedMessageText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        mealDiaryAddedMessageText2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mealDiaryAddedMessageText2.setForeground(new java.awt.Color(238, 238, 238));
        mealDiaryAddedMessageText2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mealDiaryAddedMessageText2.setText("i zapisano dziennik posi??k??w.");
        mealDiaryAddedTextPanel.add(mealDiaryAddedMessageText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, -1));

        mainPanel.add(mealDiaryAddedTextPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 60));

        workoutAddedTextPanel.setBackground(new java.awt.Color(54, 58, 65));
        workoutAddedTextPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workoutAddedMessageText1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        workoutAddedMessageText1.setForeground(new java.awt.Color(238, 238, 238));
        workoutAddedMessageText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        workoutAddedMessageText1.setText("Pomy??lnie dodano ??wiczenie");
        workoutAddedTextPanel.add(workoutAddedMessageText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        workoutAddedMessageText2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        workoutAddedMessageText2.setForeground(new java.awt.Color(238, 238, 238));
        workoutAddedMessageText2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        workoutAddedMessageText2.setText("do dziennika treningowego.");
        workoutAddedTextPanel.add(workoutAddedMessageText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, -1));

        mainPanel.add(workoutAddedTextPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    protected void setMessage(int messageType) {
        if(messageType == 1) {
            mealDiaryAddedTextPanel.setVisible(false);
            workoutAddedTextPanel.setVisible(false);
            mealsLimitTextPanel.setVisible(false);
            registeredTextPanel.setVisible(true); 
            messageNegativeIcon.setVisible(false);
            messagePositiveIcon.setVisible(true);
        }
        if(messageType == 2) {
            registeredTextPanel.setVisible(false);
            workoutAddedTextPanel.setVisible(false);
            mealsLimitTextPanel.setVisible(false);
            mealDiaryAddedTextPanel.setVisible(true);
            messageNegativeIcon.setVisible(false);
            messagePositiveIcon.setVisible(true);
        }
        if(messageType == 3) {
            registeredTextPanel.setVisible(false);
            mealDiaryAddedTextPanel.setVisible(false);
            mealsLimitTextPanel.setVisible(false);
            workoutAddedTextPanel.setVisible(true);
            messageNegativeIcon.setVisible(false);
            messagePositiveIcon.setVisible(true);
        }
        if(messageType == 4) {
            registeredTextPanel.setVisible(false);
            mealDiaryAddedTextPanel.setVisible(false);
            workoutAddedTextPanel.setVisible(false);
            mealsLimitTextPanel.setVisible(true);
            messagePositiveIcon.setVisible(false);
            messageNegativeIcon.setVisible(true);          
        }
    }
    
    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        dispose();
    }//GEN-LAST:event_returnButtonMouseClicked

    private void returnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseEntered
        returnButton.setBackground(Color.decode("#009BA3"));
    }//GEN-LAST:event_returnButtonMouseEntered

    private void returnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseExited
        returnButton.setBackground(Color.decode("#00ADB5"));
    }//GEN-LAST:event_returnButtonMouseExited

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
            java.util.logging.Logger.getLogger(TextMessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TextMessageDialog dialog = new TextMessageDialog(new javax.swing.JFrame(), true, msgType);
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
    private javax.swing.JLabel leftBorder;
    private javax.swing.JLabel lowerBorder;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mealDiaryAddedMessageText1;
    private javax.swing.JLabel mealDiaryAddedMessageText2;
    private javax.swing.JPanel mealDiaryAddedTextPanel;
    private javax.swing.JLabel mealsLimitMessageText1;
    private javax.swing.JLabel mealsLimitMessageText2;
    private javax.swing.JPanel mealsLimitTextPanel;
    private javax.swing.JLabel messageNegativeIcon;
    private javax.swing.JLabel messagePositiveIcon;
    private javax.swing.JLabel registeredMessageText1;
    private javax.swing.JPanel registeredTextPanel;
    private javax.swing.JPanel returnButton;
    private javax.swing.JLabel returnButtonText;
    private javax.swing.JLabel rightBorder;
    private javax.swing.JLabel upperBar;
    private javax.swing.JLabel workoutAddedMessageText1;
    private javax.swing.JLabel workoutAddedMessageText2;
    private javax.swing.JPanel workoutAddedTextPanel;
    // End of variables declaration//GEN-END:variables
}
