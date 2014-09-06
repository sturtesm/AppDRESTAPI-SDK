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
    
    public ExSplitConfig(){}

    @XmlAttribute(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L5).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        return bud.toString();
    }
    
}
