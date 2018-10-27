package com.smart.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.smart.Car;

public class BeanFactoryTest 
{
	public static void main(String args[])
	{
		// 获取资源加载器
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// 获取配置资源
		Resource rs = resolver.getResource("classpath:com/smart/beanfactory/beans.xml");
		// 创建BeanFactory
		DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
		// 创建Bean 定义读取器
		XmlBeanDefinitionReader xmlRead = new XmlBeanDefinitionReader(bf);
		// 从bean 定义资源中读取加载bean 定义信息，初始化BeanFactory
		xmlRead.loadBeanDefinitions(rs);
		
		Car car = (Car) bf.getBean("car");
		
		car.introduce();
	}

}
