package com.aravind;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		
		int fact=1;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int b = sc.nextInt();
		while(b>0) {
			
			
			
			fact=fact*b;
			b--;
		}
		System.out.println(fact);
		
	}

}
