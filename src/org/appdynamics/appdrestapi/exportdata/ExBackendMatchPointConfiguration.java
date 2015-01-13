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
    private boolean agentType;
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
    public boolean isAgentType() {
        return agentType;
    }

    public void setAgentType(boolean agentType) {
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
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATION);
        bud.append(AppExportS.L2).append(AppExportS.OVERRIDE).append(AppExportS.VE).append(override);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        if(customExitPointDefinitions != null) bud.append(customExitPointDefinitions.toString());
        if(backendDiscoveryConfiguration != null) bud.append(backendDiscoveryConfiguration.toString());
        return bud.toString();
    }
    
    
    
}
