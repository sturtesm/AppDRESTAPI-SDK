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
 * L3
                      
                   
                    <node-match-criteria>
                        <type>ANY</type>
                        <node-meta-info-match-criteria/>
                        <vm-sys-properties/>
                        <env-properties/>
                    </node-match-criteria>
 */
@XmlSeeAlso({ExHRNodeTypes.class,ExHRNodes.class,ExHRNameValueCriteria.class})
public class ExNodeMatchCriteria {
    private String type;
    private String matchType,matchPattern;
    private boolean inverse;
    private ExHRNameValueCriteria nodeMetaInfoMatchCriteria;
    private ExHRNameValueCriteria vmSysProperties;
    private ExHRNameValueCriteria envProperties;
    private ExHRNodeTypes nodeTypes;
    private ExHRNodes nodes;
    
    
    public ExNodeMatchCriteria(){}

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.NODE_META_INFO_MATCH_CRITERIA)
    public ExHRNameValueCriteria getNodeMetaInfoMatchCriteria() {
        return nodeMetaInfoMatchCriteria;
    }

    public void setNodeMetaInfoMatchCriteria(ExHRNameValueCriteria nodeMetaInfoMatchCriteria) {
        this.nodeMetaInfoMatchCriteria = nodeMetaInfoMatchCriteria;
    }

    @XmlElement(name=AppExportS.VM_SYS_PROPERTIES)
    public ExHRNameValueCriteria getVmSysProperties() {
        return vmSysProperties;
    }

    public void setVmSysProperties(ExHRNameValueCriteria vmSysProperties) {
        this.vmSysProperties = vmSysProperties;
    }

    @XmlElement(name=AppExportS.ENV_PROPERTIES)
    public ExHRNameValueCriteria getEnvProperties() {
        return envProperties;
    }

    public void setEnvProperties(ExHRNameValueCriteria envProperties) {
        this.envProperties = envProperties;
    }

    @XmlElement(name=AppExportS.NODE_TYPES)
    public ExHRNodeTypes getNodeTypes() {
        return nodeTypes;
    }

    public void setNodeTypes(ExHRNodeTypes nodeTypes) {
        this.nodeTypes = nodeTypes;
    }

    @XmlElement(name=AppExportS.NODES)
    public ExHRNodes getNodes() {
        return nodes;
    }

    public void setNodes(ExHRNodes nodes) {
        this.nodes = nodes;
    }

    @XmlElement(name=AppExportS.MATCH_TYPE)
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @XmlElement(name=AppExportS.MATCH_PATTERN)
    public String getMatchPattern() {
        return matchPattern;
    }

    public void setMatchPattern(String matchPattern) {
        this.matchPattern = matchPattern;
    }

    @XmlElement(name=AppExportS.INVERSE)
    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }
    
    
    
    
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L3_1).append(AppExportS.NODE_MATCH_CRITERIA);
        bud.append(AppExportS.L4).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        if(matchType != null){
            bud.append(AppExportS.L4).append(AppExportS.MATCH_TYPE).append(AppExportS.VE).append(matchType);
            bud.append(AppExportS.L4).append(AppExportS.MATCH_PATTERN).append(AppExportS.VE).append(matchPattern);
            bud.append(AppExportS.L4).append(AppExportS.INVERSE).append(AppExportS.VE).append(inverse);
        }
        if(nodeTypes != null)bud.append(nodeTypes);
        if(nodes != null) bud.append(nodes);
        if(nodeMetaInfoMatchCriteria != null){ bud.append(AppExportS.L3).append(AppExportS.NODE_META_INFO_MATCH_CRITERIA);bud.append(nodeMetaInfoMatchCriteria);}
        if(vmSysProperties != null){ bud.append(AppExportS.L3).append(AppExportS.VM_SYS_PROPERTIES);bud.append(vmSysProperties);}
        if(envProperties != null){ bud.append(AppExportS.L3).append(AppExportS.ENV_PROPERTIES);bud.append(envProperties);}

        return bud.toString();
    }
}
