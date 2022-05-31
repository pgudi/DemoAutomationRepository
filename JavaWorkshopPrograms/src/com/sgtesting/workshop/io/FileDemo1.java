package com.sgtesting.workshop.io;
import java.io.File;
public class FileDemo1 {
	public static void main(String[] args) {
		
		File f1=new File("G:\\Example\\Test\\Welcome.txt");
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getPath());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());

	}

}
