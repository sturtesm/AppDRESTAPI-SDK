/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */
public class ExBackendDiscoveryCondition {
    private String identiyName,matchType,matchPattern;
    private boolean inverse;
    private int level = 6;
    
    public ExBackendDiscoveryCondition(){}

    @XmlElement(name=AppExportS.IDENTITY_NAME)
    public String getIdentiyName() {
        return identiyName;
    }

    public void setIdentiyName(String identiyName) {
        this.identiyName = identiyName;
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
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONDITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.IDENTITY_NAME).append(AppExportS.VE).append(identiyName);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
        bud.append(AppExportS.I[level]).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExBackendDiscoveryCondition obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONDITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.IDENTITY_NAME).append(AppExportS.VE).append(identiyName);
        
        if(!matchType.equals(obj.getMatchType())){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType());   
            level--;
        }
        
        if(!matchPattern.equals(obj.getMatchPattern())){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchPattern());   
            level--;
        }
        
        if(inverse != obj.isInverse()){
            bud.append(AppExportS.I[level]).append(AppExportS.INVERSE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(inverse);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isInverse());   
            level--;
        }
        
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.identiyName);
        hash = 97 * hash + Objects.hashCode(this.matchType);
        hash = 97 * hash + Objects.hashCode(this.matchPattern);
        hash = 97 * hash + (this.inverse ? 1 : 0);
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
        final ExBackendDiscoveryCondition other = (ExBackendDiscoveryCondition) obj;
        if (!Objects.equals(this.identiyName, other.identiyName)) {
            return false;
        }
        if (!Objects.equals(this.matchType, other.matchType)) {
            return false;
        }
        if (!Objects.equals(this.matchPattern, other.matchPattern)) {
            return false;
        }
        if (this.inverse != other.inverse) {
            return false;
        }
        return true;
    }
    
    
    
}


/*
                                <backend-discovery-condition>
                                    <identity-name>Service</identity-name>
                                    <match-type>REGEX</match-type>
                                    <match-pattern>.*</match-pattern>
                                    <inverse>false</inverse>
                                </backend-discovery-condition>
*/