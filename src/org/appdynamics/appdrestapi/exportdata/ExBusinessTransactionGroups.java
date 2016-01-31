/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author gilbert.solorzano
 */
public class ExBusinessTransactionGroups {
    private ArrayList<ExBusinessTransactionGroup> btGrps=new ArrayList<ExBusinessTransactionGroup>();
    private int level=2;
    
    public ExBusinessTransactionGroups(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION_GROUP)
    public ArrayList<ExBusinessTransactionGroup> getBtGrps() {
        return btGrps;
    }

    public void setBtGrps(ArrayList<ExBusinessTransactionGroup> btGrps) {
        this.btGrps = btGrps;
    }

    public String whatIsDifferent(ExBusinessTransactionGroups obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION_GROUPS);
        level++;
        for(ExBusinessTransactionGroup value: btGrps){
            value.setLevel(level);
            boolean fnd=false;
             for(ExBusinessTransactionGroup _value: obj.getBtGrps()){
                 if(value.getName().equals(_value.getName())){
                     fnd=true;
                     bud.append(value.whatIsDifferent(_value));
                 }
             }
             if(!fnd)bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION_GROUPS);
        level++;
        for(ExBusinessTransactionGroup grp:btGrps){grp.setLevel(level); bud.append(grp);}
        level--;
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
        
        if(btGrps.size() != other.getBtGrps().size()) return false;
        
        
        for(ExBusinessTransactionGroup value: btGrps){
            value.setLevel(level);
            boolean fnd=false;
             for(ExBusinessTransactionGroup _value: other.getBtGrps()){
                 if(value.getName().equals(_value.getName())){
                     if(value.equals(_value)) fnd=true;                     
                 }
             }
             if(!fnd)return false;
        }
        
        return true;
    }
    
}
