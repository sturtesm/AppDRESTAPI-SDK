/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
/**
 *
 * @author gilbert.solorzano
                                    <parameters>
 */
@XmlSeeAlso(ExParameter.class)
public class ExParameters {
    private ArrayList<ExParameter> parameters = new ArrayList<ExParameter>();
    
    public ExParameters(){}

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
        
        bud.append(AppExportS.L3).append(AppExportS.COOKIES);
        
        for(ExParameter value:parameters){
            boolean fnd=false;
            for(ExParameter _value:obj.getParameters()){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(value);
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
                bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(value);
            }
        }
    
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PARAMETERS);
        for(ExParameter para:parameters) bud.append(para);
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
        if (this.parameters != other.parameters && (this.parameters == null || !this.parameters.equals(other.parameters))) {
            return false;
        }
        return true;
    }
    
    
}
