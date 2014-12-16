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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.pageConfig != null ? this.pageConfig.hashCode() : 0);
        hash = 37 * hash + (this.pageConfigVersion != null ? this.pageConfigVersion.hashCode() : 0);
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
        final ExPageConfig other = (ExPageConfig) obj;
        if ((this.pageConfig == null) ? (other.pageConfig != null) : !this.pageConfig.equals(other.pageConfig)) {
            return false;
        }
        if ((this.pageConfigVersion == null) ? (other.pageConfigVersion != null) : !this.pageConfigVersion.equals(other.pageConfigVersion)) {
            return false;
        }
        return true;
    }
    
    
}
