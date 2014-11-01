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
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.AFFECTED_INFRA_MATCH_CRITERIA);
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(nodeMatchCriteria != null) bud.append(nodeMatchCriteria);
        if(nodeComp != null) bud.append(nodeComp);
        return bud.toString();
    }
}
