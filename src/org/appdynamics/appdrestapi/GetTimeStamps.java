/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi;

import java.util.Calendar;


/**
 *
 * @author soloink
 */
public class GetTimeStamps {
    
    /**
     * This will return a set of timestamps that can be used to help with the use
     * of the RESTAPI API.
     * 
     * @param args None required
     */
    public static void main(String[] args){
        StringBuilder bud=new StringBuilder();
        Calendar cal=Calendar.getInstance();
        bud.append("Now  : ").append(getStringTime(cal));
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND,0);
        bud.append("Hour : ").append(getStringTime(cal));
        bud.append("-----------------------Hours-----------------------\n");
        for(int i=1; i < 12 ;i++){
            cal.add(Calendar.HOUR, -1);
            bud.append("Time : ").append(getStringTime(cal));
        }
        
        cal.set(Calendar.HOUR_OF_DAY, 0);
        bud.append("-----------------------Days-----------------------\n");
        for(int i=1; i < 160;i++){
            int a = 24 * -1;
            cal.add(Calendar.HOUR,a);
            bud.append("Days : ").append(getStringTime(cal));
        }
        System.out.println(bud.toString());
    }
    
    private static String getStringTime(Calendar cal){
        return new StringBuilder().append(cal.getTime().toString()).append(" : ").append(cal.getTimeInMillis()).append("\n").toString();
    }
}
