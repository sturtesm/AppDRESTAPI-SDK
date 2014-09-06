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
 */
@XmlSeeAlso({ExCustomMatchPointDefinition.class,ExMatchRule.class,ExPojoRule.class,ExMatchClass.class,ExSplitConfig.class,
    ExMatchMethod.class,ExMatchClassName.class})

public class ExCustomMatchPointDefinitions {
    private ArrayList<ExCustomMatchPointDefinition> customMatchPointDefinitions=new ArrayList<ExCustomMatchPointDefinition>();
    
    public ExCustomMatchPointDefinitions(){}

    @XmlElement(name=AppExportS.CUSTOM_MATCH_POINT_DEFINITION)
    public ArrayList<ExCustomMatchPointDefinition> getCustomMatchPointDefinitions() {
        return customMatchPointDefinitions;
    }

    public void setCustomMatchPointDefinitions(ArrayList<ExCustomMatchPointDefinition> customMatchPointDefinitions) {
        this.customMatchPointDefinitions = customMatchPointDefinitions;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.CUSTOM_MATCH_POINT_DEFINITIONS);
        for(ExCustomMatchPointDefinition cm:customMatchPointDefinitions) bud.append(cm.toString());
        return bud.toString();
    }
}
