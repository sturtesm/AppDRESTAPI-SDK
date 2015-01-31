/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gilbert.solorzano
 */
@XmlRootElement(name=AppExportS.CUSTOM_DASHBOARD)
public class ExDashboard {
    private String controllerVersion, customDashboardVersion,name, height,width;
    
    public ExDashboard(){}

    @XmlAttribute(name=AppExportS.CONTROLLER_VERSION)
    public String getControllerVersion() {
        return controllerVersion;
    }

    public void setControllerVersion(String controllerVersion) {
        this.controllerVersion = controllerVersion;
    }

    @XmlAttribute(name=AppExportS.CUSTOM_DASHBOARD_VERSION)
    public String getCustomDashboardVersion() {
        return customDashboardVersion;
    }

    public void setCustomDashboardVersion(String customDashboardVersion) {
        this.customDashboardVersion = customDashboardVersion;
    }

    @XmlAttribute(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name=AppExportS.HEIGHT)
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @XmlAttribute(name=AppExportS.WIDTH)
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.NAME).append(AppExportS.VE).append(name);
        return bud.toString();
    }
    
}
