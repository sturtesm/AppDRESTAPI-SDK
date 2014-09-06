/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import org.appdynamics.appdrestapi.resources.QueryEncoder;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author soloink
 * 
 * This is going to provide all of the queries for hardware metrics
 * 
 * 
 */
public class HardwareResourcesMetricQuery {
    
    // CPU Busy for the Tier
    public static String queryHDTierCPUBusy(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_BUSY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeCPUBusy(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_BUSY);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierCPUIdle(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_IDLE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeCPUIdle(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_IDLE);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierCPUStolen(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_STOLEN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeCPUStolen(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_CPU).append(s.HD_CPU_STOLEN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* ***************** Disk ************************** */
    public static String queryHDTierDisksKBReadPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_KB_READ_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeDisksKBReadPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_KB_READ_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierDisksKBWrittenPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_KB_WRITE_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeDisksKBWrittenPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_KB_WRITE_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierDisksReadPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_READ_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeDisksReadPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_READ_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierDisksWritesPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_WRITES_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeDisksWritesPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_DISKS).append(s.HD_DISKS_WRITES_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* ***************** Memory ************************ */
    public static String queryHDTierMemoryFreePerc(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_FREE_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeMemoryFreePerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_FREE_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierMemoryFreeMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_FREE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeMemoryFreeMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_FREE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierMemoryTotalMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_TOTAL_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeMemoryTotalMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_TOTAL_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierMemoryUsedPerc(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeMemoryUsedPerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierMemoryUsedMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_USED_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeMemoryUsedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_JVM_MEMORY).append(s.HD_MEMORY_USED_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    
    
    /* ***************** Network *********************** */
    public static String queryHDTierNetworkIncomingKB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_KB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkIncomingKB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_KB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierNetworkIncomingKBPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_KB_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkIncomingKBPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_KB_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierNetworkIncomingPackets(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_PACKETS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkIncomingPackets(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_PACKETS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierNetworkIncomingPacketsPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_PACKETS_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkIncomingPacketsPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_INCOMING_PACKETS_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierNetworkOutgoingKB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_KB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkOutgoingKB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_KB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierNetworkOutgoingKBPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_KB_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkOutgoingKBPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_KB_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierNetworkOutgoingPackets(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_PACKETS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkOutgoingPackets(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_PACKETS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDTierNetworkOutgoingPacketsPerSec(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_PACKETS_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryHDNodeNetworkOutgoingPacketsPerSec(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.HARDWARE_RESOURCES);
        bud.append(s.HD_NETWORK).append(s.HD_NETWORK_OUTGOING_PACKETS_PER_SEC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
            
}
