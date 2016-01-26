/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */
/*
 *         <metric-baseline seasonality="NONE">
            <name>All data - Last 15 days</name>
            <fixed>false</fixed>
            <is-default>false</is-default>
            <all-date>false</all-date>
            <number-of-days>15</number-of-days>
        </metric-baseline>
 * 
 */
public class ExMetricBaseline {
    private String seasonality;
    private String name;
    private boolean fixed;
    private boolean isDefault;
    private boolean allDate;
    private int numberOfDays;
    private int level=4;
    
    public ExMetricBaseline(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlAttribute(name=AppExportS.SEASONALITY)
    public String getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.FIXED)
    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    @XmlElement(name=AppExportS.IS_DEFAULT)
    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @XmlElement(name=AppExportS.ALL_DATE)
    public boolean isAllDate() {
        return allDate;
    }

    public void setAllDate(boolean allDate) {
        this.allDate = allDate;
    }

    @XmlElement(name=AppExportS.NUMBER_OF_DAYS)
    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    
     public String whatIsDifferent(ExMetricBaseline obj){
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_BASELINE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!seasonality.equals(obj.getSeasonality())){     
             bud.append(AppExportS.I[level]).append(AppExportS.SEASONALITY);
             level++;
             bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(seasonality);
             bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getSeasonality());  
             level--;
         }
        
        if(fixed != obj.isFixed()){     
            bud.append(AppExportS.I[level]).append(AppExportS.FIXED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(fixed);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isFixed());   
            level--;
        }

        if(isDefault != obj.isIsDefault()){     
            bud.append(AppExportS.I[level]).append(AppExportS.IS_DEFAULT);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(isDefault);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isIsDefault());   
            level--;
        }
        
        if(allDate != obj.isAllDate()){     
            bud.append(AppExportS.I[level]).append(AppExportS.ALL_DATE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(allDate);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isAllDate());  
            level--;
        }
        
        if(numberOfDays != obj.getNumberOfDays()){     
            bud.append(AppExportS.I[level]).append(AppExportS.NUMBER_OF_DAYS);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(numberOfDays);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getNumberOfDays());   
            level--;
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.METRIC_BASELINE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.SEASONALITY).append(AppExportS.VE).append(seasonality);
        bud.append(AppExportS.I[level]).append(AppExportS.FIXED).append(AppExportS.VE).append(fixed);
        bud.append(AppExportS.I[level]).append(AppExportS.IS_DEFAULT).append(AppExportS.VE).append(isDefault);
        bud.append(AppExportS.I[level]).append(AppExportS.ALL_DATE).append(AppExportS.VE).append(allDate);
        bud.append(AppExportS.I[level]).append(AppExportS.NUMBER_OF_DAYS).append(AppExportS.VE).append(numberOfDays);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.seasonality != null ? this.seasonality.hashCode() : 0);
        hash = 73 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 73 * hash + (this.fixed ? 1 : 0);
        hash = 73 * hash + (this.isDefault ? 1 : 0);
        hash = 73 * hash + (this.allDate ? 1 : 0);
        hash = 73 * hash + this.numberOfDays;
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
        final ExMetricBaseline other = (ExMetricBaseline) obj;
        if ((this.seasonality == null) ? (other.seasonality != null) : !this.seasonality.equals(other.seasonality)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.fixed != other.fixed) {
            return false;
        }
        if (this.isDefault != other.isDefault) {
            return false;
        }
        if (this.allDate != other.allDate) {
            return false;
        }
        if (this.numberOfDays != other.numberOfDays) {
            return false;
        }
        return true;
    }
    
    
}
