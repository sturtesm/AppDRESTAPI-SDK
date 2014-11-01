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
 * L4
 * 
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
    
    public ExHRMetricDefinition(){}

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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.METRIC_DEFINITION);
        bud.append(AppExportS.L4_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L4_1).append(AppExportS.LOGICAL_METRIC_NAME).append(AppExportS.VE).append(logicalMetricName);
        return bud.toString();
    }
}
