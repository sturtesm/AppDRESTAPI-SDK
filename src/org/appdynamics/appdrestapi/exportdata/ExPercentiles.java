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
 *              
                    <percentile-values>
                        <percentile-value>
                            <value>50.0</value>
                        </percentile-value>
                        <percentile-value>
                            <value>65.0</value>
                        </percentile-value>
                        <percentile-value>
                            <value>75.0</value>
                        </percentile-value>
                        <percentile-value>
                            <value>90.0</value>
                        </percentile-value>
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>
                    </percentile-values>
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
        bud.append(AppExportS.L3).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(percentileValues);
        return bud.toString();
    }

    public String whatIsDifferent(ExPercentiles obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.PERCENTILE_CONFIG);
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.L3).append(AppExportS.ENABLED);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
            
        }
        
        bud.append(percentileValues.whatIsDifferent(obj.getPercentileValues()));
        
        
        return bud.toString();
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.enabled ? 1 : 0);
        hash = 67 * hash + (this.percentileValues != null ? this.percentileValues.hashCode() : 0);
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
        final ExPercentiles other = (ExPercentiles) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.percentileValues != other.percentileValues && (this.percentileValues == null || !this.percentileValues.equals(other.percentileValues))) {
            return false;
        }
        return true;
    }
    
    
    
}
