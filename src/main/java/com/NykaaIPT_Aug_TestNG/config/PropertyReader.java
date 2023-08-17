package com.NykaaIPT_Aug_TestNG.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	static FileInputStream fis;
	
	public static Properties propReader() {
		File f = new File("D:\\Avadi\\workspace1\\NykaaIPT_Aug_TestNG\\src\\main\\java\\com\\NykaaIPT_Aug_TestNG\\config\\nykaa.properties");
		
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties properties = new Properties();
		
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
}
