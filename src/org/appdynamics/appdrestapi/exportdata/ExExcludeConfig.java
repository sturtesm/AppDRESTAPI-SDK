/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 */
public class ExExcludeConfig {
    private ArrayList<ExApplicationDiagnosticData> applicationDiagnosticDatas=new ArrayList<ExApplicationDiagnosticData>();
    private int level=2;
    
    public ExExcludeConfig(){}

    @XmlElement(name=AppExportS.APPLICATION_DIAGNOSTIC_DATA)
    public ArrayList<ExApplicationDiagnosticData> getApplicationDiagnosticDatas() {
        return applicationDiagnosticDatas;
    }

    public void setApplicationDiagnosticDatas(ArrayList<ExApplicationDiagnosticData> applicationDiagnosticDatas) {
        this.applicationDiagnosticDatas = applicationDiagnosticDatas;
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
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.L5).append(AppExportS.EXCLUDE_CONFIG);
        bud.append(AppExportS.L5).append(AppExportS.APPLICATION_DIAGNOSTIC_DATA);
        for(ExApplicationDiagnosticData data:getApplicationDiagnosticDatas()) bud.append(data.toString());
        return bud.toString();
    }
    
}
