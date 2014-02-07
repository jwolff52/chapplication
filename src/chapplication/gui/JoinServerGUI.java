/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapplication.gui;

import java.util.ArrayList;

/**
 *
 * @author james.wolff
 */
public class JoinServerGUI extends javax.swing.JFrame {

    /**
     * Creates new form JoinServerGUI
     */
    public JoinServerGUI(ArrayList<String> servers) {
        preInit(servers);
        initComponents();
    }

    private void preInit(ArrayList<String> servers){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChapplicationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        listModel=servers;
        selectedServer=null;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        serverListScrollPane = new javax.swing.JScrollPane();
        serverList = new javax.swing.JList();
        jPSButton = new javax.swing.JButton();
        serverDescriptionLabel = new javax.swing.JLabel();
        jSButton = new javax.swing.JButton();
        serverDescriptionTextAreaScrollPane = new javax.swing.JScrollPane();
        serverDescriptionTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Join Server");

        serverListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        serverList.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return listModel.size(); }
            public Object getElementAt(int i) { return listModel.get(i); }
        });
        serverList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        serverList.setFixedCellWidth(250);
        serverList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                serverListValueChanged(evt);
            }
        });
        serverListScrollPane.setViewportView(serverList);

        jPSButton.setText("Join Private Server");

        serverDescriptionLabel.setText("Server Description:");

        jSButton.setText("Join Server");
        jSButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSButtonMouseReleased(evt);
            }
        });

        serverDescriptionTextAreaScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        serverDescriptionTextArea.setColumns(20);
        serverDescriptionTextArea.setRows(5);
        serverDescriptionTextAreaScrollPane.setViewportView(serverDescriptionTextArea);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serverDescriptionTextAreaScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(serverDescriptionLabel)
                    .addComponent(jPSButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSButton))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverListScrollPane)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jSButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPSButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serverDescriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serverDescriptionTextAreaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serverListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_serverListValueChanged
        selectedServer=listModel.get(serverList.getSelectedIndex());
    }//GEN-LAST:event_serverListValueChanged

    private void jSButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSButtonMouseReleased
        //ChapplicationGUI.joinServer(selectedServer);
    }//GEN-LAST:event_jSButtonMouseReleased

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
            java.util.logging.Logger.getLogger(JoinServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoinServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoinServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoinServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<String> s=new ArrayList<>();
                s.add("Hello");
                s.add("World!!!!!!!!!!!!!!!!!!");
                new JoinServerGUI(s).setVisible(true);
            }
        });
    }
    private static ArrayList<String> listModel;
    private static String selectedServer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jPSButton;
    private javax.swing.JButton jSButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel serverDescriptionLabel;
    private javax.swing.JTextArea serverDescriptionTextArea;
    private javax.swing.JScrollPane serverDescriptionTextAreaScrollPane;
    private javax.swing.JList serverList;
    private javax.swing.JScrollPane serverListScrollPane;
    // End of variables declaration//GEN-END:variables
}
