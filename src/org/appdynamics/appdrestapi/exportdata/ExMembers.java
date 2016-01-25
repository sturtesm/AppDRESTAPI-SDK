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
import java.util.Objects;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExBTGrpBusinessTransaction.class)
public class ExMembers {
    private ArrayList<ExBTGrpBusinessTransaction> businessTransactions=new ArrayList<ExBTGrpBusinessTransaction>();

    public ExMembers() {
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION)
    public ArrayList<ExBTGrpBusinessTransaction> getBusinessTransactions() {
        return businessTransactions;
    }

    public void setBusinessTransactions(ArrayList<ExBTGrpBusinessTransaction> businessTransactions) {
        this.businessTransactions = businessTransactions;
    }

    @Override //L2
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.MEMBERS);
        for(ExBTGrpBusinessTransaction grp:businessTransactions) bud.append(grp);
        return bud.toString();
    }
   
    public String whatIsDifferent(ExMembers obj){
        if(this.equals(obj)) return AppExportS._U;
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.MEMBERS);
        
        for(ExBTGrpBusinessTransaction value:businessTransactions){
            boolean fnd=false;
            for(ExBTGrpBusinessTransaction _value:obj.getBusinessTransactions()){
                if(value.getValue().equals(_value.getValue())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd) bud.append(AppExportS.L3).append(AppExportS.SRC).append(value);
        }
        
        for(ExBTGrpBusinessTransaction value:obj.getBusinessTransactions()){
            boolean fnd=false;
            for(ExBTGrpBusinessTransaction _value:obj.getBusinessTransactions()){
                if(value.getValue().equals(_value.getValue())){
                    fnd=true;
                }
            }
            
            if(!fnd) bud.append(AppExportS.L3).append(AppExportS.DEST).append(value);
        }
        
        
        
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.businessTransactions);
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
        final ExMembers other = (ExMembers) obj;
        if (!Objects.equals(this.businessTransactions, other.businessTransactions)) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
            <members>
                <business-transaction application-component="slx">INV_CreateBarcodeListing_v1</business-transaction>
                <business-transaction application-component="slx">INV_UpdateListing_v2</business-transaction>
                <business-transaction application-component="slx">INV_GetListing_v1</business-transaction>
                <business-transaction application-component="slx">INV_CreateListing_v1</business-transaction>
                <business-transaction application-component="slx">INV_GetListing_v2</business-transaction>
                <business-transaction application-component="slx">INV_CreateListing_v2</business-transaction>
                <business-transaction application-component="slx">INV_UpdateListing_v1</business-transaction>
            </members>

*/