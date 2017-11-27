package com.custom;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

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

    public boolean clientGenerated(Interface interfaze,
                                   TopLevelClass topLevelClass,
                                   IntrospectedTable introspectedTable) {

        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("GenericDao<" + introspectedTable.getBaseRecordType()  + ", " + introspectedTable.getBaseRecordType() + "Criteria>");
        FullyQualifiedJavaType imp = new FullyQualifiedJavaType("com.base.GenericDao");
        interfaze.addSuperInterface(fqjt);// 添加 extends BaseDao<user>
        interfaze.addImportedType(imp);// 添加import common.BaseDao;
        interfaze.getMethods().clear();

        return true;
    }
}
