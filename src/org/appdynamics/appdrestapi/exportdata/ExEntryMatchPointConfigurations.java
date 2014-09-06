/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;


import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso({ExEntryMatchPointConfiguration.class,ExEEPointConfiguration.class,ExDiscoveryConfig.class,ExNamingConfig.class,ExNameValues.class,ExNameValue.class,ExExclude.class,ExServletRule.class,ExClassName.class,ExCustomMatchPointDefinitions.class,ExCustomMatchPointDefinition.class,ExMatchRule.class,ExPojoRule.class,ExMatchClass.class,ExSplitConfig.class,
    ExMatchMethod.class,ExMatchClassName.class})
public class ExEntryMatchPointConfigurations {
    private ArrayList<ExEntryMatchPointConfiguration> entryMatchPointConfiguration=new ArrayList<ExEntryMatchPointConfiguration>();
    
    public ExEntryMatchPointConfigurations(){}

    @XmlElement(name=AppExportS.ENTRY_MATCH_POINT_CONFIGURATION)
    public ArrayList<ExEntryMatchPointConfiguration> getEntryMatchPointConfiguration() {
        return entryMatchPointConfiguration;
    }

    public void setEntryMatchPointConfiguration(ArrayList<ExEntryMatchPointConfiguration> entryMatchPointConfiguration) {
        this.entryMatchPointConfiguration = entryMatchPointConfiguration;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATIONS);
        for(ExEntryMatchPointConfiguration emp : entryMatchPointConfiguration) bud.append(emp.toString());
        return bud.toString();
    }
    
}
