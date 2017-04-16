/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backgammon;

import java.util.Random;

public class Die extends GameObject{
    
    private int value;
    
    public Die(){
        
    }
    
    public int getValue(){
        
        return value;
    }
    
    public void roll(){
        
        Random randGen = new Random();
    
        value = randGen.nextInt(6) + 1;
    }
    
}
