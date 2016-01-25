/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 * I[level]
 */
/*
 * 
                                    <parameters>
                                        <parameter match-type="compare-value">
                                            <name filter-type="EQUALS" filter-value="cook"/>
                                            <value filter-type="EQUALS" filter-value="foo"/>
                                        </parameter>
                                    </parameters>
 * 
 */
public class ExParameter {
    private String matchType;
    private ExMatchClassName name,value;
    private int level;
    
    public ExParameter(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlAttribute(name=AppExportS.MATCH_TYPE)
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @XmlElement(name=AppExportS.NAME)
    public ExMatchClassName getName() {
        return name;
    }

    public void setName(ExMatchClassName name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.VALUE)
    public ExMatchClassName getValue() {
        return value;
    }

    public void setValue(ExMatchClassName value) {
        this.value = value;
    }
    
    public String whatIsDifferent(ExParameter obj){
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.PARAMETER);
        level++;
        if(matchType != null){
                bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(matchType);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType());
                level--;
        }else{
            if(obj.getMatchType()!= null){
                bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType());
                level--;
            }
        }
        if(name != null) name.setLevel(level);
        bud.append(name.whatIsDifferent(obj.getName()));
        if(name != null) value.setLevel(level);
        bud.append(value.whatIsDifferent(obj.getValue()));
        level--;
        return bud.toString();
    } 
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PARAMETER);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.I[level]).append(AppExportS.NAME);
        if(name != null) name.setLevel(level);
        bud.append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.VALUE);
        if(value != null) value.setLevel(level);
        bud.append(value);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.matchType != null ? this.matchType.hashCode() : 0);
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 59 * hash + (this.value != null ? this.value.hashCode() : 0);
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
        final ExParameter other = (ExParameter) obj;
        if ((this.matchType == null) ? (other.matchType != null) : !this.matchType.equals(other.matchType)) {
            return false;
        }
        if (this.name != other.name && (this.name == null || !this.name.equals(other.name))) {
            return false;
        }
        if (this.value != other.value && (this.value == null || !this.value.equals(other.value))) {
            return false;
        }
        return true;
    }
    
    
}
