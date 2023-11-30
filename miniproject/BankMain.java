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


