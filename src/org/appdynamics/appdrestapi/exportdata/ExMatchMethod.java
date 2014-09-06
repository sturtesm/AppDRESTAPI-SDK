/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 *                          <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
 */
@XmlSeeAlso(ExMatchClassName.class)
public class ExMatchMethod {
    private ExMatchClassName matchClassName;
    
    public ExMatchMethod(){}

    @XmlElement(name=AppExportS.NAME)
    public ExMatchClassName getMatchClassName() {
        return matchClassName;
    }

    public void setMatchClassName(ExMatchClassName matchClassName) {
        this.matchClassName = matchClassName;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L5).append(AppExportS.NAME);
        bud.append(matchClassName);
        return bud.toString();
    }
}
