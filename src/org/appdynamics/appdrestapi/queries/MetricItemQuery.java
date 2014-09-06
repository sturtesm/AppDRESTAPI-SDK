/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;



import java.util.logging.Logger;
import java.util.logging.Level;
import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;


/**
 *
 * @author gilbert.solorzano
 */
public class MetricItemQuery {
    private static Logger logger=Logger.getLogger(TierQuery.class.getName());
    
    public static String queryMetricList(String baseURL, String application){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.URL_METRIC_LIST);
        return bud.toString();
    }
    
    public static String queryMetricListForPath(String baseURL, String application, String path){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.URL_METRIC_LIST);
        bud.append(s.URL_METRIC_PATH_LIST).append(QueryEncoder.encode(path));
        return bud.toString();
    }
    
    public static String queryGeneralMetricQuery(String baseURL, String application, String path, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);

        val.append(QueryEncoder.encode(path));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
}
