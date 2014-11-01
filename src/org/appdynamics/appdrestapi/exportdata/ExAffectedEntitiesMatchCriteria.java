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
 * L2
            <affected-entities-match-criteria>
                <affected-bt-match-criteria>
                    <type>ALL</type>
                </affected-bt-match-criteria>
            </affected-entities-match-criteria>
            * 
 */
@XmlSeeAlso({ExAffectedBTMatchCriteria.class,ExAffectedInfraMatchCriteria.class})
public class ExAffectedEntitiesMatchCriteria {
    private ExAffectedBTMatchCriteria btCriteria;
    private ExAffectedInfraMatchCriteria infraCriteria;
    private ExAffectedOverallCriteria overallCriteria;
    
    public ExAffectedEntitiesMatchCriteria(){}

    @XmlElement(name=AppExportS.AFFECTED_BT_MATCH_CRITERIA)
    public ExAffectedBTMatchCriteria getBtCriteria() {
        return btCriteria;
    }

    public void setBtCriteria(ExAffectedBTMatchCriteria btCriteria) {
        this.btCriteria = btCriteria;
    }

    @XmlElement(name=AppExportS.AFFECTED_INFRA_MATCH_CRITERIA)
    public ExAffectedInfraMatchCriteria getInfraCriteria() {
        return infraCriteria;
    }

    public void setInfraCriteria(ExAffectedInfraMatchCriteria infraCriteria) {
        this.infraCriteria = infraCriteria;
    }

    @XmlElement(name=AppExportS.OVERALL_AFFECTED_ENTITIES_MATCH_CRITERIA)
    public ExAffectedOverallCriteria getOverallCriteria() {
        return overallCriteria;
    }

    public void setOverallCriteria(ExAffectedOverallCriteria overallCriteria) {
        this.overallCriteria = overallCriteria;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA);
        if(btCriteria != null) bud.append(btCriteria);
        if(infraCriteria != null) bud.append(infraCriteria);
        if(overallCriteria != null) bud.append(overallCriteria);
        
        return bud.toString();
    }
}
