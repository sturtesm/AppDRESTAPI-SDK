/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 */
public class DBCollectorQuery {
    
    public static String queryPostUser(String baseURL) throws Exception{
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_DB_COLLECTOR);
        return bud.toString();
    }
    
}
