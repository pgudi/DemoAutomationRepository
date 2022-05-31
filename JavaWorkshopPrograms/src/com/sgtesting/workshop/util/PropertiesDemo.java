package com.sgtesting.workshop.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
	//	writeContent();
		readContent();

	}
	
	static void writeContent()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("G:\\EXAMPLE\\Test.properties");
			prop=new Properties();
			
			prop.setProperty("username", "demoUser1");
			prop.setProperty("pwd", "Welcome123");
			prop.setProperty("domain", "QA Testing");
			prop.store(fout, "It is for Testing");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				prop.clear();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	
	static void readContent()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream("E:\\\\EXAMPLE\\\\Test.properties");
			prop=new Properties();
			
			prop.load(fin);
			String v1=prop.getProperty("username");
			System.out.println(v1);
			String v2=prop.getProperty("pwd");
			System.out.println(v2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
