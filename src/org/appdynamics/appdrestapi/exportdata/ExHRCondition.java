/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

/**
 *
 * @author gilbert.solorzano
 * 
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
public class ExHRCondition {
    
}
