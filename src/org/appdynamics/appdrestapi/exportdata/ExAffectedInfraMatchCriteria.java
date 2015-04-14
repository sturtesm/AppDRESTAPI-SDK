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
 * L2_1
 * 
 */
/*
                <affected-infra-match-criteria>
                    <type>NODES</type>
                    <node-match-criteria>
                        <type>ANY</type>
                        <node-meta-info-match-criteria/>
                        <vm-sys-properties/>
                        <env-properties/>
                    </node-match-criteria>
                </affected-infra-match-criteria>
 * 
 */
@XmlSeeAlso({ExNodeMatchCriteria.class,ExHRNodeComponents.class})
public class ExAffectedInfraMatchCriteria {
    private String type;
    private ExNodeMatchCriteria nodeMatchCriteria;
    private ExHRNodeComponents nodeComp;
    
    public ExAffectedInfraMatchCriteria(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.NODE_MATCH_CRITERIA)
    public ExNodeMatchCriteria getNodeMatchCriteria() {
        return nodeMatchCriteria;
    }

    public void setNodeMatchCriteria(ExNodeMatchCriteria nodeMatchCriteria) {
        this.nodeMatchCriteria = nodeMatchCriteria;
    }

    @XmlElement(name=AppExportS.COMPONENTS)
    public ExHRNodeComponents getNodeComp() {
        return nodeComp;
    }

    public void setNodeComp(ExHRNodeComponents nodeComp) {
        this.nodeComp = nodeComp;
    }
    
    public String whatIsDifferent(ExAffectedInfraMatchCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.AFFECTED_INFRA_MATCH_CRITERIA);
        if(!type.equals(obj.getType())){     
            bud.append(AppExportS.L3_1).append(AppExportS.TYPE);
            bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(type);
            bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
        }
        
        if(nodeMatchCriteria != null){
            bud.append(nodeMatchCriteria.whatIsDifferent(obj.getNodeMatchCriteria()));
        }else{
            if(obj.getNodeMatchCriteria() != null){
                bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeMatchCriteria());
            }
        }
        
        if(nodeComp != null){
            bud.append(nodeComp.whatIsDifferent(obj.getNodeComp()));
        }else{
            if(obj.getNodeComp() != null){
                bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeComp());
            }
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.AFFECTED_INFRA_MATCH_CRITERIA);
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(nodeMatchCriteria != null) bud.append(nodeMatchCriteria);
        if(nodeComp != null) bud.append(nodeComp);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final ExAffectedInfraMatchCriteria other = (ExAffectedInfraMatchCriteria) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.nodeMatchCriteria != other.nodeMatchCriteria && (this.nodeMatchCriteria == null || !this.nodeMatchCriteria.equals(other.nodeMatchCriteria))) {
            return false;
        }
        if (this.nodeComp != other.nodeComp && (this.nodeComp == null || !this.nodeComp.equals(other.nodeComp))) {
            return false;
        }
        return true;
    }
    
    
}
