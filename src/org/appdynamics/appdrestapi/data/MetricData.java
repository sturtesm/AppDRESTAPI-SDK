/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author soloink
 */

@XmlSeeAlso({MetricValues.class,MetricValue.class})
public class MetricData {
    protected String metricPath;
    protected String frequency;
    protected ArrayList<MetricValues> metricValues=new ArrayList<MetricValues>();

    public MetricData(){}
    
    @XmlElement(name=s.METRIC_PATH)
    public String getMetricPath() {
        return metricPath;
    }

    public void setMetricPath(String metricPath) {
        this.metricPath = metricPath;
    }

    @XmlElement(name=s.FREQUENCY)
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @XmlElement(name=s.METRIC_VALUES)
    public ArrayList<MetricValues> getMetricValues() {
        return metricValues;
    }

    public void setMetricValues(ArrayList<MetricValues> metricValues) {
        this.metricValues = metricValues;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\tFrequency :: ").append(frequency).append("\n");
        bud.append("\tMetricPath :: ").append(metricPath).append("\n");
        bud.append("\tMetrics :: " ).append(metricValues.size());
        for(MetricValues val: metricValues) bud.append(val.toString()).append("\n");
        return bud.toString();
    }
    
    
}
