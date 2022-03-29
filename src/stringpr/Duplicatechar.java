package stringpr;

import java.util.Scanner;

public class Duplicatechar {

	public static void main(String[] args) {
		System.out.println("enter the String");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("duplicate characters are : ");
		//String st[]=str.split(" ");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(i));
					  
				}
			}
		}
		
	}}
