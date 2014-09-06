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
 * <data-gatherer-configs>
        <http-data-gatherer-config attach-to-new-bts="true">
            <parameters/>
            <gather-url>true</gather-url>
            <gather-session-id>true</gather-session-id>
            <gather-user-principal>true</gather-user-principal>
            <name>Default HTTP Request Data Collector</name>
        </http-data-gatherer-config>
        <sql-data-gatherer-config attach-to-new-bts="true">
            <match-type>NOT_EMPTY</match-type>
            <match-pattern/>
            <inverse>false</inverse>
            <name>Default SQL Data Collector</name>
        </sql-data-gatherer-config>
    </data-gatherer-configs>
 * 
 */

@XmlSeeAlso({ExHttpDataGathererConfig.class,ExSqlDataGathererConfig.class,ExPojoDataGathererConfig.class})
public class ExDataGathererConfigs {
    private ExHttpDataGathererConfig httpDataGathererConfig;
    private ExPojoDataGathererConfig pojoDataGathererConfig;
    private ExSqlDataGathererConfig sqlDataGathererConfig;
    
    public ExDataGathererConfigs(){}

    @XmlElement(name=AppExportS.HTTP_DATA_GATHERER_CONFIG)
    public ExHttpDataGathererConfig getHttpDataGathererConfig() {
        return httpDataGathererConfig;
    }

    public void setHttpDataGathererConfig(ExHttpDataGathererConfig httpDataGathererConfig) {
        this.httpDataGathererConfig = httpDataGathererConfig;
    }

    @XmlElement(name=AppExportS.SQL_DATA_GATHERER_CONFIG)
    public ExSqlDataGathererConfig getSqlDataGathererConfig() {
        return sqlDataGathererConfig;
    }

    public void setSqlDataGathererConfig(ExSqlDataGathererConfig sqlDataGathererConfig) {
        this.sqlDataGathererConfig = sqlDataGathererConfig;
    }

    @XmlElement(name=AppExportS.POJO_DATA_GATHERER_CONFIG)
    public ExPojoDataGathererConfig getPojoDataGathererConfig() {
        return pojoDataGathererConfig;
    }

    public void setPojoDataGathererConfig(ExPojoDataGathererConfig pojoDataGathererConfig) {
        this.pojoDataGathererConfig = pojoDataGathererConfig;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L1).append(AppExportS.DATA_GATHERER_CONFIGS);
        if(httpDataGathererConfig != null) bud.append(httpDataGathererConfig.toString());
        if(sqlDataGathererConfig != null) bud.append(sqlDataGathererConfig.toString());
        if(pojoDataGathererConfig != null) bud.append(pojoDataGathererConfig.toString());
        return bud.toString();
    }
    
}
