package com.custom;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

/**
 * 学习插件的initialized方法，在将要生成某张表的文件时回调
 */
public class InitializeCallbackPlugin extends PluginAdapter{

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        // 生成DAO文件的时候，修改文件名
        String javaType = introspectedTable.getMyBatis3JavaMapperType();
        introspectedTable.setMyBatis3JavaMapperType(javaType + "1");

        // 生成DAO的Provider文件的时候（Mybatis的一种较新的使用模式），修改文件名
        String sqlType = introspectedTable.getMyBatis3SqlMapNamespace();
        introspectedTable.setMyBatis3SqlProviderType(sqlType + 1);

        // 生成Mapper文件的时候，修改文件名
        String xmlFileName = introspectedTable.getMyBatis3XmlMapperFileName();
        introspectedTable.setMyBatis3XmlMapperFileName(
                xmlFileName.substring(0, xmlFileName.lastIndexOf(".xml")) + "1.xml");
    }
}
