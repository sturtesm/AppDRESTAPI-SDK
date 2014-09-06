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
@XmlSeeAlso({ExBackendIdentityOption.class,ExNamingOptions.class,ExNamingActions.class,ExNameValue.class})
public class ExBackendIdentityOptions {
    private ArrayList<ExBackendIdentityOption> backendIdentityOption=new ArrayList<ExBackendIdentityOption>();
    
    public ExBackendIdentityOptions(){}

    @XmlElement(name=AppExportS.BACKEND_IDENTITY_OPTION)
    public ArrayList<ExBackendIdentityOption> getBackendIdentityOption() {
        return backendIdentityOption;
    }

    public void setBackendIdentityOption(ArrayList<ExBackendIdentityOption> backendIdentityOption) {
        this.backendIdentityOption = backendIdentityOption;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.BACKEND_IDENTITY_OPTIONS);
        for(ExBackendIdentityOption ops: backendIdentityOption) bud.append(ops.toString());
        return bud.toString();
    }
    
}
