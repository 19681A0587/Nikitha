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
