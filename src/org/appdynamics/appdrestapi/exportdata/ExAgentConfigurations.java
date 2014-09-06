/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
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
@XmlSeeAlso({ExAgentConfiguration.class,ExPropertyDefinitions.class,ExPropertyDefinition.class,ExProperties.class,ExProperty.class})
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
        for(ExAgentConfiguration agent:agentConfiguration) bud.append(agent.toString());
        return bud.toString();
    }
}
