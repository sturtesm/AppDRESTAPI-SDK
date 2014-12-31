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
@XmlSeeAlso({ExHRMetricExpression.class,ExHRConditionSub.class,ExHRMetricBaseline.class})
public class ExHRCondition {
    private String type;
    private String displayName;
    private String conditionValueType;
    private String conditionValue;
    private String conditionExpression;
    private String operator;
    private boolean useActiveBaseline;
    private ExHRMetricExpression metricExpression;
    private ExHRCondition condition1,condition2;
    private ExHRMetricBaseline metricBaseline;
    private int level=0;
    
    
    public ExHRCondition(){}

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

    @XmlElement(name=AppExportS.CONDITION_1)
    public ExHRCondition getCondition1() {
        return condition1;
    }

    public void setCondition1(ExHRCondition condition1) {
        this.condition1 = condition1;
    }

    @XmlElement(name=AppExportS.CONDITION_2)
    public ExHRCondition getCondition2() {
        return condition2;
    }

    public void setCondition2(ExHRCondition condition2) {
        this.condition2 = condition2;
    }

    @XmlElement(name=AppExportS.CONDITION_EXPRESSION)
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    @XmlElement(name=AppExportS.METRIC_BASELINE)
    public ExHRMetricBaseline getMetricBaseline() {
        return metricBaseline;
    }

    public void setMetricBaseline(ExHRMetricBaseline metricBaseline) {
        this.metricBaseline = metricBaseline;
    }

    
    
    @XmlTransient
    public String getLevel() {
        if(level == 1) return AppExportS.L4;
        if(level == 2) return AppExportS.L4_1;
        if(level == 3) return AppExportS.L5;
        return AppExportS.L3_1;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public String whatIsDifferent(ExHRCondition obj){
        if(this.equals(obj)) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(getLevel()).append(AppExportS.CONDITION_1);
        level++;
        int b=level;
        
        if(!type.equals(obj.getType())){     
             bud.append(getLevel()).append(AppExportS.TYPE);level++;
             bud.append(getLevel()).append(AppExportS.SRC).append(AppExportS.VE).append(type);
             bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
         }
        level=b;
        
        if(!displayName.equals(obj.getDisplayName())){     
             bud.append(getLevel()).append(AppExportS.DISPLAY_NAME);level++;
             bud.append(getLevel()).append(AppExportS.SRC).append(AppExportS.VE).append(displayName);
             bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDisplayName());   
         }
        level=b;
        
        if(!conditionValueType.equals(obj.getConditionValueType())){     
             bud.append(getLevel()).append(AppExportS.CONDITION_VALUE_TYPE);level++;
             bud.append(getLevel()).append(AppExportS.SRC).append(AppExportS.VE).append(conditionValueType);
             bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getConditionValueType());   
         }
        level=b;
        
        if(!conditionValue.equals(obj.getConditionValue())){     
             bud.append(getLevel()).append(AppExportS.CONDITION_VALUE);level++;
             bud.append(getLevel()).append(AppExportS.SRC).append(AppExportS.VE).append(conditionValue);
             bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getConditionValue());   
         }
        level=b;
   
        if(!operator.equals(obj.getOperator())){     
             bud.append(getLevel()).append(AppExportS.OPERATOR);level++;
             bud.append(getLevel()).append(AppExportS.SRC).append(AppExportS.VE).append(operator);
             bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getOperator());   
         }
        level=b;
        
        if(useActiveBaseline != obj.isUseActiveBaseline()){     
             bud.append(getLevel()).append(AppExportS.USE_ACTIVE_BASELINE);level++;
             bud.append(getLevel()).append(AppExportS.SRC).append(AppExportS.VE).append(useActiveBaseline);
             bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isUseActiveBaseline());   
         }
        level=b;
        
        if(metricExpression != null){ bud.append(metricExpression.whatIsDifferent(obj.getMetricExpression()));}
        else{
            if(obj.getMetricExpression() != null){
                bud.append(getLevel()).append(AppExportS.METRIC_EXPRESSION);level++;
                bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMetricExpression());
            }
            }
        level=b;
        
        if(metricBaseline != null){ bud.append(metricBaseline.whatIsDifferent(obj.getMetricBaseline()));}
        else{
            if(obj.getMetricBaseline() != null){
                bud.append(getLevel()).append(AppExportS.METRIC_BASELINE);level++;
                bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMetricBaseline());
            }
        }
        level=b;
    
        if(condition1 != null){bud.append(condition1.whatIsDifferent(obj.getCondition1()));}
        else{
            if(obj.getCondition1() != null){
                bud.append(getLevel()).append(AppExportS.CONDITION_1);level++;
                bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getCondition1());
            }
        }
        level=b;
        
        if(condition2 != null){bud.append(condition2.whatIsDifferent(obj.getCondition2()));}
        else{
            if(obj.getCondition2() != null){
                bud.append(getLevel()).append(AppExportS.CONDITION_2);level++;
                bud.append(getLevel()).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getCondition2());
            }
        }
        level=b;
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(getLevel()).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(condition1 != null){
            bud.append(getLevel()).append(AppExportS.OPERATOR).append(AppExportS.VE).append(operator);
            if(condition1 != null){ level++;bud.append(getLevel()).append(AppExportS.CONDITION_1);condition1.setLevel((level++));bud.append(condition1);}
            if(condition2 != null){ bud.append(getLevel()).append(AppExportS.CONDITION_2);condition2.setLevel((level));bud.append(condition2);}
        }else{
            bud.append(getLevel()).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
            bud.append(getLevel()).append(AppExportS.CONDITION_VALUE_TYPE).append(AppExportS.VE).append(conditionValueType);
            bud.append(getLevel()).append(AppExportS.CONDITION_VALUE).append(AppExportS.VE).append(conditionValue);
            bud.append(getLevel()).append(AppExportS.CONDITION_EXPRESSION).append(AppExportS.VE).append(conditionExpression);
            bud.append(getLevel()).append(AppExportS.OPERATOR).append(AppExportS.VE).append(operator);
            bud.append(getLevel()).append(AppExportS.USE_ACTIVE_BASELINE).append(AppExportS.VE).append(useActiveBaseline);
            if(metricBaseline != null) bud.append(metricBaseline);
            bud.append(metricExpression);
        }
        
        return bud.toString();
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 29 * hash + (this.displayName != null ? this.displayName.hashCode() : 0);
        hash = 29 * hash + (this.conditionValueType != null ? this.conditionValueType.hashCode() : 0);
        hash = 29 * hash + (this.conditionValue != null ? this.conditionValue.hashCode() : 0);
        hash = 29 * hash + (this.conditionExpression != null ? this.conditionExpression.hashCode() : 0);
        hash = 29 * hash + (this.operator != null ? this.operator.hashCode() : 0);
        hash = 29 * hash + (this.useActiveBaseline ? 1 : 0);
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
        final ExHRCondition other = (ExHRCondition) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.displayName == null) ? (other.displayName != null) : !this.displayName.equals(other.displayName)) {
            return false;
        }
        if ((this.conditionValueType == null) ? (other.conditionValueType != null) : !this.conditionValueType.equals(other.conditionValueType)) {
            return false;
        }
        if ((this.conditionValue == null) ? (other.conditionValue != null) : !this.conditionValue.equals(other.conditionValue)) {
            return false;
        }
        if ((this.conditionExpression == null) ? (other.conditionExpression != null) : !this.conditionExpression.equals(other.conditionExpression)) {
            return false;
        }
        if ((this.operator == null) ? (other.operator != null) : !this.operator.equals(other.operator)) {
            return false;
        }
        if (this.useActiveBaseline != other.useActiveBaseline) {
            return false;
        }
        if (this.metricExpression != other.metricExpression && (this.metricExpression == null || !this.metricExpression.equals(other.metricExpression))) {
            return false;
        }
        if (this.condition1 != other.condition1 && (this.condition1 == null || !this.condition1.equals(other.condition1))) {
            return false;
        }
        if (this.condition2 != other.condition2 && (this.condition2 == null || !this.condition2.equals(other.condition2))) {
            return false;
        }
        if (this.metricBaseline != other.metricBaseline && (this.metricBaseline == null || !this.metricBaseline.equals(other.metricBaseline))) {
            return false;
        }
        return true;
    }
    
    
    
}
