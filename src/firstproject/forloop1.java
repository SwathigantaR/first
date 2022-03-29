package firstproject;

import java.util.Scanner;



public class forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("enter thr nummber");
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		for(int row=1;row<=10;row++) {
//			for (int st=1;st<=row;st++) {
//				
//				System.out.print("*");
//				
//			
//		}
//			System.out.println();
//
//	}
		
		System.out.println("enter thr nummber");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int row=1;row<=num;row++) {
			for(int st=1;st<=(num-row);st++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
}
}