/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

import java.util.ArrayList;

public class CheckerSet extends GameObject{
    
    private String listID;
    private final ArrayList<Checker> checkerSet;
    
    public CheckerSet(){
        
        checkerSet = new ArrayList<Checker>(30);
        
        for(int i = 0; i<30; i++){
            Checker chk = new Checker();
            checkerSet.add(chk);
        }
    }
    
    public Checker getChecker(){
        
        return checkerSet.get(0);
    }
}
