/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.exportdata.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExMatchRule.class)
public class CustomMatchPoint {
    private String name, businessTransactionName,entryPoint;
    private boolean background,enabled;
    private ExMatchRule matchRule;
    
    public CustomMatchPoint(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION_NAME)
    public String getBusinessTransactionName() {
        return businessTransactionName;
    }

    public void setBusinessTransactionName(String businessTransactionName) {
        this.businessTransactionName = businessTransactionName;
    }

    @XmlElement(name=s.ENTRY_POINT)
    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    @XmlElement(name=AppExportS.BACKGROUND)
    public boolean isBackground() {
        return background;
    }

    public void setBackground(boolean background) {
        this.background = background;
    }

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.MATCH_RULE)
    public ExMatchRule getMatchRule() {
        return matchRule;
    }

    public void setMatchRule(ExMatchRule matchRule) {
        this.matchRule = matchRule;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(s.CUSTOM_MATCH_POINT);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.BUSINESS_TRANSACTION_NAME).append(AppExportS.VE).append(businessTransactionName);
        bud.append(AppExportS.L2).append(s.ENTRY_POINT).append(AppExportS.VE).append(entryPoint);
        bud.append(AppExportS.L2).append(AppExportS.BACKGROUND).append(AppExportS.VE).append(background);
        bud.append(AppExportS.L2).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(matchRule);
        return bud.toString();
    }
}

/*
 * <custom-match-points controller-version="003-009-003-000">
    <custom-match-point>
        <name>Cron4J</name>
        <business-transaction-name>Cron4J</business-transaction-name>
        <entry-point>POJO</entry-point>
        <background>false</background>
        <enabled>false</enabled>
        <match-rule>
            <pojo-rule>
                <enabled>false</enabled>
                <priority>0</priority>
                <display-name>Cron4J</display-name>
                <background>true</background>
                <match-class type="inherits-from-class">
                    <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
                </match-class>
                <split-config type="4"/>
                <match-method>
                    <name filter-type="EQUALS" filter-value="execute"/>
                </match-method>
            </pojo-rule>
        </match-rule>
    </custom-match-point>
 */
