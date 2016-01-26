/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */
public class ExWarning {
    private long value;
    private boolean enabled=false;
    private int level=5;

    
    public ExWarning(){}

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

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.WARNING);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.VALUE).append(AppExportS.VE).append(AppExportS.VE).append(value);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExWarning obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.WARNING);
        level++;
        if(value != obj.getValue()){
            bud.append(AppExportS.I[level]).append(AppExportS.VALUE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());
            level++;
        }
        
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
            level--;
        }
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.value ^ (this.value >>> 32));
        hash = 97 * hash + (this.enabled ? 1 : 0);
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
        final ExWarning other = (ExWarning) obj;
        if (this.value != other.value) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        return true;
    }
    
    
}
