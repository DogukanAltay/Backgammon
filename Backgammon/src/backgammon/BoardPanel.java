package backgammon;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author mertarmagan
 */
public class BoardPanel extends JPanel {

    private BufferedImage imageBoard;
    private final int WIDTH = 1000;
    private final int HEIGHT = 800;
    private GamePanel gamePanel;
    
    private Slot whiteBar, blackBar;
    private Slot whiteStack, blackStack;
    private ArrayList<Slot> slotSet1;
    private ArrayList<Slot> slotSet2;
    private ArrayList<Slot> slotSet3;
    private ArrayList<Slot> slotSet4;
    private ArrayList<Slot> boardSet;
    private ArrayList<Slot> validSlots;
    private CheckerSet whiteSet, blackSet;

    private Player player1, player2;
    private Player currentPlayer;
    private Player nextPlayer;
    private String playerID1, playerID2;
    
    private boolean turnCheck;
    private boolean isRolled;
   
    private int dieLeft;
    private Die die1, die2;
    
    private RuleController rules;
    private BoardInputManager mngr;

    public BoardPanel() {
        try {
            imageBoard = ImageIO.read(getClass().getResource("/images/board.jpg"));
        } catch (IOException e) {
            System.out.println("file error");
        }
        mngr = new BoardInputManager(this);
        die1 = new Die();
        die2 = new Die();
        rules = new RuleController();
        //showPlayableSlots(boardSet.get(1));
        initComponents();
        setPlayerIDs("first", "second");
        /*roll();
        setCurrentPlayer();
        turn();*/
        roll();
        gameLoop();
        
     
    }

    public void setPlayerIDs(String player1, String player2){
        this.playerID1 = player1;
        this.playerID2 = player2;
    }
    
    public void initPlayers() {
        player1 = new Player(playerID1, whiteSet);
        player2 = new Player(playerID2, blackSet);
    }

    public void initSlots(){
        
        int slotWidth = 56;
        int slotHeight = 320;
        int slot1X = 578;
        int slot1Y = 30;
        int slot2X = 118;
        int slot2Y = 30;
        int slot3X = 118;
        int slot3Y = 453;
        int slot4X = 577;
        int slot4Y = 453;
        
        whiteBar = new Slot(517,150,slotWidth,200,this,false,false);        
        blackBar = new Slot(517,350,slotWidth,200,this,false,false);
        whiteStack = new Slot(946,30,slotWidth,slotHeight+25,this,false,false);
        blackStack = new Slot(946,430,slotWidth,slotHeight+25,this,false,false);
        
        slotSet1 = new ArrayList<Slot>(6);
        slotSet2 = new ArrayList<Slot>(6);
        slotSet3 = new ArrayList<Slot>(6);
        slotSet4 = new ArrayList<Slot>(6);
        boardSet = new ArrayList<Slot>(24);
        
        for(int i=0; i<6; i++){
            
            
            slotSet1.add(i, new Slot(slot1X + (i * 57), slot1Y, slotWidth, slotHeight,this,false,false));        
            slotSet1.get(i).addMouseListener(mngr);
            slotSet1.get(i).setOpaque(true);
            slotSet1.get(i).setBounds(slot1X + (i * 57), slot1Y, slotWidth, slotHeight);
            lp.add(slotSet1.get(i), new Integer(0),0);                    
        }
        for(int i=0; i<6; i++){
            
            
            slotSet2.add(i, new Slot(slot2X + (i * 57), slot2Y, slotWidth, slotHeight,this,false,false));
            slotSet2.get(i).addMouseListener(mngr);
            slotSet2.get(i).setOpaque(true);
            slotSet2.get(i).setBounds(slot2X + (i * 57), slot2Y, slotWidth, slotHeight);
            lp.add(slotSet2.get(i), new Integer(0),0);                    
        }
        for(int i=0; i<6; i++){
            
            
            slotSet3.add(i, new Slot(slot3X + (i * 57), slot3Y, slotWidth, slotHeight,this,false,true));
            slotSet3.get(i).addMouseListener(mngr);
            slotSet3.get(i).setOpaque(true);
            slotSet3.get(i).setBounds(slot3X + (i * 57), slot3Y, slotWidth, slotHeight);
            lp.add(slotSet3.get(i), new Integer(0),0);                    
        }
        for(int i=0; i<6; i++){
            
            
            slotSet4.add(i, new Slot(slot4X + (i * 57), slot4Y, slotWidth, slotHeight,this,false,true));
            slotSet4.get(i).addMouseListener(mngr);
            slotSet4.get(i).setOpaque(true);
            slotSet4.get(i).setBounds(slot4X + (i * 57), slot4Y, slotWidth, slotHeight);
            lp.add(slotSet4.get(i), new Integer(0),0);                    
        }
        
        for(int j=5;j>=0;j--)
            boardSet.add(slotSet1.get(j));
        for(int j=5;j>=0;j--)
            boardSet.add(slotSet2.get(j));
        for(int j=0;j<6;j++)
            boardSet.add(slotSet3.get(j));
        for(int j=0;j<6;j++)
            boardSet.add(slotSet4.get(j));

        

        blackBar.addMouseListener(mngr);
        blackBar.setOpaque(true);
        blackBar.setBounds(517, 350, slotWidth, 200);
        lp.add(blackBar, new Integer(0), 0);

        whiteBar.addMouseListener(mngr);
        whiteBar.setOpaque(true);
        whiteBar.setBounds(517, 150, slotWidth, 200);
        lp.add(whiteBar, new Integer(0), 0);

        whiteStack.addMouseListener(mngr);
        whiteStack.setOpaque(true);
        whiteStack.setBounds(946, 30, slotWidth, slotHeight + 25);
        lp.add(whiteStack, new Integer(0), 0);

        blackStack.addMouseListener(mngr);
        blackStack.setOpaque(true);
        blackStack.setBounds(946, 430, slotWidth, slotHeight + 25);
        lp.add(blackStack, new Integer(0), 0);
    }

    public void initCheckers(Colors a, Colors b) {

        whiteSet = new CheckerSet(a, this);
        blackSet = new CheckerSet(b, this);
        for (int i = 0; i < 15; i++) {
            if (i < 5) {
                slotSet1.get(0).addChecker(whiteSet.getCheckerList().get(i));
            } else if (i < 8) {
                slotSet2.get(4).addChecker(whiteSet.getCheckerList().get(i));
            } else if (i < 13) {
                slotSet3.get(0).addChecker(whiteSet.getCheckerList().get(i));
            } else if (i < 15) {
                slotSet4.get(5).addChecker(whiteSet.getCheckerList().get(i));
            }
        }
        for (int i = 0; i < 15; i++) {
            if (i < 5) {
                slotSet4.get(0).addChecker(blackSet.getCheckerList().get(i));
            } else if (i < 8) {
                slotSet3.get(4).addChecker(blackSet.getCheckerList().get(i));
            } else if (i < 13) {
                slotSet2.get(0).addChecker(blackSet.getCheckerList().get(i));
            } else if (i < 15) {
                slotSet1.get(5).addChecker(blackSet.getCheckerList().get(i));
            }
        }
    }

    public void setStackAvailable(Player player) {

        if (player == player1) {
            whiteStack.setAvailable(true);
        }

        if (player == player2) {
            blackStack.setAvailable(true);
        }

    }

    public void setBarAvailable(Player player) {

        if (player == player1) {
            whiteBar.setAvailable(true);
        }

        if (player == player2) {
            blackBar.setAvailable(true);
        }

    }
    
    public void setBarUnavailable(Player player) {

        if (player == player1) {
            whiteBar.setAvailable(false);
        }

        if (player == player2) {
            blackBar.setAvailable(false);
        }

    }

    public void setSlotAvailable(Slot s) {
        s.setAvailable(true);
    }

    public void setSlotUnavailable(Slot s) {
        s.setAvailable(false);
    }
    
    public void setPlayerSlotsAvailable(Player player){
        
        if(player == player1){           
            for(Slot m: boardSet){                 
                if(m.getSlotColor()==Colors.WHITE || m.getSlotColor()==Colors.RED ) 
                setSlotAvailable(m);               
            }
        }else{
            for(Slot m: boardSet){                 
                if(m.getSlotColor()==Colors.BLACK || m.getSlotColor()==Colors.BLUE ) 
                setSlotAvailable(m);               
            }
        }    
    }
    public void setPlayerSlotsUnavailable(Player player){
        
        if(player == player1){        
            for(Slot m: boardSet){                 
                if(m.getSlotColor()==Colors.WHITE || m.getSlotColor()==Colors.RED ) 
                setSlotUnavailable(m);               
            }
        }else{
            for(Slot m: boardSet){                 
                if(m.getSlotColor()==Colors.BLACK || m.getSlotColor()==Colors.BLUE ) 
                setSlotUnavailable(m);               
            }
        }       
    }
    
    public void setAllSlotsUnavailable(){
        
        for(Slot m: boardSet)
            setSlotUnavailable(m);
        setSlotUnavailable(whiteBar);
        setSlotUnavailable(blackBar);
    }
    
    public void setAllSlotsAvailable(){
        
        for(Slot m: boardSet)
            setSlotAvailable(m);
        
    }
    public void findPlayableSlots(Slot s) {

        int totalDie = dieLeft;
        System.out.println(totalDie);
        int value1 = die1.getValue();
        int value2 = die2.getValue();
        validSlots = new ArrayList<Slot>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        
        
        if(totalDie == value1)
            values.add(value1);
        else if(totalDie == value2)
            values.add(value2);
        else{
            values.add(value1);
            values.add(value2);
        }
            
        int sourceLoc = boardSet.indexOf(s);
        System.out.println("SourceSlotIndex: " + sourceLoc);
        Slot target;
                
        if (value1 != value2) { // not a double roll
            int controlLoc;
                             
            for(int m: values){
                
                if(currentPlayer == player2)
                    controlLoc = sourceLoc+m;
                else
                    controlLoc = sourceLoc-m;
                
                if(sourceLoc == -1 && currentPlayer == player2){
                    controlLoc = m-1;
                }
                if(sourceLoc == -1 && currentPlayer == player1)
                    controlLoc = boardSet.size()-(m);
                
                if(isPlayerBearOff(currentPlayer) && currentPlayer == player1 && sourceLoc+1 <= m){
                    validSlots.add(whiteStack);
                }
                if(isPlayerBearOff(currentPlayer) && currentPlayer == player2 && (boardSet.size()- (sourceLoc)) <= m){
                    validSlots.add(blackStack);
                }
                
                if(controlLoc<boardSet.size() && controlLoc>=0){
                    target = boardSet.get(controlLoc);
                    rules.checkRules(s,target);
                    if(rules.playableFlag || rules.hittableFlag)
                        validSlots.add(target);  
                }
       
            }          
        }else{
            int controlLoc;
                       
            if(currentPlayer == player2)
                controlLoc = sourceLoc + value1;
            else
                controlLoc = sourceLoc - value1;
            
            if(controlLoc<boardSet.size() && controlLoc>=0){
                    target = boardSet.get(controlLoc);
                    rules.checkRules(s,target);
                    if(rules.playableFlag || rules.hittableFlag)
                        validSlots.add(target);  
                }
            
            for(int i=2;i<5;i++){
                
                if(currentPlayer == player2)
                    controlLoc = sourceLoc + (value1*i);
                else
                    controlLoc = sourceLoc - (value1*i);
                
                if(controlLoc<boardSet.size() && !validSlots.isEmpty() && controlLoc>=0){
                    target = boardSet.get(controlLoc);
                    rules.checkRules(s,target);
                    if(rules.playableFlag || rules.hittableFlag)
                        validSlots.add(target);  
                }                        
            }

        }
           
    }
    public void showPlayableSlots(){
                
        for(Slot m : validSlots){          
            setSlotAvailable(m);
        } 
    }
    public void unShowPlayableSlots(){
                
        for(Slot m : validSlots){          
            setSlotUnavailable(m);
        } 
    }
    public void moveChecker(Slot source, Slot target){
        
        rules.checkRules(source,target);
        if(rules.hittableFlag && dieLeft !=0)
            if(target.getSlotColor()==Colors.WHITE || target.getSlotColor()==Colors.RED)
                target.moveChecker(whiteBar);
            else
                target.moveChecker(blackBar);
        if(boardSet.indexOf(source) == -1){
            if(currentPlayer == player2)
                dieLeft = dieLeft - (boardSet.indexOf(target)+1);
            if(currentPlayer == player1)
                dieLeft = dieLeft -(boardSet.size() - boardSet.indexOf(target));
        }else if(target == whiteStack || target == blackStack){
                if(currentPlayer == player1)
                    dieLeft = dieLeft - (boardSet.indexOf(source)+1);
                if(currentPlayer == player2)
                    dieLeft = dieLeft -(boardSet.size() - boardSet.indexOf(source));
        }else                
            dieLeft = dieLeft - Math.abs(boardSet.indexOf(target) - boardSet.indexOf(source));
        
        System.out.println("dieleft " + dieLeft);
        validSlots.remove(target);
        System.out.println("target index" + boardSet.indexOf(target));
        source.moveChecker(target);
        
        if(!isMoveLeft())
            moveDone();
        else if (isBarEmpty(currentPlayer))
            setPlayerSlotsAvailable(currentPlayer);
            
    }
    
    public boolean isPlayerBearOff(Player player){
        int count=0;
        
        Colors color;
        if(player == player1){
            for(Slot m: slotSet1){
                if(m.getSlotColor() == Colors.WHITE || m.getSlotColor() == Colors.RED)
                    count = count + m.checkerStack.size();               
            }
        }else{
            for(Slot m: slotSet4){
                if(m.getSlotColor() == Colors.BLACK || m.getSlotColor() == Colors.BLUE)
                    count = count + m.checkerStack.size();
            }
        }
            
        if(count == 15)
            return true;
        else
            return false;
       
    }
    
    public void collectToStack(Slot source){
        
        if(source.getSlotColor()==Colors.WHITE || source.getSlotColor()==Colors.RED)
            moveChecker(source,whiteStack);
        else
            moveChecker(source,blackStack);
    }
    
    public JLayeredPane getPane() {
        return lp;
    }
    
    public void setGamePanel(GamePanel gp){
        this.gamePanel = gp;
    }
    
    public boolean isBarEmpty(Player player){
        
        if(player == player1)
            return whiteBar.isStackEmpty();
        else
            return blackBar.isStackEmpty();
    }
    
    /*public void move(){
        
        roll();
        setPlayerSlotsAvailable(currentPlayer);
        if(isTurnPassed())
            passTurn();
        
                   
    }
    public boolean isTurnPassed(){
        
        // player zarların hepsini oynadı mı oynamadı mı kontrol et
        if(dieLeft == 0)
            turnCheck = true;
        else
            turnCheck = false;
        
        return turnCheck;
    }*/
    
    public void moveDone(){       
        passTurn();            
    }
    
    public void passTurn(){
        Player temp;
        setAllSlotsUnavailable();
        setPlayerSlotsUnavailable(currentPlayer);
        temp = nextPlayer;
        nextPlayer = currentPlayer;
        currentPlayer = temp;
        isRolled = false;
        //gamePanel.setRoll(true);
        /*
        if(!isBarEmpty(currentPlayer)){
            setPlayerSlotsUnavailable(currentPlayer);
            setBarAvailable(currentPlayer);           
        }else{
            setBarUnavailable(currentPlayer);
            setPlayerSlotsAvailable(currentPlayer);
        } */           
        //turnCheck = false;
    }
    
    public void setCurrentPlayer(Player player){
        currentPlayer = player;        
    }
    
    public void setStartingPlayer(){
        
        if(die1.getValue()> die2.getValue()){
            currentPlayer = player1;
            nextPlayer = player2;
        }
        else{
            currentPlayer = player2;
            nextPlayer = player1;
        }
        setPlayerSlotsAvailable(currentPlayer);
    }
    
    public void gameLoop(){
      
        boolean isGameFinished = false;
        boolean isRoundFinished = false;
        
        setAllSlotsUnavailable();
        initPlayers();           
        setStartingPlayer();
  
    }
    
    public boolean isMoveLeft(){
        if(currentPlayer == player1 && !whiteBar.isStackEmpty()){
            findPlayableSlots(whiteBar);
            if(dieLeft==0 || validSlots.isEmpty())
                return false;
            else
                return true;
        }            
        else if(currentPlayer == player2 && !blackBar.isStackEmpty()){
                findPlayableSlots(blackBar);
                if(dieLeft==0 || validSlots.isEmpty())
                    return false;
                else
                    return true;
        }
    
        if(dieLeft==0)
            return false;
        else
            return true;
    }
    
    public void roll(){
        die1.roll();
        die2.roll();
        System.out.print("Roll Btn Pressed -> ");
        System.out.print("Die1: " + die1.getValue());
        System.out.println(" Die2: " + die2.getValue());     
        
        if(die1.getValue() == die2.getValue())
            dieLeft = die1.getValue()*4;
        else
            dieLeft = die1.getValue()+die2.getValue();
        
        if(!isBarEmpty(currentPlayer)){
            setPlayerSlotsUnavailable(currentPlayer);
            setBarAvailable(currentPlayer);           
        }else{
            setBarUnavailable(currentPlayer);
            setPlayerSlotsAvailable(currentPlayer);
        }            
        //gamePanel.setRoll(false);
        isRolled = true;
    }
    
    public boolean getRolled(){
        return isRolled;
    }
    
    public int getDie1(){
        return die1.getValue();
    }
    public int getDie2(){
        return die2.getValue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lp = new JLayeredPane();

        setMaximumSize(new java.awt.Dimension(1024, 804));
        setMinimumSize(new java.awt.Dimension(1024, 804));
        setPreferredSize(new java.awt.Dimension(1024, 804));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        lp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lp.setMaximumSize(new java.awt.Dimension(1024, 804));
        lp.setMinimumSize(new java.awt.Dimension(1024, 804));
        initSlots();
        initCheckers(Colors.WHITE,Colors.BLACK);

        //lp.add(b.getCheckerSet1().getChecker(0),new Integer(2), 0);

        javax.swing.GroupLayout lpLayout = new javax.swing.GroupLayout(lp);
        lp.setLayout(lpLayout);
        lpLayout.setHorizontalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        lpLayout.setVerticalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void paintComponent(Graphics g) {

        g.drawImage(imageBoard, 0, 0, null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane lp;
    // End of variables declaration//GEN-END:variables
}
