/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 */

public class ExMemoryConfiguration {
    private int sizePollingInterval;
    private boolean enableCacheFrameworkSizeMonitoring;
    private boolean enableMemoryMonitoring;
    private int level=5;
    
    public ExMemoryConfiguration(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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
    
    public String whatIsDifferent(ExMemoryConfiguration obj){
        
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.MEMORY_CONFIGURATION);
        level++;
        
        if(sizePollingInterval != obj.getSizePollingInterval()){     
            bud.append(AppExportS.I[level]).append(AppExportS.SIZE_POLLING_INTERVAL);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(sizePollingInterval);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getSizePollingInterval());    
            level--;
        }
        
        if(enableCacheFrameworkSizeMonitoring != obj.isEnableCacheFrameworkSizeMonitoring()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_CACHE_FRAMEWORK_SIZE_MONITORING);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enableCacheFrameworkSizeMonitoring);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnableCacheFrameworkSizeMonitoring());   
            level--;
        }
        
        if(enableMemoryMonitoring != obj.isEnableMemoryMonitoring()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_MEMORY_MONITORING);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enableMemoryMonitoring);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnableMemoryMonitoring());   
            level--;
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.MEMORY_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.SIZE_POLLING_INTERVAL).append(AppExportS.VE).append(sizePollingInterval);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_CACHE_FRAMEWORK_SIZE_MONITORING).append(AppExportS.VE).append(enableCacheFrameworkSizeMonitoring);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_MEMORY_MONITORING).append(AppExportS.VE).append(enableMemoryMonitoring);
        level--;
        return bud.toString();
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.sizePollingInterval;
        hash = 23 * hash + (this.enableCacheFrameworkSizeMonitoring ? 1 : 0);
        hash = 23 * hash + (this.enableMemoryMonitoring ? 1 : 0);
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
        final ExMemoryConfiguration other = (ExMemoryConfiguration) obj;
        if (this.sizePollingInterval != other.sizePollingInterval) {
            return false;
        }
        if (this.enableCacheFrameworkSizeMonitoring != other.enableCacheFrameworkSizeMonitoring) {
            return false;
        }
        if (this.enableMemoryMonitoring != other.enableMemoryMonitoring) {
            return false;
        }
        return true;
    }
    
    
}

/*
            <memory-configuration>
                <size-polling-interval>10</size-polling-interval>
                <enable-cache-framework-size-monitoring>true</enable-cache-framework-size-monitoring>
                <enable-memory-monitoring>true</enable-memory-monitoring>
            </memory-configuration>
 */