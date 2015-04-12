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
    private Object backendDiscoveryConditions; //I don't have an example
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
    public Object getBackendDiscoveryConditions() {
        return backendDiscoveryConditions;
    }

    public void setBackendDiscoveryConditions(Object backendDiscoveryConditions) {
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
    
    /*
    private String name;
    private ExBackendIdentityOptions backendIdentityOptions;
    private Object backendDiscoveryConditions; //I don't have an example
    private boolean discoveryEnabled;
    private boolean correlationEnabled;
    private boolean supportsCorrelation;
    private int priority;
    private String exitPointType;
    */
    public String whatIsDifferent(ExBackendDiscoveryConfiguration obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.BACKEND_DISCOVERY_CONFIGURATION);
        bud.append(AppExportS.L3).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!exitPointType.equals(obj.getExitPointType())){
            bud.append(AppExportS.L3).append(AppExportS.EXIT_POINT_TYPE);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(exitPointType);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getExitPointType()); 
            
        }
        if(discoveryEnabled != obj.isDiscoveryEnabled()){
            bud.append(AppExportS.L3).append(AppExportS.DISCOVERY_ENABLED);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(discoveryEnabled);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isDiscoveryEnabled()); 
            
        }
        
        if(correlationEnabled != obj.isCorrelationEnabled()){
            bud.append(AppExportS.L3).append(AppExportS.CORRELATION_ENABLED);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(correlationEnabled);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isCorrelationEnabled()); 
            
        }
        
        if(supportsCorrelation != obj.isSupportsCorrelation()){
            bud.append(AppExportS.L3).append(AppExportS.SUPPORTS_CORRELATION);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(supportsCorrelation);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isSupportsCorrelation()); 
            
        }
        
        if(priority != obj.getPriority()){
            bud.append(AppExportS.L3).append(AppExportS.PRIORITY);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(priority);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPriority()); 
            
        }
        
        bud.append(backendIdentityOptions.whatIsDifferent(obj.getBackendIdentityOptions()));
        //bud.append(backendDiscoveryConditions.whatIsDifferent(obj.getBackendDiscoveryConditions()));
        return bud.toString();
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
        bud.append(backendIdentityOptions);
        if(backendDiscoveryConditions != null) bud.append(backendDiscoveryConditions);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 59 * hash + (this.backendIdentityOptions != null ? this.backendIdentityOptions.hashCode() : 0);
        hash = 59 * hash + (this.backendDiscoveryConditions != null ? this.backendDiscoveryConditions.hashCode() : 0);
        hash = 59 * hash + (this.discoveryEnabled ? 1 : 0);
        hash = 59 * hash + (this.correlationEnabled ? 1 : 0);
        hash = 59 * hash + (this.supportsCorrelation ? 1 : 0);
        hash = 59 * hash + this.priority;
        hash = 59 * hash + (this.exitPointType != null ? this.exitPointType.hashCode() : 0);
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
        final ExBackendDiscoveryConfiguration other = (ExBackendDiscoveryConfiguration) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.backendIdentityOptions != other.backendIdentityOptions && (this.backendIdentityOptions == null || !this.backendIdentityOptions.equals(other.backendIdentityOptions))) {
            return false;
        }
        if (this.backendDiscoveryConditions != other.backendDiscoveryConditions && (this.backendDiscoveryConditions == null || !this.backendDiscoveryConditions.equals(other.backendDiscoveryConditions))) {
            return false;
        }
        if (this.discoveryEnabled != other.discoveryEnabled) {
            return false;
        }
        if (this.correlationEnabled != other.correlationEnabled) {
            return false;
        }
        if (this.supportsCorrelation != other.supportsCorrelation) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        if ((this.exitPointType == null) ? (other.exitPointType != null) : !this.exitPointType.equals(other.exitPointType)) {
            return false;
        }
        return true;
    }
    
    
    
}
