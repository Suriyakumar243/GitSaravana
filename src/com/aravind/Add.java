package com.aravind;



public class Add {
	
	static int a=100;
	
	public static void d1() {
		a=10;
		System.out.println(a);

	}
	public static void d2() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		Add a = new Add();
		a.d1();
		a.d2();
		Add a1= new Add();
		a1.d1();
		a1.d2();
//		int a,b;
//		int sum=0;
//		
//		Scanner sb = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		a = sb.nextInt();
//		
//		while(a>0) {
//			b=a%10;
//			a=a/10;
//			sum=sum+b;
//		}
//		System.out.println(sum);
		
		System.out.println("Aravind");
		System.out.println("praneesh");
		System.out.println("nirmal");
//		
	}

}
