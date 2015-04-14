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
 */
/*
 * <nodes>
<application-component-node>1stTierNode2</application-component-node>
<application-component-node>2ndTierNode2</application-component-node>
</nodes>
* 
 */
public class ExHRNodes {
    private ArrayList<String> nodes=new ArrayList<String>();
    
    public ExHRNodes(){}

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
        bud.append(AppExportS.L3_1).append(AppExportS.NODES);
        
        for(String value: nodes){
            if(!obj.getNodes().contains(value)){
                bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT);
                bud.append(AppExportS.L4_1).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            }
        }
        
        for(String value: obj.getNodes()){
            if(!nodes.contains(value)){
                bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT);
                bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(AppExportS.VE).append(value);
            }
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.NODES);
        for(String node:nodes)bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT_NODE).append(AppExportS.VE).append(node);
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
