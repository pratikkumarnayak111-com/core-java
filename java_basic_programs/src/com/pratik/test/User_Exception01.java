package com.pratik.test;

import java.util.Scanner;

class OutOfBalanceException extends Exception{
	public OutOfBalanceException() {
		super();
	}
	public OutOfBalanceException(String errMsg) {
		super(errMsg);
	}
}

class Account{
	
	static int AccId;
	static String AccName;
	static double AccAmount;
	
	static void add(int AccId,String AccName,double AccAmount)throws OutOfBalanceException {
		
		if(AccAmount<1000) {
			throw new OutOfBalanceException("You can't perform Tranction");
			
		}else {
			System.out.println("Account added SuccessFully !");
			System.out.println("Account Id :"+AccId);
			System.out.println("Account Name :"+AccName);
			System.out.println("Account No:"+AccAmount);
		}
	}
}

public class User_Exception01 {

	static Scanner scn=new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
		System.out.print("Enter Account Id:");
		int AccId=scn.nextInt();
		scn.nextLine(); //clear buffer
		
		System.out.print("Enter Account Name:");
		String AccName=scn.nextLine();
		
		System.out.print("Enter Account Amount:");
		double AccAmount=scn.nextLong();
		
		Account.add(AccId, AccName, AccAmount);
		
		}catch(OutOfBalanceException e) {
			System.out.println("Error :"+e.getMessage());
	    }
	}
}
