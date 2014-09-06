/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
        <pojo-data-gatherer-config attach-to-new-bts="false">
            <name>DataCol1</name>
            <pojo-method-definition>
                <class-name>com.appdynamics.testappserver.spring.SpringBean3</class-name>
                <method-name>businessMethod</method-name>
                <match-type>MATCHES_CLASS</match-type>
                <method-parameter-types/>
            </pojo-method-definition>
            <method-invocation-data-gatherer-config>
                <name>DataColl</name>
                <position>0</position>
                <gatherer-type>RETURN_VALUE_GATHERER_TYPE</gatherer-type>
                <transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
            </method-invocation-data-gatherer-config>
            <name>DataCol1</name>
        </pojo-data-gatherer-config>
        * 
        * L1_1 (s)
 */
@XmlSeeAlso({ExPojoMethodDefinition.class,ExMethodInvocationDataGathererConfig.class})
public class ExPojoDataGathererConfig {
    private boolean attachToNewBTS;
    private String name;
    private ExPojoMethodDefinition pojoMethodDef;
    private ExMethodInvocationDataGathererConfig methodInvocation;
    
    public ExPojoDataGathererConfig(){}

    @XmlAttribute(name=AppExportS.ATTACH_TO_NEW_BTS)
    public boolean isAttachToNewBTS() {
        return attachToNewBTS;
    }

    public void setAttachToNewBTS(boolean attachToNewBTS) {
        this.attachToNewBTS = attachToNewBTS;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.POJO_METHOD_DEFINITION)
    public ExPojoMethodDefinition getPojoMethodDef() {
        return pojoMethodDef;
    }

    public void setPojoMethodDef(ExPojoMethodDefinition pojoMethodDef) {
        this.pojoMethodDef = pojoMethodDef;
    }

    @XmlElement(name=AppExportS.METHOD_INVOCATION_DATA_GATHERER_CONFIG)
    public ExMethodInvocationDataGathererConfig getMethodInvocation() {
        return methodInvocation;
    }

    public void setMethodInvocation(ExMethodInvocationDataGathererConfig methodInvocation) {
        this.methodInvocation = methodInvocation;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.POJO_DATA_GATHERER_CONFIG);
        bud.append(AppExportS.L2).append(AppExportS.ATTACH_TO_NEW_BTS).append(AppExportS.VE).append(attachToNewBTS);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        if(pojoMethodDef != null) bud.append(pojoMethodDef.toString());
        if(methodInvocation != null) bud.append(methodInvocation.toString());
        
        return bud.toString();
    }
            
}
