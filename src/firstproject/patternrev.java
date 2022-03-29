package firstproject;
import java.util.Scanner;


public class patternrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int row=1;row<=num;row++) {
			for(int sp=1;sp<=num-row;sp++) {
				System.out.print(" ");
			}
			for(int st=1;st<=row;st++) {
			
				System.out.print("*");
			}
				 
				System.out.println();
					
			
			
		}
sc.close();
	}

}
