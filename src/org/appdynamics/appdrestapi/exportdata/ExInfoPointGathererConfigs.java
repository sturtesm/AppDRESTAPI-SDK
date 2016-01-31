/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExInfoPointGathererConfig.class)
public class ExInfoPointGathererConfigs {
    private ArrayList<ExInfoPointGathererConfig> infoPoints=new ArrayList<ExInfoPointGathererConfig>();
    private int level=2;
    
    public ExInfoPointGathererConfigs(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.INFO_POINT_GATHERER_CONFIG)
    public ArrayList<ExInfoPointGathererConfig> getInfoPoints() {
        return infoPoints;
    }

    public void setInfoPoints(ArrayList<ExInfoPointGathererConfig> infoPoints) {
        this.infoPoints = infoPoints;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.INFO_POINT_GATHERER_CONFIGS);
        level++;
        for(ExInfoPointGathererConfig cfg: infoPoints){ cfg.setLevel(level);bud.append(cfg);}
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExInfoPointGathererConfigs obj){
        if(this.equals(obj)) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.INFO_POINT_GATHERER_CONFIGS);
        level++;
        
        for(ExInfoPointGathererConfig value:infoPoints){
            value.setLevel(level);
            boolean fnd=false;
            for(ExInfoPointGathererConfig _value:obj.getInfoPoints()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExInfoPointGathererConfig value:obj.getInfoPoints()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExInfoPointGathererConfig _value:infoPoints){
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
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.infoPoints);
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
        final ExInfoPointGathererConfigs other = (ExInfoPointGathererConfigs) obj;
        
        if(infoPoints.size() != other.getInfoPoints().size()) return false;
        
        for(ExInfoPointGathererConfig value:infoPoints){
            value.setLevel(level);
            boolean fnd=false;
            for(ExInfoPointGathererConfig _value:other.getInfoPoints()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value))fnd=true;
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
<info-point-gatherer-config>
            <name>Venue Memcache Entries</name>
            <agent-type>java-app-agent</agent-type>
            <pojo-method-definition>
                <class-name>com.stubhub.common.cache.manager.EntityCacheManager</class-name>
                <method-name>putCrossModuleValue</method-name>
                <match-type>IMPLEMENTS_INTERFACE</match-type>
                <method-parameter-types/>
                <match-condition>
                    <match-type>EQUALS</match-type>
                    <match-pattern>com.stubhub.catalog.business.entity.Venue.class.getName()</match-pattern>
                    <inverse>false</inverse>
                    <method-invocation-data-gatherer-config>
                        <name/>
                        <position>1</position>
                        <gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
                        <transformer-type>GETTER_METHODS_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
                        <transformer-value>class|getName</transformer-value>
                    </method-invocation-data-gatherer-config>
                </match-condition>
            </pojo-method-definition>
            <info-point-metric-definition>
                <name>venueDetailUrlPath</name>
                <rollup-type>AVERAGE</rollup-type>
                <method-parameter-transformer>
                    <name/>
                    <position>2</position>
                    <gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
                    <transformer-type>GETTER_METHODS_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
                    <transformer-value>getGeo|getVenueDetailUrlPath</transformer-value>
                </method-parameter-transformer>
            </info-point-metric-definition>
        </info-point-gatherer-config>

*/