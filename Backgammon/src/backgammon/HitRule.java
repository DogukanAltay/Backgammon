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
public class HitRule extends Rule{
    
    Rule safeRule;
    
    public HitRule(){
        super();
    }
    
    public HitRule(Slot source, Slot target){
        
        super(source, target);
        safeRule = new SafeRule(source, target);
        
        this.ruleCondition();
    }
    
    @Override
    public void ruleCondition(){
        
        if(safeRule.getRuleFlag()) // if safe cannot hit the checker,
            ruleFlag = false;      // else we can hit it.
        else
            ruleFlag = true;
    }
}
