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
 * 
 */
/*
 * 
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
 */
@XmlSeeAlso(ExNameValue.class)
public class ExNamingOptions {
    private ArrayList<ExNameValue> nameValue=new ArrayList<ExNameValue>();

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
        
        bud.append(AppExportS.L4).append(AppExportS.NAMING_OPTIONS);
        for(ExNameValue value: nameValue){
            boolean fnd=false;
            for(ExNameValue _value:obj.getNameValue()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd)bud.append(AppExportS.L4_1).append(AppExportS.SRC).append(value);
        }
        
        for(ExNameValue value: obj.getNameValue()){
            boolean fnd=false;
            for(ExNameValue _value:nameValue){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd)bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(value);
        }

        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.NAMING_OPTIONS);
        for(ExNameValue nv: nameValue) bud.append(nv.toString());
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
        if (this.nameValue != other.nameValue && (this.nameValue == null || !this.nameValue.equals(other.nameValue))) {
            return false;
        }
        return true;
    }
    
    
}
