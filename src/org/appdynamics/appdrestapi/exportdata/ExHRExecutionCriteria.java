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
@XmlSeeAlso({ExHRCondition.class,ExEntityAggregationScope.class})
public class ExHRExecutionCriteria {
    private ExHRCondition policyCondition;
    private ExEntityAggregationScope aggScope;
    
    public ExHRExecutionCriteria(){}

    @XmlElement(name=AppExportS.POLICY_CONDITION)
    public ExHRCondition getPolicyCondition() {
        return policyCondition;
    }

    public void setPolicyCondition(ExHRCondition policyCondition) {
        this.policyCondition = policyCondition;
    }

    @XmlElement(name=AppExportS.ENTITY_AGGREGATION_SCOPE)
    public ExEntityAggregationScope getAggScope() {
        return aggScope;
    }

    public void setAggScope(ExEntityAggregationScope aggScope) {
        this.aggScope = aggScope;
    }
    

    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(aggScope);
        bud.append(AppExportS.L3).append(AppExportS.POLICY_CONDITION);
        bud.append(policyCondition);
        return bud.toString();
    }
    
    
    
}
