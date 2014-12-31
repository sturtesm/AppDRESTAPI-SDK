/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.appdynamics.appdrestapi.resources.AppExportS;

/**
 *
 * @author gilbert.solorzano
 */
@XmlSeeAlso(ExCookie.class)
public class ExCookies {
    private ArrayList<ExCookie> cookies=new ArrayList<ExCookie>();
    
    public ExCookies(){}

    @XmlElement(name=AppExportS.COOKIE)
    public ArrayList<ExCookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<ExCookie> cookies) {
        this.cookies = cookies;
    }
    
    public String whatIsDifferent(ExCookies obj){
        if( this.equals(obj) ) return AppExportS._;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.L3).append(AppExportS.COOKIES);
        
        for(ExCookie value:cookies){
            boolean fnd=false;
            for(ExCookie _value:obj.getCookies()){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.L3_1).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExCookie value:obj.getCookies()){
            boolean fnd=false;
            for(ExCookie _value:cookies){
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
        bud.append(AppExportS.L3).append(AppExportS.COOKIES);
        for(ExCookie cookie:cookies) bud.append(cookie);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.cookies != null ? this.cookies.hashCode() : 0);
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
        final ExCookies other = (ExCookies) obj;
        if (this.cookies != other.cookies && (this.cookies == null || !this.cookies.equals(other.cookies))) {
            return false;
        }
        return true;
    }
    
    
    
}
