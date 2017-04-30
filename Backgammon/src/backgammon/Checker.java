
package backgammon;

import java.awt.Color;
import java.awt.Graphics;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Checker extends GameObject{
    
    private BufferedImage image;
    private BoardPanel panel;
    private Colors colorID;
    private boolean hitFlag;
    private boolean bearOffFlag;
    public final int diameter = 50;  
    
    public Checker(){
        super();
        
        try {
           image = ImageIO.read(getClass().getResource("/images/checkerBlack.png"));
        } catch (IOException e) {
           System.out.println("file error");
        }
    }
    
    public Checker(Colors color, BoardPanel panel){
        
        this.panel = panel; 
        colorID = color;
        String pngPath;
        if(colorID == Colors.WHITE)
            pngPath = "/images/checkerWhite.png";
        else if(colorID == Colors.BLUE)
              pngPath = "/images/checkerBlue.png";
        else if(colorID == Colors.BLACK)
            pngPath = "/images/checkerblack.png";
        else
            pngPath = "/images/checkerRed.png";        
        try {
          image = ImageIO.read(getClass().getResource(pngPath));
            
        } catch (IOException e) {
           System.out.println("file error");
        }
        //this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkerBlack.jpg")));
    
    }
    
    public void setPosition(int x, int y){
        positionX = x;
        positionY = y;
        repaint();
        panel.repaint();
        revalidate();
        
    }
    
    public Colors getColorID(){
        return colorID;
    }
    
    public void setColorID(Colors colorID){
        this.colorID = colorID;
    }
    
    public boolean getHitFlag(){
        return hitFlag;
    }
    
    public void setHitFlag(boolean hitFlag){
        this.hitFlag = hitFlag;
    }
    
    public boolean getBearOffFlag(){
        return bearOffFlag;
    }
    
    public void setBearOffFlag(boolean bearOffFlag){
        this.bearOffFlag = bearOffFlag;
    }
    
    public void paintComponent(Graphics g){
        g.setColor(Color.RED);
        //g.drawOval(positionX, positionY, diameter, diameter);
        //g.drawImage(image, 100, 100, diameter, diameter,null);
        g.drawImage(image, positionX, positionY, null);
    }
}
