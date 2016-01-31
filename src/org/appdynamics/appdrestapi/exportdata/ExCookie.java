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
 * 
 * 
 */

public class ExCookie {
    private String matchType;
    private ExMatchClassName name;
    private int level=6;

    public ExCookie(){}

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
    
    
    public String whatIsDifferent(ExCookie obj){
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.COOKIE);
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
        level--;
        return bud.toString();
    } 
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.COOKIE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.I[level]).append(AppExportS.NAME);
        if(name != null) name.setLevel(level);
        bud.append(name);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (this.matchType != null ? this.matchType.hashCode() : 0);
        hash = 13 * hash + (this.name != null ? this.name.hashCode() : 0);
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
        final ExCookie other = (ExCookie) obj;
        if ((this.matchType == null) ? (other.matchType != null) : !this.matchType.equals(other.matchType)) {
            return false;
        }
        if (this.name != other.name && (this.name == null || !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
                                    <cookies>
                                        <cookie match-type="check-for-existence">
                                            <name filter-type="EQUALS" filter-value="nah"/>
                                        </cookie>
                                    </cookies>
 */