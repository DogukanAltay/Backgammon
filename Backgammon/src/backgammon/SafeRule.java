/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

/**
 *
 * @author mertarmagan
 */
public class SafeRule extends Rule{
    
    //protected yaptım, gerek kalmadı getter'a classlar arası iletişim saglayabiliyoruz.
    
    //private boolean ruleFlag;
    //private Slot targetSlot;
    //private Slot sourceSlot;
    public SafeRule(){
        super();
    } 
    public SafeRule(Slot source, Slot target){
        
        super(source, target);
        this.ruleCondition();
    }
    
    @Override
    public void ruleCondition(){
        
        if(targetSlot.getSlotColor()!= null){
            if(targetSlot.getSlotColor() == sourceSlot.getSlotColor() || targetSlot.checkerStack.size() < 2 )
                ruleFlag = true;
            else
                ruleFlag = false;      
        }else
            ruleFlag = true;
     
    }
}
