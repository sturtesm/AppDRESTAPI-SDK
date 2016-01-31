/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 * 
 * L2_1
 */

@XmlSeeAlso(ExHRAddTypes.class)
public class ExAffectedAddMatchCriteria {
    private String type;
    private ExHRAddTypes addTypes;
    private String matchType,matchPattern;
    private boolean inverse;
    private int level=5;
    
    public ExAffectedAddMatchCriteria(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.ADD_TYPES)
    public ExHRAddTypes getAddTypes() {
        return addTypes;
    }

    public void setAddTypes(ExHRAddTypes addTypes) {
        this.addTypes = addTypes;
    }

    @XmlElement(name=AppExportS.MATCH_TYPE)
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @XmlElement(name=AppExportS.MATCH_PATTERN)
    public String getMatchPattern() {
        return matchPattern;
    }

    public void setMatchPattern(String matchPattern) {
        this.matchPattern = matchPattern;
    }

    @XmlElement(name=AppExportS.INVERSE)
    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.AFFECTED_ADD_MATCH_CRITERIA);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(matchType != null){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.I[level]).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        }
        if(addTypes != null) {addTypes.setLevel(level);bud.append(addTypes);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final ExAffectedAddMatchCriteria other = (ExAffectedAddMatchCriteria) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.addTypes != other.addTypes && (this.addTypes == null || !this.addTypes.equals(other.addTypes))) {
            return false;
        }
        if ((this.matchType == null) ? (other.matchType != null) : !this.matchType.equals(other.matchType)) {
            return false;
        }
        if ((this.matchPattern == null) ? (other.matchPattern != null) : !this.matchPattern.equals(other.matchPattern)) {
            return false;
        }
        if (this.inverse != other.inverse) {
            return false;
        }
        return true;
    }
    
    
}


/*
 * <affected-entities-match-criteria>
    <affected-add-match-criteria>
    <type>ALL_ADDS</type>
    <add-types>
        <add-type>BASE_PAGE</add-type>
    </add-types>
    </affected-add-match-criteria>
</affected-entities-match-criteria>
 * 
 * 
 */