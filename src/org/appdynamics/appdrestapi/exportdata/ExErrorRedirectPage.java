/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author gilbert.solorzano
 * 
 *
 */

public class ExErrorRedirectPage {
    private String name,matchType,matchPattern;
    private boolean inverse;
    private int level=4;
    public ExErrorRedirectPage(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        bud.append(AppExportS.I[level]).append(AppExportS.ERROR_REDIRECT_PAGE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
        bud.append(AppExportS.I[level]).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExErrorRedirectPage obj){
        if(!name.equals(obj.getName())) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.ERROR_REDIRECT_PAGE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!matchType.equals(obj.getMatchType())){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(matchType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(obj.getMatchType());
            level--;
        }
        
        if(!matchPattern.equals(obj.getMatchPattern())){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(matchPattern);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(obj.getMatchPattern());
            level--;
        }
        
        if(inverse != obj.isInverse()){
            bud.append(AppExportS.I[level]).append(AppExportS.INVERSE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(inverse);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(obj.isInverse());
            level--;
        }
        
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 89 * hash + (this.matchType != null ? this.matchType.hashCode() : 0);
        hash = 89 * hash + (this.matchPattern != null ? this.matchPattern.hashCode() : 0);
        hash = 89 * hash + (this.inverse ? 1 : 0);
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
        final ExErrorRedirectPage other = (ExErrorRedirectPage) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
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
            <error-redirect-page disable="false">
                <name>Page1</name>
                <match-type>CONTAINS</match-type>
                <match-pattern>index1</match-pattern>
                <inverse>false</inverse>
            </error-redirect-page>
 * 
 */