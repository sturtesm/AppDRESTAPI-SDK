/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 *                          <match-class type="inherits-from-class">
                                <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
                            </match-class>5
                            * 5
 */
@XmlSeeAlso(ExMatchClassName.class)
public class ExMatchClass {
    private String type;
    private ExMatchClassName matchClassName;
    
    public ExMatchClass(){}

    @XmlAttribute(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
        bud.append(AppExportS.L6).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(matchClassName.toString());
        return bud.toString();
    }
}
