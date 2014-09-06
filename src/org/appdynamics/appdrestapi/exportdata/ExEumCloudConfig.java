/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * <eum-cloud-config>
        <exclude-config/>
        <page-config page-config-version="1.0.0">{"defaultPageNamingEnabled":true,"defaultPageNamingConfig":{"type":"FIRST_N_SEGMENTS","firstNSegments":2,"lastNSegments":0,"showProtocol":false,"showDomainName":false},"errorConfig":{"javaScriptErrorCaptureEnabled":true,"ajaxRequestErrorCaptureEnabled":true},"thresholdConfig":{"slowThreshold":{"type":"STANDARD_DEVIATION","value":3},"verySlowThreshold":{"type":"STANDARD_DEVIATION","value":4},"stallThreshold":{"type":"STATIC_MS","value":45000}},"browserEventPolicyConfig":{"slowEnabled":true,"errorEnabled":true,"periodicEnabled":true,"periodicIntervalSeconds":60}}</page-config>
    </eum-cloud-config>
 */
@XmlSeeAlso({ExExcludeConfig.class,ExPageConfig.class})
public class ExEumCloudConfig {
    private ExExcludeConfig excludeConfig;
    private ExPageConfig pageConfig;
    
    public ExEumCloudConfig(){}
    
    @XmlElement(name=AppExportS.PAGE_CONFIG)
    public ExPageConfig getPageConfig() {
        return pageConfig;
    }

    public void setPageConfig(ExPageConfig pageConfig) {
        this.pageConfig = pageConfig;
    }

    @XmlElement(name=AppExportS.EXCLUDE_CONFIG)
    public ExExcludeConfig getExcludeConfig() {
        return excludeConfig;
    }

    public void setExcludeConfig(ExExcludeConfig excludeConfig) {
        this.excludeConfig = excludeConfig;
    }

    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.EUM_CLOUD_CONFIG);
        bud.append(excludeConfig.toString());
        bud.append(pageConfig.toString());
        return bud.toString();
    }
    
}
