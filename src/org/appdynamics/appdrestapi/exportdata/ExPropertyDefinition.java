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
 * <property-definition>
                    <name>max-jdbc-calls-per-callgraph</name>
                    <description>Maximum number of sql queries  that will be reported per callgraph. Note - Only queries taking more time than 'min-duration-for-jdbc-callsample' wil be reported. Does not need a restart</description>
                    <type>INTEGER</type>
                    <required>false</required>
                    <default-string-value>100</default-string-value>
                    <upper-numeric-bound>1000</upper-numeric-bound>
                    <lower-numeric-bound>1</lower-numeric-bound>
                </property-definition>
   <property-definition>
                    <name>show-packages</name>
                    <description>Show these packages / class names in addition to the ones configured in the global callgraph configuration, for the callgraphs captured on this node. Does not need a restart</description>
                    <type>STRING</type>
                    <required>false</required>
                    <default-string-value/>
                    <string-max-length>0</string-max-length>
                    <allowed-string-values/>
                </property-definition>
   <property-definition>
                    <name>enable-collection-monitoring</name>
                    <description>Enables / Disables Collection monitoring feature on this node. Feature available only on JVMs versions 1.6 upwards and requires restart.</description>
                    <type>BOOLEAN</type>
                    <required>false</required>
                    <default-string-value>false</default-string-value>
                </property-definition>
 * 
 */
public class ExPropertyDefinition {
    private String name;
    private String description;
    private String type;
    private boolean required;
    private String defaultStringValue;
    private long upperNumericBound;
    private long lowerNumericBound;
    private long stringMaxLength;
    private String allowedStringValues;
    
    public ExPropertyDefinition(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.REQUIRED)
    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @XmlElement(name=AppExportS.DEFAULT_STRING_VALUE)
    public String getDefaultStringValue() {
        return defaultStringValue;
    }

    public void setDefaultStringValue(String defaultStringValue) {
        this.defaultStringValue = defaultStringValue;
    }

    @XmlElement(name=AppExportS.UPPER_NUMERIC_BOUND)
    public long getUpperNumericBound() {
        return upperNumericBound;
    }

    public void setUpperNumericBound(long upperNumericBound) {
        this.upperNumericBound = upperNumericBound;
    }

    @XmlElement(name=AppExportS.LOWER_NUMERIC_BOUND)
    public long getLowerNumericBound() {
        return lowerNumericBound;
    }

    public void setLowerNumericBound(long lowerNumericBound) {
        this.lowerNumericBound = lowerNumericBound;
    }

    @XmlElement(name=AppExportS.STRING_MAX_LENGTH)
    public long getStringMaxLength() {
        return stringMaxLength;
    }

    public void setStringMaxLength(long stringMaxLength) {
        this.stringMaxLength = stringMaxLength;
    }

    @XmlElement(name=AppExportS.ALLOWED_STRING_VALUES)
    public String getAllowedStringValues() {
        return allowedStringValues;
    }

    public void setAllowedStringValues(String allowedStringValues) {
        this.allowedStringValues = allowedStringValues;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.PROPERTY_DEFINITION);
        bud.append(AppExportS.L3).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L3).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
        bud.append(AppExportS.L3).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L3).append(AppExportS.REQUIRED).append(AppExportS.VE).append(required);
        bud.append(AppExportS.L3).append(AppExportS.DEFAULT_STRING_VALUE).append(AppExportS.VE).append(defaultStringValue);
        
        if(AppExportS.INTEGER_TYPE.equals(type)){
             bud.append(AppExportS.L3).append(AppExportS.UPPER_NUMERIC_BOUND).append(AppExportS.VE).append(upperNumericBound);
             bud.append(AppExportS.L3).append(AppExportS.LOWER_NUMERIC_BOUND).append(AppExportS.VE).append(lowerNumericBound);
        }
        
        if(AppExportS.STRING_TYPE.equals(type)){
             bud.append(AppExportS.L3).append(AppExportS.STRING_MAX_LENGTH).append(AppExportS.VE).append(stringMaxLength);
             bud.append(AppExportS.L3).append(AppExportS.ALLOWED_STRING_VALUES).append(AppExportS.VE).append(allowedStringValues);
        }
            
        
        return bud.toString();
    }
    
}
