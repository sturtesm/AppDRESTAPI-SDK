/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author gilbert.solorzano
 * 
 * <eum-configuration>
            <enabled>false</enabled>
            <external-js-fetch-url/>
            <heart-beat-url/>
            <automatic>false</automatic>
            <frameworks-to-enable-attribute-injection/>
            <manual>false</manual>
            <eum-parser-rules/>
            <eum-injection-rules/>
            <exclude-rules/>
            <include-rules/>
            <eum-cloud-application-key/>
            <eum-beacon-url/>
            <eum-js-url/>
            <eum-target-tiers/>
        </eum-configuration>
 * 
 */
public class ExEumConfiguration {
    private boolean enabled;
    private String externalJsFetchUrl;
    private String heartBeatUrl;
    private boolean automatic;
    private String frameworksToEnable;
    private boolean manual;
    private String eumParserRules;
    private String eumInjectionRules;
    private String excludeRules;
    private String includeRules;
    private String eumCloudApplicationKey;
    private String eumBeaconUrl;
    private String eumTargetTiers;
    
    public ExEumConfiguration(){}
    
    

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.EXTERNAL_JS_FETCH_RUL)
    public String getExternalJsFetchUrl() {
        return externalJsFetchUrl;
    }

    public void setExternalJsFetchUrl(String externalJsFetchUrl) {
        this.externalJsFetchUrl = externalJsFetchUrl;
    }

    @XmlElement(name=AppExportS.HEART_BEAT_URL)
    public String getHeartBeatUrl() {
        return heartBeatUrl;
    }

    public void setHeartBeatUrl(String heartBeatUrl) {
        this.heartBeatUrl = heartBeatUrl;
    }

    @XmlElement(name=AppExportS.AUTOMATIC)
    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @XmlElement(name=AppExportS.FRAMEWORKS_TO_ENABLE_ATTRIBUTE_INJECTION)
    public String getFrameworksToEnable() {
        return frameworksToEnable;
    }

    public void setFrameworksToEnable(String frameworksToEnable) {
        this.frameworksToEnable = frameworksToEnable;
    }

    @XmlElement(name=AppExportS.MANUAL)
    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    @XmlElement(name=AppExportS.EUM_PARSER_RULES)
    public String getEumParserRules() {
        return eumParserRules;
    }

    public void setEumParserRules(String eumParserRules) {
        this.eumParserRules = eumParserRules;
    }

    @XmlElement(name=AppExportS.EUM_INJECTION_RULES)
    public String getEumInjectionRules() {
        return eumInjectionRules;
    }

    public void setEumInjectionRules(String eumInjectionRules) {
        this.eumInjectionRules = eumInjectionRules;
    }

    @XmlElement(name=AppExportS.EXCLUDE_RULES)
    public String getExcludeRules() {
        return excludeRules;
    }

    public void setExcludeRules(String excludeRules) {
        this.excludeRules = excludeRules;
    }

    @XmlElement(name=AppExportS.INCLUDE_RULES)
    public String getIncludeRules() {
        return includeRules;
    }

    public void setIncludeRules(String includeRules) {
        this.includeRules = includeRules;
    }

    @XmlElement(name=AppExportS.EUM_CLOUD_APPLICATION_KEY)
    public String getEumCloudApplicationKey() {
        return eumCloudApplicationKey;
    }

    public void setEumCloudApplicationKey(String eumCloudApplicationKey) {
        this.eumCloudApplicationKey = eumCloudApplicationKey;
    }

    @XmlElement(name=AppExportS.EUM_BEACON_URL)
    public String getEumBeaconUrl() {
        return eumBeaconUrl;
    }

    public void setEumBeaconUrl(String eumBeaconUrl) {
        this.eumBeaconUrl = eumBeaconUrl;
    }

    @XmlElement(name=AppExportS.EUM_TARGET_TIERS)
    public String getEumTargetTiers() {
        return eumTargetTiers;
    }

    public void setEumTargetTiers(String eumTargetTiers) {
        this.eumTargetTiers = eumTargetTiers;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.EUM_CONFIGURATION);
        bud.append(AppExportS.L2).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.L2).append(AppExportS.EXTERNAL_JS_FETCH_RUL).append(AppExportS.VE).append(externalJsFetchUrl);
        bud.append(AppExportS.L2).append(AppExportS.HEART_BEAT_URL).append(AppExportS.VE).append(heartBeatUrl);
        bud.append(AppExportS.L2).append(AppExportS.AUTOMATIC).append(AppExportS.VE).append(automatic);
        bud.append(AppExportS.L2).append(AppExportS.FRAMEWORKS_TO_ENABLE_ATTRIBUTE_INJECTION).append(AppExportS.VE).append(frameworksToEnable);
        bud.append(AppExportS.L2).append(AppExportS.MANUAL).append(AppExportS.VE).append(manual);
        bud.append(AppExportS.L2).append(AppExportS.EUM_PARSER_RULES).append(AppExportS.VE).append(eumParserRules);
        bud.append(AppExportS.L2).append(AppExportS.EUM_INJECTION_RULES).append(AppExportS.VE).append(eumInjectionRules);
        bud.append(AppExportS.L2).append(AppExportS.EXCLUDE_RULES).append(AppExportS.VE).append(excludeRules);
        bud.append(AppExportS.L2).append(AppExportS.INCLUDE_RULES).append(AppExportS.VE).append(includeRules);
        bud.append(AppExportS.L2).append(AppExportS.EUM_CLOUD_APPLICATION_KEY).append(AppExportS.VE).append(eumCloudApplicationKey);
        bud.append(AppExportS.L2).append(AppExportS.EUM_BEACON_URL).append(AppExportS.VE).append(eumBeaconUrl);
        bud.append(AppExportS.L2).append(AppExportS.EUM_TARGET_TIERS).append(AppExportS.VE).append(eumTargetTiers);
        return bud.toString();
    }
    
    public String whatIsDifferent(ExEumConfiguration obj){
        if(this.equals(obj)) return AppExportS._;
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.EUM_CONFIGURATION);
        
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.L2).append(AppExportS.ENABLED);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
        }
        
        if(!externalJsFetchUrl.equals(obj.getExternalJsFetchUrl())){
            bud.append(AppExportS.L2).append(AppExportS.EXTERNAL_JS_FETCH_RUL);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(externalJsFetchUrl);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getExternalJsFetchUrl());
        }
        
        if(!heartBeatUrl.equals(obj.getHeartBeatUrl())){
            bud.append(AppExportS.L2).append(AppExportS.HEART_BEAT_URL);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(heartBeatUrl);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getHeartBeatUrl());
        }
        
        if(automatic != obj.isAutomatic()){
            bud.append(AppExportS.L2).append(AppExportS.AUTOMATIC);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(automatic);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAutomatic());
        }
        
        if(frameworksToEnable.equals(obj.getFrameworksToEnable())){
            bud.append(AppExportS.L2).append(AppExportS.FRAMEWORKS_TO_ENABLE_ATTRIBUTE_INJECTION);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(frameworksToEnable);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getFrameworksToEnable());
        }
        
        if(manual != obj.isManual()){
            bud.append(AppExportS.L2).append(AppExportS.MANUAL);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(manual);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isManual());
        }
        
        if(eumParserRules.equals(obj.getEumParserRules())){
            bud.append(AppExportS.L2).append(AppExportS.EUM_PARSER_RULES);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(eumParserRules);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEumParserRules());
        }
        
        if(eumInjectionRules.equals(obj.getEumInjectionRules())){
            bud.append(AppExportS.L2).append(AppExportS.EUM_INJECTION_RULES);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(eumInjectionRules);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEumInjectionRules());
        }
        
        if(excludeRules.equals(obj.getExcludeRules())){
            bud.append(AppExportS.L2).append(AppExportS.EXCLUDE_RULES);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(eumCloudApplicationKey);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEumCloudApplicationKey());
        }
        
        if(includeRules.equals(obj.getIncludeRules())){
            bud.append(AppExportS.L2).append(AppExportS.INCLUDE_RULES);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(includeRules);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getIncludeRules());
        }
        
        if(eumCloudApplicationKey.equals(obj.getEumCloudApplicationKey())){
            bud.append(AppExportS.L2).append(AppExportS.EUM_CLOUD_APPLICATION_KEY);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(eumCloudApplicationKey);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEumCloudApplicationKey());
        }
        
        if(eumBeaconUrl.equals(obj.getEumBeaconUrl())){
            bud.append(AppExportS.L2).append(AppExportS.EUM_BEACON_URL);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(eumBeaconUrl);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEumBeaconUrl());
        
        }
        
        if(eumTargetTiers.equals(obj.getEumTargetTiers())){ 
            bud.append(AppExportS.L2).append(AppExportS.EUM_TARGET_TIERS);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(eumTargetTiers);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEumTargetTiers());
        }
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.enabled ? 1 : 0);
        hash = 71 * hash + (this.externalJsFetchUrl != null ? this.externalJsFetchUrl.hashCode() : 0);
        hash = 71 * hash + (this.heartBeatUrl != null ? this.heartBeatUrl.hashCode() : 0);
        hash = 71 * hash + (this.automatic ? 1 : 0);
        hash = 71 * hash + (this.frameworksToEnable != null ? this.frameworksToEnable.hashCode() : 0);
        hash = 71 * hash + (this.manual ? 1 : 0);
        hash = 71 * hash + (this.eumParserRules != null ? this.eumParserRules.hashCode() : 0);
        hash = 71 * hash + (this.eumInjectionRules != null ? this.eumInjectionRules.hashCode() : 0);
        hash = 71 * hash + (this.excludeRules != null ? this.excludeRules.hashCode() : 0);
        hash = 71 * hash + (this.includeRules != null ? this.includeRules.hashCode() : 0);
        hash = 71 * hash + (this.eumCloudApplicationKey != null ? this.eumCloudApplicationKey.hashCode() : 0);
        hash = 71 * hash + (this.eumBeaconUrl != null ? this.eumBeaconUrl.hashCode() : 0);
        hash = 71 * hash + (this.eumTargetTiers != null ? this.eumTargetTiers.hashCode() : 0);
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
        final ExEumConfiguration other = (ExEumConfiguration) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if ((this.externalJsFetchUrl == null) ? (other.externalJsFetchUrl != null) : !this.externalJsFetchUrl.equals(other.externalJsFetchUrl)) {
            return false;
        }
        if ((this.heartBeatUrl == null) ? (other.heartBeatUrl != null) : !this.heartBeatUrl.equals(other.heartBeatUrl)) {
            return false;
        }
        if (this.automatic != other.automatic) {
            return false;
        }
        if ((this.frameworksToEnable == null) ? (other.frameworksToEnable != null) : !this.frameworksToEnable.equals(other.frameworksToEnable)) {
            return false;
        }
        if (this.manual != other.manual) {
            return false;
        }
        if ((this.eumParserRules == null) ? (other.eumParserRules != null) : !this.eumParserRules.equals(other.eumParserRules)) {
            return false;
        }
        if ((this.eumInjectionRules == null) ? (other.eumInjectionRules != null) : !this.eumInjectionRules.equals(other.eumInjectionRules)) {
            return false;
        }
        if ((this.excludeRules == null) ? (other.excludeRules != null) : !this.excludeRules.equals(other.excludeRules)) {
            return false;
        }
        if ((this.includeRules == null) ? (other.includeRules != null) : !this.includeRules.equals(other.includeRules)) {
            return false;
        }
        if ((this.eumCloudApplicationKey == null) ? (other.eumCloudApplicationKey != null) : !this.eumCloudApplicationKey.equals(other.eumCloudApplicationKey)) {
            return false;
        }
        if ((this.eumBeaconUrl == null) ? (other.eumBeaconUrl != null) : !this.eumBeaconUrl.equals(other.eumBeaconUrl)) {
            return false;
        }
        if ((this.eumTargetTiers == null) ? (other.eumTargetTiers != null) : !this.eumTargetTiers.equals(other.eumTargetTiers)) {
            return false;
        }
        return true;
    }
    
    
    
}
