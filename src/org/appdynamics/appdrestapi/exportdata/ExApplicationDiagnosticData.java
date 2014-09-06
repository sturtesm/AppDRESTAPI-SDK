/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author gilbert.solorzano
 */


public class ExApplicationDiagnosticData {
    private String name;
    private String summary;
    private String diagnosticType;
    private String key;
    
    public ExApplicationDiagnosticData(){}

    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.SUMMARY)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @XmlElement(name=AppExportS.DIAGNOSTIC_TYPE)
    public String getDiagnostic() {
        return diagnosticType;
    }

    public void setDiagnosticType(String diagnosticType) {
        this.diagnosticType = diagnosticType;
    }

    @XmlElement(name=AppExportS.KEY)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.APPLICATION_DIAGNOSTIC_DATA);
        bud.append(AppExportS.L4).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L4).append(AppExportS.SUMMARY).append(AppExportS.VE).append(summary);
        bud.append(AppExportS.L4).append(AppExportS.DIAGNOSTIC_TYPE).append(AppExportS.VE).append(diagnosticType);
        bud.append(AppExportS.L4).append(AppExportS.KEY).append(AppExportS.VE).append(key);
        return bud.toString();
    }
    
}
