/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

import java.util.Calendar;
import org.appdynamics.appdrestapi.data.RESTBaseURL;

/**
 *
 * @author soloink
 */
public class MeticQueryStringTester {
    
    public static void main(String[] args){
        
        //String controller="appdyn02";
        String controller="familysearch.saas.appdynamics.com";
        //String port="8090";
        String port="443";
        String tier="activemq-instance-mytrees";
        String node="hixj-activemq-instance-mytrees";
        String app="FamilySearch-production";

        RESTBaseURL baseURL=new RESTBaseURL(controller, port, true);
        MetricQuery mq = new MetricQuery( baseURL.getControllerURL(),app);
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.MINUTE, -10);
        long start=cal2.getTimeInMillis();
        long end = cal1.getTimeInMillis();
        
        System.out.println("Hardware Cpu Queries ");
        /*
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierCPUStolen(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeCPUStolen(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierDisksKBReadPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeDisksKBReadPerSec(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierDisksKBWrittenPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeDiskKBWrittenPerSec(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierDisksReadPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeDisksReadPerSec(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierDisksWritesPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeDisksWritesPerSec(tier, node, start, end) + "'\n");
        
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierMemoryFreePerc(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeMemoryFreePerc(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierMemoryFreeMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeMemoryFreeMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierMemoryTotalMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeMemoryTotalMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierMemoryUsedPerc(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeMemoryUsedPerc(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierMemoryUsedMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeMemoryUsedMB(tier, node, start, end) + "'\n");
        
        
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkIncomingKB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkIncomingKB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkIncomingKBPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkIncomingKBPerSec(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkIncomingPackets(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkIncomingPackets(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkIncomingPacketsPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkIncomingPacketsPerSec(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkOutgoingKB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkOutgoingKB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkOutgoingKBPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkOutgoingKBPerSec(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkOutgoingPackets(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkOutgoingPackets(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDTierNetworkOutgoingPacketsPerSec(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryHDNodeNetworkOutgoingPacketsPerSec(tier, node, start, end) + "'\n");
        
        
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierProcessCPUBurntMSPerMin(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeProcessCPUBurntMSPerMin(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierProcessCPUUsagePerc(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeProcessCPUUsagePerc(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierGarbageCollectionGCTimeSpentPerMin(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(tier, node, start, end) + "'\n");
        
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryHeapCommittedMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryHeapCommittedMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryHeapCurrentUsageMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryHeapCurrentUsageMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryHeapMaxAvailableMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryHeapMaxAvailableMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryHeapUsedPerc(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryHeapUsedPerc(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryNonHeapCommittedMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryNonHeapCommittedMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryNonHeapCurrentUsageMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryNonHeapCurrentUsageMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryNonHeapMaxAvailableMB(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryNonHeapMaxAvailableMB(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierMemoryNonHeapUsedPerc(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeMemoryNonHeapUsedPerc(tier, node, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMTierThreadsCurrentNoOfThreads(tier, start, end) + "'\n");
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryJVMNodeThreadsCurrentNoOfThreads(tier, node, start, end) + "'\n");
        */
        System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierStallCount(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierNumberOfVerySlowCalls(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierNumberOfSlowCalls(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierInfrastructureErrorsPerMinute(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierHttpErrorCodesPerMinute(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierExceptionsPerMinute(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierErrorsPerMinute(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierErrorPageRedirectsPerMinute(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierCallsPerMinute(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPTierAvgResponseTimeMS(tier, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeStallCount(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeNumberOfVerySlowCalls(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeNumberOfSlowCalls(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeInfrastructureErrorsPerMinute(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeHttpErrorCodesPerMinute(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeExceptionsPerMinute(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeErrorsPerMinute(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeErrorPageRedirectsPerMinute(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeCallsPerMinute(tier,node, start, end, false) + "'\n");
	System.out.println("curl -k -u tam@familysearch:FFival1to2 '" + mq.queryOAPNodeAvgResponseTimeMS(tier,node, start, end, false) + "'\n");
    }
    
}
