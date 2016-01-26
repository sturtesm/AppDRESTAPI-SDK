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
 * L4
 * 
 */
/*
 * 
                            <metric-definition>
                                <type>LOGICAL_METRIC</type>
                                <logical-metric-name>Average Response Time (ms)</logical-metric-name>
                            </metric-definition>
                            
 * 
 */
public class ExHRMetricDefinition {
    private String type;
    private String logicalMetricName;
    private int level=9;
    
    public ExHRMetricDefinition(){}

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

    @XmlElement(name=AppExportS.LOGICAL_METRIC_NAME)
    public String getLogicalMetricName() {
        return logicalMetricName;
    }

    public void setLogicalMetricName(String logicalMetricName) {
        this.logicalMetricName = logicalMetricName;
    }
    
    public String whatIsDifferent(ExHRMetricDefinition obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_DEFINITION);
        level++;
        if(!type.equals(obj.getType())){     
             bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
             level++;
             bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
             bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
             level--;
         }
        
        if(!logicalMetricName.equals(obj.getLogicalMetricName())){     
            bud.append(AppExportS.I[level]).append(AppExportS.LOGICAL_METRIC_NAME);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(logicalMetricName);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getLogicalMetricName());   
            level--;
        }

        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.I[level]).append(AppExportS.LOGICAL_METRIC_NAME).append(AppExportS.VE).append(logicalMetricName);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 41 * hash + (this.logicalMetricName != null ? this.logicalMetricName.hashCode() : 0);
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
        final ExHRMetricDefinition other = (ExHRMetricDefinition) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.logicalMetricName == null) ? (other.logicalMetricName != null) : !this.logicalMetricName.equals(other.logicalMetricName)) {
            return false;
        }
        return true;
    }
    
    
}
