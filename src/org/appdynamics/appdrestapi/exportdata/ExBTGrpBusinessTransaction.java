/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Objects;

/**
 *
 * @author gilbert.solorzano
 */
public class ExBTGrpBusinessTransaction {
    private String applicationComponent; //attribute
    private String value;
    private int level=4;

    public ExBTGrpBusinessTransaction() { }

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    
    @XmlAttribute(name=AppExportS.APPLICATION_COMPONENT)
    public String getApplicationComponent() {
        return applicationComponent;
    }

    public void setApplicationComponent(String applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override //l2_1
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_COMPONENT).append(AppExportS.VE).append(applicationComponent);
        bud.append(AppExportS.I[level]).append(AppExportS.VALUE).append(AppExportS.VE).append(value);
        level--;
        return bud.toString();
    }
    
    
    public String whatIsDifferent(ExBTGrpBusinessTransaction obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BUSINESS_TRANSACTION);
        level++;
        if(!value.equals(obj.getValue())){      
            bud.append(AppExportS.I[level]).append(AppExportS.VALUE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getValue());
            level--;
        }
        
        if(!applicationComponent.equals(obj.getApplicationComponent())){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(applicationComponent);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getApplicationComponent());
            level--;
        }
        
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final ExBTGrpBusinessTransaction other = (ExBTGrpBusinessTransaction) obj;
        if (!Objects.equals(this.applicationComponent, other.applicationComponent)) {
            return false;
        }
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}

/*
<business-transaction application-component="slx">INV_UpdateListing_v1</business-transaction>
*/
