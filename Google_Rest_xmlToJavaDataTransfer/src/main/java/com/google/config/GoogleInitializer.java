package com.google.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoogleInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class<?>[] classes ={GoogleConfig.class};
        return classes;
    }

    @Override
    protected String[] getServletMappings() {
        String[] mappings={"/"};
        return mappings;
    }
}
