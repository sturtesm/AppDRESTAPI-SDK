/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;


/**
 *
 * @author gilbert.solorzano
 * 
                                        <method-config return-type="true">
                                            <name>mapName</name>
                                        </method-config>
 * 
 * 
 */
public class ExMethodConfig {
    private String returnType;
    private String name;
    
    public ExMethodConfig(){}

    @XmlAttribute(name=AppExportS.RETURN_TYPE)
    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.METHOD_CONFIG);
        bud.append(AppExportS.L4).append(AppExportS.RETURN_TYPE).append(AppExportS.VE).append(returnType);
        bud.append(AppExportS.L4).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        return bud.toString();
    }
    
}
