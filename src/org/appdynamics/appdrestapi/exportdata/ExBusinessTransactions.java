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
@XmlSeeAlso({ExBusinessTransactions.class,ExSla.class,ExNamingConfig.class,ExNameValues.class,ExNameValue.class,ExBusinessTransactionConfig.class})
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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.BUSINESS_TRANSACTIONS);
        for(ExBusinessTransaction bt:businessTransactions) bud.append(bt.toString());
        return bud.toString();
    }
}
