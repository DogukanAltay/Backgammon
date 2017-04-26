/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class BoardPanel extends JPanel{
    
    private JLayeredPane lp;
    
    private BufferedImage imageBoard;
    private final int WIDTH = 1000;
    private final int HEIGHT = 800;
    
    private ArrayList<Slot> slotSet1;
    private ArrayList<Slot> slotSet2;
    private ArrayList<Slot> slotSet3;
    private ArrayList<Slot> slotSet4;
    private CheckerSet ch1;
    public  Checker chc;
    
    public BoardPanel(){
        
        initComponents();
        
    }
    
    public void initComponents(){
        
        lp = new JLayeredPane();
        
        lp.setLocation(0, 0);
        lp.setPreferredSize(new java.awt.Dimension(1024, 804));
        //lp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lp.setBorder(javax.swing.BorderFactory.createTitledBorder("asdadsaddadsadasdadsa"));
        
        
        try {
           imageBoard = ImageIO.read(getClass().getResource("/images/board.jpg"));
       } catch (IOException e) {
           System.out.println("file error");
       }
        
        
        initSlots();
    
        add(lp);
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
            lp.add(slotSet1.get(i), new Integer(0),0);
        }
        chc = new Checker();
        chc.setOpaque(true);
        chc.setBounds(slot1X+5, 30, 50,50);
        lp.add(chc,new Integer(0), 0);
       
        // ...
    }
    
    public void paintComponent(Graphics g){
        //super.paintComponent(g);
        g.drawImage(imageBoard,0,0,null);
        //g.drawRect(10,10, 1400,1400);
        //slotSet1.get(0).whiteStack.peek().paintComponent(g);
    }
}
