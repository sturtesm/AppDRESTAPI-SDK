/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 * L2_1
 * 
 */

public class ExEntityAggregationScope {
    private String type;
    private Integer value;
    private int level=8;
    
    public ExEntityAggregationScope(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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
        bud.append(AppExportS.I[level]).append(AppExportS.ENTITY_AGGREGATION_SCOPE);
        level++;
        
        if(!type.equals(obj.getType())){     
             bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
             level++;
             bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
             bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
             level--;
         }
        
        if(!value.equals(obj.getValue())){     
             bud.append(AppExportS.I[level]).append(AppExportS.VALUE);
             level++;
             bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
             bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());   
             level--;
         }
        
        level++;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ENTITY_AGGREGATION_SCOPE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.I[level]).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        level--;
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

/*
                <entity-aggregation-scope>
                    <type>AGGREGATE</type>
                    <value>0</value>
                </entity-aggregation-scope>
 */