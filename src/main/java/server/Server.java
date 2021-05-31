package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server extends javax.swing.JFrame {
    private static final int PORT = 8754;
    private static HashSet<String> usernames = new HashSet<String>();
    private static HashSet<PrintWriter> messages = new HashSet<PrintWriter>();
    
    private Thread serverThread;
    
    private int positionX;
    private int positionY;
    
    public Server() throws IOException {
        initComponents();
        this.serverThread = new Thread(new Runnable() {
            public void run() {
                try {
                    initServer();
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        serverThread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleText = new javax.swing.JLabel();
        upperBar = new javax.swing.JLabel();
        leftBorder = new javax.swing.JLabel();
        rightBorder = new javax.swing.JLabel();
        lowerBorder = new javax.swing.JLabel();
        logsScrollPane = new javax.swing.JScrollPane();
        logsTextArea = new javax.swing.JTextArea();
        closeButton = new javax.swing.JPanel();
        closeButtonInactiveIcon = new javax.swing.JLabel();
        closeButtonActiveIcon = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JPanel();
        minimizeButtonInactiveIcon = new javax.swing.JLabel();
        minimizeButtonActiveIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DailyMe Server");
        setName("serverframe"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(32, 35, 38));
        mainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainPanelMouseDragged(evt);
            }
        });
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanelMousePressed(evt);
            }
        });
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleText.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        titleText.setForeground(new java.awt.Color(146, 153, 175));
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleText.setText("DailyMe Server");
        mainPanel.add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 720, 60));

        upperBar.setBackground(new java.awt.Color(0, 173, 181));
        upperBar.setOpaque(true);
        mainPanel.add(upperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 1));

        leftBorder.setBackground(new java.awt.Color(82, 86, 93));
        leftBorder.setOpaque(true);
        mainPanel.add(leftBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1, 480));

        rightBorder.setBackground(new java.awt.Color(82, 86, 93));
        rightBorder.setOpaque(true);
        mainPanel.add(rightBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 0, 1, 480));

        lowerBorder.setBackground(new java.awt.Color(82, 86, 93));
        lowerBorder.setOpaque(true);
        mainPanel.add(lowerBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 479, 800, 1));

        logsScrollPane.setBorder(null);

        logsTextArea.setEditable(false);
        logsTextArea.setBackground(new java.awt.Color(42, 44, 51));
        logsTextArea.setColumns(20);
        logsTextArea.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        logsTextArea.setForeground(new java.awt.Color(172, 179, 201));
        logsTextArea.setRows(19);
        logsTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        logsScrollPane.setViewportView(logsTextArea);

        mainPanel.add(logsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 400));

        closeButton.setBackground(new java.awt.Color(34, 40, 49));
        closeButton.setOpaque(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });
        closeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButtonInactiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_button2.png"))); // NOI18N
        closeButtonInactiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.add(closeButtonInactiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        closeButtonActiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close_button2_active.png"))); // NOI18N
        closeButtonActiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButtonActiveIcon.setVisible(false);
        closeButton.add(closeButtonActiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 5, -1, -1));

        minimizeButton.setBackground(new java.awt.Color(34, 40, 49));
        minimizeButton.setOpaque(false);
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseExited(evt);
            }
        });
        minimizeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeButtonInactiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize_button2.png"))); // NOI18N
        minimizeButtonInactiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.add(minimizeButtonInactiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        minimizeButtonActiveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize_button2_active.png"))); // NOI18N
        minimizeButtonActiveIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButtonActiveIcon.setVisible(false);
        minimizeButton.add(minimizeButtonActiveIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 5, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initServer() throws IOException {
        logsTextArea.append("Serwer DailyMe zostal wlaczony.\n");
	ServerSocket server = new ServerSocket(PORT);
	try {
            while(true) {
		new ClientSession(server.accept()).start();
            }
	} finally {
            server.close();
	}
    }
    
    private static class ClientSession extends Thread {
	private String name;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	public ClientSession(Socket socket) {
            this.socket = socket;
	}

	public void run() {
            try {
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		while (true) {
                    out.println("GETNAME");
                    name = in.readLine();
                    if(name == null)
			return;
                    synchronized(usernames) {
			if (!usernames.contains(name)) {
                            usernames.add(name);
                            logsTextArea.append(name + ": polaczono.\n");
                            break;
			}
                    }
		}
		messages.add(out);
		while(true) {
                    String input = in.readLine();
                    if(input == null || input.equals("DSC")) {
                        socket.close();
                        input = null;
                        break;
                    }
                    for(PrintWriter msg : messages) {
                        msg.println("USERNAME " + name + ": ");
                        msg.println("MSG " + input);
                    }
                    logsTextArea.append(name + ": " + input + "\n");
                }
            } catch(IOException e) {
		logsTextArea.append(e + "\n");
            } finally {
		if(name != null)
                    usernames.remove(name);
		if(out != null)
                    messages.remove(out);
		try {
                    logsTextArea.append(name + ": rozlaczono.\n");
                    socket.close();
		} catch(IOException e) {}
            }
        }
    }
    
    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        closeButtonActiveIcon.setVisible(true);
        closeButtonInactiveIcon.setVisible(false);
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButtonInactiveIcon.setVisible(true);
        closeButtonActiveIcon.setVisible(false);
    }//GEN-LAST:event_closeButtonMouseExited

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void minimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseEntered
        minimizeButtonActiveIcon.setVisible(true);
        minimizeButtonInactiveIcon.setVisible(false);
    }//GEN-LAST:event_minimizeButtonMouseEntered

    private void minimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseExited
        minimizeButtonInactiveIcon.setVisible(true);
        minimizeButtonActiveIcon.setVisible(false);
    }//GEN-LAST:event_minimizeButtonMouseExited

    private void mainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseDragged
        this.setLocation(evt.getXOnScreen() - positionX, evt.getYOnScreen() - positionY);
    }//GEN-LAST:event_mainPanelMouseDragged

    private void mainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_mainPanelMousePressed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Server().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel closeButton;
    private javax.swing.JLabel closeButtonActiveIcon;
    private javax.swing.JLabel closeButtonInactiveIcon;
    private javax.swing.JLabel leftBorder;
    private javax.swing.JScrollPane logsScrollPane;
    private static javax.swing.JTextArea logsTextArea;
    private javax.swing.JLabel lowerBorder;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel minimizeButton;
    private javax.swing.JLabel minimizeButtonActiveIcon;
    private javax.swing.JLabel minimizeButtonInactiveIcon;
    private javax.swing.JLabel rightBorder;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel upperBar;
    // End of variables declaration//GEN-END:variables
}
