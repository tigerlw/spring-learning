package com.smart.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.Car;

public class ClassPathXmlApplcationExample 
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/smart/*.xml");
		
		Car car1 = (Car) context.getBean("car1");
		Car car2 = (Car) context.getBean("car2");
		
		car1.introduce();
		car2.introduce();
	}

}
