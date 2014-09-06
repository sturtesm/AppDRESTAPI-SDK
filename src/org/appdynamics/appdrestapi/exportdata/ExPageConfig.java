/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 * 
 * <page-config page-config-version="1.0.0">{"defaultPageNamingEnabled":true,"defaultPageNamingConfig":{"type":"FIRST_N_SEGMENTS","firstNSegments":2,"lastNSegments":0,"showProtocol":false,"showDomainName":false},"errorConfig":{"javaScriptErrorCaptureEnabled":true,"ajaxRequestErrorCaptureEnabled":true},"thresholdConfig":{"slowThreshold":{"type":"STANDARD_DEVIATION","value":3},"verySlowThreshold":{"type":"STANDARD_DEVIATION","value":4},"stallThreshold":{"type":"STATIC_MS","value":45000}},"browserEventPolicyConfig":{"slowEnabled":true,"errorEnabled":true,"periodicEnabled":true,"periodicIntervalSeconds":60}}</page-config>
 * 
 */
public class ExPageConfig {
    private String pageConfig;
    private String pageConfigVersion;
    
    public ExPageConfig(){}
    
    @XmlElement(name=AppExportS.PAGE_CONFIG)
    public String getPageConfig() {
        return pageConfig;
    }

    public void setPageConfig(String pageConfig) {
        this.pageConfig = pageConfig;
    }

    @XmlAttribute(name=AppExportS.PAGE_CONFIG_VERSION)
    public String getPageConfigVersion() {
        return pageConfigVersion;
    }

    public void setPageConfigVersion(String pageConfigVersion) {
        this.pageConfigVersion = pageConfigVersion;
    }
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.PAGE_CONFIG).append(AppExportS.VE).append(pageConfig);
        bud.append(AppExportS.L2).append(AppExportS.PAGE_CONFIG_VERSION).append(AppExportS.VE).append(pageConfigVersion);
        return bud.toString();
    }
}
