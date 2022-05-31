package com.sgtesting.workshop.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		writeContent();

	}
	
	static void writeContent()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("E:/EXAMPLE/Test/Welcome3.txt",true));
			bw.write("Java is a progamming language");
			bw.newLine();
			bw.write("Java is used to develop applications");
			bw.newLine();
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
