package com.zixue;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProducer {
	public static void main(String[] args) throws IOException {
		System.out.println("开始启动读取配置文件。。。");
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("provider.xml");
//		ClassPathXmlApplicationContext applicationContext2 = 
//				new ClassPathXmlApplicationContext("provider2.xml");
//		ClassPathXmlApplicationContext applicationContext3 = 
//				new ClassPathXmlApplicationContext("provider3.xml");
		applicationContext.start();
//		applicationContext2.start();
//		applicationContext3.start();
		System.out.println("服务发布成功");
		System.in.read();//让程序阻塞
	}
}
