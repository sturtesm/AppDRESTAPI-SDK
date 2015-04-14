/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 */
/*
 * <metric-baselines>
        <metric-baseline seasonality="NONE">
            <name>All data - Last 15 days</name>
            <fixed>false</fixed>
            <is-default>false</is-default>
            <all-date>false</all-date>
            <number-of-days>15</number-of-days>
        </metric-baseline>
 * 
 */
@XmlSeeAlso(ExMetricBaseline.class)
public class ExMetricBaselines {
    private ArrayList<ExMetricBaseline> metricBaselines=new ArrayList<ExMetricBaseline>();
    
    public ExMetricBaselines(){}

    @XmlElement(name=AppExportS.METRIC_BASELINE)
    public ArrayList<ExMetricBaseline> getMetricBaselines() {
        return metricBaselines;
    }

    public void setMetricBaselines(ArrayList<ExMetricBaseline> metricBaselines) {
        this.metricBaselines = metricBaselines;
    }
    
    public String whatIsDifferent(ExMetricBaselines obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L1).append(AppExportS.METRIC_BASELINES);
        
        for(ExMetricBaseline value: metricBaselines){
            boolean fnd=false;
            for(ExMetricBaseline _value:obj.getMetricBaselines()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.L1_1).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            }
        }
        
        for(ExMetricBaseline value: obj.getMetricBaselines()){
            boolean fnd=false;
            for(ExMetricBaseline _value:metricBaselines){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L1_1).append(AppExportS.DEST).append(AppExportS.VE).append(value);
            }
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.METRIC_BASELINES);
        for(ExMetricBaseline base: metricBaselines) bud.append(base.toString());
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.metricBaselines != null ? this.metricBaselines.hashCode() : 0);
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
        final ExMetricBaselines other = (ExMetricBaselines) obj;
        if (this.metricBaselines != other.metricBaselines && (this.metricBaselines == null || !this.metricBaselines.equals(other.metricBaselines))) {
            return false;
        }
        return true;
    }
    
    
}
