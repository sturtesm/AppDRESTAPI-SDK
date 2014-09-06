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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.EXCLUDES);
        for(ExExclude ex: excludes) bud.append(ex.toString());
        return bud.toString();
    }
}
