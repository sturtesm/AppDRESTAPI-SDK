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
 */
/*
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
@XmlSeeAlso({ExArt.class,ExEpm.class})
public class ExSla {
    private ExArt art;
    private ExEpm epm;
    private int level=3;
    
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
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.SLA);
        level++;
        if(art != null) art.setLevel(level);
        if(art != null) epm.setLevel(level);
        bud.append(art);
        bud.append(epm);
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExSla obj){
        if(this.equals(obj)) return AppExportS._U;

        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.SLA);
        level++;
        
        if(art != null){ art.setLevel(level);bud.append(art.whatIsDifferent(obj.getArt()));}
        if(art != null) {epm.setLevel(level);bud.append(epm.whatIsDifferent(obj.getEpm()));}
        
        level--;
        return bud.toString();
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.art != null ? this.art.hashCode() : 0);
        hash = 11 * hash + (this.epm != null ? this.epm.hashCode() : 0);
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
        final ExSla other = (ExSla) obj;
        if (this.art != other.art && (this.art == null || !this.art.equals(other.art))) {
            return false;
        }
        if (this.epm != other.epm && (this.epm == null || !this.epm.equals(other.epm))) {
            return false;
        }
        return true;
    }
    
    
}
