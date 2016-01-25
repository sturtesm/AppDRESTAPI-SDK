/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */
/*
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
    private int level=9;
    
    public ExAspDotNetRule(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    

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
    
    public String whatIsDifferent(ExAspDotNetRule obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ASP_DOTNET_RULE);
        level++;
        if(enabled != obj.isEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
            level--;
        }
        
        if(priority != obj.getPriority()){
            bud.append(AppExportS.I[level]).append(AppExportS.PRIORITY);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(priority);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getPriority());
            level--;
        }
        
        className.setLevel(level);
        bud.append(className.whatIsDifferent(obj.getClassName()));
        level--;
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.ASP_DOTNET_RULE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.I[level]).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);
        className.setLevel(level);
        bud.append(className);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.enabled ? 1 : 0);
        hash = 61 * hash + this.priority;
        hash = 61 * hash + (this.className != null ? this.className.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExAspDotNetRule other = (ExAspDotNetRule) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        if (this.className != other.className && (this.className == null || !this.className.equals(other.className))) {
            return false;
        }
        return true;
    }
    
    
    
}
