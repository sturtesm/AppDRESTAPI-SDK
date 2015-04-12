/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;


/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso({ExPojoMethodDefinition.class,ExInfoPointMetricDefinition.class,ExMethodInvocationDataGathererConfig.class})
public class ExInstrumentationPoint {
    private ExPojoMethodDefinition pojoMethodDefinition;
    private ArrayList<ExInfoPointMetricDefinition> infoPointMetricDefinitions=new ArrayList<ExInfoPointMetricDefinition>();
    private ArrayList<ExMethodInvocationDataGathererConfig> methodInvocationDataGathererConfigs=new ArrayList<ExMethodInvocationDataGathererConfig>();
    private Object businessTransactions;
    private boolean applyToAllBTS;
    
    public ExInstrumentationPoint(){}

    @XmlElement(name=AppExportS.POJO_METHOD_DEFINITION)
    public ExPojoMethodDefinition getPojoMethodDefinition() {
        return pojoMethodDefinition;
    }

    public void setPojoMethodDefinition(ExPojoMethodDefinition pojoMethodDefinition) {
        this.pojoMethodDefinition = pojoMethodDefinition;
    }

    @XmlElement(name=AppExportS.INFO_POINT_METRIC_DEFINITION)
    public ArrayList<ExInfoPointMetricDefinition> getInfoPointMetricDefinitions() {
        return infoPointMetricDefinitions;
    }

    public void setInfoPointMetricDefinitions(ArrayList<ExInfoPointMetricDefinition> infoPointMetricDefinitions) {
        this.infoPointMetricDefinitions = infoPointMetricDefinitions;
    }

    @XmlElement(name=AppExportS.METHOD_INVOCATION_DATA_GATHERER_CONFIG)
    public ArrayList<ExMethodInvocationDataGathererConfig> getMethodInvocationDataGathererConfigs() {
        return methodInvocationDataGathererConfigs;
    }

    public void setMethodInvocationDataGathererConfigs(ArrayList<ExMethodInvocationDataGathererConfig> methodInvocationDataGathererConfigs) {
        this.methodInvocationDataGathererConfigs = methodInvocationDataGathererConfigs;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTIONS)
    public Object getBusinessTransactions() {
        return businessTransactions;
    }

    public void setBusinessTransactions(Object businessTransactions) {
        this.businessTransactions = businessTransactions;
    }

    @XmlElement(name=AppExportS.APPLY_TO_ALL_BTS)
    public boolean isApplyToAllBTS() {
        return applyToAllBTS;
    }

    public void setApplyToAllBTS(boolean applyToAllBTS) {
        this.applyToAllBTS = applyToAllBTS;
    }
    
   
    public String whatIsDifferent(ExInstrumentationPoint obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.INSTRUMENTATION_POINT);
        if(applyToAllBTS != obj.isApplyToAllBTS()){
            bud.append(AppExportS.L3).append(AppExportS.APPLY_TO_ALL_BTS);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(applyToAllBTS);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isApplyToAllBTS()); 
            
        }
        
        if(businessTransactions != null &&  businessTransactions != obj.getBusinessTransactions()){
            bud.append(AppExportS.L3).append(AppExportS.BUSINESS_TRANSACTIONS);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(businessTransactions);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getBusinessTransactions()); 
        }
        

        
        for(ExInfoPointMetricDefinition value:infoPointMetricDefinitions){
            boolean fnd=false;
            for(ExInfoPointMetricDefinition _value:obj.getInfoPointMetricDefinitions()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExInfoPointMetricDefinition value:obj.getInfoPointMetricDefinitions()){
            boolean fnd=false;
            for(ExInfoPointMetricDefinition _value:infoPointMetricDefinitions){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){                
                bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(value);   
            }
        }
        
         for(ExMethodInvocationDataGathererConfig value:methodInvocationDataGathererConfigs){
            boolean fnd=false;
            for(ExMethodInvocationDataGathererConfig _value:obj.getMethodInvocationDataGathererConfigs()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExMethodInvocationDataGathererConfig value:obj.getMethodInvocationDataGathererConfigs()){
            boolean fnd=false;
            for(ExMethodInvocationDataGathererConfig _value:methodInvocationDataGathererConfigs){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){                
                bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(value);   
            }
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.INSTRUMENTATION_POINT);
        bud.append(AppExportS.L3).append(AppExportS.APPLY_TO_ALL_BTS).append(AppExportS.VE).append(applyToAllBTS);
        bud.append(AppExportS.L3).append(AppExportS.BUSINESS_TRANSACTIONS).append(AppExportS.VE).append(businessTransactions);
        bud.append(pojoMethodDefinition);
        for(ExMethodInvocationDataGathererConfig value: methodInvocationDataGathererConfigs){
            bud.append(value);
        }
        
        for(ExInfoPointMetricDefinition value:infoPointMetricDefinitions){
            bud.append(value);
        }
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.pojoMethodDefinition != null ? this.pojoMethodDefinition.hashCode() : 0);
        hash = 97 * hash + (this.infoPointMetricDefinitions != null ? this.infoPointMetricDefinitions.hashCode() : 0);
        hash = 97 * hash + (this.methodInvocationDataGathererConfigs != null ? this.methodInvocationDataGathererConfigs.hashCode() : 0);
        hash = 97 * hash + (this.businessTransactions != null ? this.businessTransactions.hashCode() : 0);
        hash = 97 * hash + (this.applyToAllBTS ? 1 : 0);
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
        final ExInstrumentationPoint other = (ExInstrumentationPoint) obj;
        if (this.pojoMethodDefinition != other.pojoMethodDefinition && (this.pojoMethodDefinition == null || !this.pojoMethodDefinition.equals(other.pojoMethodDefinition))) {
            return false;
        }
        if (this.infoPointMetricDefinitions != other.infoPointMetricDefinitions && (this.infoPointMetricDefinitions == null || !this.infoPointMetricDefinitions.equals(other.infoPointMetricDefinitions))) {
            return false;
        }
        if (this.methodInvocationDataGathererConfigs != other.methodInvocationDataGathererConfigs && (this.methodInvocationDataGathererConfigs == null || !this.methodInvocationDataGathererConfigs.equals(other.methodInvocationDataGathererConfigs))) {
            return false;
        }
        if (this.businessTransactions != other.businessTransactions && (this.businessTransactions == null || !this.businessTransactions.equals(other.businessTransactions))) {
            return false;
        }
        if (this.applyToAllBTS != other.applyToAllBTS) {
            return false;
        }
        return true;
    }
    
    
    
    
}
