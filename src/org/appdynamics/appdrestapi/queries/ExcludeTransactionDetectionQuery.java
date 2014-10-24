/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;


import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 */
public class ExcludeTransactionDetectionQuery {
    
    //
    //http://<CONTROLLER_PORT>/controller/transactiondetection/<APPLICATION>/exclude/servlet/Apache Axis Servlet 
    public static String queryTransactionDetectionExcludeExportAll(String baseURL, String application, String exclude){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_EXCLUDE).append(s.URL_SERVLET_L).append(s.F).append(QueryEncoder.encode(exclude));
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExcludeExportAll(String baseURL, String application, String tier, String exclude){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_EXCLUDE).append(s.URL_SERVLET_L).append(s.F).append(QueryEncoder.encode(exclude));
        return bud.toString();
    }
    
    // 
    //http://<CONTROLLER_PORT>/controller/transactiondetection/<APPLICATION>/<TIER>/exclude/servlet/Apache Axis Servlet 
    
}
