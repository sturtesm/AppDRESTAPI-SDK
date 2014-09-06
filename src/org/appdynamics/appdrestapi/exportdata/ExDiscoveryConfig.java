/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
<discovery-config discovery-resolution="FIRST_ENTRY_POINT">
    <discovery-config-enabled>true</discovery-config-enabled>
                            <exclude name="CometD Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.cometd.server.CometdServlet"/>
                                </servlet-rule>
                            </exclude>
    <naming-config scheme="SIMPLE_CLASS_NAME_AND_METHOD_NAME">
        <name-values/>
    </naming-config>
</discovery-config>
 */
@XmlSeeAlso({ExNamingConfig.class,ExNameValues.class,ExNameValue.class,ExExcludes.class,ExExclude.class,ExServletRule.class,ExClassName.class})
public class ExDiscoveryConfig {
    private String discoveryResolution;
    private boolean discoveryConfigEnabled;
    private ExExcludes excludes;
    private ExNamingConfig namingConfig;
    
    public ExDiscoveryConfig(){}

    @XmlElement(name=AppExportS.EXCLUDES)
    public ExExcludes getExcludes() {
        return excludes;
    }

    public void setExcludes(ExExcludes excludes) {
        this.excludes = excludes;
    }
    
    @XmlAttribute(name=AppExportS.DISCOVERY_RESOLUTION)
    public String getDiscoveryResolution() {
        return discoveryResolution;
    }

    public void setDiscoveryResolution(String discoveryResolution) {
        this.discoveryResolution = discoveryResolution;
    }

    @XmlElement(name=AppExportS.DISCOVERY_CONFIG_ENABLED)
    public boolean isDiscoveryConfigEnabled() {
        return discoveryConfigEnabled;
    }

    public void setDiscoveryConfigEnabled(boolean discoveryConfigEnabled) {
        this.discoveryConfigEnabled = discoveryConfigEnabled;
    }


    @XmlElement(name=AppExportS.NAMING_CONFIG)
    public ExNamingConfig getNamingConfig() {
        return namingConfig;
    }

    public void setNamingConfig(ExNamingConfig namingConfig) {
        this.namingConfig = namingConfig;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.DISCOVERY_CONFIG);
        bud.append(AppExportS.L4).append(AppExportS.DISCOVERY_RESOLUTION).append(AppExportS.VE).append(discoveryResolution);
        bud.append(AppExportS.L4).append(AppExportS.DISCOVERY_CONFIG_ENABLED).append(AppExportS.VE).append(discoveryConfigEnabled);
        
        bud.append(excludes.toString());
        bud.append(namingConfig);
        return bud.toString();
    }
}
