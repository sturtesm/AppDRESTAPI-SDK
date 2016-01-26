/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author gilbert.solorzano
 * 
 */

@XmlSeeAlso({ExEntryMatchPointConfigurations.class,ExBusinessTransactions.class,ExMemoryConfiguration.class,
    ExCacheConfiguration.class,ExBackendMatchPointConfigurations.class,ExAgentConfigurations.class, ExApplicationComponentNodes.class})

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
    private ExBackendMatchPointConfigurations backendMatchPointConfigurations;
    private ExAgentConfigurations agentConfigurations;
    private ExApplicationComponentNodes nodes;
    private int level=3;
    
    public ExApplicationComponent(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.BACKEND_MATCH_POINT_CONFIGURATIONS)
    public ExBackendMatchPointConfigurations getBackendMatchPointConfigurations() {
        return backendMatchPointConfigurations;
    }

    public void setBackendMatchPointConfigurations(ExBackendMatchPointConfigurations backendMatchPointConfigurations) {
        this.backendMatchPointConfigurations = backendMatchPointConfigurations;
    }

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT_NODES)
    public ExApplicationComponentNodes getNodes() {
        return nodes;
    }

    public void setNodes(ExApplicationComponentNodes nodes) {
        this.nodes = nodes;
    }

    
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
        return backendMatchPointConfigurations;
    }

    public void setBackendMatchPointConfiguration(ExBackendMatchPointConfigurations backendMatchPointConfiguration) {
        this.backendMatchPointConfigurations = backendMatchPointConfiguration;
    }

    @XmlElement(name=AppExportS.AGENT_CONFIGURATIONS)
    public ExAgentConfigurations getAgentConfigurations() {
        return agentConfigurations;
    }

    public void setAgentConfigurations(ExAgentConfigurations agentConfigurations) {
        this.agentConfigurations = agentConfigurations;
    }
    
    /*

    private ExEntryMatchPointConfigurations entryMatchPointConfigurations;
    private ExBusinessTransactions businessTransactions;
    private ExMemoryConfiguration memoryConfiguration;
    private Object instanceTrackerConfiguration;
    private ExCacheConfiguration cacheConfiguration;
    private Object customCacheConfigurations;
    private ExBackendMatchPointConfigurations backendMatchPointConfigurations;
    private Object agentConfigurations;
    */
    public String whatIsDifferent(ExApplicationComponent obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(description != null && !description.equals(obj.getDescription())){
                bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(description);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDescription());
        }
        
        if(componentType != null && !componentType.equals(obj.getComponentType()) ){
                bud.append(AppExportS.I[level]).append(AppExportS.COMPONENT_TYPE);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(componentType);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getComponentType());
            
        }
        
        if(dynamicScalingEnabled != null && !dynamicScalingEnabled.equals(obj.getDynamicScalingEnabled()) ){
                bud.append(AppExportS.I[level]).append(AppExportS.DYNAMIC_SCALING_ENABLED);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(dynamicScalingEnabled);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDynamicScalingEnabled());
            
        }
        
        bud.append(entryMatchPointConfigurations.whatIsDifferent(obj.getEntryMatchPointConfigurations()));
        if(businessTransactions != null){businessTransactions.setLevel(level);bud.append(businessTransactions.whatIsDifferent(obj.getBusinessTransactions()));}
        if(memoryConfiguration != null) {memoryConfiguration.setLevel(level);bud.append(memoryConfiguration.whatIsDifferent(obj.getMemoryConfiguration()));}
        //bud.append(instanceTrackerConfiguration
        bud.append(cacheConfiguration.whatIsDifferent(obj.getCacheConfiguration()));
        //if(cacheConfiguration != null) {cacheConfiguration.setLevel(level);customCacheConfigurations.
        // backendMatchPointConfigurations
        // agentConfigurations
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
        bud.append(AppExportS.I[level]).append(AppExportS.COMPONENT_TYPE).append(AppExportS.VE).append(componentType);
        if(entryMatchPointConfigurations != null){entryMatchPointConfigurations.setLevel(level);bud.append(entryMatchPointConfigurations);}
        
        
        if(businessTransactions != null){businessTransactions.setLevel(level); bud.append(businessTransactions);}
        
        if(memoryConfiguration != null) {memoryConfiguration.setLevel(level);bud.append(memoryConfiguration);}
        
          //Didn't have entries
        bud.append(AppExportS.I[level]).append(AppExportS.INSTANCE_TRACKER_CONFIGURATIONS).append(AppExportS.VE).append(instanceTrackerConfiguration);
        if(cacheConfiguration != null) {cacheConfiguration.setLevel(level);bud.append(cacheConfiguration);}
          //Didn't have entries
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_CACHE_CONFIGURATIONS).append(AppExportS.VE).append(customCacheConfigurations);
          //Didn't have entries
        if(backendMatchPointConfigurations != null) {backendMatchPointConfigurations.setLevel(level); bud.append(backendMatchPointConfigurations);}
        
         //Didn't have entries
        if(agentConfigurations != null){
            agentConfigurations.setLevel(level);
            bud.append(agentConfigurations);
        }
        
        if(nodes != null){
            nodes.setLevel(level);
            bud.append(nodes);
        }
        
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 79 * hash + (this.componentType != null ? this.componentType.hashCode() : 0);
        hash = 79 * hash + (this.dynamicScalingEnabled != null ? this.dynamicScalingEnabled.hashCode() : 0);
        hash = 79 * hash + (this.entryMatchPointConfigurations != null ? this.entryMatchPointConfigurations.hashCode() : 0);
        hash = 79 * hash + (this.businessTransactions != null ? this.businessTransactions.hashCode() : 0);
        hash = 79 * hash + (this.memoryConfiguration != null ? this.memoryConfiguration.hashCode() : 0);
        hash = 79 * hash + (this.instanceTrackerConfiguration != null ? this.instanceTrackerConfiguration.hashCode() : 0);
        hash = 79 * hash + (this.cacheConfiguration != null ? this.cacheConfiguration.hashCode() : 0);
        hash = 79 * hash + (this.customCacheConfigurations != null ? this.customCacheConfigurations.hashCode() : 0);
        hash = 79 * hash + (this.backendMatchPointConfigurations != null ? this.backendMatchPointConfigurations.hashCode() : 0);
        hash = 79 * hash + (this.agentConfigurations != null ? this.agentConfigurations.hashCode() : 0);
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
        final ExApplicationComponent other = (ExApplicationComponent) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if ((this.componentType == null) ? (other.componentType != null) : !this.componentType.equals(other.componentType)) {
            return false;
        }
        if ((this.dynamicScalingEnabled == null) ? (other.dynamicScalingEnabled != null) : !this.dynamicScalingEnabled.equals(other.dynamicScalingEnabled)) {
            return false;
        }
        if (this.entryMatchPointConfigurations != other.entryMatchPointConfigurations && (this.entryMatchPointConfigurations == null || !this.entryMatchPointConfigurations.equals(other.entryMatchPointConfigurations))) {
            return false;
        }
        if (this.businessTransactions != other.businessTransactions && (this.businessTransactions == null || !this.businessTransactions.equals(other.businessTransactions))) {
            return false;
        }
        if (this.memoryConfiguration != other.memoryConfiguration && (this.memoryConfiguration == null || !this.memoryConfiguration.equals(other.memoryConfiguration))) {
            return false;
        }
        if (this.instanceTrackerConfiguration != other.instanceTrackerConfiguration && (this.instanceTrackerConfiguration == null || !this.instanceTrackerConfiguration.equals(other.instanceTrackerConfiguration))) {
            return false;
        }
        if (this.cacheConfiguration != other.cacheConfiguration && (this.cacheConfiguration == null || !this.cacheConfiguration.equals(other.cacheConfiguration))) {
            return false;
        }
        if (this.customCacheConfigurations != other.customCacheConfigurations && (this.customCacheConfigurations == null || !this.customCacheConfigurations.equals(other.customCacheConfigurations))) {
            return false;
        }
        if (this.backendMatchPointConfigurations != other.backendMatchPointConfigurations && (this.backendMatchPointConfigurations == null || !this.backendMatchPointConfigurations.equals(other.backendMatchPointConfigurations))) {
            return false;
        }
        if (this.agentConfigurations != other.agentConfigurations && (this.agentConfigurations == null || !this.agentConfigurations.equals(other.agentConfigurations))) {
            return false;
        }
        return true;
    }
    
    
    
    
}


/*
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