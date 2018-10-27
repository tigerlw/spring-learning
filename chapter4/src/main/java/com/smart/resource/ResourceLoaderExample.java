package com.smart.resource;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class ResourceLoaderExample 
{
	public static void main(String args[]) throws Exception
	{
		// 获取资源加载器
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// 获取com/smart/路径下的所有xml资源, ** 代表多层路径
		Resource [] resources = resolver.getResources("classpath*:com/smart/**/*.xml");
		
		for(Resource rs : resources)
		{
			System.out.println(rs.getDescription());
		}
		
		// 获取http 上的资源
		resources = resolver.getResources("http://www.baidu.com");
		
		for(Resource rs : resources)
		{
			System.out.println(rs.getDescription());
			
			System.out.println(IOUtils.toString(rs.getInputStream(), "utf-8"));
		}
		
	}

}
