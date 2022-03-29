package firstproject;
import java.util.Scanner;

public class reversepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the no of rows");
		reversepyramid obj1=new reversepyramid();
		obj1.downpyramid();
	}
		void downpyramid()
		{
			Scanner sc=new Scanner(System.in);
	          int tnum=sc.nextInt();
			for(int row=1;row<=tnum;row++)
			{
				for(int sp=1;sp<=row-1;sp++)
				{
					System.out.print(" ");
				}
				for(int st=1;st<=((tnum*2)-(row*2)+1);st++){ 
					System.out.print("*");
				
				}
				System.out.println();			}
			
			
		sc.close();
		

	}

}




	
	
