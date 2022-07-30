package com.aravind;

public class Public {
private void physicalCheckForArmy(int height,int weight,int marks) {
		
		if(height >=170) {
		if(marks>=70 && weight>60) {
			System.out.println("joining for Army");
		}
		else  {
			System.out.println(" ellible");
		}
		}
		
		else {
			System.out.println("not eligible ");
		}
		}
public static void main(String[] args) {
	Public c = new Public();
	c.physicalCheckForArmy(100, 55, 50);
}
}
		
