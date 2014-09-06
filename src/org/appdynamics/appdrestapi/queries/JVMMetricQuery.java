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
 */
public class JVMMetricQuery {
    public static String queryJVMTierProcessCPUBurntMSPerMin(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_PROCESS_CPU_BURNT_MS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeProcessCPUBurntMSPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_PROCESS_CPU_BURNT_MS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierProcessCPUUsagePerc(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_PROCESS_CPU_USAGE_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeProcessCPUUsagePerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_PROCESS_CPU_USAGE_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /***/
    public static String queryJVMTierGarbageCollectionGCTimeSpentPerMin(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_GC_TIME_SPENT_PER_MIN_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeGarbageCollectionGCTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_GC_TIME_SPENT_PER_MIN_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_MAJOR_COLLECTION_TIME_SPENT_PER_MIN_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_MAJOR_COLLECTION_TIME_SPENT_PER_MIN_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
      
    public static String queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_MINOR_COLLECTION_TIME_SPENT_PER_MIN_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_MINOR_COLLECTION_TIME_SPENT_PER_MIN_MS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_NUMBER_OF_MAJOR_COLLECTION_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_NUMBER_OF_MAJOR_COLLECTION_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_NUMBER_OF_MINOR_COLLECTIONS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_GARBAGE_COLLECTION).append(s.JVM_GARBAGE_COLLECTION_NUMBER_OF_MINOR_COLLECTIONS_PER_MIN);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* *************************** Memory ****************************** */
    public static String queryJVMTierMemoryHeapCommittedMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryHeapCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierMemoryHeapCurrentUsageMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryHeapCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierMemoryHeapMaxAvailableMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryHeapMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierMemoryHeapUsedPerc(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryHeapUsedPerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_HEAP).append(s.JVM_MEMORY_HEAP_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    /* **** Non-Heap ***** */
    public static String queryJVMTierMemoryNonHeapCommittedMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryNonHeapCommittedMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_COMMITED_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierMemoryNonHeapCurrentUsageMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryNonHeapCurrentUsageMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_CURRENT_USAGE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierMemoryNonHeapMaxAvailableMB(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryNonHeapMaxAvailableMB(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_MAX_AVAILABLE_MB);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierMemoryNonHeapUsedPerc(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeMemoryNonHeapUsedPerc(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.HD_JVM_MEMORY).append(s.JVM_MEMORY_NON_HEAP).append(s.JVM_MEMORY_HEAP_USED_PERC);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMTierThreadsCurrentNoOfThreads(String baseURL, String application,String tier, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier).append(s.JVM);
        bud.append(s.JVM_THREADS_CURRENT_NO_OF_THREADS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
    
    public static String queryJVMNodeCurrentNoOfThreads(String baseURL, String application,String tier, String node, long start, long end, boolean rollup){
        StringBuilder val=new StringBuilder();
        val.append(baseURL).append(s.CONTROLLER_APPS);
        val.append(QueryEncoder.encode(application));
        val.append(s.URL_METRIC_PATH);
        
        // This has to be encoded otherwise the query will fail.
        StringBuilder bud = new StringBuilder();
        bud.append(s.APPLICATION_INFRA_PERF);
        bud.append(tier);
        bud.append(s.INDIVIDUAL_NODES).append(node).append(s.JVM);
        bud.append(s.JVM_THREADS_CURRENT_NO_OF_THREADS);
        val.append(QueryEncoder.encode(bud.toString()));  
        
        //val.append(s.LAST_15_MINUTES);
        val.append(s.TIME_BETWEEN).append(s.TIME_START_TIME).append(start);
        val.append(s.TIME_END_TIME).append(end);
        if(!rollup) val.append(s.NO_ROLL_UP);;
        
        
        return val.toString();
    }
}
