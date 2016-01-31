/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExApplicationComponentNode.class)
public class ExApplicationComponentNodes {
    private ArrayList<ExApplicationComponentNode> appNodes=new ArrayList<ExApplicationComponentNode>();
    private int level=4;
    
    public ExApplicationComponentNodes(){}

    @XmlElement(name=AppExportS.APPLICATION_COMPONENT_NODE)
    public ArrayList<ExApplicationComponentNode> getAppNodes() {
        return appNodes;
    }

    public void setAppNodes(ArrayList<ExApplicationComponentNode> appNodes) {
        this.appNodes = appNodes;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String whatIsDifferent(ExApplicationComponentNodes obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_CONFIGURATIONS);
        level++;
        for(ExApplicationComponentNode val: appNodes){
            boolean fnd=false;
            val.setLevel(level);
            for(ExApplicationComponentNode val1: obj.getAppNodes()){
                if(val.getName().equals(val1.getName())){
                    fnd=true;
                    bud.append(val.whatIsDifferent(val1));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT_NODE);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(val.getName());
            }
        }
        
        for(ExApplicationComponentNode val: obj.getAppNodes()){
            boolean fnd=false;
            val.setLevel(level);
            for(ExApplicationComponentNode val1: appNodes){
                if(val.getName().equals(val1.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.AGENT_CONFIGURATION);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(val.getName());
                
            }
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT_NODES);
        level++;
        for(ExApplicationComponentNode node:appNodes){node.setLevel(level);bud.append(node);}
        
        level--;
        return bud.toString();
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.appNodes);
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
        final ExApplicationComponentNodes other = (ExApplicationComponentNodes) obj;
        
        if(appNodes.size() != other.getAppNodes().size()) return false;
        
        for(ExApplicationComponentNode val: appNodes){
            boolean fnd=false;
            val.setLevel(level);
            for(ExApplicationComponentNode val1: other.getAppNodes()){
                if(val.equals(val1)){
                    fnd=true;
                }
            }
            if(!fnd){
                return false;
            }
        }
        
        return true;
    }
    
    
    
    
}
