package com.sgtesting.tests;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class HTMLFileDemo {

	public static void main(String[] args) {
		createHTMLFile();

	}
	
	private static void createHTMLFile()
	{
		BufferedWriter bw=null;
		try
		{
			String path=System.getProperty("user.dir");
			bw=new BufferedWriter(new FileWriter(path+"\\Report\\SampleReport.html"));
			bw.write("<html>");
			bw.write("<head><title>Test Web Page</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>Sample Web Page</h1>");
			bw.write("<p>Java is a programming language, Java is used for developing Application....</p>");
			bw.write("<p>Python is a Scripting language, Java is used for developing Applications....</p>");
			bw.write("</body>");
			bw.write("</html>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
