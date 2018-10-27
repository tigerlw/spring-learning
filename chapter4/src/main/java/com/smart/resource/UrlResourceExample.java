package com.smart.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class UrlResourceExample 
{
	public static void main(String args[]) throws Exception
	{
		URL url = new URL("http://www.baidu.com");
		URI uri = url.toURI();
		Resource rs = new UrlResource(uri);
		
		String fileName = rs.getDescription();
		
		System.out.println("fileName:"+fileName);
	}

}
