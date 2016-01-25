/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;


import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExMethodInvocationDataGathererConfig.class)
public class ExMatchCondition {
    private String matchType;
    private String matchPattern;
    private boolean inverse;
    private ExMethodInvocationDataGathererConfig methodD;
    private int level=6;

    public ExMatchCondition(){}
    
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

    @XmlElement(name=AppExportS.METHOD_INVOCATION_DATA_GATHERER_CONFIG)
    public ExMethodInvocationDataGathererConfig getMethodD() {
        return methodD;
    }

    public void setMethodD(ExMethodInvocationDataGathererConfig methodD) {
        this.methodD = methodD;
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
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_CONDITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
        bud.append(AppExportS.I[level]).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        
        methodD.setLevel(level);
        bud.append(methodD);
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExMatchCondition obj){
        
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_CONDITION);
        level++;

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
        
        bud.append(methodD.whatIsDifferent(obj.getMethodD()));
        level--;
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.matchType);
        hash = 31 * hash + Objects.hashCode(this.matchPattern);
        hash = 31 * hash + (this.inverse ? 1 : 0);
        hash = 31 * hash + Objects.hashCode(this.methodD);
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
        final ExMatchCondition other = (ExMatchCondition) obj;
        if (!Objects.equals(this.matchType, other.matchType)) {
            return false;
        }
        if (!Objects.equals(this.matchPattern, other.matchPattern)) {
            return false;
        }
        if (this.inverse != other.inverse) {
            return false;
        }
        if (!Objects.equals(this.methodD, other.methodD)) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
                <match-condition>
                    <match-type>EQUALS</match-type>
                    <match-pattern>com.stubhub.catalog.business.entity.Venue.class.getName()</match-pattern>
                    <inverse>false</inverse>
                    <method-invocation-data-gatherer-config>
                        <name/>
                        <position>1</position>
                        <gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
                        <transformer-type>GETTER_METHODS_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
                        <transformer-value>class|getName</transformer-value>
                    </method-invocation-data-gatherer-config>
                </match-condition>
*/