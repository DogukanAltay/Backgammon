package backgammon;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author dogukan
 */
public class Slot extends GameObject{
    
    int x,y;
    Stack<Checker> whiteStack = new Stack<Checker>();
    Stack<Checker> blackStack = new Stack<Checker>();
    
    public Slot(){
        super();
    }
    
    public Slot(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }
    
    public void addChecker(Checker a){
        
        if(a.getColorID() == Colors.WHITE){
            whiteStack.push(a);
            System.out.println("White Checker added");
        }   
        else{
            blackStack.add(a);
            System.out.println("Black Checker added.");
        }
                    
    }
    
    public Checker popChecker(Colors color){
       
        if(color == Colors.WHITE)
            return whiteStack.pop();
        else
            return blackStack.pop();
                                 
    }
    
    public boolean isWhiteEmpty(){
        
        return whiteStack.empty();
    }
    public boolean isBlackEmpty(){
        
        return blackStack.empty();
    }
    
    public void paintComponent(Graphics g){
        
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 50, 200);
            
    }
    
    
    
}
