
package backgammon;

import javax.swing.JPanel;

public class MainMenu extends javax.swing.JFrame {

    private JPanel panel;
    
    public MainMenu() {
        initComponents();
    }
    
    public JPanel getMMenu(){
        return mainPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        createGame = new javax.swing.JButton();
        howToPlay = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        credits = new javax.swing.JButton();
        backgammonGame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));

        mainPanel.setBackground(new java.awt.Color(60, 132, 62));
        mainPanel.setPreferredSize(new java.awt.Dimension(1158, 598));

        createGame.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        createGame.setText("Create a Game");
        createGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createGame.setFocusPainted(false);
        createGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGameActionPerformed(evt);
            }
        });

        howToPlay.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        howToPlay.setText("How-to-Play");
        howToPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        howToPlay.setFocusPainted(false);
        howToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howToPlayActionPerformed(evt);
            }
        });

        settings.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        settings.setText("Settings");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.setFocusPainted(false);
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusPainted(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        credits.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        credits.setText("Credits");
        credits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        credits.setFocusPainted(false);
        credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsActionPerformed(evt);
            }
        });

        backgammonGame.setFont(new java.awt.Font("Lithos Pro Regular", 0, 50)); // NOI18N
        backgammonGame.setText("Backgammon Game");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(howToPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(backgammonGame)
                .addGap(303, 303, 303))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(backgammonGame, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(createGame)
                .addGap(18, 18, 18)
                .addComponent(howToPlay)
                .addGap(18, 18, 18)
                .addComponent(settings)
                .addGap(18, 18, 18)
                .addComponent(credits)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addContainerGap(138, Short.MAX_VALUE))
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

    private void createGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGameActionPerformed
        
        SetGameMenu setGame = new SetGameMenu();
        
        setGame.setMainMenu(mainPanel);
        setGame.setMainFrame(this);
        
        this.setContentPane(setGame);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createGameActionPerformed

    private void howToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howToPlayActionPerformed

        HelpMenu help = new HelpMenu();
        
        help.setMainMenu(mainPanel);
        help.setMainFrame(this);
        
        this.setContentPane(help);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_howToPlayActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        SettingsMenu setting = new SettingsMenu();
        
        setting.setMainMenu(mainPanel);
        setting.setMainFrame(this);
        
        this.setContentPane(setting);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_settingsActionPerformed

    private void creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsActionPerformed

        CreditsMenu credit = new CreditsMenu();
        
        credit.setMainMenu(mainPanel);
        credit.setMainFrame(this);
        
        this.setContentPane(credit);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_creditsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgammonGame;
    private javax.swing.JButton createGame;
    private javax.swing.JButton credits;
    private javax.swing.JButton exit;
    private javax.swing.JButton howToPlay;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton settings;
    // End of variables declaration//GEN-END:variables
}
