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
                <entity-aggregation-scope>
                    <type>AGGREGATE</type>
                    <value>0</value>
                </entity-aggregation-scope>
 */
public class ExEntityAggregationScope {
    private String type;
    private Integer value;
    
    public ExEntityAggregationScope(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.VALUE)
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.ENTITY_AGGREGATION_SCOPE);
        bud.append(AppExportS.L3).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L3).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        return bud.toString();
    }
}
