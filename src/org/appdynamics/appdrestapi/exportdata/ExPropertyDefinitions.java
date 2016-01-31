/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */

@XmlSeeAlso(ExPropertyDefinition.class)
public class ExPropertyDefinitions {
    private ArrayList<ExPropertyDefinition> propertyDefinitions=new ArrayList<ExPropertyDefinition>();
    private int level=4;
    
    public ExPropertyDefinitions(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.PROPERTY_DEFINITION)
    public ArrayList<ExPropertyDefinition> getPropertyDefinitions() {
        return propertyDefinitions;
    }

    public void setPropertyDefinitions(ArrayList<ExPropertyDefinition> propertyDefinitions) {
        this.propertyDefinitions = propertyDefinitions;
    }  
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITIONS);
        level++;
        for(ExPropertyDefinition prop:propertyDefinitions) {prop.setLevel(level);bud.append(prop);}
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExPropertyDefinitions obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITIONS);
        level++;
        for(ExPropertyDefinition val: propertyDefinitions){
            val.setLevel(level);
            boolean fnd=false;
            for(ExPropertyDefinition val1: obj.getPropertyDefinitions()){
                if(val.getName().equals(val1.getName())){
                    bud.append(val.whatIsDifferent(val1));fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITION);
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(val.getName());
            }
        }
        
        for(ExPropertyDefinition val: obj.getPropertyDefinitions()){
            boolean fnd=false;
            val.setLevel(level);
            for(ExPropertyDefinition val1: propertyDefinitions){
                if(val.getName().equals(val1.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.PROPERTY_DEFINITION);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(val.getName());
            }
        }
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.propertyDefinitions != null ? this.propertyDefinitions.hashCode() : 0);
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
        final ExPropertyDefinitions other = (ExPropertyDefinitions) obj;
        
        if(propertyDefinitions.size() != other.getPropertyDefinitions().size() ) return false;
        
        for(ExPropertyDefinition val: propertyDefinitions){
            val.setLevel(level);
            boolean fnd=false;
            for(ExPropertyDefinition val1: other.getPropertyDefinitions()){
                if(val.getName().equals(val1.getName())){
                    if(val.equals(val1))fnd=true;
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
 * <property-definitions>
                <property-definition>
                    <name>max-jdbc-calls-per-callgraph</name>
                    <description>Maximum number of sql queries  that will be reported per callgraph. Note - Only queries taking more time than 'min-duration-for-jdbc-callsample' wil be reported. Does not need a restart</description>
                    <type>INTEGER</type>
                    <required>false</required>
                    <default-string-value>100</default-string-value>
                    <upper-numeric-bound>1000</upper-numeric-bound>
                    <lower-numeric-bound>1</lower-numeric-bound>
                </property-definition>
                <property-definition>
                    <name>leak-diagnostic-interval-in-minutes</name>
                    <description>Interval at which diagnostic data (content summary and activity trace) will be captured for leaking collections</description>
                    <type>INTEGER</type>
                    <required>false</required>
                    <default-string-value>30</default-string-value>
                    <upper-numeric-bound/>
                    <lower-numeric-bound>2</lower-numeric-bound>
                </property-definition>

            </property-definitions>
 */