/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */
public class BusinessTransaction {
    private int id;
    private String name;
    private String entryPointType;
    private String internalName;
    private int tierId;
    private String tierName;
    private boolean background;

    @XmlElement(name=s.ID)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name=s.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=s.ENTRY_POINT_TYPE)
    public String getEntryPointType() {
        return entryPointType;
    }

    public void setEntryPointType(String entryPointType) {
        this.entryPointType = entryPointType;
    }

    @XmlElement(name=s.INTERNAL_NAME)
    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    @XmlElement(name=s.TIER_ID)
    public int getTierId() {
        return tierId;
    }

    public void setTierId(int tierId) {
        this.tierId = tierId;
    }

    @XmlElement(name=s.TIER_NAME)
    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    @XmlElement(name=s.BACKGROUND)
    public boolean isBackground() {
        return background;
    }

    public void setBackground(boolean background) {
        this.background = background;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        bud.append("\tid = ").append(id);
        bud.append("\n\tname = ").append(name);
        bud.append("\n\tentryPointType=").append(entryPointType);
        bud.append("\n\tinternalName=").append(internalName);
        bud.append("\n\ttierId=").append(tierId);
        bud.append("\n\ttierName=").append(tierName);
        bud.append("\n\tbackground=").append(background).append("\n");
        return bud.toString();
    }
    
    
}

/*

 * <business-transaction>
  <id>6210</id>
  <name>_APPDYNAMICS_DEFAULT_TX_</name>
  <entryPointType>POJO</entryPointType>
  <internalName>_APPDYNAMICS_DEFAULT_TX_</internalName>
  <tierId>578</tierId>
  <tierName>my-family-booklet-dev</tierName>
  <background>false</background>
</business-transaction>

<business-transaction>
<id>397</id>
<name>/product/furniture</name>
<entryPointType>SERVLET</entryPointType>
<internalName>/product/furniture</internalName>
<tierId>44</tierId>
<tierName>1stTier</tierName>
<background>false</background>
</business-transaction>
*/
