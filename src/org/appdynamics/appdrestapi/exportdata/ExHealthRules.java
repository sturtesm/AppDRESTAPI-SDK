/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExHealthRule.class)
public class ExHealthRules {
    private ArrayList<ExHealthRule> healthRules=new ArrayList<ExHealthRule>();
    private int level=2;
    
    
    public ExHealthRules(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    
    @XmlElement(name=AppExportS.HEALTH_RULE)
    public ArrayList<ExHealthRule> getHealthRules() {
        return healthRules;
    }

    public void setHealthRules(ArrayList<ExHealthRule> healthRules) {
        this.healthRules = healthRules;
    }
    
    public String whatIsDifferent(ExHealthRules obj){
        if(this.equals(obj)) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.HEALTH_RULES);
        level++;
        for(ExHealthRule value:healthRules){
            boolean fnd=false;
            value.setLevel(level);
            for(ExHealthRule _value:obj.getHealthRules()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExHealthRule value:obj.getHealthRules()){
            boolean fnd=false;
            value.setLevel(level);
            for(ExHealthRule _value:healthRules){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);   
            }
        }
        
        level--;
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.HEALTH_RULES);
        level++;
        for(ExHealthRule rule: healthRules){rule.setLevel(level);bud.append(rule);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.healthRules != null ? this.healthRules.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExHealthRules other = (ExHealthRules) obj;
        for(ExHealthRule value:healthRules){
            boolean fnd=false;
            value.setLevel(level);
            for(ExHealthRule _value:other.getHealthRules()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value)) fnd=true;
                }
            }
            if(!fnd){                
                return false;   
            }
        }
        
        
        return true;
    }
    
    
}
