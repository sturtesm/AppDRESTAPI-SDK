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
 * 
            <method-invocation-data-gatherer-config>
                <name>DataColl</name>
                <position>0</position>
                <gatherer-type>RETURN_VALUE_GATHERER_TYPE</gatherer-type>
                <transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
            </method-invocation-data-gatherer-config>
            * 
            * L2 (s)
 */
public class ExMethodInvocationDataGathererConfig {
    private String name;
    private int position;
    private String gathererType;
    private String transformerType;
    
    public ExMethodInvocationDataGathererConfig(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.POSITION)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @XmlElement(name=AppExportS.GATHERER_TYPE)
    public String getGathererType() {
        return gathererType;
    }

    public void setGathererType(String gathererType) {
        this.gathererType = gathererType;
    }

    @XmlElement(name=AppExportS.TRANSFORMER_TYPE)
    public String getTransformerType() {
        return transformerType;
    }

    public void setTransformerType(String transformerType) {
        this.transformerType = transformerType;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.METHOD_INVOCATION_DATA_GATHERER_CONFIG);
        bud.append(AppExportS.L2_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2_1).append(AppExportS.POSITION).append(AppExportS.VE).append(position);
        bud.append(AppExportS.L2_1).append(AppExportS.GATHERER_TYPE).append(AppExportS.VE).append(gathererType);
        bud.append(AppExportS.L2_1).append(AppExportS.TRANSFORMER_TYPE).append(AppExportS.VE).append(transformerType);
        return bud.toString();
    }
    
}
