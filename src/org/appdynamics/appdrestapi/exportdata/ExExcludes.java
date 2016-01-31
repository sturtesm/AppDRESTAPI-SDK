/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 */

@XmlSeeAlso({ExExclude.class,ExServletRule.class,ExClassName.class})
public class ExExcludes {
    private ArrayList<ExExclude> excludes=new ArrayList<ExExclude>();
    private int level=8;
    
    public ExExcludes(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.EXCLUDE)
    public ArrayList<ExExclude> getExcludes() {
        return excludes;
    }

    public void setExcludes(ArrayList<ExExclude> excludes) {
        this.excludes = excludes;
    }
    
    public String whatIsDifferent(ExExcludes obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.EXCLUDES);
        level++;
        
        for(ExExclude value: excludes){
            boolean fnd=false;
            for(ExExclude _value:obj.getExcludes()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){value.setLevel(level);bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);}
        }
        
        for(ExExclude value: getExcludes()){
            boolean fnd=false;
            for(ExExclude _value:obj.excludes){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){value.setLevel(level);bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);}
        }
        
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.EXCLUDES);
        level++;
        for(ExExclude ex: excludes){ex.setLevel(level); bud.append(ex);}
        level--;
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
        for(ExExclude value: excludes){
            boolean fnd=false;
            for(ExExclude _value:other.getExcludes()){
                if(value.getName().equals(_value.getName())){
                    if(value.equals(_value))fnd=true;
                }
            }
            if(!fnd){return false;}
        }
        return true;
    }
    
    
    
}
