package com.zixue;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zixue.service.UserService;

public class TestConsumer {
	public static void main(String[] args) throws IOException {
		System.out.println("�����߿�ʼ��������ʼ��ȡ�����ļ�������");
		
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("consumer.xml");
		applicationContext.start();
		String name = "" ;
		try {
			UserService userService = (UserService) applicationContext.getBean("userService");
			
			name = userService.getUserId(2);
			
		} catch (BeansException e) {
			System.out.println(e);
			name="��ȡ��������";
		}
		System.out.println(name);
		System.in.read();
	}
}
