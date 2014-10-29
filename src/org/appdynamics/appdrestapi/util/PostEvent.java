/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;
/**
 *
 * @author gilbert.solorzano
 */
public class PostEvent {
    private String summary;
    private String comment;
    private String eventType;
    private String customEventType;
    private String node;
    private String tier;
    private String bt;
    private ArrayList<String> propertyKey=new ArrayList<String>();
    private ArrayList<String> propertyValue=new ArrayList<String>();
    
    /**
     * <p>
     *  The main requirement for the object is that a summary be provided.
     * If the user does provide either a node or bt value, then the user 
     * must provide a tier value, otherwise an exception will be thrown
     * during the URL creation method.
     * </p>
     * @param summary 
     */
    public PostEvent(String summary){
        this.summary=summary;
    }
    
    public PostEvent(String summary, String comment){
        this.comment=comment;
        this.summary=summary;
    }
    
    public PostEvent(String summary,String comment, String customEventType){
        
        this.comment=comment;
        this.summary=summary;
        this.customEventType=customEventType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getCustomEventType() {
        return customEventType;
    }

    public void setCustomEventType(String customerEventType) {
        this.customEventType = customerEventType;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    
    public void addProperty(String key, String value){
        propertyKey.add(QueryEncoder.encode(key));
        propertyValue.add(QueryEncoder.encode(value));
    }
    
    //events?eventtype=CUSTOM&customeventtype=nagios&summary=test1&propertynames=key1&propertynames=key2&propertyvalues=value1&propertyvalues=value2
    public String createURL() throws Exception{
        
        if( (node != null || bt != null) && tier == null) throw new Exception("When providing a node or bt value, the tier value must also be provided.");
        
        if( summary == null ) throw new Exception("The summary parameter must be provided");
        
        StringBuilder bud = new StringBuilder();
        bud.append(s.EVENT_TYPE_CUSTOM);
        bud.append(s.EVENT_SUMMARY).append(QueryEncoder.encode(summary));
        if(customEventType != null)bud.append(s.CUSTOM_EVENT_TYPE).append(QueryEncoder.encode(customEventType));
        if(comment != null) bud.append(s.COMMENT).append(QueryEncoder.encode(comment));
        if(tier != null) bud.append(s.EVENT_TIER).append(QueryEncoder.encode(tier));
        if(node != null) bud.append(s.EVENT_NODE).append(QueryEncoder.encode(node));
        if(bt != null) bud.append(s.EVENT_BT).append(QueryEncoder.encode(bt));
        if(propertyKey.size() > 0){
            for(String key:propertyKey) bud.append(s.PROPERTY_NAMES).append(key);
            for(String val:propertyValue) bud.append(s.PROPERTY_VALUES).append(val);
        }
        return bud.toString();
    }
   
}
