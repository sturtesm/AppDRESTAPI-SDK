/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.data.RESTBaseURL;
import org.appdynamics.appdrestapi.data.Application;
import org.appdynamics.appdrestapi.data.Applications;
import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author soloink
 */
public class ApplicationQuery {
    private static Logger logger=Logger.getLogger(ApplicationQuery.class.getName());
    
    
    public static String queryAllApplications(String baseURL){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS);
        return bud.toString();
    }
    
    
}
