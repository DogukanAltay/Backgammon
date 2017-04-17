/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import javax.swing.JFrame;

/**
 *
 * @author dogukan
 */
public class testBoard {
    
    public static void main(String[] args){
        
        JFrame f = new JFrame("Window"); 
        f.add(new Board());
        f.add(new Slot(0,0));
        f.setSize(1000,1000); 
        f.setVisible(true);
        
    }
    
}
