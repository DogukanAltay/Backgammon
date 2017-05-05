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
    private Slot labelPressed, labelReleased;
    private boolean control=false;
    public void mousePressed(MouseEvent e){
       
        if(!control){
            labelPressed = (Slot)e.getSource();
            //temp = labelPressed.peekChecker();
            control=true;
        }
        if(control&&labelPressed!=labelReleased){
            if(labelReleased.isAvailable()){
                /*if(temp!=null)
                    labelReleased.addChecker(labelPressed.popChecker());*/
                labelPressed.moveChecker(labelReleased);
                control=false;
            }                
        }             
    }
    public void mouseDragged(MouseEvent e){
        
        temp.setPosition(e.getX(),e.getY());
        System.out.println("csc"+temp.positionX);   
    }
  
    public void mouseEntered(MouseEvent e) {
        labelReleased = (Slot)e.getSource();
    }
}
