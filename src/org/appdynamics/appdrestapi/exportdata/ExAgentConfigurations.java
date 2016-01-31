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
 *
 */

@XmlSeeAlso(ExAgentConfiguration.class)
public class ExAgentConfigurations {
    private ArrayList<ExAgentConfiguration> agentConfiguration=new ArrayList<ExAgentConfiguration>();
    private int level=2;
    
    public ExAgentConfigurations(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
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
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_CONFIGURATIONS).append(" size ").append(agentConfiguration.size());
        level++;
        for(ExAgentConfiguration agent:agentConfiguration){agent.setLevel(level);bud.append(agent);}
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExAgentConfigurations obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_CONFIGURATIONS).append(" size ").append(agentConfiguration.size());
        level++;
        for(ExAgentConfiguration val: agentConfiguration){
            boolean fnd=false;
            val.setLevel(level);
            for(ExAgentConfiguration val1: obj.getAgentConfiguration()){
                if(val.getAgentType().equals(val1.getAgentType())){
                    fnd=true;
                    bud.append(val.whatIsDifferent(val1));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.AGENT_CONFIGURATION);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(val.getAgentType());
            }
        }
        
        for(ExAgentConfiguration val: obj.getAgentConfiguration()){
            boolean fnd=false;
            val.setLevel(level);
            for(ExAgentConfiguration val1: agentConfiguration){
                if(val.getAgentType().equals(val1.getAgentType())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.AGENT_CONFIGURATION);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(val.getAgentType());
                
            }
        }
        
        level--;
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
        
        // First we make sure they are the same size
        if(agentConfiguration.size() != other.getAgentConfiguration().size()) return false;
        
        // Then we compare each object to each other
        for(ExAgentConfiguration val: agentConfiguration){
            boolean fnd=false;
            val.setLevel(level);
            for(ExAgentConfiguration val1: other.getAgentConfiguration()){
                if(val.getAgentType().equals(val1.getAgentType())){
                    if(!val.equals(val1)){ fnd=true;}
                    
                }
            }
            if(!fnd) return false;
        }
        

        return true;
    }
    
    
}
/*
 *  <agent-configurations>
        <agent_configuration/>
    </agent-configurations>
 */