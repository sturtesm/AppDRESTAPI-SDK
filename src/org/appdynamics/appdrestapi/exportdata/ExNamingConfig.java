/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
                    <naming-config scheme="uri">
                        <name-values>
                            <name-value>
                                <name>segment-length</name>
                                <value>2</value>
                            </name-value>
                            <name-value>
                                <name>uri-length</name>
                                <value>first-n-segments</value>
                            </name-value>
                        </name-values>
                    </naming-config>
 * 
 */
@XmlSeeAlso({ExNameValues.class,ExNameValue.class})
public class ExNamingConfig {
    private String scheme;
    private ExNameValues nameValues;
    
    public ExNamingConfig(){}

    @XmlAttribute(name=AppExportS.SCHEME)
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @XmlElement(name=AppExportS.NAME_VALUES)
    public ExNameValues getNameValues() {
        return nameValues;
    }

    public void setNameValues(ExNameValues nameValues) {
        this.nameValues = nameValues;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.NAMING_CONFIG);
        bud.append(AppExportS.L3).append(AppExportS.SCHEME).append(AppExportS.VE).append(scheme);
        bud.append(nameValues.toString());
        return bud.toString();
    }
}
