/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 * 
 * <sql-data-gatherer-config attach-to-new-bts="true">
            <match-type>NOT_EMPTY</match-type>
            <match-pattern/>
            <inverse>false</inverse>
            <name>Default SQL Data Collector</name>
        </sql-data-gatherer-config>
 * 
 */
public class ExSqlDataGathererConfig {
    private boolean attachToNewBTS;
    private String matchPattern;
    private String matchType;
    private boolean inverse;
    private String name;
    
    public ExSqlDataGathererConfig(){}

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
    
     public String whatIsDifferent(ExSqlDataGathererConfig obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(AppExportS.L1_1).append(AppExportS.SQL_DATA_GATHERER_CONFIG);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
            
        if(attachToNewBTS != obj.isAttachToNewBTS()){     
            bud.append(AppExportS.L2).append(AppExportS.ATTACH_TO_NEW_BTS);
            bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(AppExportS.VE).append(attachToNewBTS);
            bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAttachToNewBTS());    
        }
        
        if(!matchPattern.equals(obj.getMatchPattern())){
            bud.append(AppExportS.L1_1).append(AppExportS.MATCH_PATTERN);
            bud.append(AppExportS.L1_1).append(AppExportS.SRC).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.L1_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchPattern());    
        }
        
        if(!matchType.equals(obj.getMatchType())){
            bud.append(AppExportS.L1_1).append(AppExportS.MATCH_TYPE);
            bud.append(AppExportS.L1_1).append(AppExportS.SRC).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.L1_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType());    
        }
        
        if(inverse != obj.isInverse()){     
            bud.append(AppExportS.L2).append(AppExportS.INVERSE);
            bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(AppExportS.VE).append(inverse);
            bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isInverse());    
        }
        
        return bud.toString();
     }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.SQL_DATA_GATHERER_CONFIG);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.ATTACH_TO_NEW_BTS).append(AppExportS.VE).append(attachToNewBTS);
        bud.append(AppExportS.L2).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.L2).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
        bud.append(AppExportS.L2).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        
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
