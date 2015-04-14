/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 * 
 * L2_1
 */
/*
 * <affected-entities-match-criteria>
    <affected-add-match-criteria>
    <type>ALL_ADDS</type>
    <add-types>
        <add-type>BASE_PAGE</add-type>
    </add-types>
    </affected-add-match-criteria>
</affected-entities-match-criteria>
 * 
 * 
 */
@XmlSeeAlso(ExHRAddTypes.class)
public class ExAffectedAddMatchCriteria {
    private String type;
    private ExHRAddTypes addTypes;
    private String matchType,matchPattern;
    private boolean inverse;
    
    public ExAffectedAddMatchCriteria(){}
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.AFFECTED_ADD_MATCH_CRITERIA);
        bud.append(AppExportS.L3).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(matchType != null){
            bud.append(AppExportS.L3).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.L3).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.L3).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        }
        bud.append(addTypes);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final ExAffectedAddMatchCriteria other = (ExAffectedAddMatchCriteria) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.addTypes != other.addTypes && (this.addTypes == null || !this.addTypes.equals(other.addTypes))) {
            return false;
        }
        if ((this.matchType == null) ? (other.matchType != null) : !this.matchType.equals(other.matchType)) {
            return false;
        }
        if ((this.matchPattern == null) ? (other.matchPattern != null) : !this.matchPattern.equals(other.matchPattern)) {
            return false;
        }
        if (this.inverse != other.inverse) {
            return false;
        }
        return true;
    }
    
    
}
