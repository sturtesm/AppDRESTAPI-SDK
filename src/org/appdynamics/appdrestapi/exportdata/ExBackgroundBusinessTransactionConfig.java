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
 * <background-business-transaction-config>
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
                    <evaluation-mins>180</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </starting-node-slow-threshold>
                <continuing-segment-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </continuing-segment-slow-threshold>
                <exit-call-slow-threshold>
                    <evaluation-type>PERCENTAGE_DEVIATION</evaluation-type>
                    <percentage-threshold>20</percentage-threshold>
                    <evaluation-mins>120</evaluation-mins>
                </exit-call-slow-threshold>
                <starting-node-extremely-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>180</evaluation-mins>
                    <standard-deviation-threshold>4.0</standard-deviation-threshold>
                </starting-node-extremely-slow-threshold>
                <stall-configuration>
                    <absolute>false</absolute>
                    <absolute-time-in-secs>0</absolute-time-in-secs>
                    <bt-sla-violation-multiplier>300</bt-sla-violation-multiplier>
                </stall-configuration>
                <percentile-config>
                    <enabled>true</enabled>
                    <percentile-values>
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>
                    </percentile-values>
                </percentile-config>
            </bt-request-thresholds>
        </background-business-transaction-config>
 * 
 */
@XmlSeeAlso({ExSnapshotCollectionPolicy.class,ExBtRequestThresholds.class})
public class ExBackgroundBusinessTransactionConfig {
    private ExSnapshotCollectionPolicy snapshotCollectionPolicy;
    private ExBtRequestThresholds btRequestThresholds;
    
    public ExBackgroundBusinessTransactionConfig(){}

    @XmlElement(name=AppExportS.SNAPSHOT_COLLECTION_POLICY)
    public ExSnapshotCollectionPolicy getSnapshotCollectionPolicy() {
        return snapshotCollectionPolicy;
    }

    public void setSnapshotCollectionPolicy(ExSnapshotCollectionPolicy snapshotCollectionPolicy) {
        this.snapshotCollectionPolicy = snapshotCollectionPolicy;
    }

    @XmlElement(name=AppExportS.BT_REQUEST_THRESHOLDS)
    public ExBtRequestThresholds getBtRequestThresholds() {
        return btRequestThresholds;
    }

    public void setBtRequestThresholds(ExBtRequestThresholds btRequestThresholds) {
        this.btRequestThresholds = btRequestThresholds;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.BACKGROUND_BUSINESS_TRANSACTION_CONFIG);
        bud.append(snapshotCollectionPolicy.toString());
        bud.append(btRequestThresholds.toString());
        return bud.toString();
    }
    
    public String whatIsDifferent(ExBackgroundBusinessTransactionConfig obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.BACKGROUND_BUSINESS_TRANSACTION_CONFIG);
        
        bud.append(snapshotCollectionPolicy.whatIsDifferent(obj.getSnapshotCollectionPolicy()));
        bud.append(btRequestThresholds.whatIsDifferent(obj.getBtRequestThresholds()));
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.snapshotCollectionPolicy != null ? this.snapshotCollectionPolicy.hashCode() : 0);
        hash = 47 * hash + (this.btRequestThresholds != null ? this.btRequestThresholds.hashCode() : 0);
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
        final ExBackgroundBusinessTransactionConfig other = (ExBackgroundBusinessTransactionConfig) obj;
        if (this.snapshotCollectionPolicy != other.snapshotCollectionPolicy && (this.snapshotCollectionPolicy == null || !this.snapshotCollectionPolicy.equals(other.snapshotCollectionPolicy))) {
            return false;
        }
        if (this.btRequestThresholds != other.btRequestThresholds && (this.btRequestThresholds == null || !this.btRequestThresholds.equals(other.btRequestThresholds))) {
            return false;
        }
        return true;
    }
    
    
}
