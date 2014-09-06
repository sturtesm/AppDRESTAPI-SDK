/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

/**
 *
 * @author gilbert.solorzano
 */
public class ExCustomExitPointDefinitions {
    
    public ExCustomExitPointDefinitions(){}
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.CUSTOM_EXIT_POINT_DEFINITIONS);
        return bud.toString();
    }
    
}
