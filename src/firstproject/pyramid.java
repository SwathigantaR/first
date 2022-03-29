package firstproject;
import java.util.Scanner;


public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("enter the Number");
pyramid obj1=new pyramid();
obj1.uppyramid();
//Scanner sc=new Scanner(System.in);
//int tnum=sc.nextInt();
//for (int row=1;row<=tnum;row++) {
//	for(int sp=1;sp<=tnum-row;sp++)
//	{
//		System.out.print(" ");
//}
//for(int st=1;st<=(row*2)-1;st++) {
//	System.out.print("*");
//}
//System.out.println();
//	
//}
//
//	sc.close();

	}
	void uppyramid()
	{
		Scanner sc=new Scanner(System.in);
		int tnum=sc.nextInt();
		for (int row=1;row<=tnum;row++) {
			for(int sp=1;sp<=tnum-row;sp++)
			{
				System.out.print(" ");
		}
		for(int st=1;st<=(row*2)-1;st++) {
			System.out.print("*");
		}
		System.out.println();
			
		}
		sc.close();
	}
}
