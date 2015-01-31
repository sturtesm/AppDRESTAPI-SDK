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
    
    public String whatIsDifferent(ExServletRule obj){
        if(this.equals(obj) ) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.SERVLET_RULE);;
        
        if(enabled!=obj.isEnabled()){
                bud.append(AppExportS.L3).append(AppExportS.ENABLED);
                bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
                bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
        }
        
        if(priority != obj.getPriority()){
                bud.append(AppExportS.L3).append(AppExportS.PRIORITY);
                bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(priority);
                bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPriority());
        }
       
        if(className != null){ bud.append(className.whatIsDifferent(obj.getClassName()));}
        else{ 
            if(obj.getClassName() != null){
                bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getClassName());
            }
        }
        
        if(uri != null){ bud.append(uri.whatIsDifferent(obj.getUri()));}
        else{
            if(obj.getUri() != null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getUri());
        }
        
        if(servletName != null){ bud.append(servletName.whatIsDifferent(obj.getServletName()));}
        else{
            if(obj.getServletName()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getServletName());
        }
        
        if(host != null){ bud.append(host.whatIsDifferent(obj.getHost()));}
        else{
            if(obj.getHost()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getHost());
        }
        
        if(port != null){ bud.append(port.whatIsDifferent(obj.getPort()));}
        else{
            if(obj.getPort()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getPort());
        }
        
        if(!httpMethod.equals(obj.getHttpMethod())){
                bud.append(AppExportS.L3).append(AppExportS.HTTP_METHOD);
                bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(httpMethod);
                bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getHttpMethod());
        }
        
        if(parameters != null){ bud.append(parameters.whatIsDifferent(obj.getParameters()));}
        else{
            if(obj.getParameters()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getParameters());
        }
        
        if(headers != null){ bud.append(headers.whatIsDifferent(obj.getHeaders()));}
        else{
            if(obj.getHeaders()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getHeaders());
        }
        
        if(cookies != null){ bud.append(cookies.whatIsDifferent(obj.getCookies()));}
        else{
            if(obj.getCookies()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getCookies());
        }
        
        if(properties != null){ bud.append(properties.whatIsDifferent(obj.getProperties()));}
        else{
            if(obj.getProperties()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getProperties());
        }
        
        if(genericMethodConfig != null){ bud.append(genericMethodConfig.whatIsDifferent(obj.getGenericMethodConfig()));}
        else{
            if(obj.getGenericMethodConfig()!= null) bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(obj.getGenericMethodConfig());
        }
        
        return bud.toString();
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.enabled ? 1 : 0);
        hash = 67 * hash + this.priority;
        hash = 67 * hash + (this.className != null ? this.className.hashCode() : 0);
        hash = 67 * hash + (this.uri != null ? this.uri.hashCode() : 0);
        hash = 67 * hash + (this.servletName != null ? this.servletName.hashCode() : 0);
        hash = 67 * hash + (this.host != null ? this.host.hashCode() : 0);
        hash = 67 * hash + (this.port != null ? this.port.hashCode() : 0);
        hash = 67 * hash + (this.parameters != null ? this.parameters.hashCode() : 0);
        hash = 67 * hash + (this.headers != null ? this.headers.hashCode() : 0);
        hash = 67 * hash + (this.cookies != null ? this.cookies.hashCode() : 0);
        hash = 67 * hash + (this.properties != null ? this.properties.hashCode() : 0);
        hash = 67 * hash + (this.genericMethodConfig != null ? this.genericMethodConfig.hashCode() : 0);
        hash = 67 * hash + (this.httpMethod != null ? this.httpMethod.hashCode() : 0);
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
        final ExServletRule other = (ExServletRule) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        if (this.className != other.className && (this.className == null || !this.className.equals(other.className))) {
            return false;
        }
        if (this.uri != other.uri && (this.uri == null || !this.uri.equals(other.uri))) {
            return false;
        }
        if (this.servletName != other.servletName && (this.servletName == null || !this.servletName.equals(other.servletName))) {
            return false;
        }
        if (this.host != other.host && (this.host == null || !this.host.equals(other.host))) {
            return false;
        }
        if (this.port != other.port && (this.port == null || !this.port.equals(other.port))) {
            return false;
        }
        if (this.parameters != other.parameters && (this.parameters == null || !this.parameters.equals(other.parameters))) {
            return false;
        }
        if (this.headers != other.headers && (this.headers == null || !this.headers.equals(other.headers))) {
            return false;
        }
        if (this.cookies != other.cookies && (this.cookies == null || !this.cookies.equals(other.cookies))) {
            return false;
        }
        if (this.properties != other.properties && (this.properties == null || !this.properties.equals(other.properties))) {
            return false;
        }
        if (this.genericMethodConfig != other.genericMethodConfig && (this.genericMethodConfig == null || !this.genericMethodConfig.equals(other.genericMethodConfig))) {
            return false;
        }
        if ((this.httpMethod == null) ? (other.httpMethod != null) : !this.httpMethod.equals(other.httpMethod)) {
            return false;
        }
        return true;
    }
    
    
    
}
