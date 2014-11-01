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
 * <application-components>
<application-component>1stTier</application-component>
</application-components>
 */
public class ExHRAppComponents {
    private ArrayList<String> appComponent;
    
    public ExHRAppComponents(){}

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public ArrayList<String> getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(ArrayList<String> appComponent) {
        this.appComponent = appComponent;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud =new StringBuilder();
        for(String app:appComponent)bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(app);
        return bud.toString();
    }
}
