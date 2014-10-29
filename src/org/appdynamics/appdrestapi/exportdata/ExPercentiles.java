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
 * L2_1
 *              <percentile-config>
                    <enabled>true</enabled>
                    <percentile-values>
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>
                    </percentile-values>
                </percentile-config>
                * 
                * 
 */
@XmlSeeAlso({ExPercentileValues.class,ExPercentileValue.class})
public class ExPercentiles {
    private boolean enabled;
    private ExPercentileValues percentileValues;
    
    public ExPercentiles(){}

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.PERCENTILE_VALUES)
    public ExPercentileValues getPercentileValues() {
        return percentileValues;
    }

    public void setPercentileValues(ExPercentileValues percentileValues) {
        this.percentileValues = percentileValues;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.PERCENTILE_CONFIG);
        bud.append(percentileValues);
        return bud.toString();
    }
    
}
