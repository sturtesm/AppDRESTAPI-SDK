/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * <snapshot-collection-policy>
                <minute-frequency enabled="true">10</minute-frequency>
                <nth-occurance enabled="false">100</nth-occurance>
                <sla-violation collect-outliers-only="true" duration="5"
                    enabled="true" max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
                <automatic-collection-enabled>true</automatic-collection-enabled>
                <automatic-slow-volume-percentage-threshold>10</automatic-slow-volume-percentage-threshold>
                <automatic-error-volume-percentage-threshold>10</automatic-error-volume-percentage-threshold>
            </snapshot-collection-policy>
 * 
 */
@XmlSeeAlso({ExSlaViolation.class,ExMinuteFrequency.class,ExNthOccurance.class})
public class ExSnapshotCollectionPolicy {
    private ExMinuteFrequency minuteFrequency;
    private boolean enabled;
    private ExNthOccurance nthOccurance;
    private ExSlaViolation slaViolation; // This is a new object:
    private boolean automaticCollectionEnabled;
    private int automaticSlowVolumePercentageThrehold;
    private int automaticErrorVolumePercentageThreshold;
    
    public ExSnapshotCollectionPolicy(){}

    @XmlElement(name=AppExportS.MINUTE_FREQUENCY)
    public ExMinuteFrequency getMinuteFrequency() {
        return minuteFrequency;
    }

    public void setMinuteFrequency(ExMinuteFrequency minuteFrequency) {
        this.minuteFrequency = minuteFrequency;
    }

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.SLA_VIOLATION)
    public ExSlaViolation getSlaViolation() {
        return slaViolation;
    }

    @XmlElement(name=AppExportS.NTH_OCCURANCE)
    public ExNthOccurance getNthOccurance() {
        return nthOccurance;
    }

    public void setNthOccurance(ExNthOccurance nthOccurance) {
        this.nthOccurance = nthOccurance;
    }

    
    public void setSlaViolation(ExSlaViolation slaViolation) {
        this.slaViolation = slaViolation;
    }

    @XmlElement(name=AppExportS.AUTOMATIC_COLLECTION_ENABLED)
    public boolean isAutomaticCollectionEnabled() {
        return automaticCollectionEnabled;
    }

    public void setAutomaticCollectionEnabled(boolean automaticCollectionEnabled) {
        this.automaticCollectionEnabled = automaticCollectionEnabled;
    }

    @XmlElement(name=AppExportS.AUTOMATIC_SLOW_VOLUME_PERCENTAGE_THRESHOLD)
    public int getAutomaticSlowVolumePercentageThrehold() {
        return automaticSlowVolumePercentageThrehold;
    }

    public void setAutomaticSlowVolumePercentageThrehold(int automaticSlowVolumePercentageThrehold) {
        this.automaticSlowVolumePercentageThrehold = automaticSlowVolumePercentageThrehold;
    }

    @XmlElement(name=AppExportS.AUTOMATIC_ERROR_VOLUME_PERCENTAGE_THRESHOLD)
    public int getAutomaticErrorVolumePercentageThreshold() {
        return automaticErrorVolumePercentageThreshold;
    }

    public void setAutomaticErrorVolumePercentageThreshold(int automaticErrorVolumePercentageThreshold) {
        this.automaticErrorVolumePercentageThreshold = automaticErrorVolumePercentageThreshold;
    }
    
    
    
    //L3 Start
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.SNAPSHOT_COLLECTION_POLICY);
        bud.append(minuteFrequency.toString());
        bud.append(AppExportS.L3).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(nthOccurance.toString());
        bud.append(slaViolation.toString());
        bud.append(AppExportS.L3).append(AppExportS.AUTOMATIC_COLLECTION_ENABLED).append(AppExportS.VE).append(automaticCollectionEnabled);
        bud.append(AppExportS.L3).append(AppExportS.AUTOMATIC_SLOW_VOLUME_PERCENTAGE_THRESHOLD).append(AppExportS.VE).append(automaticSlowVolumePercentageThrehold);
        bud.append(AppExportS.L3).append(AppExportS.AUTOMATIC_ERROR_VOLUME_PERCENTAGE_THRESHOLD).append(AppExportS.VE).append(automaticErrorVolumePercentageThreshold);
        
        return bud.toString();
    }
}
