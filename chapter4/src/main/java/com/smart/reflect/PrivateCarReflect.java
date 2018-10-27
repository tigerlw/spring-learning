package com.smart.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect 
{
	public static void main(String args[]) throws Exception
	{
		// 获取ClassLoader
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		
		// 实例化 Class 对象
		Class clazz = classLoader.loadClass("com.smart.reflect.PrivateCar");
		
		// 创建PrivateCar 对象
		PrivateCar pCar = (PrivateCar) clazz.newInstance();
		
		// 获取属性对象
		Field colorFld = clazz.getDeclaredField("color");
		// 修改访问权限
		colorFld.setAccessible(true);
		// 属性值设置
		colorFld.set(pCar, "red");
		// 获取方法对象
		Method driveMtd = clazz.getDeclaredMethod("drive", null);
		// 修改访问权限
		driveMtd.setAccessible(true);
		// 调用方法
		driveMtd.invoke(pCar, null);
	}

}
