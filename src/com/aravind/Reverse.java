package com.aravind;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		int a,b;
		int c =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		a = sc.nextInt();
		
		while(a>0) {
			b=a%10;
			a=a/10;
			c=(c*10)+b;
		}
		System.out.println(c);
		
	}

}
