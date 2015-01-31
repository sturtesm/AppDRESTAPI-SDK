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
 * NEEDS_WORK
 * 

 */
public class ExBackendDiscoveryConditions {
    private String name;
    
    
    
    public ExBackendDiscoveryConditions(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public String whatIsDifferent(ExBackendDiscoveryConditions obj){
        
        if(this.equals(obj)) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        

        return bud.toString();
    }
     
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final ExBackendDiscoveryConditions other = (ExBackendDiscoveryConditions) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
