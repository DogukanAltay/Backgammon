
package backgammon;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dogukan
 */
public class GamePanel extends javax.swing.JPanel {

    private JPanel mainPanel;
    private JFrame mainFrame;
    private String playerID1, playerID2;
    private String totalRoundstr, currentRoundstr;
    private int totalRound;
    private SetGameMenu setGameMenu1;
    private int player1Score, player2Score;

    public GamePanel(SetGameMenu sgm) {
        this.setGameMenu1 = sgm;
        totalRound = sgm.getTotalRound();
        System.out.println("in gamepanel: totalround: " + totalRound);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rollBtn = new javax.swing.JButton();
        playerIDLabel1 = new javax.swing.JLabel();
        playerIDLabel2 = new javax.swing.JLabel();
        totalRoundLabel = new javax.swing.JLabel();
        currentRoundLabel = new javax.swing.JLabel();
        totalRoundTxt = new javax.swing.JLabel();
        currentRoundTxt = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        die1Label = new javax.swing.JLabel();
        die2Label = new javax.swing.JLabel();
        die1ValueLabel = new javax.swing.JLabel();
        die2ValueLabel = new javax.swing.JLabel();
        player1ScrLabel = new javax.swing.JLabel();
        hyphenLabel = new javax.swing.JLabel();
        player2ScrLabel = new javax.swing.JLabel();
        boardPanel1 = new backgammon.BoardPanel(this);

        setBackground(java.awt.SystemColor.activeCaption);
        setMaximumSize(new java.awt.Dimension(1280, 1000));
        setMinimumSize(new java.awt.Dimension(1280, 1000));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 1000));
        setRequestFocusEnabled(false);

        rollBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rollBtn.setText("Roll!");
        rollBtn.setFocusPainted(false);
        rollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollBtnActionPerformed(evt);
            }
        });

        playerIDLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        playerIDLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        totalRoundLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        totalRoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalRoundLabel.setText("Total Rounds:");

        currentRoundLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        currentRoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentRoundLabel.setText("Current Round:");
        currentRoundLabel.setToolTipText("");

        totalRoundTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        currentRoundTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        scoreLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        scoreLabel.setText("Score:");

        die1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        die1Label.setText("Die1:");

        die2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        die2Label.setText("Die2:");

        hyphenLabel.setText("-");

        setDieText();
        setTotalRoundTxt();
        updateCurrentRound();
        updatePlayerScores();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(playerIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(playerIDLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(die1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(die1ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(die2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(die2ValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116)
                .addComponent(rollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentRoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentRoundTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(totalRoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalRoundTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(scoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player1ScrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(hyphenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player2ScrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(447, 447, 447))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(die1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(die1ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(die2Label)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(die2ValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(playerIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(playerIDLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(currentRoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(totalRoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentRoundTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(totalRoundTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreLabel)
                    .addComponent(player1ScrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hyphenLabel)
                    .addComponent(player2ScrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollBtnActionPerformed
        //rollBtn.setEnabled(boardPanel1.getRolled());
        boardPanel1.roll();       
        setDieText();
    }//GEN-LAST:event_rollBtnActionPerformed

    public void setMainMenu(JPanel mainPanel){      
       this.mainPanel =  mainPanel;
    }
    
    public void setMainFrame(JFrame mainFrame){
        this.mainFrame = mainFrame;
    }
    
    public void setPlayerNames(String player1, String player2){
        this.playerID1 = player1;
        this.playerID2 = player2;
        this.playerIDLabel1.setText(playerID1);
        this.playerIDLabel2.setText(playerID2);
    }
    
    public String getPlayerID1(){
        return playerID1;
    }
    
    public String getPlayerID2(){
        return playerID2;
    }
    
    public void setDieText(){
        this.die1ValueLabel.setText("" + boardPanel1.getDie1());
        this.die2ValueLabel.setText("" + boardPanel1.getDie2());
        
        repaint();
        revalidate();
    }
    public void setRoll(boolean a){
        rollBtn.setEnabled(a);
    }
    
    public void setTotalRoundTxt(){
        this.totalRoundstr = "" + totalRound;
        this.totalRoundTxt.setText(totalRoundstr);
    }
    
    public int getTotalRound(){
        return totalRound;
    }
    
    public void updateCurrentRound(){
        this.currentRoundstr = "" + boardPanel1.getCurrentRound();
        this.currentRoundTxt.setText(currentRoundstr);
        
        repaint();
        revalidate();
    }
    
    public void updatePlayerScores(){
        this.player1Score = boardPanel1.getPlayer1Score();
        this.player2Score = boardPanel1.getPlayer2Score();
        
        this.player1ScrLabel.setText("" + player1Score);
        this.player2ScrLabel.setText("" + player2Score);
        
        repaint();
        revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private backgammon.BoardPanel boardPanel1;
    private javax.swing.JLabel currentRoundLabel;
    private javax.swing.JLabel currentRoundTxt;
    private javax.swing.JLabel die1Label;
    private javax.swing.JLabel die1ValueLabel;
    private javax.swing.JLabel die2Label;
    private javax.swing.JLabel die2ValueLabel;
    private javax.swing.JLabel hyphenLabel;
    private javax.swing.JLabel player1ScrLabel;
    private javax.swing.JLabel player2ScrLabel;
    private javax.swing.JLabel playerIDLabel1;
    private javax.swing.JLabel playerIDLabel2;
    private javax.swing.JButton rollBtn;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel totalRoundLabel;
    private javax.swing.JLabel totalRoundTxt;
    // End of variables declaration//GEN-END:variables
}
