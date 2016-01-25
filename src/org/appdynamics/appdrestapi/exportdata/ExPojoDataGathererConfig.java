/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 *
 */
/*
        <pojo-data-gatherer-config attach-to-new-bts="false">
            <name>DataCol1</name>
            <pojo-method-definition>
                <class-name>com.appdynamics.testappserver.spring.SpringBean3</class-name>
                <method-name>businessMethod</method-name>
                <match-type>MATCHES_CLASS</match-type>
                <method-parameter-types/>
            </pojo-method-definition>
            <method-invocation-data-gatherer-config>
                <name>DataColl</name>
                <position>0</position>
                <gatherer-type>RETURN_VALUE_GATHERER_TYPE</gatherer-type>
                <transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
            </method-invocation-data-gatherer-config>
            <name>DataCol1</name>
        </pojo-data-gatherer-config>
        * 
        * I[level] (s)
 */
@XmlSeeAlso({ExPojoMethodDefinition.class,ExMethodInvocationDataGathererConfig.class})
public class ExPojoDataGathererConfig {
    private boolean attachToNewBTS;
    private String name;
    private ExPojoMethodDefinition pojoMethodDef;
    private ArrayList<ExMethodInvocationDataGathererConfig> methodInvocation=new ArrayList<ExMethodInvocationDataGathererConfig>();
    private int level=3;
    
    public ExPojoDataGathererConfig(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlAttribute(name=AppExportS.ATTACH_TO_NEW_BTS)
    public boolean isAttachToNewBTS() {
        return attachToNewBTS;
    }

    public void setAttachToNewBTS(boolean attachToNewBTS) {
        this.attachToNewBTS = attachToNewBTS;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.POJO_METHOD_DEFINITION)
    public ExPojoMethodDefinition getPojoMethodDef() {
        return pojoMethodDef;
    }

    public void setPojoMethodDef(ExPojoMethodDefinition pojoMethodDef) {
        this.pojoMethodDef = pojoMethodDef;
    }

    @XmlElement(name=AppExportS.METHOD_INVOCATION_DATA_GATHERER_CONFIG)
    public ArrayList<ExMethodInvocationDataGathererConfig> getMethodInvocation() {
        return methodInvocation;
    }

    public void setMethodInvocation(ArrayList<ExMethodInvocationDataGathererConfig> methodInvocation) {
        this.methodInvocation = methodInvocation;
    }
    
    public String whatIsDifferent(ExPojoDataGathererConfig obj){
        
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.POJO_DATA_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(attachToNewBTS != obj.isAttachToNewBTS()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ATTACH_TO_NEW_BTS);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(attachToNewBTS);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAttachToNewBTS());    
            level--;
        }
        
        if(pojoMethodDef != null){ bud.append(pojoMethodDef.whatIsDifferent(obj.getPojoMethodDef()));}
        else{ 
            if(obj.getPojoMethodDef() != null){
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPojoMethodDef());
                level--;
            }
        }
        
        
        for(ExMethodInvocationDataGathererConfig value:methodInvocation){
            boolean fnd=false;
            for(ExMethodInvocationDataGathererConfig _value:obj.getMethodInvocation()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExMethodInvocationDataGathererConfig value:obj.getMethodInvocation()){
            boolean fnd=false;
            for(ExMethodInvocationDataGathererConfig _value:methodInvocation){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                value.setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.POJO_DATA_GATHERER_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.ATTACH_TO_NEW_BTS).append(AppExportS.VE).append(attachToNewBTS);
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        if(pojoMethodDef != null){ pojoMethodDef.setLevel(level);bud.append(pojoMethodDef);}
        for(ExMethodInvocationDataGathererConfig method_:methodInvocation ){ method_.setLevel(level);bud.append(method_);}
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.attachToNewBTS ? 1 : 0);
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.pojoMethodDef != null ? this.pojoMethodDef.hashCode() : 0);
        hash = 97 * hash + (this.methodInvocation != null ? this.methodInvocation.hashCode() : 0);
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
        final ExPojoDataGathererConfig other = (ExPojoDataGathererConfig) obj;
        if (this.attachToNewBTS != other.attachToNewBTS) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.pojoMethodDef != other.pojoMethodDef && (this.pojoMethodDef == null || !this.pojoMethodDef.equals(other.pojoMethodDef))) {
            return false;
        }
        if (this.methodInvocation != other.methodInvocation && (this.methodInvocation == null || !this.methodInvocation.equals(other.methodInvocation))) {
            return false;
        }
        return true;
    }
    
    
            
}
