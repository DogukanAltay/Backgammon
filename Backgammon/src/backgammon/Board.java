
package backgammon;

import javax.swing.*;

/**
 *
 * @author dogukan
 */
public class Board extends GameObject{
    
    //private BufferedImage image;
    private Icon image;
    private JLabel lblIcon;
    private final int WIDTH = 1000;
    private final int HEIGHT = 800;
            
    public Board(){
        super();
        image = new ImageIcon("C:\\Users/merta/Desktop/Backgammon-master/Backgammon/src/images/board.jpg");
        lblIcon = new JLabel(image);
        
    }
    
    /*public void paintComponent(Graphics g){
        
        g.setColor(Color.RED);
        g.fillRect(0,0,WIDTH,HEIGHT);
  
    }*/
    
}
