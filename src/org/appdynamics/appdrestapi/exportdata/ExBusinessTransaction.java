/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 *
 */


@XmlSeeAlso({ExSla.class,ExNamingConfig.class,ExBusinessTransactionConfig.class})
public class ExBusinessTransaction {
    private String name;
    private String businessTransactionName;
    private String applicationComponent;
    private boolean background;
    private ExSla sla;
    private ExNamingConfig namingConfig;
    private ExBusinessTransactionConfig businessTransactionConfig;
    private ArrayList<String> dataGathererConfig=new ArrayList<String>();
    private boolean enabledForEum;
    private String eumAutoEnablePossible;
    private int level=5;
    
    public ExBusinessTransaction(){}

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
    
    /*
    private boolean enabledForEum;
    private String eumAutoEnablePossible;
    */
    public String whatIsDifferent(ExBusinessTransaction obj){
        if(this.equals(obj) || !this.name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!businessTransactionName.equals(obj.getBusinessTransactionName())){
            bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION_NAME);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(businessTransactionName);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getBusinessTransactionName());  
            level--;
        }
        
        if(!applicationComponent.equals(obj.getApplicationComponent())){
            bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(applicationComponent);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getApplicationComponent());  
            level--;
        }
        
        if(background != obj.isBackground()){
            bud.append(AppExportS.I[level]).append(AppExportS.BACKGROUND);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(background);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isBackground());  
            level--;
        }
        
        if(sla != null){ sla.setLevel(level);bud.append(sla.whatIsDifferent(obj.getSla()));}
        if(namingConfig != null){namingConfig.setLevel(level); bud.append(namingConfig.whatIsDifferent(obj.getNamingConfig()));}
        if(businessTransactionConfig != null){businessTransactionConfig.setLevel(level); bud.append(businessTransactionConfig.whatIsDifferent(obj.getBusinessTransactionConfig()));}
        
        
        for(String value:dataGathererConfig){
            boolean fnd=false;
            for(String _value:obj.getDataGathererConfig()){
                if(value.equals(_value)) fnd=true;
            }
            
            if(!fnd) bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
        }
        
        for(String value:obj.getDataGathererConfig()){
            boolean fnd=false;
            for(String _value:dataGathererConfig){
                if(value.equals(_value)) fnd=true;
            }
            
            if(!fnd){ bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);}
        }
        
        if(enabledForEum != obj.isEnabledForEum()){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED_FOR_EUM);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabledForEum);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabledForEum());  
            level--;
        }
        
        if(!eumAutoEnablePossible.equals(obj.eumAutoEnablePossible)){
            bud.append(AppExportS.I[level]).append(AppExportS.EUM_AUTO_ENABLE_POSSIBLE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(eumAutoEnablePossible);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEumAutoEnablePossible()); 
            level--;
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION_NAME).append(AppExportS.VE).append(businessTransactionName);
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENTS).append(AppExportS.VE).append(applicationComponent);
        bud.append(AppExportS.I[level]).append(AppExportS.BACKGROUND).append(AppExportS.VE).append(background);
        if(sla != null) sla.setLevel(level);
        bud.append(sla);
        if(namingConfig != null) namingConfig.setLevel(level);
        bud.append(namingConfig);
        if(businessTransactionConfig != null) businessTransactionConfig.setLevel(level);
        bud.append(businessTransactionConfig);
        level++;
        for(String data: dataGathererConfig){bud.append(AppExportS.I[level]).append(AppExportS.DATA_GATHERER_CONFIG).append(AppExportS.VE).append(data);}
        level--;
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED_FOR_EUM).append(AppExportS.VE).append(enabledForEum);
        bud.append(AppExportS.I[level]).append(AppExportS.EUM_AUTO_ENABLE_POSSIBLE).append(AppExportS.VE).append(eumAutoEnablePossible);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 31 * hash + (this.businessTransactionName != null ? this.businessTransactionName.hashCode() : 0);
        hash = 31 * hash + (this.applicationComponent != null ? this.applicationComponent.hashCode() : 0);
        hash = 31 * hash + (this.background ? 1 : 0);
        hash = 31 * hash + (this.sla != null ? this.sla.hashCode() : 0);
        hash = 31 * hash + (this.namingConfig != null ? this.namingConfig.hashCode() : 0);
        hash = 31 * hash + (this.businessTransactionConfig != null ? this.businessTransactionConfig.hashCode() : 0);
        hash = 31 * hash + (this.dataGathererConfig != null ? this.dataGathererConfig.hashCode() : 0);
        hash = 31 * hash + (this.enabledForEum ? 1 : 0);
        hash = 31 * hash + (this.eumAutoEnablePossible != null ? this.eumAutoEnablePossible.hashCode() : 0);
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
        final ExBusinessTransaction other = (ExBusinessTransaction) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.businessTransactionName == null) ? (other.businessTransactionName != null) : !this.businessTransactionName.equals(other.businessTransactionName)) {
            return false;
        }
        if ((this.applicationComponent == null) ? (other.applicationComponent != null) : !this.applicationComponent.equals(other.applicationComponent)) {
            return false;
        }
        if (this.background != other.background) {
            return false;
        }
        if (this.sla != other.sla && (this.sla == null || !this.sla.equals(other.sla))) {
            return false;
        }
        if (this.namingConfig != other.namingConfig && (this.namingConfig == null || !this.namingConfig.equals(other.namingConfig))) {
            return false;
        }
        if (this.businessTransactionConfig != other.businessTransactionConfig && (this.businessTransactionConfig == null || !this.businessTransactionConfig.equals(other.businessTransactionConfig))) {
            return false;
        }
        
        if(dataGathererConfig.size() != other.getDataGathererConfig().size()) return false;
        
        for(String value:dataGathererConfig){
            boolean fnd=false;
            for(String _value:other.getDataGathererConfig()){
                if(value.equals(_value)) fnd=true;
            }
            
            if(!fnd) return false;
        }
        
        if (this.enabledForEum != other.enabledForEum) {
            return false;
        }
        if ((this.eumAutoEnablePossible == null) ? (other.eumAutoEnablePossible != null) : !this.eumAutoEnablePossible.equals(other.eumAutoEnablePossible)) {
            return false;
        }
        return true;
    }
    
    
    
}


/*
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