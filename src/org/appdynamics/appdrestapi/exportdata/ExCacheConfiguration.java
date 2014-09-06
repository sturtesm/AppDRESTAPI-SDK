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
 * <cache-configuration>
                <disable-cache-monitoring>false</disable-cache-monitoring>
                <disable-standard-cache-frameworks>false</disable-standard-cache-frameworks>
            </cache-configuration>
            * 
 */
public class ExCacheConfiguration {
    private boolean disableCacheMonitoring;
    private boolean disableStandardCacheFrameworks;
    
    
    public ExCacheConfiguration(){}

    @XmlElement(name=AppExportS.DISABLE_CACHE_MONITORING)
    public boolean isDisableCacheMonitoring() {
        return disableCacheMonitoring;
    }

    public void setDisableCacheMonitoring(boolean disableCacheMonitoring) {
        this.disableCacheMonitoring = disableCacheMonitoring;
    }

    @XmlElement(name=AppExportS.DISABLE_STANDARD_CACHE_FRAMEWORKS)
    public boolean isDisableStandardCacheFrameworks() {
        return disableStandardCacheFrameworks;
    }

    public void setDisableStandardCacheFrameworks(boolean disableStandardCacheFrameworks) {
        this.disableStandardCacheFrameworks = disableStandardCacheFrameworks;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.CACHE_CONFIGURATION);
        bud.append(AppExportS.L4).append(AppExportS.DISABLE_CACHE_MONITORING).append(AppExportS.VE).append(disableCacheMonitoring);
        bud.append(AppExportS.L4).append(AppExportS.DISABLE_STANDARD_CACHE_FRAMEWORKS).append(AppExportS.VE).append(disableStandardCacheFrameworks);
        
        return bud.toString();
    }
}
