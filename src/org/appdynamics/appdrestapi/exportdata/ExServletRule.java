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
 * 
 * 
                            <exclude name="CometD Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.cometd.server.CometdServlet"/>
                                </servlet-rule>
                            </exclude>
                            * 
                            * 
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="com.sun.DA"/>
                                    <servlet-name filter-type="EQUALS" filter-value="Foo"/>
                                    <uri filter-type="EQUALS" filter-value="nope"/>
                                    <host filter-type="STARTSWITH" filter-value="linux-debian"/>
                                    <port filter-type="EQUALS" filter-value="2323"/>
                                    
                                    <http-method>GET</http-method>
                                    <parameters>
                                        <parameter match-type="compare-value">
                                            <name filter-type="EQUALS" filter-value="cook"/>
                                            <value filter-type="EQUALS" filter-value="foo"/>
                                        </parameter>
                                    </parameters>
                                    <headers>
                                        <header match-type="compare-value">
                                            <name filter-type="EQUALS" filter-value="like"/>
                                            <value filter-type="EQUALS" filter-value="you"/>
                                        </header>
                                    </headers>
                                    <cookies>
                                        <cookie match-type="check-for-existence">
                                        <name filter-type="EQUALS" filter-value="nah"/>
                                        </cookie>
                                    </cookies>
                                    <properties>
                                        <property name="uri-suffix-scheme" value="custom-expression"/>
                                        <property name="suffix-key" value="${}"/>
                                    </properties>
                                    <generic-method-config>
                                        <class-name>org.json.JSONObject</class-name>
                                        <method-config return-type="true">
                                            <name>mapName</name>
                                        </method-config>
                                    </generic-method-config>
                                </servlet-rule>
 * 
 */
@XmlSeeAlso({ExMatchClassName.class,ExParameters.class,ExHeaders.class,ExCookies.class,ExNVProperties.class,ExGenericMethodConfig.class})
public class ExServletRule {

    private boolean enabled;
    private int priority;
    private ExMatchClassName className,uri,servletName,host,port;
    private ExParameters parameters;
    private ExHeaders headers;
    private ExCookies cookies;
    private ExNVProperties properties;
    private ExGenericMethodConfig genericMethodConfig;
    private String httpMethod;
    

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.PRIORITY)
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @XmlElement(name=AppExportS.CLASS_NAME)
    public ExMatchClassName getClassName() {
        return className;
    }

    public void setClassName(ExMatchClassName className) {
        this.className = className;
    }

    @XmlElement(name=AppExportS.URI)
    public ExMatchClassName getUri() {
        return uri;
    }

    public void setUri(ExMatchClassName uri) {
        this.uri = uri;
    }

    @XmlElement(name=AppExportS.SERVLET_NAME)
    public ExMatchClassName getServletName() {
        return servletName;
    }

    public void setServletName(ExMatchClassName servletName) {
        this.servletName = servletName;
    }

    @XmlElement(name=AppExportS.HOST)
    public ExMatchClassName getHost() {
        return host;
    }

    public void setHost(ExMatchClassName host) {
        this.host = host;
    }

    @XmlElement(name=AppExportS.PORT)
    public ExMatchClassName getPort() {
        return port;
    }

    public void setPort(ExMatchClassName port) {
        this.port = port;
    }

    @XmlElement(name=AppExportS.HTTP_METHOD)
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @XmlElement(name=AppExportS.PARAMETERS)
    public ExParameters getParameters() {
        return parameters;
    }

    public void setParameters(ExParameters parameters) {
        this.parameters = parameters;
    }

    @XmlElement(name=AppExportS.HEADERS)
    public ExHeaders getHeaders() {
        return headers;
    }

    public void setHeaders(ExHeaders headers) {
        this.headers = headers;
    }

    @XmlElement(name=AppExportS.COOKIES)
    public ExCookies getCookies() {
        return cookies;
    }

    public void setCookies(ExCookies cookies) {
        this.cookies = cookies;
    }

    @XmlElement(name=AppExportS.PROPERTIES)
    public ExNVProperties getProperties() {
        return properties;
    }

    public void setProperties(ExNVProperties properties) {
        this.properties = properties;
    }

    @XmlElement(name=AppExportS.GENERIC_METHOD_CONFIG)
    public ExGenericMethodConfig getGenericMethodConfig() {
        return genericMethodConfig;
    }

    public void setGenericMethodConfig(ExGenericMethodConfig genericMethodConfig) {
        this.genericMethodConfig = genericMethodConfig;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.SERVLET_RULE);
        bud.append(AppExportS.L3).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.L3).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);
        if(className != null) bud.append(AppExportS.L3).append(AppExportS.CLASS_NAME).append(className);
        if(uri != null) bud.append(AppExportS.L3).append(AppExportS.URI).append(uri);
        if(servletName != null) bud.append(AppExportS.L3).append(AppExportS.SERVLET_NAME).append(servletName);
        if(host != null) bud.append(AppExportS.L3).append(AppExportS.HOST).append(host);
        if(port != null) bud.append(AppExportS.L3).append(AppExportS.PORT).append(port);
        if(httpMethod != null) bud.append(AppExportS.L3).append(AppExportS.CLASS_NAME).append(httpMethod);
        if(parameters != null) bud.append(parameters);
        if(headers != null) bud.append(headers);
        if(cookies != null) bud.append(cookies);
        if(properties != null) bud.append(properties);
        if(genericMethodConfig != null) bud.append(genericMethodConfig);
        
        
        return bud.toString();
    }
    
}
