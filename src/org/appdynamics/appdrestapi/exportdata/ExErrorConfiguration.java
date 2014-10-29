/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
/**
 *
 * @author gilbert.solorzano
 * 
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
 * 
 */
public class ExErrorConfiguration {
    private String agentType;
    private boolean detectPhpErrors;
    private String phpErrorLevel;
    private boolean disableDefaultHttpErrorCode;
    private String ignoreException;
    private String ignoreLoggerNames;
    private boolean captureLoggerErrorAndFatalMessages;
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
    
    
    
    //start at l2
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.ERROR_CONFIGURATION);
        bud.append(AppExportS.L2).append(AppExportS.AGENT_TYPE).append(AppExportS.VE).append(agentType);
        bud.append(AppExportS.L2).append(AppExportS.DETECT_PHP_ERRORS).append(AppExportS.VE).append(detectPhpErrors);
        bud.append(AppExportS.L2).append(AppExportS.PHP_ERROR_LEVEL).append(AppExportS.VE).append(detectPhpErrors);
        bud.append(AppExportS.L2).append(AppExportS.DISABLE_DEFAULT_HTTP_ERROR_CODE).append(AppExportS.VE).append(disableDefaultHttpErrorCode);
        bud.append(AppExportS.L2).append(AppExportS.IGNORE_EXCEPTIONS).append(AppExportS.VE).append(ignoreException);
        bud.append(AppExportS.L2).append(AppExportS.IGNORE_LOGGER_NAME).append(AppExportS.VE).append(ignoreLoggerNames);
        bud.append(AppExportS.L2).append(AppExportS.CAPTURE_LOGGER_ERROR_AND_FATAL_MESSAGE).append(AppExportS.VE).append(captureLoggerErrorAndFatalMessages);
        bud.append(AppExportS.L2).append(AppExportS.MAX_FRAMES_IN_ROOT_CAUSE).append(AppExportS.VE).append(maxFramesInRootCause);
        bud.append(AppExportS.L2).append(AppExportS.STACK_TRACE_LINE_LIMIT).append(AppExportS.VE).append(maxFramesInRootCause);
        bud.append(AppExportS.L2).append(AppExportS.MARK_TRANACTION_AS_ERROR_ON_ERROR_MESSAGE).append(AppExportS.VE).append(markTransactionAsErrorOnErrorMessageLogTag);
        
        return bud.toString();
    }
}
