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
 */
/*
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
    
    public String whatIsDifferent(ExProperty obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PROPERTY);
        
        if(!propertyDefinition.equals(obj.getPropertyDefinition())){
            bud.append(AppExportS.L3_1).append(AppExportS.PROPERTY_DEFINITION);
            bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(propertyDefinition);
            bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPropertyDefinition());
            
        }
        if(!stringValue.equals(obj.getStringValue())){
            bud.append(AppExportS.L3_1).append(AppExportS.STRING_VALUE);
            bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(stringValue);
            bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getStringValue());
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PROPERTY);
        bud.append(AppExportS.L3_1).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(propertyDefinition);
        bud.append(AppExportS.L3_1).append(AppExportS.STRING_VALUE).append(AppExportS.VE).append(stringValue);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.propertyDefinition != null ? this.propertyDefinition.hashCode() : 0);
        hash = 59 * hash + (this.stringValue != null ? this.stringValue.hashCode() : 0);
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
        final ExProperty other = (ExProperty) obj;
        if ((this.propertyDefinition == null) ? (other.propertyDefinition != null) : !this.propertyDefinition.equals(other.propertyDefinition)) {
            return false;
        }
        if ((this.stringValue == null) ? (other.stringValue != null) : !this.stringValue.equals(other.stringValue)) {
            return false;
        }
        return true;
    }
    
    
}
