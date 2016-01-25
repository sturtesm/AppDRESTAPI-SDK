/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 *
 */
/*
                    <naming-config scheme="uri">
                        <name-values>
                            <name-value>
                                <name>segment-length</name>
                                <value>2</value>
                            </name-value>
                            <name-value>
                                <name>uri-length</name>
                                <value>first-n-segments</value>
                            </name-value>
                        </name-values>
                    </naming-config>
 * 
 */
@XmlSeeAlso(ExNameValues.class)
public class ExNamingConfig {
    private String scheme;
    private ExNameValues nameValues;
    private int level=8;
    
    public ExNamingConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlAttribute(name=AppExportS.SCHEME)
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @XmlElement(name=AppExportS.NAME_VALUES)
    public ExNameValues getNameValues() {
        return nameValues;
    }

    public void setNameValues(ExNameValues nameValues) {
        this.nameValues = nameValues;
    }
    
    public String whatIsDifferent(ExNamingConfig obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NAMING_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.SCHEME).append(AppExportS.VE).append(scheme);
        nameValues.setLevel(level);
        bud.append(nameValues.whatIsDifferent(obj.getNameValues()));
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.NAMING_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.SCHEME).append(AppExportS.VE).append(scheme);
        nameValues.setLevel(level);
        bud.append(nameValues);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.scheme != null ? this.scheme.hashCode() : 0);
        hash = 29 * hash + (this.nameValues != null ? this.nameValues.hashCode() : 0);
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
        final ExNamingConfig other = (ExNamingConfig) obj;
        if ((this.scheme == null) ? (other.scheme != null) : !this.scheme.equals(other.scheme)) {
            return false;
        }
        if (this.nameValues != other.nameValues && (this.nameValues == null || !this.nameValues.equals(other.nameValues))) {
            return false;
        }
        return true;
    }
    
    
}
