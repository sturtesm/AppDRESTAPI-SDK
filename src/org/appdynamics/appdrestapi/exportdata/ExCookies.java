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
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3).append(AppExportS.COOKIES);
        for(ExCookie cookie:cookies) bud.append(cookie);
        return bud.toString();
    }
    
}
