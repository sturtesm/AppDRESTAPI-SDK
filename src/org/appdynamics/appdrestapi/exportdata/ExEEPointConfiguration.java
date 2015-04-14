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
 */
/*
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
    
    public String whatIsDifferent(ExEEPointConfiguration obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.CONFIGURATION);
        bud.append(AppExportS.L3_1).append(AppExportS.TRANSACTION_ENTRY_POINT_TYPE).append(AppExportS.VE).append(transactionEntryPointType);
        
        if(enable != obj.isEnable()){
            bud.append(AppExportS.L3_1).append(AppExportS.ENABLE);
            bud.append(AppExportS.L4).append(AppExportS.SRC).append(enable);
            bud.append(AppExportS.L4).append(AppExportS.DEST).append(obj.isEnable());
        }
        
        bud.append(discoveryConfig.whatIsDifferent(obj.getDiscoveryConfig()));
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.CONFIGURATION);
        bud.append(AppExportS.L3_1).append(AppExportS.ENABLE).append(AppExportS.VE).append(enable);
        bud.append(AppExportS.L3_1).append(AppExportS.TRANSACTION_ENTRY_POINT_TYPE).append(AppExportS.VE).append(transactionEntryPointType);
        bud.append(discoveryConfig);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.transactionEntryPointType != null ? this.transactionEntryPointType.hashCode() : 0);
        hash = 37 * hash + (this.enable ? 1 : 0);
        hash = 37 * hash + (this.discoveryConfig != null ? this.discoveryConfig.hashCode() : 0);
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
        final ExEEPointConfiguration other = (ExEEPointConfiguration) obj;
        if ((this.transactionEntryPointType == null) ? (other.transactionEntryPointType != null) : !this.transactionEntryPointType.equals(other.transactionEntryPointType)) {
            return false;
        }
        if (this.enable != other.enable) {
            return false;
        }
        if (this.discoveryConfig != other.discoveryConfig && (this.discoveryConfig == null || !this.discoveryConfig.equals(other.discoveryConfig))) {
            return false;
        }
        return true;
    }
    
    
}
