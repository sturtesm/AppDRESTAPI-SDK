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
    
}
