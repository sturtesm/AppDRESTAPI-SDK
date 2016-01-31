/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 * 
 */
/*
                                    <parameters>
 */
@XmlSeeAlso(ExParameter.class)
public class ExParameters {
    private ArrayList<ExParameter> parameters = new ArrayList<ExParameter>();
    private int level=5;
    
    public ExParameters(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.PARAMETER)
    public ArrayList<ExParameter> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<ExParameter> parameters) {
        this.parameters = parameters;
    }
    
    public String whatIsDifferent(ExParameters obj){
        if( this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.COOKIES);
        
        for(ExParameter value:parameters){
            boolean fnd=false;
            for(ExParameter _value:obj.getParameters()){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExParameter value:obj.getParameters()){
            boolean fnd=false;
            for(ExParameter _value:parameters){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
    
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.PARAMETERS);
        level++;
        for(ExParameter para:parameters){ para.setLevel(level);bud.append(para);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.parameters != null ? this.parameters.hashCode() : 0);
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
        final ExParameters other = (ExParameters) obj;
        
        if(parameters.size() != other.getParameters().size()) return false;
        
        for(ExParameter value:parameters){
            boolean fnd=false;
            for(ExParameter _value:other.getParameters()){
                if(value.getMatchType().equals(_value.getMatchType())){
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
