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
    
    public String whatIsDifferent(ExHeaders obj){
        if( this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.COOKIES);
        
        for(ExHeader value:headers){
            boolean fnd=false;
            for(ExHeader _value:obj.getHeaders()){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExHeader value:obj.getHeaders()){
            boolean fnd=false;
            for(ExHeader _value:headers){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.L3_1).append(AppExportS.DEST).append(value);
            }
        }
    
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.HEADERS);
        for(ExHeader head:headers) bud.append(head);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.headers != null ? this.headers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExHeaders other = (ExHeaders) obj;
        if (this.headers != other.headers && (this.headers == null || !this.headers.equals(other.headers))) {
            return false;
        }
        return true;
    }
    
    
    
}
