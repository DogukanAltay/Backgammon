/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backgammon;

import java.awt.*;
import javax.swing.JFrame;

public class Backgammon {

    public static void main(String[] args) {
        
        int val1, val2;
                
        Die die1 = new Die();
        Die die2 = new Die();
        
        Checker chk = new Checker();
        CheckerSet set1 = new CheckerSet();
        
        Checker chk2 = set1.getChecker();       
                
        die1.roll();
        die2.roll();
        
        val1 = die1.getValue();
        val2 = die2.getValue();
                
        System.out.println("Die1: " + val1 +
                " \nDie2: " + val2);
        
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        mainMenu.setPreferredSize(new Dimension(600, 800));
        mainMenu.setResizable(false);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
