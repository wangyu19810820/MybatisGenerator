package com.custom;

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

//    @Override
//    public void initialized(IntrospectedTable introspectedTable) {
////        String javaType = introspectedTable.getMyBatis3JavaMapperType();
////        introspectedTable.setMyBatis3JavaMapperType(javaType + "1");
//
//        introspectedTable.setDAOInterfaceType("com.base.GenericDao");
//    }

    // 生成Dao文件前的回调，添加父接口
    public boolean clientGenerated(Interface interfaze,
                                   TopLevelClass topLevelClass,
                                   IntrospectedTable introspectedTable) {
        // 生成Dao的父接口
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("GenericDao<" + introspectedTable.getBaseRecordType()  + ", " + introspectedTable.getBaseRecordType() + "Criteria>");
        FullyQualifiedJavaType imp = new FullyQualifiedJavaType("com.base.GenericDao");
        interfaze.addSuperInterface(fqjt);  // 添加 extends BaseDao<user>
        interfaze.addImportedType(imp);     // 添加import common.BaseDao;
        interfaze.getMethods().clear();

        return true;
    }
}
