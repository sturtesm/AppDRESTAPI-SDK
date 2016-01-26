/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */
/*
 * <eum-cloud-config>
        <exclude-config/>
        <page-config page-config-version="1.0.0">{"defaultPageNamingEnabled":true,"defaultPageNamingConfig":{"type":"FIRST_N_SEGMENTS","firstNSegments":2,"lastNSegments":0,"showProtocol":false,"showDomainName":false},"errorConfig":{"javaScriptErrorCaptureEnabled":true,"ajaxRequestErrorCaptureEnabled":true},"thresholdConfig":{"slowThreshold":{"type":"STANDARD_DEVIATION","value":3},"verySlowThreshold":{"type":"STANDARD_DEVIATION","value":4},"stallThreshold":{"type":"STATIC_MS","value":45000}},"browserEventPolicyConfig":{"slowEnabled":true,"errorEnabled":true,"periodicEnabled":true,"periodicIntervalSeconds":60}}</page-config>
    </eum-cloud-config>
 */
@XmlSeeAlso({ExExcludeConfig.class,ExPageConfig.class})
public class ExEumCloudConfig {
    private ExExcludeConfig excludeConfig;
    private ExPageConfig pageConfig;
    private int level=3;
    
    public ExEumCloudConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
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

    public String whatIsDifferent(ExEumCloudConfig obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
          bud.append(AppExportS.I[level]).append(AppExportS.EUM_CLOUD_CONFIG);
          level++;
          if(excludeConfig != null)excludeConfig.setLevel(level);
          if(pageConfig != null) pageConfig.setLevel(level);
          
          bud.append(excludeConfig.whatIsDifferent(obj.getExcludeConfig()));
          bud.append(pageConfig.whatIsDifferent(obj.getPageConfig()));
          level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.EUM_CLOUD_CONFIG);
        level++;
          if(excludeConfig != null)excludeConfig.setLevel(level);
          if(pageConfig != null) pageConfig.setLevel(level);
        bud.append(excludeConfig);
        bud.append(pageConfig);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.excludeConfig != null ? this.excludeConfig.hashCode() : 0);
        hash = 19 * hash + (this.pageConfig != null ? this.pageConfig.hashCode() : 0);
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
        final ExEumCloudConfig other = (ExEumCloudConfig) obj;
        if (this.excludeConfig != other.excludeConfig && (this.excludeConfig == null || !this.excludeConfig.equals(other.excludeConfig))) {
            return false;
        }
        if (this.pageConfig != other.pageConfig && (this.pageConfig == null || !this.pageConfig.equals(other.pageConfig))) {
            return false;
        }
        return true;
    }
    
    
    
}
