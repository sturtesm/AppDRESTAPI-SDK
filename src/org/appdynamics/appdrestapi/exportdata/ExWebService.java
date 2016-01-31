/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

/**
 *
 * @author gilbert.solorzano
 * 
 * NEEDS WORK
 * 
 */
public class ExWebService {
    private String name,btName,entryPoint;
    private boolean background,enabled;
    
    public ExWebService(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBtName() {
        return btName;
    }

    public void setBtName(String btName) {
        this.btName = btName;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public boolean isBackground() {
        return background;
    }

    public void setBackground(boolean background) {
        this.background = background;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
}

/*
    <custom-match-point>
        <name>Catch-All-WS</name>
        <business-transaction-name>Catch-All-WS</business-transaction-name>
        <entry-point>WEB_SERVICE</entry-point>
        <background>false</background>
        <enabled>true</enabled>
        <match-rule>
            <web-service-rule>
                <enabled>true</enabled>
                <priority>1</priority>
                <web-service-name filter-type="NOT_EMPTY" filter-value="&lt;not empty>"/>
            </web-service-rule>
        </match-rule>
    </custom-match-point>
    <custom-match-point>
        <name>Collection</name>
        <business-transaction-name>Collection</business-transaction-name>
        <entry-point>WEB_SERVICE</entry-point>
        <background>false</background>
        <enabled>true</enabled>
        <match-rule>
            <web-service-rule>
                <enabled>true</enabled>
                <priority>4</priority>
                <web-service-name filter-type="CONTAINS" filter-value="collection"/>
                <operation-name filter-type="EQUALS" filter-value="GET"/>
            </web-service-rule>
        </match-rule>
    </custom-match-point>
*/