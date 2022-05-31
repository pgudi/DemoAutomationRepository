package com.sgtesting.workshop.javaclasses;

class Student
{
	String BranchName;
	int RollNo;
	
	Student(String BN)
	{
		BranchName=BN;
		System.out.println(BranchName);
	}
	
	Student(int RollNo)
	{
		this.RollNo=RollNo;
		System.out.println(this.RollNo);
	}
	
	Student(String BN,int RollNo)
	{
		// valid constructor
	}
	
	Student(int RollNo,String Branch)
	{
		//Valid Constructor
	}
}
public class ConstructorOverLoading {
	public static void main(String[] args) {
		
		Student obj=new Student(44);
	}

}

