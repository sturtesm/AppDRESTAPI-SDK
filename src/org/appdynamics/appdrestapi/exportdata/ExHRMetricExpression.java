/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * L3_1
 * 
 */
/*
 * 

                        <metric-expression>
                            <type>leaf</type>
                            <function-type>VALUE</function-type>
                            <value>0</value>
                            <is-literal-expression>false</is-literal-expression>
                            <display-name>null</display-name>
                            <metric-definition>
                                <type>LOGICAL_METRIC</type>
                                <logical-metric-name>Average Response Time (ms)</logical-metric-name>
                            </metric-definition>
                        </metric-expression>

                    * 
 */
@XmlSeeAlso(ExHRMetricDefinition.class)
public class ExHRMetricExpression {
    private String type;
    private String functionType;
    private Integer value;
    private boolean isLiteralExpression;
    private String displayName;
    private ExHRMetricDefinition metricDef;
    private int level=9;
    
    public ExHRMetricExpression(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.FUNCTION_TYPE)
    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    @XmlElement(name=AppExportS.VALUE)
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @XmlElement(name=AppExportS.IS_LITERAL_EXPRESSION)
    public boolean isIsLiteralExpression() {
        return isLiteralExpression;
    }

    public void setIsLiteralExpression(boolean isLiteralExpression) {
        this.isLiteralExpression = isLiteralExpression;
    }

    @XmlElement(name=AppExportS.DISPLAY_NAME)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @XmlElement(name=AppExportS.METRIC_DEFINITION)
    public ExHRMetricDefinition getMetricDef() {
        return metricDef;
    }

    public void setMetricDef(ExHRMetricDefinition metricDef) {
        this.metricDef = metricDef;
    }
    
     public String whatIsDifferent(ExHRMetricExpression obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_EXPRESSION);
        level++;
        
        if(!type.equals(obj.getType())){     
             bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
             level++;
             bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
             bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
             level--;
         }
        
        if(!functionType.equals(obj.getFunctionType())){     
            bud.append(AppExportS.I[level]).append(AppExportS.FUNCTION_TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(functionType);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getFunctionType());   
            level--;
        }

        if(!value.equals(obj.getValue())){     
            bud.append(AppExportS.I[level]).append(AppExportS.VALUE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());   
            level--;
        }
        
        
        if(isLiteralExpression != obj.isIsLiteralExpression() ){     
            bud.append(AppExportS.I[level]).append(AppExportS.IS_LITERAL_EXPRESSION);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(isLiteralExpression);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isIsLiteralExpression());   
            level--;
        }
        
        
        if(!displayName.equals(obj.getDisplayName())){     
            bud.append(AppExportS.I[level]).append(AppExportS.DISPLAY_NAME);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(displayName);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDisplayName());  
            level--;
        }
        
        if(metricDef != null) metricDef.setLevel(level);
        bud.append(metricDef.whatIsDifferent(obj.getMetricDef()));
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_EXPRESSION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.I[level]).append(AppExportS.FUNCTION_TYPE).append(AppExportS.VE).append(functionType);
        bud.append(AppExportS.I[level]).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        bud.append(AppExportS.I[level]).append(AppExportS.IS_LITERAL_EXPRESSION).append(AppExportS.VE).append(isLiteralExpression);
        bud.append(AppExportS.I[level]).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
        if(metricDef != null) metricDef.setLevel(level);
        bud.append(metricDef);
        level--;
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 83 * hash + (this.functionType != null ? this.functionType.hashCode() : 0);
        hash = 83 * hash + (this.value != null ? this.value.hashCode() : 0);
        hash = 83 * hash + (this.isLiteralExpression ? 1 : 0);
        hash = 83 * hash + (this.displayName != null ? this.displayName.hashCode() : 0);
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
        final ExHRMetricExpression other = (ExHRMetricExpression) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.functionType == null) ? (other.functionType != null) : !this.functionType.equals(other.functionType)) {
            return false;
        }
        if (this.value != other.value && (this.value == null || !this.value.equals(other.value))) {
            return false;
        }
        if (this.isLiteralExpression != other.isLiteralExpression) {
            return false;
        }
        if ((this.displayName == null) ? (other.displayName != null) : !this.displayName.equals(other.displayName)) {
            return false;
        }
        if (this.metricDef != other.metricDef && (this.metricDef == null || !this.metricDef.equals(other.metricDef))) {
            return false;
        }
        return true;
    }
    
    
}
