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
    private int level=4;
    
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

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.HTTP_ERROR_RETURN_CODE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.I[level]).append(AppExportS.DISABLE).append(AppExportS.VE).append(disable);
        bud.append(AppExportS.I[level]).append(AppExportS.LOWER_BOUND).append(AppExportS.VE).append(lowerBound);
        bud.append(AppExportS.I[level]).append(AppExportS.UPPER_BOUND).append(AppExportS.VE).append(upperBound);
        level--;
        return bud.toString();
    }
    
    public String whatIsDifferent(ExHttpErrorReturnCode obj){
        if(!name.equals(obj.getName())) return AppExportS._U;
        
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.HTTP_ERROR_RETURN_CODE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(disable != obj.isDisable()){
            bud.append(AppExportS.I[level]).append(AppExportS.DISABLE);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(disable);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(obj.isDisable());
            level--;
        }
        
        if(lowerBound != obj.getLowerBound()){
            bud.append(AppExportS.I[level]).append(AppExportS.LOWER_BOUND);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(lowerBound);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(obj.getLowerBound());
            level--;
        }
        
        if(upperBound != obj.getUpperBound()){
            bud.append(AppExportS.I[level]).append(AppExportS.MATCH_PATTERN);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(upperBound);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(obj.getUpperBound());
            level--;
        }
        
        level--;
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
