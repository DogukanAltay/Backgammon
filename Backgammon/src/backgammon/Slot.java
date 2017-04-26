package backgammon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import static javax.swing.JLayeredPane.DRAG_LAYER;

/**
 *
 * @author dogukan
 */
public class Slot extends GameObject{
    
    private int x;
    private int y;
    private int width;   
    private int height;
    private Color color;
    private boolean clicked;

    Stack<Checker> checkerStack = new Stack<Checker>();
    
    public Slot(){
        super();
    }
    
    public Slot(int x, int y, int width, int height){
        super();
        this.x = x;
        this.y = y;
        this.width  = width;
        this.height = height;
        color = Color.GREEN;
        mouseActions();
    }
    
    public void mouseActions(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
            
                if(clicked==false){
                    setColor(Color.RED);
                    popChecker();
                    repaint();
                    clicked = true;
                }else{
                    
                    setColor(Color.GREEN);
                    clicked = false;
                    repaint();
                }        
            }
                
        });
    }
    
    
    
    public void addChecker(Checker a){
        
        checkerStack.push(a);
        repaint();
    }
    
    public Checker popChecker(){
       
        Checker a = checkerStack.pop();
        remove(a);
        repaint();
        revalidate();
        return a;
    }
    
    public boolean isStackEmpty(){
        
        return checkerStack.empty();
    }
    
    public void setColor(Color a){
        color = a;
    }
    
    public void paintComponent(Graphics g){
        
        g.setColor(color);       
        g.drawRect(0,0,width-1,height-1);
       /* Checker c = new Checker(0,0);
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
        c5.paintComponent(g);*/
       
       if(checkerStack.size()<7){
           
            for(int i=0;i<checkerStack.size();i++){
           
               checkerStack.get(i).setPosition(3,50*i);
               checkerStack.get(i).paintComponent(g);
               
            }
       }else{
            for(int i=0;i<6;i++){
           
                checkerStack.get(i).setPosition(3,50*i);
                checkerStack.get(i).paintComponent(g);
                
            }
       }
       
       g.dispose();
    }
   
}
