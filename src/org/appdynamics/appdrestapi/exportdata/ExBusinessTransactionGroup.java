/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso({ExSla.class,ExMembers.class})
public class ExBusinessTransactionGroup {
    private String name;
    private ExSla sla;
    private ExMembers members;
    
    public ExBusinessTransactionGroup(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.SLA)
    public ExSla getSla() {
        return sla;
    }

    public void setSla(ExSla sla) {
        this.sla = sla;
    }

    @XmlElement(name=AppExportS.MEMBERS)
    public ExMembers getMembers() {
        return members;
    }

    public void setMembers(ExMembers members) {
        this.members = members;
    }
    
    @Override //L1_1
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.BUSINESS_TRANSACTION_GROUP);
        sla.setLevel(2);
        bud.append(sla);
        bud.append(members);
        return bud.toString();
    }
    
    public String whatIsDifferent(ExBusinessTransactionGroup obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L2).append(AppExportS.BUSINESS_TRANSACTION_GROUP);
        bud.append( sla.whatIsDifferent(obj.getSla()) );
        
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.sla);
        hash = 59 * hash + Objects.hashCode(this.members);
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
        final ExBusinessTransactionGroup other = (ExBusinessTransactionGroup) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.sla, other.sla)) {
            return false;
        }
        if (!Objects.equals(this.members, other.members)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

/*
Level 1 after the application:

        <business-transaction-group>
            <name>Inventory Domain</name>
            <sla>
                <art>
                    <critical enabled="false">0</critical>
                    <warning enabled="false">0</warning>
                </art>
                <epm>
                    <critical enabled="false">0</critical>
                    <warning enabled="false">0</warning>
                </epm>
            </sla>
            <members>
                <business-transaction application-component="slx">INV_CreateBarcodeListing_v1</business-transaction>
                <business-transaction application-component="slx">INV_UpdateListing_v2</business-transaction>
                <business-transaction application-component="slx">INV_GetListing_v1</business-transaction>
                <business-transaction application-component="slx">INV_CreateListing_v1</business-transaction>
                <business-transaction application-component="slx">INV_GetListing_v2</business-transaction>
                <business-transaction application-component="slx">INV_CreateListing_v2</business-transaction>
                <business-transaction application-component="slx">INV_UpdateListing_v1</business-transaction>
            </members>
        </business-transaction-group>
*/
