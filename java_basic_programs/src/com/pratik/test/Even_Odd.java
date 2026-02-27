package com.pratik.test;

import java.util.Scanner;

public class Even_Odd {
	static Scanner scn=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Enter Number");
		int i1=scn.nextInt();
		
		if(i1 % 2==0) {
			
			System.out.println(i1+" Even Number");
		}else {
			System.out.println(i1+" Odd Number");
			break;
		}
		}
	}

}
