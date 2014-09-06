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
 * 
            <memory-configuration>
                <size-polling-interval>10</size-polling-interval>
                <enable-cache-framework-size-monitoring>true</enable-cache-framework-size-monitoring>
                <enable-memory-monitoring>true</enable-memory-monitoring>
            </memory-configuration>
 */
public class ExMemoryConfiguration {
    private int sizePollingInterval;
    private boolean enableCacheFrameworkSizeMonitoring;
    private boolean enableMemoryMonitoring;
    
    public ExMemoryConfiguration(){}

    @XmlElement(name=AppExportS.SIZE_POLLING_INTERVAL)
    public int getSizePollingInterval() {
        return sizePollingInterval;
    }

    public void setSizePollingInterval(int sizePollingInterval) {
        this.sizePollingInterval = sizePollingInterval;
    }

    @XmlElement(name= AppExportS.ENABLE_CACHE_FRAMEWORK_SIZE_MONITORING)
    public boolean isEnableCacheFrameworkSizeMonitoring() {
        return enableCacheFrameworkSizeMonitoring;
    }

    public void setEnableCacheFrameworkSizeMonitoring(boolean enableCacheFrameworkSizeMonitoring) {
        this.enableCacheFrameworkSizeMonitoring = enableCacheFrameworkSizeMonitoring;
    }

    @XmlElement(name=AppExportS.ENABLE_MEMORY_MONITORING)
    public boolean isEnableMemoryMonitoring() {
        return enableMemoryMonitoring;
    }

    public void setEnableMemoryMonitoring(boolean enableMemoryMonitoring) {
        this.enableMemoryMonitoring = enableMemoryMonitoring;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.MEMORY_CONFIGURATION);
        bud.append(AppExportS.L4).append(AppExportS.SIZE_POLLING_INTERVAL).append(AppExportS.VE).append(sizePollingInterval);
        bud.append(AppExportS.L4).append(AppExportS.ENABLE_CACHE_FRAMEWORK_SIZE_MONITORING).append(AppExportS.VE).append(enableCacheFrameworkSizeMonitoring);
        bud.append(AppExportS.L4).append(AppExportS.ENABLE_MEMORY_MONITORING).append(AppExportS.VE).append(enableMemoryMonitoring);
        
        return bud.toString();
        
    }
}
