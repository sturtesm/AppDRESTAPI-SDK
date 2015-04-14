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
    
    public String whatIsDifferent(ExEntityAggregationScope obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.ENTITY_AGGREGATION_SCOPE);
        
        if(!type.equals(obj.getType())){     
             bud.append(AppExportS.L4_1).append(AppExportS.TYPE);
             bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(type);
             bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
         }
        
        if(!value.equals(obj.getValue())){     
             bud.append(AppExportS.L4_1).append(AppExportS.VALUE);
             bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(value);
             bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());   
         }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.ENTITY_AGGREGATION_SCOPE);
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L3_1).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 83 * hash + (this.value != null ? this.value.hashCode() : 0);
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
        final ExEntityAggregationScope other = (ExEntityAggregationScope) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.value != other.value && (this.value == null || !this.value.equals(other.value))) {
            return false;
        }
        return true;
    }
    
    
}
