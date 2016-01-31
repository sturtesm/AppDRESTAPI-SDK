/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 */
@XmlSeeAlso({ExInstrumentationPoint.class,ExMethodInvocationDataGathererConfig.class})
public class ExCustomExitPointDefinition {
    private ExInstrumentationPoint instrumentationPoint;
    private ArrayList<ExMethodInvocationDataGathererConfig> methodInvocationGathererConfigs=new ArrayList<ExMethodInvocationDataGathererConfig>();
    private String name,type;
    private int level=8;
    
    public ExCustomExitPointDefinition(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.INSTRUMENTATION_POINT)
    public ExInstrumentationPoint getInstrumentationPoint() {
        return instrumentationPoint;
    }

    public void setInstrumentationPoint(ExInstrumentationPoint instrumentationPoint) {
        this.instrumentationPoint = instrumentationPoint;
    }

    @XmlElement(name=AppExportS.METHOD_INVOCATION_DATA_GATHERER_CONFIG)
    public ArrayList<ExMethodInvocationDataGathererConfig> getMethodInvocationGathererConfigs() {
        return methodInvocationGathererConfigs;
    }

    public void setMethodInvocationGathererConfigs(ArrayList<ExMethodInvocationDataGathererConfig> methodInvocationGathererConfigs) {
        this.methodInvocationGathererConfigs = methodInvocationGathererConfigs;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String whatIsDifferent(ExCustomExitPointDefinition obj){
        
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_EXIT_POINT_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!type.equals(obj.getType())){
            bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType()); 
            level--;
        }
        
        bud.append(instrumentationPoint.whatIsDifferent(obj.getInstrumentationPoint()));
        
         for(ExMethodInvocationDataGathererConfig value:methodInvocationGathererConfigs){
             value.setLevel(level);
            boolean fnd=false;
            for(ExMethodInvocationDataGathererConfig _value:obj.getMethodInvocationGathererConfigs()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExMethodInvocationDataGathererConfig value:obj.getMethodInvocationGathererConfigs()){
            boolean fnd=false;
            value.setLevel(level);
            for(ExMethodInvocationDataGathererConfig _value:methodInvocationGathererConfigs){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){                
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);   
            }
        }
      
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.CUSTOM_EXIT_POINT_DEFINITION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        instrumentationPoint.setLevel(level);
        bud.append(instrumentationPoint);
        for(ExMethodInvocationDataGathererConfig value: methodInvocationGathererConfigs){value.setLevel(level); bud.append(value);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.instrumentationPoint != null ? this.instrumentationPoint.hashCode() : 0);
        hash = 29 * hash + (this.methodInvocationGathererConfigs != null ? this.methodInvocationGathererConfigs.hashCode() : 0);
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 29 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final ExCustomExitPointDefinition other = (ExCustomExitPointDefinition) obj;
        if (this.instrumentationPoint != other.instrumentationPoint && (this.instrumentationPoint == null || !this.instrumentationPoint.equals(other.instrumentationPoint))) {
            return false;
        }
        
        if(methodInvocationGathererConfigs.size() != other.getMethodInvocationGathererConfigs().size()) return false;
        
        for(ExMethodInvocationDataGathererConfig value:methodInvocationGathererConfigs){
             value.setLevel(level);
            boolean fnd=false;
            for(ExMethodInvocationDataGathererConfig _value:other.getMethodInvocationGathererConfigs()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value)) fnd=true;
                }
            }
            if(!fnd){                
                return false; 
            }
        }
        
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        return true;
    }
    
    
}
