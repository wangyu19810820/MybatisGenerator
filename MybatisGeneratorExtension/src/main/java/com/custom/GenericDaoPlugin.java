package com.custom;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * 自定义Dao的父接口，利用MBG的插件，具备实用性
 */
public class GenericDaoPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    // 生成Dao文件前的回调，添加父接口
    public boolean clientGenerated(Interface interfaze,
                                   TopLevelClass topLevelClass,
                                   IntrospectedTable introspectedTable) {
        String modelType = introspectedTable.getBaseRecordType();
        String exampleType = introspectedTable.getExampleType();
        List<IntrospectedColumn> keyColumn = introspectedTable.getPrimaryKeyColumns();
        String pkType = "";
        if (keyColumn.size() > 1) {
            pkType = introspectedTable.getPrimaryKeyType();
        } else if (keyColumn.size() == 1) {
            pkType = keyColumn.get(0).getFullyQualifiedJavaType().getShortName();
        }

        // 生成Dao的父接口
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("GenericDao<" + modelType  + ", " + exampleType + "," + pkType + ">");
        FullyQualifiedJavaType imp = new FullyQualifiedJavaType("com.base.GenericDao");
        interfaze.addSuperInterface(fqjt);  // 添加 extends BaseDao<user>
        interfaze.addImportedType(imp);     // 添加import common.BaseDao;

        // dao不生成方法
        interfaze.getMethods().clear();

        return true;
    }
}
