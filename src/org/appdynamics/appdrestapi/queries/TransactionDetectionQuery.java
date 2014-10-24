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
public class TransactionDetectionQuery {
    protected String baseURL;
    protected String application;
    
    // export all auto created BTs in APP
    // http://<CONTROLLER_PORT>/controller/transactiondetection/<APPLICATION>/auto
    public static String queryTransactionDetectionAutoAll(String baseURL, String application){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_BT_AUTO);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionAutoAll(String baseURL, String application, String tier){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_BT_AUTO);
        return bud.toString();
    }
    
    
    
    // export single BTs from app
    // http://<CONTROLLER_PORT>/controller/transactiondetection/<APPLICATION>/auto/Servlet
    
    public static String queryTransactionDetectionAutoSingle(String baseURL, String application, String entryPoint){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_BT_AUTO).append(s.F).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    public static String queryTransactionDetectionAutoSingle(String baseURL, String application, String tier, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_BT_AUTO).append(s.F).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExportAllPojo(String baseURL, String application){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_POJO_CUSTOM);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExportAllPojo(String baseURL, String application, String tier){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_POJO_CUSTOM);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExportPojo(String baseURL, String application, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.URL_POJO_CUSTOM).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    public static String queryTransactionDetectionExportPojo(String baseURL, String application, String tier, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_BT_URL).append(QueryEncoder.encode(application));
        bud.append(s.F).append(QueryEncoder.encode(tier)).append(s.URL_POJO_CUSTOM).append(QueryEncoder.encode(entryPoint));
        return bud.toString();
    }
    
    
    public static String queryTransactionDetectionImportPojo(String baseURL, String application, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(queryTransactionDetectionExportPojo(baseURL,application,entryPoint));
        bud.append(s.URL_OVERWRITE);
        return bud.toString();
    }
    
    public static String queryTransactionDetectionImportPojo(String baseURL, String application, String tier, String entryPoint){
        
        StringBuilder bud = new StringBuilder();
        bud.append(queryTransactionDetectionExportPojo(baseURL,application,tier,entryPoint));
        bud.append(s.URL_OVERWRITE);
        return bud.toString();
    }
    
}
