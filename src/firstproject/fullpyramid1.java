package firstproject;
import java.util.Scanner;


public class fullpyramid1 {
	static int st ,row,sp;
	public static void main(String[]args) {
		System.out.print("enter on of rows");
		//fullpyramid1 obj=new fullpyramid1();
		//obj.pyramid();
		
	

	//void pyramid()
	//{
		 int st=0 ,row=0,sp=0;
		
		Scanner sc=new Scanner(System.in);
		int tnum=sc.nextInt();
		for( row=1;row<=tnum;row++) {
			for( sp=1;sp<=(tnum-row);sp++) {
				System.out.print(" ");
			}
			for( st=1;st<=(row*2)-1;st++) {
				System.out.print("*");
			}
			System.out.println();
		}
							
				
			
	
	
			
		if(tnum ==st) 
		
			for( row=1;row<=tnum;row++)
			{
				for( sp=1;sp<=row-1;sp++)
				{
					System.out.print(" ");
				}
				for( st=1;st<=((tnum*2)-(row*2)+1);st++){ 
					System.out.print("*");
				
				}
				System.out.println();			}
			
		}
		
	}
			
		





