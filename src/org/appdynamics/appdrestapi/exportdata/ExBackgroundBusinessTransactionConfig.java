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
        bud.append(AppExportS.L2).append(AppExportS.BACKGROUND_BUSINESS_TRANSACTION_CONFIG);
        bud.append(snapshotCollectionPolicy.toString());
        bud.append(btRequestThresholds.toString());
        return bud.toString();
    }
}
