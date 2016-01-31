/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;


/**
 *
 * @author gilbert.solorzano
 */

public class ExHRNodeComponents {
    private ArrayList<String> appComp=new ArrayList<String>();
    private int level=8;
    
    public ExHRNodeComponents(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public ArrayList<String> getAppComp() {
        return appComp;
    }

    public void setAppComp(ArrayList<String> appComp) {
        this.appComp = appComp;
    }
    
    public String whatIsDifferent(ExHRNodeComponents obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.COMPONENTS);
        level++;
        for(String value: appComp){
            if(!obj.getAppComp().contains(value)){
                bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
                level--;
            }
        }
        
        for(String value: obj.getAppComp()){
            if(!appComp.contains(value)){
                bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);
                level--;
            }
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.COMPONENTS);
        level++;
        for(String app:appComp)bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(app);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.appComp != null ? this.appComp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExHRNodeComponents other = (ExHRNodeComponents) obj;
        if (this.appComp != other.appComp && (this.appComp == null || !this.appComp.equals(other.appComp))) {
            return false;
        }
        return true;
    }
    
    
}

/*
 * 
 * <components>
<application-component>1stTier</application-component>
<application-component>2ndTier</application-component>
</components>
 * 
 * 
 */