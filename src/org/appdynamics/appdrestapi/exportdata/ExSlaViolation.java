/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 */
/*
 * <sla-violation collect-outliers-only="true" duration="5"
                    enabled="true" max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
 */
public class ExSlaViolation {
    private boolean collectOutliersOnly;
    private int duration;
    private boolean enabled;
    private int maxAttemptsForOutliers;
    private boolean warningViolation;
    private int value;
    private int level=5;
    
    public ExSlaViolation(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    

    @XmlAttribute(name=AppExportS.COLLECT_OUTLIERS_ONLY)
    public boolean isCollectOutliersOnly() {
        return collectOutliersOnly;
    }

    public void setCollectOutliersOnly(boolean collectOutliersOnly) {
        this.collectOutliersOnly = collectOutliersOnly;
    }

    @XmlAttribute(name=AppExportS.DURATION)
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @XmlAttribute(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlAttribute(name=AppExportS.MAX_ATTEMPTS_FOR_OUTLIERS)
    public int getMaxAttemptsForOutliers() {
        return maxAttemptsForOutliers;
    }

    public void setMaxAttemptsForOutliers(int maxAttemptsForOutliers) {
        this.maxAttemptsForOutliers = maxAttemptsForOutliers;
    }

    @XmlAttribute(name=AppExportS.WARNING_VIOLATION)
    public boolean isWarningViolation() {
        return warningViolation;
    }

    public void setWarningViolation(boolean warningViolation) {
        this.warningViolation = warningViolation;
    }

    @XmlValue
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.SLA_VIOLATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        bud.append(AppExportS.I[level]).append(AppExportS.COLLECT_OUTLIERS_ONLY).append(AppExportS.VE).append(collectOutliersOnly);
        bud.append(AppExportS.I[level]).append(AppExportS.DURATION).append(AppExportS.VE).append(duration);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.I[level]).append(AppExportS.MAX_ATTEMPTS_FOR_OUTLIERS).append(AppExportS.VE).append(maxAttemptsForOutliers);
        bud.append(AppExportS.I[level]).append(AppExportS.WARNING_VIOLATION).append(AppExportS.VE).append(warningViolation);
        level--;
        return bud.toString();
    }

    public String whatIsDifferent(ExSlaViolation obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.SLA_VIOLATION);
        level++;
        if(value != obj.getValue()){
            bud.append(AppExportS.I[level]).append(AppExportS.VALUE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());
            level--;
        }
        
        if(collectOutliersOnly != obj.isCollectOutliersOnly()){
            bud.append(AppExportS.I[level]).append(AppExportS.COLLECT_OUTLIERS_ONLY);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(collectOutliersOnly);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isCollectOutliersOnly());
            level--;
        }
        
        if(duration != obj.getDuration()){
            bud.append(AppExportS.I[level]).append(AppExportS.DURATION);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(duration);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDuration());
            level--;
        }
        
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
            level--;
        }
        
        if(maxAttemptsForOutliers != obj.getMaxAttemptsForOutliers()){
            bud.append(AppExportS.I[level]).append(AppExportS.MAX_ATTEMPTS_FOR_OUTLIERS);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(maxAttemptsForOutliers);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMaxAttemptsForOutliers());
            level--;
        }
        
        if(warningViolation != obj.isWarningViolation()){
            bud.append(AppExportS.I[level]).append(AppExportS.WARNING_VIOLATION);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(warningViolation);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isWarningViolation());
            level--;
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.collectOutliersOnly ? 1 : 0);
        hash = 53 * hash + this.duration;
        hash = 53 * hash + (this.enabled ? 1 : 0);
        hash = 53 * hash + this.maxAttemptsForOutliers;
        hash = 53 * hash + (this.warningViolation ? 1 : 0);
        hash = 53 * hash + this.value;
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
        final ExSlaViolation other = (ExSlaViolation) obj;
        if (this.collectOutliersOnly != other.collectOutliersOnly) {
            return false;
        }
        if (this.duration != other.duration) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.maxAttemptsForOutliers != other.maxAttemptsForOutliers) {
            return false;
        }
        if (this.warningViolation != other.warningViolation) {
            return false;
        }
        if (this.value != other.value) {
            return false;
        }
        return true;
    }
    
    
}
