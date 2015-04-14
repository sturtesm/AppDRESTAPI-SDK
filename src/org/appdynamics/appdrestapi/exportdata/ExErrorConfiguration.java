/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
 */
/*
 * <error-configuration agent-type="java-app-agent">
            <disable-java-logging>false</disable-java-logging>
            <disable-log4j-logging>false</disable-log4j-logging>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions>java.io.FileNotFound|org.hibernate.Add</ignore-exceptions>
            <ignore-logger-names>Log4Git|ManLog</ignore-logger-names>
            <custom-logger-definition disable="false">
                <name>GLog</name>
                <pojo-method-definition>
                    <class-name>org.solo.logger</class-name>
                    <method-name>logit</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>Integer.class|String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>1</method-param-exception-index>
            </custom-logger-definition>
            <custom-logger-definition disable="false">
                <name>bought</name>
                <pojo-method-definition>
                    <class-name>org.logg.bought</class-name>
                    <method-name>log</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>0</method-param-exception-index>
            </custom-logger-definition>
            <http-error-return-code disable="false">
                <name>Codes that I find </name>
                <lower-bound>503</lower-bound>
                <upper-bound>510</upper-bound>
            </http-error-return-code>
            <http-error-return-code disable="false">
                <name>Nothing to see </name>
                <lower-bound>501</lower-bound>
                <upper-bound>502</upper-bound>
            </http-error-return-code>
            <error-redirect-page disable="false">
                <name>Page1</name>
                <match-type>CONTAINS</match-type>
                <match-pattern>index1</match-pattern>
                <inverse>false</inverse>
            </error-redirect-page>
            <error-redirect-page disable="false">
                <name>Page2</name>
                <match-type>CONTAINS</match-type>
                <match-pattern>index2</match-pattern>
                <inverse>false</inverse>
            </error-redirect-page>
            <ignore-exception-msg-patterns>
                <match-type>EQUALS</match-type>
                <match-pattern>Blah</match-pattern>
                <inverse>false</inverse>
            </ignore-exception-msg-patterns>
            <ignore-exception-msg-patterns>
                <match-type>STARTSWITH</match-type>
                <match-pattern>What</match-pattern>
                <inverse>false</inverse>
            </ignore-exception-msg-patterns>
            <capture-logger-error-and-fatal-messages>true</capture-logger-error-and-fatal-messages>
            <ignore-logger-msg-patterns>
                <match-type>STARTSWITH</match-type>
                <match-pattern>Normal</match-pattern>
                <inverse>false</inverse>
            </ignore-logger-msg-patterns>
            <ignore-logger-msg-patterns>
                <match-type>EQUALS</match-type>
                <match-pattern>ds</match-pattern>
                <inverse>false</inverse>
            </ignore-logger-msg-patterns>
            <max-frames-in-root-cause>0</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>
        <error-configuration agent-type="dotnet-app-agent">
            <disable-system-trace>false</disable-system-trace>
            <disable-event-log>false</disable-event-log>
            <disable-n-log>false</disable-n-log>
            <disable-log4net-logging>false</disable-log4net-logging>
            <disable_default_http_error_code>false</disable_default_http_error_code>
            <ignore-exceptions>org.micro.File|org.micro.Junk</ignore-exceptions>
            <ignore-logger-names>realLogger|notRealLogger</ignore-logger-names>
            <custom-logger-definition disable="false">
                <name>Found It</name>
                <pojo-method-definition>
                    <class-name>com.micro.Save</class-name>
                    <method-name>nothing</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>0</method-param-exception-index>
            </custom-logger-definition>
            <custom-logger-definition disable="false">
                <name>Bought</name>
                <pojo-method-definition>
                    <class-name>org.mcir</class-name>
                    <method-name>not</method-name>
                    <match-type>MATCHES_CLASS</match-type>
                    <method-parameter-types>String.class</method-parameter-types>
                </pojo-method-definition>
                <method-param-exception-index>0</method-param-exception-index>
            </custom-logger-definition>
            <http-error-return-code disable="false">
                <name>Nothing Code</name>
                <lower-bound>503</lower-bound>
                <upper-bound>510</upper-bound>
            </http-error-return-code>
            <http-error-return-code disable="false">
                <name>Excuses</name>
                <lower-bound>501</lower-bound>
                <upper-bound>502</upper-bound>
            </http-error-return-code>
            <error-redirect-page disable="false">
                <name>Page1</name>
                <match-type>CONTAINS</match-type>
                <match-pattern>index1</match-pattern>
                <inverse>false</inverse>
            </error-redirect-page>
            <error-redirect-page disable="false">
                <name>Page2</name>
                <match-type>CONTAINS</match-type>
                <match-pattern>index2</match-pattern>
                <inverse>false</inverse>
            </error-redirect-page>
            <max-frames-in-root-cause>0</max-frames-in-root-cause>
            <stack-trace-line-limit>0</stack-trace-line-limit>
            <mark-transaction-as-error-on-error-message-log-tag>true</mark-transaction-as-error-on-error-message-log-tag>
        </error-configuration>

 * 
 */
@XmlSeeAlso({ExMatchPattern.class,ExCustomLoggerDefinition.class,ExHttpErrorReturnCode.class,ExErrorRedirectPage.class})
public class ExErrorConfiguration {
    private String agentType;
    private boolean detectPhpErrors;
    private String phpErrorLevel;
    
    private boolean disableJavaLogging,disableLog4jLogging;
    private boolean disableLog4netLogging, disableNLog, disableEventLog, disableSystemTrace;
    
    private boolean disableDefaultHttpErrorCode;
    private String ignoreException;
    private ArrayList<ExMatchPattern> ignoreExceptionPattern=new ArrayList<ExMatchPattern>();
    private String ignoreLoggerNames;
    private ArrayList<ExMatchPattern> ignoreLoggerPattern=new ArrayList<ExMatchPattern>();
    private ArrayList<ExCustomLoggerDefinition> customLoggerDefinitions=new ArrayList<ExCustomLoggerDefinition>();
    private boolean captureLoggerErrorAndFatalMessages;
    
    private ArrayList<ExHttpErrorReturnCode> httpErrorReturnCodes=new ArrayList<ExHttpErrorReturnCode>();
    private ArrayList<ExErrorRedirectPage> errorRedirectPage=new ArrayList<ExErrorRedirectPage>();
    
    private int maxFramesInRootCause;
    private int stackTraceLineLimit;
    private boolean markTransactionAsErrorOnErrorMessageLogTag;
    
    public ExErrorConfiguration(){}

    @XmlAttribute(name=AppExportS.AGENT_TYPE)
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    @XmlElement(name=AppExportS.DETECT_PHP_ERRORS)
    public boolean isDetectPhpErrors() {
        return detectPhpErrors;
    }

    public void setDetectPhpErrors(boolean detectPhpErrors) {
        this.detectPhpErrors = detectPhpErrors;
    }

    @XmlElement(name=AppExportS.PHP_ERROR_LEVEL)
    public String getPhpErrorLevel() {
        return phpErrorLevel;
    }

    public void setPhpErrorLevel(String phpErrorLevel) {
        this.phpErrorLevel = phpErrorLevel;
    }

    @XmlElement(name=AppExportS.DISABLE_DEFAULT_HTTP_ERROR_CODE)
    public boolean isDisableDefaultHttpErrorCode() {
        return disableDefaultHttpErrorCode;
    }

    public void setDisableDefaultHttpErrorCode(boolean disableDefaultHttpErrorCode) {
        this.disableDefaultHttpErrorCode = disableDefaultHttpErrorCode;
    }

    
    @XmlElement(name=AppExportS.IGNORE_EXCEPTIONS)
    public String getIgnoreException() {
        return ignoreException;
    }

    public void setIgnoreException(String ignoreException) {
        this.ignoreException = ignoreException;
    }

    @XmlElement(name=AppExportS.IGNORE_LOGGER_NAME)
    public String getIgnoreLoggerNames() {
        return ignoreLoggerNames;
    }

    public void setIgnoreLoggerNames(String ignoreLoggerNames) {
        this.ignoreLoggerNames = ignoreLoggerNames;
    }

    @XmlElement(name=AppExportS.CAPTURE_LOGGER_ERROR_AND_FATAL_MESSAGE)
    public boolean isCaptureLoggerErrorAndFatalMessages() {
        return captureLoggerErrorAndFatalMessages;
    }

    public void setCaptureLoggerErrorAndFatalMessages(boolean captureLoggerErrorAndFatalMessages) {
        this.captureLoggerErrorAndFatalMessages = captureLoggerErrorAndFatalMessages;
    }

    @XmlElement(name=AppExportS.MAX_FRAMES_IN_ROOT_CAUSE)
    public int getMaxFramesInRootCause() {
        return maxFramesInRootCause;
    }

    public void setMaxFramesInRootCause(int maxFramesInRootCause) {
        this.maxFramesInRootCause = maxFramesInRootCause;
    }

    @XmlElement(name=AppExportS.STACK_TRACE_LINE_LIMIT)
    public int getStackTraceLineLimit() {
        return stackTraceLineLimit;
    }

    public void setStackTraceLineLimit(int stackTraceLineLimit) {
        this.stackTraceLineLimit = stackTraceLineLimit;
    }

    @XmlElement(name=AppExportS.MARK_TRANACTION_AS_ERROR_ON_ERROR_MESSAGE)
    public boolean isMarkTransactionAsErrorOnErrorMessageLogTag() {
        return markTransactionAsErrorOnErrorMessageLogTag;
    }

    public void setMarkTransactionAsErrorOnErrorMessageLogTag(boolean markTransactionAsErrorOnErrorMessageLogTag) {
        this.markTransactionAsErrorOnErrorMessageLogTag = markTransactionAsErrorOnErrorMessageLogTag;
    }

    @XmlElement(name=AppExportS.DISABLE_JAVA_LOGGING)
    public boolean isDisableJavaLogging() {
        return disableJavaLogging;
    }

    public void setDisableJavaLogging(boolean disableJavaLogging) {
        this.disableJavaLogging = disableJavaLogging;
    }

    @XmlElement(name=AppExportS.DISABLE_LOG4J_LOGGING)
    public boolean isDisableLog4jLogging() {
        return disableLog4jLogging;
    }

    public void setDisableLog4jLogging(boolean disableLog4jLogging) {
        this.disableLog4jLogging = disableLog4jLogging;
    }

    @XmlElement(name=AppExportS.DISABLE_LOG4NET_LOGGING)
    public boolean isDisableLog4netLogging() {
        return disableLog4netLogging;
    }

    public void setDisableLog4netLogging(boolean disableLog4netLogging) {
        this.disableLog4netLogging = disableLog4netLogging;
    }

    @XmlElement(name=AppExportS.DISABLE_N_LOG)
    public boolean isDisableNLog() {
        return disableNLog;
    }

    public void setDisableNLog(boolean disableNLog) {
        this.disableNLog = disableNLog;
    }

    @XmlElement(name=AppExportS.DISABLE_EVENT_LOG)
    public boolean isDisableEventLog() {
        return disableEventLog;
    }

    public void setDisableEventLog(boolean disableEventLog) {
        this.disableEventLog = disableEventLog;
    }

    @XmlElement(name=AppExportS.DISABLE_SYSTEM_TRACE)
    public boolean isDisableSystemTrace() {
        return disableSystemTrace;
    }

    public void setDisableSystemTrace(boolean disableSystemTrace) {
        this.disableSystemTrace = disableSystemTrace;
    }

    @XmlElement(name=AppExportS.IGNORE_EXCEPTION_MSG_PATTERNS)
    public ArrayList<ExMatchPattern> getIgnoreExceptionPattern() {
        return ignoreExceptionPattern;
    }

    public void setIgnoreExceptionPattern(ArrayList<ExMatchPattern> ignoreExceptionPattern) {
        this.ignoreExceptionPattern = ignoreExceptionPattern;
    }

    @XmlElement(name=AppExportS.IGNORE_LOGGER_MSG_PATTERNS)
    public ArrayList<ExMatchPattern> getIgnoreLoggerPattern() {
        return ignoreLoggerPattern;
    }

    public void setIgnoreLoggerPattern(ArrayList<ExMatchPattern> ignoreLoggerPattern) {
        this.ignoreLoggerPattern = ignoreLoggerPattern;
    }

    @XmlElement(name=AppExportS.CUSTOM_LOGGER_DEFINITION)
    public ArrayList<ExCustomLoggerDefinition> getCustomLoggerDefinitions() {
        return customLoggerDefinitions;
    }

    public void setCustomLoggerDefinitions(ArrayList<ExCustomLoggerDefinition> customLoggerDefinitions) {
        this.customLoggerDefinitions = customLoggerDefinitions;
    }

    @XmlElement(name=AppExportS.HTTP_ERROR_RETURN_CODE)
    public ArrayList<ExHttpErrorReturnCode> getHttpErrorReturnCodes() {
        return httpErrorReturnCodes;
    }

    public void setHttpErrorReturnCodes(ArrayList<ExHttpErrorReturnCode> httpErrorReturnCodes) {
        this.httpErrorReturnCodes = httpErrorReturnCodes;
    }

    @XmlElement(name=AppExportS.ERROR_REDIRECT_PAGE)
    public ArrayList<ExErrorRedirectPage> getErrorRedirectPage() {
        return errorRedirectPage;
    }

    public void setErrorRedirectPage(ArrayList<ExErrorRedirectPage> errorRedirectPage) {
        this.errorRedirectPage = errorRedirectPage;
    }
    
    
    
    //start at l2
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L1_1).append(AppExportS.ERROR_CONFIGURATION);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        
        if(agentType.equals(AppExportS.PHP_APP_AGENT)){
            bud.append(AppExportS.L2).append(AppExportS.DETECT_PHP_ERRORS).append(AppExportS.VE).append(detectPhpErrors);
            bud.append(AppExportS.L2).append(AppExportS.PHP_ERROR_LEVEL).append(AppExportS.VE).append(phpErrorLevel); 
        }
        
        if(agentType.equals(AppExportS.JAVA_APP_AGENT)){
            bud.append(AppExportS.L2).append(AppExportS.DISABLE_JAVA_LOGGING).append(AppExportS.VE).append(disableJavaLogging);
            bud.append(AppExportS.L2).append(AppExportS.DISABLE_LOG4J_LOGGING).append(AppExportS.VE).append(disableLog4jLogging); 
        }
        
        if(agentType.equals(AppExportS.DOTNET_APP_AGENT)){
            bud.append(AppExportS.L2).append(AppExportS.DISABLE_SYSTEM_TRACE).append(AppExportS.VE).append(disableSystemTrace);
            bud.append(AppExportS.L2).append(AppExportS.DISABLE_EVENT_LOG).append(AppExportS.VE).append(disableEventLog); 
            bud.append(AppExportS.L2).append(AppExportS.DISABLE_N_LOG).append(AppExportS.VE).append(disableNLog);
            bud.append(AppExportS.L2).append(AppExportS.DISABLE_LOG4NET_LOGGING).append(AppExportS.VE).append(disableLog4netLogging); 
        }
        
        bud.append(AppExportS.L2).append(AppExportS.DISABLE_DEFAULT_HTTP_ERROR_CODE)
                .append(AppExportS.VE).append(disableDefaultHttpErrorCode);
        
        bud.append(AppExportS.L2).append(AppExportS.IGNORE_EXCEPTIONS).append(AppExportS.VE).append(ignoreException);
        for(ExMatchPattern matchP:ignoreExceptionPattern){
            bud.append(AppExportS.L2).append(AppExportS.IGNORE_EXCEPTION_MSG_PATTERNS);bud.append(matchP);
        }
        
        bud.append(AppExportS.L2).append(AppExportS.IGNORE_LOGGER_NAME).append(AppExportS.VE).append(ignoreLoggerNames);
        for(ExMatchPattern matchP:ignoreLoggerPattern){
            bud.append(AppExportS.L2).append(AppExportS.IGNORE_LOGGER_MSG_PATTERNS);bud.append(matchP);
        }
        
        for(ExCustomLoggerDefinition custom:customLoggerDefinitions){
            bud.append(custom.toString());
        }
        
        for(ExHttpErrorReturnCode error: httpErrorReturnCodes){ bud.append(error.toString());}
        
        for(ExErrorRedirectPage error: errorRedirectPage){ bud.append(error.toString());}
        
        if(!agentType.equals(AppExportS.NODEJS_APP_AGENT))
            bud.append(AppExportS.L2).append(AppExportS.CAPTURE_LOGGER_ERROR_AND_FATAL_MESSAGE)
                    .append(AppExportS.VE).append(captureLoggerErrorAndFatalMessages);
        
        bud.append(AppExportS.L2).append(AppExportS.MAX_FRAMES_IN_ROOT_CAUSE).append(AppExportS.VE).append(maxFramesInRootCause);
        bud.append(AppExportS.L2).append(AppExportS.STACK_TRACE_LINE_LIMIT).append(AppExportS.VE).append(maxFramesInRootCause);
        
        if(!agentType.equals(AppExportS.NODEJS_APP_AGENT))
            bud.append(AppExportS.L2).append(AppExportS.MARK_TRANACTION_AS_ERROR_ON_ERROR_MESSAGE)
                    .append(AppExportS.VE).append(markTransactionAsErrorOnErrorMessageLogTag);
        
        return bud.toString();
    }
    
    
    public String whatIsDifferent(ExErrorConfiguration obj){
        if(this.equals(obj)) return AppExportS._U;
        
        // If we are looking at two different agents there is no need to compare
        if(!agentType.equals(obj.getAgentType())) return "";
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L1_1).append(AppExportS.ERROR_CONFIGURATION);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        if(agentType.equals(AppExportS.PHP_APP_AGENT)){
            if(detectPhpErrors!=obj.isDetectPhpErrors()){ 
                bud.append(AppExportS.L2).append(AppExportS.DETECT_PHP_ERRORS);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(detectPhpErrors);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDetectPhpErrors());
            }
            
            if(!phpErrorLevel.equals(obj.getPhpErrorLevel())){
                bud.append(AppExportS.L2).append(AppExportS.PHP_ERROR_LEVEL);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(phpErrorLevel);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.getPhpErrorLevel());
            }
        }
        
        if(agentType.equals(AppExportS.JAVA_APP_AGENT)){
            if(disableJavaLogging != obj.isDisableJavaLogging()){
                bud.append(AppExportS.L2).append(AppExportS.DISABLE_JAVA_LOGGING);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(disableJavaLogging);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDisableJavaLogging());
                
            }
            
            if(disableLog4jLogging != obj.isDisableLog4jLogging()){
                bud.append(AppExportS.L2).append(AppExportS.DISABLE_LOG4J_LOGGING);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(disableLog4jLogging);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDisableLog4jLogging());
                
            }
                
        }
        
        if(agentType.equals(AppExportS.DOTNET_APP_AGENT)){
            if(disableSystemTrace != obj.isDisableSystemTrace()){
                bud.append(AppExportS.L2).append(AppExportS.DISABLE_SYSTEM_TRACE);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(disableSystemTrace);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDisableSystemTrace());
                
            }
            
            if(disableEventLog != obj.isDisableEventLog()){
                bud.append(AppExportS.L2).append(AppExportS.DISABLE_EVENT_LOG);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(disableEventLog);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDisableEventLog());
                
            }
            
            if(disableNLog != obj.isDisableNLog()){
                bud.append(AppExportS.L2).append(AppExportS.DISABLE_N_LOG);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(disableNLog);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDisableNLog());
                
            }
            
            if(disableLog4netLogging != obj.isDisableLog4netLogging()){
                bud.append(AppExportS.L2).append(AppExportS.DISABLE_LOG4NET_LOGGING);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(disableLog4netLogging);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDisableLog4netLogging());
                
            }
            
        }
        
        if(disableDefaultHttpErrorCode != obj.isDisableDefaultHttpErrorCode()){
                bud.append(AppExportS.L2).append(AppExportS.DISABLE_DEFAULT_HTTP_ERROR_CODE);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(disableDefaultHttpErrorCode);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isDisableDefaultHttpErrorCode());  
        }
        
        for(ExCustomLoggerDefinition custom: customLoggerDefinitions){
            boolean fnd=false;
            for(ExCustomLoggerDefinition custom1:obj.getCustomLoggerDefinitions()){
                if(custom.getName().equals(custom1.getName())){
                    fnd=true;
                    bud.append(custom.whatIsDifferent(custom1));
                }
                
            }
            if(!fnd){
                    bud.append(AppExportS.L2).append(AppExportS.CUSTOM_LOGGER_DEFINITION);
                    bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(custom.getName());
                }
        }
        for(ExCustomLoggerDefinition custom: obj.getCustomLoggerDefinitions()){
            boolean fnd=false;
            for(ExCustomLoggerDefinition custom1:customLoggerDefinitions){
                if(custom.getName().equals(custom1.getName())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L2).append(AppExportS.CUSTOM_LOGGER_DEFINITION);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(custom.getName());
            }
        }
        
        for(ExHttpErrorReturnCode error: httpErrorReturnCodes){ 
            boolean fnd=false;
            for(ExHttpErrorReturnCode error1: obj.getHttpErrorReturnCodes()){
                if(error.getName().equals(error1.getName())){
                    fnd=true;
                    bud.append(error.whatIsDifferent(error1));
                }
                
            }
            
            if(!fnd){
                bud.append(AppExportS.L2).append(AppExportS.HTTP_ERROR_RETURN_CODE);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(error.getName());
            }
        }
        
        for(ExHttpErrorReturnCode error: obj.getHttpErrorReturnCodes()){ 
            boolean fnd=false;
            for(ExHttpErrorReturnCode error1: httpErrorReturnCodes){
                if(error.getName().equals(error1.getName())){
                    fnd=true;
                    bud.append(error.whatIsDifferent(error1));
                }
                    
            }
            
            if(!fnd){
                bud.append(AppExportS.L2).append(AppExportS.HTTP_ERROR_RETURN_CODE);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(error.getName());
            }
        }
        
        for(ExErrorRedirectPage error: errorRedirectPage){ 
            bud.append(error.toString());
        }
        
        if(!ignoreException.equals(obj.getIgnoreException())){
                bud.append(AppExportS.L2).append(AppExportS.IGNORE_EXCEPTIONS);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(ignoreException);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.getIgnoreException()); 
            
        }
        
        if(!ignoreLoggerNames.equals(obj.getIgnoreLoggerNames())){
                bud.append(AppExportS.L2).append(AppExportS.IGNORE_LOGGER_NAME);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(ignoreLoggerNames);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.getIgnoreLoggerNames()); 
            
        }
        
        
        if(!agentType.equals(AppExportS.NODEJS_APP_AGENT)){
            if(markTransactionAsErrorOnErrorMessageLogTag != obj.isMarkTransactionAsErrorOnErrorMessageLogTag()){
                bud.append(AppExportS.L2).append(AppExportS.MARK_TRANACTION_AS_ERROR_ON_ERROR_MESSAGE);
                bud.append(AppExportS.L2_1).append(AppExportS.SRC).append(markTransactionAsErrorOnErrorMessageLogTag);
                bud.append(AppExportS.L2_1).append(AppExportS.DEST).append(obj.isMarkTransactionAsErrorOnErrorMessageLogTag());
            }
        }
        
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (this.agentType != null ? this.agentType.hashCode() : 0);
        hash = 71 * hash + (this.disableDefaultHttpErrorCode ? 1 : 0);
        hash = 71 * hash + (this.ignoreException != null ? this.ignoreException.hashCode() : 0);
        hash = 71 * hash + (this.ignoreLoggerNames != null ? this.ignoreLoggerNames.hashCode() : 0);
        hash = 71 * hash + (this.httpErrorReturnCodes != null ? this.httpErrorReturnCodes.hashCode() : 0);
        hash = 71 * hash + (this.markTransactionAsErrorOnErrorMessageLogTag ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExErrorConfiguration other = (ExErrorConfiguration) obj;
        if ((this.agentType == null) ? (other.agentType != null) : !this.agentType.equals(other.agentType)) {
            return false;
        }
        if (this.detectPhpErrors != other.detectPhpErrors) {
            return false;
        }
        if ((this.phpErrorLevel == null) ? (other.phpErrorLevel != null) : !this.phpErrorLevel.equals(other.phpErrorLevel)) {
            return false;
        }
        if (this.disableJavaLogging != other.disableJavaLogging) {
            return false;
        }
        if (this.disableLog4jLogging != other.disableLog4jLogging) {
            return false;
        }
        if (this.disableLog4netLogging != other.disableLog4netLogging) {
            return false;
        }
        if (this.disableNLog != other.disableNLog) {
            return false;
        }
        if (this.disableEventLog != other.disableEventLog) {
            return false;
        }
        if (this.disableSystemTrace != other.disableSystemTrace) {
            return false;
        }
        if (this.disableDefaultHttpErrorCode != other.disableDefaultHttpErrorCode) {
            return false;
        }
        if ((this.ignoreException == null) ? (other.ignoreException != null) : !this.ignoreException.equals(other.ignoreException)) {
            return false;
        }
        if (this.ignoreExceptionPattern != other.ignoreExceptionPattern && (this.ignoreExceptionPattern == null || !this.ignoreExceptionPattern.equals(other.ignoreExceptionPattern))) {
            return false;
        }
        if ((this.ignoreLoggerNames == null) ? (other.ignoreLoggerNames != null) : !this.ignoreLoggerNames.equals(other.ignoreLoggerNames)) {
            return false;
        }
        if (this.ignoreLoggerPattern != other.ignoreLoggerPattern && (this.ignoreLoggerPattern == null || !this.ignoreLoggerPattern.equals(other.ignoreLoggerPattern))) {
            return false;
        }
        if (this.customLoggerDefinitions != other.customLoggerDefinitions && (this.customLoggerDefinitions == null || !this.customLoggerDefinitions.equals(other.customLoggerDefinitions))) {
            return false;
        }
        if (this.captureLoggerErrorAndFatalMessages != other.captureLoggerErrorAndFatalMessages) {
            return false;
        }
        if (this.httpErrorReturnCodes != other.httpErrorReturnCodes && (this.httpErrorReturnCodes == null || !this.httpErrorReturnCodes.equals(other.httpErrorReturnCodes))) {
            return false;
        }
        if (this.errorRedirectPage != other.errorRedirectPage && (this.errorRedirectPage == null || !this.errorRedirectPage.equals(other.errorRedirectPage))) {
            return false;
        }
        if (this.maxFramesInRootCause != other.maxFramesInRootCause) {
            return false;
        }
        if (this.stackTraceLineLimit != other.stackTraceLineLimit) {
            return false;
        }
        if (this.markTransactionAsErrorOnErrorMessageLogTag != other.markTransactionAsErrorOnErrorMessageLogTag) {
            return false;
        }
        return true;
    }

    
    
    
}
