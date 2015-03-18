/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * 
 * <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
 * @author gilbert.solorzano
 * 6
 */
public class ExMatchClassName {
    private String filterType;
    private String filterValue;
    
    public ExMatchClassName(){}

    @XmlAttribute(name=AppExportS.FILTER_TYPE)
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @XmlAttribute(name=AppExportS.FILTER_VALUE)
    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }
    
    
    public String whatIsDifferent(ExMatchClassName obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
    
        if(!filterType.equals(obj.getFilterType())){
            bud.append(AppExportS.L4).append(AppExportS.FILTER_TYPE);
            bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(filterType);
            bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getFilterType()); 
        }
        
        if(!filterValue.equals(obj.getFilterValue())){
            bud.append(AppExportS.L4).append(AppExportS.FILTER_VALUE);
            bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(filterValue);
            bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getFilterValue());
        }
        
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.FILTER_TYPE).append(AppExportS.VE).append(filterType);
        bud.append(AppExportS.L4).append(AppExportS.FILTER_VALUE).append(AppExportS.VE).append(filterValue);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.filterType != null ? this.filterType.hashCode() : 0);
        hash = 97 * hash + (this.filterValue != null ? this.filterValue.hashCode() : 0);
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
        final ExMatchClassName other = (ExMatchClassName) obj;
        if ((this.filterType == null) ? (other.filterType != null) : !this.filterType.equals(other.filterType)) {
            return false;
        }
        if ((this.filterValue == null) ? (other.filterValue != null) : !this.filterValue.equals(other.filterValue)) {
            return false;
        }
        return true;
    }
    
    
    
}
