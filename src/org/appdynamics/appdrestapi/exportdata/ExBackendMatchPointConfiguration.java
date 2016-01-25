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
/*
 * 
 * <backend-match-point-configuration>
            <override>true</override>
            <agent-type>APP_AGENT</agent-type>
            <custom-exit-point-definitions/>
            <backend-discovery-configurations>
                
 */
@XmlSeeAlso({ExBackendDiscoveryConfigurations.class,ExCustomExitPointDefinitions.class,ExBackendDiscoveryConfigurations.class})
public class ExBackendMatchPointConfiguration {
    private boolean override;
    private String agentType;
    private ExCustomExitPointDefinitions customExitPointDefinitions; //This needs to be worked on
    private ExBackendDiscoveryConfigurations backendDiscoveryConfigurations;
    private int level=6;
    
    public ExBackendMatchPointConfiguration(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
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
        return backendDiscoveryConfigurations;
    }

    public void setBackendDiscoveryConfiguration(ExBackendDiscoveryConfigurations backendDiscoveryConfiguration) {
        this.backendDiscoveryConfigurations = backendDiscoveryConfiguration;
    }
    
    public String whatIsDifferent(ExBackendMatchPointConfiguration obj){
        if(this.equals(obj) || !agentType.equals(obj.getAgentType()) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        
        if(override != obj.isOverride()){     
            bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(override);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isOverride());   
            level--;
        }
        
        customExitPointDefinitions.setLevel(level);
        bud.append(customExitPointDefinitions.whatIsDifferent(obj.getCustomExitPointDefinitions()));
        
        backendDiscoveryConfigurations.setLevel(level);
        bud.append(backendDiscoveryConfigurations.whatIsDifferent(obj.getBackendDiscoveryConfiguration()));
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.OVERRIDE).append(AppExportS.VE).append(override);
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        customExitPointDefinitions.setLevel(level);
        bud.append(customExitPointDefinitions);
        backendDiscoveryConfigurations.setLevel(level);
        bud.append(backendDiscoveryConfigurations);
        
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.override ? 1 : 0);
        hash = 37 * hash + (this.agentType != null ? this.agentType.hashCode() : 0);
        hash = 37 * hash + (this.customExitPointDefinitions != null ? this.customExitPointDefinitions.hashCode() : 0);
        hash = 37 * hash + (this.backendDiscoveryConfigurations != null ? this.backendDiscoveryConfigurations.hashCode() : 0);
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
        if (this.backendDiscoveryConfigurations != other.backendDiscoveryConfigurations && (this.backendDiscoveryConfigurations == null || !this.backendDiscoveryConfigurations.equals(other.backendDiscoveryConfigurations))) {
            return false;
        }
        return true;
    }
    
    
    
}
