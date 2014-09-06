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
    private String rawSQL;
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
    public String getRawSQL() {
        return rawSQL;
    }

    public void setRawSQL(String rawSQL) {
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
        bud.append(AppExportS.L2).append(AppExportS.CALL_GRAPH);
        bud.append(AppExportS.L2_1).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        bud.append(AppExportS.L2_1).append(AppExportS.SAMPLING_RATE).append(AppExportS.VE).append(samplingRate);
        bud.append(AppExportS.L2_1).append(AppExportS.RAW_SQL).append(AppExportS.VE).append(rawSQL);
        bud.append(AppExportS.L2_1).append(AppExportS.EXCLUDE_PACKAGES).append(AppExportS.VE).append(excludePackages);
        bud.append(AppExportS.L2_1).append(AppExportS.INCLUDE_PACKAGES).append(AppExportS.VE).append(includePackages);
        bud.append(AppExportS.L2_1).append(AppExportS.HOTSPOTS_ENABLED).append(AppExportS.VE).append(hotSpotsEnabled);
        return bud.toString();
    }
    
}
