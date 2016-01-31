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
    
public String whatIsDifferent(ExExcludeConfig obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.EXCLUDE_CONFIG);
        
        for(ExApplicationDiagnosticData value:getApplicationDiagnosticDatas()){
            boolean fnd=false;
            for(ExApplicationDiagnosticData _value:obj.getApplicationDiagnosticDatas()){
                    if(value.getName().equals(_value.getName())){
                        fnd=true;
                        bud.append(value.whatIsDifferent(_value));
                    }
            }
            
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(value);
            }
        }
        
        for(ExApplicationDiagnosticData value:obj.getApplicationDiagnosticDatas()){
            boolean fnd=false;
            for(ExApplicationDiagnosticData _value:applicationDiagnosticDatas){
                    if(value.getName().equals(_value.getName())){
                        fnd=true; 
                    }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(value);
            }
        }
        return bud.toString();
}
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.EXCLUDE_CONFIG);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.APPLICATION_DIAGNOSTIC_DATA);
        for(ExApplicationDiagnosticData data:getApplicationDiagnosticDatas()){data.setLevel(level); bud.append(data);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.applicationDiagnosticDatas != null ? this.applicationDiagnosticDatas.hashCode() : 0);
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
        final ExExcludeConfig other = (ExExcludeConfig) obj;
        
        if(getApplicationDiagnosticDatas().size() != other.getApplicationDiagnosticDatas().size()) return false;
        
        for(ExApplicationDiagnosticData value:getApplicationDiagnosticDatas()){
            boolean fnd=false;
            for(ExApplicationDiagnosticData _value:other.getApplicationDiagnosticDatas()){
                    if(value.getName().equals(_value.getName())){
                        if(value.equals(_value)) fnd=true;
                    }
            }
            
            if(!fnd){
                return false;
            }
        }
        
        return true;
    }
    
    
}
