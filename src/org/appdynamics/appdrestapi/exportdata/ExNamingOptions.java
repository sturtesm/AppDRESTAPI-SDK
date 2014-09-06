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
 * 
 * 
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
 */
@XmlSeeAlso(ExNameValue.class)
public class ExNamingOptions {
    private ArrayList<ExNameValue> nameValue=new ArrayList<ExNameValue>();

    @XmlElement(name=AppExportS.NAME_VALUE)
    public ArrayList<ExNameValue> getNameValue() {
        return nameValue;
    }

    public void setNameValue(ArrayList<ExNameValue> nameValue) {
        this.nameValue = nameValue;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.NAMING_OPTIONS);
        for(ExNameValue nv: nameValue) bud.append(nv.toString());
        return bud.toString();
    }
}
