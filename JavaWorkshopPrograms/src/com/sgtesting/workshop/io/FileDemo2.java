package com.sgtesting.workshop.io;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
	//	createFile1();
	//	renameFile1();
	//	deleteFile1();
		fileCollections();
	}
	
	static void createFile1()
	{
		try
		{
			File f1=new File("E:\\Example\\Test\\Sample.txt");
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void renameFile1()
	{
		File f1=new File("E:\\Example\\Test\\Sample.txt");
		File f2=new File("E:\\Example\\Test\\Sample-New.txt");
		f1.renameTo(f2);
	}
	
	static void deleteFile1()
	{
		File f2=new File("E:\\Example\\Test\\Sample-New.txt");
		f2.delete();
	}
	
	static void fileCollections()
	{
		try
		{
			File f1=new File("E:\\Example\\Test");
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if (f2[i].getPath().endsWith("txt"))
				{
					System.out.println(f2[i].getPath());
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
