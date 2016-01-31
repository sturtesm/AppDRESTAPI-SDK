/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

/**
 *
 * @author gilbert.solorzano
 * 
 * These are generic helper class that will make it easier when executing 
 * conversions.
 */
public class StringNumConv {
    
    public static int getIntFromString(String number, int defaultVal){
        try{
            return new Integer(number).intValue();
        }catch(Exception e){}
        
        return defaultVal;
    }
    
    public static double getDoubleFromString(String number, double defaultVal){
        try{
            return new Double(number).intValue();
        }catch(Exception e){}
        
        return defaultVal;
    }
}
