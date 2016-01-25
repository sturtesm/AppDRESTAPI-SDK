/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */

@XmlSeeAlso({ExNamingOptions.class,ExNamingActions.class,ExNameValue.class})
public class ExBackendIdentityOption {
    private String name;
    private ExNamingOptions namingOptions;
    private ExNamingActions namingActions;
    private boolean enabled;
    private int level=8;
    
    public ExBackendIdentityOption(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=AppExportS.NAMING_OPTIONS)
    public ExNamingOptions getNamingOptions() {
        return namingOptions;
    }

    public void setNamingOptions(ExNamingOptions namingOptions) {
        this.namingOptions = namingOptions;
    }

    @XmlElement(name=AppExportS.NAMING_ACTIONS)
    public ExNamingActions getNamingActions() {
        return namingActions;
    }

    public void setNamingActions(ExNamingActions namingActions) {
        this.namingActions = namingActions;
    }

    @XmlElement(name=AppExportS.ENABLED)
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    public String whatIsDifferent(ExBackendIdentityOption obj){
        
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_IDENTITY_OPTION);
        level--;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        
       if(enabled != obj.isEnabled()){
            bud.append(AppExportS.I[level]).append(AppExportS.ENABLED);
            level++;
            bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(enabled);
            bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isEnabled());
            level--;
       }
       
       namingOptions.setLevel(level);
       bud.append(namingOptions.whatIsDifferent(obj.getNamingOptions()));
       namingActions.setLevel(level);
       bud.append(namingActions.whatIsDifferent(obj.getNamingActions()));
       level--;
        return bud.toString();
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.BACKEND_IDENTITY_OPTION);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.NAME).append(AppExportS.VE).append(name);
        if(namingOptions != null){namingOptions.setLevel(level); bud.append(namingOptions);}
        if(namingActions != null) {namingActions.setLevel(level);bud.append(namingActions);}
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 67 * hash + (this.namingOptions != null ? this.namingOptions.hashCode() : 0);
        hash = 67 * hash + (this.namingActions != null ? this.namingActions.hashCode() : 0);
        hash = 67 * hash + (this.enabled ? 1 : 0);
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
        final ExBackendIdentityOption other = (ExBackendIdentityOption) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.namingOptions != other.namingOptions && (this.namingOptions == null || !this.namingOptions.equals(other.namingOptions))) {
            return false;
        }
        if (this.namingActions != other.namingActions && (this.namingActions == null || !this.namingActions.equals(other.namingActions))) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        return true;
    }
    
    
    
}

/*
 * 
                        <backend-identity-option>
                            <name>Host</name>
                            <naming-options>
                                <name-value>
                                    <name>use-entire-string</name>
                                    <value>true</value>
                                </name-value>
                            </naming-options>
                            <naming-actions/>
                            <enabled>true</enabled>
                        </backend-identity-option>
 * 
 */