/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;

/**
 *
 * @author gilbert.solorzano
 * 
 * 
<custom-exit-point-definition>
<name>CB_Locked</name>
<instrumentation-point>
<pojo-method-definition>
<class-name>com.foo.bk.exit01</class-name>
<method-name>serialCall</method-name>
<match-type>MATCHES_CLASS</match-type>
<method-parameter-types/>
<match-condition>
<match-type>EQUALS</match-type>
<match-pattern>Var03</match-pattern>
<inverse>false</inverse>
<method-invocation-data-gatherer-config>
<name/>
<position>0</position>
<gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
<transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
</method-invocation-data-gatherer-config>
</match-condition>
</pojo-method-definition>
<apply-to-all-bts>true</apply-to-all-bts>
<method-invocation-data-gatherer-config>
<name>Deata</name>
<position>0</position>
<gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
<transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
</method-invocation-data-gatherer-config>
<method-invocation-data-gatherer-config>
<name>Blaba</name>
<position>0</position>
<gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
<transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
</method-invocation-data-gatherer-config>
<business-transactions/>
<info-point-metric-definition>
<name>UserCalls</name>
<rollup-type>AVERAGE</rollup-type>
<method-parameter-transformer>
<name/>
<position>0</position>
<gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
<transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
</method-parameter-transformer>
</info-point-metric-definition>
<info-point-metric-definition>
<name>CreditCardSwips</name>
<rollup-type>AVERAGE</rollup-type>
<method-parameter-transformer>
<name/>
<position>0</position>
<gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
<transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
</method-parameter-transformer>
</info-point-metric-definition>
</instrumentation-point>
<method-invocation-data-gatherer-config>
<name>LastTimeVar</name>
<position>0</position>
<gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
<transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
</method-invocation-data-gatherer-config>
<method-invocation-data-gatherer-config>
<name>Dabie</name>
<position>0</position>
<gatherer-type>POSITION_GATHERER_TYPE</gatherer-type>
<transformer-type>TO_STRING_OBJECT_DATA_TRANSFORMER_TYPE</transformer-type>
</method-invocation-data-gatherer-config>
<type>CBS</type>
</custom-exit-point-definition>
 * 
 */

@XmlSeeAlso(ExCustomExitPointDefinition.class)
public class ExCustomExitPointDefinitions {
    private ArrayList<ExCustomExitPointDefinition> customExitPointDefinitions=new ArrayList<ExCustomExitPointDefinition>();
    
    public ExCustomExitPointDefinitions(){}

    @XmlElement(name=AppExportS.CUSTOM_EXIT_POINT_DEFINITION)
    public ArrayList<ExCustomExitPointDefinition> getCustomExitPointDefinitions() {
        return customExitPointDefinitions;
    }

    public void setCustomExitPointDefinitions(ArrayList<ExCustomExitPointDefinition> customExitPointDefinitions) {
        this.customExitPointDefinitions = customExitPointDefinitions;
    }
    
    public String whatIsDifferent(ExCustomExitPointDefinitions obj){
        
        if(this.equals(obj) ) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.CUSTOM_EXIT_POINT_DEFINITIONS);
        
        for(ExCustomExitPointDefinition value:customExitPointDefinitions){
            boolean fnd=false;
            for(ExCustomExitPointDefinition _value:obj.getCustomExitPointDefinitions()){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            if(!fnd){                
                bud.append(AppExportS.L2).append(AppExportS.SRC).append(AppExportS.VE).append(value);   
            }
        }
        
        for(ExCustomExitPointDefinition value:obj.getCustomExitPointDefinitions()){
            boolean fnd=false;
            for(ExCustomExitPointDefinition _value:customExitPointDefinitions){
                if(value.getName().equals(_value.getName())){
                    fnd=true;
                }
            }
            if(!fnd){                
                bud.append(AppExportS.L2).append(AppExportS.DEST).append(AppExportS.VE).append(value);   
            }
        }
        
        return bud.toString();
    }
    
    @Override 
    public String toString(){
        StringBuilder bud =new StringBuilder();
        bud.append(AppExportS.L1_1).append(AppExportS.CUSTOM_EXIT_POINT_DEFINITIONS);
        for(ExCustomExitPointDefinition value: customExitPointDefinitions) bud.append(value);
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.customExitPointDefinitions != null ? this.customExitPointDefinitions.hashCode() : 0);
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
        final ExCustomExitPointDefinitions other = (ExCustomExitPointDefinitions) obj;
        if (this.customExitPointDefinitions != other.customExitPointDefinitions && (this.customExitPointDefinitions == null || !this.customExitPointDefinitions.equals(other.customExitPointDefinitions))) {
            return false;
        }
        return true;
    }
    

    
}
