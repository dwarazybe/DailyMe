package client;

import javax.swing.JOptionPane;
import javax.swing.UIDefaults;

public class LoadingDialog extends javax.swing.JDialog {
    
    private final Thread thread2;
    UIDefaults defaults;
    protected static int loadingType = 1;
    
    private int sleepTime;
    
    public LoadingDialog(java.awt.Frame parent, boolean modal, int loadingType) {
        super(parent, modal);
        this.loadingType = loadingType;
        initComponents(); 
        setType(loadingType);
        this.thread2 = new Thread(new Runnable() {
            public void run() {
		loadProgressBar();
            }
        });
        thread2.start();
    }
    
    public void setType(int type) {
        if(type == 1) {
            sleepTime = 10;
            loadingText.setVisible(true);
            logoutText.setVisible(false);
        }
        if(type == 2) {
            sleepTime = 4;
            logoutText.setVisible(true);
            loadingText.setVisible(false);
        }
    }
    
    public void loadProgressBar() {
        try {
            for(int i=0; i<=180; i++)
            {
                progressBar.setValue(i);
                thread2.sleep(sleepTime);
            }
        } catch (InterruptedException exception) {
            JOptionPane.showMessageDialog(null, "Error: " + exception.getMessage());
        }
        dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        loadingText = new javax.swing.JLabel();
        logoutText = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        MainPanelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setModal(true);
        setName("loadingDialog"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(57, 62, 70));
        MainPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        MainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        loadingText.setForeground(new java.awt.Color(238, 238, 238));
        loadingText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingText.setText("Wczytywanie...");
        MainPanel.add(loadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1280, 60));

        logoutText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        logoutText.setForeground(new java.awt.Color(238, 238, 238));
        logoutText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutText.setText("Wylogowywanie...");
        MainPanel.add(logoutText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1280, 60));
        loadingText.setVisible(false);
        logoutText.setVisible(false);

        progressBar.setBackground(new java.awt.Color(66, 71, 79));
        progressBar.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        progressBar.setForeground(new java.awt.Color(0, 173, 181));
        progressBar.setStringPainted(true);
        MainPanel.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 280, 40));
        progressBar.putClientProperty("Nimbus.Overrides.InheritDefaults", Boolean.TRUE);
        progressBar.putClientProperty("Nimbus.Overrides", defaults);

        MainPanelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login_background_dark2.png"))); // NOI18N
        MainPanel.add(MainPanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getAccessibleContext().setAccessibleParent(null);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoadingDialog dialog = new LoadingDialog(new javax.swing.JFrame(), true, loadingType);
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
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MainPanelBackground;
    private javax.swing.JLabel loadingText;
    private javax.swing.JLabel logoutText;
    protected javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
