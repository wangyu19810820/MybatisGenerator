package com.custom;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

public class InitializeCallbackPlugin extends PluginAdapter{

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        String javaType = introspectedTable.getMyBatis3JavaMapperType();
        introspectedTable.setMyBatis3JavaMapperType(javaType + "1");

        String sqlType = introspectedTable.getMyBatis3SqlMapNamespace();
        introspectedTable.setMyBatis3SqlProviderType(sqlType + 1);

        String xmlFileName = introspectedTable.getMyBatis3XmlMapperFileName();
        introspectedTable.setMyBatis3XmlMapperFileName(
                xmlFileName.substring(0, xmlFileName.lastIndexOf(".xml")) + "1.xml");
    }
}
