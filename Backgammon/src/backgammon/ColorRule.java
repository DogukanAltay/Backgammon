/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backgammon;

/**
 *
 * @author Metin
 */
public class ColorRule extends Rule{
    public ColorRule(){
        super();
    } 
    public ColorRule(Slot source, Slot target){
        
        super(source, target);
        this.ruleCondition();
    }
    
    @Override
    public void ruleCondition(){
        
    
        if(targetSlot.getSlotColor()!=null){  
            if(targetSlot.getSlotColor() != sourceSlot.getSlotColor())
                ruleFlag = false;
            else
                ruleFlag = true;  
        }else
            ruleFlag = true;
        System.out.println("adasd");
    }
}
