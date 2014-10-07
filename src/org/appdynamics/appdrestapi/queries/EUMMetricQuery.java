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
public class EUMMetricQuery {
    
    public static String queryEUM_AJAX_REQUESTS_PER_MIN(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_REQUESTS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_AJAX_REQUEST_ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_DOC_DOWNLOAD_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_DOCUMENT_DOWNLOAD_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_DOC_PROCESSING_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_DOCUMENT_PROCESSING_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_APPLICATION_SERVER_CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_APPLICATION_SERVER_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_APPLICATION_SERVER_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_END_USER_RESPONSE_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_FIRST_BYTE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_AJAX_Requests);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    
    /*
     * public static final String EUM_DOCUEMENT_READY_TIME_MS="|Document Ready Time (ms)";
    public static final String EUM_FRONT_END_TIME_MS="|Front End Time (ms)";
    public static final String EUM_PAGE_RENDER_TIME_MS="|Page Render Time (ms)";
    public static final String EUM_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE="|Page views with JavaScript Errors per Minute";
    public static final String EUM_RESPONSE_AVAILABLE_TIME_MS="|Response Available Time (ms)";
    public static final String EUM_SERVER_CONNECTION_TIME_MS="|Server Connection Time (ms)";
    public static final String EUM_SYNTHETIC_REQUESTS_PER_MINUTE="|Synthetic Requests per Minute"
Domain Lookup Time (ms)
Application Server Time (ms)
SSL Handshake Time (ms)
Application Server Calls per Minute
TCP Connect Time (ms)
DOM Ready Time (ms)
DOM Ready Time 50th percentile (ms)
DOM Ready Time 90th percentile (ms)
DOM Ready Time 95th percentile (ms)
DOM Ready Time 99th percentile (ms)


     */
    
    
    public static String queryEUM_BASE_PAGES_FRONT_END_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FRONT_END_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_PAGE_RENDER_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_RESPONSE_AVAILABLE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_SERVER_CONNECTION_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_SYNTHETIC_REQUESTS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_REQUESTS_PER_MIN(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_REQUESTS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOC_READY_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOCUEMENT_READY_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOCUMENT_DOWNLOAD_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOCUMENT_PROCESSING_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_TCP_CONNECT_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_APPLICATION_SERVER_CALLS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_SSL_HANDSHAKE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_APPLICATION_SERVER_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOMAIN_LOOKUP_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOM_READY_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_BASE_PAGES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    
    
    /*  IFrames 
--Done  Front End Time (ms)
--Done First Byte Time 90th percentile (ms)
--Done First Byte Time (ms)
--Done First Byte Time 50th percentile (ms)
--Done First Byte Time 95th percentile (ms)
--Done First Byte Time 99th percentile (ms)
* 
--Done Requests per Minute
--Done SSL Handshake Time (ms)
--Done Document Processing Time (ms)
--Done Document Download Time (ms)
--Done Page Render Time (ms)
--Done Page views with JavaScript Errors per Minute
--Done Server Connection Time (ms)
--Done Response Available Time (ms)
--Done Domain Lookup Time (ms)
--Done TCP Connect Time (ms)
Document Ready Time (ms)
DOM Ready Time 95th percentile (ms)
DOM Ready Time 90th percentile (ms)
DOM Ready Time 50th percentile (ms)
DOM Ready Time 99th percentile (ms)
End User Response Time (ms)
End User Response Time 50th percentile (ms)
End User Response Time 95th percentile (ms)
End User Response Time 90th percentile (ms)
End User Response Time 99th percentile (ms)
-- Done DOM Ready Time (ms)
     */
    
    public static String queryEUM_IFRAME_FRONT_END_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_FRONT_END_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOCUMENT_READY_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOCUEMENT_READY_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_TCP_CONNECT_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_TCP_CONNECT_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOMAIN_LOOKUP_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_RESPONSE_AVAILABLE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_SERVER_CONNECTION_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_PAGE_RENDER_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_PAGE_RENDER_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOCUMENT_DOWNLOAD_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOCUMENT_PROCESSING_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_SSL_HANDSHAKE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_REQUESTS_PER_MINUTE(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_REQUESTS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_FIRST_BYTE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_FIRST_BYTE_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
   
    public static String queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOM_READY_TIME_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_50TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_90TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_95TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS(String baseURL, String application, String urlPath, long start, long end, boolean rollup){
        //End User Experience|AJAX Requests|/|Requests per Minute
        //https://familysearch.saas.appdynamics.com/controller/rest/applications/FamilySearch-production/metric-data?metric-path=
        //End%20User%20Experience%7CAJAX%20Requests%7C/%7CRequests%20per%20Minute&time-range-type=BEFORE_NOW&duration-in-mins=15
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.EUM_USER_EXPERIENCE).append(s.EUM_IFRAMES);
        bud.append(urlPath).append(s.EUM_DOM_READY_TIME_99TH_PERCENTILE_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
}
