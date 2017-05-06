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
    
    public int roll(){
        
        Random randGen = new Random();
    
        return value = randGen.nextInt(6) + 1;
    }
    
}
