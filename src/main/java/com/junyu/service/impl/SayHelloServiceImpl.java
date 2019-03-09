package com.junyu.service.impl;

import com.junyu.service.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService{

	public String sayHello(String name) {
		return "hello--"+name;
	}

}
