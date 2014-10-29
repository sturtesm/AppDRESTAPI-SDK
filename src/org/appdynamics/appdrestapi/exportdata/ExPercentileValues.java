/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * L3
 * 
                    <percentile-values>
                        <percentile-value>
                            <value>95.0</value>
                        </percentile-value>
                    </percentile-values>
 */
@XmlSeeAlso(ExPercentileValue.class)
public class ExPercentileValues {
    private ArrayList<ExPercentileValue> percentileValues=new ArrayList<ExPercentileValue>();
    
    public ExPercentileValues(){}

    @XmlElement(name=AppExportS.PERCENTILE_VALUE)
    public ArrayList<ExPercentileValue> getPercentileValues() {
        return percentileValues;
    }

    public void setPercentileValues(ArrayList<ExPercentileValue> percentileValues) {
        this.percentileValues = percentileValues;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.PERCENTILE_VALUES);
        for(ExPercentileValue per: percentileValues) bud.append(per.toString());        
        return bud.toString();
    }
}
