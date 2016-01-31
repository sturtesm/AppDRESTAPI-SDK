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

@XmlSeeAlso(ExBackendDiscoveryConfiguration.class)
public class ExBackendDiscoveryConfigurations {
    private ArrayList<ExBackendDiscoveryConfiguration> backendDiscoveryConfigurations = new ArrayList<ExBackendDiscoveryConfiguration>();
    private int level=5;
    
    public ExBackendDiscoveryConfigurations(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.BACKEND_DISCOVERY_CONFIGURATION)
    public ArrayList<ExBackendDiscoveryConfiguration> getBackendDiscoveryConfigurations() {
        return backendDiscoveryConfigurations;
    }

    public void setBackendDiscoveryConfigurations(ArrayList<ExBackendDiscoveryConfiguration> backendDiscoveryConfigurations) {
        this.backendDiscoveryConfigurations = backendDiscoveryConfigurations;
    }
    
    public String whatIsDifferent(ExBackendDiscoveryConfigurations obj){
        if(this.equals(obj)) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONFIGURATIONS);
        level++;
        for(ExBackendDiscoveryConfiguration value:backendDiscoveryConfigurations){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBackendDiscoveryConfiguration _value:obj.getBackendDiscoveryConfigurations()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExBackendDiscoveryConfiguration value:obj.getBackendDiscoveryConfigurations()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBackendDiscoveryConfiguration _value:backendDiscoveryConfigurations){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);   
            }
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONFIGURATIONS);
        level++;
        for(ExBackendDiscoveryConfiguration bdc: backendDiscoveryConfigurations){ bdc.setLevel(level);bud.append(bdc);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (this.backendDiscoveryConfigurations != null ? this.backendDiscoveryConfigurations.hashCode() : 0);
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
        final ExBackendDiscoveryConfigurations other = (ExBackendDiscoveryConfigurations) obj;
        
        if(other.getBackendDiscoveryConfigurations().size() != getBackendDiscoveryConfigurations().size() ) return false;
        
        for(ExBackendDiscoveryConfiguration value:backendDiscoveryConfigurations){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBackendDiscoveryConfiguration _value:other.getBackendDiscoveryConfigurations()){
                if(value.getName().equals(_value.getName())){
                    if(!value.equals(_value)) return false;
                    fnd=true;

                }
            }
            if(!fnd){                
                return false; 
            }
        }
        return true;
    }
    
    
}

/*
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