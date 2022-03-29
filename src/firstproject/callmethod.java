package firstproject;
import java.util.Scanner;

public class callmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithametic arit=new arithametic();
		int result=arit.Add(20,80);
		System.out.println("result= "+result);
		int result1=arit.subtration(80,20);
		System.out.println("subtration is ="+result1);
		System.out.println("enthe the age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		votinginfo obj=new votinginfo();
		
		boolean result2=obj.ageforvotting(age);
		if(age>=18) {
			System.out.println("you are eligible for voting "+age);
		}
		else {
			System.out.println("you are not eligible for voting "+age);
		}
		 evenoddusingfor obj3=new evenoddusingfor();
		 boolean result4=obj3.Evenodd(47);
		 System.out.println("given number is "+result4);
		 int num=sc.nextInt();
		 
		 sc.close();
	}
	


}
