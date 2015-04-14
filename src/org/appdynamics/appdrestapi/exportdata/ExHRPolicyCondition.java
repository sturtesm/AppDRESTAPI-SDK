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
 * L2_1 NOT USED, MIGHT BE DELETED!!!
 * 
 */
/*
 * <policy-condition>
                    <type>boolean</type>
                    <operator>AND</operator>
                    <condition1>
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

                </policy-condition>
 */
@XmlSeeAlso(ExHRCondition.class)
public class ExHRPolicyCondition {
    private String type;
    private String operator;
    private String conditionExpression;
    private ExHRCondition condition1;
    private ExHRCondition condition2;
    private ExHRCondition condition3;
    private ExHRCondition condition4;
    
    public ExHRPolicyCondition(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.OPERATOR)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
    
    @XmlElement(name=AppExportS.CONDITION_3)
    public ExHRCondition getCondition3() {
        return condition3;
    }

    public void setCondition3(ExHRCondition condition3) {
        this.condition3 = condition3;
    }
    
    @XmlElement(name=AppExportS.CONDITION_4)
    public ExHRCondition getCondition4() {
        return condition4;
    }

    public void setCondition4(ExHRCondition condition4) {
        this.condition4 = condition4;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.POLICY_CONDITION);
        bud.append(AppExportS.L3).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L3).append(AppExportS.OPERATOR).append(AppExportS.VE).append(operator);
        if(condition1 != null){bud.append(AppExportS.L3).append(AppExportS.CONDITION_1);bud.append(condition1);}
        if(condition2 != null){bud.append(AppExportS.L3).append(AppExportS.CONDITION_2);bud.append(condition2);}
        if(condition3 != null){bud.append(AppExportS.L3).append(AppExportS.CONDITION_3);bud.append(condition3);}
        if(condition4 != null){bud.append(AppExportS.L3).append(AppExportS.CONDITION_4);bud.append(condition4);}
        return bud.toString();
    }
    
}
