/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;


import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(CustomMatchPoint.class)
@XmlRootElement(name=s.CUSTOM_MATCH_POINTS)
public class CustomMatchPoints {
    private String controllerVersion;
    private ArrayList<CustomMatchPoint> customMatchPoints=new ArrayList<CustomMatchPoint>();
    
    public CustomMatchPoints(){}

    
    @XmlAttribute(name=AppExportS.CONTROLLER_VERSION)
    public String getControllerVersion() {
        return controllerVersion;
    }

    public void setControllerVersion(String controllerVersion) {
        this.controllerVersion = controllerVersion;
    }

    @XmlElement(name=s.CUSTOM_MATCH_POINT)
    public ArrayList<CustomMatchPoint> getCustomMatchPoints() {
        return customMatchPoints;
    }

    public void setCustomMatchPoints(ArrayList<CustomMatchPoint> customMatchPoints) {
        this.customMatchPoints = customMatchPoints;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1).append(s.CUSTOM_MATCH_POINTS);
        for(CustomMatchPoint val:customMatchPoints)bud.append(val);
        return bud.toString();
    }
}
