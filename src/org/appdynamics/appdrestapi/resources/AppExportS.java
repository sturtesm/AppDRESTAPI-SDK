/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

/**
 *
 * @author gilbert.solorzano
 */
public class AppExportS {
    
    public static final String VE=" = ";
    public static final String VS=" :: ";
    public static final String L1="\n\t";
    public static final String L1_1="\n\t   ";
    public static final String L2="\n\t\t";
    public static final String L2_1="\n\t\t   ";
    public static final String L3="\n\t\t\t";
    public static final String L3_1="\n\t\t\t   ";
    public static final String L4="\n\t\t\t\t";
    public static final String L4_1="\n\t\t\t\t   ";
    public static final String L5="\n\t\t\t\t\t";
    public static final String L5_1="\n\t\t\t\t\t   ";
    public static final String L6="\n\t\t\t\t\t\t";
    public static final String L6_1="\n\t\t\t\t\t\t   ";
    public static final String S4="    ";
    
    
    public static final String APPLICATION="application";
    public static final String CONTROLLER_VERSION="controller-version";
    public static final String NAME="name";
    public static final String DESCRIPTION="description";
    public static final String ENV_PROPERTIES="env-properties";
    
    public static final String CONFIGURATION="configuration";
    public static final String APPLICATION_INSTRUMENTATION_LEVEL="application-instrumentation-level";
    public static final String SNAPSHOT_EVALUATION_INTERVAL="snapshot-evaluation-interval";
    public static final String SNAPSHOT_QUIET_TIME_POST_SLA_FAILURE="snaphost-quiet-time-post-sla-failure";
    public static final String POLICY_ENGINE_ENABLED="policy-engine-enabled";
    public static final String CALL_GRAPH="call-graph";
    public static final String SAMPLING_RATE="sampling-rate";
    public static final String RAW_SQL="raw-sql";
    public static final String EXCLUDE_PACKAGES="exclude-packages";
    public static final String INCLUDE_PACKAGES="include-packages";
    public static final String MIN_DURATION_FOR_DB_CALLS="min-duration-for-db-calls";
    public static final String HOTSPOTS_ENABLED="hotspots-enabled";
    public static final String SLA="sla";
    public static final String ART="art";
    public static final String EPM="epm";
    public static final String ENABLED="enabled";
    public static final String CRITICAL="critical";
    public static final String WARNING="warning";
    public static final String BACKGROUND_BUSINESS_TRANSACTION_CONFIG="background-transaction-config";
    public static final String SNAPSHOT_COLLECTION_POLICY="snapshot-collection-policy";
    public static final String MINUTE_FREQUENCY="minute-frequency";
    public static final String NTH_OCCURANCE="nth-occurance";
    public static final String SLA_VIOLATION="sla-violation";
    public static final String COLLECT_OUTLIERS_ONLY="collect-outliers-only";
    public static final String DURATION="duration";
    public static final String MAX_ATTEMPTS_FOR_OUTLIERS="max-attempts-for-outliers";
    public static final String WARNING_VIOLATION="warning-violation";
    public static final String AUTOMATIC_COLLECTION_ENABLED="automatic-collection-enabled";
    public static final String AUTOMATIC_SLOW_VOLUME_PERCENTAGE_THRESHOLD="automatic-slow-volume-percentage-threshold";
    public static final String AUTOMATIC_ERROR_VOLUME_PERCENTAGE_THRESHOLD="automatic-error-volume-percentage-threshold";
    public static final String BT_REQUEST_THRESHOLD="bt-request-threshold";
    public static final String STARTING_NODE_SLOW_THRESHOLD="starting-node-slow-threshold";
    public static final String EVALUATION_TYPE="evaluation-type";
    public static final String EVALUATION_MINS="evaluation-mins";
    public static final String STANDARD_DEVIATION_THRESHOLD="standard-deviation-threshold";
    public static final String CONTINUING_SEGMENT_SLOW_THRESHOLD="continuing-segment-slow-threshold";
    public static final String EXIT_CALL_SLOW_THRESHOLD="exit-call-slow-threshold";
    public static final String STARTING_NODE_EXTREMELY_SLOW_THRESHOLD="starting-node-extremely-slow-threshold";
    public static final String STALL_CONFIGURATION="stall-configuration";
    public static final String ABSOLUTE="absolute";
    public static final String ABSOLUTE_TIME_IN_SECS="absolute-time-in-secs";
    public static final String BT_SLA_VIOLATION_MULTIPLIER="bt-sla-violation-multiplier";
    public static final String BUSINESS_TRANSACTION_CONFIG="business-transaction-config";
    public static final String ERROR_CONFIGURATION="error-configuration";
    public static final String DETECT_PHP_ERRORS="detect-php-errors";
    public static final String PHP_ERROR_LEVEL="php-error-level";
    public static final String DISABLE_SYSTEM_TRACE="disable-system-trace";
    public static final String DISABLE_EVENT_LOG="disable-event-log";
    public static final String DISABLE_N_LOG="disable-n-log";
    public static final String DISABLE_LOG4NET_LOGGING="disable-log4net-logging";
    public static final String DISABLE_DEFAULT_HTTP_ERROR_CODE="disable_default_http_error_code";
    public static final String IGNORE_EXCEPTIONS="ignore-exceptions";
    public static final String IGNORE_LOGGER_NAME="ignore-logger-names";
    public static final String CAPTURE_LOGGER_ERROR_AND_FATAL_MESSAGE="capture-logger-error-and-fatal-messages";
    public static final String MAX_FRAMES_IN_ROOT_CAUSE="max-frames-in-root-cause";
    public static final String STACK_TRACE_LINE_LIMIT="stack-trace-line-limit";
    public static final String MARK_TRANACTION_AS_ERROR_ON_ERROR_MESSAGE="mark-transaction-as-error-on-error-message-log-tag";
    public static final String ASYNC_ACTIVITY_SUPPORTED="async-activity-supported";
    
    /*
     * <error-configuration agent-type="php-app-agent">
            <detect-php-errors>true</detect-php-errors>
            <php-error-level>ERROR</php-error-level>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions/>
            <ignore-logger-names/>
            <capture-logger-error-and-fatal-messages>false</capture-logger-error-and-fatal-messages>
            <max-frames-in-root-cause>0</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>
     */
    
    
    public static final String EUM_CONFIGURATION="eum-configuration";
    public static final String EXTERNAL_JS_FETCH_RUL="external-js-fetch-url";
    public static final String HEART_BEAT_URL="heart-beat-url";
    public static final String AUTOMATIC="automatic";
    public static final String FRAMEWORKS_TO_ENABLE_ATTRIBUTE_INJECTION="frameworks-to-enable-attribute-injection";
    public static final String MANUAL="manual";
    public static final String EUM_PARSER_RULES="eum-parser-rules";
    public static final String EUM_INJECTION_RULES="eum-injection-rules";
    public static final String EXCLUCE_RULES="exclude-rules";
    public static final String INCLUDE_RULES="include-rules";
    public static final String EUM_CLOUD_APPLICATION_KEY="eum-cloud-application-key";
    public static final String EUM_BEACON_URL="eum-beacon-url";
    public static final String EUM_JS_URL="eum-js-url";
    public static final String EUM_TARGET_TIERS="eum-target-tiers";
    
    
    public static final String DATA_GATHERER_CONFIGS="data-gatherer-configs";
    public static final String HTTP_DATA_GATHERER_CONFIG="http-data-gatherer-config";
    public static final String ATTACH_TO_NEW_BTS="attach-to-new-bts";
    public static final String PARAMETERS="parameters";
    public static final String GATHER_URL="gather-url";
    public static final String GATHER_SESSION_ID="gather-session-id";
    public static final String GATHER_USER_PRINCIPAL="gather-user-principal";
    public static final String SQL_DATA_GATHERER_CONFIG="sql-data-gatherer-config";
    public static final String MATCH_TYPE="match-type";
    public static final String MATCH_PATTERN="match-pattern";
    public static final String INVERSE="inverse";
    
    /* Businnes transaction group */
    public static final String BUSINESS_TRANSACTION_GROUPS="business-transaction-groups";
    /* Need application component */
    public static final String APPLICATION_COMPONENTS="application-components";
    
    /* Need business transaction */
    public static final String BUSINESS_TRANSACTION_COMPONENTS="business-transaction-components";
    
    public static final String ENTRY_MATCH_POINT_CONFIGURATIONS="entry-match-point-configurations";
    public static final String ENTRY_MATCH_POINT_CONFIGURATION="entry-match-point-configuration";
    public static final String TRANSACTION_CONFIGURATIONS="transaction-configurations";
    public static final String TRANSACTION_ENTRY_POINT_TYPE="transaction-entry-point-type";
    public static final String ENABLE="enable";
    public static final String DISCOVERY_CONFIG="discovery-config";
    public static final String DISCOVERY_CONFIG_ENABLED="discovery-config-enabled";
    public static final String DISCOVERY_RESOLUTION="discovery-resolution";
    
    
    
    public static final String BACKEND_MATCH_POINT_CONFIGURATIONS="backend-match-point-configurations";
    public static final String BACKEND_MATCH_POINT_CONFIGURATION="backend-match-point-configuration";
    public static final String CUSTOM_EXIT_POINT_DEFINITION="custom-exit-point-definition";
    public static final String BACKEND_DISCOVERY_CONFIGURATIONS="backend-discovery-configurations";
    public static final String BACKEND_DISCOVERY_CONFIGURATION="backend-discovery-configuration";
    public static final String BACKEND_IDENTITY_OPTIONS="backend-identity-options";
    public static final String BACKEND_IDENTITY_OPTION="backend-identity-option";
    public static final String NAMING_OPTIONS="naming-options";
    public static final String NAME_VALUE="name-value";
    public static final String VALUE="value";
    public static final String DISCOVERY_ENABLED="discovery-enabled";
    public static final String CORRELATION_ENABLED="correlation-enabled";
    public static final String SUPPORTS_CORRELATION="supports-correlation";
    public static final String PRIORITY="priority";
    public static final String EXIT_POINT_TYPE="exit-point-type";//exitPointType
    
    
    public static final String METRIC_BASELINES="metric-baselines";
    public static final String METRIC_BASELINE="metric-baseline";
    public static final String SEASONALITY="seasonality";
    public static final String FIXED="fixed";
    public static final String IS_DEFAULT="is-default";
    public static final String ALL_DATE="all-date";
    public static final String NUMBER_OF_DAYS="number-of-days";
    
    /* Need to create info points  */
    public static final String INFO_POINT_GATHERER_CONFIGS="info-point-gatherer-configs";
    
    /* Need to create tasks */
    public static final String TASKS="tasks";
    
    /* Need to create workflows */
    public static final String WORKFLOWS="workflows";
    
    /* For agent configuration you will different xml structures for properties 
     * depending on the type String, Boolean, Integer...
     */
    public static final String AGENT_CONFIGURATIONS="agent-configurations";
    public static final String AGENT_CONFIGURATION="agent-configuration";
    public static final String OVERRIDE="override";
    public static final String AGENT_TYPE="agent-type";
    public static final String PROPERTY_DEFINITIONS="property-definitions";
    public static final String PROPERTY_DEFINITION="property-definition";
    public static final String TYPE="type";
    public static final String REQUIRED="required";
    public static final String DEFAULT_STRING_VALUE="default-string-value";
    public static final String UPPER_NUMERIC_BOUND="upper-numeric-bound";
    public static final String LOWER_NUMERIC_BOUND="lower-numeric-bound";
    public static final String STRING_MAX_LENGTH="string-max-length";
    public static final String ALLOWED_STRING_VALUES="allowed-string-values";
    public static final String PROPERTIES="properties";
    public static final String PROPERTY="property";
    public static final String STRING_VALUE="string-value";
    public static final String INTEGER_TYPE="INTEGER";
    public static final String STRING_TYPE="STRING";
    public static final String BOOLEAN_TYPE="BOOLEAN";
    
    
    public static final String EUM_CLOUD_CONFIG="eum-cloud-config";
    public static final String APPLICATION_DIAGNOSTIC_DATA="application-diagnostic-data";
    public static final String SUMMARY="summary";
    public static final String DIAGNOSTIC_TYPE="diagnostic-type";
    public static final String KEY="key";
    public static final String EXCLUDE_CONFIG="exclude-config";
    public static final String PAGE_CONFIG="page-config";
    public static final String PAGE_CONFIG_VERSION="page-config-version";
    
    // Policy Violation & Event
    public static final String POLICY_VIOLATIONS="policy-violations";
    public static final String POLICY_VIOLATION="policy-violation";
    public static final String START_TIME_IN_MILLIS="startTimeInMillis";
    public static final String DETECTED_TIME_IN_MILLIS="detectedTimeInMillis";
    public static final String END_TIME_IN_MILLIS="endTimeInMillis";
    public static final String INCIDENT_STATUS="incidentStatus";
    public static final String SEVERITY="severity";
    public static final String TRIGGERED_ENTITY_DEFINITION="triggeredEntityDefinition";
    public static final String AFFECTED_ENTITY_DEFINITION="affectedEntityDefinition";
    public static final String ENTITY_TYPE="entityType";
    public static final String ENTITY_ID="entityId";
    public static final String DEEP_LINK_URL="deepLinkUrl";
    public static final String EVENT="event";
    public static final String EVENTS="events";
    public static final String EVENT_TIME="eventTime";
    public static final String ARCHIVED="archived";
    public static final String MARKED_AS_RESOLVED="markedAsResolved";
    public static final String MARKED_AS_READ="markedAsRead";
    public static final String AFFECTED_ENTITIES="affectedEntities";
    public static final String ENTITY_DEFINITION="entity-definition";
    
    //Backends
    public static final String BACKENDS="backends";
    public static final String BACKEND="backend";
    public static final String APPLICATION_COMPONENT_NODE_ID="applicationComponentNodeId";
    public static final String TIER_ID="tierId";
    public static final String BC_EXIT_POINT_TYPE="exitPointType";
    
    public static final String CUSTOM_EXIT_POINT_DEFINITIONS="custom-exit-point-definitions";
    
    public static final String BT_REQUEST_THRESHOLDS="bt-request-thresholds";
    
    public static final String DYNAMIC_SCALING_ENABLED="dynamic-scaling-enabled";
    /*
     * <error-configuration agent-type="php-app-agent">
            <detect-php-errors>true</detect-php-errors>
            <php-error-level>ERROR</php-error-level>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions/>
            <ignore-logger-names/>
            <capture-logger-error-and-fatal-messages>false</capture-logger-error-and-fatal-messages>
            <max-frames-in-root-cause>0</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>
     */
    

    public static final String DATA_GATHERER_CONFIG="data-gatherer-config";

    public static final String METHOD_INVOCATION_DATA_GATHERER_CONFIG="method-invocation-data-gatherer-config";
    public static final String GATHERER_TYPE="gatherer-type";
    public static final String POSITION="position";
    public static final String TRANSFORMER_TYPE="transformer-type";
    public static final String METHOD_NAME="method-name";
    public static final String METHOD_PARAMETER_TYPES="method-parameter-types";
    public static final String POJO_METHOD_DEFINITION="pojo-method-definition";
    public static final String POJO_DATA_GATHERER_CONFIG="pojo-data-gatherer-config";
    
    
    /* Need application component */
    public static final String APPLICATION_COMPONENT="application-component";
    public static final String NAMING_CONFIG="naming-config";
    public static final String SCHEME="scheme";
    public static final String BUSINESS_TRANSACTIONS="business-transactions";
    public static final String BUSINESS_TRANSACTION="business-transaction";
    public static final String BUSINESS_TRANSACTION_NAME="business-transaction-name";
    public static final String BACKGROUND="background";
    public static final String ENABLED_FOR_EUM="enabled-for-eum";
    public static final String EUM_AUTO_ENABLE_POSSIBLE="eum-auto-enable-possible";
    public static final String MEMORY_CONFIGURATION="memory-configuration";
    public static final String SIZE_POLLING_INTERVAL="size-polling-interval";
    public static final String ENABLE_CACHE_FRAMEWORK_SIZE_MONITORING="enable-cache-framework-size-monitoring";
    public static final String ENABLE_MEMORY_MONITORING="enable-memory-monitoring";
    public static final String CACHE_CONFIGURATION="cache-configuration";
    public static final String DISABLE_CACHE_MONITORING="disable-cache-monitoring";
    public static final String DISABLE_STANDARD_CACHE_FRAMEWORKS="disable-standard-cache-frameworks";
    public static final String COMPONENT_TYPE="component-type";
    public static final String INSTANCE_TRACKER_CONFIGURATIONS="instance-tracker-configurations";
    public static final String CUSTOM_CACHE_CONFIGURATIONS="custom-cache-configurations";
    

    public static final String EXCLUDES="excludes";
    public static final String CLASS_NAME="class-name";
    public static final String FILTER_TYPE="filter-type";
    public static final String FILTER_VALUE="filter-value";
    public static final String DISPLAY_NAME="display-name";
    
    
    public static final String NAME_VALUES="name-values";
    public static final String EXCLUDE="exclude";
    public static final String SERVLET_RULE="servlet-rule";
    

    
    /*
     *  <custom-match-point-definitions>
                <custom-match-point-definition transaction-entry-point-type="POJO">
                    <name>Cron4J</name>
                    <custom-business-transaction-name>Cron4J</custom-business-transaction-name>
                    <background>false</background>
                    <enabled>false</enabled>
                    <match-rule>
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>Cron4J</display-name>
                            <background>true</background>
                            <match-class type="inherits-from-class">
                                <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
                            </match-class>
                            <split-config type="4"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
                        </pojo-rule>
                    </match-rule>
                </custom-match-point-definition>
     */
    public static final String CUSTOM_MATCH_POINT_DEFINITIONS="custom-match-point-definitions";
    public static final String CUSTOM_MATCH_POINT_DEFINITION="custom-match-point-definition";
    public static final String CUSTOM_BUSINESS_TRANSACTION_NAME="custom-business-transaction-name";
    public static final String MATCH_RULE="match-rule";
    public static final String POJO_RULE="pojo-rule";
    public static final String ASP_DOTNET_RULE="asp-dotnet-rule";
    public static final String MATCH_CLASS="match-class";
    public static final String SPLIT_CONFIG="split-config";
    public static final String MATCH_METHOD="match-method";
    public static final String NAMING_ACTIONS="naming-actions";
   
            
}
