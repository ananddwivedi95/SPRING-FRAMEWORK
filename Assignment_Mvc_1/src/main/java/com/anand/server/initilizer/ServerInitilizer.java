package com.anand.server.initilizer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServerInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class []nclass= { ServerConfiguration.class };
		return nclass;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String []mapString= {"/"};
		return mapString;
	}

}
