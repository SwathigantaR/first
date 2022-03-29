package firstproject;
import java.util.Scanner;
public class forloop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//event or odd using if else

		//i=1 and j=1to 5
		
//		System.out.print("enter the number=");
//		Scanner sc= new Scanner(System.in);
//		int num=sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			
//			for (int j=1;j<=num;j++) {
//				System.out.println("i = "+i+" j = " +j );
//			}
//		}
		
		//*
		//**
		//***
		//****
	//System.out.println("enter the number");
	
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		 
			 
//				for(int row=1;row<=10;row++) {
//					for(int st=1;st<=row;st++) {
//				System.out.print("*");
//					}
//			System.out.println();
//		}
//		
		System.out.println("enter the number");
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int row=1;row<=num;row++) {
			for(int st=1;st<=num-row+1;st++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

	}

