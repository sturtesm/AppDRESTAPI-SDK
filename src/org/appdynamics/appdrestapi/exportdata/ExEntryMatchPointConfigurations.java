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
@XmlSeeAlso(ExEntryMatchPointConfiguration.class)
public class ExEntryMatchPointConfigurations {
    private ArrayList<ExEntryMatchPointConfiguration> entryMatchPointConfiguration=new ArrayList<ExEntryMatchPointConfiguration>();
    private int level=2;
    
    
    public ExEntryMatchPointConfigurations(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.ENTRY_MATCH_POINT_CONFIGURATION)
    public ArrayList<ExEntryMatchPointConfiguration> getEntryMatchPointConfiguration() {
        return entryMatchPointConfiguration;
    }

    public void setEntryMatchPointConfiguration(ArrayList<ExEntryMatchPointConfiguration> entryMatchPointConfiguration) {
        this.entryMatchPointConfiguration = entryMatchPointConfiguration;
    }
    
    public String whatIsDifferent(ExEntryMatchPointConfigurations obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS);
        level++;
        for(ExEntryMatchPointConfiguration value:entryMatchPointConfiguration){
            boolean fnd=false;
            for(ExEntryMatchPointConfiguration _value:obj.getEntryMatchPointConfiguration()){
                if(value.getAgentType().equals(_value.getAgentType())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){value.setLevel(level); bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);}
        }
        
        for(ExEntryMatchPointConfiguration value:obj.getEntryMatchPointConfiguration()){
            boolean fnd=false;
            for(ExEntryMatchPointConfiguration _value:entryMatchPointConfiguration){
                if(value.getAgentType().equals(_value.getAgentType())){
                    fnd=true;
                }
                
            }
            if(!fnd){value.setLevel(level); bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);}
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS);
        level++;
        for(ExEntryMatchPointConfiguration emp : entryMatchPointConfiguration){ emp.setLevel(level);bud.append(emp);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.entryMatchPointConfiguration != null ? this.entryMatchPointConfiguration.hashCode() : 0);
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
        final ExEntryMatchPointConfigurations other = (ExEntryMatchPointConfigurations) obj;
        if (this.entryMatchPointConfiguration != other.entryMatchPointConfiguration && (this.entryMatchPointConfiguration == null || !this.entryMatchPointConfiguration.equals(other.entryMatchPointConfiguration))) {
            return false;
        }
        return true;
    }
    
    
    
}
