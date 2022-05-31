package com.sgtesting.workshop.methods;

class Bank
{
	String bankname;
	private int accountNo;
	
	void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	
	int getAccountNo()
	{
		return accountNo;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Bank hdfc=new Bank();
		hdfc.bankname="HDFC Bank";
		System.out.println(hdfc.bankname);
		
		hdfc.setAccountNo(100000011);
		System.out.println(hdfc.getAccountNo());

	}

}
