/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backgammon;

import java.awt.*;
import javax.swing.*;


public class GameObject extends JLabel{
    
    protected int positionX;
    protected int positionY;
    
    public GameObject(){
        
    }
    
    public void paintComponent (Graphics g){
        
        System.out.println(positionX + " " + positionY);
        
    }
    
}
