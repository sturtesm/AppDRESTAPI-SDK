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
 */
public class ExCallGraph {
    private String agentType;
    private int samplingRate;
    private boolean rawSQL;
    private String excludePackages;
    private String includePackages;
    private int minDurationForDBCalls;
    private boolean hotSpotsEnabled;

    public ExCallGraph() {
    }

    @XmlAttribute(name=AppExportS.AGENT_TYPE)
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    @XmlElement(name=AppExportS.SAMPLING_RATE)
    public int getSamplingRate() {
        return samplingRate;
    }

    public void setSamplingRate(int samplingRate) {
        this.samplingRate = samplingRate;
    }

    @XmlElement(name=AppExportS.RAW_SQL)
    public boolean getRawSQL() {
        return rawSQL;
    }

    public void setRawSQL(boolean rawSQL) {
        this.rawSQL = rawSQL;
    }

    @XmlElement(name=AppExportS.EXCLUDE_PACKAGES)
    public String getExcludePackages() {
        return excludePackages;
    }

    public void setExcludePackages(String excludePackages) {
        this.excludePackages = excludePackages;
    }

    @XmlElement(name=AppExportS.INCLUDE_PACKAGES)
    public String getIncludePackages() {
        return includePackages;
    }

    public void setIncludePackages(String includePackages) {
        this.includePackages = includePackages;
    }

    @XmlElement(name=AppExportS.MIN_DURATION_FOR_DB_CALLS)
    public int getMinDurationForDBCalls() {
        return minDurationForDBCalls;
    }

    public void setMinDurationForDBCalls(int minDurationForDBCalls) {
        this.minDurationForDBCalls = minDurationForDBCalls;
    }

    @XmlElement(name=AppExportS.HOTSPOTS_ENABLED)
    public boolean isHotSpotsEnabled() {
        return hotSpotsEnabled;
    }

    public void setHotSpotsEnabled(boolean hotSpotsEnabled) {
        this.hotSpotsEnabled = hotSpotsEnabled;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.CALL_GRAPH);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        bud.append(AppExportS.L2).append(AppExportS.SAMPLING_RATE).append(AppExportS.VE).append(samplingRate);
        bud.append(AppExportS.L2).append(AppExportS.RAW_SQL).append(AppExportS.VE).append(rawSQL);
        bud.append(AppExportS.L2).append(AppExportS.EXCLUDE_PACKAGES).append(AppExportS.VE).append(excludePackages);
        bud.append(AppExportS.L2).append(AppExportS.INCLUDE_PACKAGES).append(AppExportS.VE).append(includePackages);
        bud.append(AppExportS.L2).append(AppExportS.MIN_DURATION_FOR_DB_CALLS).append(AppExportS.VE).append(minDurationForDBCalls);
        bud.append(AppExportS.L2).append(AppExportS.HOTSPOTS_ENABLED).append(AppExportS.VE).append(hotSpotsEnabled);
        return bud.toString();
    }

    public String whatIsDifferent(ExCallGraph obj){
        if(this.equals(obj)) return AppExportS._;
        
        if(!agentType.equals(obj.getAgentType())) return AppExportS._;
        
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.CALL_GRAPH);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        
        if(samplingRate != obj.getSamplingRate()){    
            bud.append(AppExportS.L2).append(AppExportS.SAMPLING_RATE);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(samplingRate);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getSamplingRate());
        }
        
        if(rawSQL != obj.getRawSQL()){
            bud.append(AppExportS.L2).append(AppExportS.RAW_SQL);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(rawSQL);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getRawSQL());
            
        }
        
        if(!excludePackages.equals(obj.getExcludePackages())){
            String[] srcEx=excludePackages.split("\\|");
            String[] destEx=obj.getExcludePackages().split("\\|");
            
            bud.append(AppExportS.L2).append(AppExportS.EXCLUDE_PACKAGES);
            
            for(String val: srcEx){
                boolean fnd=false;
                for(String val1: destEx){
                    if(val.equals(val1))
                       fnd=true;
                }
                if(!fnd){
                    bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(AppExportS.VE).append(val);
                    
                }
            }
            
            for(String val: destEx){
                boolean fnd=false;
                for(String val1: srcEx){
                    if(val.equals(val1))
                    fnd=true;
                }
                if(!fnd){
                    bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(AppExportS.VE).append(val);
                    
                }
            }
            
            
        }
        
        if(!includePackages.equals(obj.getIncludePackages())){
            
            String[] srcEx=includePackages.split("\\|");
            String[] destEx=obj.getIncludePackages().split("\\|");
            
            bud.append(AppExportS.L2).append(AppExportS.INCLUDE_PACKAGES);
            
            for(String val: srcEx){
                boolean fnd=false;
                for(String val1: destEx){
                    fnd=true;
                }
                if(!fnd){
                    bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(val);
                    
                }
            }
            
            for(String val: destEx){
                boolean fnd=false;
                for(String val1: srcEx){
                    fnd=true;
                }
                if(!fnd){
                    bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(val);
                    
                }
            }
            
        }
        
        if(minDurationForDBCalls != obj.getMinDurationForDBCalls()){    
            bud.append(AppExportS.L2).append(AppExportS.MIN_DURATION_FOR_DB_CALLS);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(minDurationForDBCalls);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMinDurationForDBCalls());
        }
        
        if(hotSpotsEnabled != obj.isHotSpotsEnabled()){    
            bud.append(AppExportS.L2).append(AppExportS.HOTSPOTS_ENABLED);
            bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(hotSpotsEnabled);
            bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isHotSpotsEnabled());
        }
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.agentType != null ? this.agentType.hashCode() : 0);
        hash = 89 * hash + this.samplingRate;
        hash = 89 * hash + (this.rawSQL ? 1 : 0);
        hash = 89 * hash + (this.excludePackages != null ? this.excludePackages.hashCode() : 0);
        hash = 89 * hash + (this.includePackages != null ? this.includePackages.hashCode() : 0);
        hash = 89 * hash + this.minDurationForDBCalls;
        hash = 89 * hash + (this.hotSpotsEnabled ? 1 : 0);
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
        final ExCallGraph other = (ExCallGraph) obj;
        if ((this.agentType == null) ? (other.agentType != null) : !this.agentType.equals(other.agentType)) {
            return false;
        }
        if (this.samplingRate != other.samplingRate) {
            return false;
        }
        if (this.rawSQL != other.rawSQL) {
            return false;
        }
        if ((this.excludePackages == null) ? (other.excludePackages != null) : !this.excludePackages.equals(other.excludePackages)) {
            return false;
        }
        if ((this.includePackages == null) ? (other.includePackages != null) : !this.includePackages.equals(other.includePackages)) {
            return false;
        }
        if (this.minDurationForDBCalls != other.minDurationForDBCalls) {
            return false;
        }
        if (this.hotSpotsEnabled != other.hotSpotsEnabled) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
