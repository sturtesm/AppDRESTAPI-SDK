/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
/**
 *
 * @author gilbert.solorzano
 */
public class ExHRBusinessTransaction {
    private String applicationComponent;
    private String value;
    
    public ExHRBusinessTransaction(){}

    @XmlAttribute(name=AppExportS.APPLICATION_COMPONENT)
    public String getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(String applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.BUSINESS_TRANSACTION);
        bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(applicationComponent);
        bud.append(AppExportS.L4).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        return bud.toString();
    }
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.XOpenAttr(AppExportS.BUSINESS_TRANSACTION));
        
        bud.append(AppExportS.XAttribute(AppExportS.APPLICATION_COMPONENT,applicationComponent)).append(AppExportS.XC);
        bud.append(value).append(AppExportS.XClose(AppExportS.BUSINESS_TRANSACTION));
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.applicationComponent != null ? this.applicationComponent.hashCode() : 0);
        hash = 67 * hash + (this.value != null ? this.value.hashCode() : 0);
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
        final ExHRBusinessTransaction other = (ExHRBusinessTransaction) obj;
        if ((this.applicationComponent == null) ? (other.applicationComponent != null) : !this.applicationComponent.equals(other.applicationComponent)) {
            return false;
        }
        if ((this.value == null) ? (other.value != null) : !this.value.equals(other.value)) {
            return false;
        }
        return true;
    }
    
    
}
