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
public class HealthRuleQuery {
    public static String queryHealthRulesExportAll(String baseURL, String application){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_OBJ).append(s.URL_HEALTHRULES).append(QueryEncoder.encode(application));
        return bud.toString();
    }
    
    public static String queryHealthRulesExportSingle(String baseURL, String application, String healthRule){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_OBJ).append(s.URL_HEALTHRULES).append(QueryEncoder.encode(application));
        bud.append(s.URL_NAME).append(QueryEncoder.encode(healthRule));
        return bud.toString();
    }
    
    public static String queryHealthRulesImportAll(String baseURL, String application){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_OBJ).append(s.URL_HEALTHRULES).append(QueryEncoder.encode(application));
        bud.append(s.URL_OVERWRITE);
        return bud.toString();
    }
    
    public static String queryHealthRulesImportSingle(String baseURL, String application, String healthRule){       
        StringBuilder bud = new StringBuilder();
        bud.append(baseURL).append(s.CONTROLLER_OBJ).append(s.URL_HEALTHRULES).append(QueryEncoder.encode(application));
        bud.append(s.URL_NAME).append(QueryEncoder.encode(healthRule));
        bud.append(s.URL_OVERWRITE);
        return bud.toString();
    }
    
}
