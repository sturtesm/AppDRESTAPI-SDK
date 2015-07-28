/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gilbert.solorzano
 */
@XmlRootElement(name=AppExportS.CUSTOM_DASHBOARD)
public class ExDashboard {
    private String controllerVersion, customDashboardVersion,name, height,width;
    
    public ExDashboard(){}

    @XmlAttribute(name=AppExportS.CONTROLLER_VERSION)
    public String getControllerVersion() {
        return controllerVersion;
    }

    public void setControllerVersion(String controllerVersion) {
        this.controllerVersion = controllerVersion;
    }

    @XmlAttribute(name=AppExportS.CUSTOM_DASHBOARD_VERSION)
    public String getCustomDashboardVersion() {
        return customDashboardVersion;
    }

    public void setCustomDashboardVersion(String customDashboardVersion) {
        this.customDashboardVersion = customDashboardVersion;
    }

    @XmlAttribute(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name=AppExportS.HEIGHT)
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @XmlAttribute(name=AppExportS.WIDTH)
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.NAME).append(AppExportS.VE).append(name);
        return bud.toString();
    }
    
}

/*
<custom-dashboard controller-version="004-000-004-000"
    custom-dashboard-version="73" height="1000" name="z_TierJavaHeap" width="1124">
    <description/>
    <security-token/>
    <sharing-revoked>false</sharing-revoked>
    <layout-type/>
    <dashboard-display-properties>
        <refresh-interval>180000</refresh-interval>
        <color>0</color>
        <background-color>66b2ff</background-color>
        <start-time>12/31/1969 16:00:00</start-time>
        <end-time>12/31/1969 16:00:00</end-time>
        <minutes-before-anchor-time>60</minutes-before-anchor-time>
    </dashboard-display-properties>
    <is-template>false</is-template>
    <canvas type="CANVAS_TYPE_ABSOLUTE">
        <widget widget-ordinal="0" widget-type="graph">
            <widget-display-properties height="320" width="1109"
                x-axis="5" y-axis="6">
                <label/>
                <description/>
                <drill-down-url>https://dtvbroadcast.saas.appdynamics.com/controller/#/location=CDASHBOARD_DETAIL&amp;mode=MODE_DASHBOARD&amp;dashboard=52</drill-down-url>
                <use-metric-browser-as-drill-down>false</use-metric-browser-as-drill-down>
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
                <minutes-before-anchor-time>60</minutes-before-anchor-time>
                <is-global>true</is-global>
                <metric-match-criterias-name-to-metric-type>
                    <name-value>
                        <name>MaxHeap</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                    <name-value>
                        <name>CurrentUsage</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                </metric-match-criterias-name-to-metric-type>
                <vertical-axis-label>MB</vertical-axis-label>
                <title>Tier Java Heap</title>
                <hide-horizontal-axis>true</hide-horizontal-axis>
                <compact-mode>false</compact-mode>
                <show-legend>true</show-legend>
                <horizontal-axis-label/>
                <axis-type>LINEAR</axis-type>
                <show-time-range>false</show-time-range>
                <render-in-3d>false</render-in-3d>
                <legend-position>POSITION_BOTTOM</legend-position>
                <legend-column-count>1</legend-column-count>
                <background-colors>
                    <background-color>ffffff</background-color>
                    <background-color>ffffff</background-color>
                </background-colors>
            </widget-display-properties>
            <widget-series-list>
                <widget-series name="MaxHeap" version="67">
                    <widget-series-data
                        application-name="DTVUS-OPS-Prod" version="0">
                        <data-match type="infrastructure" version="1">
                            <infrastructure-affected-criteria-type>SPECIFIC_TIERS</infrastructure-affected-criteria-type>
                            <application-component-list>
                                <application-component>CRP_PDS-SD</application-component>
                            </application-component-list>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>JVM|Memory:Heap|Max Available (MB)</metric-name>
                            </metric-definition>
                        </leaf-metric-expression>
                        <roll-up>false</roll-up>
                        <use-active-baseline>false</use-active-baseline>
                    </widget-series-data>
                    <widget-series-display-properties type="LINE">
                        <show-raw-metric-name>false</show-raw-metric-name>
                        <color-pallete>
                            <color>994c</color>
                        </color-pallete>
                    </widget-series-display-properties>
                </widget-series>
                <widget-series name="CurrentUsage" version="66">
                    <widget-series-data
                        application-name="DTVUS-OPS-Prod" version="0">
                        <data-match type="infrastructure" version="1">
                            <infrastructure-affected-criteria-type>SPECIFIC_TIERS</infrastructure-affected-criteria-type>
                            <application-component-list>
                                <application-component>CRP_PDS-SD</application-component>
                            </application-component-list>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>JVM|Memory:Heap|Current Usage (MB)</metric-name>
                            </metric-definition>
                        </leaf-metric-expression>
                        <roll-up>false</roll-up>
                        <use-active-baseline>false</use-active-baseline>
                    </widget-series-data>
                    <widget-series-display-properties type="LINE">
                        <show-raw-metric-name>false</show-raw-metric-name>
                        <color-pallete>
                            <color>3399ff</color>
                        </color-pallete>
                    </widget-series-display-properties>
                </widget-series>
            </widget-series-list>
        </widget>
        <widget widget-ordinal="1" widget-type="graph">
            <widget-display-properties height="320" width="1109"
                x-axis="5" y-axis="332">
                <label/>
                <description/>
                <drill-down-url>https://dtvbroadcast.saas.appdynamics.com/controller/#/location=CDASHBOARD_DETAIL&amp;mode=MODE_DASHBOARD&amp;dashboard=52</drill-down-url>
                <use-metric-browser-as-drill-down>false</use-metric-browser-as-drill-down>
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
                <minutes-before-anchor-time>60</minutes-before-anchor-time>
                <is-global>true</is-global>
                <metric-match-criterias-name-to-metric-type>
                    <name-value>
                        <name>Maj GC Time</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                    <name-value>
                        <name>GC Time</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                    <name-value>
                        <name>Min GC Time</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                </metric-match-criterias-name-to-metric-type>
                <vertical-axis-label>Time Spent (ms)</vertical-axis-label>
                <title>Tier GC Times</title>
                <hide-horizontal-axis>true</hide-horizontal-axis>
                <compact-mode>false</compact-mode>
                <show-legend>true</show-legend>
                <horizontal-axis-label/>
                <axis-type>LINEAR</axis-type>
                <show-time-range>false</show-time-range>
                <render-in-3d>false</render-in-3d>
                <legend-position>POSITION_BOTTOM</legend-position>
                <legend-column-count>1</legend-column-count>
                <background-colors>
                    <background-color>ffffff</background-color>
                    <background-color>ffffff</background-color>
                </background-colors>
            </widget-display-properties>
            <widget-series-list>
                <widget-series name="GC Time" version="56">
                    <widget-series-data
                        application-name="DTVUS-OPS-Prod" version="0">
                        <data-match type="infrastructure" version="1">
                            <infrastructure-affected-criteria-type>SPECIFIC_TIERS</infrastructure-affected-criteria-type>
                            <application-component-list>
                                <application-component>CRP_PDS-SD</application-component>
                            </application-component-list>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>JVM|Garbage Collection|GC Time Spent Per Min (ms)</metric-name>
                            </metric-definition>
                        </leaf-metric-expression>
                        <roll-up>false</roll-up>
                        <use-active-baseline>false</use-active-baseline>
                    </widget-series-data>
                    <widget-series-display-properties type="LINE">
                        <show-raw-metric-name>false</show-raw-metric-name>
                        <color-pallete>
                            <color>ff0000</color>
                        </color-pallete>
                    </widget-series-display-properties>
                </widget-series>
                <widget-series name="Maj GC Time" version="54">
                    <widget-series-data
                        application-name="DTVUS-OPS-Prod" version="0">
                        <data-match type="infrastructure" version="1">
                            <infrastructure-affected-criteria-type>SPECIFIC_TIERS</infrastructure-affected-criteria-type>
                            <application-component-list>
                                <application-component>CRP_PDS-SD</application-component>
                            </application-component-list>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>JVM|Garbage Collection|Major Collection Time Spent Per Min (ms)</metric-name>
                            </metric-definition>
                        </leaf-metric-expression>
                        <roll-up>false</roll-up>
                        <use-active-baseline>false</use-active-baseline>
                    </widget-series-data>
                    <widget-series-display-properties type="LINE">
                        <show-raw-metric-name>false</show-raw-metric-name>
                        <color-pallete>
                            <color>ffb266</color>
                        </color-pallete>
                    </widget-series-display-properties>
                </widget-series>
                <widget-series name="Min GC Time" version="53">
                    <widget-series-data
                        application-name="DTVUS-OPS-Prod" version="0">
                        <data-match type="infrastructure" version="1">
                            <infrastructure-affected-criteria-type>SPECIFIC_TIERS</infrastructure-affected-criteria-type>
                            <application-component-list>
                                <application-component>CRP_PDS-SD</application-component>
                            </application-component-list>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>JVM|Garbage Collection|Minor Collection Time Spent Per Min (ms)</metric-name>
                            </metric-definition>
                        </leaf-metric-expression>
                        <roll-up>false</roll-up>
                        <use-active-baseline>false</use-active-baseline>
                    </widget-series-data>
                    <widget-series-display-properties type="LINE">
                        <show-raw-metric-name>false</show-raw-metric-name>
                        <color-pallete>
                            <color>80ff</color>
                        </color-pallete>
                    </widget-series-display-properties>
                </widget-series>
            </widget-series-list>
        </widget>
        <widget widget-ordinal="2" widget-type="graph">
            <widget-display-properties height="320" width="1108"
                x-axis="8" y-axis="660">
                <label/>
                <description/>
                <drill-down-url>https://dtvbroadcast.saas.appdynamics.com/controller/#/location=CDASHBOARD_DETAIL&amp;mode=MODE_DASHBOARD&amp;dashboard=52</drill-down-url>
                <use-metric-browser-as-drill-down>false</use-metric-browser-as-drill-down>
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
                <minutes-before-anchor-time>15</minutes-before-anchor-time>
                <is-global>true</is-global>
                <metric-match-criterias-name-to-metric-type>
                    <name-value>
                        <name>Minor GC Avg</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                    <name-value>
                        <name>Maj GC Count Avg</name>
                        <value>INFRASTRUCTURE</value>
                    </name-value>
                </metric-match-criterias-name-to-metric-type>
                <vertical-axis-label/>
                <title>Tier Minor/Major Counts</title>
                <hide-horizontal-axis>true</hide-horizontal-axis>
                <compact-mode>false</compact-mode>
                <show-legend>true</show-legend>
                <horizontal-axis-label/>
                <axis-type>LINEAR</axis-type>
                <show-time-range>false</show-time-range>
                <render-in-3d>false</render-in-3d>
                <legend-position>POSITION_BOTTOM</legend-position>
                <legend-column-count>1</legend-column-count>
                <background-colors>
                    <background-color>ffffff</background-color>
                    <background-color>ffffff</background-color>
                </background-colors>
            </widget-display-properties>
            <widget-series-list>
                <widget-series name="Minor GC Avg" version="12">
                    <widget-series-data
                        application-name="DTVUS-OPS-Prod" version="0">
                        <data-match type="infrastructure" version="1">
                            <infrastructure-affected-criteria-type>SPECIFIC_TIERS</infrastructure-affected-criteria-type>
                            <application-component-list>
                                <application-component>CRP_PDS-SD</application-component>
                            </application-component-list>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>JVM|Garbage Collection|Number of Minor Collections Per Min</metric-name>
                            </metric-definition>
                        </leaf-metric-expression>
                        <roll-up>false</roll-up>
                        <use-active-baseline>false</use-active-baseline>
                    </widget-series-data>
                    <widget-series-display-properties type="LINE">
                        <show-raw-metric-name>false</show-raw-metric-name>
                    </widget-series-display-properties>
                </widget-series>
                <widget-series name="Maj GC Count Avg" version="14">
                    <widget-series-data
                        application-name="DTVUS-OPS-Prod" version="0">
                        <data-match type="infrastructure" version="1">
                            <infrastructure-affected-criteria-type>SPECIFIC_TIERS</infrastructure-affected-criteria-type>
                            <application-component-list>
                                <application-component>CRP_PDS-SD</application-component>
                            </application-component-list>
                        </data-match>
                        <metric-data-filter>
                            <max-results>20</max-results>
                            <sort-ascending>false</sort-ascending>
                        </metric-data-filter>
                        <leaf-metric-expression display-name="null" is-literal-value="false">
                            <function-type>VALUE</function-type>
                            <metric-definition type="LOGICAL_METRIC">
                                <metric-name>JVM|Garbage Collection|Number of Major Collections Per Min</metric-name>
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
