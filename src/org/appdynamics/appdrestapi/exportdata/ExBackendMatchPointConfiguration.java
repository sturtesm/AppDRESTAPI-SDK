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
 * <backend-match-point-configuration>
            <override>true</override>
            <agent-type>APP_AGENT</agent-type>
            <custom-exit-point-definitions/>
            <backend-discovery-configurations>
                
 */
@XmlSeeAlso({ExBackendDiscoveryConfigurations.class,ExCustomExitPointDefinitions.class})
public class ExBackendMatchPointConfiguration {
    private boolean override;
    private String agentType;
    private ExCustomExitPointDefinitions customExitPointDefinitions;
    private ExBackendDiscoveryConfigurations backendDiscoveryConfiguration;
    
    public ExBackendMatchPointConfiguration(){}

    @XmlElement(name=AppExportS.OVERRIDE)
    public boolean isOverride() {
        return override;
    }

    public void setOverride(boolean override) {
        this.override = override;
    }

    @XmlElement(name=AppExportS.AGENT_TYPE)
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    @XmlElement(name=AppExportS.CUSTOM_EXIT_POINT_DEFINITIONS)
    public ExCustomExitPointDefinitions getCustomExitPointDefinitions() {
        return customExitPointDefinitions;
    }

    public void setCustomExitPointDefinitions(ExCustomExitPointDefinitions customExitPointDefinitions) {
        this.customExitPointDefinitions = customExitPointDefinitions;
    }

    @XmlElement(name=AppExportS.BACKEND_DISCOVERY_CONFIGURATIONS)
    public ExBackendDiscoveryConfigurations getBackendDiscoveryConfiguration() {
        return backendDiscoveryConfiguration;
    }

    public void setBackendDiscoveryConfiguration(ExBackendDiscoveryConfigurations backendDiscoveryConfiguration) {
        this.backendDiscoveryConfiguration = backendDiscoveryConfiguration;
    }
    
    public String whatIsDifferent(ExBackendMatchPointConfiguration obj){
        if(this.equals(obj) || !agentType.equals(obj.getAgentType()) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATION);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        
        if(override != obj.isOverride()){     
            bud.append(AppExportS.L2_1).append(AppExportS.TYPE);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(override);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isOverride());   
        }
        
        bud.append(customExitPointDefinitions.whatIsDifferent(obj.getCustomExitPointDefinitions()));
        bud.append(backendDiscoveryConfiguration.whatIsDifferent(obj.getBackendDiscoveryConfiguration()));
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATION);
        bud.append(AppExportS.L2).append(AppExportS.OVERRIDE).append(AppExportS.VE).append(override);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        bud.append(customExitPointDefinitions);
        bud.append(backendDiscoveryConfiguration);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.override ? 1 : 0);
        hash = 37 * hash + (this.agentType != null ? this.agentType.hashCode() : 0);
        hash = 37 * hash + (this.customExitPointDefinitions != null ? this.customExitPointDefinitions.hashCode() : 0);
        hash = 37 * hash + (this.backendDiscoveryConfiguration != null ? this.backendDiscoveryConfiguration.hashCode() : 0);
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
        final ExBackendMatchPointConfiguration other = (ExBackendMatchPointConfiguration) obj;
        if (this.override != other.override) {
            return false;
        }
        if ((this.agentType == null) ? (other.agentType != null) : !this.agentType.equals(other.agentType)) {
            return false;
        }
        if (this.customExitPointDefinitions != other.customExitPointDefinitions && (this.customExitPointDefinitions == null || !this.customExitPointDefinitions.equals(other.customExitPointDefinitions))) {
            return false;
        }
        if (this.backendDiscoveryConfiguration != other.backendDiscoveryConfiguration && (this.backendDiscoveryConfiguration == null || !this.backendDiscoveryConfiguration.equals(other.backendDiscoveryConfiguration))) {
            return false;
        }
        return true;
    }
    
    
    
}
