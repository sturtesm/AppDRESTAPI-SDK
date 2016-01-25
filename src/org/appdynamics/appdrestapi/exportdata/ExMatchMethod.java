/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */

@XmlSeeAlso(ExMatchClassName.class)
public class ExMatchMethod {
    private ExMatchClassName matchClassName;
    private int level=9;
    
    public ExMatchMethod(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
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
        
        bud.append(AppExportS.I[level]).append(AppExportS.NAME);
        level++;
        if(matchClassName != null) matchClassName.setLevel(level);
        bud.append(matchClassName.whatIsDifferent(obj.getMatchClassName()));
        level--;
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NAME);
        level++;
        if(matchClassName != null) matchClassName.setLevel(level);
        bud.append(matchClassName);
        level--;
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

/*
 *                          <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
 */