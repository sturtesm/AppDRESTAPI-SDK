/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author gilbert.solorzano
 * 
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
    
    public ExMetricBaseline(){}

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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.METRIC_BASELINE);
        bud.append(AppExportS.L2).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2).append(AppExportS.SEASONALITY).append(AppExportS.VE).append(seasonality);
        bud.append(AppExportS.L2).append(AppExportS.FIXED).append(AppExportS.VE).append(fixed);
        bud.append(AppExportS.L2).append(AppExportS.IS_DEFAULT).append(AppExportS.VE).append(isDefault);
        bud.append(AppExportS.L2).append(AppExportS.ALL_DATE).append(AppExportS.VE).append(allDate);
        bud.append(AppExportS.L2).append(AppExportS.NUMBER_OF_DAYS).append(AppExportS.VE).append(numberOfDays);
        return bud.toString();
    }
}
