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
        bud.append(AppExportS.L2).append(AppExportS.SNAPSHOT_COLLECTION_POLICY);
        bud.append(minuteFrequency);
        //bud.append(AppExportS.L2_1).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(nthOccurance.toString());
        bud.append(slaViolation.toString());
        bud.append(AppExportS.L2_1).append(AppExportS.AUTOMATIC_COLLECTION_ENABLED).append(AppExportS.VE).append(automaticCollectionEnabled);
        bud.append(AppExportS.L2_1).append(AppExportS.AUTOMATIC_SLOW_VOLUME_PERCENTAGE_THRESHOLD).append(AppExportS.VE).append(automaticSlowVolumePercentageThrehold);
        bud.append(AppExportS.L2_1).append(AppExportS.AUTOMATIC_ERROR_VOLUME_PERCENTAGE_THRESHOLD).append(AppExportS.VE).append(automaticErrorVolumePercentageThreshold);
        
        return bud.toString();
    }
    
    public String whatIsDifferent(ExSnapshotCollectionPolicy obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.SNAPSHOT_COLLECTION_POLICY);
        if(minuteFrequency != null) bud.append(minuteFrequency.whatIsDifferent(obj.getMinuteFrequency()));
        if(nthOccurance != null) bud.append(nthOccurance.whatIsDifferent(obj.getNthOccurance()));
        if(slaViolation != null) bud.append(slaViolation.whatIsDifferent(obj.getSlaViolation()));
        
        if(automaticCollectionEnabled != obj.isAutomaticCollectionEnabled()){
            bud.append(AppExportS.L3).append(AppExportS.AUTOMATIC_COLLECTION_ENABLED);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(automaticCollectionEnabled);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAutomaticCollectionEnabled());
            
        }
        
        if(automaticSlowVolumePercentageThrehold != obj.getAutomaticSlowVolumePercentageThrehold()){
            bud.append(AppExportS.L3).append(AppExportS.AUTOMATIC_SLOW_VOLUME_PERCENTAGE_THRESHOLD);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(automaticSlowVolumePercentageThrehold);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getAutomaticSlowVolumePercentageThrehold());
            
        }
        
        if(automaticErrorVolumePercentageThreshold != obj.getAutomaticErrorVolumePercentageThreshold()){
            bud.append(AppExportS.L3).append(AppExportS.AUTOMATIC_ERROR_VOLUME_PERCENTAGE_THRESHOLD);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(automaticErrorVolumePercentageThreshold);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getAutomaticErrorVolumePercentageThreshold());
            
        }
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.minuteFrequency != null ? this.minuteFrequency.hashCode() : 0);
        hash = 23 * hash + (this.enabled ? 1 : 0);
        hash = 23 * hash + (this.nthOccurance != null ? this.nthOccurance.hashCode() : 0);
        hash = 23 * hash + (this.slaViolation != null ? this.slaViolation.hashCode() : 0);
        hash = 23 * hash + (this.automaticCollectionEnabled ? 1 : 0);
        hash = 23 * hash + this.automaticSlowVolumePercentageThrehold;
        hash = 23 * hash + this.automaticErrorVolumePercentageThreshold;
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
        final ExSnapshotCollectionPolicy other = (ExSnapshotCollectionPolicy) obj;
        if (this.minuteFrequency != other.minuteFrequency && (this.minuteFrequency == null || !this.minuteFrequency.equals(other.minuteFrequency))) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.nthOccurance != other.nthOccurance && (this.nthOccurance == null || !this.nthOccurance.equals(other.nthOccurance))) {
            return false;
        }
        if (this.slaViolation != other.slaViolation && (this.slaViolation == null || !this.slaViolation.equals(other.slaViolation))) {
            return false;
        }
        if (this.automaticCollectionEnabled != other.automaticCollectionEnabled) {
            return false;
        }
        if (this.automaticSlowVolumePercentageThrehold != other.automaticSlowVolumePercentageThrehold) {
            return false;
        }
        if (this.automaticErrorVolumePercentageThreshold != other.automaticErrorVolumePercentageThreshold) {
            return false;
        }
        return true;
    }
    
    
}
