/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
                                    <generic-method-config>
                                        <class-name>org.json.JSONObject</class-name>
                                        <method-config return-type="true">
                                            <name>mapName</name>
                                        </method-config>
                                    </generic-method-config>
 * 
 */
@XmlSeeAlso(ExMethodConfig.class)
public class ExGenericMethodConfig {
    private String className;
    private ExMethodConfig methodConfig;
    
    public ExGenericMethodConfig(){}

    @XmlElement(name=AppExportS.CLASS_NAME)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @XmlElement(name=AppExportS.METHOD_CONFIG)
    public ExMethodConfig getMethodConfig() {
        return methodConfig;
    }

    public void setMethodConfig(ExMethodConfig methodConfig) {
        this.methodConfig = methodConfig;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.GENERIC_METHOD_CONFIG);
        bud.append(AppExportS.L3_1).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(className);
        bud.append(methodConfig);
        return bud.toString();
    }
}
