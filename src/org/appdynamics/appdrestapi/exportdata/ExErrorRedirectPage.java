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
/*
            <error-redirect-page disable="false">
                <name>Page1</name>
                <match-type>CONTAINS</match-type>
                <match-pattern>index1</match-pattern>
                <inverse>false</inverse>
            </error-redirect-page>
 * 
 */
public class ExErrorRedirectPage {
    private String name,matchType,matchPattern;
    private boolean inverse;
 
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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.ERROR_REDIRECT_PAGE);
        bud.append(AppExportS.L2_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2_1).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.L2_1).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
        bud.append(AppExportS.L2_1).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        return bud.toString();
    }
    
    public String whatIsDifferent(ExErrorRedirectPage obj){
        if(!name.equals(obj.getName())) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L2).append(AppExportS.ERROR_REDIRECT_PAGE);
        bud.append(AppExportS.L2_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!matchType.equals(obj.getMatchType())){
            bud.append(AppExportS.L2_1).append(AppExportS.MATCH_TYPE);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(matchType);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(obj.getMatchType());
        }
        
        if(!matchPattern.equals(obj.getMatchPattern())){
            bud.append(AppExportS.L2_1).append(AppExportS.MATCH_PATTERN);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(matchPattern);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(obj.getMatchPattern());
            
        }
        
        if(inverse != obj.isInverse()){
            bud.append(AppExportS.L2_1).append(AppExportS.INVERSE);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(inverse);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(obj.isInverse());
            
        }
        
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
