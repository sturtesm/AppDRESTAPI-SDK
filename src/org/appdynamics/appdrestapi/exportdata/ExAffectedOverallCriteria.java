/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 */
/*
 * <overall-affected-entities-match-criteria>
<type>APPLICATION</type>
</overall-affected-entities-match-criteria>
* 
 */
public class ExAffectedOverallCriteria {
    private String type;
    private int level=6;
    
    public ExAffectedOverallCriteria(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String whatIsDifferent(ExAffectedOverallCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.OVERALL_AFFECTED_ENTITIES_MATCH_CRITERIA);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(type);
        bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType()); 
        level--;
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.OVERALL_AFFECTED_ENTITIES_MATCH_CRITERIA);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final ExAffectedOverallCriteria other = (ExAffectedOverallCriteria) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        return true;
    }
    
    
}
