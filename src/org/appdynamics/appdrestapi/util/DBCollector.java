/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.AppExportS;
import org.appdynamics.appdrestapi.resources.s;

import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 * "type":"'$_dbType'",
 * "agentName":"'$_dbAgentName'","name":"'$_dbName'",
 * "hostname":"'$_dbHostName'","port":"'$_dbPort'",
 * "username":"'$_dbUserName'","password":"'$_dbPassword'",
 * "useServiceName":"true","sid":"'$_dbSIDName'",
 * "enableOSMonitor":"'$_enableOSMonitor'",
 * "hostOS":"'$_hostOS'",
 * "sshPort":"'$_sshPort'",
 * "hostUsername":"'$_hostUsername'",
 * "hostPassword":"'$_hostPassword'
 * 
 * type(0),agentName(1),name(2),hostname(3),port(4),username(5),password(6),useServiceName(7),
 * sid(8),enableOSMonitor(9),hostOS(10),sshPort(11),hostUsername(12),hostPassword(13)
 * 
 */
public class DBCollector {
    private String type,name,agentName,hostname,port,username,password,sid,hostOS,sshPort,hostUsername,hostPassword;
    private boolean enableOSMonitor,useServiceName;


    public DBCollector(){}

    public DBCollector(ArrayList<String> list){
        type=list.get(0);name=list.get(2);agentName=list.get(1);
        hostname=list.get(3);port=list.get(4);username=list.get(5);
        password=list.get(6);useServiceName=Boolean.valueOf(list.get(7));
        sid=list.get(8);enableOSMonitor=Boolean.valueOf(list.get(9));
        hostOS=list.get(10);sshPort=list.get(11);hostUsername=list.get(12);
        hostPassword=list.get(13);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getHostOS() {
        return hostOS;
    }

    public void setHostOS(String hostOS) {
        this.hostOS = hostOS;
    }

    public String getSshPort() {
        return sshPort;
    }

    public void setSshPort(String sshPort) {
        this.sshPort = sshPort;
    }

    public String getHostUsername() {
        return hostUsername;
    }

    public void setHostUsername(String hostUsername) {
        this.hostUsername = hostUsername;
    }

    public String getHostPassword() {
        return hostPassword;
    }

    public void setHostPassword(String hostPassword) {
        this.hostPassword = hostPassword;
    }

    public boolean isEnableOSMonitor() {
        return enableOSMonitor;
    }

    public void setEnableOSMonitor(boolean enableOSMonitor) {
        this.enableOSMonitor = enableOSMonitor;
    }

    public boolean isUseServiceName() {
        return useServiceName;
    }

    public void setUseServiceName(boolean useServiceName) {
        this.useServiceName = useServiceName;
    }

    

    
    
    public String toJSON(){
        StringBuilder bud = new StringBuilder();
        bud.append("{");
        bud.append(s.JSON(s.TYPE, type));
        bud.append(s._C).append(s.JSON(s.DBC_AGENT_NAME, agentName));
        bud.append(s._C).append(s.JSON(s.DBC_DB_NAME, name));
        bud.append(s._C).append(s.JSON(s.DBC_HOSTNAME, hostname));
        bud.append(s._C).append(s.JSON(s.DBC_PORT, port));
        //bud.append(s._C).append(s.JSON(s.DBC_USE_SERVICE_NAME, useServiceName));
        //bud.append(s._C).append(s.JSON(s.DBC_SID, sid));
        bud.append(s._C).append(s.JSON(s.DBC_USERNAME, username));
        bud.append(s._C).append(s.JSON(s.DBC_PASSWORD, password));
        //bud.append(s._C).append(s.JSON(s.DBC_ENABLE_OS_MONITOR, enableOSMonitor));
        //bud.append(s._C).append(s.JSON(s.DBC_HOST_OS, hostOS));
        //bud.append(s._C).append(s.JSON(s.DBC_SSH_PORT, sshPort));
        //bud.append(s._C).append(s.JSON(s.DBC_HOST_USERNAME, hostUsername));
        //bud.append(s._C).append(s.JSON(s.DBC_HOST_PASSWORD, hostPassword));
        bud.append("}");
        return bud.toString();
    }  
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append("DB_COLLECTOR");
        bud.append(AppExportS.L1).append(s.TYPE).append(AppExportS.VE).append(type);
        bud.append(AppExportS.L1).append(s.DBC_AGENT_NAME).append(AppExportS.VE).append(agentName);
        bud.append(AppExportS.L1).append(s.DBC_DB_NAME).append(AppExportS.VE).append(name);
        bud.append(AppExportS.L1).append(s.DBC_HOSTNAME).append(AppExportS.VE).append(hostname);
        bud.append(AppExportS.L1).append(s.DBC_PORT).append(AppExportS.VE).append(port);
        bud.append(AppExportS.L1).append(s.DBC_USE_SERVICE_NAME).append(AppExportS.VE).append(useServiceName);
        bud.append(AppExportS.L1).append(s.DBC_SID).append(AppExportS.VE).append(sid);
        bud.append(AppExportS.L1).append(s.DBC_USERNAME).append(AppExportS.VE).append(username);
        bud.append(AppExportS.L1).append(s.DBC_PASSWORD).append(AppExportS.VE).append(password);
        bud.append(AppExportS.L1).append(s.DBC_ENABLE_OS_MONITOR).append(AppExportS.VE).append(enableOSMonitor);
        bud.append(AppExportS.L1).append(s.DBC_HOST_OS).append(AppExportS.VE).append(hostOS);
        bud.append(AppExportS.L1).append(s.DBC_SSH_PORT).append(AppExportS.VE).append(sshPort);
        bud.append(AppExportS.L1).append(s.DBC_HOST_USERNAME).append(AppExportS.VE).append(hostUsername);
        bud.append(AppExportS.L1).append(s.DBC_HOST_PASSWORD).append(AppExportS.VE).append(hostPassword);
        return bud.toString();
    }
    
}
