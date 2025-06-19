package com.swiggy.initilizer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UserInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class []nclass= { UserConfig.class };
		return nclass;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String []mapString= { "/" };
		return mapString;
	}

}
