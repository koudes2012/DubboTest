package com.junyu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.junyu.service.SayHelloService;

public class ConsumerTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"application-context-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        SayHelloService sayHelloService = (SayHelloService) context.getBean("sayHello");
        // execute remote invocation
        String hello = sayHelloService.sayHello("junyu");
        // show the result
        System.out.println(hello);
    }
}
