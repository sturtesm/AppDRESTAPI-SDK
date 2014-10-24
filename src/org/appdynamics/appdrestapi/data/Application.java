/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

import org.appdynamics.appdrestapi.resources.s;

import javax.xml.bind.annotation.XmlElement;



/**
 *
 * @author soloink
 */
public class Application {
    private int id;
    private String name;
    private String description;
    
    public Application(){}
    
    public Application(int id, String name, String description){
        this.id=id;
        this.name=name;
        this.description=description;
    }

    @XmlElement(name=s.ID)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setId(String s_id) throws Exception{
        this.id = new Integer(s_id).intValue();
    }

    @XmlElement(name=s.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name=s.DESCRIPTION)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
        StringBuilder bud= new StringBuilder();
        bud.append("\tid = ").append(id).append("\n");
        bud.append("\tname = ").append(name).append("\n");
        bud.append("\tdescription = ").append(description).append("\n\n");
        return bud.toString();
    }
    
    
}
