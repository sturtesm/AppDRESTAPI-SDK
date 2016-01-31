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
 * 
 */

@XmlSeeAlso(ExNameValue.class)
public class ExNamingOptions {
    private ArrayList<ExNameValue> nameValue=new ArrayList<ExNameValue>();
    private int level=9;
    
    public ExNamingOptions(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    

    @XmlElement(name=AppExportS.NAME_VALUE)
    public ArrayList<ExNameValue> getNameValue() {
        return nameValue;
    }

    public void setNameValue(ArrayList<ExNameValue> nameValue) {
        this.nameValue = nameValue;
    }
    
    public String whatIsDifferent(ExNamingOptions obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.NAMING_OPTIONS);
        level++;
        for(ExNameValue value: nameValue){
            value.setLevel(level);
            boolean fnd=false;
            for(ExNameValue _value:obj.getNameValue()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd)bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
        }
        
        for(ExNameValue value: obj.getNameValue()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExNameValue _value:nameValue){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd)bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NAMING_OPTIONS);
        level++;
        for(ExNameValue nv: nameValue){nv.setLevel(level); bud.append(nv);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.nameValue != null ? this.nameValue.hashCode() : 0);
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
        final ExNamingOptions other = (ExNamingOptions) obj;
        
        
        for(ExNameValue value: nameValue){
            value.setLevel(level);
            boolean fnd=false;
            for(ExNameValue _value:other.getNameValue()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value))fnd=true;
                }
            }
            
            if(!fnd)return false;
        }
        
        return true;
    }
    
    
}

/*
 * 
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
 */