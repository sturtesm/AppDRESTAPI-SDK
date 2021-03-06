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
/*
 *             <properties>
                <property>
                    <property-definition>enable-json-bci-rules</property-definition>
                    <string-value>false</string-value>
                </property>
 * 
 */
@XmlSeeAlso(ExProperty.class)
public class ExProperties {
    private ArrayList<ExProperty> properties=new ArrayList<ExProperty>();
    private int level=3;
    
    public ExProperties(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    

    @XmlElement(name=AppExportS.PROPERTY)
    public ArrayList<ExProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ExProperty> properties) {
        this.properties = properties;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTIES);
        level++;
        for(ExProperty prop:properties){ prop.setLevel(level);bud.append(prop);}
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExProperties obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTIES);
        
        for(ExProperty prop:properties){
            boolean fnd=false;
            for(ExProperty prop1: obj.getProperties()){
                if(prop.getPropertyDefinition().equals(prop1.getPropertyDefinition())){
                    fnd=true;
                    if(!prop.getStringValue().equals(prop1.getStringValue())){  
                        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(prop.getPropertyDefinition());
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(prop.getStringValue());
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(prop1.getStringValue());
                        level--;
                    }
                }
            }
            
            if(!fnd){
                        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(prop.getPropertyDefinition());
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(prop.getStringValue());
                        level--;
            }
            
        }
        
        for(ExProperty prop:obj.getProperties()){
            boolean fnd=false;
            for(ExProperty prop1: properties){
                if(prop.getPropertyDefinition().equals(prop1.getPropertyDefinition())){
                    fnd=true;
                }
            }
            
            if(!fnd){
                        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITION).append(AppExportS.VE).append(prop.getPropertyDefinition());
                        level++;
                        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(prop.getStringValue()); 
                        level--;
            }
        }
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.properties != null ? this.properties.hashCode() : 0);
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
        final ExProperties other = (ExProperties) obj;
        
        if(properties.size() != other.getProperties().size()) return false;
        
        for(ExProperty prop:properties){
            boolean fnd=false;
            for(ExProperty prop1: other.getProperties()){
                if(prop.getPropertyDefinition().equals(prop1.getPropertyDefinition())){
                    if(prop.equals(prop1)) fnd=true;
                }
            }
            if(!fnd){
                        return false;
            }
            
        }
        
        return true;
    }
    
    
}
