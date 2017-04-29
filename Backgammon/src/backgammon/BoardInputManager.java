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
    private Checker temp;
    private Slot labelPressed, labelReleased;
    public void mousePressed(MouseEvent e){
        
        labelPressed = (Slot)e.getSource();
        
        temp = labelPressed.peekChecker();
        System.out.println(labelPressed.getX());
        
    }
    public void mouseDragged(MouseEvent e){
        
        temp.setPosition(e.getComponent().getX(),e.getComponent().getY());
        System.out.println("csc"+temp.positionX);   
    }
    
    public void mouseReleased(MouseEvent e){
       
        
        labelReleased.addChecker(labelPressed.popChecker());
        System.out.println(labelReleased.getX());
    }
    public void mouseEntered(MouseEvent e) {
        labelReleased = (Slot)e.getSource();
        System.out.println("asdas"+labelReleased.getX());
    }
}
