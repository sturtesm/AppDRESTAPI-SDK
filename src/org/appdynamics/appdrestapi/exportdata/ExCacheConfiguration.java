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
 */
/*
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
    
    public String whatIsDifferent(ExCacheConfiguration obj){
        
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.CACHE_CONFIGURATION);

        
        if(disableCacheMonitoring != obj.isDisableCacheMonitoring()){     
            bud.append(AppExportS.L2_1).append(AppExportS.ENABLE_CACHE_FRAMEWORK_SIZE_MONITORING);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(disableCacheMonitoring);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isDisableCacheMonitoring());    
        }
        
        if(disableStandardCacheFrameworks != obj.isDisableStandardCacheFrameworks()){     
            bud.append(AppExportS.L2_1).append(AppExportS.ENABLE_MEMORY_MONITORING);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(disableStandardCacheFrameworks);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isDisableStandardCacheFrameworks());    
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.CACHE_CONFIGURATION);
        bud.append(AppExportS.L4).append(AppExportS.DISABLE_CACHE_MONITORING).append(AppExportS.VE).append(disableCacheMonitoring);
        bud.append(AppExportS.L4).append(AppExportS.DISABLE_STANDARD_CACHE_FRAMEWORKS).append(AppExportS.VE).append(disableStandardCacheFrameworks);
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.disableCacheMonitoring ? 1 : 0);
        hash = 19 * hash + (this.disableStandardCacheFrameworks ? 1 : 0);
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
        final ExCacheConfiguration other = (ExCacheConfiguration) obj;
        if (this.disableCacheMonitoring != other.disableCacheMonitoring) {
            return false;
        }
        if (this.disableStandardCacheFrameworks != other.disableStandardCacheFrameworks) {
            return false;
        }
        return true;
    }
    
    
}
