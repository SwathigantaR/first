package firstproject;
import java.util.Scanner;

public class revtranpatt {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
System.out.print("enter the total number of rows");
revtranpatt obj=new revtranpatt();
obj.display();


} 
	void display() 
	{
	
	
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int row=1;row<=num;row++) {
			for(int sp=1;sp<=row-1;sp++) {
				System.out.print(" ");}
			for(int st=0;st<=num-row;st++)
			{
				System.out.print("*");
			
			}
			System.out.println();
	}
	}
	 

		
	
	}
}

