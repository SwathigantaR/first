package firstproject;

import java.util.Scanner;

public class votinginfo {
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age");
//votinginfo obj=new votinginfo();
//obj.ageforvotting();
	}
boolean	 ageforvotting(int age) {
		//Scanner sc=new Scanner(System.in);
	//int age=sc.nextInt();
		if(age >=18) {
			//System.out.println("Eligibale for votting "+age);;
		
		return true;
		}
		else {
		//	System.out.println("Not Eligible for voting "+age);;
		return false;
		}
	}

}
