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
 * <sla>
            <art>
                <critical enabled="true">30000</critical>
                <warning enabled="true">15000</warning>
            </art>
            <epm>
                <critical enabled="true">100</critical>
                <warning enabled="true">20</warning>
            </epm>
        </sla>
        * 
 */
@XmlSeeAlso({ExArt.class,ExEpm.class,ExWarning.class,ExCritical.class})
public class ExSla {
    private ExArt art;
    private ExEpm epm;
    
    public ExSla(){}

    @XmlElement(name=AppExportS.ART)
    public ExArt getArt() {
        return art;
    }

    public void setArt(ExArt art) {
        this.art = art;
    }

    @XmlElement(name=AppExportS.EPM)
    public ExEpm getEpm() {
        return epm;
    }

    public void setEpm(ExEpm epm) {
        this.epm = epm;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.SLA);
        bud.append(AppExportS.L3).append(AppExportS.ART);
        bud.append(art.toString());
        bud.append(AppExportS.L3).append(AppExportS.EPM);
        bud.append(epm.toString());
        return bud.toString();
    }
}
