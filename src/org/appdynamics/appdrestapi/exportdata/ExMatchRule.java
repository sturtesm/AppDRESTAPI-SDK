/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
                    <match-rule>
                        <pojo-rule>
                            <enabled>false</enabled>
                            <priority>0</priority>
                            <display-name>Cron4J</display-name>
                            <background>true</background>
                            <match-class type="inherits-from-class">
                                <name filter-type="EQUALS" filter-value="it.sauronsoftware.cron4j.Task"/>
                            </match-class>
                            <split-config type="4"/>
                            <match-method>
                                <name filter-type="EQUALS" filter-value="execute"/>
                            </match-method>
                        </pojo-rule>
                    </match-rule>
 * 3
 */
@XmlSeeAlso({ExPojoRule.class,ExMatchClass.class,ExSplitConfig.class,ExMatchMethod.class,ExMatchClassName.class})
public class ExMatchRule {
    private ExPojoRule pojoRule;
    private ExServletRule servletRule;
    
    public ExMatchRule(){}

    @XmlElement(name=AppExportS.POJO_RULE)
    public ExPojoRule getPojoRule() {
        return pojoRule;
    }

    public void setPojoRule(ExPojoRule pojoRule) {
        this.pojoRule = pojoRule;
    }

    @XmlElement(name=AppExportS.SERVLET_RULE)
    public ExServletRule getServletRule() {
        return servletRule;
    }

    public void setServletRule(ExServletRule servletRule) {
        this.servletRule = servletRule;
    }
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L2).append(AppExportS.MATCH_RULE);
        if(pojoRule != null) bud.append(pojoRule);
        if(servletRule != null) bud.append(servletRule);
        return bud.toString();
    }
}
