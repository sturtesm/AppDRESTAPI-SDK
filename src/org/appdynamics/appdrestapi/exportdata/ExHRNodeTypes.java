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
 * <node-types>
<node-type>APP_AGENT</node-type>
</node-types>
 * 
 * 
 */
public class ExHRNodeTypes {
    private ArrayList<String> nodeTypes=new ArrayList<String>();
    
    public ExHRNodeTypes(){}

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
        bud.append(AppExportS.L3_1).append(AppExportS.NODES);
        
        for(String value: nodeTypes){
            if(!obj.getNodeTypes().contains(value)){
                bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT);
                bud.append(AppExportS.L4_1).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            }
        }
        
        for(String value: obj.getNodeTypes()){
            if(!nodeTypes.contains(value)){
                bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT);
                bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(AppExportS.VE).append(value);
            }
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.NODE_TYPES);
        for(String node:nodeTypes)bud.append(AppExportS.L4_1).append(AppExportS.NODE_TYPE).append(AppExportS.VE).append(node);
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
