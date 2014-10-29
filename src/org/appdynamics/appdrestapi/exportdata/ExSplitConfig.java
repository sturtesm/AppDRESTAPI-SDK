/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
/**
 *
 * @author gilbert.solorzano
 * 
 * We will need to revisit because this is going to change.
 * 
 * <split-config type="4"/>
 */
public class ExSplitConfig {
    private String type;
    private String operation;
    
    public ExSplitConfig(){}

    @XmlAttribute(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute(name=AppExportS.OPERATION)
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        if(operation != null) bud.append(AppExportS.L3_1).append(AppExportS.OPERATION).append(AppExportS.VE).append(operation);
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        return bud.toString();
    }
    
}
