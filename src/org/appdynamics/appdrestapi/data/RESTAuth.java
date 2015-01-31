/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

/**
 *
 * @author soloink
 */
public class RESTAuth {
    private String name;
    private String passwd;
    private String multiTenant="customer1";
    private boolean isMultiTenant;
    private RESTProxy proxy;
    private boolean useProxy=false;
    

    public RESTAuth(){}
    
    public RESTAuth(String name, String passwd){
        this.name=name;
        this.passwd=passwd;
        
    }
    
    public RESTAuth(String name, String passwd, String multiTenant, boolean isMultiTenant){
        this.name=name;
        this.passwd=passwd;
        this.multiTenant=multiTenant;
        this.isMultiTenant=isMultiTenant;
        this.useProxy=false;
    }
    
     public RESTAuth(String name, String passwd, String multiTenant, boolean isMultiTenant, RESTProxy proxy){
        this.name=name;
        this.passwd=passwd;
        this.multiTenant=multiTenant;
        this.isMultiTenant=isMultiTenant;
        this.useProxy=true;
        this.proxy=proxy;
    }
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getMultiTenant() {
        return multiTenant;
    }

    public void setMultiTenant(String multiTenant) {
        this.multiTenant = multiTenant;
    }

    public boolean isMultiTenant() {
        return isMultiTenant;
    }

    public void setIsMultiTenant(boolean isMultiTenant) {
        this.isMultiTenant = isMultiTenant;
    }
    
    public String getUserNameForAuth(){
        StringBuilder bud = new StringBuilder();
        bud.append(getName()).append("@").append(getMultiTenant());
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud=new StringBuilder();
        
        bud.append("\n\tUser ").append(getUserNameForAuth()).append("\n");
        bud.append("\tPasswd ").append(getPasswd()).append("\n");
        return bud.toString();
    }

    public RESTProxy getProxy() {
        return proxy;
    }

    public void setProxy(RESTProxy proxy) {
        useProxy=true;
        this.proxy = proxy;
    }

    public boolean isUseProxy() {
        return useProxy;
    }

    public void setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
    }

    
   
    
    
}
