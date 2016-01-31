/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author gilbert.solorzano
 *
 */

public class ExHttpDataGathererConfig {
    private boolean attachToNewBts;
    private boolean gatherUrl;
    private boolean gatherSessionId;
    private boolean gatherUserPrincipal;
    private boolean enableForAnalytics;
    private boolean enableForAPM;
    private ExHTTPParameters parameters;
    private String name;
    private int level=3;
    
    public ExHttpDataGathererConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlAttribute(name=AppExportS.ATTACH_TO_NEW_BTS)
    public boolean isAttachToNewBts() {
        return attachToNewBts;
    }

    public void setAttachToNewBts(boolean attachToNewBts) {
        this.attachToNewBts = attachToNewBts;
    }

    @XmlElement(name=AppExportS.GATHER_URL)
    public boolean isGatherUrl() {
        return gatherUrl;
    }

    public void setGatherUrl(boolean gatherUrl) {
        this.gatherUrl = gatherUrl;
    }

    @XmlElement(name=AppExportS.GATHER_SESSION_ID)
    public boolean isGatherSessionId() {
        return gatherSessionId;
    }

    public void setGatherSessionId(boolean gatherSessionId) {
        this.gatherSessionId = gatherSessionId;
    }

    @XmlElement(name=AppExportS.GATHER_USER_PRINCIPAL)
    public boolean isGatherUserPrincipal() {
        return gatherUserPrincipal;
    }

    public void setGatherUserPrincipal(boolean gatherUserPrincipal) {
        this.gatherUserPrincipal = gatherUserPrincipal;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.ENABLE_FOR_ANALYTICS)
    public boolean isEnableForAnalytics() {
        return enableForAnalytics;
    }

    public void setEnableForAnalytics(boolean enableForAnalytics) {
        this.enableForAnalytics = enableForAnalytics;
    }

    @XmlElement(name=AppExportS.ENABLE_FOR_APM)
    public boolean isEnableForAPM() {
        return enableForAPM;
    }

    public void setEnableForAPM(boolean enableForAPM) {
        this.enableForAPM = enableForAPM;
    }

    @XmlElement(name=AppExportS.PARAMETERS)
    public ExHTTPParameters getParameters() {
        return parameters;
    }

    public void setParameters(ExHTTPParameters parameters) {
        this.parameters = parameters;
    }
    
    
    
    public String whatIsDifferent(ExHttpDataGathererConfig obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(AppExportS.I[level]).append(AppExportS.HTTP_DATA_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
            
        if(attachToNewBts != obj.isAttachToNewBts()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ATTACH_TO_NEW_BTS);
        level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(attachToNewBts);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAttachToNewBts());     
            level--;
        }
        
        if(gatherUrl != obj.isGatherUrl()){     
            bud.append(AppExportS.I[level]).append(AppExportS.GATHER_URL);
        level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(gatherUrl);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isGatherUrl());     
            level--;
        }
        if(gatherSessionId != obj.isGatherSessionId()){     
            bud.append(AppExportS.I[level]).append(AppExportS.GATHER_SESSION_ID);
        level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(gatherSessionId);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isGatherSessionId());     
            level--;
        }
        if(gatherUserPrincipal != obj.isGatherUserPrincipal()){     
            bud.append(AppExportS.I[level]).append(AppExportS.GATHER_USER_PRINCIPAL);
        level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(gatherUserPrincipal);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isGatherUserPrincipal());    
            level--;
        }
        
        /*
         * private boolean attachToNewBts;
    private boolean gatherUrl;
    private boolean gatherSessionId;
    private boolean gatherUserPrincipal;
         */
        level--;
        return bud.toString();
        
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.HTTP_DATA_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.ATTACH_TO_NEW_BTS).append(AppExportS.VE).append(attachToNewBts);
        bud.append(AppExportS.I[level]).append(AppExportS.GATHER_URL).append(AppExportS.VE).append(gatherUrl);
        bud.append(AppExportS.I[level]).append(AppExportS.GATHER_SESSION_ID).append(AppExportS.VE).append(gatherSessionId);
        bud.append(AppExportS.I[level]).append(AppExportS.GATHER_USER_PRINCIPAL).append(AppExportS.VE).append(gatherUserPrincipal);
        parameters.setLevel(level);
        bud.append(parameters);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.attachToNewBts ? 1 : 0);
        hash = 29 * hash + (this.gatherUrl ? 1 : 0);
        hash = 29 * hash + (this.gatherSessionId ? 1 : 0);
        hash = 29 * hash + (this.gatherUserPrincipal ? 1 : 0);
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final ExHttpDataGathererConfig other = (ExHttpDataGathererConfig) obj;
        if (this.attachToNewBts != other.attachToNewBts) {
            return false;
        }
        if (this.gatherUrl != other.gatherUrl) {
            return false;
        }
        if (this.gatherSessionId != other.gatherSessionId) {
            return false;
        }
        if (this.gatherUserPrincipal != other.gatherUserPrincipal) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}

/*
 * <http-data-gatherer-config attach-to-new-bts="true">
            <parameters/>
            <gather-url>true</gather-url>
            <gather-session-id>true</gather-session-id>
            <gather-user-principal>true</gather-user-principal>
            <name>Default HTTP Request Data Collector</name>
        </http-data-gatherer-config>


        <http-data-gatherer-config attach-to-new-bts="true"
            enabled-for-analytics="false" enabled-for-apm="true">
            <parameters>
                <parameter>
                    <name>q</name>
                    <display-name>SolrQuery</display-name>
                </parameter>
            </parameters>
            <gather-url>true</gather-url>
            <gather-session-id>true</gather-session-id>
            <gather-user-principal>true</gather-user-principal>
            <name>Default HTTP Request Data Collector</name>
        </http-data-gatherer-config>
 * 
 */