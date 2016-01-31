/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExHTTPParameter.class)
public class ExHTTPParameters {
    private ArrayList<ExHTTPParameter> parameters = new ArrayList<ExHTTPParameter>();
    private int level=4;
    
    public ExHTTPParameters(){}

    @XmlElement(name=AppExportS.PARAMETER)
    public ArrayList<ExHTTPParameter> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<ExHTTPParameter> parameters) {
        this.parameters = parameters;
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
        bud.append(AppExportS.I[level]).append(AppExportS.PARAMETERS);
        level++;
        for(ExHTTPParameter parm:parameters){ parm.setLevel(level); bud.append(parm);}
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExHTTPParameters obj){
        if( this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.PARAMETERS);
        level++;
        for(ExHTTPParameter value:parameters){
            boolean fnd=false;
            for(ExHTTPParameter _value:obj.getParameters()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                value.setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExHTTPParameter value:obj.getParameters()){
            boolean fnd=false;
            for(ExHTTPParameter _value:parameters){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                value.setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.parameters);
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
        final ExHTTPParameters other = (ExHTTPParameters) obj;
        for(ExHTTPParameter value:parameters){
            boolean fnd=false;
            for(ExHTTPParameter _value:other.getParameters()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value)) fnd=true;
                }
            }
            if(!fnd){
                return false;
            }
        }
        
        return true;
    }
    
    
    
    
}
