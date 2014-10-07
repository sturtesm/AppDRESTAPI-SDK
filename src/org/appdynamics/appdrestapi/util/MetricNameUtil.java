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
 * The key for this function is to find the name of the metric and be able to 
 * return the proper name, title or identification for the 
 * 
 
 getRESTBackendMetricQuery(0, app, backendS, start, end, true)
MetricPath :: Backends|alerts|Average Response Time (ms)

getRESTBTMetricQuery(0, app, "alerts", btName, start, end, true)
MetricPath :: Business Transaction Performance|Business Transactions|alerts|/alert|Average Block Time (ms)

access.getRESTMetricQuery(i, app, tier, start, end, true)
Index 0         Application Infrastructure Performance|tomcat-links|Agent|App|Availability
Index 1         Application Infrastructure Performance|tomcat-links|Agent|Machine|Availability
Index 2         Application Infrastructure Performance|tomcat-links|Hardware Resources|CPU|%Busy
Index 3         Application Infrastructure Performance|tomcat-links|Hardware Resources|CPU|%Idle
Index 4         Application Infrastructure Performance|tomcat-links|Hardware Resources|CPU|%Stolen
Index 5         Application Infrastructure Performance|tomcat-links|Hardware Resources|Disks|KB read/sec
Index 6         Application Infrastructure Performance|tomcat-links|Hardware Resources|Disks|KB written/sec
Index 7         Application Infrastructure Performance|tomcat-links|Hardware Resources|Disks|Reads/sec
Index 8         Application Infrastructure Performance|tomcat-links|Hardware Resources|Disks|Writes/sec
Index 9         Application Infrastructure Performance|tomcat-links|Hardware Resources|Memory|Free %
Index 10	Application Infrastructure Performance|tomcat-links|Hardware Resources|Memory|Free (MB)
Index 11	Application Infrastructure Performance|tomcat-links|Hardware Resources|Memory|Total (MB)
Index 12	Application Infrastructure Performance|tomcat-links|Hardware Resources|Memory|Used %
Index 13	Application Infrastructure Performance|tomcat-links|Hardware Resources|Memory|Used (MB)
Index 14	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Incoming KB
Index 15	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Incoming KB/sec
Index 16	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Incoming packets
Index 17	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Incoming packets/sec
Index 18	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Outgoing KB
Index 19	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Outgoing KB/sec
Index 20	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Outgoing packets
Index 21	Application Infrastructure Performance|tomcat-links|Hardware Resources|Network|Outgoing packets/sec
Index 22	Application Infrastructure Performance|tomcat-links|JVM|Process CPU Burnt (ms/min)
Index 23	Application Infrastructure Performance|tomcat-links|JVM|Process CPU Usage %
Index 24	Application Infrastructure Performance|tomcat-links|JVM|Garbage Collection|GC Time Spent Per Min (ms)
Index 25	Application Infrastructure Performance|tomcat-links|JVM|Garbage Collection|Major Collection Time Spent Per Min (ms)
Index 26	Application Infrastructure Performance|tomcat-links|JVM|Garbage Collection|Minor Collection Time Spent Per Min (ms)
Index 27	Application Infrastructure Performance|tomcat-links|JVM|Garbage Collection|Number of Major Collections Per Min
Index 28	Application Infrastructure Performance|tomcat-links|JVM|Garbage Collection|Number of Minor Collections Per Min
Index 29	Application Infrastructure Performance|tomcat-links|JVM|Memory|Heap|Committed (MB)
Index 30	Application Infrastructure Performance|tomcat-links|JVM|Memory|Heap|Current Usage (MB)
Index 31	Application Infrastructure Performance|tomcat-links|JVM|Memory|Heap|Max Available (MB)
Index 32	Application Infrastructure Performance|tomcat-links|JVM|Memory|Heap|Used %
Index 33	Application Infrastructure Performance|tomcat-links|JVM|Memory|Non-Heap|Committed (MB)
Index 34	Application Infrastructure Performance|tomcat-links|JVM|Memory|Non-Heap|Current Usage (MB)
Index 35	Application Infrastructure Performance|tomcat-links|JVM|Memory|Non-Heap|Max Available (MB)
Index 36	Application Infrastructure Performance|tomcat-links|JVM|Memory|Non-Heap|Used %
Index 37	Application Infrastructure Performance|tomcat-links|JVM|Memory|Non-Heap|Current Usage (MB)
Index 38	Overall Application Performance|tomcat-links|Stall Count
Index 39	Overall Application Performance|tomcat-links|Number of Very Slow Calls
Index 40	Overall Application Performance|tomcat-links|Number of Slow Calls
Index 41	Overall Application Performance|tomcat-links|Infrastructure Errors per Minute
Index 42	Overall Application Performance|tomcat-links|HTTP Error Codes per Minute
Index 43	Overall Application Performance|tomcat-links|Exceptions per Minute
Index 44	Overall Application Performance|tomcat-links|Errors per Minute
Index 45	Overall Application Performance|tomcat-links|Error Page Redirects per Minute
Index 46	Overall Application Performance|tomcat-links|Calls per Minute
Index 47	Overall Application Performance|tomcat-links|Average Response Time (ms)


getRESTMetricQuery(i, app, tier,node, start, end, true)
Index 0         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Agent|App|Availability
Index 1         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Agent|Machine|Availability
Index 2         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|CPU|%Busy
Index 3         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|CPU|%Idle
Index 4         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|CPU|%Stolen
Index 5         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Disks|KB read/sec
Index 6         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Disks|KB written/sec
Index 7         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Disks|Reads/sec
Index 8         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Disks|Writes/sec
Index 9         Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Memory|Free %
Index 10	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Memory|Free (MB)
Index 11	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Memory|Total (MB)
Index 12	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Memory|Used %
Index 13	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Memory|Used (MB)
Index 14	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Incoming KB
Index 15	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Incoming KB/sec
Index 16	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Incoming packets
Index 17	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Incoming packets/sec
Index 18	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Outgoing KB
Index 19	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Outgoing KB/sec
Index 20	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Outgoing packets
Index 21	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Hardware Resources|Network|Outgoing packets/sec
Index 22	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Process CPU Burnt (ms/min)
Index 23	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Process CPU Usage %
Index 24	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Garbage Collection|GC Time Spent Per Min (ms)
Index 25	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Garbage Collection|Major Collection Time Spent Per Min (ms)
Index 26	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Garbage Collection|Minor Collection Time Spent Per Min (ms)
Index 27	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Garbage Collection|Number of Major Collections Per Min
Index 28	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Garbage Collection|Number of Minor Collections Per Min
Index 29	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Heap|Committed (MB)
Index 30	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Heap|Current Usage (MB)
Index 31	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Heap|Max Available (MB)
Index 32	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Heap|Used %
Index 33	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Non-Heap|Committed (MB)
Index 34	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Non-Heap|Current Usage (MB)
Index 35	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Non-Heap|Max Available (MB)
Index 36	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Non-Heap|Used %
Index 37	Application Infrastructure Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|JVM|Memory|Non-Heap|Current Usage (MB)
Index 38	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Stall Count
Index 39	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Stall Count
Index 40	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Number of Slow Calls
Index 41	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Infrastructure Errors per Minute
Index 42	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|HTTP Error Codes per Minute
Index 43	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Exceptions per Minute
Index 44	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Errors per Minute
Index 45	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Error Page Redirects per Minute
Index 46	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Calls per Minute
Index 47	Overall Application Performance|tomcat-links|Individual Nodes|10-33-156-29-tomcat-links|Average Response Time (ms)


MetricPath :: Backends|alerts|Average Response Time (ms)

getRESTBTMetricQuery(0, app, "alerts", btName, start, end, true)
MetricPath :: Business Transaction Performance|Business Transactions|alerts|/alert|Average Block Time (ms)
* 
* 
 */
public class MetricNameUtil {
    private static final String INDIV_NODES="Individual Nodes";
 
    
    
    public static String[] parse(String metricPath){
        
        if(metricPath != null){
            return metricPath.split("\\|");
        }
        return null;
    }

    
    /*
     * Metric Type:
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - Custom
     */
    public static String getObjectPlusMetricName(int metricType, int queryIndex, String metricPath){
        String[] nameParts = parse(metricPath);
        if( nameParts == null) return "Default Name";
        
        if(metricType == 0){
            return new StringBuilder().append(nameParts[2]).append(" - ").append(nameParts[3]).append(" ").append(nameParts[4]).toString();
        }
        
        if(metricType == 1){
            return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[2]).toString();
        }
        
        //Tier
        if(metricType == 2){
            if(queryIndex < 38){
                if(queryIndex < 2) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append(" ").append(nameParts[2]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 22) return new StringBuilder().append(nameParts[1]).append(" - ").append("HW - ").append(nameParts[3]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 24) return new StringBuilder().append(nameParts[1]).append(" - ").append("JVM - ").append(nameParts[3]).toString();
                if(queryIndex < 29) return new StringBuilder().append(nameParts[1]).append(" - ").append("JVM - GC - ").append(nameParts[4]).toString();
                return new StringBuilder().append(nameParts[1]).append(" - ").append("JVM - ").append(nameParts[4]).append(" ").append(nameParts[3]).append(" ").append(nameParts[5]).toString();
            }else{
                return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[2]).toString();
            }
            
        }
        
        //Node
        if(metricType == 3){
            if(queryIndex == 0 || queryIndex < 38){
                //5 4 6
                if(queryIndex < 2) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append(" - ").append(nameParts[5]).append(" ").append(nameParts[4]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 22) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("HW - ").append(nameParts[5]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 24) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("JVM - ").append(nameParts[5]).toString();
                if(queryIndex < 29) return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("JVM - GC - ").append(nameParts[6]).toString();
                return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append("JVM - ").append(nameParts[6]).append(" ").append(nameParts[5]).append(" ").append(nameParts[7]).toString();
            }else{
                return new StringBuilder().append(nameParts[1]).append(" - ").append(nameParts[3]).append(" - ").append(nameParts[4]).toString();
            }
            
        }
        return "Default Name";
    }
    
    /*
     * Metric Type:
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - EUM
     *   5 - Custom
     */
    public static String getSimpleShortMetricName(int metricType, int queryIndex, String metricPath){
        String[] nameParts = parse(metricPath);
        if( nameParts == null) return "Default Name";
        
        if(metricType == 0){
            return new StringBuilder().append("BT - ").append(nameParts[4]).toString();
        }
        
        if(metricType == 1){
            return new StringBuilder().append("BE - ").append(nameParts[2]).toString();
        }
        
        //Tier
        if(metricType == 2){
            if(queryIndex < 38){
                if(queryIndex < 2) return new StringBuilder().append(nameParts[3]).append(" ").append(nameParts[2]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 22) return new StringBuilder().append("HW - ").append(nameParts[3]).append(" ").append(nameParts[4]).toString();
                if(queryIndex < 24) return new StringBuilder().append("JVM - ").append(nameParts[3]).toString();
                if(queryIndex < 29) return new StringBuilder().append("JVM - GC - ").append(nameParts[4]).toString();
                return new StringBuilder().append("JVM - ").append(nameParts[4]).append(" ").append(nameParts[3]).append(" ").append(nameParts[5]).toString();
            }else{
                return  new StringBuilder().append("OAP - ").append(nameParts[2]).toString();
            }
            
        }
        
        //Node
        if(metricType == 3){
            if(queryIndex == 0 || queryIndex < 38){
                //5 4 6
                if(queryIndex < 2) return new StringBuilder().append(nameParts[5]).append(" ").append(nameParts[4]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 22) return new StringBuilder().append("HW - ").append(nameParts[5]).append(" ").append(nameParts[6]).toString();
                if(queryIndex < 24) return new StringBuilder().append("JVM - ").append(nameParts[5]).toString();
                if(queryIndex < 29) return new StringBuilder().append("JVM - GC - ").append(nameParts[6]).toString();
                return new StringBuilder().append("JVM - ").append(nameParts[6]).append(" ").append(nameParts[5]).append(" ").append(nameParts[7]).toString();
            }else{
                return new StringBuilder().append("OAP - ").append(nameParts[4]).toString();
            }
            
        }
        return "Default Name";
    }
    
    
        /*
     * Metric Type:
     *   0 - BT
     *   1 - BE
     *   2 - Tier Metric
     *   3 - Node Metric
     *   4 - EUM
     *   5 - Custom
     */
    public static String getObjectType(int metricType, int queryIndex, String[] nameParts){
        
        if( nameParts == null) return "Default Type";
        
        if(metricType == 0){
            return s.SHORT_METRIC_TYPES[0];
        }
        
        if(metricType == 1){
            return s.SHORT_METRIC_TYPES[1];
        }
        
        //Tier
        if(metricType == 2){
            if(queryIndex < 38){
                if(queryIndex < 2) return nameParts[3];
                if(queryIndex < 22) return new StringBuilder().append(s.SHORT_METRIC_TYPES[3]).append(s.D_).append(nameParts[3]).toString();
                if(queryIndex < 24) return s.SHORT_METRIC_TYPES[4];
                if(queryIndex < 29) return new StringBuilder().append(s.SHORT_METRIC_TYPES[4]).append(s.D_).append(nameParts[3]).toString();
                return new StringBuilder().append(s.SHORT_METRIC_TYPES[4]).append(s.D_).append(nameParts[4]).append(s.D_).append(nameParts[3]).toString();
            }else{
                return  new StringBuilder().append(s.SHORT_METRIC_TYPES[5]).append(s.D_).append(nameParts[2]).toString();
            }
            
        }
        
        //Node
        if(metricType == 3){
            if(queryIndex < 38){
                //5 4 6
                if(queryIndex < 2) return nameParts[4];
                if(queryIndex < 22) return new StringBuilder().append(s.SHORT_METRIC_TYPES[3]).append(s.D_).append(nameParts[5]).toString();
                if(queryIndex < 24) return s.SHORT_METRIC_TYPES[4];
                if(queryIndex < 29) return new StringBuilder().append(s.SHORT_METRIC_TYPES[4]).append(s.D_).append(nameParts[5]).toString();
                return new StringBuilder().append(s.SHORT_METRIC_TYPES[4]).append(s.D_).append(nameParts[5]).append(s.D_).append(nameParts[3]).toString();
            }else{
                return new StringBuilder().append(s.SHORT_METRIC_TYPES[5]).append(s.D_).append(nameParts[4]).toString();
            }
            
        }
        
        if(metricType == 4){
            if(queryIndex < 16){return new StringBuilder().append(s.SHORT_METRIC_TYPES[6]).append(s.D_).append(s.SHORT_METRIC_TYPES[8]).toString();} //Ajax
            if(queryIndex < 46){return new StringBuilder().append(s.SHORT_METRIC_TYPES[6]).append(s.D_).append(s.SHORT_METRIC_TYPES[9]).toString();} //BASE
            return new StringBuilder().append(s.SHORT_METRIC_TYPES[6]).append(s.D_).append(s.SHORT_METRIC_TYPES[10]).toString();
        }
        return "Default Type";
    }
    
    public static String getJustMetricName(String metricPath){
        String[] nameParts = parse(metricPath);
        if(nameParts == null)
        return "Default Name";
        
        return nameParts[nameParts.length-1];
    }
    
    public static String getMetricName(String metricPath){
        
        String[] nameParts = parse(metricPath);
        
        if( nameParts == null) return "Default Name";
        
        boolean node=false;
        
        if(metricPath.contains(s.INDIVIDUAL_NODES)) node=true;

        
        // The problem, how can we determine which is the tier name because it will be hidden or will it?
        if(metricPath.startsWith(s.APPLICATION_INFRA_PERF) ){ 
            if(node) return nameParts[3];
            return nameParts[1];
        }
        if(metricPath.startsWith(s.BUSINESS_TRANSACTIONS)) return nameParts[3];
        if(metricPath.startsWith(s.EUM_USER_EXPERIENCE))  return nameParts[2];
        if(metricPath.startsWith(s.OVERALL_APPLICATION_PERF)){ if(nameParts.length == 3 ) return nameParts[1]; return nameParts[0];}
        // Need to add errors and informataion points

        
        return null;
    }
    
}
