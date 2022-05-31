package com.sgtesting.workshop.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerilizationDemo {

	public static void main(String[] args) {
		Employee obj=null;
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream("G:\\EXAMPLE\\Employee.ser");
			in=new ObjectInputStream(fin);
			obj=(Employee) in.readObject();
			
			obj.showFN();
			obj.showAge();
			obj.showDept();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
