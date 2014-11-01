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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        for(ExNameValue val: nameValues)bud.append(val);
        return bud.toString();
    }
}
