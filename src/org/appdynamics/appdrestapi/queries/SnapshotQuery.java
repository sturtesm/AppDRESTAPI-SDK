/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;


import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;
import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;
/**
 *
 * @author gilbert.solorzano
 * 
 * 'https://familysearch.saas.appdynamics.com//controller/rest/applications/81/request-snapshots?time-range-type=BEFORE_NOW&duration-in-mins=2'
 */
public class SnapshotQuery {
    
    public static String queryRequestSnapshot(String baseURL, String application, long start, long end){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_REQUEST_SNAPSHOTS);  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);

        return val.toString();
    }
    
    public static String queryRequestSnapshot(String baseURL, int application, long start, long end){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(application);
        val.append(s.URL_REQUEST_SNAPSHOTS);  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);

        return val.toString();
    }
    
}
