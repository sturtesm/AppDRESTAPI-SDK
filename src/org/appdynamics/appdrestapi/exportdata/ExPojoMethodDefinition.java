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
            <pojo-method-definition>
                <class-name>com.appdynamics.testappserver.spring.SpringBean3</class-name>
                <method-name>businessMethod</method-name>
                <match-type>MATCHES_CLASS</match-type>
                <method-parameter-types/>
            </pojo-method-definition>
            * L2 (s)
 */
public class ExPojoMethodDefinition {
    private String className;
    private String methodName;
    private String matchType;
    private Object methodParameterTypes;
    
    public ExPojoMethodDefinition(){}

    @XmlElement(name=AppExportS.CLASS_NAME)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @XmlElement(name=AppExportS.METHOD_NAME)
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @XmlElement(name=AppExportS.MATCH_TYPE)
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @XmlElement(name=AppExportS.METHOD_PARAMETER_TYPES)
    public Object getMethodParameterTypes() {
        return methodParameterTypes;
    }

    public void setMethodParameterTypes(Object methodParameterTypes) {
        this.methodParameterTypes = methodParameterTypes;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.POJO_METHOD_DEFINITION);
        bud.append(AppExportS.L2_1).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(className);
        bud.append(AppExportS.L2_1).append(AppExportS.METHOD_NAME).append(AppExportS.VE).append(methodName);
        bud.append(AppExportS.L2_1).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.L2_1).append(AppExportS.METHOD_PARAMETER_TYPES).append(AppExportS.VE).append(methodParameterTypes);
        return bud.toString();
    }
    
}
