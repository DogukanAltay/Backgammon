/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author dogukan
 */
public class BoardInputManager extends MouseAdapter {
    private Checker temp,asd;
    private BoardPanel board;
    private Slot labelPressed, labelReleased;
    private boolean control=false;
    public BoardInputManager(BoardPanel a){
        board=a;
    }
    public void mousePressed(MouseEvent e){
        
        if(!control){
            labelPressed = (Slot)e.getSource();
            
            //temp = labelPressed.peekChecker();
            if(labelPressed.isAvailable() && !labelPressed.isStackEmpty()){
                board.showPlayableSlots(labelPressed);
                control=true;
            }     
        }
        if(control&&labelPressed!=labelReleased){
            if(labelReleased.isAvailable()&&labelPressed.isAvailable()){
                /*if(temp!=null)
                    labelReleased.addChecker(labelPressed.popChecker());*/
                board.move(labelPressed, labelReleased);
                control=false;
                board.isPlayed();
                
                
            }                
        }             
    }
    public void mouseEntered(MouseEvent e) {
        labelReleased = (Slot)e.getSource();
    }
    
    public void mouseClicked(MouseEvent e){
      /*  if(labelPressed.isAvailable()){
            board.collectToStack(labelPressed);
        }
        */
    }
}
