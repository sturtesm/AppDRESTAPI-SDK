/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
                            <exclude name="CometD Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.cometd.server.CometdServlet"/>
                                </servlet-rule>
                            </exclude>
                            * 
                            * <exclude name="ASP.NET WCF Activation Handler">
                                <asp-dotnet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="System.ServiceModel.Activation.HttpHandler"/>
                                </asp-dotnet-rule>
                            </exclude>
 * 
 */
@XmlSeeAlso(ExClassName.class)
public class ExAspDotNetRule {
    //private String name;
    private boolean enabled;
    private int priority;
    private ExClassName className;

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @XmlElement(name=AppExportS.PRIORITY)
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @XmlElement(name=AppExportS.CLASS_NAME)
    public ExClassName getClassName() {
        return className;
    }

    public void setClassName(ExClassName className) {
        this.className = className;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.ASP_DOTNET_RULE);
        bud.append(AppExportS.L4).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.L4).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);
        bud.append(className.toString());
        return bud.toString();
    }
    
}
