package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.serviceImpl.*;
import java.util.*;


public class Test {

	public static void main(String []args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================================================");
		System.out.println("                  -Choose Your Bank-                    ");
		System.out.println("                  1.State Bank Of India                 ");
		System.out.println("                  2.Bank Of India                       ");
		System.out.println("                  3.HDFC Bank                           ");
		System.out.println("========================================================");
		
		System.out.println("Choose Bank : ");
		int chbk = sc.nextInt();
		
		if(chbk==1)
		{
			Rbi bk = new Sbi();
			char ca;
			
			do
			{
				System.out.println("========================================================");
				System.out.println("                 -Welcome TO SBI Bank-                  ");
				System.out.println("                   1.Create Account                     ");
				System.out.println("                   2.Check Account Details              ");
				System.out.println("                   3.Deposite Money                     ");
				System.out.println("                   4.Withrawal Money                    ");
				System.out.println("                   5.Check Balance                      ");
				System.out.println("========================================================");
				
				
				System.out.println("Enter Which Operation you want to perform : ");
				int ch = sc.nextInt();
			
				if(ch==1)
				{
					bk.createAccount();
				}
				else if(ch==2)
				{
					bk.displayAllDetails();
				}
				else if(ch==3)
				{
					bk.depositeMoney();
				}
				else if(ch==4)
				{
					try
					{
						bk.withrawal();
					}
					catch(CheckWithrawal c)
					{
						System.out.println(c.getMessage());
					}
				}
				else if(ch==5)
				{
					bk.balanceCheck();
				}
				
				System.out.println("Enter 'y' to Continue on 'n' to close : ");
				ca = sc.next().charAt(0);
			}
			while(ca != 'n');

		}
		else if(chbk==2)
		{
			Rbi bk = new Boi();
			char ca;
			
			do
			{
				System.out.println("========================================================");
				System.out.println("                 -Welcome TO BOI Bank-                  ");
				System.out.println("                   1.Create Account                     ");
				System.out.println("                   2.Check Account Details              ");
				System.out.println("                   3.Deposite Money                     ");
				System.out.println("                   4.Withrawal Money                    ");
				System.out.println("                   5.Check Balance                      ");
				System.out.println("========================================================");
				
				
				System.out.println("Enter Which Operation you want to perform : ");
				int ch = sc.nextInt();
			
				if(ch==1)
				{
					bk.createAccount();
				}
				else if(ch==2)
				{
					bk.displayAllDetails();
				}
				else if(ch==3)
				{
					bk.depositeMoney();
				}
				else if(ch==4)
				{
					try
					{
						bk.withrawal();
					}
					catch(CheckWithrawal c)
					{
						System.out.println(c.getMessage());
					}
				}
				else if(ch==5)
				{
					bk.balanceCheck();
				}
				
				System.out.println("Enter 'y' to Continue on 'n' to close : ");
				ca = sc.next().charAt(0);
			}
			while(ca != 'n');

		}
		else if(chbk==3)
		{
			Rbi bk = new Hdfc();
			char ca;
			
			do
			{
				System.out.println("========================================================");
				System.out.println("                 -Welcome TO HDFC Bank-                 ");
				System.out.println("                   1.Create Account                     ");
				System.out.println("                   2.Check Account Details              ");
				System.out.println("                   3.Deposite Money                     ");
				System.out.println("                   4.Withrawal Money                    ");
				System.out.println("                   5.Check Balance                      ");
				System.out.println("========================================================");
				
				
				System.out.println("Enter Which Operation you want to perform : ");
				int ch = sc.nextInt();
			
				if(ch==1)
				{
					bk.createAccount();
				}
				else if(ch==2)
				{
					bk.displayAllDetails();
				}
				else if(ch==3)
				{
					bk.depositeMoney();
				}
				else if(ch==4)
				{
					try
					{
						bk.withrawal();
					}
					catch(CheckWithrawal c)
					{
						System.out.println(c.getMessage());
					}
				}
				else if(ch==5)
				{
					bk.balanceCheck();
				}
				
				System.out.println("Enter 'y' to Continue on 'n' to close : ");
				ca = sc.next().charAt(0);
			}
			while(ca != 'n');

		}
		
		else
		{
			System.err.println("Invalid Bank....!");
		}
		
	}
}
