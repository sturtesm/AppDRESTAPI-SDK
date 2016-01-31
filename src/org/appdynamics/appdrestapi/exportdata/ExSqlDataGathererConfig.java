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
 */

public class ExSqlDataGathererConfig {
    private boolean attachToNewBTS;
    private String matchPattern;
    private String matchType;
    private boolean inverse;
    private boolean enableForAnalytics;
    private boolean enableForAPM;
    private String name;
    private int level=3;
    
    public ExSqlDataGathererConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlAttribute(name=AppExportS.ATTACH_TO_NEW_BTS)
    public boolean isAttachToNewBTS() {
        return attachToNewBTS;
    }

    public void setAttachToNewBTS(boolean attachToNewBTS) {
        this.attachToNewBTS = attachToNewBTS;
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

    @XmlElement(name=AppExportS.ENABLE_FOR_ANALYTICS)
    public boolean isEnableForAnalytics() {
        return enableForAnalytics;
    }

    public void setEnableForAnalytics(boolean enableForAnalytics) {
        this.enableForAnalytics = enableForAnalytics;
    }

    @XmlElement(name=AppExportS.ENABLE_FOR_APM)
    public boolean isEnableForAPM() {
        return enableForAPM;
    }

    public void setEnableForAPM(boolean enableForAPM) {
        this.enableForAPM = enableForAPM;
    }
    
    
    
     public String whatIsDifferent(ExSqlDataGathererConfig obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(AppExportS.I[level]).append(AppExportS.SQL_DATA_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
            
        if(attachToNewBTS != obj.isAttachToNewBTS()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ATTACH_TO_NEW_BTS);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(attachToNewBTS);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAttachToNewBTS());    
            level--;
        }
        
        if(!matchPattern.equals(obj.getMatchPattern())){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchPattern());    
            level--;
        }
        
        if(!matchType.equals(obj.getMatchType())){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType());    
            level--;
        }
        
        if(inverse != obj.isInverse()){     
            bud.append(AppExportS.I[level]).append(AppExportS.INVERSE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(inverse);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isInverse());    
            level--;
        }
        
        if(enableForAPM != obj.isEnableForAPM()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_FOR_APM);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enableForAPM);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnableForAPM());    
            level--;
        }
        
        if(enableForAnalytics != obj.isEnableForAnalytics()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_FOR_ANALYTICS);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enableForAnalytics);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnableForAnalytics());    
            level--;
        }
        
        level--;
        return bud.toString();
     }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.SQL_DATA_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.ATTACH_TO_NEW_BTS).append(AppExportS.VE).append(attachToNewBTS);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
        bud.append(AppExportS.I[level]).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_FOR_APM).append(AppExportS.VE).append(enableForAPM);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLE_FOR_ANALYTICS).append(AppExportS.VE).append(enableForAnalytics);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.attachToNewBTS ? 1 : 0);
        hash = 97 * hash + (this.matchPattern != null ? this.matchPattern.hashCode() : 0);
        hash = 97 * hash + (this.matchType != null ? this.matchType.hashCode() : 0);
        hash = 97 * hash + (this.inverse ? 1 : 0);
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final ExSqlDataGathererConfig other = (ExSqlDataGathererConfig) obj;
        if (this.attachToNewBTS != other.attachToNewBTS) {
            return false;
        }
        if ((this.matchPattern == null) ? (other.matchPattern != null) : !this.matchPattern.equals(other.matchPattern)) {
            return false;
        }
        if ((this.matchType == null) ? (other.matchType != null) : !this.matchType.equals(other.matchType)) {
            return false;
        }
        if (this.inverse != other.inverse) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

/*
 * <sql-data-gatherer-config attach-to-new-bts="true">
            <match-type>NOT_EMPTY</match-type>
            <match-pattern/>
            <inverse>false</inverse>
            <name>Default SQL Data Collector</name>
        </sql-data-gatherer-config>
 * 
 */