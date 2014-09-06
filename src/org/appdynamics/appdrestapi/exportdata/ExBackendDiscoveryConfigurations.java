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
 * <backend-discovery-configurations>
                <backend-discovery-configuration>
                    <name>Default Cassandra configuration</name>
                    <backend-identity-options>
                        <backend-identity-option>
                            <name>Host</name>
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
                            <naming-actions/>
                            <enabled>true</enabled>
                        </backend-identity-option>
                        <backend-identity-option>
                            <name>Port</name>
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
                            <naming-actions/>
                            <enabled>true</enabled>
                        </backend-identity-option>
                        <backend-identity-option>
                            <name>transport</name>
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
                            <naming-actions/>
                            <enabled>true</enabled>
                        </backend-identity-option>
                        <backend-identity-option>
                            <name>keyspace</name>
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
                            <naming-actions/>
                            <enabled>true</enabled>
                        </backend-identity-option>
                    </backend-identity-options>
                    <backend-discovery-conditions/>
 */
@XmlSeeAlso({ExBackendDiscoveryConfiguration.class,ExBackendDiscoveryConditions.class,ExBackendIdentityOptions.class,ExBackendIdentityOption.class,ExNamingOptions.class,ExNamingActions.class,ExNameValue.class})
public class ExBackendDiscoveryConfigurations {
    private ArrayList<ExBackendDiscoveryConfiguration> backendDiscoveryConfigurations = new ArrayList<ExBackendDiscoveryConfiguration>();
    
    
    public ExBackendDiscoveryConfigurations(){}

    @XmlElement(name=AppExportS.BACKEND_DISCOVERY_CONFIGURATION)
    public ArrayList<ExBackendDiscoveryConfiguration> getBackendDiscoveryConfigurations() {
        return backendDiscoveryConfigurations;
    }

    public void setBackendDiscoveryConfigurations(ArrayList<ExBackendDiscoveryConfiguration> backendDiscoveryConfigurations) {
        this.backendDiscoveryConfigurations = backendDiscoveryConfigurations;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.BACKEND_DISCOVERY_CONFIGURATIONS);
        for(ExBackendDiscoveryConfiguration bdc: backendDiscoveryConfigurations) bud.append(bdc.toString());
        return bud.toString();
    }
}
