/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
                                    <properties>
                                        <property name="uri-suffix-scheme" value="custom-expression"/>
                                        <property name="suffix-key" value="${}"/>
                                    </properties>
 * 
 */
@XmlSeeAlso(ExNVProperty.class)
public class ExNVProperties {
    private ArrayList<ExNVProperty> properties=new ArrayList<ExNVProperty>();
    
    public ExNVProperties(){}

    @XmlElement(name=AppExportS.PROPERTY)
    public ArrayList<ExNVProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ExNVProperty> properties) {
        this.properties = properties;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PROPERTIES);
        for(ExNVProperty prop:properties)bud.append(prop);
        return bud.toString();
    }
}
