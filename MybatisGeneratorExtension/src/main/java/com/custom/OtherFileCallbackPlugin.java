package com.custom;


import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.exception.ShellException;

import java.beans.Visibility;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

/**
 * 学习如何生成其他文件，比如Service
 */
public class OtherFileCallbackPlugin extends PluginAdapter {

    // 扩展
    private String serviceTargetDir;

    @Override
    public boolean validate(List<String> warnings) {
        serviceTargetDir = properties.getProperty("targetProject");
        boolean valid = stringHasValue(serviceTargetDir);
        return valid;
    }

    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
        JavaFormatter javaFormatter = context.getJavaFormatter();
        List<GeneratedJavaFile> mapperJavaFiles = new ArrayList<GeneratedJavaFile>();

        Interface serviceInterface = new Interface(new FullyQualifiedJavaType("com.service.SysAreaService"));
        serviceInterface.setVisibility(JavaVisibility.PUBLIC);
        GeneratedJavaFile generatedServiceFile = new GeneratedJavaFile(serviceInterface, "src/main/java", javaFormatter);
        mapperJavaFiles.add(generatedServiceFile);

        TopLevelClass otherServiceImpl = new TopLevelClass(new FullyQualifiedJavaType("com.service.SysAreaServiceImpl"));
        otherServiceImpl.setVisibility(JavaVisibility.PUBLIC);
        GeneratedJavaFile generatedServiceImplFile = new GeneratedJavaFile(otherServiceImpl, "src/main/java", javaFormatter);
        mapperJavaFiles.add(generatedServiceImplFile);

        return mapperJavaFiles;
    }
}
