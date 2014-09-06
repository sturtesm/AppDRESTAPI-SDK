/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;

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
}
