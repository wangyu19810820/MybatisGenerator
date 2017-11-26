package com.custom;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;
import java.util.Properties;

public class ModelCallbackPlugin extends PluginAdapter {

    private String baseClassName;
    private String customFieldName;
    private String customMethodName;

    // 是否需要执行该插件，true需要执行该插件，false不执行该插件
    public boolean validate(List<String> warnings) {
        return true;
    }

    // 传递设置属性，属性在mybatis-generator.xml文件中设置
    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        baseClassName = properties.getProperty("baseClassName");
        customFieldName = properties.getProperty("customFieldName");
        customMethodName = properties.getProperty("customMethodName");
    }

    // model类生成的时候的回调，返回true则继续执行插件的其它功能
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        FullyQualifiedJavaType baseClass = new FullyQualifiedJavaType(baseClassName);
        topLevelClass.addImportedType(baseClass);
        topLevelClass.setSuperClass(baseClass);

        Field field = new Field();
        field.setType(new FullyQualifiedJavaType("java.lang.String"));
        field.setName(customFieldName);
        field.setVisibility(JavaVisibility.PRIVATE);
        context.getCommentGenerator().addFieldComment(field, introspectedTable);
        topLevelClass.addField(field);

        Method method = new Method();
        method.setName(customMethodName);
        method.addParameter(new Parameter(new FullyQualifiedJavaType("java.lang.String"), "newValue"));
        method.setReturnType(new FullyQualifiedJavaType("java.lang.String"));
        method.addBodyLine("return " + customFieldName + " + newValue;");
        method.setVisibility(JavaVisibility.PUBLIC);
        context.getCommentGenerator().addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);

        return true;
    }
}
