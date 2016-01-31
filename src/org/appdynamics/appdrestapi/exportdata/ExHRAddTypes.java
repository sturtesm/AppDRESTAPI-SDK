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
 * 
 */

public class ExHRAddTypes {
    private ArrayList<String> addTypes;
    private int level=6;
    
    public ExHRAddTypes(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.ADD_TYPE)
    public ArrayList<String> getAddTypes() {
        return addTypes;
    }

    public void setAddTypes(ArrayList<String> addTypes) {
        this.addTypes = addTypes;
    }
    // NEEDS WORK
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ADD_TYPES);
        level++;
        for(String type:addTypes) bud.append(AppExportS.I[level]).append(AppExportS.ADD_TYPE).append(AppExportS.VE).append(type);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.addTypes != null ? this.addTypes.hashCode() : 0);
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
        final ExHRAddTypes other = (ExHRAddTypes) obj;
        if (this.addTypes != other.addTypes && (this.addTypes == null || !this.addTypes.equals(other.addTypes))) {
            return false;
        }
        return true;
    }
    
    
}

/*
 * <add-types>
        <add-type>BASE_PAGE</add-type>
    </add-types>
 * 
 */