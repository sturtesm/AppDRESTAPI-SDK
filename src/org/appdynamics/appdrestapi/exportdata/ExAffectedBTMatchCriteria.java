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
    
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.AFFECTED_BT_MATCH_CRITERIA);
        bud.append(AppExportS.L3_1).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(appComponents != null){bud.append(AppExportS.L3_1).append(AppExportS.APPLICATION_COMPONENTS);bud.append(appComponents);}
        if(bts.size() > 0){
            for(ExHRBusinessTransaction bt:bts) bud.append(bt);
        }
        if(matchType != null){
            bud.append(AppExportS.L3_1).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.L3_1).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.L3_1).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        }
        return bud.toString();
    }
}
