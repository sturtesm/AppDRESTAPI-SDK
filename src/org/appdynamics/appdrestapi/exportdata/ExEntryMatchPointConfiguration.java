/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 */

@XmlSeeAlso({ExCustomMatchPointDefinitions.class,ExTransactionConfigurations.class})
public class ExEntryMatchPointConfiguration {
    private boolean override;
    private String agentType;
    private ExCustomMatchPointDefinitions customMatchPointDefinitions;
    private ExTransactionConfigurations transactionConfigurations;
    private int level=5;
    
    public ExEntryMatchPointConfiguration(){}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @XmlElement(name=AppExportS.OVERRIDE)
    public boolean isOverride() {
        return override;
    }

    public void setOverride(boolean override) {
        this.override = override;
    }

    @XmlElement(name=AppExportS.AGENT_TYPE)
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    @XmlElement(name=AppExportS.CUSTOM_MATCH_POINT_DEFINITIONS)
    public ExCustomMatchPointDefinitions getCustomMatchPointDefinitions() {
        return customMatchPointDefinitions;
    }

    public void setCustomMatchPointDefinitions(ExCustomMatchPointDefinitions customMatchPointDefinitions) {
        this.customMatchPointDefinitions = customMatchPointDefinitions;
    }

    @XmlElement(name=AppExportS.TRANSACTION_CONFIGURATIONS)
    public ExTransactionConfigurations getTransactionConfigurations() {
        return transactionConfigurations;
    }

    public void setTransactionConfigurations(ExTransactionConfigurations transactionConfigurations) {
        this.transactionConfigurations = transactionConfigurations;
    }
    
    public String whatIsDifferent(ExEntryMatchPointConfiguration obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        
        if(override != obj.isOverride()){
            bud.append(AppExportS.I[level]).append(AppExportS.OVERRIDE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(override);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isOverride());
            level--;
        }
        
        if(transactionConfigurations != null) {
            transactionConfigurations.setLevel(level);
            bud.append(transactionConfigurations.whatIsDifferent(obj.getTransactionConfigurations()));
        }
        
        if(customMatchPointDefinitions != null){
            customMatchPointDefinitions.setLevel(level);
            bud.append(customMatchPointDefinitions.whatIsDifferent(obj.getCustomMatchPointDefinitions()));            
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ENTRY_MATCH_POINT_CONFIGURATION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.OVERRIDE).append(AppExportS.VE).append(override);
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
       if(transactionConfigurations != null) {  transactionConfigurations.setLevel(level); }
        bud.append(transactionConfigurations);
        if(customMatchPointDefinitions != null){customMatchPointDefinitions.setLevel(level);}
        bud.append(customMatchPointDefinitions);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.override ? 1 : 0);
        hash = 31 * hash + (this.agentType != null ? this.agentType.hashCode() : 0);
        hash = 31 * hash + (this.customMatchPointDefinitions != null ? this.customMatchPointDefinitions.hashCode() : 0);
        hash = 31 * hash + (this.transactionConfigurations != null ? this.transactionConfigurations.hashCode() : 0);
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
        final ExEntryMatchPointConfiguration other = (ExEntryMatchPointConfiguration) obj;
        if (this.override != other.override) {
            return false;
        }
        if ((this.agentType == null) ? (other.agentType != null) : !this.agentType.equals(other.agentType)) {
            return false;
        }
        if (this.customMatchPointDefinitions != other.customMatchPointDefinitions && (this.customMatchPointDefinitions == null || !this.customMatchPointDefinitions.equals(other.customMatchPointDefinitions))) {
            return false;
        }
        if (this.transactionConfigurations != other.transactionConfigurations && (this.transactionConfigurations == null || !this.transactionConfigurations.equals(other.transactionConfigurations))) {
            return false;
        }
        return true;
    }
    
    
    
}


/*
 * 
 * <entry-match-point-configuration>
            <override>true</override>
            <agent-type>APP_AGENT</agent-type>
            <transaction-configurations>
                <configuration transaction-entry-point-type="BINARY_REMOTING">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="SIMPLE_CLASS_NAME_AND_METHOD_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="EJB">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>false</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="EJB_NAME_AND_METHOD_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="JMS">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="DESTINATION_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="POJO">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>false</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="FULLY_QUALIFIED_CLASS_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="SERVLET">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes>
                            <exclude name="Apache Axis Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.axis.transport.http.AxisServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Apache Axis2 Admin Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.axis2.transport.http.AxisAdminServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Apache Axis2 Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.axis2.transport.http.AxisServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="CometD Annotation Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.cometd.annotation.AnnotationCometdServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="CometD Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.cometd.server.CometdServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="JAX WS RI Dispatcher Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="com.sun.xml.ws.transport.http.servlet.WSServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="JBoss web-services servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.jboss.wsf.stack.jbws.EndpointServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Spring WS - Base servlet for Spring's web framework">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.springframework.web.servlet.FrameworkServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Spring WS - dispatching of Web service messages">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.springframework.ws.transport.http.MessageDispatcherServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Struts Action Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.struts.action.ActionServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Weblogic JAX RPC Servlets">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="STARTSWITH" filter-value="weblogic.wsee.server.servlet."/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Weblogic JAX WS Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="weblogic.wsee.jaxws.JAXWSWebAppServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Weblogic JAX WS Webservice Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="weblogic.wsee.jaxws.JAXWSServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Websphere web-services axis Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="com.ibm.ws.websvcs.transport.http.WASAxis2Servlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Websphere web-services Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="com.ibm.ws.webservices.engine.transport.http.WebServicesServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="XFire web-services servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.codehaus.xfire.transport.http.XFireConfigurableServlet"/>
                                </servlet-rule>
                            </exclude>
                        </excludes>
                        <naming-config scheme="URI">
                            <name-values>
                                <name-value>
                                    <name>uri-length</name>
                                    <value>first-n-segments</value>
                                </name-value>
                                <name-value>
                                    <name>segment-length</name>
                                    <value>2</value>
                                </name-value>
                            </name-values>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="SPRING_BEAN">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>false</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="BEAN_ID_AND_METHOD_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="STRUTS_ACTION">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="ACTION_NAME_AND_METHOD_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="WEB_SERVICE">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="SERVICE_NAME_AND_OPERATION_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
            </transaction-configurations>
            <custom-match-point-definitions>
                <custom-match-point-definition transaction-entry-point-type="POJO">
                    <name>Cron4J</name>
                    <custom-business-transaction-name>Cron4J</custom-business-transaction-name>
                    <background>false</background>
                    <enabled>false</enabled>
                    <match-rule>
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>Cron4J</display-name>
                            <background>true</background>
                            <match-class type="inherits-from-class">
                                <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
                            </match-class>
                            <split-config type="4"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
                        </pojo-rule>
                    </match-rule>
                </custom-match-point-definition>
                <custom-match-point-definition transaction-entry-point-type="POJO">
                    <name>JavaTimer</name>
                    <custom-business-transaction-name>JavaTimer</custom-business-transaction-name>
                    <background>false</background>
                    <enabled>false</enabled>
                    <match-rule>
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>JavaTimer</display-name>
                            <background>true</background>
                            <match-class type="inherits-from-class">
                                <name filter-type="EQUALS" filter-value="java.util.TimerTask"/>
                            </match-class>
                            <split-config type="4"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="run"/>
                            </match-method>
                        </pojo-rule>
                    </match-rule>
                </custom-match-point-definition>
                <custom-match-point-definition transaction-entry-point-type="POJO">
                    <name>JCronTab</name>
                    <custom-business-transaction-name>JCronTab</custom-business-transaction-name>
                    <background>false</background>
                    <enabled>false</enabled>
                    <match-rule>
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>JCronTab</display-name>
                            <background>true</background>
                            <match-class type="matches-class">
                                <name filter-type="EQUALS" filter-value="org.jcrontab.CronTask"/>
                            </match-class>
                            <split-config operation="strClassName" type="2"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="runTask"/>
                            </match-method>
                        </pojo-rule>
                    </match-rule>
                </custom-match-point-definition>
                <custom-match-point-definition transaction-entry-point-type="POJO">
                    <name>Quartz</name>
                    <custom-business-transaction-name>Quartz</custom-business-transaction-name>
                    <background>false</background>
                    <enabled>false</enabled>
                    <match-rule>
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>Quartz</display-name>
                            <background>true</background>
                            <match-class type="implements-interface">
                                <name filter-type="EQUALS" filter-value="org.quartz.Job"/>
                            </match-class>
                            <split-config type="4"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
                        </pojo-rule>
                    </match-rule>
                </custom-match-point-definition>
            </custom-match-point-definitions>
        </entry-match-point-configuration>
 */