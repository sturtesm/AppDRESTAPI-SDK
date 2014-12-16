/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ConfigurationItem.class)
@XmlRootElement(name=s.CONFIGURATION_ITEMS)
public class ConfigurationItems {
    private ArrayList<ConfigurationItem> configurationItems=new ArrayList<ConfigurationItem>();
    
    public ConfigurationItems(){}

    @XmlElement(name=s.CONFIGURATION_ITEM)
    public ArrayList<ConfigurationItem> getConfigurationItems() {
        return configurationItems;
    }

    public void setConfigurationItems(ArrayList<ConfigurationItem> configurationItems) {
        this.configurationItems = configurationItems;
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append(s.CONFIGURATION_ITEMS);
        for(ConfigurationItem ci: configurationItems) bud.append(ci.toString()); 
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.configurationItems != null ? this.configurationItems.hashCode() : 0);
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
        final ConfigurationItems other = (ConfigurationItems) obj;
        if (this.configurationItems != other.configurationItems && (this.configurationItems == null || !this.configurationItems.equals(other.configurationItems))) {
            return false;
        }
        return true;
    }
    
    
    
}
