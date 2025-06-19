package com.flipkart;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { FlipkartMVCConfigurationClass.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String [] stringMapping= {"/"};
		return stringMapping;
	}

}
