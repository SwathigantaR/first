package stringpr;

import java.util.Scanner;

public class nameChange1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the frist Name");
Scanner sc=new Scanner(System.in);
String s1=sc.next();
System.out.println("Enter the Middel Name");
String s2=sc.next();
System.out.println("Enter the Last Name");
String s3=sc.next();
String s4=(s1.concat(s2));
System.out.println(s3+" "+s4);
	}

}
