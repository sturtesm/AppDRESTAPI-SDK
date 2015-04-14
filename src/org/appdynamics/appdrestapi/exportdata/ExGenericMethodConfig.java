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
 */
/*
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
    
    public String whatIsDifferent(ExGenericMethodConfig obj){
        if(this.equals(obj) || !className.equals(obj.getClassName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3_1).append(AppExportS.METHOD_CONFIG);

        bud.append(AppExportS.L4).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(className); 
        bud.append(methodConfig.whatIsDifferent(obj.getMethodConfig()));
        
        return bud.toString();
    } 
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.GENERIC_METHOD_CONFIG);
        bud.append(AppExportS.L3_1).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(className);
        bud.append(methodConfig);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.className != null ? this.className.hashCode() : 0);
        hash = 47 * hash + (this.methodConfig != null ? this.methodConfig.hashCode() : 0);
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
        final ExGenericMethodConfig other = (ExGenericMethodConfig) obj;
        if ((this.className == null) ? (other.className != null) : !this.className.equals(other.className)) {
            return false;
        }
        if (this.methodConfig != other.methodConfig && (this.methodConfig == null || !this.methodConfig.equals(other.methodConfig))) {
            return false;
        }
        return true;
    }
    
    
}
