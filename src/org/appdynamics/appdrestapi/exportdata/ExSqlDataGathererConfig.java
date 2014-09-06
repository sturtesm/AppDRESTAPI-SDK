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
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.SQL_DATA_GATHERER_CONFIG);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.ATTACH_TO_NEW_BTS).append(AppExportS.VE).append(attachToNewBTS);
        bud.append(AppExportS.L2).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
        
        return bud.toString();
    }
    
    
}
