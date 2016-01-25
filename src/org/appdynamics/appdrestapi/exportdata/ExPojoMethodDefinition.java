/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */

@XmlSeeAlso(ExMatchCondition.class)
public class ExPojoMethodDefinition {
    private String className;
    private String methodName;
    private String matchType;
    private String methodParameterTypes;
    private ExMatchCondition matchCondition;
    
    private int level=5;
    
    public ExPojoMethodDefinition(){}

    @XmlElement(name=AppExportS.CLASS_NAME)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @XmlElement(name=AppExportS.METHOD_NAME)
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @XmlElement(name=AppExportS.MATCH_TYPE)
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @XmlElement(name=AppExportS.METHOD_PARAMETER_TYPES)
    public String getMethodParameterTypes() {
        return methodParameterTypes;
    }

    public void setMethodParameterTypes(String methodParameterTypes) {
        this.methodParameterTypes = methodParameterTypes;
    }

    @XmlElement(name=AppExportS.MATCH_CONDITION)
    public ExMatchCondition getMatchCondition() {
        return matchCondition;
    }

    public void setMatchCondition(ExMatchCondition matchCondition) {
        this.matchCondition = matchCondition;
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
        bud.append(AppExportS.I[level]).append(AppExportS.POJO_METHOD_DEFINITION);level++;
        bud.append(AppExportS.I[level]).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(className);
        bud.append(AppExportS.I[level]).append(AppExportS.METHOD_NAME).append(AppExportS.VE).append(methodName);
        bud.append(AppExportS.I[level]).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
        bud.append(AppExportS.I[level]).append(AppExportS.METHOD_PARAMETER_TYPES).append(AppExportS.VE).append(methodParameterTypes);
        
        if(matchCondition != null){matchCondition.setLevel(level); bud.append(matchCondition);}
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExPojoMethodDefinition obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        //If we don't have the same name and method why check ?
        if(!className.equals(obj.getClassName()) || !methodName.equals(obj.getMethodName())) return "";
            
            bud.append(AppExportS.I[level]).append(AppExportS.POJO_METHOD_DEFINITION);level++;
            bud.append(AppExportS.I[level]).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(className);
            bud.append(AppExportS.I[level]).append(AppExportS.METHOD_NAME).append(AppExportS.VE).append(methodName);

        
        if(!matchType.equals(obj.getMatchType())){
            bud.append(AppExportS.I[level]).append(AppExportS.METHOD_PARAMETER_TYPES);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(methodParameterTypes);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMethodParameterTypes());
            level--;
        }
        
        if(!methodParameterTypes.equals(obj.getMethodParameterTypes())){
            bud.append(AppExportS.I[level]).append(AppExportS.METHOD_PARAMETER_TYPES);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(methodParameterTypes);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMethodParameterTypes());
            level--;
        }
        
        if(matchCondition != null){
            matchCondition.setLevel(level);
            bud.append(matchCondition.whatIsDifferent(obj.getMatchCondition()));
        }
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.className != null ? this.className.hashCode() : 0);
        hash = 71 * hash + (this.methodName != null ? this.methodName.hashCode() : 0);
        hash = 71 * hash + (this.matchType != null ? this.matchType.hashCode() : 0);
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
        final ExPojoMethodDefinition other = (ExPojoMethodDefinition) obj;
        if ((this.className == null) ? (other.className != null) : !this.className.equals(other.className)) {
            return false;
        }
        if ((this.methodName == null) ? (other.methodName != null) : !this.methodName.equals(other.methodName)) {
            return false;
        }
        if ((this.matchType == null) ? (other.matchType != null) : !this.matchType.equals(other.matchType)) {
            return false;
        }
        if ((this.methodParameterTypes == null) ? (other.methodParameterTypes != null) : !this.methodParameterTypes.equals(other.methodParameterTypes)) {
            return false;
        }
        return true;
    }
    
    
    
}


/*
            <pojo-method-definition>
                <class-name>com.appdynamics.testappserver.spring.SpringBean3</class-name>
                <method-name>businessMethod</method-name>
                <match-type>MATCHES_CLASS</match-type>
                <method-parameter-types/>
            </pojo-method-definition>
            * L2 (s)

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
 */