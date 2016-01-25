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
public class ExBusinessTransactionGroups {
    private ArrayList<ExBusinessTransactionGroup> btGrps=new ArrayList<ExBusinessTransactionGroup>();
    
    public ExBusinessTransactionGroups(){}

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION_GROUP)
    public ArrayList<ExBusinessTransactionGroup> getBtGrps() {
        return btGrps;
    }

    public void setBtGrps(ArrayList<ExBusinessTransactionGroup> btGrps) {
        this.btGrps = btGrps;
    }

    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.BUSINESS_TRANSACTION_GROUPS);
        for(ExBusinessTransactionGroup grp:btGrps)   bud.append(grp);
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.btGrps);
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
        final ExBusinessTransactionGroups other = (ExBusinessTransactionGroups) obj;
        if (!Objects.equals(this.btGrps, other.btGrps)) {
            return false;
        }
        return true;
    }
    
}
