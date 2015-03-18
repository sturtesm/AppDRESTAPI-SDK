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
    
    public String whatIsDifferent(ExEpm obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud=new StringBuilder();
        
        bud.append(critical.whatIsDifferent(obj.getCritical()));
        bud.append(warning.whatIsDifferent(obj.getWarning()));
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.critical != null ? this.critical.hashCode() : 0);
        hash = 97 * hash + (this.warning != null ? this.warning.hashCode() : 0);
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
        final ExEpm other = (ExEpm) obj;
        if (this.critical != other.critical && (this.critical == null || !this.critical.equals(other.critical))) {
            return false;
        }
        if (this.warning != other.warning && (this.warning == null || !this.warning.equals(other.warning))) {
            return false;
        }
        return true;
    }
    
    
}
