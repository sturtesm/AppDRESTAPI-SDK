/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 * 
 * <minute-frequency enabled="true">10</minute-frequency>
 */
public class ExMinuteFrequency {
    private long value;
    private boolean enabled;
    
    public ExMinuteFrequency(){}

    @XmlValue
    public long getValue() {
        return value;
    }

    
    public void setValue(long value) {
        this.value = value;
    }

    @XmlAttribute(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.MINUTE_FREQUENCY).append(AppExportS.VE).append(value);
        bud.append(AppExportS.L3).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        return bud.toString();
    }
    
    public String whatIsDifferent(ExMinuteFrequency obj){
        if(this.equals(obj)) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.MINUTE_FREQUENCY);
        
        if(value != obj.getValue()){
            bud.append(AppExportS.L3).append(AppExportS.VALUE);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());
        }
        
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.L3).append(AppExportS.ENABLED);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());   
        }
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.value ^ (this.value >>> 32));
        hash = 47 * hash + (this.enabled ? 1 : 0);
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
        final ExMinuteFrequency other = (ExMinuteFrequency) obj;
        if (this.value != other.value) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        return true;
    }
    
    
    
}
