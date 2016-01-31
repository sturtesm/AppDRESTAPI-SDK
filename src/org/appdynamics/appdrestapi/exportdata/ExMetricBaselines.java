/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 */

@XmlSeeAlso(ExMetricBaseline.class)
public class ExMetricBaselines {
    private ArrayList<ExMetricBaseline> metricBaselines=new ArrayList<ExMetricBaseline>();
    private int level=2;
    
    public ExMetricBaselines(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    

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
        
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_BASELINES);
        level++;
        
        for(ExMetricBaseline value: metricBaselines){
            boolean fnd=false;
            value.setLevel(level);
            for(ExMetricBaseline _value:obj.getMetricBaselines()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            }
        }
        
        for(ExMetricBaseline value: obj.getMetricBaselines()){
            boolean fnd=false;
            value.setLevel(level);
            for(ExMetricBaseline _value:metricBaselines){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);
            }
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_BASELINES);
        level++;
        for(ExMetricBaseline base: metricBaselines){ base.setLevel(level);bud.append(base);}
        level--;
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
        if(metricBaselines.size() != other.getMetricBaselines().size() ) return false;
        
        for(ExMetricBaseline value: metricBaselines){
            boolean fnd=false;
            value.setLevel(level);
            for(ExMetricBaseline _value:other.getMetricBaselines()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value)) fnd=true;
                }
            }
            if(!fnd){
                return false;
            }
        }
        return true;
    }
    
    
}

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