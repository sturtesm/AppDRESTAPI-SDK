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
    
    public String whatIsDifferent(ExDataGathererConfigs obj){
        
        if(this.equals(obj) ) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(AppExportS.L1).append(AppExportS.DATA_GATHERER_CONFIGS);
        
        
        if(httpDataGathererConfig != null){ 
            if(obj.getHttpDataGathererConfig() != null && httpDataGathererConfig.getName().equals(obj.getHttpDataGathererConfig().getName())){
                bud.append(httpDataGathererConfig.whatIsDifferent(obj.getHttpDataGathererConfig()));
            }else{
                bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(httpDataGathererConfig);
                bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getHttpDataGathererConfig());
            }
        }else{ 
            if(obj.getHttpDataGathererConfig()!= null){
                bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getHttpDataGathererConfig());
            }
        }
        
        if(sqlDataGathererConfig != null){ 
            if(obj.getSqlDataGathererConfig() != null && sqlDataGathererConfig.getName().equals(obj.getSqlDataGathererConfig().getName())){
                bud.append(sqlDataGathererConfig.whatIsDifferent(obj.getSqlDataGathererConfig()));
            }else{
                bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(sqlDataGathererConfig);
                bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getSqlDataGathererConfig());
            }
        }else{ 
            if(obj.getSqlDataGathererConfig()!= null){
                bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getSqlDataGathererConfig());
            }
        }
        
        if(pojoDataGathererConfig != null){ 
            if(obj.getPojoDataGathererConfig()!= null && pojoDataGathererConfig.getName().equals(obj.getPojoDataGathererConfig().getName())){
                bud.append(pojoDataGathererConfig.whatIsDifferent(obj.getPojoDataGathererConfig()));
            }else{
                bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(pojoDataGathererConfig);
                bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPojoDataGathererConfig());
            }
        }else{ 
            if(obj.getPojoDataGathererConfig()!= null){
                bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPojoDataGathererConfig());
            }
        }
        
        return bud.toString();
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (this.httpDataGathererConfig != null ? this.httpDataGathererConfig.hashCode() : 0);
        hash = 11 * hash + (this.pojoDataGathererConfig != null ? this.pojoDataGathererConfig.hashCode() : 0);
        hash = 11 * hash + (this.sqlDataGathererConfig != null ? this.sqlDataGathererConfig.hashCode() : 0);
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
        final ExDataGathererConfigs other = (ExDataGathererConfigs) obj;
        if (this.httpDataGathererConfig != other.httpDataGathererConfig && (this.httpDataGathererConfig == null || !this.httpDataGathererConfig.equals(other.httpDataGathererConfig))) {
            return false;
        }
        if (this.pojoDataGathererConfig != other.pojoDataGathererConfig && (this.pojoDataGathererConfig == null || !this.pojoDataGathererConfig.equals(other.pojoDataGathererConfig))) {
            return false;
        }
        if (this.sqlDataGathererConfig != other.sqlDataGathererConfig && (this.sqlDataGathererConfig == null || !this.sqlDataGathererConfig.equals(other.sqlDataGathererConfig))) {
            return false;
        }
        return true;
    }
    
    
    
}
