
package backgammon;

public class Checker extends GameObject{
    
    private Colors colorID;
    private boolean hitFlag;
    private boolean bearOffFlag;
    private final int diameter = 50;
    
    public Checker(){
        super();
    }
    
    public Checker(int x, int y){
        positionX = x;
        positionY = y;
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
}
