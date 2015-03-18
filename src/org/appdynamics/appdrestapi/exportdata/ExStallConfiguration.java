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
 * <stall-configuration>
                    <absolute>true</absolute>
                    <absolute-time-in-secs>45</absolute-time-in-secs>
                    <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                </stall-configuration>
 * 
 */
public class ExStallConfiguration {
    private boolean absolute;
    private int absoluteTimeInSecs;
    private int btSlaViolationMultiplier;
    
    public ExStallConfiguration(){}

    @XmlElement(name=AppExportS.ABSOLUTE)
    public boolean isAbsolute() {
        return absolute;
    }

    public void setAbsolute(boolean absolute) {
        this.absolute = absolute;
    }

    @XmlElement(name=AppExportS.ABSOLUTE_TIME_IN_SECS)
    public int getAbsoluteTimeInSecs() {
        return absoluteTimeInSecs;
    }

    public void setAbsoluteTimeInSecs(int absoluteTimeInSecs) {
        this.absoluteTimeInSecs = absoluteTimeInSecs;
    }

    @XmlElement(name=AppExportS.BT_SLA_VIOLATION_MULTIPLIER)
    public int getBtSlaViolationMultiplier() {
        return btSlaViolationMultiplier;
    }

    public void setBtSlaViolationMultiplier(int btSlaViolationMultiplier) {
        this.btSlaViolationMultiplier = btSlaViolationMultiplier;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.STALL_CONFIGURATION);
        bud.append(AppExportS.L3).append(AppExportS.ABSOLUTE).append(AppExportS.VE).append(absolute);
        bud.append(AppExportS.L3).append(AppExportS.ABSOLUTE_TIME_IN_SECS).append(AppExportS.VE).append(absoluteTimeInSecs);
        bud.append(AppExportS.L3).append(AppExportS.BT_SLA_VIOLATION_MULTIPLIER).append(AppExportS.VE).append(btSlaViolationMultiplier);
        return bud.toString();
    }

    public String whatIsDifferent(ExStallConfiguration obj){
        if(this.equals(obj)) return AppExportS._U;
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.STALL_CONFIGURATION);
        
        if(absolute != obj.isAbsolute()){
            bud.append(AppExportS.L3).append(AppExportS.ABSOLUTE);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(absolute);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAbsolute());
            
        }
        
        if(absoluteTimeInSecs != obj.getAbsoluteTimeInSecs()){
            bud.append(AppExportS.L3).append(AppExportS.ABSOLUTE_TIME_IN_SECS);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(absoluteTimeInSecs);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getAbsoluteTimeInSecs());
            
        }
        
        if(btSlaViolationMultiplier != obj.getBtSlaViolationMultiplier()){
            bud.append(AppExportS.L3).append(AppExportS.BT_SLA_VIOLATION_MULTIPLIER);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(btSlaViolationMultiplier);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getBtSlaViolationMultiplier());
            
        }
        
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.absolute ? 1 : 0);
        hash = 29 * hash + this.absoluteTimeInSecs;
        hash = 29 * hash + this.btSlaViolationMultiplier;
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
        final ExStallConfiguration other = (ExStallConfiguration) obj;
        if (this.absolute != other.absolute) {
            return false;
        }
        if (this.absoluteTimeInSecs != other.absoluteTimeInSecs) {
            return false;
        }
        if (this.btSlaViolationMultiplier != other.btSlaViolationMultiplier) {
            return false;
        }
        return true;
    }
    
    
}
