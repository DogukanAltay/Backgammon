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
    
    BoardPanel panel;
    private int positionX;
    private int positionY;
    private int reversedY;
    private int width;   
    private int height;
    private Color borderColor;
    private Colors slotColor;
    private boolean clicked = false;
    private boolean available;
    private boolean isReversed;

    Stack<Checker> checkerStack = new Stack<Checker>();
    
    public Slot(){
        super();
    }
      
    public Slot(int x, int y, int width, int height, BoardPanel panel, boolean available, boolean isReversed){
        super();
        this.positionX = x;
        this.positionY = y;
        this.width  = width;
        this.height = height;
        this.borderColor = Color.GREEN;
        this.slotColor = null;
        this.panel = panel;
        this.available = available;
        this.isReversed = isReversed;
        //mouseActions();
    }
    
    public void mouseActions(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                if(!clicked){
                    setColor(Color.RED);
                    panel.repaint();
                    clicked = true;
                }else{
                    setColor(Color.GREEN);
                    panel.repaint();
                    clicked = false;
                }
                                      
            }
            public void mouseReleased(MouseEvent me){
                
            }    
        });
    }
    
    public void moveChecker(Slot target){
        
        Checker moving = this.popChecker();
        
        if(moving!=null)
            target.addChecker(moving);       
    }
    
    public void addChecker(Checker a){
        
        checkerStack.push(a);
        setSlotColor();
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
        setSlotColor();
        return a;
    }
    
    public void paintComponent(Graphics g){
        
        if(available == true){
            g.setColor(borderColor);
            g.drawRect(0,0,width-1,height-1);
        }
            
        
        
       
       if(!isReversed){
            if(checkerStack.size()<7){

                for(int i=0;i<checkerStack.size();i++){

                   checkerStack.get(i).setOpaque(true);
                   checkerStack.get(i).setBounds(positionX + 3, positionY+(50*i), 50, 50);
                   panel.getPane().add(checkerStack.get(i), new Integer(1),0);
                }
            }
            else{
                for(int i=0;i<6;i++){

                   checkerStack.get(i).setOpaque(true);
                   checkerStack.get(i).setBounds(positionX + 3, positionY+(50*i), 50, 50);
                   panel.getPane().add(checkerStack.get(i), new Integer(1),0);
                }
            }    
       }
       else{
      
            reversedY = positionY + 270;
           
            if(checkerStack.size()<7){

                for(int i = checkerStack.size()-1; i >= 0; i--){

                   checkerStack.get(i).setOpaque(true);
                   checkerStack.get(i).setBounds(positionX + 3, reversedY-(50*i), 50, 50);
                   panel.getPane().add(checkerStack.get(i), new Integer(1),0);
                }
            }
            else{
                for(int i = 5; i >= 0; i--){

                   checkerStack.get(i).setOpaque(true);
                   checkerStack.get(i).setBounds(positionX + 3, reversedY-(50*i), 50, 50);
                   panel.getPane().add(checkerStack.get(i), new Integer(1),0);
                }
            }
       
       }

       g.dispose();
    }
   
    public Checker peekChecker(){
        Checker a;
        try{
            a = checkerStack.peek();
        }catch(EmptyStackException e){
            return null;
        }
        return a;
    }
    public boolean isStackEmpty(){
        
        return checkerStack.empty();
    }
    
    public void setColor(Color a){
        borderColor = a;
    }
    
    private void setSlotColor(){
        
        Checker temp = peekChecker();
        
        if(temp == null)
            slotColor = null;
        else
            slotColor = temp.getColorID();
    }
    
    public Colors getSlotColor(){
        return slotColor;
    }
    
    public boolean isClicked(){
        return clicked;
    }
    public void setClicked(boolean b){
        clicked = b;
    } 
    public int getX(){
        return positionX;
    }
    public int getY(){
        return positionY;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean a){
        available = a;
        repaint();
        revalidate();
        panel.repaint();
    }
}
