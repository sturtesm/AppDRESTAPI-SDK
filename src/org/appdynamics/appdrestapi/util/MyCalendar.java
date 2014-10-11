/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import java.util.Calendar;

/**
 *
 * @author gilbert.solorzano
 */
public class MyCalendar {
    public static Calendar getCalendar(){
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND,0);
        return cal;
    }
}
