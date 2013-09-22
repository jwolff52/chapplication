/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapplication;

import chapplication.util.CServerUtilities;
import chapplication.util.CTextUtilities;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * @author james.wolff
 * @date Sep 11, 2013
 */
public class ChapplicationGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChapplicationGUI
     */
    public ChapplicationGUI() {
        username="Guest";
        initComponents();
        typeBox.setVisible(false);
        sendButton.setVisible(false);
        login=new LoginGUI();
        changePass=new ChangePasswordGUI();
        localData=new CTextUtilities();
        globalData=new CServerUtilities();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        typeBox = new javax.swing.JTextField();
        statusButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();
        quitButton = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        helpButton = new javax.swing.JMenuItem();
        passChange = new javax.swing.JMenuItem();
        quitMenu = new javax.swing.JMenuItem();

        jToolBar1.setRollover(true);

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chapplication");
        setForeground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        typeBox.setBackground(new java.awt.Color(102, 102, 102));
        typeBox.setForeground(new java.awt.Color(204, 204, 204));
        typeBox.setText("Say something...");
        typeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeBoxActionPerformed(evt);
            }
        });
        typeBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                typeBoxFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                typeBoxFocusGained(evt);
            }
        });
        typeBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                typeBoxKeyReleased(evt);
            }
        });

        statusButton.setBackground(new java.awt.Color(51, 51, 51));
        statusButton.setText("Sign In");
        statusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                statusButtonMouseReleased(evt);
            }
        });

        usernameLabel.setText(username);

        sendButton.setBackground(new java.awt.Color(51, 51, 51));
        sendButton.setText("Send");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        userList.setEditable(false);
        userList.setBackground(new java.awt.Color(102, 102, 102));
        userList.setColumns(20);
        userList.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        userList.setForeground(new java.awt.Color(153, 0, 0));
        userList.setRows(5);
        userList.setText("User List:");
        userList.setWrapStyleWord(true);
        userList.setName("User List: "); // NOI18N
        jScrollPane1.setViewportView(userList);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        chatBox.setEditable(false);
        chatBox.setBackground(new java.awt.Color(102, 102, 102));
        chatBox.setColumns(20);
        chatBox.setForeground(new java.awt.Color(96, 233, 37));
        chatBox.setRows(5);
        chatBox.setText("Something");
        chatBox.setWrapStyleWord(true);
        jScrollPane2.setViewportView(chatBox);

        quitButton.setBackground(new java.awt.Color(51, 51, 51));
        quitButton.setText("Quit");
        quitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quitButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usernameLabel)
                        .addComponent(statusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(235, 235, 235)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(statusButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quitButton)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typeBox, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        Menu.setText("Menu");

        helpButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        helpButton.setText("Help");
        Menu.add(helpButton);

        passChange.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        passChange.setText("Change Password");
        passChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passChangeMouseReleased(evt);
            }
        });
        passChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passChangeActionPerformed(evt);
            }
        });
        Menu.add(passChange);

        quitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        quitMenu.setText("Quit");
        quitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quitMenuMouseReleased(evt);
            }
        });
        quitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuActionPerformed(evt);
            }
        });
        Menu.add(quitMenu);

        jMenuBar2.add(Menu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(100, 100, 515, 392);
    }// </editor-fold>//GEN-END:initComponents
    public static void setUsername(String name){
        username=name;
    }
    private void typeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeBoxActionPerformed

    private void statusButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusButtonMouseReleased
        if(usernameLabel.getText().equalsIgnoreCase("guest")){
            login.setVisible(true);
            Thread thread;
            thread = new Thread(new Runnable(){
                 @SuppressWarnings("empty-statement")
                 @Override
                 public void run(){
                     while(username.equals("Guest"));
                     typeBox.setVisible(true);
                     sendButton.setVisible(true);
                     usernameLabel.setText(username);
                     login.setVisible(false);
                     statusButton.setText("Sign Out");
                     userList.setText(userList.getText()+"\n"+username);
                 }
            });
            thread.start();
        }
    }//GEN-LAST:event_statusButtonMouseReleased

    private void quitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitButtonMouseReleased
        int confirm = JOptionPane.showOptionDialog(null,"Are You Sure to Close this Application?","Exit Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_quitButtonMouseReleased

    private void typeBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeBoxFocusGained
        if(typeBox.getText().equals("Say something...")){
            typeBox.setText(null);
        }
    }//GEN-LAST:event_typeBoxFocusGained

    private void typeBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeBoxFocusLost
        if(typeBox.getText().equals("")){
            typeBox.setText("Say something...");
        }
    }//GEN-LAST:event_typeBoxFocusLost

    private void quitMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMenuMouseReleased
        int confirm = JOptionPane.showOptionDialog(null,"Are You Sure to Close this Application?","Exit Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_quitMenuMouseReleased

    private void passChangeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passChangeMouseReleased
        changePass.setVisible(true);
    }//GEN-LAST:event_passChangeMouseReleased

    private void typeBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeBoxKeyReleased
        if(evt.getKeyChar()=='\n'){
            if(!(typeBox.getText().equals(new String()))){
                if(chatBox.getText().equals("Something")){
                    chatBox.setText(username+": "+typeBox.getText());
                }else{
                    chatBox.append("\n"+username+": "+typeBox.getText());
                }
            }
            typeBox.setText(null);
        }
    }//GEN-LAST:event_typeBoxKeyReleased

    private void quitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuActionPerformed
        int confirm = JOptionPane.showOptionDialog(null,"Are You Sure to Close this Application?","Exit Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_quitMenuActionPerformed

    private void passChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passChangeActionPerformed
        changePass.setVisible(true);
    }//GEN-LAST:event_passChangeActionPerformed

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
            java.util.logging.Logger.getLogger(ChapplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChapplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChapplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChapplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChapplicationGUI().setVisible(true);
            }
        });
    }
    private boolean post(String message){
        //chatArea.append(username+": "+message);
        return false;
    }
    public static String getCurrentUser(){
        return username;
    }
    protected ChangePasswordGUI changePass;
    protected LoginGUI login;
    protected static String username;
    protected static CTextUtilities localData;
    protected static CServerUtilities globalData;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JTextArea chatBox;
    private javax.swing.JMenuItem helpButton;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem passChange;
    private javax.swing.JButton quitButton;
    private javax.swing.JMenuItem quitMenu;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton statusButton;
    private javax.swing.JTextField typeBox;
    private javax.swing.JTextArea userList;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}