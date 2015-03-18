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
    

    public String whatIsDifferent(ExHRExecutionCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append("Execution Criteria");
        bud.append(aggScope.whatIsDifferent(obj.getAggScope()));
        bud.append(policyCondition.whatIsDifferent(obj.getPolicyCondition()));
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(aggScope);
        bud.append(AppExportS.L3).append(AppExportS.POLICY_CONDITION);
        bud.append(policyCondition);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.policyCondition != null ? this.policyCondition.hashCode() : 0);
        hash = 59 * hash + (this.aggScope != null ? this.aggScope.hashCode() : 0);
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
        final ExHRExecutionCriteria other = (ExHRExecutionCriteria) obj;
        if (this.policyCondition != other.policyCondition && (this.policyCondition == null || !this.policyCondition.equals(other.policyCondition))) {
            return false;
        }
        if (this.aggScope != other.aggScope && (this.aggScope == null || !this.aggScope.equals(other.aggScope))) {
            return false;
        }
        return true;
    }
    
}
