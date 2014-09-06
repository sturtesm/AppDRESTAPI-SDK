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
 */
public class BackendsQuery {
    private static Logger logger=Logger.getLogger(BackendsQuery.class.getName());
    
    public static String queryBackendsFromApps(String baseURL, String application){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application));
        bud.append(s.URL_BACKENDS);
        return bud.toString();
    }
    
    /*
     * metric-data?metric-path=Backends|<tier>|Average%20Response%20Time%20%28ms%29&time-range-type=BEFORE_NOW&duration-in-mins=15
     * 
     * Backends|alerts|Average Response Time (ms)
     */
    
    public static String queryBackendAverageResponseTimeMS(String baseURL, String application, String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BACKENDS1);
        bud.append(tier).append(s.AVERAGE_RESPONSE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        return val.toString();
    }
    
    public static String queryBackendCallsPerMinute(String baseURL, String application, String tier, long start, long end, boolean rollup){
        
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BACKENDS1);
        bud.append(tier).append(s.CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        return val.toString();
    }
    
    public static String queryBackendErrorsPerMinute(String baseURL, String application, String tier, long start, long end, boolean rollup){
        
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BACKENDS1);
        bud.append(tier).append(s.ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        return val.toString();
    }
    
    
}
