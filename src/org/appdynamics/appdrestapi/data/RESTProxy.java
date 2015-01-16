/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;
import org.appdynamics.appdrestapi.resources.s;

/**
 *
 * @author gilbert.solorzano
 */
public class RESTProxy {
    private boolean useProxyAuth;
    private String url;
    private String user;
    private Integer port;
    private String passwd;
    
    public RESTProxy(){}
    
    public RESTProxy(String url, Integer port){
        this.url=url;
        this.port=port;
        this.useProxyAuth=false;
    }
    
    public RESTProxy(String url, Integer port, String user, String passwd){
        this.url=url;
        this.port=port;
        this.useProxyAuth=true;
        this.user=user;
        this.passwd=passwd;
    }
    

    public boolean isUseProxyAuth() {
        return useProxyAuth;
    }

    public void setUseProxyAuth(boolean useProxyAuth) {
        this.useProxyAuth = useProxyAuth;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public boolean isSSL(){
        if(url != null && url.startsWith(s.HTTPS)) return true;
        return false;
    }
    
    public String getHost(){
        if(url != null){
            return url.split("/")[3];
        }
        return "";
    }
    
    
}
