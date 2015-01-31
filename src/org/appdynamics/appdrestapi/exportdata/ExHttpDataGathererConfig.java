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
 * <http-data-gatherer-config attach-to-new-bts="true">
            <parameters/>
            <gather-url>true</gather-url>
            <gather-session-id>true</gather-session-id>
            <gather-user-principal>true</gather-user-principal>
            <name>Default HTTP Request Data Collector</name>
        </http-data-gatherer-config>
 * 
 */
public class ExHttpDataGathererConfig {
    private boolean attachToNewBts;
    private boolean gatherUrl;
    private boolean gatherSessionId;
    private boolean gatherUserPrincipal;
    private String name;
    
    public ExHttpDataGathererConfig(){}

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
    
    public String whatIsDifferent(ExHttpDataGathererConfig obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(AppExportS.L1_1).append(AppExportS.HTTP_DATA_GATHERER_CONFIG);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
            
        if(attachToNewBts != obj.isAttachToNewBts()){     
            bud.append(AppExportS.L2).append(AppExportS.ATTACH_TO_NEW_BTS);
            bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(AppExportS.VE).append(attachToNewBts);
            bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAttachToNewBts());    
        }
        
        if(gatherUrl != obj.isGatherUrl()){     
            bud.append(AppExportS.L2).append(AppExportS.GATHER_URL);
            bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(AppExportS.VE).append(gatherUrl);
            bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isGatherUrl());    
        }
        if(gatherSessionId != obj.isGatherSessionId()){     
            bud.append(AppExportS.L2).append(AppExportS.GATHER_SESSION_ID);
            bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(AppExportS.VE).append(gatherSessionId);
            bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isGatherSessionId());    
        }
        if(gatherUserPrincipal != obj.isGatherUserPrincipal()){     
            bud.append(AppExportS.L2).append(AppExportS.GATHER_USER_PRINCIPAL);
            bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(AppExportS.VE).append(gatherUserPrincipal);
            bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isGatherUserPrincipal());    
        }
        
        /*
         * private boolean attachToNewBts;
    private boolean gatherUrl;
    private boolean gatherSessionId;
    private boolean gatherUserPrincipal;
         */
        
        return bud.toString();
        
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.HTTP_DATA_GATHERER_CONFIG);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.ATTACH_TO_NEW_BTS).append(AppExportS.VE).append(attachToNewBts);
        bud.append(AppExportS.L2).append(AppExportS.GATHER_URL).append(AppExportS.VE).append(gatherUrl);
        bud.append(AppExportS.L2).append(AppExportS.GATHER_SESSION_ID).append(AppExportS.VE).append(gatherSessionId);
        bud.append(AppExportS.L2).append(AppExportS.GATHER_USER_PRINCIPAL).append(AppExportS.VE).append(gatherUserPrincipal);
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
