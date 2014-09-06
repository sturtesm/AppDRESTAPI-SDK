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
 * 
 * <bt-request-thresholds>
                <starting-node-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </starting-node-slow-threshold>
                <continuing-segment-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </continuing-segment-slow-threshold>
                <exit-call-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>3.0</standard-deviation-threshold>
                </exit-call-slow-threshold>
                <starting-node-extremely-slow-threshold>
                    <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                    <evaluation-mins>120</evaluation-mins>
                    <standard-deviation-threshold>4.0</standard-deviation-threshold>
                </starting-node-extremely-slow-threshold>
                <stall-configuration>
                    <absolute>true</absolute>
                    <absolute-time-in-secs>45</absolute-time-in-secs>
                    <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                </stall-configuration>
            </bt-request-thresholds>
 * 
 */
@XmlSeeAlso({ExSlowThreshold.class,ExStallConfiguration.class})
public class ExBtRequestThresholds {
   private ExSlowThreshold startingNodeSlowThreshold;
   private ExSlowThreshold continuingSegmentSlowThreshold;
   private ExSlowThreshold exitCallSlowThreshold;
   private ExSlowThreshold extremelySlowThreshold;
   private ExStallConfiguration stallConfiguration;
   
   public ExBtRequestThresholds(){}

   @XmlElement(name=AppExportS.STARTING_NODE_SLOW_THRESHOLD)
    public ExSlowThreshold getStartingNodeSlowThreshold() {
        return startingNodeSlowThreshold;
    }

    public void setStartingNodeSlowThreshold(ExSlowThreshold startingNodeSlowThreshold) {
        this.startingNodeSlowThreshold = startingNodeSlowThreshold;
    }

    @XmlElement(name=AppExportS.CONTINUING_SEGMENT_SLOW_THRESHOLD)
    public ExSlowThreshold getContinuingSegmentSlowThreshold() {
        return continuingSegmentSlowThreshold;
    }

    public void setContinuingSegmentSlowThreshold(ExSlowThreshold continuingSegmentSlowThreshold) {
        this.continuingSegmentSlowThreshold = continuingSegmentSlowThreshold;
    }

    @XmlElement(name=AppExportS.EXIT_CALL_SLOW_THRESHOLD)
    public ExSlowThreshold getExitCallSlowThreshold() {
        return exitCallSlowThreshold;
    }

    public void setExitCallSlowThreshold(ExSlowThreshold exitCallSlowThreshold) {
        this.exitCallSlowThreshold = exitCallSlowThreshold;
    }

    @XmlElement(name=AppExportS.STALL_CONFIGURATION)
    public ExStallConfiguration getStallConfiguration() {
        return stallConfiguration;
    }

    public void setStallConfiguration(ExStallConfiguration stallConfiguration) {
        this.stallConfiguration = stallConfiguration;
    }

    @XmlElement(name=AppExportS.STARTING_NODE_EXTREMELY_SLOW_THRESHOLD)
    public ExSlowThreshold getExtremelySlowThreshold() {
        return extremelySlowThreshold;
    }

    public void setExtremelySlowThreshold(ExSlowThreshold extremelySlowThreshold) {
        this.extremelySlowThreshold = extremelySlowThreshold;
    }
   
   
   
   @Override
   public String toString(){
       StringBuilder bud = new StringBuilder();
       bud.append(AppExportS.L2_1).append(AppExportS.BT_REQUEST_THRESHOLDS);
       bud.append(AppExportS.L3).append(AppExportS.STARTING_NODE_SLOW_THRESHOLD);
       bud.append(startingNodeSlowThreshold.toString());
       bud.append(AppExportS.L3).append(AppExportS.CONTINUING_SEGMENT_SLOW_THRESHOLD);
       bud.append(continuingSegmentSlowThreshold.toString());
       bud.append(AppExportS.L3).append(AppExportS.EXIT_CALL_SLOW_THRESHOLD);
       bud.append(exitCallSlowThreshold.toString());
       bud.append(AppExportS.L3).append(AppExportS.STARTING_NODE_EXTREMELY_SLOW_THRESHOLD);
       bud.append(extremelySlowThreshold.toString());
       bud.append(stallConfiguration.toString());
       return bud.toString();
   }
   
}
