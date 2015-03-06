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
public class MarkHistoricalQuery {
    
    public static String queryMarkNodeHistorical(String baseURL, String ids) throws Exception{
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_MARK_HISTORICAL).append(ids);
        return bud.toString();
    }
    
}
