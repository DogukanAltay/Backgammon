package backgammon;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dogukan
 */
public class testBoard {
    
    public static void main(String[] args){
        
        JFrame f = new JFrame();
        
        GamePanel gp = new GamePanel();
        
        //Board bb = new Board();
        //Slot sl;
        
        f.add(gp);
        
        //f.getContentPane().add(gamePanel);
        f.setSize(new Dimension(1000, 1000));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
