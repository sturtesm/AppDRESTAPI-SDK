/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * 
 * Found the ability extract custom dashboards, this is going to be the object.
 * 
 */
public class Dashboard {
    private String name,value;
    private boolean exists=false;
    
    public Dashboard(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L0).append(value).append(AppExportS.L0);
        return bud.toString();
    }
    
}
/*
<custom-dashboard controller-version="004-000-004-002"
    custom-dashboard-version="5" height="800"
    name="NGM-OSB-R1PHX-Domain003-Legacy-CPU-Utilization" width="1200">
    <description/>
    <security-token/>
    <sharing-revoked>false</sharing-revoked>
    <layout-type/>
    <dashboard-display-properties>
        <refresh-interval>60000</refresh-interval>
        <color>0</color>
        <background-color>ffffff</background-color>
        <start-time>12/31/1969 16:00:00</start-time>
        <end-time>12/31/1969 16:00:00</end-time>
        <minutes-before-anchor-time>120</minutes-before-anchor-time>
    </dashboard-display-properties>
    <is-template>false</is-template>
    <canvas type="CANVAS_TYPE_ABSOLUTE">
        <widget widget-ordinal="0" widget-type="graph">
            <widget-display-properties height="800" width="1200"
                x-axis="0" y-axis="0">
                <label/>
                <description/>
                <drill-down-url/>
                <use-metric-browser-as-drill-down>true</use-metric-browser-as-drill-down>
                <background-color>ffffff</background-color>
                <color>404040</color>
                <font-size>12</font-size>
                <border-enabled>false</border-enabled>
                <border-thickness>0</border-thickness>
                <border-color>dbdbdb</border-color>
                <background-alpha>1.0</background-alpha>
                <widget-type>TIMESERIES_GRAPH</widget-type>
                <show-values>false</show-values>
                <additional-styles/>
                <start-time>12/31/1969 16:00:00</start-time>
                <end-time>12/31/1969 16:00:00</end-time>
                <minutes-before-anchor-time>120</minutes-before-anchor-time>
                <is-global>true</is-global>
                <metric-match-criterias-name-to-metric-type>
                    <name-value>
                        <name>NGM R1 PHX CPU Utiloization</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                </metric-match-criterias-name-to-metric-type>
                <vertical-axis-label/>
                <title>NGM OSB R1PHX Legacy Domain003 CPU Utilization</title>
                <hide-horizontal-axis>true</hide-horizontal-axis>
                <compact-mode>false</compact-mode>
                <show-legend>true</show-legend>
                <horizontal-axis-label/>
                <axis-type>LINEAR</axis-type>
                <show-time-range>false</show-time-range>
                <render-in-3d>false</render-in-3d>
                <legend-position>POSITION_BOTTOM</legend-position>
                <legend-column-count>3</legend-column-count>
                <background-colors>
                    <background-color>ffffff</background-color>
                    <background-color>ffffff</background-color>
                </background-colors>
            </widget-display-properties>
            <widget-series-list>
                <widget-series name="NGM R1 PHX CPU Utiloization" version="5">
                    <widget-series-data application-name="DTVUS-IT-Perf" version="0">
                        <data-match type="infrastructure" version="0">
                            <infrastructure-affected-criteria-type>NODES</infrastructure-affected-criteria-type>
                            <node-match-criteria node-match-criteria-type="SPECIFC">
                                <node-list>
                                    <node>pxvfoqw041_osb1</node>
                                    <node>pxvfoqw043_osb1</node>
                                    <node>pxvfoqw042_osb1</node>
                                    <node>pxvfoqw044_osb1</node>
                                    <node>pxvfoqw045_osb1</node>
                                    <node>pxvfoqw046_osb1</node>
                                    <node>pxvfoqw047_osb1</node>
                                    <node>pxvfoqw048_osb1</node>
                                    <node>pxvfoqw050_osb1</node>
                                    <node>pxvfoqw049_osb1</node>
                                    <node>pxvfoqw031_osb1</node>
                                    <node>pxvfoqw032_osb1</node>
                                    <node>pxvfoqw033_osb1</node>
                                    <node>pxvfoqw034_osb1</node>
                                    <node>pxvfoqw035_osb1</node>
                                    <node>pxvfoqw036_osb1</node>
                                    <node>pxvfoqw037_osb1</node>
                                    <node>pxvfoqw038_osb1</node>
                                    <node>pxvfoqw039_osb1</node>
                                    <node>pxvfoqw040_osb1</node>
                                </node-list>
                            </node-match-criteria>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>Hardware Resources|CPU|%Busy</metric-name>
                            </metric-definition>
                        </leaf-metric-expression>
                        <roll-up>false</roll-up>
                        <use-active-baseline>false</use-active-baseline>
                    </widget-series-data>
                    <widget-series-display-properties type="LINE">
                        <show-raw-metric-name>false</show-raw-metric-name>
                    </widget-series-display-properties>
                </widget-series>
            </widget-series-list>
        </widget>
    </canvas>
</custom-dashboard>
*/