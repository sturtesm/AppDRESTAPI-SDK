package com.appdynamics.tam.scripts

import org.appdynamics.appdrestapi.RESTAccess

/**
 * Created by ryan.rowcliffe on 10/6/14.
 */
def user = 'gsadmin'
def account = 'customer1'
def password = 'fival1to2'
def controller = 'gsappdyn01'
def ssl = true;
restAccess = new RESTAccess(controller,"443",user,password,account);

apps = restAccess.getApplications()?.applications;

apps.each{ app ->
    if (app.name.equals("BDR Big Deal Retail")){
        tiers = restAccess.getTiersForApplication(app.name).tiers
        tiers.each{ tier ->
            if(tier.name.contains("3dTier")){
                bts = restAccess.getBTSForApplication(app.id)?.businessTransactions
                bts.each{ bt ->
                    btMetric = restAccess.getRESTBTMetricQuery(3,app.name,tier.name,bt.name,System.currentTimeMillis()-6000000,System.currentTimeMillis(),false)

                    println btMetric.getMetric_data().metricValues.metricValue
                }
            }
        }

    }
}

