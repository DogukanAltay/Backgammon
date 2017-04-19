
package backgammon;

import java.util.ArrayList;

public class CheckerSet extends GameObject{
    
    private String listID;
    private final ArrayList<Checker> checkerSet;
    private Colors colorID;
    
    public CheckerSet(){
        
        checkerSet = new ArrayList<Checker>(15);
        
        for(int i = 0; i<15; i++){
            Checker chkr = new Checker();
            
            checkerSet.add(chkr);

            chkr.setColorID(colorID);
        }
        
    }
    public CheckerSet(Colors colorID){
        this.colorID = colorID;
        
        checkerSet = new ArrayList<Checker>(15);
        
        for(int i = 0; i<15; i++){
            Checker chkr = new Checker();
            
            checkerSet.add(chkr);

            chkr.setColorID(colorID);
        }
        
    }
    
    public Checker getChecker(int index){       
        return checkerSet.get(index);
    }
    
    public Colors getColorID(){
        return colorID;
    }
    
//    public void setColorID(Colors colorID){
//        
//        for(int i = 0; i<15; i++){
//            
//            checkerSet.get(i).setColorID(colorID);
//        }
//    }
    
    public String getListID(){
        return listID;
    }
    
    public void setListID(String listID){
        this.listID = listID;
    }
}
