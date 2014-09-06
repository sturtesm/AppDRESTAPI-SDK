/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;


import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
            <custom-match-point-definitions>
                <custom-match-point-definition transaction-entry-point-type="POJO">
                    <name>Cron4J</name>
                    <custom-business-transaction-name>Cron4J</custom-business-transaction-name>
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
                </custom-match-point-definition>
                * 
                * 2
 * 
 */
@XmlSeeAlso({ExMatchRule.class,ExPojoRule.class,ExMatchClass.class,ExSplitConfig.class,ExMatchMethod.class,ExMatchClassName.class})
public class ExCustomMatchPointDefinition {
    private String name;
    private String transactionEntryPointType;
    private String customBusinessTransactionName;
    private boolean background;
    private boolean enabled;
    private ExMatchRule matchRule;
    
    public ExCustomMatchPointDefinition(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name=AppExportS.TRANSACTION_ENTRY_POINT_TYPE)
    public String getTransactionEntryPointType() {
        return transactionEntryPointType;
    }

    public void setTransactionEntryPointType(String transactionEntryPointType) {
        this.transactionEntryPointType = transactionEntryPointType;
    }

    @XmlElement(name=AppExportS.CUSTOM_BUSINESS_TRANSACTION_NAME)
    public String getCustomBusinessTransactionName() {
        return customBusinessTransactionName;
    }

    public void setCustomBusinessTransactionName(String customBusinessTransactionName) {
        this.customBusinessTransactionName = customBusinessTransactionName;
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
        bud.append(AppExportS.L2).append(AppExportS.CUSTOM_MATCH_POINT_DEFINITION);
        bud.append(AppExportS.L3).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L3).append(AppExportS.TRANSACTION_ENTRY_POINT_TYPE).append(AppExportS.VE).append(transactionEntryPointType);
        bud.append(AppExportS.L3).append(AppExportS.CUSTOM_BUSINESS_TRANSACTION_NAME).append(AppExportS.VE).append(customBusinessTransactionName);
        bud.append(AppExportS.L3).append(AppExportS.BACKGROUND).append(AppExportS.VE).append(background);
        bud.append(AppExportS.L3).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(matchRule);
        return bud.toString();
    }
}
