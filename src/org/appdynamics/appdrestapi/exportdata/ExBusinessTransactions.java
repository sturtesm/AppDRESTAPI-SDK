/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExBusinessTransaction.class)
public class ExBusinessTransactions {
    private ArrayList<ExBusinessTransaction> businessTransactions=new ArrayList<ExBusinessTransaction>();
    
    public ExBusinessTransactions(){}

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION)
    public ArrayList<ExBusinessTransaction> getBusinessTransactions() {
        return businessTransactions;
    }

    public void setBusinessTransactions(ArrayList<ExBusinessTransaction> businessTransactions) {
        this.businessTransactions = businessTransactions;
    }
    
     public String whatIsDifferent(ExBusinessTransactions obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L2).append(AppExportS.BUSINESS_TRANSACTIONS);
        
        for(ExBusinessTransaction value:businessTransactions){
            boolean fnd=false;
            for(ExBusinessTransaction _value:obj.getBusinessTransactions()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd) bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(value);
        }
        
        for(ExBusinessTransaction value:obj.getBusinessTransactions()){
            boolean fnd=false;
            for(ExBusinessTransaction _value:businessTransactions){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd) bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(value);
        }
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.BUSINESS_TRANSACTIONS);
        for(ExBusinessTransaction bt:businessTransactions) bud.append(bt.toString());
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.businessTransactions != null ? this.businessTransactions.hashCode() : 0);
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
        final ExBusinessTransactions other = (ExBusinessTransactions) obj;
        if (this.businessTransactions != other.businessTransactions && (this.businessTransactions == null || !this.businessTransactions.equals(other.businessTransactions))) {
            return false;
        }
        return true;
    }
    
    
}
