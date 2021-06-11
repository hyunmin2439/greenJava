package com.green.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

// Properties : 파일
public class TestProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// database.properties - 설정 파일
		Properties prop = null;
		
		String path = TestProperties.class.getResource("database.properties").getPath();
		System.out.println(path); // /D:/greenjava/Prj15/bin/com/green/properties/database.properties
		
		prop = new Properties();
		path = URLDecoder.decode(path, "utf-8");
		prop.load(new FileReader( path ));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
		String password = prop.getProperty("password");
		System.out.println(password);
	}
}
