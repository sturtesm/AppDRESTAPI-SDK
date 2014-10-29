/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 * 
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
    
    public ExSlaViolation(){}

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
        bud.append(AppExportS.L2_1).append(AppExportS.SLA_VIOLATION).append(AppExportS.VE).append(value);
        bud.append(AppExportS.L3).append(AppExportS.COLLECT_OUTLIERS_ONLY).append(AppExportS.VE).append(collectOutliersOnly);
        bud.append(AppExportS.L3).append(AppExportS.DURATION).append(AppExportS.VE).append(duration);
        bud.append(AppExportS.L3).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.L3).append(AppExportS.MAX_ATTEMPTS_FOR_OUTLIERS).append(AppExportS.VE).append(maxAttemptsForOutliers);
        bud.append(AppExportS.L3).append(AppExportS.WARNING_VIOLATION).append(AppExportS.VE).append(warningViolation);
        return bud.toString();
    }
}
