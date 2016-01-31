/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 * 
 * We will need to revisit because this is going to change.
 */

public class ExSplitConfig {
    private String type;
    private String operation;
    private int level=9;
    
    public ExSplitConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlAttribute(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute(name=AppExportS.OPERATION)
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public String whatIsDifferent(ExSplitConfig obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        if(operation != null){
                bud.append(AppExportS.I[level]).append(AppExportS.OPERATION);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(operation);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getOperation());
                level--;
        }else{
            if(obj.getOperation() != null){
                bud.append(AppExportS.I[level]).append(AppExportS.OPERATION);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getOperation());
                level--;
            }
        }
        
        if(type != null){
            if(!type.equals(obj.getType())){
                bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());
                level--;
            }
        }else{
            if(obj.getType()!=null){
                bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());
                level--;
            }
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        if(operation != null) bud.append(AppExportS.I[level]).append(AppExportS.OPERATION).append(AppExportS.VE).append(operation);
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 83 * hash + (this.operation != null ? this.operation.hashCode() : 0);
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
        final ExSplitConfig other = (ExSplitConfig) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.operation == null) ? (other.operation != null) : !this.operation.equals(other.operation)) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
 * <split-config type="4"/>
 */