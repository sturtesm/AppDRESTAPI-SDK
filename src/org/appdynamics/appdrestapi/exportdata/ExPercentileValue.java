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

    public String whatIsDifferent(ExPercentileValue obj){
        if(this.equals(obj)) return AppExportS._;
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3_1).append(AppExportS.PERCENTILE_VALUE);
        
        if(value != obj.getValue()){
            bud.append(AppExportS.L4).append(AppExportS.VALUE);
            bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());
        }
        
        return bud.toString();
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
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
        final ExPercentileValue other = (ExPercentileValue) obj;
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
