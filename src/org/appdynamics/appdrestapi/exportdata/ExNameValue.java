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
 * 
 *                          <name-value>
                                <name>uri-length</name>
                                <value>first-n-segments</value>
                            </name-value>
 */
public class ExNameValue {
    private String name;
    private String value;
    
    public ExNameValue(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.VALUE)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String whatIsDifferent(ExNameValue obj){
        if(this.equals(obj)) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.NAME_VALUE);
        
        bud.append(AppExportS.L4_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(value);
        bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.NAME_VALUE);
        bud.append(AppExportS.L5).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L5).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        return bud.toString();
    }
}
