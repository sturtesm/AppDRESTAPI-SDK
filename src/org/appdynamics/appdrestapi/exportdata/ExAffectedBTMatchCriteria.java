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
 * L3
            <affected-entities-match-criteria>
                <affected-bt-match-criteria>
                    <type>ALL</type>
                </affected-bt-match-criteria>
            </affected-entities-match-criteria>
 */
@XmlSeeAlso({ExHRAppComponents.class,ExHRAppComponents.class,ExHRBusinessTransaction.class})
public class ExAffectedBTMatchCriteria {
    private String type;
    private ExHRAppComponents appComponents;
    private ArrayList<ExHRBusinessTransaction> bts=new ArrayList<ExHRBusinessTransaction>();
    private String matchType,matchPattern;
    private boolean inverse;
    
    public ExAffectedBTMatchCriteria(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.APPLICATION_COMPONENTS)
    public ExHRAppComponents getAppComponents() {
        return appComponents;
    }

    public void setAppComponents(ExHRAppComponents appComponents) {
        this.appComponents = appComponents;
    }

    @XmlElement(name=AppExportS.BUSINESS_TRANSACTION)
    public ArrayList<ExHRBusinessTransaction> getBts() {
        return bts;
    }

    public void setBts(ArrayList<ExHRBusinessTransaction> bts) {
        this.bts = bts;
    }

    @XmlElement(name=AppExportS.MATCH_TYPE)
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @XmlElement(name=AppExportS.MATCH_PATTERN)
    public String getMatchPattern() {
        return matchPattern;
    }

    public void setMatchPattern(String matchPattern) {
        this.matchPattern = matchPattern;
    }

    @XmlElement(name=AppExportS.INVERSE)
    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }
    
    public String whatIsDifferent(ExAffectedBTMatchCriteria obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.AFFECTED_BT_MATCH_CRITERIA);
        
        if(!type.equals(obj.getType())){     
            bud.append(AppExportS.L2_1).append(AppExportS.DESCRIPTION);
            bud.append(AppExportS.L3).append(AppExportS.SRC).append(AppExportS.VE).append(type);
            bud.append(AppExportS.L3).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getType());   
        }
        
        if(appComponents != null){
            bud.append(appComponents.whatIsDifferent(obj.getAppComponents()));
        }else{
            if(obj.getAppComponents()!=null){
                        bud.append(AppExportS.L4).append(AppExportS.APPLICATION_COMPONENT);
                    for(String value: obj.getAppComponents().getAppComponent()){
                        bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(AppExportS.VE).append(value);
                    }
            }
        }
        
        for(ExHRBusinessTransaction value: bts){
            boolean fnd=false;
            for(ExHRBusinessTransaction _value:obj.getBts()){
                  if(value.equals(_value))fnd=true;
            }
            if(!fnd) bud.append(AppExportS.L4_1).append(AppExportS.SRC).append(AppExportS.VE).append(value);
        }
        
        for(ExHRBusinessTransaction value: obj.getBts()){
            boolean fnd=false;
            for(ExHRBusinessTransaction _value:bts){
                  if(value.equals(_value))fnd=true;
            }
            if(!fnd) bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(AppExportS.VE).append(value);
        }
        
        if(matchType != null ){
            if(!matchType.equals(obj.getMatchType())){
                bud.append(AppExportS.L3_1).append(AppExportS.MATCH_TYPE);
                bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(matchType);
                bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchType()); 
            }
            if(!matchPattern.equals(obj.getMatchPattern())){
                bud.append(AppExportS.L3_1).append(AppExportS.MATCH_PATTERN);
                bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(matchPattern);
                bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getMatchPattern()); 
            }
            if(inverse != obj.isInverse()){
                bud.append(AppExportS.L3_1).append(AppExportS.INVERSE);
                bud.append(AppExportS.L4).append(AppExportS.SRC).append(AppExportS.VE).append(inverse);
                bud.append(AppExportS.L4).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isInverse());  
            }
        }
        
        return bud.toString();
     }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.AFFECTED_BT_MATCH_CRITERIA);
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(appComponents != null){bud.append(AppExportS.L3_1).append(AppExportS.APPLICATION_COMPONENTS);bud.append(appComponents);}
        if(!bts.isEmpty()){
            for(ExHRBusinessTransaction bt:bts) bud.append(bt);
        }
        if(matchType != null){
            bud.append(AppExportS.L3_1).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.L3_1).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.L3_1).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        }
        
        //private String matchType,matchPattern;
        //private boolean inverse;
        return bud.toString();
    }
    
    
    public String toXML(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.XOpen(AppExportS.AFFECTED_BT_MATCH_CRITERIA));
        bud.append(AppExportS.XElement(6, AppExportS.TYPE, type));
        if(appComponents != null){
            bud.append(AppExportS.L3_1).append(AppExportS.XOpen(AppExportS.APPLICATION_COMPONENTS));
            bud.append(appComponents);
            bud.append(AppExportS.L3_1).append(AppExportS.XClose(AppExportS.APPLICATION_COMPONENTS));
        }
        if(bts.size() > 0){
            for(ExHRBusinessTransaction bt:bts) bud.append(bt);
        }
        if(matchType != null){
            bud.append(AppExportS.XElement(6, AppExportS.MATCH_TYPE, matchType));
            bud.append(AppExportS.XElement(6, AppExportS.MATCH_PATTERN, matchPattern));
            bud.append(AppExportS.XElement(6, AppExportS.INVERSE, inverse));
        }
        bud.append(AppExportS.L3).append(AppExportS.XClose(AppExportS.AFFECTED_BT_MATCH_CRITERIA));
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 89 * hash + (this.inverse ? 1 : 0);
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
        final ExAffectedBTMatchCriteria other = (ExAffectedBTMatchCriteria) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if (this.appComponents != other.appComponents && (this.appComponents == null || !this.appComponents.equals(other.appComponents))) {
            return false;
        }
        if (this.bts != other.bts && (this.bts == null || !this.bts.equals(other.bts))) {
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
