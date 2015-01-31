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
 * <node-meta-info-match-criteria>
<name-value>
<name>meta1</name>
<value>yup</value>
</name-value>
<name-value>
<name>meta2</name>
<value>yup1</value>
</name-value>
</node-meta-info-match-criteria> ExNameValue
 * 
 */
public class ExHRNameValueCriteria {
    private ArrayList<ExNameValue> nameValues=new ArrayList<ExNameValue>();
    
    public ExHRNameValueCriteria(){}

    @XmlElement(name=AppExportS.NAME_VALUE)
    public ArrayList<ExNameValue> getNameValues() {
        return nameValues;
    }

    public void setNameValues(ArrayList<ExNameValue> nameValues) {
        this.nameValues = nameValues;
    }
    
     public String whatIsDifferent(ExHRNameValueCriteria obj){
        if(this.equals(obj)) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.NODE_META_INFO_MATCH_CRITERIA);
        
        for(ExNameValue value:nameValues){
            boolean fnd=false;
            for(ExNameValue _value:obj.getNameValues()){
                if(value.getName().equals(_value.getName())){
                    bud.append(value.whatIsDifferent(_value));fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L4).append(AppExportS.NAME_VALUE);
                bud.append(AppExportS.L5).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            }
        }
        
        for(ExNameValue value:obj.getNameValues()){
            boolean fnd=false;
            for(ExNameValue _value:nameValues){
                if(value.getName().equals(_value.getName())){
                    bud.append(value.whatIsDifferent(_value));fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L4).append(AppExportS.NAME_VALUE);
                bud.append(AppExportS.L5).append(AppExportS.DEST).append(AppExportS.VE).append(value);
            }
        }
        
        
        
        return bud.toString();
     }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        for(ExNameValue val: nameValues)bud.append(val);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.nameValues != null ? this.nameValues.hashCode() : 0);
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
        final ExHRNameValueCriteria other = (ExHRNameValueCriteria) obj;
        if (this.nameValues != other.nameValues && (this.nameValues == null || !this.nameValues.equals(other.nameValues))) {
            return false;
        }
        return true;
    }
    
    
}
