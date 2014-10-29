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
    private int level=0;
    
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
    
    @XmlTransient
    public String getIndent(){
        if(level == 1) return AppExportS.L2;
        if(level == 2) return AppExportS.L2_1;
        return AppExportS.L1_1;
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
        art.setLevel(level);
        epm.setLevel(level);
        
        bud.append(getIndent()).append(AppExportS.SLA);
        level++;
        bud.append(getIndent()).append(AppExportS.ART);
        bud.append(art.toString());
        bud.append(getIndent()).append(AppExportS.EPM);
        bud.append(epm.toString());
        return bud.toString();
    }
}
