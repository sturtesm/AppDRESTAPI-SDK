/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * L3_1
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
    
    public ExHRMetricExpression(){}

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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.METRIC_EXPRESSION);
        bud.append(AppExportS.L4).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L4).append(AppExportS.FUNCTION_TYPE).append(AppExportS.VE).append(functionType);
        bud.append(AppExportS.L4).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        bud.append(AppExportS.L4).append(AppExportS.IS_LITERAL_EXPRESSION).append(AppExportS.VE).append(isLiteralExpression);
        bud.append(AppExportS.L4).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
        bud.append(metricDef);
        
        return bud.toString();
    }
}
