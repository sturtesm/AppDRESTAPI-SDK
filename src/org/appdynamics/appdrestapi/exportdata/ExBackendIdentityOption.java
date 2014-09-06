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
 * 
 * 
 * 
                        <backend-identity-option>
                            <name>Host</name>
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
                            <naming-actions/>
                            <enabled>true</enabled>
                        </backend-identity-option>
 * 
 */
@XmlSeeAlso({ExNamingOptions.class,ExNamingActions.class,ExNameValue.class})
public class ExBackendIdentityOption {
    private String name;
    private ExNamingOptions namingOptions;
    private ExNamingActions namingActions;
    private boolean enabled;
    
    public ExBackendIdentityOption(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.NAMING_OPTIONS)
    public ExNamingOptions getNamingOptions() {
        return namingOptions;
    }

    public void setNamingOptions(ExNamingOptions namingOptions) {
        this.namingOptions = namingOptions;
    }

    @XmlElement(name=AppExportS.NAMING_ACTIONS)
    public ExNamingActions getNamingActions() {
        return namingActions;
    }

    public void setNamingActions(ExNamingActions namingActions) {
        this.namingActions = namingActions;
    }

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.BACKEND_IDENTITY_OPTION);
        bud.append(AppExportS.L4).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        if(namingOptions != null) bud.append(namingOptions.toString());
        if(namingActions != null) bud.append(namingActions.toString());
        bud.append(AppExportS.L4).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        return bud.toString();
    }
    
}
