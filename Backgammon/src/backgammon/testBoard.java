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
        
        BoardPanel gp = new BoardPanel();
        //BoardPanel gp = new BoardPanel();
       // gp.setStackAvaiable(Colors.BLUE);
        f.add(gp);
        
        //f.getContentPane().add(gamePanel);
        f.setSize(new Dimension(1500, 1000));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
