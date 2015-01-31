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
 * 
                                    <cookies>
                                        <cookie match-type="check-for-existence">
                                            <name filter-type="EQUALS" filter-value="nah"/>
                                        </cookie>
                                    </cookies>
 */
public class ExCookie {
    private String matchType;
    private ExMatchClassName name;

    public ExCookie(){}
    
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
        if(this.equals(obj) ) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3_1).append(AppExportS.COOKIE);

        if(matchType != null){
                bud.append(AppExportS.L4).append(AppExportS.MATCH_TYPE);
                bud.append(AppExportS.L4_1).append(AppExportS.SRC).append(AppExportS.VE).append(matchType);
                bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType());
        }else{
            if(obj.getMatchType()!= null){
                bud.append(AppExportS.L4).append(AppExportS.MATCH_TYPE);
                bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType());
            }
        }
       
        bud.append(name.whatIsDifferent(obj.getName()));
        
        return bud.toString();
    } 
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.COOKIE);
        bud.append(AppExportS.L4).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.L4).append(AppExportS.NAME);
        bud.append(name);
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
