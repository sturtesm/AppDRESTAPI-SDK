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
 * L3_1
 * 
                                    <headers>
                                        <header match-type="compare-value">
                                            <name filter-type="EQUALS" filter-value="like"/>
                                            <value filter-type="EQUALS" filter-value="you"/>
                                        </header>
                                    </headers>
 */
public class ExHeader {
    private String matchType;
    private ExMatchClassName name,value;

    public ExHeader(){}
    
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

    @XmlElement(name=AppExportS.VALUE)
    public ExMatchClassName getValue() {
        return value;
    }

    public void setValue(ExMatchClassName value) {
        this.value = value;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.HEADER);
        bud.append(AppExportS.L4).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.L4).append(AppExportS.NAME);
        bud.append(name);
        bud.append(AppExportS.L4).append(AppExportS.VALUE);
        bud.append(value);
        return bud.toString();
    }
}
