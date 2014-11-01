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
 * L1_1
 * 
 */
@XmlSeeAlso({ExAffectedEntitiesMatchCriteria.class,ExHRExecutionCriteria.class})
public class ExHealthRule {
    private String name,type,descr,schedule;
    private boolean enabled,isDefault,alwaysEnabled;
    private Integer durationMin,waitTime;
    private ExAffectedEntitiesMatchCriteria affectedEntitiesMC;
    private ExHRExecutionCriteria critical,warning;
    
    
    public ExHealthRule(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.DESCRIPTION)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.IS_DEFAULT)
    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @XmlElement(name=AppExportS.ALWAYS_ENABLED)
    public boolean isAlwaysEnabled() {
        return alwaysEnabled;
    }

    public void setAlwaysEnabled(boolean alwaysEnabled) {
        this.alwaysEnabled = alwaysEnabled;
    }

    @XmlElement(name=AppExportS.DURATION_MIN)
    public Integer getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
    }

    @XmlElement(name=AppExportS.WAIT_TIME_MIN)
    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    @XmlElement(name=AppExportS.AFFECTED_ENTITIES_MATCH_CRITERIA)
    public ExAffectedEntitiesMatchCriteria getAffectedEntitiesMC() {
        return affectedEntitiesMC;
    }

    public void setAffectedEntitiesMC(ExAffectedEntitiesMatchCriteria affectedEntitiesMC) {
        this.affectedEntitiesMC = affectedEntitiesMC;
    }

    @XmlElement(name=AppExportS.CRITICAL_EXECUTION_CRITERIA)
    public ExHRExecutionCriteria getCritical() {
        return critical;
    }

    public void setCritical(ExHRExecutionCriteria critical) {
        this.critical = critical;
    }

    @XmlElement(name=AppExportS.WARNING_EXECUTION_CRITERIA)
    public ExHRExecutionCriteria getWarning() {
        return warning;
    }

    public void setWarning(ExHRExecutionCriteria warning) {
        this.warning = warning;
    }

    @XmlElement(name=AppExportS.SCHEDULE)
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.HEALTH_RULE);
        bud.append(AppExportS.L2_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L2_1).append(AppExportS.DESCRIPTION).append(AppExportS.VE).append(descr);
        bud.append(AppExportS.L2_1).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.L2_1).append(AppExportS.IS_DEFAULT).append(AppExportS.VE).append(isDefault);
        bud.append(AppExportS.L2_1).append(AppExportS.ALWAYS_ENABLED).append(AppExportS.VE).append(alwaysEnabled);
        bud.append(AppExportS.L2_1).append(AppExportS.DURATION_MIN).append(AppExportS.VE).append(durationMin);
        bud.append(AppExportS.L2_1).append(AppExportS.WAIT_TIME_MIN).append(AppExportS.VE).append(waitTime);
        if(schedule != null) bud.append(AppExportS.L2_1).append(AppExportS.SCHEDULE).append(AppExportS.VE).append(schedule);
        bud.append(affectedEntitiesMC);
        if(critical != null){bud.append(AppExportS.L2_1).append(AppExportS.CRITICAL_EXECUTION_CRITERIA);bud.append(critical);}
        if(warning != null){bud.append(AppExportS.L2_1).append(AppExportS.WARNING_EXECUTION_CRITERIA);bud.append(warning);}
        return bud.toString();
    }
    
}
/*
 * <health-rule>
            <name>Business Transaction response time is much higher than normal</name>
            <type>BUSINESS_TRANSACTION</type>
            <description>Average Response Time (ms) is &gt; 2 : 3 standard deviation of the default baseline and CALLS_PER_MINUTE is &gt; 50 per minute for the last 30 minutes</description>
            <enabled>true</enabled>
            <is-default>true</is-default>
            <always-enabled>true</always-enabled>
            <duration-min>30</duration-min>
            <wait-time-min>30</wait-time-min>
            <affected-entities-match-criteria>
                <affected-bt-match-criteria>
                    <type>ALL</type>
                </affected-bt-match-criteria>
            </affected-entities-match-criteria>
            <critical-execution-criteria>
                <entity-aggregation-scope>
                    <type>AGGREGATE</type>
                    <value>0</value>
                </entity-aggregation-scope>
                <policy-condition>
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
                    <condition2>
                        <type>leaf</type>
                        <display-name>Calls per Minute Condition</display-name>
                        <condition-value-type>ABSOLUTE</condition-value-type>
                        <condition-value>50</condition-value>
                        <operator>GREATER_THAN</operator>
                        <condition-expression/>
                        <use-active-baseline>false</use-active-baseline>
                        <metric-expression>
                            <type>leaf</type>
                            <function-type>VALUE</function-type>
                            <value>0</value>
                            <is-literal-expression>false</is-literal-expression>
                            <display-name>null</display-name>
                            <metric-definition>
                                <type>LOGICAL_METRIC</type>
                                <logical-metric-name>Calls per Minute</logical-metric-name>
                            </metric-definition>
                        </metric-expression>
                    </condition2>
                </policy-condition>
            </critical-execution-criteria>
            <warning-execution-criteria>
                <entity-aggregation-scope>
                    <type>AGGREGATE</type>
                    <value>0</value>
                </entity-aggregation-scope>
                <policy-condition>
                    <type>boolean</type>
                    <operator>AND</operator>
                    <condition1>
                        <type>leaf</type>
                        <display-name>Average Response Time (ms) Baseline Condition</display-name>
                        <condition-value-type>BASELINE_STANDARD_DEVIATION</condition-value-type>
                        <condition-value>2</condition-value>
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
                    <condition2>
                        <type>leaf</type>
                        <display-name>Calls per Minute Condition</display-name>
                        <condition-value-type>ABSOLUTE</condition-value-type>
                        <condition-value>100</condition-value>
                        <operator>GREATER_THAN</operator>
                        <condition-expression/>
                        <use-active-baseline>false</use-active-baseline>
                        <metric-expression>
                            <type>leaf</type>
                            <function-type>VALUE</function-type>
                            <value>0</value>
                            <is-literal-expression>false</is-literal-expression>
                            <display-name>null</display-name>
                            <metric-definition>
                                <type>LOGICAL_METRIC</type>
                                <logical-metric-name>Calls per Minute</logical-metric-name>
                            </metric-definition>
                        </metric-expression>
                    </condition2>
                </policy-condition>
            </warning-execution-criteria>
        </health-rule>
 */
