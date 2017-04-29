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
    
    GamePanel panel;
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
    
    public Slot(int x, int y, int width, int height, GamePanel panel){
        super();
        this.x = x;
        this.y = y;
        this.width  = width;
        this.height = height;
        color = Color.GREEN;
        this.panel = panel;
        mouseActions();
    }
    
    public void mouseActions(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){  
                setColor(Color.RED);
                panel.repaint();
                clicked = true;                      
            }
            public void mouseReleased(MouseEvent me){
                setColor(Color.GREEN);
                clicked = false;
                panel.repaint();
            }    
        });
    }
    
    
    
    public void addChecker(Checker a){
        
        checkerStack.push(a);
        repaint();
        panel.repaint();
        revalidate();
    }
    
    public Checker popChecker(){
       Checker a;
        try{
            a = checkerStack.pop();
        }catch(EmptyStackException e){
            panel.repaint();
            revalidate();
            return null;
        }
        remove(a);
        repaint();
        panel.repaint();
        revalidate();
        return a;
    }
    
    public Checker peekChecker(){
        return checkerStack.peek();
    }
    public boolean isStackEmpty(){
        
        return checkerStack.empty();
    }
    
    public void setColor(Color a){
        color = a;
    }
    public boolean isClicked(){
        return clicked;
    }
    public void setClicked(boolean b){
        clicked = b;
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
   
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
