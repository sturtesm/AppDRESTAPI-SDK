/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */

@XmlSeeAlso(ExBackendMatchPointConfiguration.class)
public class ExBackendMatchPointConfigurations {
    private ArrayList<ExBackendMatchPointConfiguration> backendMatchPointConfiguration=new ArrayList<ExBackendMatchPointConfiguration>();
    private int level=4;
    
    public ExBackendMatchPointConfigurations(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.BACKEND_MATCH_POINT_CONFIGURATION)
    public ArrayList<ExBackendMatchPointConfiguration> getBackendMatchPointConfiguration() {
        return backendMatchPointConfiguration;
    }

    public void setBackendMatchPointConfiguration(ArrayList<ExBackendMatchPointConfiguration> backendMatchPointConfiguration) {
        this.backendMatchPointConfiguration = backendMatchPointConfiguration;
    }
    
    public String whatIsDifferent(ExBackendMatchPointConfigurations obj){
        if(this.equals(obj)) return AppExportS._U;
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATIONS);
        
        for(ExBackendMatchPointConfiguration value:backendMatchPointConfiguration){
            boolean fnd=false;
            for(ExBackendMatchPointConfiguration _value:obj.getBackendMatchPointConfiguration()){
                if(value.getAgentType().equals(_value.getAgentType())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExBackendMatchPointConfiguration value:obj.getBackendMatchPointConfiguration()){
            boolean fnd=false;
            for(ExBackendMatchPointConfiguration _value:backendMatchPointConfiguration){
                if(value.getAgentType().equals(_value.getAgentType())){
                    fnd=true;
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);   
            }
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_MATCH_POINT_CONFIGURATIONS);
        System.out.println("We have " + backendMatchPointConfiguration.size() + "  " + AppExportS.BACKEND_MATCH_POINT_CONFIGURATION);
        level++;
        for(ExBackendMatchPointConfiguration cfg: backendMatchPointConfiguration) {cfg.setLevel(level);bud.append(cfg);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.backendMatchPointConfiguration != null ? this.backendMatchPointConfiguration.hashCode() : 0);
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
        final ExBackendMatchPointConfigurations other = (ExBackendMatchPointConfigurations) obj;
        if (this.backendMatchPointConfiguration != other.backendMatchPointConfiguration && (this.backendMatchPointConfiguration == null || !this.backendMatchPointConfiguration.equals(other.backendMatchPointConfiguration))) {
            return false;
        }
        return true;
    }
    
    
    
}


/*
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