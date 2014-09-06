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

    @XmlElement(name=AppExportS.EXCLUCE_RULES)
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
        bud.append(AppExportS.L2).append(AppExportS.EUM_CONFIGURATION);
        bud.append(AppExportS.L2_1).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.L2_1).append(AppExportS.EXTERNAL_JS_FETCH_RUL).append(AppExportS.VE).append(externalJsFetchUrl);
        bud.append(AppExportS.L2_1).append(AppExportS.HEART_BEAT_URL).append(AppExportS.VE).append(heartBeatUrl);
        bud.append(AppExportS.L2_1).append(AppExportS.AUTOMATIC).append(AppExportS.VE).append(automatic);
        bud.append(AppExportS.L2_1).append(AppExportS.FRAMEWORKS_TO_ENABLE_ATTRIBUTE_INJECTION).append(AppExportS.VE).append(frameworksToEnable);
        bud.append(AppExportS.L2_1).append(AppExportS.MANUAL).append(AppExportS.VE).append(manual);
        bud.append(AppExportS.L2_1).append(AppExportS.EUM_PARSER_RULES).append(AppExportS.VE).append(eumParserRules);
        bud.append(AppExportS.L2_1).append(AppExportS.EUM_INJECTION_RULES).append(AppExportS.VE).append(eumInjectionRules);
        bud.append(AppExportS.L2_1).append(AppExportS.EXCLUCE_RULES).append(AppExportS.VE).append(excludeRules);
        bud.append(AppExportS.L2_1).append(AppExportS.INCLUDE_RULES).append(AppExportS.VE).append(includeRules);
        bud.append(AppExportS.L2_1).append(AppExportS.EUM_CLOUD_APPLICATION_KEY).append(AppExportS.VE).append(eumCloudApplicationKey);
        bud.append(AppExportS.L2_1).append(AppExportS.EUM_BEACON_URL).append(AppExportS.VE).append(eumBeaconUrl);
        bud.append(AppExportS.L2_1).append(AppExportS.EUM_TARGET_TIERS).append(AppExportS.VE).append(eumTargetTiers);
        return bud.toString();
    }
    
}
