/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */


@XmlSeeAlso(ExApplicationComponent.class)
public class ExApplicationComponents {
    private ArrayList<ExApplicationComponent> applicationComponents=new ArrayList<ExApplicationComponent>();
    private int level=2;
    
    public ExApplicationComponents(){}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.APPLICATION_COMPONENT)
    public ArrayList<ExApplicationComponent> getApplicationComponents() {
        return applicationComponents;
    }

    public void setApplicationComponents(ArrayList<ExApplicationComponent> applicationComponents) {
        this.applicationComponents = applicationComponents;
    }
    
    public String whatIsDifferent(ExApplicationComponents obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENTS);
        level++;
        for(ExApplicationComponent value:applicationComponents){
            value.setLevel(level);
            boolean fnd=false;
            for(ExApplicationComponent _value:obj.getApplicationComponents()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd) bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
        }
        
        for(ExApplicationComponent value:obj.getApplicationComponents()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExApplicationComponent _value:applicationComponents){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd) bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENTS);
        level++;
        for(ExApplicationComponent ap:applicationComponents){ap.setLevel(level); bud.append(ap);}
        level++;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.applicationComponents != null ? this.applicationComponents.hashCode() : 0);
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
        final ExApplicationComponents other = (ExApplicationComponents) obj;
        if (this.applicationComponents != other.applicationComponents && (this.applicationComponents == null || !this.applicationComponents.equals(other.applicationComponents))) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
 *     <application-components>
        <application-component>
            <name>ApidLocker</name>
            <description/>
            <component-type>Application Server</component-type>
            <dynamic-scaling-enabled>false</dynamic-scaling-enabled>
            <entry-match-point-configurations/>
            <business-transactions>
                <business-transaction excluded="false" transaction-entry-point-type="SERVLET">
                    <name>/examples/jsp</name>
                    <business-transaction-name>/examples/jsp</business-transaction-name>
                    <application-component>ApidLocker</application-component>
                    <background>false</background>
                    <sla>
                        <art>
                            <critical enabled="true">30000</critical>
                            <warning enabled="true">15000</warning>
                        </art>
                        <epm>
                            <critical enabled="true">100</critical>
                            <warning enabled="true">20</warning>
                        </epm>
                    </sla>
                    <naming-config scheme="uri">
                        <name-values>
                            <name-value>
                                <name>segment-length</name>
                                <value>2</value>
                            </name-value>
                            <name-value>
                                <name>uri-length</name>
                                <value>first-n-segments</value>
                            </name-value>
                        </name-values>
                    </naming-config>
                    <business-transaction-config>
                        <snapshot-collection-policy>
                            <minute-frequency enabled="true">10</minute-frequency>
                            <nth-occurance enabled="false">100</nth-occurance>
                            <sla-violation collect-outliers-only="true"
                                duration="5" enabled="true"
                                max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
                            <automatic-collection-enabled>true</automatic-collection-enabled>
                            <automatic-slow-volume-percentage-threshold>10</automatic-slow-volume-percentage-threshold>
                            <automatic-error-volume-percentage-threshold>10</automatic-error-volume-percentage-threshold>
                        </snapshot-collection-policy>
                        <bt-request-thresholds>
                            <starting-node-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </starting-node-slow-threshold>
                            <continuing-segment-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </continuing-segment-slow-threshold>
                            <exit-call-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </exit-call-slow-threshold>
                            <starting-node-extremely-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>4.0</standard-deviation-threshold>
                            </starting-node-extremely-slow-threshold>
                            <stall-configuration>
                                <absolute>true</absolute>
                                <absolute-time-in-secs>45</absolute-time-in-secs>
                                <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                            </stall-configuration>
                        </bt-request-thresholds>
                    </business-transaction-config>
                    <data-gatherer-config>Default HTTP Request Data Collector</data-gatherer-config>
                    <data-gatherer-config>Default SQL Data Collector</data-gatherer-config>
                    <enabled-for-eum>false</enabled-for-eum>
                    <eum-auto-enable-possible>NOT_DISCOVERED</eum-auto-enable-possible>
                </business-transaction>
                <business-transaction excluded="false" transaction-entry-point-type="SERVLET">
                    <name>/manager/401.jsp</name>
                    <business-transaction-name>/manager/401.jsp</business-transaction-name>
                    <application-component>ApidLocker</application-component>
                    <background>false</background>
                    <sla>
                        <art>
                            <critical enabled="true">30000</critical>
                            <warning enabled="true">15000</warning>
                        </art>
                        <epm>
                            <critical enabled="true">100</critical>
                            <warning enabled="true">20</warning>
                        </epm>
                    </sla>
                    <naming-config scheme="uri">
                        <name-values>
                            <name-value>
                                <name>segment-length</name>
                                <value>2</value>
                            </name-value>
                            <name-value>
                                <name>uri-length</name>
                                <value>first-n-segments</value>
                            </name-value>
                        </name-values>
                    </naming-config>
                    <business-transaction-config>
                        <snapshot-collection-policy>
                            <minute-frequency enabled="true">10</minute-frequency>
                            <nth-occurance enabled="false">100</nth-occurance>
                            <sla-violation collect-outliers-only="true"
                                duration="5" enabled="true"
                                max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
                            <automatic-collection-enabled>true</automatic-collection-enabled>
                            <automatic-slow-volume-percentage-threshold>10</automatic-slow-volume-percentage-threshold>
                            <automatic-error-volume-percentage-threshold>10</automatic-error-volume-percentage-threshold>
                        </snapshot-collection-policy>
                        <bt-request-thresholds>
                            <starting-node-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </starting-node-slow-threshold>
                            <continuing-segment-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </continuing-segment-slow-threshold>
                            <exit-call-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </exit-call-slow-threshold>
                            <starting-node-extremely-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>4.0</standard-deviation-threshold>
                            </starting-node-extremely-slow-threshold>
                            <stall-configuration>
                                <absolute>true</absolute>
                                <absolute-time-in-secs>45</absolute-time-in-secs>
                                <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                            </stall-configuration>
                        </bt-request-thresholds>
                    </business-transaction-config>
                    <data-gatherer-config>Default HTTP Request Data Collector</data-gatherer-config>
                    <data-gatherer-config>Default SQL Data Collector</data-gatherer-config>
                    <enabled-for-eum>false</enabled-for-eum>
                    <eum-auto-enable-possible>NOT_DISCOVERED</eum-auto-enable-possible>
                </business-transaction>
                <business-transaction excluded="false" transaction-entry-point-type="SERVLET">
                    <name>/apidlock/v2</name>
                    <business-transaction-name>/apidlock/v2</business-transaction-name>
                    <application-component>ApidLocker</application-component>
                    <background>false</background>
                    <sla>
                        <art>
                            <critical enabled="true">30000</critical>
                            <warning enabled="true">15000</warning>
                        </art>
                        <epm>
                            <critical enabled="true">100</critical>
                            <warning enabled="true">20</warning>
                        </epm>
                    </sla>
                    <naming-config scheme="uri">
                        <name-values>
                            <name-value>
                                <name>segment-length</name>
                                <value>2</value>
                            </name-value>
                            <name-value>
                                <name>uri-length</name>
                                <value>first-n-segments</value>
                            </name-value>
                        </name-values>
                    </naming-config>
                    <business-transaction-config>
                        <snapshot-collection-policy>
                            <minute-frequency enabled="true">10</minute-frequency>
                            <nth-occurance enabled="false">100</nth-occurance>
                            <sla-violation collect-outliers-only="true"
                                duration="5" enabled="true"
                                max-attempts-for-outliers="20" warning-violation="true">5</sla-violation>
                            <automatic-collection-enabled>true</automatic-collection-enabled>
                            <automatic-slow-volume-percentage-threshold>10</automatic-slow-volume-percentage-threshold>
                            <automatic-error-volume-percentage-threshold>10</automatic-error-volume-percentage-threshold>
                        </snapshot-collection-policy>
                        <bt-request-thresholds>
                            <starting-node-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </starting-node-slow-threshold>
                            <continuing-segment-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </continuing-segment-slow-threshold>
                            <exit-call-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>3.0</standard-deviation-threshold>
                            </exit-call-slow-threshold>
                            <starting-node-extremely-slow-threshold>
                                <evaluation-type>STANDARD_DEVIATION</evaluation-type>
                                <evaluation-mins>120</evaluation-mins>
                                <standard-deviation-threshold>4.0</standard-deviation-threshold>
                            </starting-node-extremely-slow-threshold>
                            <stall-configuration>
                                <absolute>true</absolute>
                                <absolute-time-in-secs>45</absolute-time-in-secs>
                                <bt-sla-violation-multiplier>0</bt-sla-violation-multiplier>
                            </stall-configuration>
                        </bt-request-thresholds>
                    </business-transaction-config>
                    <data-gatherer-config>Default HTTP Request Data Collector</data-gatherer-config>
                    <data-gatherer-config>Default SQL Data Collector</data-gatherer-config>
                    <enabled-for-eum>false</enabled-for-eum>
                    <eum-auto-enable-possible>NOT_DISCOVERED</eum-auto-enable-possible>
                </business-transaction>
            </business-transactions>
            <memory-configuration>
                <size-polling-interval>10</size-polling-interval>
                <enable-cache-framework-size-monitoring>true</enable-cache-framework-size-monitoring>
                <enable-memory-monitoring>true</enable-memory-monitoring>
            </memory-configuration>
            <instance-tracker-configurations/>
            <cache-configuration>
                <disable-cache-monitoring>false</disable-cache-monitoring>
                <disable-standard-cache-frameworks>false</disable-standard-cache-frameworks>
            </cache-configuration>
            <custom-cache-configurations/>
            <backend-match-point-configurations/>
            <agent-configurations/>
        </application-component>
 * 
 * 
 */