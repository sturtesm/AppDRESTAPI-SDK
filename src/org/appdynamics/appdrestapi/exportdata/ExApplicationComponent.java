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
 * 
        <application-component>
            <name>2ndTier</name>
            <description/>
            <component-type>Application Server</component-type>
            <dynamic-scaling-enabled>false</dynamic-scaling-enabled>
            <entry-match-point-configurations/>
            <business-transactions/>
            <memory-configuration>
                <size-polling-interval>10</size-polling-interval>
                <enable-cache-framework-size-monitoring>true</enable-cache-framework-size-monitoring>
                <enable-memory-monitoring>true</enable-memory-monitoring>
            </memory-configuration>
            <instance-tracker-configurations/>
            <cache-configuration>
                <disable-cache-monitoring>false</disable-cache-monitoring>
                <disable-standard-cache-frameworks>false</disable-standard-cache-frameworks>
            </cache-configuration>
            <custom-cache-configurations/>
            <backend-match-point-configurations/>
            <agent-configurations/>
            <application-component-nodes>
                <application-component-node>
                    <name>2ndTierNode1</name>
                    <node-unique-local-id>2ndTierNode1</node-unique-local-id>
                    <node-type>Other</node-type>
                </application-component-node>
            </application-component-nodes>
        </application-component>
 * 
 */
@XmlSeeAlso({ExEntryMatchPointConfigurations.class,ExBackendMatchPointConfigurations.class,ExMemoryConfiguration.class,ExCacheConfiguration.class,ExBusinessTransactions.class,ExBusinessTransactions.class,ExSla.class,
    ExNamingConfig.class,ExNameValues.class,ExNameValue.class,ExBusinessTransactionConfig.class})

public class ExApplicationComponent {
    private String name;
    private String description;
    private String componentType;
    private String dynamicScalingEnabled;
    private ExEntryMatchPointConfigurations entryMatchPointConfigurations;
    private ExBusinessTransactions businessTransactions;
    private ExMemoryConfiguration memoryConfiguration;
    private Object instanceTrackerConfiguration;
    private ExCacheConfiguration cacheConfiguration;
    private Object customCacheConfigurations;
    private ExBackendMatchPointConfigurations backendMatchPointConfiguration;
    private Object agentConfigurations;
    
    public ExApplicationComponent(){}

    @XmlElement(name=AppExportS.DYNAMIC_SCALING_ENABLED)
    public String getDynamicScalingEnabled() {
        return dynamicScalingEnabled;
    }

    public void setDynamicScalingEnabled(String dynamicScalingEnabled) {
        this.dynamicScalingEnabled = dynamicScalingEnabled;
    }

    
    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name=AppExportS.COMPONENT_TYPE)
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    @XmlElement(name=AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS)
    public ExEntryMatchPointConfigurations getEntryMatchPointConfigurations() {
        return entryMatchPointConfigurations;
    }

    public void setEntryMatchPointConfigurations(ExEntryMatchPointConfigurations entryMatchPointConfigurations) {
        this.entryMatchPointConfigurations = entryMatchPointConfigurations;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTIONS)
    public ExBusinessTransactions getBusinessTransactions() {
        return businessTransactions;
    }

    public void setBusinessTransactions(ExBusinessTransactions businessTransactions) {
        this.businessTransactions = businessTransactions;
    }

    @XmlElement(name=AppExportS.MEMORY_CONFIGURATION)
    public ExMemoryConfiguration getMemoryConfiguration() {
        return memoryConfiguration;
    }

    public void setMemoryConfiguration(ExMemoryConfiguration memoryConfiguration) {
        this.memoryConfiguration = memoryConfiguration;
    }

    @XmlElement(name=AppExportS.INSTANCE_TRACKER_CONFIGURATIONS)
    public Object getInstanceTrackerConfiguration() {
        return instanceTrackerConfiguration;
    }

    public void setInstanceTrackerConfiguration(Object instanceTrackerConfiguration) {
        this.instanceTrackerConfiguration = instanceTrackerConfiguration;
    }

    @XmlElement(name=AppExportS.CACHE_CONFIGURATION)
    public ExCacheConfiguration getCacheConfiguration() {
        return cacheConfiguration;
    }

    public void setCacheConfiguration(ExCacheConfiguration cacheConfiguration) {
        this.cacheConfiguration = cacheConfiguration;
    }

    @XmlElement(name=AppExportS.CUSTOM_CACHE_CONFIGURATIONS)
    public Object getCustomCacheConfigurations() {
        return customCacheConfigurations;
    }

    public void setCustomCacheConfigurations(Object customCacheConfigurations) {
        this.customCacheConfigurations = customCacheConfigurations;
    }

    @XmlElement(name=AppExportS.BACKEND_MATCH_POINT_CONFIGURATIONS)
    public ExBackendMatchPointConfigurations getBackendMatchPointConfiguration() {
        return backendMatchPointConfiguration;
    }

    public void setBackendMatchPointConfiguration(ExBackendMatchPointConfigurations backendMatchPointConfiguration) {
        this.backendMatchPointConfiguration = backendMatchPointConfiguration;
    }

    @XmlElement(name=AppExportS.AGENT_CONFIGURATIONS)
    public Object getAgentConfigurations() {
        return agentConfigurations;
    }

    public void setAgentConfigurations(Object agentConfigurations) {
        this.agentConfigurations = agentConfigurations;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.APPLICATION_COMPONENT);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
        bud.append(AppExportS.L2).append(AppExportS.COMPONENT_TYPE).append(AppExportS.VE).append(componentType);
        bud.append(AppExportS.L2).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS).append(AppExportS.VE).append(entryMatchPointConfigurations);
        bud.append(businessTransactions);
        bud.append(memoryConfiguration);
          //Didn't have entries
        bud.append(AppExportS.L2).append(AppExportS.INSTANCE_TRACKER_CONFIGURATIONS).append(AppExportS.VE).append(instanceTrackerConfiguration);
        bud.append(cacheConfiguration);
          //Didn't have entries
        bud.append(AppExportS.L2).append(AppExportS.CUSTOM_CACHE_CONFIGURATIONS).append(AppExportS.VE).append(customCacheConfigurations);
          //Didn't have entries
        bud.append(backendMatchPointConfiguration);
         //Didn't have entries
        bud.append(AppExportS.L2).append(AppExportS.AGENT_CONFIGURATIONS).append(AppExportS.VE).append(agentConfigurations);
        
        
        
        return bud.toString();
    }
    
}
