/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 * 
 * This is going to be used to help key items
 *  - controller
 *  - application 
 *  - metricGroup
 *  - metricType
 *  - metricName
 */
public class MetricPathKey {
    private String controller;
    private String application;
    private String applicationId;
    private String metricGroup; //tierName/appname
    private String metricType; // Tier/BT/BE/
    private String metricName; //Node/BT-name/BE/
    private String metricTier;
    private String metricSite;
    private String metricNode;
    private String metricFreq;
    
    public MetricPathKey(String controller, String application, String applicationId){
        this.controller=controller;
        this.application=application;
        this.applicationId=applicationId;
    }
    
    public String[] shortMetricKey(int metricType, int metricQuery, String path, String freq){
        String[] pPath = MetricNameUtil.parse(path);
        this.metricFreq=freq;
        metricGroup=getObjectGroup(metricType,metricQuery,pPath);
        this.metricType=getObjectType(metricType,metricQuery,pPath,true);
        metricName=getObjectName(metricType,pPath);
        setTierSiteNode(metricType,pPath);
        return new String[]{controller,application,metricGroup,this.metricType,metricName};
        
    }
    
        /*
     * Metric Type:
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - EUM
     *   5 - Custom
     * 
     * End User Experience|Base Pages|/|First Byte Time (ms)
     */
    
    public void setTierSiteNode(int metricType, String[] pPath){
        if(metricType == 2 || metricType == 3){ metricTier=null; metricTier=pPath[1];}
        if(metricType == 3){metricNode=null;metricNode=pPath[3];}
        if(metricType == 4) {metricSite=null;metricSite=pPath[2];}

    }
    
    public String getObjectType(int metricType, int metricQuery, String[] pPath, boolean shortVal){
        
        if(shortVal){
            
            return MetricNameUtil.getObjectType(metricType, metricQuery, pPath);
 
        }else{
            if(metricType == 0) return s.LONG_METRIC_TYPES[0];
            if(metricType == 1) return s.LONG_METRIC_TYPES[1];
            if(metricType < 4){
                if(metricQuery < 2) return s.LONG_METRIC_TYPES[2];
                if(metricQuery < 22) return s.LONG_METRIC_TYPES[3];
                if(metricQuery < 37) return s.LONG_METRIC_TYPES[4];
                return s.LONG_METRIC_TYPES[5];
            }
            if(metricType == 4)  return s.LONG_METRIC_TYPES[6];
        }
        return "Type";
    }
    
    public String getObjectGroup(int metricType, int metricQuery, String[] path){
        if(metricType == 0) return s.SHORT_METRIC_TYPES[0];
        if(metricType == 1) return s.SHORT_METRIC_TYPES[1];
        if(metricType < 4){
                if(metricQuery < 2) return s.SHORT_METRIC_TYPES[2];
                if(metricQuery < 22) return s.SHORT_METRIC_TYPES[3];
                if(metricQuery < 37) return s.SHORT_METRIC_TYPES[4];
                return s.SHORT_METRIC_TYPES[5];    
        }
        if(metricType == 4) return path[1];
        return application;
    }
    
    public String getObjectName(int metricType, String[] path){
        if(metricType == 0) return path[2];
        if(metricType == 1) return path[1];
        if(metricType == 2) return path[path.length-1];
        if(metricType == 3) return path[path.length-1];      
        if(metricType == 4) return path[path.length-1];
        return application;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    
    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMetricGroup() {
        return metricGroup;
    }

    public void setMetricGroup(String metricGroup) {
        this.metricGroup = metricGroup;
    }

    public String getMetricType() {
        return metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public String getMetricTier() {
        return metricTier;
    }

    public void setMetricTier(String metricTier) {
        this.metricTier = metricTier;
    }

    public String getMetricSite() {
        return metricSite;
    }

    public void setMetricSite(String metricSite) {
        this.metricSite = metricSite;
    }

    public String getMetricNode() {
        return metricNode;
    }

    public void setMetricNode(String metricNode) {
        this.metricNode = metricNode;
    }

    public String getMetricFreq() {
        return metricFreq;
    }

    public void setMetricFreq(String metricFreq) {
        this.metricFreq = metricFreq;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append("\ncontroller :: ").append(controller);
        bud.append("\napplication :: ").append(application);
        bud.append("\nfrequency :: ").append(metricFreq);
        if(metricTier != null) bud.append("\nTier :: ").append(metricTier);
        if(metricNode != null) bud.append("\nNode :: ").append(metricNode);
        if(metricSite != null) bud.append("\nSite :: ").append(metricSite);
        bud.append("\nMetricGroup :: ").append(metricGroup);
        bud.append("\nMetricType :: ").append(metricType);
        bud.append("\nMetricName :: ").append(metricName);
        return bud.toString();
    }
    
}
