/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;


import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExCustomMatchPointDefinition.class)

public class ExCustomMatchPointDefinitions {
    private ArrayList<ExCustomMatchPointDefinition> customMatchPointDefinitions=new ArrayList<ExCustomMatchPointDefinition>();
    private int level=5;
    
    public ExCustomMatchPointDefinitions(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.CUSTOM_MATCH_POINT_DEFINITION)
    public ArrayList<ExCustomMatchPointDefinition> getCustomMatchPointDefinitions() {
        return customMatchPointDefinitions;
    }

    public void setCustomMatchPointDefinitions(ArrayList<ExCustomMatchPointDefinition> customMatchPointDefinitions) {
        this.customMatchPointDefinitions = customMatchPointDefinitions;
    }
    
    public String whatIsDifferent(ExCustomMatchPointDefinitions obj){
        if( this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_MATCH_POINT_DEFINITIONS);
        level++;
        
        for(ExCustomMatchPointDefinition value:customMatchPointDefinitions){
            boolean fnd=false;
            for(ExCustomMatchPointDefinition _value:obj.getCustomMatchPointDefinitions()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                value.setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
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
                value.setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
    
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_MATCH_POINT_DEFINITIONS);
        level++;
        for(ExCustomMatchPointDefinition cm:customMatchPointDefinitions){ cm.setLevel(level);bud.append(cm);}
        level--;
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
