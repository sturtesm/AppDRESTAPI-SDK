/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
                                    <properties>
                                        <property name="uri-suffix-scheme" value="custom-expression"/>
                                        <property name="suffix-key" value="${}"/>
                                    </properties>
 * 
 */
@XmlSeeAlso(ExNVProperty.class)
public class ExNVProperties {
    private ArrayList<ExNVProperty> properties=new ArrayList<ExNVProperty>();
    
    public ExNVProperties(){}

    @XmlElement(name=AppExportS.PROPERTY)
    public ArrayList<ExNVProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ExNVProperty> properties) {
        this.properties = properties;
    }
    
    public String whatIsDifferent(ExNVProperties obj){
        if( this.equals(obj) ) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3_1).append(AppExportS.PROPERTIES);
        
        for(ExNVProperty value:properties){
            boolean fnd=false;
            for(ExNVProperty _value:obj.getProperties()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.L4).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExNVProperty value:obj.getProperties()){
            boolean fnd=false;
            for(ExNVProperty _value:properties){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L4).append(AppExportS.DEST).append(value);
            }
        }
    
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PROPERTIES);
        for(ExNVProperty prop:properties)bud.append(prop);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.properties != null ? this.properties.hashCode() : 0);
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
        final ExNVProperties other = (ExNVProperties) obj;
        if (this.properties != other.properties && (this.properties == null || !this.properties.equals(other.properties))) {
            return false;
        }
        return true;
    }
    
    
}
