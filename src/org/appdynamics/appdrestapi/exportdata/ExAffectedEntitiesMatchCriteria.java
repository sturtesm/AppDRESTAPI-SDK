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
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L2_1).append(AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA);
        if(btCriteria != null) bud.append(btCriteria);
        if(infraCriteria != null) bud.append(infraCriteria);
        if(overallCriteria != null) bud.append(overallCriteria);
        
        return bud.toString();
    }

    public String whatIsDifferent(ExAffectedEntitiesMatchCriteria obj){
        if(this.equals(obj)) return AppExportS._;
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L2_1).append(AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA);
        if(btCriteria != null){
            bud.append(btCriteria.whatIsDifferent(obj.getBtCriteria()));
        }else{
            if(obj.getBtCriteria() != null){
                bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getBtCriteria());
            }
        }
        if(infraCriteria != null){
            bud.append(infraCriteria.whatIsDifferent(obj.getInfraCriteria()));
        }else{
            if(obj.getInfraCriteria() != null){
                bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getInfraCriteria());
            }
        }
        
        if(overallCriteria != null){
            bud.append(overallCriteria.whatIsDifferent(obj.getOverallCriteria()));
        }else{
            if(obj.getOverallCriteria()!= null){
                bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getOverallCriteria());
            }
        }
        
        
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.btCriteria != null ? this.btCriteria.hashCode() : 0);
        hash = 83 * hash + (this.infraCriteria != null ? this.infraCriteria.hashCode() : 0);
        hash = 83 * hash + (this.overallCriteria != null ? this.overallCriteria.hashCode() : 0);
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
        final ExAffectedEntitiesMatchCriteria other = (ExAffectedEntitiesMatchCriteria) obj;
        if (this.btCriteria != other.btCriteria && (this.btCriteria == null || !this.btCriteria.equals(other.btCriteria))) {
            return false;
        }
        if (this.infraCriteria != other.infraCriteria && (this.infraCriteria == null || !this.infraCriteria.equals(other.infraCriteria))) {
            return false;
        }
        if (this.overallCriteria != other.overallCriteria && (this.overallCriteria == null || !this.overallCriteria.equals(other.overallCriteria))) {
            return false;
        }
        return true;
    }
    
    
}
