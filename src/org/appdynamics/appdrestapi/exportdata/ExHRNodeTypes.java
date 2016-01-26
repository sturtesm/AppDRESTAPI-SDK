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
/*
 * <node-types>
<node-type>APP_AGENT</node-type>
</node-types>
 * 
 * 
 */
public class ExHRNodeTypes {
    private ArrayList<String> nodeTypes=new ArrayList<String>();
    private int level=5;
    
    
    public ExHRNodeTypes(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.NODE_TYPE)
    public ArrayList<String> getNodeTypes() {
        return nodeTypes;
    }

    public void setNodeTypes(ArrayList<String> nodeTypes) {
        this.nodeTypes = nodeTypes;
    }
    
    public String whatIsDifferent(ExHRNodeTypes obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NODE_TYPES);
        level++;
        for(String value: nodeTypes){
            if(!obj.getNodeTypes().contains(value)){
                bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
                level--;
            }
        }
        
        for(String value: obj.getNodeTypes()){
            if(!nodeTypes.contains(value)){
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
        bud.append(AppExportS.I[level]).append(AppExportS.NODE_TYPES);
        level++;
        for(String node:nodeTypes)bud.append(AppExportS.I[level]).append(AppExportS.NODE_TYPE).append(AppExportS.VE).append(node);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (this.nodeTypes != null ? this.nodeTypes.hashCode() : 0);
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
        final ExHRNodeTypes other = (ExHRNodeTypes) obj;
        if (this.nodeTypes != other.nodeTypes && (this.nodeTypes == null || !this.nodeTypes.equals(other.nodeTypes))) {
            return false;
        }
        return true;
    }
    
    
}
