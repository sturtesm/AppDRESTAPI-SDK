/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 */
public class ExCritical {
    private long value;
    private boolean enabled;
    private int level=5;

    
    public ExCritical(){}

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

    @XmlTransient
    public String getIndent(){
        if(level == 1) return AppExportS.L3;
        if(level == 2) return AppExportS.L3_1;
        
        if(level == 3) return AppExportS.L3_1;
        return AppExportS.L2_1;
    }

    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.CRITICAL);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExCritical obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.CRITICAL);
        level++;
        if(value != obj.getValue()){      
            bud.append(AppExportS.I[level]).append(AppExportS.VALUE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());
            level--;
        }
        
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
            level++;
        }
        level--;
        return bud.toString();
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.value ^ (this.value >>> 32));
        hash = 59 * hash + (this.enabled ? 1 : 0);
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
        final ExCritical other = (ExCritical) obj;
        if (this.value != other.value) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        return true;
    }
    
    
    
}
