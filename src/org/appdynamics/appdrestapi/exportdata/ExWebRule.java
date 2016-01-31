/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.Objects;
import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 * 
 */

@XmlSeeAlso({ExNVProperties.class,ExMatchClassName.class})
public class ExWebRule {
    private boolean enabled;
    private int priority;
    private ExNVProperties properties;
    private ExMatchClassName uri;
    private int level=5;

    
    public ExWebRule(){}

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

    
    @XmlElement(name=AppExportS.URI)
    public ExMatchClassName getUri() {
        return uri;
    }

    public void setUri(ExMatchClassName uri) {
        this.uri = uri;
    }

    
    @XmlElement(name=AppExportS.PROPERTIES)
    public ExNVProperties getProperties() {
        return properties;
    }

    public void setProperties(ExNVProperties properties) {
        this.properties = properties;
    }
    
    public String whatIsDifferent(ExWebRule obj){
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.WEB_RULE);
        level++;
        if(enabled!=obj.isEnabled()){
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
        
        if(uri != obj.getUri()){
                bud.append(AppExportS.I[level]).append(AppExportS.URI);
                uri.setLevel(level);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(uri);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getUri());
                level--;
        }
        
        if(properties != obj.getProperties()){
                properties.setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.BACKGROUND);
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(AppExportS.VE).append(properties);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getProperties());
                level--;
        }

        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.WEB_RULE);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.I[level]).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);
        bud.append(AppExportS.I[level]).append(AppExportS.URI).append(AppExportS.VE).append(uri);
        bud.append(AppExportS.I[level]).append(AppExportS.PROPERTIES).append(AppExportS.VE).append(properties);
        level--;

        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.enabled ? 1 : 0);
        hash = 29 * hash + this.priority;
        hash = 29 * hash + Objects.hashCode(this.properties);
        hash = 29 * hash + Objects.hashCode(this.uri);
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
        final ExWebRule other = (ExWebRule) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        if (!Objects.equals(this.properties, other.properties)) {
            return false;
        }
        if (!Objects.equals(this.uri, other.uri)) {
            return false;
        }
        return true;
    }

    
    
    
}

/*
            <web-rule>
                <enabled>true</enabled>
                <priority>9</priority>
                <uri filter-type="NOT_EMPTY" filter-value="&lt;not empty>"/>
                <properties/>
            </web-rule>
 * 4
 */