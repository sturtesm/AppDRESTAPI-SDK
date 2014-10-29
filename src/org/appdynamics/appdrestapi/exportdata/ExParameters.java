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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PARAMETERS);
        for(ExParameter para:parameters) bud.append(para);
        return bud.toString();
    }
}
