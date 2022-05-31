package com.sgtesting.workshop.interfacedemo;

interface University
{
	 void displayUniversityName(String name);
}

interface EnggCollege
{
	void showBranches(String branches[]);
}

class SLNEngg implements University,EnggCollege
{
	public void displayUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	
	public void showBranches(String branches[])
	{
		System.out.println("Branch Names :");
		for (String s:branches)
		{
			System.out.println(s);
		}
	}
	void showCity(String city)
	{
		System.out.println("The City Name :"+city);
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		SLNEngg sln=new SLNEngg();
		sln.displayUniversityName("VTU University");
		sln.showCity("Belguam"); 
		String s[]= {"CSE","Mech"};
		sln.showBranches(s);

	}

}

