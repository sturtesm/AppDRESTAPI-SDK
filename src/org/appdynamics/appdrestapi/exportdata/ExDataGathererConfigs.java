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


@XmlSeeAlso({ExHttpDataGathererConfig.class,ExSqlDataGathererConfig.class,ExPojoDataGathererConfig.class})
public class ExDataGathererConfigs {
    private ArrayList<ExHttpDataGathererConfig> httpDataGathererConfig=new ArrayList<ExHttpDataGathererConfig>();
    private ArrayList<ExPojoDataGathererConfig> pojoDataGathererConfig=new ArrayList<ExPojoDataGathererConfig>();
    private ArrayList<ExSqlDataGathererConfig> sqlDataGathererConfig= new ArrayList<ExSqlDataGathererConfig>();
    private int level=2;
    
    public ExDataGathererConfigs(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    

    @XmlElement(name=AppExportS.HTTP_DATA_GATHERER_CONFIG)
    public ArrayList<ExHttpDataGathererConfig> getHttpDataGathererConfig() {
        return httpDataGathererConfig;
    }

    public void setHttpDataGathererConfig(ArrayList<ExHttpDataGathererConfig> httpDataGathererConfig) {
        this.httpDataGathererConfig = httpDataGathererConfig;
    }

    @XmlElement(name=AppExportS.SQL_DATA_GATHERER_CONFIG)
    public ArrayList<ExSqlDataGathererConfig> getSqlDataGathererConfig() {
        return sqlDataGathererConfig;
    }

    public void setSqlDataGathererConfig(ArrayList<ExSqlDataGathererConfig> sqlDataGathererConfig) {
        this.sqlDataGathererConfig = sqlDataGathererConfig;
    }

    @XmlElement(name=AppExportS.POJO_DATA_GATHERER_CONFIG)
    public ArrayList<ExPojoDataGathererConfig> getPojoDataGathererConfig() {
        return pojoDataGathererConfig;
    }

    public void setPojoDataGathererConfig(ArrayList<ExPojoDataGathererConfig> pojoDataGathererConfig) {
        this.pojoDataGathererConfig = pojoDataGathererConfig;
    }
    
    public String whatIsDifferent(ExDataGathererConfigs obj){
        
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(AppExportS.I[level]).append(AppExportS.DATA_GATHERER_CONFIGS);
        level++;
        
        //http
        for(ExHttpDataGathererConfig value:httpDataGathererConfig){
            value.setLevel(level);
            boolean fnd=false;
            for(ExHttpDataGathererConfig _value:obj.getHttpDataGathererConfig()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExHttpDataGathererConfig value:obj.getHttpDataGathererConfig()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExHttpDataGathererConfig _value:httpDataGathererConfig){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
        
        //sql
        
         for(ExSqlDataGathererConfig value:sqlDataGathererConfig){
                    value.setLevel(level);
            boolean fnd=false;
            for(ExSqlDataGathererConfig _value:obj.getSqlDataGathererConfig()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExSqlDataGathererConfig value:obj.getSqlDataGathererConfig()){
                    value.setLevel(level);
            boolean fnd=false;
            for(ExSqlDataGathererConfig _value:sqlDataGathererConfig){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
        //pojo
        for(ExPojoDataGathererConfig value:pojoDataGathererConfig){
            value.setLevel(level);
            boolean fnd=false;
            for(ExPojoDataGathererConfig _value:obj.getPojoDataGathererConfig()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExPojoDataGathererConfig value:obj.getPojoDataGathererConfig()){
                    value.setLevel(level);
            boolean fnd=false;
            for(ExPojoDataGathererConfig _value:pojoDataGathererConfig){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.DATA_GATHERER_CONFIGS);
        level++;
        for(ExHttpDataGathererConfig http_:httpDataGathererConfig){http_.setLevel(level);bud.append(http_);}
        for(ExSqlDataGathererConfig sql_:sqlDataGathererConfig){ sql_.setLevel(level); bud.append(sql_);}
        for(ExPojoDataGathererConfig pojo_:pojoDataGathererConfig ){ pojo_.setLevel(level); bud.append(pojo_);}
        level--;
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

/*
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