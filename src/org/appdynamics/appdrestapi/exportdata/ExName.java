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
 * 
 */
/*
 * <name filter-type="EQUALS" filter-value="execute"/>
 *  NEEDS WORK
 */
public class ExName {
    private String filterType;
    private String filterValue;
    
    public ExName(){}
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L4).append(AppExportS.NAME);
        
        return bud.toString();
    }
}
