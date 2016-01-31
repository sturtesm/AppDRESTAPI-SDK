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

public class ExHRNodes {
    private ArrayList<String> nodes=new ArrayList<String>();
    private int level=8;
    
    
    public ExHRNodes(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT_NODE)
    public ArrayList<String> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<String> nodes) {
        this.nodes = nodes;
    }
    
    public String whatIsDifferent(ExHRNodes obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NODES);
        level++;
        for(String value: nodes){
            if(!obj.getNodes().contains(value)){
                bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
                level--;
            }
        }
        
        for(String value: obj.getNodes()){
            if(!nodes.contains(value)){
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
        bud.append(AppExportS.I[level]).append(AppExportS.NODES);
        level++;
        for(String node:nodes)bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT_NODE).append(AppExportS.VE).append(node);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.nodes != null ? this.nodes.hashCode() : 0);
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
        final ExHRNodes other = (ExHRNodes) obj;
        if (this.nodes != other.nodes && (this.nodes == null || !this.nodes.equals(other.nodes))) {
            return false;
        }
        return true;
    }
    
    
}

/*
 * <nodes>
<application-component-node>1stTierNode2</application-component-node>
<application-component-node>2ndTierNode2</application-component-node>
</nodes>
* 
 */