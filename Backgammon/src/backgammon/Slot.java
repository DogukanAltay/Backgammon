package backgammon;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author dogukan
 */
public class Slot extends GameObject{
    
    private int x;
    private int y;
    private int width;   
    private int height;

    Stack<Checker> whiteStack = new Stack<Checker>();
    Stack<Checker> blackStack = new Stack<Checker>();
    
    public Slot(){
        super();
    }
    
    public Slot(int x, int y, int width, int height){
        super();
        this.x = x;
        this.y = y;
        this.width  = width;
        this.height = height;
    }
    
    public void addChecker(Checker a){
        
        if(a.getColorID() == Colors.WHITE){
            whiteStack.push(a);
            
            //System.out.println(whiteStack.get(0).diameter+ "a.dm: " + a.diameter + "White Checker added");
            System.out.println("White Checker added");
        }   
        else{
            blackStack.push(a);
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
        
        g.setColor(Color.GREEN);       
        g.drawRect(0,0,width,height);
        Checker c = new Checker(0,0);
        c.paintComponent(g);
        Checker c1 = new Checker(0,50);
        c1.paintComponent(g);
        Checker c2 = new Checker(0,100);
        c2.paintComponent(g);
        Checker c3 = new Checker(0,150);
        c3.paintComponent(g);
        Checker c4 = new Checker(0,200);
        c4.paintComponent(g);
        Checker c5 = new Checker(0,250);
        c5.paintComponent(g);
    }
   
}
