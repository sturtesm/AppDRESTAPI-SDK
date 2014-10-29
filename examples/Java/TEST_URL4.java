/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testing;


import org.appdynamics.appdrestapi.RESTAccess;
import org.appdynamics.appdrestapi.data.*;
import org.appdynamics.appdrestapi.util.PostEvent;

import java.util.Calendar;

/**
 *
 * @author gilbert.solorzano
 */
public class TEST_URL4 {
    
    public static void main(String[] args){
        String controller="gsappdyn01";
        String port="8090"; 
        
        String user="gsadmin";
        String passwd="fival1to2";

        String account="customer1";
           
        boolean useSSL=false;

        
       
        String site="/";    
 

        RESTAccess access=new RESTAccess(controller,port,useSSL,user,passwd,account);
        //access.setDebugLevel(2);
        
        /*
         * To get all of the application if we returned
         */
        Applications apps = access.getApplications();
        
        if(apps == null){ System.out.println("Something went wrong because getting applications should be easy!"); System.exit(1);}
        
        /*
         * Iterate through the Applications
         */
        
        for(Application appl:apps.getApplications()){
            System.out.println("The name of the application is " + appl.getName() + " the id is " + appl.getId());
        }
        
        String app="BDR Big Deal Retail";
        
        /*
         * To print all of the nodes for the app
         */
        Nodes nodes =access.getNodesForApplication(app);
        
        if(nodes == null) { System.out.println("Something went wrong because getting nodes should be easy!"); System.exit(1);}
        
        for(Node nodel:nodes.getNodes()){
            System.out.println("The name of the node is " + nodel.getName() + " and its ID is " + nodel.getId());
        }
        
        String node="3dTierNode1"; 
        
        Tiers tiers = access.getTiersForApplication(app);
        
        if(tiers == null) { System.out.println("Something went wrong because getting nodes should be easy!"); System.exit(1);}
        
        for(Tier tierl:tiers.getTiers()){
            System.out.println("The name of the tier is " + tierl.getName() + " the its ID is " + tierl.getId());
        }
        
        String tier="3dTier";
        
        /*
         *  To extract metrics you need to get the timestamps of when you want the data. 
         * Then you can either request the tier level or node level metrics 
         */

        Calendar cal=Calendar.getInstance();
        long end = cal.getTimeInMillis();
        cal.add(Calendar.MINUTE, -10);
        long start = cal.getTimeInMillis();
        
        /*
         *  Node level metrics
         * Index 23 : queryJVMTierProcessCPUUsagePerc 
         */
        MetricDatas mds = access.getRESTMetricQuery(23, app, tier, node, start, end);
        if(mds != null){
            for(MetricData metr:mds.getMetric_data()){
                for(MetricValues vals:metr.getMetricValues()){
                    for(MetricValue val: vals.getMetricValue()){
                        System.out.println("The metric value is " + val.getValue() + " the min is " + val.getMin());
                    }
                }
                
            }
        }
        
        /*
         *  Tier level metrics
         *  Index 23 : queryJVMTierProcessCPUUsagePerc 
         */
        mds = access.getRESTMetricQuery(23, app, tier, start, end);
        if(mds != null){
            for(MetricData metr:mds.getMetric_data()){
                for(MetricValues vals:metr.getMetricValues()){
                    for(MetricValue val: vals.getMetricValue()){
                        System.out.println("The metric value is " + val.getValue() + " the min is " + val.getMin());
                    }
                }
                
            }
        }
        
        /*
         *  To extract the Health Rule xml as a string
         */
        
        String allHealthRules=access.getRESTHealthRuleExportAll(app);
        
        /*
         *  To copy a health rule from app to another
         */
        
        app="BDR Big Deal Retail";
        String healthrule="Check Node Metric";
        // Check to make sure the rule is present
        System.out.println(access.getRESTHealthRuleExportSingle(app, healthrule));
        // Copy the rule to a string
        String healthXML=access.getRESTHealthRuleExportSingle(app, healthrule);
        // Change the application 
        app="APPD Big Deal Retail";
        // Post the rule
        System.out.println(access.postRESTHealthRule(app, healthrule, healthXML));
        // Check to see if the rule is present
        System.out.println(access.getRESTHealthRuleExportSingle(app, healthrule));
        
        /*
         * 
         *  To Post an event first you execute the following 
         * 
         */
        PostEvent event=new PostEvent("Change 12 of 14");

        // The custom even has now been posted to the app
        System.out.println(access.postRESTCustomEvent(app, event));
       
    }
    

}
