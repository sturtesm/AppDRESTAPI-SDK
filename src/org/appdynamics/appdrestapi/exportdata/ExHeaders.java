/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExHeader.class)
public class ExHeaders {
    private ArrayList<ExHeader> headers=new ArrayList<ExHeader>();
    
    public ExHeaders(){}

    @XmlElement(name=AppExportS.HEADER)
    public ArrayList<ExHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(ArrayList<ExHeader> headers) {
        this.headers = headers;
    }
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.HEADERS);
        for(ExHeader head:headers) bud.append(head);
        return bud.toString();
    }
    
}
