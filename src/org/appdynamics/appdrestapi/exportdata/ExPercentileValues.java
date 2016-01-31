/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * I[level]
 * 
 * 
 */
/*
                    <percentile-values>
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>
                    </percentile-values>
 */
@XmlSeeAlso(ExPercentileValue.class)
public class ExPercentileValues {
    private ArrayList<ExPercentileValue> percentileValues=new ArrayList<ExPercentileValue>();
    private int level=6;
    
    public ExPercentileValues(){}

    @XmlElement(name=AppExportS.PERCENTILE_VALUE)
    public ArrayList<ExPercentileValue> getPercentileValues() {
        return percentileValues;
    }

    public void setPercentileValues(ArrayList<ExPercentileValue> percentileValues) {
        this.percentileValues = percentileValues;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PERCENTILE_VALUES);
        level++;
        for(ExPercentileValue per: percentileValues) {per.setLevel(level);bud.append(per); }
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExPercentileValues obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PERCENTILE_VALUES);
        level++;
        for(ExPercentileValue value: percentileValues){
            boolean fnd=false;
            for(ExPercentileValue value1: obj.getPercentileValues()){
                if(value.getValue() == value1.getValue()){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.PERCENTILE_VALUE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value.getValue());
                level--;
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
                bud.append(AppExportS.I[level]).append(AppExportS.PERCENTILE_VALUE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value.getValue());
                level--;
            }
        }
        level--;
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
        
        if(percentileValues.size() != other.getPercentileValues().size()) return false;
        
        for(ExPercentileValue value: percentileValues){
            boolean fnd=false;
            for(ExPercentileValue value1: other.getPercentileValues()){
                if(value.getValue() == value1.getValue()){
                    if(value.equals(value1))fnd=true;
                }
            }
            if(!fnd){
                return false;
            }
        }
        return true;
    }
    
    
}
