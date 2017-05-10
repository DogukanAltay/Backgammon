
package backgammon;

import java.awt.*;
import javax.swing.JFrame;

public class Backgammon {

    public static void main(String[] args) {
        
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        mainMenu.setPreferredSize(new Dimension(600, 800));
        mainMenu.setResizable(false);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
