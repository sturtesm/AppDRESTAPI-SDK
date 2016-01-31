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


public class ExStallConfiguration {
    private boolean absolute;
    private int absoluteTimeInSecs;
    private int btSlaViolationMultiplier;
    private int level=5;
    
    public ExStallConfiguration(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
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
        bud.append(AppExportS.I[level]).append(AppExportS.STALL_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.ABSOLUTE).append(AppExportS.VE).append(absolute);
        bud.append(AppExportS.I[level]).append(AppExportS.ABSOLUTE_TIME_IN_SECS).append(AppExportS.VE).append(absoluteTimeInSecs);
        bud.append(AppExportS.I[level]).append(AppExportS.BT_SLA_VIOLATION_MULTIPLIER).append(AppExportS.VE).append(btSlaViolationMultiplier);
        level--;
        return bud.toString();
    }

    public String whatIsDifferent(ExStallConfiguration obj){
        if(this.equals(obj)) return AppExportS._U;
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.STALL_CONFIGURATION);
        level++;
        if(absolute != obj.isAbsolute()){
            bud.append(AppExportS.I[level]).append(AppExportS.ABSOLUTE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(absolute);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAbsolute());
            level--;
        }
        
        if(absoluteTimeInSecs != obj.getAbsoluteTimeInSecs()){
            bud.append(AppExportS.I[level]).append(AppExportS.ABSOLUTE_TIME_IN_SECS);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(absoluteTimeInSecs);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getAbsoluteTimeInSecs());
            level--;
        }
        
        if(btSlaViolationMultiplier != obj.getBtSlaViolationMultiplier()){
            bud.append(AppExportS.I[level]).append(AppExportS.BT_SLA_VIOLATION_MULTIPLIER);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(btSlaViolationMultiplier);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getBtSlaViolationMultiplier());
            level--;
        }
        
        level--;
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

 /* <stall-configuration>
                    <absolute>true</absolute>
                    <absolute-time-in-secs>45</absolute-time-in-secs>
                    <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                </stall-configuration>
 * 
 */