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
 * L3
 * <condition1>
                        <type>leaf</type>
                        <display-name>Average Response Time (ms) Baseline Condition</display-name>
                        <condition-value-type>BASELINE_STANDARD_DEVIATION</condition-value-type>
                        <condition-value>3</condition-value>
                        <operator>GREATER_THAN</operator>
                        <condition-expression/>
                        <use-active-baseline>true</use-active-baseline>
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
                    </condition1>
                    * 
 */
@XmlSeeAlso(ExHRMetricExpression.class)
public class ExHRConditionSub {
    private String type;
    private String displayName;
    private String conditionValueType;
    private String conditionValue;
    private String operator;
    private boolean useActiveBaseline;
    private ExHRMetricExpression metricExpression;
    
    
    public ExHRConditionSub(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.DISPLAY_NAME)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @XmlElement(name=AppExportS.CONDITION_VALUE_TYPE)
    public String getConditionValueType() {
        return conditionValueType;
    }

    public void setConditionValueType(String conditionValueType) {
        this.conditionValueType = conditionValueType;
    }

    @XmlElement(name=AppExportS.CONDITION_VALUE)
    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    @XmlElement(name=AppExportS.OPERATOR)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @XmlElement(name=AppExportS.USE_ACTIVE_BASELINE)
    public boolean isUseActiveBaseline() {
        return useActiveBaseline;
    }

    public void setUseActiveBaseline(boolean useActiveBaseline) {
        this.useActiveBaseline = useActiveBaseline;
    }

    @XmlElement(name=AppExportS.METRIC_EXPRESSION)
    public ExHRMetricExpression getMetricExpression() {
        return metricExpression;
    }

    public void setMetricExpression(ExHRMetricExpression metricExpression) {
        this.metricExpression = metricExpression;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L3_1).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
        bud.append(AppExportS.L3_1).append(AppExportS.CONDITION_VALUE_TYPE).append(AppExportS.VE).append(conditionValueType);
        bud.append(AppExportS.L3_1).append(AppExportS.CONDITION_VALUE).append(AppExportS.VE).append(conditionValue);
        bud.append(AppExportS.L3_1).append(AppExportS.OPERATOR).append(AppExportS.VE).append(operator);
        bud.append(AppExportS.L3_1).append(AppExportS.USE_ACTIVE_BASELINE).append(AppExportS.VE).append(useActiveBaseline);
        bud.append(metricExpression);
        
        return bud.toString();
        
    }
    
    
}
