package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.model.*;
import java.util.*;

public class Hdfc implements Rbi{

	Account ac = new Account();

	
	@Override
	public void createAccount() {
		
		ac.setBalance(2000.00);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========================================================");
		
		System.out.println("Enter Account Number : ");
		int act = sc.nextInt();
		ac.setAccNo(act);
		sc.nextLine();
		
		System.out.println("Enter Name : ");
		String nm = sc.nextLine();
		ac.setName(nm);
		
		System.out.println("Enter Mobile No : ");
		String mob = sc.next();
		ac.setMobNo(mob);
		
		System.out.println("Enter Adhar Number : ");
		String ad = sc.next();
		ac.setAdharNo(ad);
		
		System.out.println("Enter Gender (Male/Female) : ");
		String gen = sc.next();
		ac.setGender(gen);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		ac.setAge(age);
		
		System.out.println("========================================================");
	}

	@Override
	public void displayAllDetails() {
		
		System.out.println("========================================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		int accno = sc.nextInt();
		int accc = ac.getAccNo();
		
		if(accno == accc)
		{
			System.out.println("********Account Details*********");
			
			System.out.println("Your Accoutn Number is : "+ac.getAccNo());
			System.out.println("Your Name is : "+ac.getName());
			System.out.println("Your Mobile Number Is : "+ac.getMobNo());
			System.out.println("Your Adhar Number is : "+ac.getAdharNo());
			System.out.println("Your Gender is : "+ac.getGender());
			System.out.println("Your Age is : "+ac.getAge());
			System.out.println();
			
			System.out.println("Your Account Balance is : "+ac.getBalance());
		}
		else
		{
			System.out.println("Enter Proper Account Number");
		}
		
		System.out.println("========================================================");
	}

	@Override
	public void depositeMoney() {
		System.out.println("========================================================");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number : ");
		int acc = sc.nextInt();
	    int ori = ac.getAccNo();
	    
	    if(acc==ori)
	    {
			System.out.println("Current Balance : "+ac.getBalance());
			
			System.out.println("How Much Money you Want to Deposite : ");
			double money = sc.nextDouble();
			
			double mon = ac.getBalance();
			
			double add = money + mon;
			
			ac.setBalance(add);
			
			System.out.println("Deposited Successfully...!");
	    }
	    
	    else
	    {
	    	System.out.println("Invalid Account Number...!");
	    }
	
		System.out.println("========================================================");
	}

	@Override
	public void withrawal() throws CheckWithrawal
	{
		
		System.out.println("========================================================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number : ");
		int acc = sc.nextInt();
	    int ori = ac.getAccNo();
	    
	    if(acc==ori)
	    {
			System.out.println("Your Currrent Balance is : "+ac.getBalance());
			double bal = ac.getBalance();
			System.out.println("You can withrawal Upto : "+(bal-500));
			
			
			System.out.println("Enter Amount to Withrawal : ");
			double amt = sc.nextDouble();
			
			if(amt >= (bal-500))
			{
				throw new CheckWithrawal("You Cannot Withrawal this amount....!");
			}
			else
			{
				bal = bal - amt;
				
				ac.setBalance(bal);
				
				System.out.println("Withrawal Successfull....!");
			}
	    }
	    else
	    {
	    	System.out.println("Enter Valid Account Number");
	    }
		

		
		System.out.println("========================================================");
		
	}

	@Override
	public void balanceCheck() {
	
		System.out.println("========================================================");
		
		System.out.println("Current Balance : "+ac.getBalance());
		
		System.out.println("========================================================");
		
	}

}
