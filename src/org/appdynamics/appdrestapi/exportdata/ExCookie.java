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
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.COOKIE);
        bud.append(AppExportS.L4).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.L4).append(AppExportS.NAME);
        bud.append(name);
        return bud.toString();
    }
    
}
