/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso({ExPojoMethodDefinition.class,ExInfoPointMetricDefinition.class})
public class ExInfoPointGathererConfig {
    private String name;
    private String agentType;
    private ExInfoPointMetricDefinition infoPoint;
    private ExPojoMethodDefinition pojoPoint;
    private int level=4;
    
    
    public ExInfoPointGathererConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.AGENT_TYPE)
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    @XmlElement(name=AppExportS.INFO_POINT_METRIC_DEFINITION)
    public ExInfoPointMetricDefinition getInfoPoint() {
        return infoPoint;
    }

    public void setInfoPoint(ExInfoPointMetricDefinition infoPoint) {
        this.infoPoint = infoPoint;
    }

    @XmlElement(name=AppExportS.POJO_METHOD_DEFINITION)
    public ExPojoMethodDefinition getPojoPoint() {
        return pojoPoint;
    }

    public void setPojoPoint(ExPojoMethodDefinition pojoPoint) {
        this.pojoPoint = pojoPoint;
    }
    

    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.INFO_POINT_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        if(infoPoint != null){ infoPoint.setLevel(level);bud.append(infoPoint);}
        if(pojoPoint != null){pojoPoint.setLevel(level);bud.append(pojoPoint);}
        
        
        
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExInfoPointGathererConfig obj){ // 3 or 1 is the seeting.
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.INFO_POINT_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        
        if(infoPoint != null){ infoPoint.setLevel(level);bud.append(infoPoint.whatIsDifferent(obj.getInfoPoint()));}
        if(pojoPoint != null){ pojoPoint.setLevel(level);bud.append(pojoPoint.whatIsDifferent(pojoPoint));}
        
        level--;
        return bud.toString();
      }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.agentType);
        hash = 71 * hash + Objects.hashCode(this.infoPoint);
        hash = 71 * hash + Objects.hashCode(this.pojoPoint);
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
        final ExInfoPointGathererConfig other = (ExInfoPointGathererConfig) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.agentType, other.agentType)) {
            return false;
        }
        if (!Objects.equals(this.infoPoint, other.infoPoint)) {
            return false;
        }
        if (!Objects.equals(this.pojoPoint, other.pojoPoint)) {
            return false;
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
