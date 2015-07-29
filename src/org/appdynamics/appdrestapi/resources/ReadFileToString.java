/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.resources;

import java.io.*;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author gilbert.solorzano
 */
public class ReadFileToString {
    private static Logger logger=Logger.getLogger(ReadFileToString.class.getName());
    public static String readFileToString(String filePath){
        try{
            java.io.BufferedReader br=new java.io.BufferedReader(new FileReader(filePath));
            StringBuilder bud = new StringBuilder();
            String s;
            while((s= br.readLine()) != null){
                bud.append(s).append("\n");
            }
             return bud.toString();
        }catch(Exception e){
            logger.log(Level.SEVERE,new StringBuilder().append("Exception occurred while attempting to open the file ")
                    .append(filePath).append(" with ").append(e.getMessage()).toString());
        }
        
        return null;
    }
}
