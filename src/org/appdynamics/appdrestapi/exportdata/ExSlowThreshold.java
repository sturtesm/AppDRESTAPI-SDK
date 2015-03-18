/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

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
                * <starting-node-slow-threshold>
                    <evaluation-type>STATIC</evaluation-type>
                    <static-threshold-in-millis>10</static-threshold-in-millis>
                </starting-node-slow-threshold>

                <exit-call-slow-threshold>
                    <evaluation-type>PERCENTAGE_DEVIATION</evaluation-type>
                    <percentage-threshold>20</percentage-threshold>
                    <evaluation-mins>120</evaluation-mins>
                </exit-call-slow-threshold>
 * 
 */
public class ExSlowThreshold {
    private String evaluationType;
    private int evaluationMins=-1;
    private double standardDeviationThreshold=-1;
    private int staticThresholdInMillis=-1;
    private int percentageThreshold=-1;
    
    public ExSlowThreshold(){}

    @XmlElement(name=AppExportS.EVALUATION_TYPE)
    public String getEvaluationType() {
        return evaluationType;
    }

    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    @XmlElement(name=AppExportS.EVALUATION_MINS)
    public int getEvaluationMins() {
        return evaluationMins;
    }

    public void setEvaluationMins(int evaluationMins) {
        this.evaluationMins = evaluationMins;
    }

    @XmlElement(name=AppExportS.STANDARD_DEVIATION_THRESHOLD)
    public double getStandardDeviationThreshold() {
        return standardDeviationThreshold;
    }

    public void setStandardDeviationThreshold(double standardDeviationThreshold) {
        this.standardDeviationThreshold = standardDeviationThreshold;
    }

    @XmlElement(name=AppExportS.STATIC_THRESHOLD_IN_MILLIS)
    public int getStaticThresholdInMillis() {
        return staticThresholdInMillis;
    }

    public void setStaticThresholdInMillis(int staticThresholdInMillis) {
        this.staticThresholdInMillis = staticThresholdInMillis;
    }

    @XmlElement(name=AppExportS.PERCENTAGE_THRESHOLD)
    public int getPercentageThreshold() {
        return percentageThreshold;
    }

    public void setPercentageThreshold(int percentageThreshold) {
        this.percentageThreshold = percentageThreshold;
    }


    @XmlTransient
    public int getType(){
        for(int i=0;i< AppExportS.SLOWTHRESHOLD_TYPES.length;i++){
            if(evaluationType.equals(AppExportS.SLOWTHRESHOLD_TYPES[i])) return i;
        }
        
        return 0;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.EVALUATION_TYPE).append(AppExportS.VE).append(evaluationType);
        if(evaluationMins > -1) bud.append(AppExportS.L3).append(AppExportS.EVALUATION_MINS).append(AppExportS.VE).append(evaluationMins);
        if(standardDeviationThreshold > -1)bud.append(AppExportS.L3).append(AppExportS.STANDARD_DEVIATION_THRESHOLD).append(AppExportS.VE).append(standardDeviationThreshold);
        return bud.toString();
    }

    public String whatIsDifferent(ExSlowThreshold obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        if(getType() != obj.getType()){
                bud.append(AppExportS.L3).append(AppExportS.EVALUATION_TYPE).append(" is different.");
                bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(evaluationType);
                bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEvaluationType());
        }else{
            
            if(getType()==0){
               if(evaluationMins != obj.getEvaluationMins()){
                    bud.append(AppExportS.L3).append(AppExportS.EVALUATION_MINS);
                    bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(evaluationMins);
                    bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEvaluationMins());

                }

                if(standardDeviationThreshold != obj.getStandardDeviationThreshold()){
                    bud.append(AppExportS.L3).append(AppExportS.STANDARD_DEVIATION_THRESHOLD);
                    bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(standardDeviationThreshold);
                    bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getStandardDeviationThreshold());

                }
            }
            
            if(getType() == 1){
                if(staticThresholdInMillis != obj.staticThresholdInMillis){
                    bud.append(AppExportS.L3).append(AppExportS.STATIC_THRESHOLD_IN_MILLIS);
                    bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(staticThresholdInMillis);
                    bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getStaticThresholdInMillis()); 
                }
            }
            
            if(getType() == 2){
                if(evaluationMins != obj.getEvaluationMins()){
                    bud.append(AppExportS.L3).append(AppExportS.EVALUATION_MINS);
                    bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(evaluationMins);
                    bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getEvaluationMins());

                }
                
                if(percentageThreshold != obj.getPercentageThreshold()){
                    bud.append(AppExportS.L3).append(AppExportS.PERCENTAGE_THRESHOLD);
                    bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(percentageThreshold);
                    bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPercentageThreshold());

                }
            }
        }

        
        return bud.toString();
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.evaluationType != null ? this.evaluationType.hashCode() : 0);
        hash = 89 * hash + this.evaluationMins;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.standardDeviationThreshold) ^ (Double.doubleToLongBits(this.standardDeviationThreshold) >>> 32));
        hash = 89 * hash + this.staticThresholdInMillis;
        hash = 89 * hash + this.percentageThreshold;
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
        final ExSlowThreshold other = (ExSlowThreshold) obj;
        if ((this.evaluationType == null) ? (other.evaluationType != null) : !this.evaluationType.equals(other.evaluationType)) {
            return false;
        }
        if (this.evaluationMins != other.evaluationMins) {
            return false;
        }
        if (Double.doubleToLongBits(this.standardDeviationThreshold) != Double.doubleToLongBits(other.standardDeviationThreshold)) {
            return false;
        }
        if (this.staticThresholdInMillis != other.staticThresholdInMillis) {
            return false;
        }
        return true;
    }
    
    
    
}
