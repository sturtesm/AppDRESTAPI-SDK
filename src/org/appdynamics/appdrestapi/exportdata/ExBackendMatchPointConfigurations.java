/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * <backend-match-point-configurations>
        <backend-match-point-configuration>
            <override>true</override>
            <agent-type>APP_AGENT</agent-type>
            <custom-exit-point-definitions/>
            <backend-discovery-configurations>
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
                    <discovery-enabled>true</discovery-enabled>
                    <correlation-enabled>true</correlation-enabled>
                    <supports-correlation>true</supports-correlation>
                    <priority>0</priority>
                    <exit-point-type>CASSANDRA</exit-point-type>
                </backend-discovery-configuration>
                <backend-discovery-configuration>
                    <name>Default HTTP configuration</name>
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
                            <name>URL</name>
                            <naming-options>
                                <name-value>
                                    <name>use-segments</name>
                                    <value>true</value>
                                </name-value>
                                <name-value>
                                    <name>split-delimiter</name>
                                    <value>/</value>
                                </name-value>
                                <name-value>
                                    <name>merge-delimiter</name>
                                    <value>/</value>
                                </name-value>
                            </naming-options>
                            <naming-actions>
                                <name-value>
                                    <name>segment-type</name>
                                    <value>first-n</value>
                                </name-value>
                                <name-value>
                                    <name>segment-count</name>
                                    <value>2</value>
                                </name-value>
                            </naming-actions>
                            <enabled>false</enabled>
                        </backend-identity-option>
                        <backend-identity-option>
                            <name>Query String</name>
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
                            <naming-actions/>
                            <enabled>false</enabled>
                        </backend-identity-option>
                    </backend-identity-options>
                    <backend-discovery-conditions/>
                    <discovery-enabled>true</discovery-enabled>
                    <correlation-enabled>true</correlation-enabled>
                    <supports-correlation>true</supports-correlation>
                    <priority>0</priority>
                    <exit-point-type>HTTP</exit-point-type>
                </backend-discovery-configuration>
 * 
 */
@XmlSeeAlso(ExBackendMatchPointConfiguration.class)
public class ExBackendMatchPointConfigurations {
    private ArrayList<ExBackendMatchPointConfiguration> backendMatchPointConfiguration=new ArrayList<ExBackendMatchPointConfiguration>();
    
    public ExBackendMatchPointConfigurations(){}

    @XmlElement(name=AppExportS.BACKEND_MATCH_POINT_CONFIGURATION)
    public ArrayList<ExBackendMatchPointConfiguration> getBackendMatchPointConfiguration() {
        return backendMatchPointConfiguration;
    }

    public void setBackendMatchPointConfiguration(ArrayList<ExBackendMatchPointConfiguration> backendMatchPointConfiguration) {
        this.backendMatchPointConfiguration = backendMatchPointConfiguration;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATIONS);
        for(ExBackendMatchPointConfiguration cfg: backendMatchPointConfiguration) bud.append(cfg.toString());
        return bud.toString();
    }
}
