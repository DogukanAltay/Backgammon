/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author dogukan
 */
public class Board extends GameObject{
    
    private BufferedImage image;
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
            
    public Board(){
        super();
    }
    
    public void paintComponent(Graphics g){
        
        g.setColor(Color.RED);
        g.fillRect(0,0,WIDTH,HEIGHT);
  
    }
    
}
