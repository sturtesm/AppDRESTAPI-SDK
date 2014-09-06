/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;


import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 * 
 * <property>
                    <property-definition>disable-exit-call-metrics-for</property-definition>
                    <string-value/>
                </property>
 */
public class ExProperty {
    private String propertyDefinition;
    private String stringValue;
    
    public ExProperty(){}

    @XmlElement(name=AppExportS.PROPERTY_DEFINITION)
    public String getPropertyDefinition() {
        return propertyDefinition;
    }

    public void setPropertyDefinition(String propertyDefinition) {
        this.propertyDefinition = propertyDefinition;
    }

    @XmlElement(name=AppExportS.STRING_VALUE)
    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PROPERTY);
        bud.append(AppExportS.L3_1).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(propertyDefinition);
        bud.append(AppExportS.L3_1).append(AppExportS.STRING_VALUE).append(AppExportS.VE).append(stringValue);
        return bud.toString();
    }
}
