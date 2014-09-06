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
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.METRIC_BASELINES);
        for(ExMetricBaseline base: metricBaselines) bud.append(base.toString());
        return bud.toString();
    }
}
