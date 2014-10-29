/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;


import java.util.ArrayList;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 <configuration>
        <application-instrumentation-level>PRODUCTION</application-instrumentation-level>
        <snapshot-evaluation-interval>1</snapshot-evaluation-interval>
        <snapshot-quiet-time-post-sla-failure>30</snapshot-quiet-time-post-sla-failure>
        <policy-engine-enabled>true</policy-engine-enabled>
        <call-graph agent-type="xxxx">
        </call-graph>
        <sla>
            <art>
                <critical enabled="true">30000</critical>
                <warning enabled="true">15000</warning>
            </art>
            <epm>
                <critical enabled="true">100</critical>
                <warning enabled="true">20</warning>
            </epm>
        </sla>
        <background-business-transaction-config>
            <snapshot-collection-policy>
                <minute-frequency enabled="true">10</minute-frequency>
                <nth-occurance enabled="false">100</nth-occurance>
                <sla-violation collect-outliers-only="true" duration="5"
                    enabled="true" max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
                <automatic-collection-enabled>true</automatic-collection-enabled>
                <automatic-slow-volume-percentage-threshold>10</automatic-slow-volume-percentage-threshold>
                <automatic-error-volume-percentage-threshold>10</automatic-error-volume-percentage-threshold>
            </snapshot-collection-policy>
            <bt-request-thresholds>
                <starting-node-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </starting-node-slow-threshold>
                <continuing-segment-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </continuing-segment-slow-threshold>
                <exit-call-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </exit-call-slow-threshold>
                <starting-node-extremely-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>4.0</standard-deviation-threshold>
                </starting-node-extremely-slow-threshold>
                <stall-configuration>
                    <absolute>true</absolute>
                    <absolute-time-in-secs>0</absolute-time-in-secs>
                    <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                </stall-configuration>
            </bt-request-thresholds>
        </background-business-transaction-config>
        <business-transaction-config>
            <snapshot-collection-policy>
                <minute-frequency enabled="true">10</minute-frequency>
                <nth-occurance enabled="false">100</nth-occurance>
                <sla-violation collect-outliers-only="true" duration="5"
                    enabled="true" max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
                <automatic-collection-enabled>true</automatic-collection-enabled>
                <automatic-slow-volume-percentage-threshold>10</automatic-slow-volume-percentage-threshold>
                <automatic-error-volume-percentage-threshold>10</automatic-error-volume-percentage-threshold>
            </snapshot-collection-policy>
            <bt-request-thresholds>
                <starting-node-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </starting-node-slow-threshold>
                <continuing-segment-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </continuing-segment-slow-threshold>
                <exit-call-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </exit-call-slow-threshold>
                <starting-node-extremely-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>4.0</standard-deviation-threshold>
                </starting-node-extremely-slow-threshold>
                <stall-configuration>
                    <absolute>true</absolute>
                    <absolute-time-in-secs>45</absolute-time-in-secs>
                    <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                </stall-configuration>
            </bt-request-thresholds>
        </business-transaction-config>
        <error-configuration agent-type="java-app-agent">
            <disable-java-logging>false</disable-java-logging>
            <disable-log4j-logging>false</disable-log4j-logging>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions/>
            <ignore-logger-names/>
            <capture-logger-error-and-fatal-messages>true</capture-logger-error-and-fatal-messages>
            <max-frames-in-root-cause>5</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>
        <error-configuration agent-type="dotnet-app-agent">
            <disable-system-trace>false</disable-system-trace>
            <disable-event-log>false</disable-event-log>
            <disable-n-log>false</disable-n-log>
            <disable-log4net-logging>false</disable-log4net-logging>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions/>
            <ignore-logger-names/>
            <capture-logger-error-and-fatal-messages>true</capture-logger-error-and-fatal-messages>
            <max-frames-in-root-cause>0</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>
        <error-configuration agent-type="php-app-agent">
            <detect-php-errors>true</detect-php-errors>
            <php-error-level>ERROR</php-error-level>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions/>
            <ignore-logger-names/>
            <capture-logger-error-and-fatal-messages>false</capture-logger-error-and-fatal-messages>
            <max-frames-in-root-cause>0</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>
        <eum-configuration/>
        <properties/>
        <async-activity-supported>true</async-activity-supported>
    </configuration> 
 */
@XmlSeeAlso({ExAgentConfiguration.class,ExAgentConfigurations.class,ExApplicationComponents.class,
    ExApplicationDiagnosticData.class,ExArt.class,ExBackendMatchPointConfigurations.class,
    ExBackgroundBusinessTransactionConfig.class,ExBtRequestThresholds.class,ExBusinessTransactionConfig.class,
    ExBusinessTransactionGroup.class,ExCallGraph.class,ExConfiguration.class,ExCritical.class,ExDataGathererConfigs.class,
    ExEntryMatchPointConfigurations.class,ExEpm.class,ExErrorConfiguration.class,ExEumCloudConfig.class,
    ExEumConfiguration.class,ExExcludeConfig.class,ExHttpDataGathererConfig.class,ExInfoPointGathererConfigs.class,
    ExMetricBaseline.class,ExMetricBaselines.class,ExPageConfig.class,ExProperties.class,ExProperty.class,
    ExPropertyDefinition.class,ExPropertyDefinitions.class,ExSla.class,ExSlaViolation.class,ExSlowThreshold.class,
    ExSnapshotCollectionPolicy.class,ExSqlDataGathererConfig.class,ExStallConfiguration.class,ExTasks.class,ExWarning.class,
    ExWorkflows.class})
public class ExConfiguration {
    private String applicationInstrumentationLevel;
    private String snapshotEvaluationInternal;
    private int snapshotQuietTimePostSLAFailure;
    private boolean policyEngineEnabled;
    private boolean asyncActivitySupported;
    
    private ArrayList<ExCallGraph> callGraphs=new ArrayList<ExCallGraph>();
    private ExSla sla;
    private ArrayList<ExErrorConfiguration> errorConfiguration=new ArrayList<ExErrorConfiguration>();
    private ExBusinessTransactionConfig businessTransactionConfig;
    private ExBackgroundBusinessTransactionConfig backgroundBusinessTransactionConfig;
    
    private ExEumConfiguration eumConfiguration;



    private ArrayList<ExProperties> properties=new ArrayList<ExProperties>();
    
    public ExConfiguration(){}

    @XmlElement(name=AppExportS.APPLICATION_INSTRUMENTATION_LEVEL)
    public String getApplicationInstrumentationLevel() {
        return applicationInstrumentationLevel;
    }

    public void setApplicationInstrumentationLevel(String applicationInstrumentationLevel) {
        this.applicationInstrumentationLevel = applicationInstrumentationLevel;
    }

    @XmlElement(name=AppExportS.SNAPSHOT_EVALUATION_INTERVAL)
    public String getSnapshotEvaluationInternal() {
        return snapshotEvaluationInternal;
    }

    public void setSnapshotEvaluationInternal(String snapshotEvaluationInternal) {
        this.snapshotEvaluationInternal = snapshotEvaluationInternal;
    }

    @XmlElement(name=AppExportS.SNAPSHOT_QUIET_TIME_POST_SLA_FAILURE)
    public int getSnapshotQuietTimePostSLAFailure() {
        return snapshotQuietTimePostSLAFailure;
    }

    public void setSnapshotQuietTimePostSLAFailure(int snapshotQuietTimePostSLAFailure) {
        this.snapshotQuietTimePostSLAFailure = snapshotQuietTimePostSLAFailure;
    }

    @XmlElement(name=AppExportS.POLICY_ENGINE_ENABLED)
    public boolean isPolicyEngineEnabled() {
        return policyEngineEnabled;
    }

    public void setPolicyEngineEnabled(boolean policyEngineEnabled) {
        this.policyEngineEnabled = policyEngineEnabled;
    }

    @XmlElement(name=AppExportS.CALL_GRAPH)
    public ArrayList<ExCallGraph> getCallGraphs() {
        return callGraphs;
    }

    public void setCallGraphs(ArrayList<ExCallGraph> callGraphs) {
        this.callGraphs = callGraphs;
    }
    
    //L1

    @XmlElement(name=AppExportS.ASYNC_ACTIVITY_SUPPORTED)
    public boolean isAsyncActivitySupported() {
        return asyncActivitySupported;
    }

    public void setAsyncActivitySupported(boolean asyncActivitySupported) {
        this.asyncActivitySupported = asyncActivitySupported;
    }

    @XmlElement(name=AppExportS.SLA)
    public ExSla getSla() {
        return sla;
    }

    public void setSla(ExSla sla) {
        this.sla = sla;
    }

    @XmlElement(name=AppExportS.ERROR_CONFIGURATION)
    public ArrayList<ExErrorConfiguration> getErrorConfiguration() {
        return errorConfiguration;
    }

    public void setErrorConfiguration(ArrayList<ExErrorConfiguration> errorConfiguration) {
        this.errorConfiguration = errorConfiguration;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION_CONFIG)
    public ExBusinessTransactionConfig getBusinessTransactionConfig() {
        return businessTransactionConfig;
    }

    public void setBusinessTransactionConfig(ExBusinessTransactionConfig businessTransactionConfig) {
        this.businessTransactionConfig = businessTransactionConfig;
    }

    @XmlElement(name=AppExportS.BACKGROUND_BUSINESS_TRANSACTION_CONFIG)
    public ExBackgroundBusinessTransactionConfig getBackgroundBusinessTransactionConfig() {
        return backgroundBusinessTransactionConfig;
    }

    public void setBackgroundBusinessTransactionConfig(ExBackgroundBusinessTransactionConfig backgroundBusinessTransactionConfig) {
        this.backgroundBusinessTransactionConfig = backgroundBusinessTransactionConfig;
    }

    @XmlElement(name=AppExportS.EUM_CONFIGURATION)
    public ExEumConfiguration getEumConfiguration() {
        return eumConfiguration;
    }

    public void setEumConfiguration(ExEumConfiguration eumConfiguration) {
        this.eumConfiguration = eumConfiguration;
    }

    @XmlElement(name=AppExportS.PROPERTIES)
    public ArrayList<ExProperties> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ExProperties> properties) {
        this.properties = properties;
    }
    
    
    /*
     *     private String applicationInstrumentationLevel;
    private String snapshotEvaluationInternal;
    private int snapshotQuietTimePostSLAFailure;
    private boolean policyEngineEnabled;
    private boolean asyncActivitySupported;
    
    private ArrayList<ExCallGraph> callGraphs=new ArrayList<ExCallGraph>();
    private ExSla sla;
    private ArrayList<ExErrorConfiguration> errorConfiguration=new ArrayList<ExErrorConfiguration>();
    private ExBusinessTransactionConfig businessTransactionConfig;
    private ExBackgroundBusinessTransactionConfig backgroundBusinessTransactionConfig;
    
    private ExEumConfiguration eumConfiguration;
     */
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.CONFIGURATION);
        bud.append(AppExportS.L1_1).append(AppExportS.APPLICATION_INSTRUMENTATION_LEVEL).append(AppExportS.VE).append(applicationInstrumentationLevel);
        bud.append(AppExportS.L1_1).append(AppExportS.SNAPSHOT_EVALUATION_INTERVAL).append(AppExportS.VE).append(snapshotEvaluationInternal);
        bud.append(AppExportS.L1_1).append(AppExportS.SNAPSHOT_QUIET_TIME_POST_SLA_FAILURE).append(AppExportS.VE).append(snapshotQuietTimePostSLAFailure);
        bud.append(AppExportS.L1_1).append(AppExportS.POLICY_ENGINE_ENABLED).append(AppExportS.VE).append(policyEngineEnabled);
        bud.append(AppExportS.L1_1).append(AppExportS.ASYNC_ACTIVITY_SUPPORTED).append(AppExportS.VE).append(asyncActivitySupported);
        
        for(ExCallGraph graph: callGraphs) bud.append(graph.toString());
        bud.append(sla.toString());
        for(ExErrorConfiguration error: errorConfiguration) bud.append(error.toString());
        
        bud.append(businessTransactionConfig);
        bud.append(backgroundBusinessTransactionConfig);
        bud.append(eumConfiguration);
        return bud.toString();
    }
    
}
