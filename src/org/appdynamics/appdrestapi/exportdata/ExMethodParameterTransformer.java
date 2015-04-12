/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author gilbert.solorzano
 */
public class ExMethodParameterTransformer {
    private String name;
    private int position;
    private String gathererType;
    private String transformerType;
    
    public ExMethodParameterTransformer(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.POSITION)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @XmlElement(name=AppExportS.GATHERER_TYPE)
    public String getGathererType() {
        return gathererType;
    }

    public void setGathererType(String gathererType) {
        this.gathererType = gathererType;
    }

    @XmlElement(name=AppExportS.TRANSFORMER_TYPE)
    public String getTransformerType() {
        return transformerType;
    }

    public void setTransformerType(String transformerType) {
        this.transformerType = transformerType;
    }

    
    
    public String whatIsDifferent(ExMethodParameterTransformer obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.METHOD_PARAMETER_TRANSFORMER);
        if(name != null && !name.equals(obj.getName())){
            bud.append(AppExportS.L4_1).append(AppExportS.NAME);
            bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(name);
            bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getName()); 
        }
        
        if(position != obj.getPosition()){
            bud.append(AppExportS.L4_1).append(AppExportS.POSITION);
            bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(position);
            bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPosition()); 
            
        }
        
        if(!gathererType.equals(obj.getGathererType())){
            bud.append(AppExportS.L4_1).append(AppExportS.GATHERER_TYPE);
            bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(gathererType);
            bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getGathererType()); 
        }
        
        if(!transformerType.equals(obj.getTransformerType())){
            bud.append(AppExportS.L4_1).append(AppExportS.TRANSFORMER_TYPE);
            bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(transformerType);
            bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getTransformerType()); 
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.METHOD_PARAMETER_TRANSFORMER);
        bud.append(AppExportS.L4_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L4_1).append(AppExportS.POSITION).append(AppExportS.VE).append(position);
        bud.append(AppExportS.L4_1).append(AppExportS.GATHERER_TYPE).append(AppExportS.VE).append(gathererType);
        bud.append(AppExportS.L4_1).append(AppExportS.TRANSFORMER_TYPE).append(AppExportS.VE).append(transformerType);
        
        return bud.toString();
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 19 * hash + this.position;
        hash = 19 * hash + (this.gathererType != null ? this.gathererType.hashCode() : 0);
        hash = 19 * hash + (this.transformerType != null ? this.transformerType.hashCode() : 0);
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
        final ExMethodParameterTransformer other = (ExMethodParameterTransformer) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.position != other.position) {
            return false;
        }
        if ((this.gathererType == null) ? (other.gathererType != null) : !this.gathererType.equals(other.gathererType)) {
            return false;
        }
        if ((this.transformerType == null) ? (other.transformerType != null) : !this.transformerType.equals(other.transformerType)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
