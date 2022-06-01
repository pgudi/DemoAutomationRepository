package com.sgtesting.reflection5;

import java.lang.reflect.Method;

public class SampleDemo {
	public static void main(String[] args) {
		executeReflection();
	}
	
	private static void executeReflection()
	{
		Sample obj=new Sample();
		try
		{
			//Method is having String parameter
			Class strParam[]=new Class[1];
			strParam[0]=String.class;
			
			Method method=obj.getClass().getMethod("showStudentFN", strParam);
			method.invoke(obj, new String("Santosh"));
			
			//Method is having int parameter
			Class intParam[]=new Class[1];
			intParam[0]=Integer.TYPE;
			
			Method method1=obj.getClass().getMethod("displayAge", intParam);
			method1.invoke(obj, 19);
			
			//Method is having two String parameter
			Class strParam1[]=new Class[2];
			strParam1[0]=String.class;
			strParam1[1]=String.class;		
			
			Method method2=obj.getClass().getMethod("displayAddress", strParam1);
			method2.invoke(obj, new String("Bangalore"),new String("RPC Layout"));
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
