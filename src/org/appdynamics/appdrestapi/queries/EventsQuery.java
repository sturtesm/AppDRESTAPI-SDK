/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;


import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.util.PostEvent;

/**
 *
 * @author gilbert.solorzano
 */
public class EventsQuery {
    
    //https://familysearch.saas.appdynamics.com/controller/rest/applications/53/
    //events?time-range-type=BEFORE_NOW&duration-in-mins=10&
    //event-types=APPLICATION_ERROR,DIAGNOSTIC_SESSION&severities=INFO,WARN,ERROR&output=XML
    public static String queryPolicyViolationsSFromApps(String baseURL, String application, String eventTypes, String severities, long start, long end){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application));
        bud.append(s.URL_EVENTS);
        bud.append(s.TIME_BETWEEN1).append(s.TIME_START_TIME).append(start);
        bud.append(s.TIME_END_TIME).append(end).append(s.EVENT_TYPES).append(eventTypes).append(s.SEVERITIES);
        bud.append(severities).append(s.XML_OUTPUT);
        return bud.toString();
    }
    
    public static String queryPostEvent(String baseURL, String application, PostEvent postEvent) throws Exception{
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_APPS).append(QueryEncoder.encode(application));
        bud.append(s.URL_EVENTS).append(postEvent.createURL());
        return bud.toString();
    }
    
    
}
