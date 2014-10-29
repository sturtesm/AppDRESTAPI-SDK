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
 * 
                <business-transaction excluded="false" transaction-entry-point-type="SERVLET">
                    <name>/examples/jsp</name>
                    <business-transaction-name>/examples/jsp</business-transaction-name>
                    <application-component>ApidLocker</application-component>
                    <background>false</background>
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
                    <naming-config scheme="uri">
                        <name-values>
                            <name-value>
                                <name>segment-length</name>
                                <value>2</value>
                            </name-value>
                            <name-value>
                                <name>uri-length</name>
                                <value>first-n-segments</value>
                            </name-value>
                        </name-values>
                    </naming-config>
                    <business-transaction-config>
                        <snapshot-collection-policy>
                            <minute-frequency enabled="true">10</minute-frequency>
                            <nth-occurance enabled="false">100</nth-occurance>
                            <sla-violation collect-outliers-only="true"
                                duration="5" enabled="true"
                                max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
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
                    <data-gatherer-config>Default HTTP Request Data Collector</data-gatherer-config>
                    <data-gatherer-config>Default SQL Data Collector</data-gatherer-config>
                    <enabled-for-eum>false</enabled-for-eum>
                    <eum-auto-enable-possible>NOT_DISCOVERED</eum-auto-enable-possible>
                </business-transaction>
 * 
 */

@XmlSeeAlso({ExSla.class,ExNamingConfig.class,ExNameValues.class,ExNameValue.class,ExBusinessTransactionConfig.class})
public class ExBusinessTransaction {
    private String name;
    private String businessTransactionName;
    private String applicationComponent;
    private boolean background;
    private ExSla sla;
    private ExNamingConfig namingConfig;
    private ExBusinessTransactionConfig businessTransactionConfig;
    private ArrayList<String> dataGathererConfig=new ArrayList<String>();
    //private String dataGathererConfig;
    private boolean enabledForEum;
    private String eumAutoEnablePossible;
    
    public ExBusinessTransaction(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION_NAME)
    public String getBusinessTransactionName() {
        return businessTransactionName;
    }

    public void setBusinessTransactionName(String businessTransactionName) {
        this.businessTransactionName = businessTransactionName;
    }

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public String getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(String applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    @XmlElement(name=AppExportS.BACKGROUND)
    public boolean isBackground() {
        return background;
    }

    public void setBackground(boolean background) {
        this.background = background;
    }

    @XmlElement(name=AppExportS.SLA)
    public ExSla getSla() {
        return sla;
    }

    public void setSla(ExSla sla) {
        this.sla = sla;
    }

    @XmlElement(name=AppExportS.NAMING_CONFIG)
    public ExNamingConfig getNamingConfig() {
        return namingConfig;
    }

    public void setNamingConfig(ExNamingConfig namingConfig) {
        this.namingConfig = namingConfig;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION_CONFIG)
    public ExBusinessTransactionConfig getBusinessTransactionConfig() {
        return businessTransactionConfig;
    }

    public void setBusinessTransactionConfig(ExBusinessTransactionConfig businessTransactionConfig) {
        this.businessTransactionConfig = businessTransactionConfig;
    }

    @XmlElement(name=AppExportS.DATA_GATHERER_CONFIG)
    public ArrayList<String> getDataGathererConfig() {
        return dataGathererConfig;
    }

    public void setDataGathererConfig(ArrayList<String> dataGathererConfig) {
        this.dataGathererConfig = dataGathererConfig;
    }

    @XmlElement(name=AppExportS.ENABLED_FOR_EUM)
    public boolean isEnabledForEum() {
        return enabledForEum;
    }

    public void setEnabledForEum(boolean enabledForEum) {
        this.enabledForEum = enabledForEum;
    }

    @XmlElement(name=AppExportS.EUM_AUTO_ENABLE_POSSIBLE)
    public String getEumAutoEnablePossible() {
        return eumAutoEnablePossible;
    }

    public void setEumAutoEnablePossible(String eumAutoEnablePossible) {
        this.eumAutoEnablePossible = eumAutoEnablePossible;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.BUSINESS_TRANSACTION);
        bud.append(AppExportS.L2_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2_1).append(AppExportS.BUSINESS_TRANSACTION_NAME).append(AppExportS.VE).append(businessTransactionName);
        bud.append(AppExportS.L2_1).append(AppExportS.APPLICATION_COMPONENTS).append(AppExportS.VE).append(applicationComponent);
        bud.append(AppExportS.L2_1).append(AppExportS.BACKGROUND).append(AppExportS.VE).append(background);
        sla.setLevel(1);
        bud.append(sla.toString());
        bud.append(namingConfig.toString());
        bud.append(businessTransactionConfig.toString());
        for(String data: dataGathererConfig) bud.append(data);
        bud.append(AppExportS.L2_1).append(AppExportS.ENABLED_FOR_EUM).append(AppExportS.VE).append(enabledForEum);
        bud.append(AppExportS.L2_1).append(AppExportS.EUM_AUTO_ENABLE_POSSIBLE).append(AppExportS.VE).append(eumAutoEnablePossible);
        return bud.toString();
    }
    
}
