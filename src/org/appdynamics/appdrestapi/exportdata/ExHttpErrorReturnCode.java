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
 * L2_1
 *
 */
/*
 * 
            <http-error-return-code disable="false">
                <name>Nothing Code</name>
                <lower-bound>503</lower-bound>
                <upper-bound>510</upper-bound>
            </http-error-return-code>
 * 
 */
public class ExHttpErrorReturnCode {
    private String name;
    private Integer lowerBound,upperBound;
    private boolean disable;
    
    public ExHttpErrorReturnCode(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.LOWER_BOUND)
    public Integer getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    @XmlElement(name=AppExportS.UPPER_BOUND)
    public Integer getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }

    @XmlAttribute(name=AppExportS.DISABLE)
    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.HTTP_ERROR_RETURN_CODE);
        bud.append(AppExportS.L2_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L2_1).append(AppExportS.DISABLE).append(AppExportS.VE).append(disable);
        bud.append(AppExportS.L2_1).append(AppExportS.LOWER_BOUND).append(AppExportS.VE).append(lowerBound);
        bud.append(AppExportS.L2_1).append(AppExportS.UPPER_BOUND).append(AppExportS.VE).append(upperBound);
        return bud.toString();
    }
    
    public String whatIsDifferent(ExHttpErrorReturnCode obj){
        if(!name.equals(obj.getName())) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L2).append(AppExportS.HTTP_ERROR_RETURN_CODE);
        bud.append(AppExportS.L2_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(disable != obj.isDisable()){
            bud.append(AppExportS.L2_1).append(AppExportS.DISABLE);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(disable);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(obj.isDisable());
        }
        
        if(lowerBound != obj.getLowerBound()){
            bud.append(AppExportS.L2_1).append(AppExportS.LOWER_BOUND);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(lowerBound);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(obj.getLowerBound());
        }
        
        if(upperBound != obj.getUpperBound()){
            bud.append(AppExportS.L2_1).append(AppExportS.MATCH_PATTERN);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(upperBound);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(obj.getUpperBound());
            
        }
        
        
        return bud.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + (this.lowerBound != null ? this.lowerBound.hashCode() : 0);
        hash = 53 * hash + (this.upperBound != null ? this.upperBound.hashCode() : 0);
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
        final ExHttpErrorReturnCode other = (ExHttpErrorReturnCode) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.lowerBound != other.lowerBound && (this.lowerBound == null || !this.lowerBound.equals(other.lowerBound))) {
            return false;
        }
        if (this.upperBound != other.upperBound && (this.upperBound == null || !this.upperBound.equals(other.upperBound))) {
            return false;
        }
        return true;
    }
    
    
    
}
