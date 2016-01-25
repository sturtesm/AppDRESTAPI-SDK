/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */

@XmlSeeAlso({ExSlowThreshold.class,ExStallConfiguration.class,ExPercentiles.class})
public class ExBtRequestThresholds {
   private ExSlowThreshold startingNodeSlowThreshold;
   private ExSlowThreshold continuingSegmentSlowThreshold;
   private ExSlowThreshold exitCallSlowThreshold;
   private ExSlowThreshold extremelySlowThreshold;
   private ExStallConfiguration stallConfiguration;
   private ExPercentiles percentiles;
   private int level=4;
   
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
    
    @XmlElement(name=AppExportS.PERCENTILE_CONFIG)
    public ExPercentiles getPercentiles() {
        return percentiles;
    }

    public void setPercentiles(ExPercentiles percentiles) {
        this.percentiles = percentiles;
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
       bud.append(AppExportS.I[level]).append(AppExportS.BT_REQUEST_THRESHOLDS);
       level++;
       bud.append(AppExportS.I[level]).append(AppExportS.STARTING_NODE_SLOW_THRESHOLD);
       level++;
       startingNodeSlowThreshold.setLevel(level);
       bud.append(startingNodeSlowThreshold);
       level--;
       bud.append(AppExportS.I[level]).append(AppExportS.CONTINUING_SEGMENT_SLOW_THRESHOLD);
       level++;
       continuingSegmentSlowThreshold.setLevel(level);
       bud.append(continuingSegmentSlowThreshold);
       level--;
       bud.append(AppExportS.I[level]).append(AppExportS.EXIT_CALL_SLOW_THRESHOLD);
       level++;
       exitCallSlowThreshold.setLevel(level);
       bud.append(exitCallSlowThreshold);
       level--;
       bud.append(AppExportS.I[level]).append(AppExportS.STARTING_NODE_EXTREMELY_SLOW_THRESHOLD);
       level++;
       if(extremelySlowThreshold != null) extremelySlowThreshold.setLevel(level);
       bud.append(extremelySlowThreshold);
       level--;
       if(stallConfiguration != null) stallConfiguration.setLevel(level);
       bud.append(stallConfiguration);
       if(percentiles != null) percentiles.setLevel(level);
       bud.append(percentiles);
       level--;
       return bud.toString();
   }
   
   public String whatIsDifferent(ExBtRequestThresholds obj){
       if(this.equals(obj)) return AppExportS._U;
       
       StringBuilder bud = new StringBuilder();
       bud.append(AppExportS.I[level]).append(AppExportS.BT_REQUEST_THRESHOLDS);
       level++;
       startingNodeSlowThreshold.setLevel(level);
       String val=startingNodeSlowThreshold.whatIsDifferent(obj.startingNodeSlowThreshold);
       
       if(val.length() > 8){
           bud.append(AppExportS.I[level]).append(AppExportS.STARTING_NODE_SLOW_THRESHOLD);
           bud.append(val);
       }
       
       continuingSegmentSlowThreshold.setLevel(level);
       val=continuingSegmentSlowThreshold.whatIsDifferent(obj.getContinuingSegmentSlowThreshold());
       if(val.length() > 8){
           bud.append(AppExportS.I[level]).append(AppExportS.CONTINUING_SEGMENT_SLOW_THRESHOLD);
           bud.append(val);
       }
       
       //Here is where I die
       exitCallSlowThreshold.setLevel(level);
       val=exitCallSlowThreshold.whatIsDifferent(obj.getExitCallSlowThreshold());
       if(val.length() > 8){
           bud.append(AppExportS.I[level]).append(AppExportS.EXIT_CALL_SLOW_THRESHOLD);
           bud.append(val);
       }
       
       extremelySlowThreshold.setLevel(level);
       val=extremelySlowThreshold.whatIsDifferent(obj.getExtremelySlowThreshold());
       if(val.length() > 8){
           bud.append(AppExportS.I[level]).append(AppExportS.STARTING_NODE_EXTREMELY_SLOW_THRESHOLD);
           bud.append(val);
       }
       stallConfiguration.setLevel(level);
       bud.append(stallConfiguration.whatIsDifferent(obj.getStallConfiguration()));
       
       percentiles.setLevel(level);
       bud.append(percentiles.whatIsDifferent(obj.getPercentiles()));
       
       level--;
       return bud.toString();
       
   }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (this.startingNodeSlowThreshold != null ? this.startingNodeSlowThreshold.hashCode() : 0);
        hash = 71 * hash + (this.continuingSegmentSlowThreshold != null ? this.continuingSegmentSlowThreshold.hashCode() : 0);
        hash = 71 * hash + (this.exitCallSlowThreshold != null ? this.exitCallSlowThreshold.hashCode() : 0);
        hash = 71 * hash + (this.extremelySlowThreshold != null ? this.extremelySlowThreshold.hashCode() : 0);
        hash = 71 * hash + (this.stallConfiguration != null ? this.stallConfiguration.hashCode() : 0);
        hash = 71 * hash + (this.percentiles != null ? this.percentiles.hashCode() : 0);
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
        final ExBtRequestThresholds other = (ExBtRequestThresholds) obj;
        if (this.startingNodeSlowThreshold != other.startingNodeSlowThreshold && (this.startingNodeSlowThreshold == null || !this.startingNodeSlowThreshold.equals(other.startingNodeSlowThreshold))) {
            return false;
        }
        if (this.continuingSegmentSlowThreshold != other.continuingSegmentSlowThreshold && (this.continuingSegmentSlowThreshold == null || !this.continuingSegmentSlowThreshold.equals(other.continuingSegmentSlowThreshold))) {
            return false;
        }
        if (this.exitCallSlowThreshold != other.exitCallSlowThreshold && (this.exitCallSlowThreshold == null || !this.exitCallSlowThreshold.equals(other.exitCallSlowThreshold))) {
            return false;
        }
        if (this.extremelySlowThreshold != other.extremelySlowThreshold && (this.extremelySlowThreshold == null || !this.extremelySlowThreshold.equals(other.extremelySlowThreshold))) {
            return false;
        }
        if (this.stallConfiguration != other.stallConfiguration && (this.stallConfiguration == null || !this.stallConfiguration.equals(other.stallConfiguration))) {
            return false;
        }
        if (this.percentiles != other.percentiles && (this.percentiles == null || !this.percentiles.equals(other.percentiles))) {
            return false;
        }
        return true;
    }
   
   
   
}
/*
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
                <percentile-config>
                    <enabled>true</enabled>
                    <percentile-values>
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>
                    </percentile-values>
                </percentile-config>
            </bt-request-thresholds>
 * 
 */