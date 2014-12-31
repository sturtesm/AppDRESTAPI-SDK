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
/**
 *
 * @author gilbert.solorzano
 * This is going to be the root object for the export.
 * 
@XmlSeeAlso({ExConfiguration.class,ExEumCloudConfig.class})
* 
* ,ExCustomMatchPointDefinition.class,ExMatchRule.class,ExPojoRule.class,ExMatchClass.class,ExSplitConfig.class,
    ExMatchMethod.class,ExMatchClassName.class,ExCustomMatchPointDefinitions.class
 */

@XmlRootElement(name=AppExportS.APPLICATION)
@XmlSeeAlso({ExConfiguration.class,ExDataGathererConfigs.class,ExApplicationComponents.class,
    ExBusinessTransactionGroup.class,ExEntryMatchPointConfigurations.class,
    ExBackendMatchPointConfigurations.class,ExMetricBaselines.class,
    ExInfoPointGathererConfigs.class,ExTasks.class,ExWorkflows.class,ExAgentConfigurations.class,
    ExEumCloudConfig.class,ExHealthRules.class})

public class ExApplication {
    private String name;
    private String description;
    private String envProperties;
    private String controllerVersion;
    
    
    private ExConfiguration configuration;
    private ExDataGathererConfigs dataGathererConfigs;
    private ExApplicationComponents applicationComponents;
    private ExBusinessTransactionGroup businessTransactionGroups;
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
    public ExBusinessTransactionGroup getBusinessTransactionGroups() {
        return businessTransactionGroups;
    }

    public void setBusinessTransactionGroups(ExBusinessTransactionGroup businessTransactionGroups) {
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
    

    
    
    @Override 
    public String toString(){
        StringBuilder bud = new StringBuilder();
        try{
            bud.append(AppExportS.APPLICATION);
            bud.append(AppExportS.L1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
            bud.append(AppExportS.L1).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
            bud.append(AppExportS.L1).append(AppExportS.CONTROLLER_VERSION).append(AppExportS.VE).append(controllerVersion);
            bud.append(configuration); //done
            bud.append(dataGathererConfigs); //done 10/25
            bud.append(applicationComponents); //done 10/25
            bud.append(healthRules); // done 12/30
            
            bud.append(entryPointMatchConfigurations);
            bud.append(backendMatchPointConfigurations);
        
            bud.append(metricBaselines); //done 12/22 needs testing
            
            bud.append(agentConfigurations); //done 12/22 needs testing
            bud.append(eumCloudConfig); //done 12/30
        
        }catch(Exception e){e.printStackTrace();}
        return bud.toString();
    }
    //Configuration
}
