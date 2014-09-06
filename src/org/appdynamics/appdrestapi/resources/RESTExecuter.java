/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

import org.appdynamics.appdrestapi.data.*;
import org.appdynamics.appdrestapi.exportdata.ExApplication;
import org.appdynamics.appdrestapi.queries.ApplicationQuery;
import org.appdynamics.appdrestapi.resources.AppExportS;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import javax.ws.rs.core.MediaType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

//Accepting all certs
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;



import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author soloink
 */
public class RESTExecuter {
    static ClientConfig config = null;
    static Client client=null;
    private static Logger logger=Logger.getLogger(RESTExecuter.class.getName());
    
    private static void createConnection(RESTAuth auth){
        config = new DefaultClientConfig();
        //new code
        TrustManager[] certs = new TrustManager[]{
          new X509TrustManager(){
              @Override
              public X509Certificate[] getAcceptedIssuers(){
                  return null;
              }
              
              @Override
              public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException{}
              
              @Override 
              public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException{}
          }  
        };
        
        SSLContext ctx = null;
        try{
            ctx = SSLContext.getInstance("TLS");
            ctx.init(null, certs, new SecureRandom());
        }catch(java.security.GeneralSecurityException ex){
            logger.log(Level.INFO,new StringBuilder().append("Exception ocurred while attempting to setup all trusting SSL security. ").toString());
        }
        
        HttpsURLConnection.setDefaultSSLSocketFactory(ctx.getSocketFactory());
        
        try{
            config.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, new HTTPSProperties(
                    new HostnameVerifier(){
                        @Override
                        public boolean verify(String hostname, SSLSession session){return true;}
                    },ctx));
            
        }catch(Exception e){
            logger.log(Level.INFO,new StringBuilder().append("Exception ocurred while attempting to associating our SSL cert to the session.").toString());
        }
        //old code
        client = Client.create(config);
        client.addFilter(new HTTPBasicAuthFilter(auth.getUserNameForAuth(),auth.getPasswd()));
    }
    
    public static MetricDatas executeMetricQuery(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }
        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("Query:\n").append(query).toString());
        WebResource service = client.resource(query);
        ClientResponse response = null;
        MetricDatas md = null;
        try{
            int currentCount=1;
            while(currentCount <= s.MAX_TRIES){
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
                if(response.getStatus() >= 500){
                    logger.log(Level.INFO,new StringBuilder().append("Caught HTTP error number ").append(response.getStatus())
                            .append(", attempting again from attempt number ").append(currentCount).toString());
                    
                    currentCount++;
                    Thread.sleep(1200*currentCount);
                }else{
                    md = (MetricDatas) response.getEntity(MetricDatas.class);
                    if(md == null){ 
                        logger.log(Level.INFO,new StringBuilder().append("Data returned was null, attempting the query again. ").toString());
                        currentCount++;}
                    else{currentCount=s.MAX_TRIES+1;}
                }
            }
            
            if(response.getStatus() >= 500 && currentCount > s.MAX_TRIES) 
                logger.log(Level.SEVERE,new StringBuilder().append("Caught HTTP error number ").append(response.getStatus())
                            .append(".\nUnable to get a proper response for query:\n").append(query).toString());
            
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception getting entity. \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(".\n Response code is ")
                    .append(response.getStatus()).toString());
        }
        
        
        
        if(s.debugLevel > 1 && md != null){
            logger.log(Level.INFO,new StringBuilder().append("Number of metrics datas returns is ").append(md.getMetric_data().size()).toString());
        }
        
        if(s.debugLevel > 2 && md != null) logger.log(Level.FINE,new StringBuilder().append(md.toString()).toString());
        return md;
    }
    
    
    public static String executeApplicationExportByIdQuery(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 2)logger.log(Level.INFO,new StringBuilder().append("Using the following for auth: ").append(auth.toString()).toString());
        WebResource service = null;
        ClientResponse response = null;
        String value=null;
        try{
         
            service = client.resource(query);
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            value= (String) response.getEntity(String.class);
            
            
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception getting application export: \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(".\nResponse code is ").append(response.getStatus()).toString());
        }
        return value;
        
    }
    
    public static ExApplication executeApplicationExportObjByIdQuery(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 2)logger.log(Level.INFO,new StringBuilder().append("Using the following for auth: ").append(auth.toString()).toString());
        WebResource service = null;
        ClientResponse response = null;
        String apps=null;
        ExApplication exApp=null;
        try{
         
            service = client.resource(query);
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            apps= (String) response.getEntity(String.class);
            JAXBContext context = JAXBContext.newInstance(ExApplication.class);
            Unmarshaller un = context.createUnmarshaller();
            InputStream inStream = new ByteArrayInputStream(apps.getBytes());
            exApp = (ExApplication) un.unmarshal(inStream);
  
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception getting application export: \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(".\nResponse code is ").append(response.getStatus()).toString());
        }
        return exApp;
        
    }
    
    public static BusinessTransactions executeBusinessTransactionQuery(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 2)logger.log(Level.INFO,new StringBuilder().append("Using the following for auth: ").append(auth.toString()).toString());
        WebResource service = null;
        ClientResponse response = null;
        BusinessTransactions bts=null;
        try{
         
            service = client.resource(query);
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            bts= (BusinessTransactions) response.getEntity(BusinessTransactions.class);
            
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception getting business transaction: \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(".\nResponse code is ").append(response.getStatus()).toString());
        }
        
        
        
        if(s.debugLevel > 1){
            logger.log(Level.INFO,new StringBuilder().append("Number of metrics datas returns is ").append(bts.getBusinessTransactions().size()).toString());
        }
        
        if(s.debugLevel > 2) logger.log(Level.FINE,new StringBuilder().append(bts.toString()).toString());
        
        return bts;
    }
    
    public static Applications executeApplicationQuery(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 2)logger.log(Level.INFO,new StringBuilder().append("Using the following for auth: ").append(auth.toString()).toString());
        WebResource service = null;
        ClientResponse response = null;
        Applications apps=null;
        try{
         
            service = client.resource(query);
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            apps= (Applications) response.getEntity(Applications.class);
            
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception getting entity: \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(".\nResponse code is ").append(response.getStatus()).toString());
        }
        
        
        
        if(s.debugLevel > 1){
            logger.log(Level.INFO,new StringBuilder().append("Number of metrics datas returns is ").append(apps.getApplications().size()).toString());
        }
        
        if(s.debugLevel > 2) logger.log(Level.FINE,new StringBuilder().append(apps.toString()).toString());
        
        return apps;
    }
    
    public static Tiers executeTierQuery(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("Query:\n").append(query).toString());
        WebResource service = client.resource(query);
        ClientResponse response = null;
        Tiers tiers= null;
        try{
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            tiers= (Tiers) response.getEntity(Tiers.class);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception getting entity: \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(". Response code is ")
                    .append(response.getStatus()).toString());
        }
        

        return tiers;
    }
    
    public static Nodes executeNodeQuery(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("Query:\n").append(query).toString());
        WebResource service = client.resource(query);
        ClientResponse response = null;
        Nodes nodes=null;
        try{
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            nodes= (Nodes) response.getEntity(Nodes.class);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Exception getting entity, please insure that your query is correct. \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(". Response code ")
                    .append(response.getStatus()).toString());
        } 
        
        if(s.debugLevel > 1){
            logger.log(Level.INFO,new StringBuilder().append("Number of metrics datas returns is ").append(nodes.getNodes().size()).toString());
        }
        
        if(s.debugLevel > 2) logger.log(Level.FINE,new StringBuilder().append(nodes.toString()).toString());
        
        
        return nodes;
    }
    
    public static PolicyViolations executePolicyViolations(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("Query:\n").append(query).toString());
        WebResource service = client.resource(query);
        ClientResponse response = null;
        PolicyViolations pvs=null;
        try{
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            pvs= (PolicyViolations) response.getEntity(PolicyViolations.class);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Exception getting entity, please insure that your query is correct. \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(". Response code ")
                    .append(response.getStatus()).toString());
        } 
        
        if(s.debugLevel > 1){
            logger.log(Level.INFO,new StringBuilder().append("Number of policy violations returns is ").append(pvs.getPolicyViolations().size()).toString());
        }
        
        if(s.debugLevel > 2) logger.log(Level.FINE,new StringBuilder().append(pvs.toString()).toString());
        
        return pvs;
    }
    
    public static Events executeEvents(RESTAuth auth, String query){
        
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("\nexecuteEvents Query:\n").append(query).toString());
        
        WebResource service = client.resource(query);
        
        ClientResponse response = null;
        Events evs=null;
        try{
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            evs= (Events) response.getEntity(Events.class);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Exception getting entity, please insure that your query is correct. \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(". Response code ")
                    .append(response.getStatus()).toString());
        } 
          
        if(s.debugLevel > 1 && evs != null ){
            logger.log(Level.INFO,new StringBuilder().append("Number of events returns is ").append(evs.getEvents().size()).toString());
        }
        
        if(s.debugLevel > 2 && evs != null) logger.log(Level.FINE,new StringBuilder().append(evs.toString()).toString());
        
        return evs;
    }
    

    public static Backends executeBackends(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("Query:\n").append(query).toString());
        WebResource service = client.resource(query);
        ClientResponse response = null;
        Backends bcs=null;
        try{
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            bcs= (Backends) response.getEntity(Backends.class);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Exception getting entity, please insure that your query is correct. \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(". Response code ")
                    .append(response.getStatus()).toString());
        } 
        
        if(s.debugLevel > 1){
            logger.log(Level.INFO,new StringBuilder().append("Number of events returns is ").append(bcs.getBackend().size()).toString());
        }
        
        if(s.debugLevel > 2) logger.log(Level.FINE,new StringBuilder().append(bcs.toString()).toString());
        
        return bcs;
    }
    
    public static Snapshots executeSnapshots(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("Query:\n").append(query).toString());
        WebResource service = client.resource(query);
        ClientResponse response = null;
        Snapshots rs=null;
        try{
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            rs= (Snapshots) response.getEntity(Snapshots.class);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Exception getting entity, please insure that your query is correct. \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(". Response code ")
                    .append(response.getStatus()).toString());
        } 
        
        if(s.debugLevel > 1){
            logger.log(Level.INFO,new StringBuilder().append("Number of snapshots returns is ").append(rs.getRequestDatas().size()).toString());
        }
        
        if(s.debugLevel > 2) logger.log(Level.FINE,new StringBuilder().append(rs.toString()).toString());
        
        return rs;
    }
    
    public static MetricItems executeMetricItems(RESTAuth auth, String query){
        if(client == null) {
            createConnection(auth);
        }

        
        if(s.debugLevel > 1 ) logger.log(Level.INFO,new StringBuilder().append("Query:\n").append(query).toString());
        WebResource service = client.resource(query);
        ClientResponse response = null;
        MetricItems mi=null;
        try{
            response = service.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
            mi= (MetricItems) response.getEntity(MetricItems.class);
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder()
                    .append("Exception getting entity, please insure that your query is correct. \nQuery:\n\t")
                    .append(query).append("\nError:").append(e.getMessage()).append(". Response code ")
                    .append(response.getStatus()).toString());
        } 
        
        if(s.debugLevel > 1){
            logger.log(Level.INFO,new StringBuilder().append("Number of metricItems returns is ").append(mi.getMetricItems().size()).toString());
        }
        
        if(s.debugLevel > 2) logger.log(Level.FINE,new StringBuilder().append(mi.toString()).toString());
        
        return mi;
    }
    

    
}
