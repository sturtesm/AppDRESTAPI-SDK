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
public class ConfigurationItemQuery {
    
    public static String queryConfiguration(String baseURL, String application){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_CONFIG);
        return bud.toString();
    }
    
    public static String queryConfiguration(String baseURL, String application, String metricName){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_CONFIG).append(s.F).append(s.URL_NAME).append(metricName);
        return bud.toString();
    }
    
    
}
    