/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * L3
 * 
                    <percentile-values>
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>
                    </percentile-values>
 */
@XmlSeeAlso(ExPercentileValue.class)
public class ExPercentileValues {
    private ArrayList<ExPercentileValue> percentileValues=new ArrayList<ExPercentileValue>();
    
    public ExPercentileValues(){}

    @XmlElement(name=AppExportS.PERCENTILE_VALUE)
    public ArrayList<ExPercentileValue> getPercentileValues() {
        return percentileValues;
    }

    public void setPercentileValues(ArrayList<ExPercentileValue> percentileValues) {
        this.percentileValues = percentileValues;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PERCENTILE_VALUES);
        for(ExPercentileValue per: percentileValues) bud.append(per.toString());        
        return bud.toString();
    }
    
    public String whatIsDifferent(ExPercentileValues obj){
        if(this.equals(obj)) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PERCENTILE_VALUES);
        
        for(ExPercentileValue value: percentileValues){
            boolean fnd=false;
            for(ExPercentileValue value1: obj.getPercentileValues()){
                if(value.getValue() == value1.getValue()){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L4).append(AppExportS.PERCENTILE_VALUE);
                bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(value.getValue());
            }
        }
        
        for(ExPercentileValue value: obj.getPercentileValues()){
            boolean fnd=false;
            for(ExPercentileValue value1: percentileValues){
                if(value.getValue() == value1.getValue()){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L4).append(AppExportS.PERCENTILE_VALUE);
                bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(value.getValue());
            }
        }
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.percentileValues != null ? this.percentileValues.hashCode() : 0);
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
        final ExPercentileValues other = (ExPercentileValues) obj;
        if (this.percentileValues != other.percentileValues && (this.percentileValues == null || !this.percentileValues.equals(other.percentileValues))) {
            return false;
        }
        return true;
    }
    
    
}
