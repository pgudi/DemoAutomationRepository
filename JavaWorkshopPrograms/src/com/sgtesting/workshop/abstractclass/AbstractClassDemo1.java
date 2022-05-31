package com.sgtesting.workshop.abstractclass;

abstract class EnggCollege
{
	abstract void showEnggCollegeName(String name);
	abstract void showAddress(String address);
	void showBranches(String branches[])
	{
		System.out.println("Branch Names :");
		for (String s: branches)
		{
			System.out.println(s);
		}
	}
}

class SLNEngg extends EnggCollege
{
	void showEnggCollegeName(String name)
	{
		System.out.println("College Name :"+name);
	}
	void showAddress(String address)
	{
		System.out.println("College Address:"+address);
	}
	
	void showCityName(String city)
	{
		System.out.println("City Name in which Collee Exists :"+city);
	}
	
}

public class AbstractClassDemo1 {
	public static void main(String[] args) {
		SLNEngg sln=new SLNEngg();
		sln.showEnggCollegeName("SLN Engg College");
		sln.showAddress("7th Main 5th Cross RPC Layout");
		sln.showCityName("Bangalore");
		
		String s[]= {"CSE","CIVIL","Mech","EEE"};
		sln.showBranches(s);

	}

}
