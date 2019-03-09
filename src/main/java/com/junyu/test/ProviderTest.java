package com.junyu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {
	  public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                new String[] {"application-context-provider.xml"});
	        context.start();
	        // press any key to exit
	        System.in.read();
	    }
}
