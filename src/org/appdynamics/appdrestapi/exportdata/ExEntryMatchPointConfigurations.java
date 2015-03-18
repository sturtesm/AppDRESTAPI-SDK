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
@XmlSeeAlso({ExEntryMatchPointConfiguration.class,ExEEPointConfiguration.class,ExDiscoveryConfig.class,
    ExNamingConfig.class,ExNameValues.class,ExNameValue.class,ExExclude.class,ExServletRule.class,ExClassName.class,
    ExCustomMatchPointDefinitions.class,ExCustomMatchPointDefinition.class,ExMatchRule.class,ExPojoRule.class,
    ExMatchClass.class,ExSplitConfig.class,ExMatchMethod.class,ExMatchClassName.class})
public class ExEntryMatchPointConfigurations {
    private ArrayList<ExEntryMatchPointConfiguration> entryMatchPointConfiguration=new ArrayList<ExEntryMatchPointConfiguration>();
    
    public ExEntryMatchPointConfigurations(){}

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
        bud.append(AppExportS.L1).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS);
        
        for(ExEntryMatchPointConfiguration value:entryMatchPointConfiguration){
            boolean fnd=false;
            for(ExEntryMatchPointConfiguration _value:obj.getEntryMatchPointConfiguration()){
                if(value.getAgentType().equals(_value.getAgentType())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd) bud.append(AppExportS.L2).append(AppExportS.SRC).append(value);
        }
        
        for(ExEntryMatchPointConfiguration value:obj.getEntryMatchPointConfiguration()){
            boolean fnd=false;
            for(ExEntryMatchPointConfiguration _value:entryMatchPointConfiguration){
                if(value.getAgentType().equals(_value.getAgentType())){
                    fnd=true;
                }
                
            }
            if(!fnd) bud.append(AppExportS.L2).append(AppExportS.DEST).append(value);
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS);
        for(ExEntryMatchPointConfiguration emp : entryMatchPointConfiguration) bud.append(emp.toString());
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
