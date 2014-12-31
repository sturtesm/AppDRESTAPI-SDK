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
    
    
     public String whatIsDifferent(ExApplicationDiagnosticData obj){
        if(this.equals(obj) || !name.equals(obj.getName())) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.APPLICATION_DIAGNOSTIC_DATA);
        bud.append(AppExportS.L3_1).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
        if(!summary.equals(obj.getSummary())){     
            bud.append(AppExportS.L3_1).append(AppExportS.SUMMARY);
            bud.append(AppExportS.L4).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(summary);
            bud.append(AppExportS.L4).append(AppExportS.METHOD_NAME).append(AppExportS.VE).append(obj.getSummary());    
        }
        
        if(!diagnosticType.equals(obj.getDiagnostic())){     
            bud.append(AppExportS.L3_1).append(AppExportS.PAGE_CONFIG);
            bud.append(AppExportS.L4).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(diagnosticType);
            bud.append(AppExportS.L4).append(AppExportS.METHOD_NAME).append(AppExportS.VE).append(obj.getDiagnostic());    
        }
        
         if(!key.equals(obj.getKey())){     
            bud.append(AppExportS.L3_1).append(AppExportS.KEY);
            bud.append(AppExportS.L4).append(AppExportS.CLASS_NAME).append(AppExportS.VE).append(key);
            bud.append(AppExportS.L4).append(AppExportS.METHOD_NAME).append(AppExportS.VE).append(obj.getKey());    
        }
        
        return bud.toString();
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
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 89 * hash + (this.summary != null ? this.summary.hashCode() : 0);
        hash = 89 * hash + (this.diagnosticType != null ? this.diagnosticType.hashCode() : 0);
        hash = 89 * hash + (this.key != null ? this.key.hashCode() : 0);
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
        final ExApplicationDiagnosticData other = (ExApplicationDiagnosticData) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.summary == null) ? (other.summary != null) : !this.summary.equals(other.summary)) {
            return false;
        }
        if ((this.diagnosticType == null) ? (other.diagnosticType != null) : !this.diagnosticType.equals(other.diagnosticType)) {
            return false;
        }
        if ((this.key == null) ? (other.key != null) : !this.key.equals(other.key)) {
            return false;
        }
        return true;
    }
    
    
}
