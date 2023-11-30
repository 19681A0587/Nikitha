package miniproject;

public class Bank {
	private String name;
	private int accno;
	private int amount;
	private String address;
	public Bank() {

		
	}
	
	public Bank(String name, int accno, int amount, String address) {
		super();
		this.name = name;
		this.accno = accno;
		this.amount = amount;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", accno=" + accno + ", amount=" + amount + ", address=" + address + "]";
	}
	

}



package miniproject;

public  class SBIBank extends Bank {
	int dp;
	int wd;
	
public  SBIBank()
{
	
}

public SBIBank(String name, int accno, int amount, String address, int dp, int wd) {
	super(name, accno, amount, address);
	this.dp = dp;
	this.wd = wd;
}

public int getDp() {
	return dp;
}

public void setDp(int dp) {
	this.dp = dp;
}
public int getWd() {
	return wd;
}

public void setWd(int wd) {
	this.wd = wd;
}
public int deposit() {
	dp = this.getAmount()+3000;
	return dp;
}
public int withdraw()
{
	wd = this.dp-2000;
	return wd;
}

@Override
public String toString() {
	return super.toString()+ "SBIBank [dp=" + dp + ", wd=" + wd + "]";
}
	
}






package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	static Scanner sc = new Scanner(System.in);
	ArrayList<SBIBank>SBIBankList=new ArrayList<SBIBank>();
	BankApp()
	{
		SBIBankList.add(new SBIBank("nikitha",123,30000,"jangaon",3000,2000));
		SBIBankList.add(new SBIBank("vinitha",124,40000,"hydrabab",2000,3000));
		SBIBankList.add(new SBIBank("bharathi", 125,50000,"warangal",4000,5000));
	}
	public void viewAllSBIBankInfo()
	{
		System.out.println("========================================================================================");
		if(SBIBankList.size()==0)
		{
			System.out.println("No record found");
		}
		for(SBIBank b:SBIBankList)
		{
			System.out.println(" name:"+b.getName()+"\t accno:"+b.getAccno()+"\t amount:"+b.getAmount()+"\t address:"+b.getAddress()+"\t dp:"+b.getDp()+"\t wd:"+b.getWd());
		}
		System.out.println("====================================================================================");
	}
	public void addSBIBankInfo()
	{
		System.out.println("Enter  name:");
		String name=sc.next();
		System.out.println("Enter accno:");
		int accno=sc.nextInt();
		System.out.println("Enter amount:");
		int amount=sc.nextInt();
		System.out.println("Enter the address:");
		String address=sc.next();
		System.out.println("Enter diposit amount:");
		int diposit=sc.nextInt();
		System.out.println("Enter withdraw amount");
		int withdraw=sc.nextInt();
		SBIBank b=new SBIBank(name,accno,amount,address,diposit,withdraw);
		SBIBankList.add(b);
	}
	public void viewSBIBankInfoByaccno()
	{
		System.out.println("Enter SBIBank accno:");
		int accno=sc.nextInt();
		int flag=0;
		System.out.println("=======================================================================================");
		for(SBIBank b:SBIBankList)
		{
			if(accno==b.getAccno())
			{flag=1;
			System.out.println("name:"+b.getName()+"\t amount:"+b.getAmount()+"\t address:"+b.getAddress()+"\t dp:"+b.getDp()+"\t wd:"+b.getWd());
			
			}
		}
		if(flag==0)
		System.out.println("SBIBank accno does not exit!!");
		System.out.println("=============================================================================================");
	}
	public void updateSBIBankByaccno()
	{
		System.out.println("Enter accno:");
		int accno=sc.nextInt();
		int flag=0 , index = 0;
		SBIBank b = null;
		for(SBIBank b1:SBIBankList)
		{
			if(b1.getAccno()==accno)
			{
				flag=1;
				index = SBIBankList.indexOf(b1);
				b=b1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Enter name:");
			String name =sc.next();
			System.out.println("Enter amount:");
			int amount = sc.nextInt();
			System.out.println("Enter the address: ");
			String address = sc.next();
			System.out.println("Enter deposit amount");
			int depoist = sc.nextInt();
			System.out.println("Enter withdraw amount");
			int withdraw = sc.nextInt();
			b.setName(name);
			b.setAmount(amount);
			b.setAddress(address);
			b.setDp(depoist);
			b.setWd(withdraw);
			SBIBankList.set(index, b);
			System.out.println("================================================================================================");
			System.out.println("SBIBank Details updated");
		}
		else
		{
			System.out.println("accno does not exist!!");
		}
		System.out.println("====================================================================================================");
	}
	public void deleteAllSBIBankInfo()
	{
		System.out.println("==================================================================================================");
		if(SBIBankList.size()>0) {
			SBIBankList.clear();
			System.out.println("Aii records deleted successfully!!");
		}
		else
		{
			System.out.println("No recordavailable");
			
		}
		System.out.println("=========================================================================================================");
	}
	public void deleteSBIBankByaccno()
	{
		System.out.println("Enter accno:");
		int accno=sc.nextInt();
		int index=0,flag=0;
		SBIBank b=null;
		for(SBIBank b1:SBIBankList)
		{
			if(accno==b1.getAccno())
			{
				flag=1;
				index=SBIBankList.indexOf(b1);
				b=b1;
				//System.out.println(index);
				//System.out.println(b1);
				break;
			}
		}
		System.out.println("======================================================================================================");
		if(flag==0)
		{
			System.out.println("SBIBank accno does not exist!!");
		}
		else
		{
			SBIBankList.remove(b);
			System.out.println("SBIBank record deleted successfully!!");
		}
		System.out.println("======================================================================================================");
	}
	

}










package miniproject;

import java.util.Scanner;

public class BankMain {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=============================================================================");
		System.out.println("=============Simple Bank Application==========================================");
		System.out.println("===============================================================================");
		String ch;
		BankApp app=new BankApp();
		do
		{
			System.out.println("\t\t 1)View SBIBank information\r\n "
					+" \t\t2)insert Sbibank info by Accno.\r\n" 
						+"\t\t 3)View all SBIBank information By Accno.\r\n"
					      +"\t\t 4)update SBIBank information By Accno.\r\n"
						   +"\t\t 5)delete SBIBank information By Accno.\r\n"
					        +"\t\t 6)delete all SBIBank information.");
			System.out.println("==========================================================================");
			System.out.println("Ente your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:app.viewAllSBIBankInfo();
			break;
			case 2:app.addSBIBankInfo();
			break;
			case 3:app.viewSBIBankInfoByaccno();
			break;
			case 4:app.updateSBIBankByaccno();
			break;
			case 5:app.deleteSBIBankByaccno();
			break;
			case 6:app.deleteSBIBankByaccno();
			break;
			default:System.out.println("Wrong choice!!");
			}
			System.out.println("Do you want to continue?(yes/no");
			ch=sc.next();
			}while(ch.equals("yes")||ch.equals("y"));
		   System.out.println("===============================================================================");
		   System.out.println("Bye.....");
		   System.out.println("==============================================================================");
		
		}
		

	}
















