/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 * <backend-match-point-configuration>
            <override>true</override>
            <agent-type>APP_AGENT</agent-type>
            <custom-exit-point-definitions/>
            <backend-discovery-configurations>
                <backend-discovery-configuration>
                    <name>Default Cassandra configuration</name>
                    <backend-identity-options/>
                    <backend-discovery-conditions/>
                    <discovery-enabled>true</discovery-enabled>
                    <correlation-enabled>true</correlation-enabled>
                    <supports-correlation>true</supports-correlation>
                    <priority>0</priority>
                    <exit-point-type>CASSANDRA</exit-point-type>
                </backend-discovery-configuration>
 */

@XmlSeeAlso({ExBackendIdentityOptions.class,ExBackendIdentityOption.class,ExNamingOptions.class,ExNamingActions.class,ExNameValue.class})
public class ExBackendDiscoveryConfiguration {
    private String name;
    private ExBackendIdentityOptions backendIdentityOptions;
    private ExBackendDiscoveryConditions backendDiscoveryConditions;
    private boolean discoveryEnabled;
    private boolean correlationEnabled;
    private boolean supportsCorrelation;
    private int priority;
    private String exitPointType;
    
    public ExBackendDiscoveryConfiguration(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.BACKEND_IDENTITY_OPTIONS)
    public ExBackendIdentityOptions getBackendIdentityOptions() {
        return backendIdentityOptions;
    }

    public void setBackendIdentityOptions(ExBackendIdentityOptions backendIdentityOptions) {
        this.backendIdentityOptions = backendIdentityOptions;
    }

    @XmlElement(name=AppExportS.BACKEND_DISCOVERY_CONFIGURATIONS)
    public ExBackendDiscoveryConditions getBackendDiscoveryConditions() {
        return backendDiscoveryConditions;
    }

    public void setBackendDiscoveryConditions(ExBackendDiscoveryConditions backendDiscoveryConditions) {
        this.backendDiscoveryConditions = backendDiscoveryConditions;
    }

    @XmlElement(name=AppExportS.DISCOVERY_ENABLED)
    public boolean isDiscoveryEnabled() {
        return discoveryEnabled;
    }

    public void setDiscoveryEnabled(boolean discoveryEnabled) {
        this.discoveryEnabled = discoveryEnabled;
    }

    @XmlElement(name=AppExportS.CORRELATION_ENABLED)
    public boolean isCorrelationEnabled() {
        return correlationEnabled;
    }

    public void setCorrelationEnabled(boolean correlationEnabled) {
        this.correlationEnabled = correlationEnabled;
    }

    @XmlElement(name=AppExportS.SUPPORTS_CORRELATION)
    public boolean isSupportsCorrelation() {
        return supportsCorrelation;
    }

    public void setSupportsCorrelation(boolean supportsCorrelation) {
        this.supportsCorrelation = supportsCorrelation;
    }

    @XmlElement(name=AppExportS.PRIORITY)
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @XmlElement(name=AppExportS.EXIT_POINT_TYPE)
    public String getExitPointType() {
        return exitPointType;
    }

    public void setExitPointType(String exitPointType) {
        this.exitPointType = exitPointType;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.BACKEND_DISCOVERY_CONFIGURATION);
        bud.append(AppExportS.L3).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L3).append(AppExportS.DISCOVERY_ENABLED).append(AppExportS.VE).append(discoveryEnabled);
        bud.append(AppExportS.L3).append(AppExportS.CORRELATION_ENABLED).append(AppExportS.VE).append(correlationEnabled);
        bud.append(AppExportS.L3).append(AppExportS.SUPPORTS_CORRELATION).append(AppExportS.VE).append(supportsCorrelation);
        bud.append(AppExportS.L3).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);
        bud.append(AppExportS.L3).append(AppExportS.EXIT_POINT_TYPE).append(AppExportS.VE).append(exitPointType);
        if(backendIdentityOptions != null) bud.append(backendIdentityOptions.toString());
        if(backendDiscoveryConditions != null) bud.append(backendDiscoveryConditions.toString());
        return bud.toString();
    }
    
}
