/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * 
 * Found the ability extract custom dashboards, this is going to be the object.
 * 
 */
public class Dashboard {
    private String name,value;
    private boolean exists=false;
    
    public Dashboard(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L0).append(value).append(AppExportS.L0);
        return bud.toString();
    }
    
}
