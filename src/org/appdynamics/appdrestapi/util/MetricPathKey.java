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
 *  - objectGroup
 *  - objectType
 *  - objectName
 */
public class MetricPathKey {
    private String controller;
    private String application;
    private String objectGroup; //tierName/appname
    private String objectType; // Tier/BT/BE/
    private String objectName; //Node/BT-name/BE/
    
    public MetricPathKey(String controller, String application){this.controller=controller;this.application=application;}
    
    public String[] shortMetricKey(int metricType, int metricQuery, String path){
        String[] pPath = MetricNameUtil.parse(path);
        objectGroup=getObjectGroup(metricType,pPath);
        objectType=getObjectType(metricType,metricQuery,true);
        objectName=getObjectName(metricType,pPath);
        
        return new String[]{controller,application,objectGroup,objectType,objectName};
        
    }
    
    public String getObjectType(int metricType, int metricQuery, boolean shortVal){
        
        if(shortVal){
            if(metricType == 0) return s.SHORT_METRIC_TYPES[0];
            if(metricType == 1) return s.SHORT_METRIC_TYPES[1];
            if(metricType < 4){
                if(metricQuery < 2) return s.SHORT_METRIC_TYPES[2];
                if(metricQuery < 22) return s.SHORT_METRIC_TYPES[3];
                if(metricQuery < 37) return s.SHORT_METRIC_TYPES[4];
                return s.SHORT_METRIC_TYPES[5];
            }
        }else{
            if(metricType == 0) return s.LONG_METRIC_TYPES[0];
            if(metricType == 1) return s.LONG_METRIC_TYPES[1];
            if(metricType < 4){
                if(metricQuery < 2) return s.LONG_METRIC_TYPES[2];
                if(metricQuery < 22) return s.LONG_METRIC_TYPES[3];
                if(metricQuery < 37) return s.LONG_METRIC_TYPES[4];
                return s.LONG_METRIC_TYPES[5];
            }
        }
        return "Type";
    }
    
    public String getObjectGroup(int metricType, String[] path){
        if(metricType == 0) return path[2];
        if(metricType == 1) return path[1];
        if(metricType < 4) return path[1];
        return application;
    }
    
    public String getObjectName(int metricType, String[] path){
        if(metricType == 0) return path[3];
        if(metricType == 1) return path[1];
        if(metricType == 4) return path[1];
        if(metricType == 3) return path[3];
        return application;
    }
    
    
    
}
