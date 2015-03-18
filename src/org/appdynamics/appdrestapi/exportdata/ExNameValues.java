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

@XmlSeeAlso(ExNameValue.class)
public class ExNameValues {
    private ArrayList<ExNameValue> nameValues=new ArrayList<ExNameValue>();
    
    public ExNameValues(){}

    @XmlElement(name=AppExportS.NAME_VALUE)
    public ArrayList<ExNameValue> getNameValues() {
        return nameValues;
    }

    public void setNameValues(ArrayList<ExNameValue> nameValues) {
        this.nameValues = nameValues;
    }
    
    public String whatIsDifferent(ExNameValues obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.NAME_VALUES);
        
        for(ExNameValue value:nameValues){
            boolean fnd=false;
            for(ExNameValue _value:obj.getNameValues()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd) bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(value);
        }
        
        for(ExNameValue value:obj.getNameValues()){
            boolean fnd=false;
            for(ExNameValue _value:nameValues){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(value);
        }
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.NAME_VALUES);
        for(ExNameValue nv:nameValues) bud.append(nv.toString());
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (this.nameValues != null ? this.nameValues.hashCode() : 0);
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
        final ExNameValues other = (ExNameValues) obj;
        if (this.nameValues != other.nameValues && (this.nameValues == null || !this.nameValues.equals(other.nameValues))) {
            return false;
        }
        return true;
    }
    
    
    
}
