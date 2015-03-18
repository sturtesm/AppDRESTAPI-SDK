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
 * 
 *  <agent-configurations>
        <agent_configuration/>
    </agent-configurations>
 */
@XmlSeeAlso(ExAgentConfiguration.class)
public class ExAgentConfigurations {
    private ArrayList<ExAgentConfiguration> agentConfiguration=new ArrayList<ExAgentConfiguration>();
    
    public ExAgentConfigurations(){}

    @XmlElement(name=AppExportS.AGENT_CONFIGURATION)
    public ArrayList<ExAgentConfiguration> getAgentConfiguration() {
        return agentConfiguration;
    }

    public void setAgentConfiguration(ArrayList<ExAgentConfiguration> agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.AGENT_CONFIGURATIONS).append(" size ").append(agentConfiguration.size());
        for(ExAgentConfiguration agent:agentConfiguration) bud.append(agent);
        return bud.toString();
    }
    
    public String whatIsDifferent(ExAgentConfigurations obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        for(ExAgentConfiguration val: agentConfiguration){
            boolean fnd=false;
            for(ExAgentConfiguration val1: obj.getAgentConfiguration()){
                if(val.getAgentType().equals(val1.getAgentType())){
                    fnd=true;
                    bud.append(val.whatIsDifferent(val1));
                }
            }
            if(!fnd){
                bud.append(AppExportS.L2).append(AppExportS.AGENT_CONFIGURATION);
                bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(val.getAgentType());
            }
        }
        
        for(ExAgentConfiguration val: obj.getAgentConfiguration()){
            boolean fnd=false;
            for(ExAgentConfiguration val1: agentConfiguration){
                if(val.getAgentType().equals(val1.getAgentType())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L2).append(AppExportS.AGENT_CONFIGURATION);
                bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(val.getAgentType());
                
            }
        }
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.agentConfiguration != null ? this.agentConfiguration.hashCode() : 0);
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
        final ExAgentConfigurations other = (ExAgentConfigurations) obj;
        if (this.agentConfiguration != other.agentConfiguration && (this.agentConfiguration == null || !this.agentConfiguration.equals(other.agentConfiguration))) {
            return false;
        }
        return true;
    }
    
    
}
