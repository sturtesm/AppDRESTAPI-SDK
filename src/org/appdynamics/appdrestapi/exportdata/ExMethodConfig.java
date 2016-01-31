/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 */

public class ExMethodConfig {
    private String returnType;
    private String name;
    private int level=8;
    
    public ExMethodConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlAttribute(name=AppExportS.RETURN_TYPE)
    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String whatIsDifferent(ExMethodConfig obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.METHOD_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(returnType != null){
                bud.append(AppExportS.I[level]).append(AppExportS.RETURN_TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(returnType);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getReturnType());
                level--;
        }else{
            if(obj.getReturnType()!= null){
                bud.append(AppExportS.I[level]).append(AppExportS.RETURN_TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getReturnType());
                level--;
            }
        }
       
        level--;
        return bud.toString();
    } 
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METHOD_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.RETURN_TYPE).append(AppExportS.VE).append(returnType);
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.returnType != null ? this.returnType.hashCode() : 0);
        hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final ExMethodConfig other = (ExMethodConfig) obj;
        if ((this.returnType == null) ? (other.returnType != null) : !this.returnType.equals(other.returnType)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}

/*
                                        <method-config return-type="true">
                                            <name>mapName</name>
                                        </method-config>
 * 
 * 
 */