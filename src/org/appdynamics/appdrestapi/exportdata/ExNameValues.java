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
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.NAME_VALUES);
        for(ExNameValue nv:nameValues) bud.append(nv.toString());
        return bud.toString();
    }
    
}
