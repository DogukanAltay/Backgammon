
package backgammon;


import static backgammon.Colors.WHITE;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author dogukan
 */
public class Board extends GameObject{
    
    //private BufferedImage image;
    //private Icon image;
    private BufferedImage imageBoard;
    private final int WIDTH = 1000;
    private final int HEIGHT = 800;
    
    private ArrayList<Slot> slotSet1;
    private ArrayList<Slot> slotSet2;
    private ArrayList<Slot> slotSet3;
    private ArrayList<Slot> slotSet4;
    private CheckerSet ch1;
    public  Checker chc;
    
    public Board(){
        super();
        //image = new ImageIcon("C:\\Users/merta/Desktop/Backgammon-master/Backgammon/src/images/board.jpg");
        //lblIcon = new JLabel(image); 
       try {
           imageBoard = ImageIO.read(getClass().getResource("/images/board.jpg"));
       } catch (IOException e) {
           System.out.println("file error");
       }
    }
    
    public void initSlots(){
        
        int slotWidth = 56;
        int slotHeight = 300;
        int slot1X = 578;
        int slot1Y = 30;
        
        slotSet1 = new ArrayList<Slot>(6);
        slotSet2 = new ArrayList<Slot>(6);
        slotSet3 = new ArrayList<Slot>(6);
        slotSet4 = new ArrayList<Slot>(6);
        
        for(int i = 0; i<6; i++){
            
            slotSet1.add(i, new Slot(slot1X + (i * 57), 30, slotWidth, slotHeight));
            slotSet1.get(i).setOpaque(true);
            slotSet1.get(i).setBounds(slot1X + (i * 57), 30, slotWidth, slotHeight);
        }
        // ...
    }
    
    public void initCheckers(){
        
        //chc = new Checker();
        //chc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkerBlack.jpg")));
        
        ch1 = new CheckerSet(WHITE);
        slotSet1.get(0).addChecker(ch1.getChecker(0));
        //System.out.println(slotSet1.get(0).whiteStack.peek() + "AAA");
        //slotSet1.get(0).whiteStack.peek().setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkerBlack.png")));
        //slotSet1.get(0).whiteStack.peek().setBounds(581, 30, 50, 50);
        slotSet1.get(0).whiteStack.peek().setLocation(0, 0);
        //slotSet1.get(0).whiteStack.peek().setLocation(560, 30);
        slotSet1.get(0).whiteStack.peek().setOpaque(true);
        
    }
    
    public CheckerSet getCheckerSet1() {
        return ch1;
    }
    
    public ArrayList<Slot> getSlotSet1() {
        return slotSet1;
    }

    public ArrayList<Slot> getSlotSet2() {
        return slotSet2;
    }

    public ArrayList<Slot> getSlotSet3() {
        return slotSet3;
    }

    public ArrayList<Slot> getSlotSet4() {
        return slotSet4;
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        g.drawImage(imageBoard,0,0,null);
        //slotSet1.get(0).whiteStack.peek().paintComponent(g);
    }
    
    
}
