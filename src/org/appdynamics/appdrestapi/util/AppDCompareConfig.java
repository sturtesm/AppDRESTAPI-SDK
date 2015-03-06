/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.RESTAccess;
import org.appdynamics.appdrestapi.data.*;
import org.appdynamics.appdrestapi.exportdata.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.io.*;

/**
 *
 * @author gilbert.solorzano
 */
public class AppDCompareConfig {
    
    
    /**
     * 
     * @param filePath This is the path of the file
     * @return 
     */
    public ExApplication getAppObjectFromFile(String filePath){
        ExApplication app2=null;
        try{
            JAXBContext jc = JAXBContext.newInstance(ExApplication.class);
            Unmarshaller unM = jc.createUnmarshaller();
            app2 = (ExApplication)unM.unmarshal(new FileInputStream(filePath));
           
        }catch(Exception e){
            System.out.println("Exception " + e.getMessage());
        }
        return app2;
    }
    
}
