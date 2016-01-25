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
 */
/*
 *          <custom-logger-definition disable="false">
                <name>GLog</name>
                <pojo-method-definition>
                    <class-name>org.solo.logger</class-name>
                    <method-name>logit</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>Integer.class|String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>1</method-param-exception-index>
            </custom-logger-definition>
            <custom-logger-definition disable="false">
                <name>bought</name>
                <pojo-method-definition>
                    <class-name>org.logg.bought</class-name>
                    <method-name>log</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>0</method-param-exception-index>
            </custom-logger-definition>
            * 
            * 
            <custom-logger-definition disable="false">
                <name>Found It</name>
                <pojo-method-definition>
                    <class-name>com.micro.Save</class-name>
                    <method-name>nothing</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>0</method-param-exception-index>
            </custom-logger-definition>
            <custom-logger-definition disable="false">
                <name>Bought</name>
                <pojo-method-definition>
                    <class-name>org.mcir</class-name>
                    <method-name>not</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>0</method-param-exception-index>
            </custom-logger-definition>
 * 
 */
@XmlSeeAlso(ExPojoMethodDefinition.class)
public class ExCustomLoggerDefinition {
    private String name;
    private boolean disable;
    private ExPojoMethodDefinition pojoMethod;
    private int level=4;
    
    public ExCustomLoggerDefinition(){}

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

    @XmlElement(name=AppExportS.DISABLE)
    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    @XmlElement(name=AppExportS.POJO_METHOD_DEFINITION)
    public ExPojoMethodDefinition getPojoMethod() {
        return pojoMethod;
    }

    public void setPojoMethod(ExPojoMethodDefinition pojoMethod) {
        this.pojoMethod = pojoMethod;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_LOGGER_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.DISABLE).append(AppExportS.VE).append(disable);
        if(pojoMethod != null){
            pojoMethod.setLevel(level);
            bud.append(pojoMethod);
        }
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExCustomLoggerDefinition obj){
        StringBuilder bud = new StringBuilder();
        
        if(this.equals(obj)) return AppExportS._U;
        
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_LOGGER_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!name.equals(obj.getName())) return "";
        
        if(disable != obj.isDisable()){
            bud.append(AppExportS.I[level]).append(AppExportS.DISABLE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(disable);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isDisable());
            level--;
        }
        pojoMethod.setLevel(level);
        bud.append(pojoMethod.whatIsDifferent(obj.getPojoMethod()));
        level--;
        return bud.toString();
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 71 * hash + (this.disable ? 1 : 0);
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
        final ExCustomLoggerDefinition other = (ExCustomLoggerDefinition) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.disable != other.disable) {
            return false;
        }
        if (this.pojoMethod != other.pojoMethod && (this.pojoMethod == null || !this.pojoMethod.equals(other.pojoMethod))) {
            return false;
        }
        return true;
    }
    
    
}
