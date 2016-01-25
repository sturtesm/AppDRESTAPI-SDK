/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */
public class ExApplicationComponentNode {
    private String name, nodeUniqueLocalId,nodeType;
    private int level=4;
    
    public ExApplicationComponentNode(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.NODE_UNIQUE_LOCAL_ID)
    public String getNodeUniqueLocalId() {
        return nodeUniqueLocalId;
    }

    public void setNodeUniqueLocalId(String nodeUniqueLocalId) {
        this.nodeUniqueLocalId = nodeUniqueLocalId;
    }

    @XmlElement(name=AppExportS.NODE_TYPE)
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT_NODE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.NODE_TYPE).append(AppExportS.VE).append(nodeType);
        bud.append(AppExportS.I[level]).append(AppExportS.NODE_UNIQUE_LOCAL_ID).append(AppExportS.VE).append(nodeUniqueLocalId);
        level--;
        return bud.toString();
    }

    public String whatIsDifferent(ExApplicationComponentNode obj){
        if(this.equals(obj)) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT_NODE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        
        if(!name.equals(obj.getName())){
            bud.append(AppExportS.I[level]).append(AppExportS.NODE_TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(nodeType);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeType());
                level--;
        }
        
        if(!nodeUniqueLocalId.equals(obj.getNodeUniqueLocalId())){
            bud.append(AppExportS.I[level]).append(AppExportS.NODE_UNIQUE_LOCAL_ID);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(nodeUniqueLocalId);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNodeUniqueLocalId());
                level--;
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.nodeUniqueLocalId);
        hash = 41 * hash + Objects.hashCode(this.nodeType);
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
        final ExApplicationComponentNode other = (ExApplicationComponentNode) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nodeUniqueLocalId, other.nodeUniqueLocalId)) {
            return false;
        }
        if (!Objects.equals(this.nodeType, other.nodeType)) {
            return false;
        }
        return true;
    }
    
    
}

/*
                <application-component-node>
                    <name>srwp01byx003</name>
                    <node-unique-local-id>srwp01byx003</node-unique-local-id>
                    <node-type>Other</node-type>
                </application-component-node>
*/
