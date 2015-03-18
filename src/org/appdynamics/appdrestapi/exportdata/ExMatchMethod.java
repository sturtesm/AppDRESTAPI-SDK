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
    
    public String whatIsDifferent(ExMatchMethod obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.NAME);
        bud.append(matchClassName.whatIsDifferent(obj.getMatchClassName()));
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.NAME);
        bud.append(matchClassName);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.matchClassName != null ? this.matchClassName.hashCode() : 0);
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
        final ExMatchMethod other = (ExMatchMethod) obj;
        if (this.matchClassName != other.matchClassName && (this.matchClassName == null || !this.matchClassName.equals(other.matchClassName))) {
            return false;
        }
        return true;
    }
    
    
}
