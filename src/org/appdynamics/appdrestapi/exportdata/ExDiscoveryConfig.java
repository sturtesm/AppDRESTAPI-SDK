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
    
    public String whatIsDifferent(ExDiscoveryConfig obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.DISCOVERY_CONFIG);
        
        if(!discoveryResolution.equals(obj.discoveryResolution)){
            bud.append(AppExportS.L3_1).append(AppExportS.DISCOVERY_RESOLUTION);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(discoveryResolution);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.getDiscoveryResolution());
        }
        
        if(discoveryConfigEnabled != obj.isDiscoveryConfigEnabled()){
            bud.append(AppExportS.L3_1).append(AppExportS.DISCOVERY_CONFIG_ENABLED);
            bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(AppExportS.VE).append(discoveryConfigEnabled);
            bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(AppExportS.VE).append(obj.isDiscoveryConfigEnabled());
        }
        
        bud.append(excludes.whatIsDifferent(obj.getExcludes()));
        bud.append(namingConfig.whatIsDifferent(obj.getNamingConfig()));
        
        return bud.toString();
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.discoveryResolution != null ? this.discoveryResolution.hashCode() : 0);
        hash = 89 * hash + (this.discoveryConfigEnabled ? 1 : 0);
        hash = 89 * hash + (this.excludes != null ? this.excludes.hashCode() : 0);
        hash = 89 * hash + (this.namingConfig != null ? this.namingConfig.hashCode() : 0);
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
        final ExDiscoveryConfig other = (ExDiscoveryConfig) obj;
        if ((this.discoveryResolution == null) ? (other.discoveryResolution != null) : !this.discoveryResolution.equals(other.discoveryResolution)) {
            return false;
        }
        if (this.discoveryConfigEnabled != other.discoveryConfigEnabled) {
            return false;
        }
        if (this.excludes != other.excludes && (this.excludes == null || !this.excludes.equals(other.excludes))) {
            return false;
        }
        if (this.namingConfig != other.namingConfig && (this.namingConfig == null || !this.namingConfig.equals(other.namingConfig))) {
            return false;
        }
        return true;
    }
    
    
}
