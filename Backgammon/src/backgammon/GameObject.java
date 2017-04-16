/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backgammon;

import java.awt.Image;

public class GameObject {
    
    private int positionX;
    private int positionY;
    private Image objectImage; 
    
    public GameObject(){
        
    }
    
    public int draw (Image objectImage, int positionX, int positionY){
        
        System.out.println(positionX + " " + positionY);
        
        return 0;
    }
    
}
