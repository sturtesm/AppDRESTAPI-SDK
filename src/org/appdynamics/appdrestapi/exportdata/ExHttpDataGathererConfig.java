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
}
