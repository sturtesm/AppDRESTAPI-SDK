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
@XmlSeeAlso({ExCustomMatchPointDefinition.class,ExMatchRule.class,ExPojoRule.class,ExMatchClass.class,ExSplitConfig.class,
    ExMatchMethod.class,ExMatchClassName.class})

public class ExCustomMatchPointDefinitions {
    private ArrayList<ExCustomMatchPointDefinition> customMatchPointDefinitions=new ArrayList<ExCustomMatchPointDefinition>();
    
    public ExCustomMatchPointDefinitions(){}

    @XmlElement(name=AppExportS.CUSTOM_MATCH_POINT_DEFINITION)
    public ArrayList<ExCustomMatchPointDefinition> getCustomMatchPointDefinitions() {
        return customMatchPointDefinitions;
    }

    public void setCustomMatchPointDefinitions(ArrayList<ExCustomMatchPointDefinition> customMatchPointDefinitions) {
        this.customMatchPointDefinitions = customMatchPointDefinitions;
    }
    
    public String whatIsDifferent(ExCustomMatchPointDefinitions obj){
        if( this.equals(obj) ) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.COOKIES);
        
        for(ExCustomMatchPointDefinition value:customMatchPointDefinitions){
            boolean fnd=false;
            for(ExCustomMatchPointDefinition _value:obj.getCustomMatchPointDefinitions()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExCustomMatchPointDefinition value:obj.getCustomMatchPointDefinitions()){
            boolean fnd=false;
            for(ExCustomMatchPointDefinition _value:customMatchPointDefinitions){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(value);
            }
        }
    
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.CUSTOM_MATCH_POINT_DEFINITIONS);
        for(ExCustomMatchPointDefinition cm:customMatchPointDefinitions) bud.append(cm.toString());
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.customMatchPointDefinitions != null ? this.customMatchPointDefinitions.hashCode() : 0);
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
        final ExCustomMatchPointDefinitions other = (ExCustomMatchPointDefinitions) obj;
        if (this.customMatchPointDefinitions != other.customMatchPointDefinitions && (this.customMatchPointDefinitions == null || !this.customMatchPointDefinitions.equals(other.customMatchPointDefinitions))) {
            return false;
        }
        return true;
    }
    
    
}
