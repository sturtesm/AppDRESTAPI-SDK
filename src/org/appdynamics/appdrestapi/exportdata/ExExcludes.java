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
 */

@XmlSeeAlso({ExExclude.class,ExServletRule.class,ExClassName.class})
public class ExExcludes {
    private ArrayList<ExExclude> excludes=new ArrayList<ExExclude>();
    
    public ExExcludes(){}

    @XmlElement(name=AppExportS.EXCLUDE)
    public ArrayList<ExExclude> getExcludes() {
        return excludes;
    }

    public void setExcludes(ArrayList<ExExclude> excludes) {
        this.excludes = excludes;
    }
    
    public String whatIsDifferent(ExExcludes obj){
        if(this.equals(obj)) return AppExportS._;
        
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.EXCLUDES);
        
        for(ExExclude value: excludes){
            boolean fnd=false;
            for(ExExclude _value:obj.getExcludes()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    value.whatIsDifferent(_value);
                }
            }
            if(!fnd)bud.append(AppExportS.L4_1).append(AppExportS.SRC).append(value);
        }
        
        for(ExExclude value: getExcludes()){
            boolean fnd=false;
            for(ExExclude _value:obj.excludes){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd)bud.append(AppExportS.L4_1).append(AppExportS.DEST).append(value);
        }
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.EXCLUDES);
        for(ExExclude ex: excludes) bud.append(ex.toString());
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.excludes != null ? this.excludes.hashCode() : 0);
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
        final ExExcludes other = (ExExcludes) obj;
        if (this.excludes != other.excludes && (this.excludes == null || !this.excludes.equals(other.excludes))) {
            return false;
        }
        return true;
    }
    
    
    
}
