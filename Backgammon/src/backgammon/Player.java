/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

/**
 *
 * @author dogukan
 */
public class Player {
    
    private String playerID;
    private CheckerSet checkerSet;
    private int score;
    
    public Player(){
        score = 0;
        checkerSet = null;
        playerID = "Player";
    }
    
    public Player(String playerID, CheckerSet set){
        this.playerID = playerID;
        this.checkerSet = set;
        score = 0;
    }
    
    public void setCheckerColor(Colors color){       
        checkerSet.setColorID(color);    
    }
    
    public void setScore(int i){
        score = i;
    }
    public int getScore(){
        return score;
    }
    public void setID(String id){
        playerID = id;
    }
    public String getID(){
        return playerID;
    }
    public void setCheckerSet(CheckerSet set){
        checkerSet = set;
    }
    public CheckerSet getCheckerSet(){
        return checkerSet;
    }
}
