/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
@XmlSeeAlso(ExMethodParameterTransformer.class)
public class ExInfoPointMetricDefinition {
    private ExMethodParameterTransformer methodParameterTransformer;
    private String name,rollupType;
    private int level=9;
    
    public ExInfoPointMetricDefinition(){}

    @XmlElement(name=AppExportS.METHOD_PARAMETER_TRANSFORMER)
    public ExMethodParameterTransformer getMethodParameterTransformer() {
        return methodParameterTransformer;
    }

    public void setMethodParameterTransformer(ExMethodParameterTransformer methodParameterTransformer) {
        this.methodParameterTransformer = methodParameterTransformer;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.ROLLUP_TYPE)
    public String getRollupType() {
        return rollupType;
    }

    public void setRollupType(String rollupType) {
        this.rollupType = rollupType;
    }
    
    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    public String whatIsDifferent(ExInfoPointMetricDefinition obj){ // 3 or 1 is the seeting.
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.INFO_POINT_METRIC_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!rollupType.equals(obj.getRollupType())){         
            bud.append(AppExportS.I[level]).append(AppExportS.ROLLUP_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(rollupType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getRollupType()); 
            level--;
        }
        
        methodParameterTransformer.setLevel(level);
        bud.append(methodParameterTransformer.whatIsDifferent(obj.getMethodParameterTransformer()));
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.INFO_POINT_METRIC_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.ROLLUP_TYPE).append(AppExportS.VE).append(rollupType);
        methodParameterTransformer.setLevel(level);
        bud.append(methodParameterTransformer);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.methodParameterTransformer != null ? this.methodParameterTransformer.hashCode() : 0);
        hash = 83 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 83 * hash + (this.rollupType != null ? this.rollupType.hashCode() : 0);
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
        final ExInfoPointMetricDefinition other = (ExInfoPointMetricDefinition) obj;
        if (this.methodParameterTransformer != other.methodParameterTransformer && (this.methodParameterTransformer == null || !this.methodParameterTransformer.equals(other.methodParameterTransformer))) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.rollupType == null) ? (other.rollupType != null) : !this.rollupType.equals(other.rollupType)) {
            return false;
        }
        return true;
    }
    
    
    
}
