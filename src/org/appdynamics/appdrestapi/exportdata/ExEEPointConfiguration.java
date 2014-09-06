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
 * <configuration transaction-entry-point-type="BINARY_REMOTING">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="SIMPLE_CLASS_NAME_AND_METHOD_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
    </configuration>
 * 
 */
@XmlSeeAlso({ExDiscoveryConfig.class,ExNamingConfig.class,ExNameValues.class,ExNameValue.class,ExExclude.class,ExServletRule.class,ExClassName.class})
public class ExEEPointConfiguration {
    private String transactionEntryPointType;
    private boolean enable;
    private ExDiscoveryConfig discoveryConfig;
    
    public ExEEPointConfiguration(){}

    @XmlAttribute(name=AppExportS.TRANSACTION_ENTRY_POINT_TYPE)
    public String getTransactionEntryPointType() {
        return transactionEntryPointType;
    }

    public void setTransactionEntryPointType(String transactionEntryPointType) {
        this.transactionEntryPointType = transactionEntryPointType;
    }

    @XmlElement(name=AppExportS.ENABLE)
    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @XmlElement(name=AppExportS.DISCOVERY_CONFIG)
    public ExDiscoveryConfig getDiscoveryConfig() {
        return discoveryConfig;
    }

    public void setDiscoveryConfig(ExDiscoveryConfig discoveryConfig) {
        this.discoveryConfig = discoveryConfig;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.CONFIGURATION);
        bud.append(AppExportS.L4).append(AppExportS.ENABLE).append(AppExportS.VE).append(enable);
        bud.append(AppExportS.L4).append(AppExportS.TRANSACTION_ENTRY_POINT_TYPE).append(AppExportS.VE).append(transactionEntryPointType);
        bud.append(discoveryConfig.toString());
        bud.append(AppExportS.L3);
        return bud.toString();
    }
    
}
