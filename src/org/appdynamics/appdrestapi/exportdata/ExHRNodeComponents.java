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
 * <components>
<application-component>1stTier</application-component>
<application-component>2ndTier</application-component>
</components>
 * 
 * 
 */
public class ExHRNodeComponents {
    private ArrayList<String> appComp=new ArrayList<String>();
    
    public ExHRNodeComponents(){}

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public ArrayList<String> getAppComp() {
        return appComp;
    }

    public void setAppComp(ArrayList<String> appComp) {
        this.appComp = appComp;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.COMPONENTS);
        for(String app:appComp)bud.append(AppExportS.L4_1).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(app);
        return bud.toString();
    }
}
