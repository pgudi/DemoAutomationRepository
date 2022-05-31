package com.sgtesting.workshop.io;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
	//	createDir();
	//	nestedDir();
	//	renameDir();
	//	deleteDir();
		folderCollections();
	}
	
	static void createDir()
	{
		File f1=new File("E:\\Example\\Test\\Demo");
		f1.mkdir();
	}
	
	static void nestedDir()
	{
		File f1=new File("E:\\Example\\Test\\D1\\D2\\D3\\D4\\D5");
		f1.mkdirs();
	}
	
	static void renameDir()
	{
		File f1=new File("E:\\Example\\Test\\Demo");
		File f2=new File("E:\\Example\\Test\\Demo-New");
		f1.renameTo(f2);
	}
	
	static void deleteDir()
	{
		File f2=new File("E:\\Example\\Test\\Demo-New");
		f2.deleteOnExit();
	}
	
	static void folderCollections()
	{
		try
		{
			File f2=new File("E:\\Example\\Test");
			File f1[]=f2.listFiles();
			for(int i=0;i<f1.length;i++)
			{
				if(f1[i].isDirectory())
				{
					System.out.println(f1[i].getPath());
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
