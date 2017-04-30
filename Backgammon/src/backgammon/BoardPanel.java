
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
    
    private Slot whiteBar, blackBar;
    private Slot whiteStack, blackStack;
    private ArrayList<Slot> slotSet1;
    private ArrayList<Slot> slotSet2;
    private ArrayList<Slot> slotSet3;
    private ArrayList<Slot> slotSet4;
    private CheckerSet whiteSet, blackSet;
    
    private BoardInputManager mngr;

    public BoardPanel() {
        try {
           imageBoard = ImageIO.read(getClass().getResource("/images/board.jpg"));
       } catch (IOException e) {
           System.out.println("file error");
       }
        mngr = new BoardInputManager();
        initComponents();
        
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
        
        whiteBar = new Slot(517,150,slotWidth,200,this,false);        
        blackBar = new Slot(517,350,slotWidth,200,this,false);
        whiteStack = new Slot(946,30,slotWidth,slotHeight+25,this,false);
        blackStack = new Slot(946,430,slotWidth,slotHeight+25,this,false);
        
        slotSet1 = new ArrayList<Slot>(6);
        slotSet2 = new ArrayList<Slot>(6);
        slotSet3 = new ArrayList<Slot>(6);
        slotSet4 = new ArrayList<Slot>(6);
        
        for(int i=0; i<6; i++){
            
            
            slotSet1.add(i, new Slot(slot1X + (i * 57), slot1Y, slotWidth, slotHeight,this));
            slotSet1.get(i).addMouseListener(mngr);
            slotSet1.get(i).setOpaque(true);
            slotSet1.get(i).setBounds(slot1X + (i * 57), slot1Y, slotWidth, slotHeight);
            lp.add(slotSet1.get(i), new Integer(0),0);                    
        }
        for(int i=0; i<6; i++){
            
            
            slotSet2.add(i, new Slot(slot2X + (i * 57), slot2Y, slotWidth, slotHeight,this));
            slotSet2.get(i).addMouseListener(mngr);
            slotSet2.get(i).setOpaque(true);
            slotSet2.get(i).setBounds(slot2X + (i * 57), slot2Y, slotWidth, slotHeight);
            lp.add(slotSet2.get(i), new Integer(0),0);                    
        }
        for(int i=0; i<6; i++){
            
            
            slotSet3.add(i, new Slot(slot3X + (i * 57), slot3Y, slotWidth, slotHeight,this));
            slotSet3.get(i).addMouseListener(mngr);
            slotSet3.get(i).setOpaque(true);
            slotSet3.get(i).setBounds(slot3X + (i * 57), slot3Y, slotWidth, slotHeight);
            lp.add(slotSet3.get(i), new Integer(0),0);                    
        }
        for(int i=0; i<6; i++){
            
            
            slotSet4.add(i, new Slot(slot4X + (i * 57), slot4Y, slotWidth, slotHeight,this));
            slotSet4.get(i).addMouseListener(mngr);
            slotSet4.get(i).setOpaque(true);
            slotSet4.get(i).setBounds(slot4X + (i * 57), slot4Y, slotWidth, slotHeight);
            lp.add(slotSet4.get(i), new Integer(0),0);                    
        }

        blackBar.setOpaque(true);
        blackBar.setBounds(517,350,slotWidth,200);
        lp.add(blackBar, new Integer(0), 0); 
        
        whiteBar.setOpaque(true);
        whiteBar.setBounds(517,150,slotWidth,200);       
        lp.add(whiteBar, new Integer(0), 0);
        
        whiteStack.setOpaque(true);
        whiteStack.setBounds(946,30,slotWidth,slotHeight+25);       
        lp.add(whiteStack, new Integer(0), 0);
        
        blackStack.addMouseListener(mngr);
        blackStack.setOpaque(true);
        blackStack.setBounds(946,430,slotWidth,slotHeight+25);
        lp.add(blackStack, new Integer(0), 0); 
    }
    
    public void initCheckers(Colors a, Colors b){
        
        whiteSet = new CheckerSet(a,this);
        blackSet = new CheckerSet(b,this);
        
        for(int i=0;i<15;i++){        
            if(i<5)
               slotSet1.get(0).addChecker(whiteSet.getCheckerList().get(i));
            else if(i<8)
                slotSet2.get(4).addChecker(whiteSet.getCheckerList().get(i));
            else if(i<13)
                slotSet3.get(0).addChecker(whiteSet.getCheckerList().get(i));
            else if(i<15)
                slotSet4.get(5).addChecker(whiteSet.getCheckerList().get(i));
        }
        for(int i=0;i<15;i++){        
            if(i<5)
               slotSet4.get(0).addChecker(blackSet.getCheckerList().get(i));
            else if(i<8)
                slotSet3.get(4).addChecker(blackSet.getCheckerList().get(i));
            else if(i<13)
                slotSet2.get(0).addChecker(blackSet.getCheckerList().get(i));
            else if(i<15)
                slotSet1.get(5).addChecker(blackSet.getCheckerList().get(i));
        }
    }
    
    public void setStackAvaiable(Colors color){
        
        if(color == Colors.WHITE || color == Colors.RED){
            
            whiteStack.addMouseListener(mngr);
            whiteStack.setAvaiable(true);   
        }
        if(color == Colors.BLACK || color == Colors.BLUE){
            
            blackStack.addMouseListener(mngr);
            blackStack.setAvaiable(true);   
        }   
    }
    
    public void setBarAvaiable(Colors color){
        
        if(color == Colors.WHITE || color == Colors.RED){
            
            whiteBar.addMouseListener(mngr);
            whiteBar.setAvaiable(true);   
        }
        if(color == Colors.BLACK || color == Colors.BLUE){
            
            blackBar.addMouseListener(mngr);
            blackBar.setAvaiable(true);   
        }   
    }
    
    public JLayeredPane getPane(){
        return lp;
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


    public void paintComponent(Graphics g){
        
        g.drawImage(imageBoard,0,0,null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane lp;
    // End of variables declaration//GEN-END:variables
}
