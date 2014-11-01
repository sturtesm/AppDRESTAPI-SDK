/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExHealthRule.class)
public class ExHealthRules {
    private ArrayList<ExHealthRule> healthRules=new ArrayList<ExHealthRule>();
    
    public ExHealthRules(){}
    
    
    @XmlElement(name=AppExportS.HEALTH_RULE)
    public ArrayList<ExHealthRule> getHealthRules() {
        return healthRules;
    }

    public void setHealthRules(ArrayList<ExHealthRule> healthRules) {
        this.healthRules = healthRules;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.HEALTH_RULES);
        for(ExHealthRule rule: healthRules)bud.append(rule);
        return bud.toString();
    }
}
