/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 * 
 * <starting-node-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </starting-node-slow-threshold>
 * 
 */
public class ExSlowThreshold {
    private String evaluationType;
    private String evaluationMins;
    private String standardDeviationThreshold;
    
    public ExSlowThreshold(){}

    @XmlElement(name=AppExportS.EVALUATION_TYPE)
    public String getEvaluationType() {
        return evaluationType;
    }

    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    @XmlElement(name=AppExportS.EVALUATION_MINS)
    public String getEvaluationMins() {
        return evaluationMins;
    }

    public void setEvaluationMins(String evaluationMins) {
        this.evaluationMins = evaluationMins;
    }

    @XmlElement(name=AppExportS.STANDARD_DEVIATION_THRESHOLD)
    public String getStandardDeviationThreshold() {
        return standardDeviationThreshold;
    }

    public void setStandardDeviationThreshold(String standardDeviationThreshold) {
        this.standardDeviationThreshold = standardDeviationThreshold;
    }


    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.EVALUATION_TYPE).append(AppExportS.VE).append(evaluationType);
        bud.append(AppExportS.L3_1).append(AppExportS.EVALUATION_MINS).append(AppExportS.VE).append(evaluationMins);
        bud.append(AppExportS.L3_1).append(AppExportS.STANDARD_DEVIATION_THRESHOLD).append(AppExportS.VE).append(standardDeviationThreshold);
        return bud.toString();
    }
}
