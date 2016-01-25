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
import java.util.Objects;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExBackendDiscoveryCondition.class)
public class ExBackendDiscoveryConditions {
    private ArrayList<ExBackendDiscoveryCondition> bkConditions = new ArrayList<ExBackendDiscoveryCondition>();
    private int level=6;
    
    
    
    public ExBackendDiscoveryConditions(){}

    @XmlElement(name=AppExportS.BACKEND_DISCOVERY_CONDITION)
    public ArrayList<ExBackendDiscoveryCondition> getBkConditions() {
        return bkConditions;
    }

    public void setBkConditions(ArrayList<ExBackendDiscoveryCondition> bkConditions) {
        this.bkConditions = bkConditions;
    }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONDITIONS);
        level++;
        for(ExBackendDiscoveryCondition cond: bkConditions){cond.setLevel(level); bud.append(cond);}
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExBackendDiscoveryConditions obj){
        if(this.equals(obj)) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_DISCOVERY_CONDITIONS);
        level++;
        for(ExBackendDiscoveryCondition value:bkConditions){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBackendDiscoveryCondition _value:obj.getBkConditions()){
                if(value.getIdentiyName().equals(_value.getIdentiyName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExBackendDiscoveryCondition value:obj.getBkConditions()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBackendDiscoveryCondition _value:bkConditions){
                if(value.getIdentiyName().equals(_value.getIdentiyName())){
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
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.bkConditions);
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
        final ExBackendDiscoveryConditions other = (ExBackendDiscoveryConditions) obj;
        if (!Objects.equals(this.bkConditions, other.bkConditions)) {
            return false;
        }
        return true;
    }

    
}

/*
<backend-discovery-conditions>
                                <backend-discovery-condition>
                                    <identity-name>Service</identity-name>
                                    <match-type>REGEX</match-type>
                                    <match-pattern>.*</match-pattern>
                                    <inverse>false</inverse>
                                </backend-discovery-condition>
</backend-discovery-conditions>
                                <backend-discovery-condition>
                                    <identity-name>URL</identity-name>
                                    <match-type>REGEX</match-type>
                                    <match-pattern>\w*:\/\/api-int.stubprod.com:*\d*\/\w*\/\w*\/\w*.*</match-pattern>
                                    <inverse>false</inverse>
                                </backend-discovery-condition>
*/
