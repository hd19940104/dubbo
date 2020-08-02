package com.zixue;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubooxpRroducerApp {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-producer.xml");
		app.start();
		System.out.println("dobbx服务发布成功...");
		System.in.read();
	}

}
