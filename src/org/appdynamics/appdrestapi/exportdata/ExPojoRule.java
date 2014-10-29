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
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>Cron4J</display-name>
                            <background>true</background>
                            <match-class type="inherits-from-class">
                                <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
                            </match-class>
                            <split-config type="4"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
                        </pojo-rule>
 * 4
 */
@XmlSeeAlso({ExMatchClass.class,ExSplitConfig.class,ExMatchMethod.class,ExMatchClassName.class})
public class ExPojoRule {
    private boolean enabled;
    private int priority;
    private String displayName;
    private boolean background;
    private ExMatchClass matchClass;
    private ExSplitConfig splitConfig;
    private ExMatchMethod matchMethod;
    
    public ExPojoRule(){}
    

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

    @XmlElement(name=AppExportS.DISPLAY_NAME)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @XmlElement(name=AppExportS.BACKGROUND)
    public boolean isBackground() {
        return background;
    }

    public void setBackground(boolean background) {
        this.background = background;
    }

    @XmlElement(name=AppExportS.MATCH_CLASS)
    public ExMatchClass getMatchClass() {
        return matchClass;
    }

    public void setMatchClass(ExMatchClass matchClass) {
        this.matchClass = matchClass;
    }

    @XmlElement(name=AppExportS.SPLIT_CONFIG)
    public ExSplitConfig getSplitConfig() {
        return splitConfig;
    }

    public void setSplitConfig(ExSplitConfig splitConfig) {
        this.splitConfig = splitConfig;
    }

    @XmlElement(name=AppExportS.MATCH_METHOD)
    public ExMatchMethod getMatchMethod() {
        return matchMethod;
    }

    public void setMatchMethod(ExMatchMethod matchMethod) {
        this.matchMethod = matchMethod;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2_1).append(AppExportS.POJO_RULE);
        bud.append(AppExportS.L3).append(AppExportS.ENABLED).append(AppExportS.VE).append(enabled);
        bud.append(AppExportS.L3).append(AppExportS.PRIORITY).append(AppExportS.VE).append(priority);
        bud.append(AppExportS.L3).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
        bud.append(AppExportS.L3).append(AppExportS.BACKGROUND).append(AppExportS.VE).append(background);
        bud.append(AppExportS.L3).append(AppExportS.MATCH_CLASS).append(matchClass);
        bud.append(AppExportS.L3).append(AppExportS.SPLIT_CONFIG).append(splitConfig);
        bud.append(AppExportS.L3).append(AppExportS.MATCH_METHOD).append(matchMethod);
        
        return bud.toString();
    }
    
}
