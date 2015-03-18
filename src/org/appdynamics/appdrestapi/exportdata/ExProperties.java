/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 *             <properties>
                <property>
                    <property-definition>enable-json-bci-rules</property-definition>
                    <string-value>false</string-value>
                </property>
 * 
 */
@XmlSeeAlso(ExProperty.class)
public class ExProperties {
    private ArrayList<ExProperty> properties=new ArrayList<ExProperty>();
    
    public ExProperties(){}

    @XmlElement(name=AppExportS.PROPERTY)
    public ArrayList<ExProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ExProperty> properties) {
        this.properties = properties;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.PROPERTIES);
        for(ExProperty prop:properties) bud.append(prop.toString());
        return bud.toString();
    }
    
    public String whatIsDifferent(ExProperties obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.PROPERTIES);
        
        for(ExProperty prop:properties){
            boolean fnd=false;
            for(ExProperty prop1: obj.getProperties()){
                if(prop.getPropertyDefinition().equals(prop1.getPropertyDefinition())){
                    fnd=true;
                    if(!prop.getStringValue().equals(prop1.getStringValue())){  
                        bud.append(AppExportS.L3).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(prop.getPropertyDefinition());
                        bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(prop.getStringValue());
                        bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(prop1.getStringValue());
                    }
                }
            }
            
            if(!fnd){
                        bud.append(AppExportS.L3).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(prop.getPropertyDefinition());
                        bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(prop.getStringValue());
            }
            
        }
        
        for(ExProperty prop:obj.getProperties()){
            boolean fnd=false;
            for(ExProperty prop1: properties){
                if(prop.getPropertyDefinition().equals(prop1.getPropertyDefinition())){
                    fnd=true;
                }
            }
            
            if(!fnd){
                        bud.append(AppExportS.L3).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(prop.getPropertyDefinition());
                        bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(prop.getStringValue()); 
            }
        }
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.properties != null ? this.properties.hashCode() : 0);
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
        final ExProperties other = (ExProperties) obj;
        if (this.properties != other.properties && (this.properties == null || !this.properties.equals(other.properties))) {
            return false;
        }
        return true;
    }
    
    
}
