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
 */
@XmlSeeAlso({ExWarning.class,ExCritical.class})
public class ExEpm {
    private ExCritical critical;
    private ExWarning warning;

    
    public ExEpm(){}

    @XmlElement(name=AppExportS.CRITICAL)
    public ExCritical getCritical() {
        return critical;
    }

    public void setCritical(ExCritical critical) {
        this.critical = critical;
    }

    @XmlElement(name=AppExportS.WARNING)
    public ExWarning getWarning() {
        return warning;
    }

    public void setWarning(ExWarning warning) {
        this.warning = warning;
    }
    
    public void setLevel(int val){
        critical.setLevel(val);
        warning.setLevel(val);
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(critical);
        bud.append(warning);
        return bud.toString();
    }
    
}
