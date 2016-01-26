/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso({ExHRCondition.class,ExEntityAggregationScope.class})
public class ExHRExecutionCriteria {
    private String name;
    private ExHRCondition policyCondition;
    private ExEntityAggregationScope aggScope;
    private int level=4;
    
    public ExHRExecutionCriteria(){}

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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
        bud.append(AppExportS.I[level]).append(name);
        level++;
        if(aggScope != null) aggScope.setLevel(level);
        if(policyCondition != null) policyCondition.setLevel(level);
        
        bud.append(aggScope.whatIsDifferent(obj.getAggScope()));
        bud.append(policyCondition.whatIsDifferent(obj.getPolicyCondition()));
        level++;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(name);
        level++;
        if(aggScope != null) aggScope.setLevel(level);
        if(policyCondition != null) policyCondition.setLevel(level);
        
        bud.append(aggScope);
        
        bud.append(policyCondition);
        
        level--;
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
