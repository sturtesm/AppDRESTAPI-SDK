/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */

@XmlSeeAlso({ExSnapshotCollectionPolicy.class,ExBtRequestThresholds.class})
public class ExBusinessTransactionConfig {
    private ExSnapshotCollectionPolicy snapshotCollectionPolicy;
    private ExBtRequestThresholds btRequestThreshold;
    private int level=3;
    
    public ExBusinessTransactionConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @XmlElement(name=AppExportS.SNAPSHOT_COLLECTION_POLICY)
    public ExSnapshotCollectionPolicy getSnapshotCollectionPolicy() {
        return snapshotCollectionPolicy;
    }

    public void setSnapshotCollectionPolicy(ExSnapshotCollectionPolicy snapshotCollectionPolicy) {
        this.snapshotCollectionPolicy = snapshotCollectionPolicy;
    }

    @XmlElement(name=AppExportS.BT_REQUEST_THRESHOLDS)
    public ExBtRequestThresholds getBtRequestThreshold() {
        return btRequestThreshold;
    }

    public void setBtRequestThreshold(ExBtRequestThresholds btRequestThreshold) {
        this.btRequestThreshold = btRequestThreshold;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION_CONFIG);
        level++;
        if(snapshotCollectionPolicy != null) snapshotCollectionPolicy.setLevel(level);
        bud.append(snapshotCollectionPolicy);
        
        if(btRequestThreshold != null) btRequestThreshold.setLevel(level);
        bud.append(btRequestThreshold);
        
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExBusinessTransactionConfig obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION_CONFIG);
        level++;
        if(snapshotCollectionPolicy != null) snapshotCollectionPolicy.setLevel(level);
        bud.append(snapshotCollectionPolicy.whatIsDifferent(obj.getSnapshotCollectionPolicy()));
        
        if(btRequestThreshold != null) btRequestThreshold.setLevel(level);
        bud.append(btRequestThreshold.whatIsDifferent(obj.getBtRequestThreshold()));
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (this.snapshotCollectionPolicy != null ? this.snapshotCollectionPolicy.hashCode() : 0);
        hash = 53 * hash + (this.btRequestThreshold != null ? this.btRequestThreshold.hashCode() : 0);
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
        final ExBusinessTransactionConfig other = (ExBusinessTransactionConfig) obj;
        if (this.snapshotCollectionPolicy != other.snapshotCollectionPolicy && (this.snapshotCollectionPolicy == null || !this.snapshotCollectionPolicy.equals(other.snapshotCollectionPolicy))) {
            return false;
        }
        if (this.btRequestThreshold != other.btRequestThreshold && (this.btRequestThreshold == null || !this.btRequestThreshold.equals(other.btRequestThreshold))) {
            return false;
        }
        return true;
    }
    
    
}

/*
 *         <business-transaction-config>
            <snapshot-collection-policy>
                <minute-frequency enabled="true">10</minute-frequency>
                <nth-occurance enabled="false">100</nth-occurance>
                <sla-violation collect-outliers-only="true" duration="5"
                    enabled="true" max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
                <automatic-collection-enabled>true</automatic-collection-enabled>
                <automatic-slow-volume-percentage-threshold>10</automatic-slow-volume-percentage-threshold>
                <automatic-error-volume-percentage-threshold>10</automatic-error-volume-percentage-threshold>
            </snapshot-collection-policy>
            <bt-request-thresholds>
                <starting-node-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </starting-node-slow-threshold>
                <continuing-segment-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </continuing-segment-slow-threshold>
                <exit-call-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </exit-call-slow-threshold>
                <starting-node-extremely-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>4.0</standard-deviation-threshold>
                </starting-node-extremely-slow-threshold>
                <stall-configuration>
                    <absolute>true</absolute>
                    <absolute-time-in-secs>45</absolute-time-in-secs>
                    <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                </stall-configuration>
            </bt-request-thresholds>
        </business-transaction-config>
 * 
 */