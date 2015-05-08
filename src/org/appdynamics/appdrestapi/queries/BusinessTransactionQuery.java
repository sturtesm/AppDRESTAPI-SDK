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
public class BusinessTransactionQuery {
    private static Logger logger=Logger.getLogger(BusinessTransactionQuery.class.getName());
    
    public static String queryBTSFromApps(String baseURL, String application){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.F).append(s.BUSINESS_TRANSACTIONS);
        return bud.toString();
    }
    
    public static String queryBTSFromApps(String baseURL, int appID){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(appID).append(s.F).append(s.BUSINESS_TRANSACTIONS);
        return bud.toString();
    }


    public static String queryBTFromApps(String baseURL, String application, int btId){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application)).append(s.F).append(s.BUSINESS_TRANSACTIONS).append(s.F).append(btId);
        return bud.toString();
    }

    public static String queryBTFromApps(String baseURL, int appID, int btId){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(appID).append(s.F).append(s.BUSINESS_TRANSACTIONS).append(s.F).append(btId);
        return bud.toString();
    }

    public static String queryBTAVERAGE_BLOCK_TIME_MS(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.P).append(s.AVERAGE_BLOCK_TIME_MS);
        val.append(QueryEncoder.encodeSpaces(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTAVERAGE_CPU_USED_MS(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.P).append(s.AVERAGE_CPU_USED_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTAVERAGE_REQUEST_SIZE(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.P).append(s.AVERAGE_REQUEST_SIZE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTAVERAGE_RESPONSE_TIME(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.P).append(s.AVERAGE_RESPONSE_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTAVERAGE_WAIT_TIME_MS(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.P).append(s.AVERAGE_WAIT_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTCALL_PER_MINUTE(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.P).append(s.CALL_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTERRORS_PER_MINUTE(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.P).append(s.NORMAL_AVERAGE_RESPONSE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTNUMBER_OF_SLOW_CALLS(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.NUMBER_OF_SLOW_CALLS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTNUMBER_OF_VERY_SLOW_CALLS(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.NUMBER_OF_VERY_SLOW_CALLS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryBTSTALL_COUNT(String baseURL, String application, String tier, String site, long start, long end, boolean rollup){
        //Business Transaction Performance|Business Transactions|tomcat-links|/links - Catchall|Average Block Time (ms)
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?
        //metric-path=Business%20Transaction%20Performance%7CBusiness%20Transactions%7Ctomcat-links%7C/links%20-%20Catchall%7CAverage%20Block%20Time%20(ms)
        //&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(site).append(s.STALL_COUNT);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /*
    Added by Hugh Brian
    */
    public static String queryAllMetricsPerBT(String baseURL, String application, String tier, String btName,  long start, long end, boolean rollup){


        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.URL_BUSINESS_TRANSACTION_PERFORMANCE).append(s.URL_BUSINESS_TRANSACTIONS);
        bud.append(tier).append(s.P).append(btName).append(s.P).append("*");
        val.append(QueryEncoder.encode(bud.toString()));

        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);


        String retValue = val.toString();


        return val.toString();
    }
    
}
