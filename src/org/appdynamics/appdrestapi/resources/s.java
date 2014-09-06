/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

import java.util.HashMap;

/**
 *
 * @author soloink
 */
public class s {
    public static final String RESTAPI_VERSION="1.0.9";
    public static int debugLevel=0;
    public static int detailLevel=0;
    public static double percentageThreshold=0.25;
    public static final int MAX_TRIES=3;
    
    
    public static final String HTTPS="https://";
    public static final String HTTP="http://";
    public static final String CONTROLLER_APPS="/controller/rest/applications/";
    public static final String CONTROLLER_OBJ="/controller/";
    public static final String COLON=":";
    public static final String P="|";
    public static final String F="/";
    public static final String Q="?";
    public static final String URL_TIERS="/tiers";
    public static final String URL_NODES="/nodes";
    public static final String URL_PROBLEMS="/problems";
    public static final String URL_EVENTS="/events";
    public static final String URL_POLICY_VIOLATIONS="/policy-violations?";
    public static final String URL_HEALTH_RULE_VIOLATIONS="/healthrule-violations?";
    public static final String URL_REQUEST_SNAPSHOTS="/request-snapshots?";
    public static final String URL_BACKENDS="/backends";
    public static final String URL_BACKENDS1="Backends|";
    public static final String URL_METRIC_LIST="/metrics";
    // App Agent Path
    // BDR Big Deal Retail/metric-data?metric-path=Application Infrastructure Performance|1stTier|Agent|App|Availability&time-range-type=BEFORE_NOW&duration-in-mins=15
    // {Application_Name}/metric-data?metric-path=Application Infrastructure Performance|{tier}|Agent|App|Availability&time-rante-type={type}&duration-in-mins={time}
    public static final String URL_METRIC_PATH="/metric-data?metric-path=";
    public static final String APPLICATION_INFRA_PERF="Application Infrastructure Performance|"; //Tier comes afterwards
    public static final String APP_AGENT_AVAIL_1="|Agent|App|Availability";
    public static final String MACHINE_AGENT_AVAIL_2="|Agent|Machine|Availability";
    public static final String HARDWARE_RESOURCES="|Hardware Resources|";
    public static final String INDIVIDUAL_NODES="|Individual Nodes|";
    public static final String HD_CPU="CPU|";
    public static final String HD_CPU_BUSY="%Busy";
    public static final String HD_CPU_IDLE="%Idle";
    public static final String HD_CPU_STOLEN="%Stolen";
    public static final String HD_DISKS="Disks|";
    public static final String HD_DISKS_KB_READ_PER_SEC="KB read/sec";
    public static final String HD_DISKS_KB_WRITE_PER_SEC="KB written/sec";
    public static final String HD_DISKS_READ_PER_SEC="Reads/sec";
    public static final String HD_DISKS_WRITES_PER_SEC="Writes/sec";
    public static final String HD_JVM_MEMORY="Memory|";
    public static final String HD_MEMORY_FREE_PERC="Free %";
    public static final String HD_MEMORY_FREE_MB="Free (MB)";
    public static final String HD_MEMORY_TOTAL_MB="Total (MB)";
    public static final String HD_MEMORY_USED_PERC="Used %";
    public static final String HD_MEMORY_USED_MB="Used (MB)";
    public static final String HD_NETWORK="Network|";
    public static final String HD_NETWORK_INCOMING_KB="Incoming KB";
    public static final String HD_NETWORK_INCOMING_KB_PER_SEC="Incoming KB/sec";
    public static final String HD_NETWORK_INCOMING_PACKETS="Incoming packets";
    public static final String HD_NETWORK_INCOMING_PACKETS_PER_SEC="Incoming packets/sec";
    public static final String HD_NETWORK_OUTGOING_KB="Outgoing KB";
    public static final String HD_NETWORK_OUTGOING_KB_PER_SEC="Outgoing KB/sec";
    public static final String HD_NETWORK_OUTGOING_PACKETS="Outgoing packets";
    public static final String HD_NETWORK_OUTGOING_PACKETS_PER_SEC="Outgoing packets/sec";
   
    public static final String JVM="|JVM|";
    public static final String JVM_PROCESS_CPU_BURNT_MS_PER_MIN="Process CPU Burnt (ms/min)";
    public static final String JVM_PROCESS_CPU_USAGE_PERC="Process CPU Usage %";
    public static final String JVM_GARBAGE_COLLECTION="Garbage Collection|";
    public static final String JVM_GARBAGE_COLLECTION_GC_TIME_SPENT_PER_MIN_MS="GC Time Spent Per Min (ms)";
    public static final String JVM_GARBAGE_COLLECTION_MAJOR_COLLECTION_TIME_SPENT_PER_MIN_MS="Major Collection Time Spent Per Min (ms)";
    public static final String JVM_GARBAGE_COLLECTION_MINOR_COLLECTION_TIME_SPENT_PER_MIN_MS="Minor Collection Time Spent Per Min (ms)";
    public static final String JVM_GARBAGE_COLLECTION_NUMBER_OF_MAJOR_COLLECTION_PER_MIN="Number of Major Collections Per Min";
    public static final String JVM_GARBAGE_COLLECTION_NUMBER_OF_MINOR_COLLECTIONS_PER_MIN="Number of Minor Collections Per Min";
    public static final String JVM_MEMORY_HEAP="Heap|";
    public static final String JVM_MEMORY_NON_HEAP="Non-Heap|";
    public static final String JVM_MEMORY_HEAP_COMMITED_MB="Committed (MB)";
    public static final String JVM_MEMORY_HEAP_CURRENT_USAGE_MB="Current Usage (MB)";
    public static final String JVM_MEMORY_HEAP_MAX_AVAILABLE_MB="Max Available (MB)";
    public static final String JVM_MEMORY_HEAP_USED_PERC="Used %";
    public static final String JVM_THREADS_CURRENT_NO_OF_THREADS="Threads|Current No. of Threads";
    
    public static final String LAST_15_MINUTES="&time-range-type=BEFORE_NOW&duration-in-mins=15";
    public static final String TIME_BETWEEN="&time-range-type=BETWEEN_TIMES";
    public static final String TIME_BETWEEN1="?time-range-type=BETWEEN_TIMES";
    public static final String TIME_START_TIME="&start-time=";
    public static final String TIME_END_TIME="&end-time=";
    public static final String NO_ROLL_UP="&rollup=false";
    public static final String XML_OUTPUT="&output=XML'";
    
    public static final String EVENT_TYPES="&event-types=";
    public static final String SEVERITIES="&severities=";
    
    public static final String ID="id";
    public static final String NAME="name";
    public static final String DESCRIPTION="description";
    public static final String APPLICATIONS="applications";
    public static final String APPLICATION="application";
    public static final String METRIC_DATAS="metric-datas";
    public static final String METRIC_DATA="metric-data";
    public static final String METRIC_PATH="metricPath";
    public static final String FREQUENCY="frequency";
    public static final String METRIC_ITEM="metric-item";
    public static final String METRIC_ITEMS="metric-items";
    public static final String URL_METRIC_PATH_LIST="?metric-path=";
    
    
    public static final String METRIC_VALUES="metricValues";
    public static final String METRIC_VALUE="metric-value";
    public static final String START_TIME_IN_MILLIS="startTimeInMillis";
    public static final String VALUE="value";
    public static final String MIN="min";
    public static final String MAX="max";
    public static final String CURRENT="current";
    public static final String SUM="sum";
    public static final String COUNT="count";
    public static final String STD_DEVIATION="standardDeviation";
    public static final String OCCURRENCES="occurrences";
    public static final String USERANGE="useRange";
    
    public static final String TIERS="tiers";
    public static final String TIER="tier";
    public static final String NUMBER_OF_NODES="numberOfNodes";
    public static final String AGENT_TYPE="agentType";
    public static final String TYPE="type";
    
    public static final String NODE="node";
    public static final String NODES="nodes";
    public static final String IPADDRESS="ipAddress";
    public static final String IPADDRESSES="ipAddresses";
    public static final String TIER_NAME="tierName";
    public static final String TIER_ID="tierId";
    public static final String MACHINE_ID="machineId";
    public static final String MACHINE_NAME="machineName";
    public static final String MACHINE_OS_TYPE="machineOSType";
    public static final String MACHINE_AGENT_PRESENT="machineAgentPresent";
    public static final String MACHINE_AGENT_VERSION="machineAgentVersion";
    public static final String APP_AGENT_PRESENT="appAgentPresent";
    public static final String APP_AGENT_VERSION="appAgentVersion";
    
    public static final String BUSINESS_TRANSACTIONS="business-transactions";
    public static final String BUSINESS_TRANSACTION="business-transaction";
    public static final String ENTRY_POINT_TYPE="entryPointType";
    public static final String INTERNAL_NAME="internalName";
    public static final String BACKGROUND="background";
    
    public static final String APPLICATION_EX_ID="ConfigObjectImportExportServlet?applicationId=";
    
    public static final String AGENT_TYPE_CHK_PHP="PHP";
    public static final String AGENT_TYPE_CHK_IIS="IIS";
    public static final String AGENT_TYPE_CHK_NODEJS="nodejs";
    
    public static final String AGENT_NAME_JAVA="Java Agent";
    public static final String AGENT_NAME_PHP="PHP Agent";
    public static final String AGENT_NAME_NODEJS="NodeJS Agent";
    public static final String AGENT_NAME_DOTNET="DotNet Agent";
    public static final String AGENT_NAME_MACHINE_AGENT="Machine Agent";
    
    /*
     *  Overall performance
    */
    public static final String OVERALL_APPLICATION_PERF="Overall Application Performance|"; //Tier comes afterwards
    public static final String AVERAGE_RESPONSE_TIME_MS="|Average Response Time (ms)";
    public static final String CALLS_PER_MINUTE="|Calls per Minute";
    public static final String ERROR_PAGE_REDIRECTS_PER_MINUTE="|Error Page Redirects per Minute";
    public static final String ERRORS_PER_MINUTE="|Errors per Minute";
    public static final String EXCEPTIONS_PER_MINUTE="|Exceptions per Minute";
    public static final String HTTP_ERROR_CODES_PER_MINUTE="|HTTP Error Codes per Minute";
    public static final String INFRASTRUCTURE_ERRORS_PER_MINUTE="|Infrastructure Errors per Minute";
    public static final String NUMBER_OF_SLOW_CALLS="|Number of Slow Calls";
    public static final String NUMBER_OF_VERY_SLOW_CALLS="|Number of Very Slow Calls";
    public static final String STALL_COUNT="|Stall Count";
    
    /*
     *  BT Performance
     */
    public static final String URL_BUSINESS_TRANSACTION_PERFORMANCE="Business Transaction Performance|";
    public static final String URL_BUSINESS_TRANSACTIONS="Business Transactions|";
    public static final String AVERAGE_BLOCK_TIME_MS="Average Block Time (ms)";
    public static final String AVERAGE_CPU_USED_MS="Average CPU Used (ms)";
    public static final String AVERAGE_REQUEST_SIZE="Average Request Size";
    public static final String AVERAGE_RESPONSE_TIME="Average Response Time (ms)";
    public static final String AVERAGE_WAIT_TIME_MS="Average Wait Time (ms)";
    public static final String CALL_PER_MINUTE="Calls per Minute";
    //public static final String ERRORS_PER_MINUTE="Errors per Minute";
    public static final String NORMAL_AVERAGE_RESPONSE_TIME_MS="Normal Average Response Time (ms)";
    //public static final String NUMBER_OF_SLOW_CALLS="";
    //public static final String NUMBER_OF_VERY_SLOW_CALLS="";
    //public static final String STALL_COUNT="Stall Count";
    

    
    public static final String EUM_USER_EXPERIENCE="End User Experience|";
    public static final String EUM_AJAX_Requests="AJAX Requests|";

    
    public static final String EUM_APPLICATION_SERVER_TIME_MS="|Application Server Time (ms)";
    public static final String EUM_APPLICATION_SERVER_CALLS_PER_MINUTE="|Application Server Calls per Minute";
    public static final String EUM_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS="|End User Response Time 50th percentile (ms)";
    public static final String EUM_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS="|End User Response Time 90th percentile (ms)";
    public static final String EUM_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS="|End User Response Time 95th percentile (ms)";
    public static final String EUM_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS="|End User Response Time 99th percentile (ms)";
    public static final String EUM_FIRST_BYTE_TIME_50TH_PERCENTILE_MS="|First Byte Time 50th percentile (ms)";
    public static final String EUM_FIRST_BYTE_TIME_90TH_PERCENTILE_MS="|First Byte Time 90th percentile (ms)";
    public static final String EUM_FIRST_BYTE_TIME_95TH_PERCENTILE_MS="|First Byte Time 95th percentile (ms)";
    public static final String EUM_FIRST_BYTE_TIME_99TH_PERCENTILE_MS="|First Byte Time 99th percentile (ms)";
    
    public static final String EUM_REQUESTS_PER_MIN="|Requests per Minute";
    public static final String EUM_AJAX_REQUEST_ERRORS_PER_MINUTE="|AJAX Request Errors per Minute";
    public static final String EUM_DOCUMENT_DOWNLOAD_TIME_MS="|Document Download Time (ms)";
    public static final String EUM_DOCUMENT_PROCESSING_TIME_MS="|Document Processing Time (ms)";
    public static final String EUM_END_USER_RESPONSE_TIME="|End User Response Time (ms)";
    public static final String EUM_FIRST_BYTE_TIME_MS="|First Byte Time (ms)";
    

    public static final String EUM_TCP_CONNECT_TIME_MS="|TCP Connect Time (ms)";
    public static final String EUM_DOM_READY_TIME_MS="|DOM Ready Time (ms)";
    public static final String EUM_DOM_READY_TIME_50TH_PERCENTILE_MS="|DOM Ready Time 50th percentile (ms)";
    public static final String EUM_DOM_READY_TIME_90TH_PERCENTILE_MS="|DOM Ready Time 90th percentile (ms)";
    public static final String EUM_DOM_READY_TIME_95TH_PERCENTILE_MS="|DOM Ready Time 95th percentile (ms)";
    public static final String EUM_DOM_READY_TIME_99TH_PERCENTILE_MS="|DOM Ready Time 99th percentile (ms)";
    public static final String EUM_DOMAIN_LOOKUP_TIME="|Domain Lookup Time (ms)";
    public static final String EUM_SSL_HANDSHAKE_TIME_MS="|SSL Handshake Time (ms)";
    public static final String EUM_BASE_PAGES="Base Pages|";
    public static final String EUM_DOCUEMENT_READY_TIME_MS="|Document Ready Time (ms)";
    public static final String EUM_FRONT_END_TIME_MS="|Front End Time (ms)";
    public static final String EUM_PAGE_RENDER_TIME_MS="|Page Render Time (ms)";
    public static final String EUM_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE="|Page views with JavaScript Errors per Minute";
    public static final String EUM_RESPONSE_AVAILABLE_TIME_MS="|Response Available Time (ms)";
    public static final String EUM_SERVER_CONNECTION_TIME_MS="|Server Connection Time (ms)";
    public static final String EUM_SYNTHETIC_REQUESTS_PER_MINUTE="|Synthetic Requests per Minute";
    
    
    public static final String DOT_NET_PROPERTY="dotnetProperty";
    public static final String UNRESOLVED_CALL_IN_CALL_CHAIN="unresolvedCallInCallChain";
    public static final String TRANSACTION_EVENTS="transactionEvents";
    public static final String TRANSACTION_PROPERTIES="transactionProperties";
    public static final String LOG_MESSAGES="logMessages";
    public static final String RESPONSE_HEADERS="responseHeaders";
    public static final String SESSION_KEYS="sessionKeys";
    public static final String SERVER_START_TIME="serverStartTime";
    public static final String HTTP_HEADERS="httpHeaders";
    public static final String COOKIES="cookies";
    public static final String BUSINESS_DATA="businessData";
    public static final String HTTP_PARAMETERS="httpParameters";
    public static final String ERROR_DETAILS="errorDetails";
    public static final String ERROR_IDS="errorIDs";
    public static final String URL="URL";
    public static final String EXIT_CALLS_DATA_TRUNCATED="exitCallsDataTruncated";
    public static final String DELAY_DEEP_DIVE_OFFSET="delayedDeepDiveOffSet";
    public static final String DELAY_DEEP_DIVE="delayedDeepDive";
    public static final String DEEP_DIVE_POLICY="deepDivePolicy";
    public static final String DIAGNOSTIC_SESSION_GUID="diagnosticSessionGUID";
    public static final String ERROR_SUMMARY="errorSummary";
    public static final String SUMMARY="summary";
    public static final String CRITICAL_THRESHOLD="criticalThreshold";
    public static final String WARNING_THRESHOLD="warningThreshold";
    public static final String CPU_TIME_TAKEN_IN_MILLISSECS="cpuTimeTakenInMilliSecs";
    public static final String TIME_TAKEN_IN_MILLISECS="timeTakenInMilliSecs";
    public static final String USER_EXPERIENCE="userExperience";
    public static final String HAS_DEEP_DIVE_DATA="hasDeepDiveData";
    public static final String ERROR_OCCURRED="errorOccured";
    public static final String LOCAL_ID="localID";
    public static final String CALL_CHAIN="callChain";
    public static final String FIRST_IN_CHAIN="firstInChain";
    public static final String LOCAL_START_TIME="localStartTime";
    public static final String THREAD_NAME="threadName";
    public static final String THREAD_ID="threadID";
    public static final String ASYNC="async";
    public static final String APPLICATION_COMPONENT_NODE_ID="applicationComponentNodeId";
    public static final String APPLICATION_COMPONENT_ID="applicationComponentId";
    public static final String APPLICATION_ID="applicationId";
    public static final String BUSINESS_TRANSACTION_ID="businessTransactionId";
    public static final String REQUEST_GUID="requestGUID";
    public static final String ARCHIVED="archived";
    public static final String REQUEST_SEGMENT_DATA="request-segment-data";
    public static final String REQUEST_SEGMENT_DATAS="request-segment-datas";
    
    public static final String[] SHORT_METRIC_TYPES={"BT","BE","Agent","HW","JVM","OAP","EUM","CUSTOM"};
    public static final String[] LONG_METRIC_TYPES={"Business Transation","Backend","Agent","Hardware","JVM","Overall Application Performance","End User Management","Custom Metric"};
    
    
    
    /* * SNAPSHOTS * 
      
 * <request-segment-datas>
 * <request-segment-data>
        <id>0</id>
        <archived>false</archived>
        <requestGUID>103b98e6-4b33-4a8d-9511-d572e9c828c8</requestGUID>
        <businessTransactionId>7204</businessTransactionId>
        <applicationId>81</applicationId>
        <applicationComponentId>650</applicationComponentId>
        <applicationComponentNodeId>19155</applicationComponentNodeId>
        <async>false</async>
        <threadID>59</threadID>
        <threadName>http-8080-19</threadName>
        <localStartTime>1398266842227</localStartTime>
        <serverStartTime>1398266842227</serverStartTime>
        <firstInChain>true</firstInChain>
        <callChain>Component:650</callChain>
        <localID>0</localID>
        <errorOccured>false</errorOccured>
        <hasDeepDiveData>true</hasDeepDiveData>
        <userExperience>VERY_SLOW</userExperience>
</request-segment-data>
 * 
     */
    
    
    /*

  <appAgentPresent>true</appAgentPresent>
  <appAgentVersion>Server Agent v3.7.11.0 GA #2013-09-27_11-05-45 re280bc92c2f193d92459c97836bba1297e1057cb 7</appAgentVersion>
     */
    
    public static final boolean QUERY_DEBUG=true;
    public static final boolean UI_DEBUG=false;
    
    public static final HashMap<String,String> TIMERANGE=new HashMap<String,String>();
    static{
        TIMERANGE.put("BEFORE_NODE", "1");
        TIMERANGE.put("BEFORE_TIME","2");
        TIMERANGE.put("AFTER_TIME","3");
        TIMERANGE.put("BETWEEN_TIMES","4");
    }
    
    public static long _20HOURSINMILLIS= 1000*60*20;
}
