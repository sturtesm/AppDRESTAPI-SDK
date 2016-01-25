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
@XmlSeeAlso(ExCookie.class)
public class ExCookies {
    private ArrayList<ExCookie> cookies=new ArrayList<ExCookie>();
    private int level=4;
    
    public ExCookies(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.COOKIE)
    public ArrayList<ExCookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<ExCookie> cookies) {
        this.cookies = cookies;
    }
    
    public String whatIsDifferent(ExCookies obj){
        if( this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        
        bud.append(AppExportS.I[level]).append(AppExportS.COOKIES);
        level++;
        for(ExCookie value:cookies){
             value.setLevel(level);
            boolean fnd=false;
            for(ExCookie _value:obj.getCookies()){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);
            }
        }
        
        for(ExCookie value:obj.getCookies()){
                value.setLevel(level);
            boolean fnd=false;
            for(ExCookie _value:cookies){
                if(value.getMatchType().equals(_value.getMatchType())){
                    fnd=true;
                }
            }
            if(!fnd){
                bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);
            }
        }
        level++;
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.COOKIES);
        level++;
        for(ExCookie cookie:cookies){cookie.setLevel(level); bud.append(cookie);}
        level--;
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
