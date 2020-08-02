package com.zixue;


import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zixue.service.UserService;




public class DubboxConsumerTest {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		app.start();
		UserService userService=(UserService) app.getBean("userService");
		String result=userService.getUser(1);
		System.out.println(result);
		System.in.read();
	}

}
