/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 * <overall-affected-entities-match-criteria>
<type>APPLICATION</type>
</overall-affected-entities-match-criteria>
* 
 */
public class ExAffectedOverallCriteria {
    private String type;
    
    public ExAffectedOverallCriteria(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.OVERALL_AFFECTED_ENTITIES_MATCH_CRITERIA);
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        return bud.toString();
    }
    
    
}
