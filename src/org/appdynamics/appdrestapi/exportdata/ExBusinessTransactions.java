/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;


import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExBusinessTransaction.class)
public class ExBusinessTransactions {
    private ArrayList<ExBusinessTransaction> businessTransactions=new ArrayList<ExBusinessTransaction>();
    private int level=4;
    
    
    public ExBusinessTransactions(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

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
        
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTIONS);
        level++;
        for(ExBusinessTransaction value:businessTransactions){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBusinessTransaction _value:obj.getBusinessTransactions()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd){bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);}
        }
        
        for(ExBusinessTransaction value:obj.getBusinessTransactions()){
            value.setLevel(level);
            boolean fnd=false;
            for(ExBusinessTransaction _value:businessTransactions){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            
            if(!fnd){ bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);}
        }
        
        level--;
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTIONS);
        level++;
        for(ExBusinessTransaction bt:businessTransactions){ bt.setLevel(level);bud.append(bt);}
        level--;
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
