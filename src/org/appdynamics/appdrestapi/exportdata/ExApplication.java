/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

//import org.appdynamics.appdrestapi.resources.s;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 * <p>
 * This is going to be the root object for the export for the application object. 
 * </p>
 * 
* 
 */

@XmlRootElement(name=AppExportS.APPLICATION)
@XmlSeeAlso({ExConfiguration.class,ExDataGathererConfigs.class,ExApplicationComponents.class,
    ExBusinessTransactionGroups.class,ExEntryMatchPointConfigurations.class,
    ExBackendMatchPointConfigurations.class,ExMetricBaselines.class,
    ExInfoPointGathererConfigs.class,ExTasks.class,ExWorkflows.class,ExAgentConfigurations.class,
    ExEumCloudConfig.class,ExHealthRules.class})

public class ExApplication {
    private String name;
    private String description;
    private String envProperties;
    private String controllerVersion;
    private int level=1;
    
    
    private ExConfiguration configuration;
    private ExDataGathererConfigs dataGathererConfigs;
    private ExApplicationComponents applicationComponents;
    private ExBusinessTransactionGroups businessTransactionGroups;
    private ExEntryMatchPointConfigurations entryPointMatchConfigurations;
    private ExBackendMatchPointConfigurations backendMatchPointConfigurations;

    private ExMetricBaselines metricBaselines;
    private ExInfoPointGathererConfigs infoPointGathereConfigs;
    private ExTasks tasks;
    private ExWorkflows workflows;
    private ExAgentConfigurations agentConfigurations;
    private ExEumCloudConfig eumCloudConfig;
    private ExHealthRules healthRules;
    
    
    public ExApplication(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    @XmlElement(name=AppExportS.ENV_PROPERTIES)
    public String getEnvProperties() {
        return envProperties;
    }

    public void setEnvProperties(String envProperties) {
        this.envProperties = envProperties;
    }

    @XmlAttribute(name=AppExportS.CONTROLLER_VERSION)
    public String getControllerVersion() {
        return controllerVersion;
    }

    public void setControllerVersion(String controllerVersion) {
        this.controllerVersion = controllerVersion;
    }


    @XmlElement(name=AppExportS.CONFIGURATION)
    public ExConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ExConfiguration configuration) {
        this.configuration = configuration;
    }

    @XmlElement(name=AppExportS.DATA_GATHERER_CONFIGS)
    public ExDataGathererConfigs getDataGathererConfigs() {
        return dataGathererConfigs;
    }

    public void setDataGathererConfigs(ExDataGathererConfigs dataGathererConfigs) {
        this.dataGathererConfigs = dataGathererConfigs;
    }

    @XmlElement(name=AppExportS.APPLICATION_COMPONENTS)
    public ExApplicationComponents getApplicationComponents() {
        return applicationComponents;
    }

    public void setApplicationComponents(ExApplicationComponents applicationComponents) {
        this.applicationComponents = applicationComponents;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION_GROUPS)
    public ExBusinessTransactionGroups getBusinessTransactionGroups() {
        return businessTransactionGroups;
    }

    public void setBusinessTransactionGroups(ExBusinessTransactionGroups businessTransactionGroups) {
        this.businessTransactionGroups = businessTransactionGroups;
    }

    @XmlElement(name=AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS)
    public ExEntryMatchPointConfigurations getEntryPointMatchConfigurations() {
        return entryPointMatchConfigurations;
    }

    public void setEntryPointMatchConfigurations(ExEntryMatchPointConfigurations entryPointMatchConfigurations) {
        this.entryPointMatchConfigurations = entryPointMatchConfigurations;
    }

    @XmlElement(name=AppExportS.BACKEND_MATCH_POINT_CONFIGURATIONS)
    public ExBackendMatchPointConfigurations getBackendMatchPointConfigurations() {
        return backendMatchPointConfigurations;
    }

    public void setBackendMatchPointConfigurations(ExBackendMatchPointConfigurations backendMatchPointConfigurations) {
        this.backendMatchPointConfigurations = backendMatchPointConfigurations;
    }

    @XmlElement(name=AppExportS.METRIC_BASELINES)
    public ExMetricBaselines getMetricBaselines() {
        return metricBaselines;
    }

    public void setMetricBaselines(ExMetricBaselines metricBaselines) {
        this.metricBaselines = metricBaselines;
    }

    @XmlElement(name=AppExportS.INFO_POINT_GATHERER_CONFIGS)
    public ExInfoPointGathererConfigs getInfoPointGathereConfigs() {
        return infoPointGathereConfigs;
    }

    public void setInfoPointGathereConfigs(ExInfoPointGathererConfigs infoPointGathereConfigs) {
        this.infoPointGathereConfigs = infoPointGathereConfigs;
    }

    @XmlElement(name=AppExportS.TASKS)
    public ExTasks getTasks() {
        return tasks;
    }

    public void setTasks(ExTasks tasks) {
        this.tasks = tasks;
    }

    @XmlElement(name=AppExportS.WORKFLOWS)
    public ExWorkflows getWorkflows() {
        return workflows;
    }

    public void setWorkflows(ExWorkflows workflows) {
        this.workflows = workflows;
    }

    @XmlElement(name=AppExportS.AGENT_CONFIGURATIONS)
    public ExAgentConfigurations getAgentConfigurations() {
        return agentConfigurations;
    }

    public void setAgentConfigurations(ExAgentConfigurations agentConfigurations) {
        this.agentConfigurations = agentConfigurations;
    }
    
    @XmlElement(name=AppExportS.EUM_CLOUD_CONFIG)
    public ExEumCloudConfig getEumCloudConfig() {
        return eumCloudConfig;
    }

    public void setEumCloudConfig(ExEumCloudConfig eumCloudConfig) {
        this.eumCloudConfig = eumCloudConfig;
    }

    @XmlElement(name=AppExportS.HEALTH_RULES)
    public ExHealthRules getHealthRules() {
        return healthRules;
    }

    public void setHealthRules(ExHealthRules healthRules) {
        this.healthRules = healthRules;
    }
    

    public String whatIsDifferent(ExApplication obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.APPLICATION);
        level++;
        
        if(configuration != null) configuration.setLevel(level);
        if(dataGathererConfigs != null) dataGathererConfigs.setLevel(level);
        if(applicationComponents != null) applicationComponents.setLevel(level);
        if(healthRules != null) healthRules.setLevel(level);
        if(entryPointMatchConfigurations != null) entryPointMatchConfigurations.setLevel(level);
        if(backendMatchPointConfigurations != null) backendMatchPointConfigurations.setLevel(level);
        if(metricBaselines != null) metricBaselines.setLevel(level);
        if(agentConfigurations != null) agentConfigurations.setLevel(level);
        if(eumCloudConfig != null) eumCloudConfig.setLevel(level);
        
        
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!name.equals(obj.getName())){     
            bud.append(AppExportS.I[level]).append(AppExportS.NAME);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(name);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getName());    
            level--;
        }
        
        if(!description.equals(obj.getDescription())){
            bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_INSTRUMENTATION_LEVEL);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(description);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDescription());    
            level--;
        }
        
        if(!controllerVersion.equals(obj.getControllerVersion())){
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_INSTRUMENTATION_LEVEL);
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(description);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDescription());    
            level--;
        }
        
        bud.append(configuration.whatIsDifferent(obj.getConfiguration())); //done
        bud.append(dataGathererConfigs.whatIsDifferent(obj.getDataGathererConfigs())); //done 10/25
        bud.append(applicationComponents); //done 10/25
        bud.append(healthRules.whatIsDifferent(obj.getHealthRules())); // done 12/30

        bud.append(entryPointMatchConfigurations.whatIsDifferent(obj.getEntryPointMatchConfigurations()));
        bud.append(backendMatchPointConfigurations);

        bud.append(metricBaselines.whatIsDifferent(obj.getMetricBaselines())); //done 12/31

        bud.append(agentConfigurations.whatIsDifferent(obj.getAgentConfigurations())); //done 12/31, need testing
        bud.append(eumCloudConfig.whatIsDifferent(obj.getEumCloudConfig())); //done 12/30
        
        level--;
        return bud.toString();
    }
    
    
    @Override 
    public String toString(){
        StringBuilder bud = new StringBuilder();
        try{
            bud.append(AppExportS.APPLICATION);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
            bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
            bud.append(AppExportS.I[level]).append(AppExportS.CONTROLLER_VERSION).append(AppExportS.VE).append(controllerVersion);
            
            if(configuration != null) configuration.setLevel(level);
            if(dataGathererConfigs != null) dataGathererConfigs.setLevel(level);
            if(applicationComponents != null) applicationComponents.setLevel(level);
            if(healthRules != null) healthRules.setLevel(level);
            if(entryPointMatchConfigurations != null) entryPointMatchConfigurations.setLevel(level);
            if(backendMatchPointConfigurations != null) backendMatchPointConfigurations.setLevel(level);
            if(metricBaselines != null) metricBaselines.setLevel(level);
            if(agentConfigurations != null) agentConfigurations.setLevel(level);
            if(eumCloudConfig != null) eumCloudConfig.setLevel(level);
            if(infoPointGathereConfigs != null) infoPointGathereConfigs.setLevel(level);
            
            bud.append(configuration); //done
            bud.append(dataGathererConfigs); //done 10/25
            bud.append(applicationComponents); //done 10/25
            bud.append(healthRules); // done 12/30
            
            bud.append(entryPointMatchConfigurations);
            bud.append(backendMatchPointConfigurations);
        
            bud.append(metricBaselines); //done 12/31
            
            bud.append(infoPointGathereConfigs);
            bud.append(agentConfigurations); //done 12/31, need testing
            bud.append(eumCloudConfig); //done 12/30
        
        }catch(Exception e){e.printStackTrace();}
        level--;
        return bud.toString();
    }

    //Configuration
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 97 * hash + (this.envProperties != null ? this.envProperties.hashCode() : 0);
        hash = 97 * hash + (this.controllerVersion != null ? this.controllerVersion.hashCode() : 0);
        hash = 97 * hash + (this.configuration != null ? this.configuration.hashCode() : 0);
        hash = 97 * hash + (this.dataGathererConfigs != null ? this.dataGathererConfigs.hashCode() : 0);
        hash = 97 * hash + (this.applicationComponents != null ? this.applicationComponents.hashCode() : 0);
        hash = 97 * hash + (this.businessTransactionGroups != null ? this.businessTransactionGroups.hashCode() : 0);
        hash = 97 * hash + (this.entryPointMatchConfigurations != null ? this.entryPointMatchConfigurations.hashCode() : 0);
        hash = 97 * hash + (this.backendMatchPointConfigurations != null ? this.backendMatchPointConfigurations.hashCode() : 0);
        hash = 97 * hash + (this.metricBaselines != null ? this.metricBaselines.hashCode() : 0);
        hash = 97 * hash + (this.infoPointGathereConfigs != null ? this.infoPointGathereConfigs.hashCode() : 0);
        hash = 97 * hash + (this.tasks != null ? this.tasks.hashCode() : 0);
        hash = 97 * hash + (this.workflows != null ? this.workflows.hashCode() : 0);
        hash = 97 * hash + (this.agentConfigurations != null ? this.agentConfigurations.hashCode() : 0);
        hash = 97 * hash + (this.eumCloudConfig != null ? this.eumCloudConfig.hashCode() : 0);
        hash = 97 * hash + (this.healthRules != null ? this.healthRules.hashCode() : 0);
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
        final ExApplication other = (ExApplication) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if ((this.envProperties == null) ? (other.envProperties != null) : !this.envProperties.equals(other.envProperties)) {
            return false;
        }
        if ((this.controllerVersion == null) ? (other.controllerVersion != null) : !this.controllerVersion.equals(other.controllerVersion)) {
            return false;
        }
        if (this.configuration != other.configuration && (this.configuration == null || !this.configuration.equals(other.configuration))) {
            return false;
        }
        if (this.dataGathererConfigs != other.dataGathererConfigs && (this.dataGathererConfigs == null || !this.dataGathererConfigs.equals(other.dataGathererConfigs))) {
            return false;
        }
        if (this.applicationComponents != other.applicationComponents && (this.applicationComponents == null || !this.applicationComponents.equals(other.applicationComponents))) {
            return false;
        }
        if (this.businessTransactionGroups != other.businessTransactionGroups && (this.businessTransactionGroups == null || !this.businessTransactionGroups.equals(other.businessTransactionGroups))) {
            return false;
        }
        if (this.entryPointMatchConfigurations != other.entryPointMatchConfigurations && (this.entryPointMatchConfigurations == null || !this.entryPointMatchConfigurations.equals(other.entryPointMatchConfigurations))) {
            return false;
        }
        if (this.backendMatchPointConfigurations != other.backendMatchPointConfigurations && (this.backendMatchPointConfigurations == null || !this.backendMatchPointConfigurations.equals(other.backendMatchPointConfigurations))) {
            return false;
        }
        if (this.metricBaselines != other.metricBaselines && (this.metricBaselines == null || !this.metricBaselines.equals(other.metricBaselines))) {
            return false;
        }
        if (this.infoPointGathereConfigs != other.infoPointGathereConfigs && (this.infoPointGathereConfigs == null || !this.infoPointGathereConfigs.equals(other.infoPointGathereConfigs))) {
            return false;
        }
        if (this.tasks != other.tasks && (this.tasks == null || !this.tasks.equals(other.tasks))) {
            return false;
        }
        if (this.workflows != other.workflows && (this.workflows == null || !this.workflows.equals(other.workflows))) {
            return false;
        }
        if (this.agentConfigurations != other.agentConfigurations && (this.agentConfigurations == null || !this.agentConfigurations.equals(other.agentConfigurations))) {
            return false;
        }
        if (this.eumCloudConfig != other.eumCloudConfig && (this.eumCloudConfig == null || !this.eumCloudConfig.equals(other.eumCloudConfig))) {
            return false;
        }
        if (this.healthRules != other.healthRules && (this.healthRules == null || !this.healthRules.equals(other.healthRules))) {
            return false;
        }
        return true;
    }
    
    
}
