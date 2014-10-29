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
    private int level=0;

    
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
        return AppExportS.L2_1;
    }

    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(getIndent()).append(AppExportS.CRITICAL).append(AppExportS.VE).append(value);
        bud.append(getIndent()).append(AppExportS.S4).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);

        return bud.toString();
    }
    
}
