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
 * 
 * 
<metric-baseline>
    <name>All data - Last 15 days</name>
</metric-baseline>
 * 
 */
public class ExHRMetricBaseline {
    private String name;
    
    public ExHRMetricBaseline(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.METRIC_BASELINE);
        bud.append(AppExportS.L3_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        return bud.toString();
        
    }
}
