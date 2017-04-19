
package backgammon;

public class Checker extends GameObject{
    
    private Colors colorID;
    private boolean hitFlag;
    private boolean bearOffFlag;
    
    public Checker(){

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
