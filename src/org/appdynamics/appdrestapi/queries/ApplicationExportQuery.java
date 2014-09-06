/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;



import org.appdynamics.appdrestapi.resources.s;

import java.util.logging.Logger;
import java.util.logging.Level;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * https://familysearch.saas.appdynamics.com/controller/ConfigObjectImportExportServlet?applicationId=53
 * 
 */
public class ApplicationExportQuery {
    public static String queryApplicationExportByID(String baseURL, int appID){
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_OBJ).append(s.APPLICATION_EX_ID).append(appID);
        return bud.toString();
    }
}
