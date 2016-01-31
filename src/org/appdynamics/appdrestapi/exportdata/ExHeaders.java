/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExHeader.class)
public class ExHeaders {
    private ArrayList<ExHeader> headers=new ArrayList<ExHeader>();
    private int level=4;
    
    public ExHeaders(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
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
        
        bud.append(AppExportS.I[level]).append(AppExportS.COOKIES);
        level++;
        for(ExHeader value:headers){
            boolean fnd=false;
            for(ExHeader _value:obj.getHeaders()){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                level++;
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
                level--;
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
                level++;value.setLevel(level);
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
                level--;
            }
        }
        level--;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.HEADERS);
        level++;
        for(ExHeader head:headers){ bud.append(head);}
        level--;
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
        
        if(headers.size() != other.getHeaders().size()) return false;
        
        for(ExHeader value:headers){
            boolean fnd=false;
            for(ExHeader _value:other.getHeaders()){
                if(value.getMatchType().equals(_value.getMatchType())){
                    if(value.equals(_value)) fnd=true;
                }
            }
            if(!fnd){
                return false;
            }
        }
        return true;
    }
    
    
    
}
