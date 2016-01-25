/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;


import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 */

@XmlSeeAlso(ExMatchRule.class)
public class ExCustomMatchPointDefinition {
    private String name;
    private String transactionEntryPointType;
    private String customBusinessTransactionName;
    private boolean background;
    private boolean enabled;
    private ExMatchRule matchRule;
    private int level=6;
    
    public ExCustomMatchPointDefinition(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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
    
    public String whatIsDifferent(ExCustomMatchPointDefinition obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_MATCH_POINT_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!transactionEntryPointType.equals(obj.getTransactionEntryPointType())){
            bud.append(AppExportS.I[level]).append(AppExportS.TRANSACTION_ENTRY_POINT_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(transactionEntryPointType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getTransactionEntryPointType()); 
            level--;
        }
        
        if(!customBusinessTransactionName.equals(obj.getCustomBusinessTransactionName())){
            bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_BUSINESS_TRANSACTION_NAME);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(customBusinessTransactionName);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getCustomBusinessTransactionName());
            level--;
        }
        
        if(background != obj.isBackground()){
            bud.append(AppExportS.I[level]).append(AppExportS.BACKGROUND);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(background);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isBackground());
            level--;
        }
        
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
            level--;
        }
        
        if(matchRule != null) matchRule.setLevel(level);
        bud.append(matchRule.whatIsDifferent(obj.getMatchRule()));
        level--;
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_MATCH_POINT_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.TRANSACTION_ENTRY_POINT_TYPE).append(AppExportS.VE).append(transactionEntryPointType);
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_BUSINESS_TRANSACTION_NAME).append(AppExportS.VE).append(customBusinessTransactionName);
        bud.append(AppExportS.I[level]).append(AppExportS.BACKGROUND).append(AppExportS.VE).append(background);
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        if(matchRule != null) matchRule.setLevel(level);
        bud.append(matchRule);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 23 * hash + (this.transactionEntryPointType != null ? this.transactionEntryPointType.hashCode() : 0);
        hash = 23 * hash + (this.customBusinessTransactionName != null ? this.customBusinessTransactionName.hashCode() : 0);
        hash = 23 * hash + (this.background ? 1 : 0);
        hash = 23 * hash + (this.enabled ? 1 : 0);
        hash = 23 * hash + (this.matchRule != null ? this.matchRule.hashCode() : 0);
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
        final ExCustomMatchPointDefinition other = (ExCustomMatchPointDefinition) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.transactionEntryPointType == null) ? (other.transactionEntryPointType != null) : !this.transactionEntryPointType.equals(other.transactionEntryPointType)) {
            return false;
        }
        if ((this.customBusinessTransactionName == null) ? (other.customBusinessTransactionName != null) : !this.customBusinessTransactionName.equals(other.customBusinessTransactionName)) {
            return false;
        }
        if (this.background != other.background) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.matchRule != other.matchRule && (this.matchRule == null || !this.matchRule.equals(other.matchRule))) {
            return false;
        }
        return true;
    }
    
    
}


/*
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