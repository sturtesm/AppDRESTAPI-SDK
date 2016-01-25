/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso({ExBackendIdentityOption.class,ExNamingOptions.class,ExNamingActions.class,ExNameValue.class})
public class ExBackendIdentityOptions {
    private ArrayList<ExBackendIdentityOption> backendIdentityOption=new ArrayList<ExBackendIdentityOption>();
    private int level=7;
    
    public ExBackendIdentityOptions(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.BACKEND_IDENTITY_OPTION)
    public ArrayList<ExBackendIdentityOption> getBackendIdentityOption() {
        return backendIdentityOption;
    }

    public void setBackendIdentityOption(ArrayList<ExBackendIdentityOption> backendIdentityOption) {
        this.backendIdentityOption = backendIdentityOption;
    }
    
    public String whatIsDifferent(ExBackendIdentityOptions obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_IDENTITY_OPTIONS);
        level++;
        for(ExBackendIdentityOption value: backendIdentityOption){
            value.setLevel(level);
            boolean fnd=false;
             for(ExBackendIdentityOption _value: obj.getBackendIdentityOption()){
                 if(value.getName().equals(_value)){
                     fnd=true;
                     bud.append(value.whatIsDifferent(_value));
                 }
             }
             if(!fnd)bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
        }
        
        for(ExBackendIdentityOption value: obj.getBackendIdentityOption()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBackendIdentityOption _value: backendIdentityOption){
                if(value.getName().equals(_value.getName())) fnd=true;
            }
            if(!fnd)bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_IDENTITY_OPTIONS);
        level++;
        for(ExBackendIdentityOption ops: backendIdentityOption){ ops.setLevel(level);bud.append(ops);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.backendIdentityOption != null ? this.backendIdentityOption.hashCode() : 0);
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
        final ExBackendIdentityOptions other = (ExBackendIdentityOptions) obj;
        if (this.backendIdentityOption != other.backendIdentityOption && (this.backendIdentityOption == null || !this.backendIdentityOption.equals(other.backendIdentityOption))) {
            return false;
        }
        return true;
    }
    
    
    
}
