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
 * L3_1
 * 
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>

                    * 
 */
public class ExPercentileValue {
    private double value;
    
    public ExPercentileValue(){}

    @XmlElement(name=AppExportS.VALUE)
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.PERCENTILE_VALUE);
        bud.append(AppExportS.L4).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        return bud.toString();
    }
    
    
}
