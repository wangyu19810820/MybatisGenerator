package com.custom;

import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.AbstractJavaMapperMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.InsertMethodGenerator;

/**
 * 学习MBG生成Dao，自定义生成方式。
 * 因为大多数功能都可以通过编写MBG插件的方式来实现，没有深入学习
 */
public class CustomJavaMapperGenerator extends JavaMapperGenerator {

    protected void addCountByExampleMethod(Interface interfaze) {

    }

    protected void addInsertMethod(Interface interfaze) {

    }
}
