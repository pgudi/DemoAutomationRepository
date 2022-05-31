package com.sgtesting.workshop.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Employee obj=new Employee("Richard",22,"Accounting");
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream("G:\\EXAMPLE\\Employee.ser");
			out=new ObjectOutputStream(fout);
			
			out.writeObject(obj);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
