/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
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
    private int level=5;
    
    public ExPropertyDefinition(){}

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
        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(description);
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.I[level]).append(AppExportS.REQUIRED).append(AppExportS.VE).append(required);
        bud.append(AppExportS.I[level]).append(AppExportS.DEFAULT_STRING_VALUE).append(AppExportS.VE).append(defaultStringValue);
        
        if(AppExportS.INTEGER_TYPE.equals(type)){
             bud.append(AppExportS.I[level]).append(AppExportS.UPPER_NUMERIC_BOUND).append(AppExportS.VE).append(upperNumericBound);
             bud.append(AppExportS.I[level]).append(AppExportS.LOWER_NUMERIC_BOUND).append(AppExportS.VE).append(lowerNumericBound);
        }
        
        if(AppExportS.STRING_TYPE.equals(type)){
             bud.append(AppExportS.I[level]).append(AppExportS.STRING_MAX_LENGTH).append(AppExportS.VE).append(stringMaxLength);
             bud.append(AppExportS.I[level]).append(AppExportS.ALLOWED_STRING_VALUES).append(AppExportS.VE).append(allowedStringValues);
        }
            
        level--;
        return bud.toString();
    }

    public String whatIsDifferent(ExPropertyDefinition obj){
        if(this.equals(obj)) return AppExportS._U;
        
        if(!name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!description.equals(obj.getDescription())){
                        bud.append(AppExportS.I[level]).append(AppExportS.DESCRIPTION);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(description);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDescription());
                        level--;
        }
        
        if(!type.equals(obj.getType())){
                        bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());
                        level--;
            
        }else{
            if(AppExportS.INTEGER_TYPE.equals(type)){
                if(upperNumericBound != obj.getUpperNumericBound()){  
                        bud.append(AppExportS.I[level]).append(AppExportS.UPPER_NUMERIC_BOUND);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(upperNumericBound);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getUpperNumericBound());
                        level--;
                }
                if(lowerNumericBound != obj.getLowerNumericBound()){  
                        bud.append(AppExportS.I[level]).append(AppExportS.UPPER_NUMERIC_BOUND);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(upperNumericBound);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getUpperNumericBound());
                        level--;
                }

            }

            if(AppExportS.STRING_TYPE.equals(type)){
                if(stringMaxLength != obj.getStringMaxLength()){
                        bud.append(AppExportS.I[level]).append(AppExportS.STRING_MAX_LENGTH);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(stringMaxLength);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getStringMaxLength());
                        level--;
                }
                
                if(!allowedStringValues.equals(obj.getAllowedStringValues())){
                        bud.append(AppExportS.I[level]).append(AppExportS.ALLOWED_STRING_VALUES);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(allowedStringValues);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getAllowedStringValues());
                        level--;
                }

            }
        }
        
        if(required != obj.isRequired()){
                        bud.append(AppExportS.I[level]).append(AppExportS.REQUIRED);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(required);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isRequired());
                        level--;
        }
        
        if(!defaultStringValue.equals(obj.getDefaultStringValue())){  
                        bud.append(AppExportS.I[level]).append(AppExportS.DEFAULT_STRING_VALUE);
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(defaultStringValue);
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDefaultStringValue());
                        level--;
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 59 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 59 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 59 * hash + (this.required ? 1 : 0);
        hash = 59 * hash + (this.defaultStringValue != null ? this.defaultStringValue.hashCode() : 0);
        hash = 59 * hash + (int) (this.upperNumericBound ^ (this.upperNumericBound >>> 32));
        hash = 59 * hash + (int) (this.lowerNumericBound ^ (this.lowerNumericBound >>> 32));
        hash = 59 * hash + (int) (this.stringMaxLength ^ (this.stringMaxLength >>> 32));
        hash = 59 * hash + (this.allowedStringValues != null ? this.allowedStringValues.hashCode() : 0);
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
        final ExPropertyDefinition other = (ExPropertyDefinition) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.required != other.required) {
            return false;
        }
        if ((this.defaultStringValue == null) ? (other.defaultStringValue != null) : !this.defaultStringValue.equals(other.defaultStringValue)) {
            return false;
        }
        if (this.upperNumericBound != other.upperNumericBound) {
            return false;
        }
        if (this.lowerNumericBound != other.lowerNumericBound) {
            return false;
        }
        if (this.stringMaxLength != other.stringMaxLength) {
            return false;
        }
        if ((this.allowedStringValues == null) ? (other.allowedStringValues != null) : !this.allowedStringValues.equals(other.allowedStringValues)) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
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