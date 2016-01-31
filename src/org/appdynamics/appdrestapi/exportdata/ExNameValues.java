/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */

@XmlSeeAlso(ExNameValue.class)
public class ExNameValues {
    private ArrayList<ExNameValue> nameValues=new ArrayList<ExNameValue>();
    private int level=8;
    
    public ExNameValues(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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
        
        bud.append(AppExportS.I[level]).append(AppExportS.NAME_VALUES);
        level++;
        for(ExNameValue value:nameValues){
            boolean fnd=false;
            for(ExNameValue _value:obj.getNameValues()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd){ value.setLevel(level);bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);}
        }
        
        for(ExNameValue value:obj.getNameValues()){
            boolean fnd=false;
            for(ExNameValue _value:nameValues){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd){ value.setLevel(level);bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);}
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NAME_VALUES);
        level++;
        for(ExNameValue nv:nameValues){nv.setLevel(level); bud.append(nv);}
        level--;
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
        for(ExNameValue value:nameValues){
            boolean fnd=false;
            for(ExNameValue _value:other.getNameValues()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value))fnd=true;
                }
            }
            
            if(!fnd){ return false;}
        }
        return true;
    }
    
    
    
}
