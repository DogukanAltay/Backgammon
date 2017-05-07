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
public class RuleController {
    
    Rule hitRule,safeRule,colorRule;
    boolean playableFlag;
    boolean hittableFlag;
    
    public RuleController(){
        
        initializeRules();
        playableFlag = false;
        hittableFlag = false;
    }
    
    public void initializeRules(){
        hitRule = new HitRule();
        safeRule = new SafeRule();
        colorRule = new ColorRule();
    }
    
    public void checkRules(Slot source, Slot target){
        
        hitRule.setSource(source);
        hitRule.setTarget(target);
        safeRule.setSource(source);
        safeRule.setTarget(target);
        colorRule.setSource(source);
        colorRule.setTarget(target);
        
        hitRule.ruleCondition();
        safeRule.ruleCondition();
        colorRule.ruleCondition();
        
        if(safeRule.getRuleFlag() && colorRule.getRuleFlag())
            playableFlag = true;
        else
            playableFlag = false;
        
        if(hitRule.getRuleFlag()){
            hittableFlag = true;
        }else
            hittableFlag = false;
               
    }
    
    
}
