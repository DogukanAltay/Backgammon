
package backgammon;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Checker extends GameObject{
    
    private BufferedImage image;
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
    
    public Checker(int x, int y){
        positionX = x;
        positionY = y;
        
        try {
           image = ImageIO.read(getClass().getResource("/images/checkerBlack.png"));
        } catch (IOException e) {
           System.out.println("file error");
        }
        //this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkerBlack.jpg")));
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
        
        //g.drawImage(image, 100, 100, diameter, diameter,null);
        g.drawImage(image, positionX, positionY, null);
        
    }
}
