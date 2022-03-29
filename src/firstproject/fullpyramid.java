package firstproject;
import java.util.Scanner;
public class fullpyramid {
	int row,st,sp;
	Scanner sc=new Scanner(System.in);
    int tnum=sc.nextInt();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the no of rows");
        fullpyramid obj=new fullpyramid();
        obj.uppyramid();
        obj.downpyramid();
        }
	 void uppyramid(){
		for( row=1;row<=tnum;row++) {
			for( sp=1;sp<=(tnum-row);sp++) {
				System.out.print(" ");
			}
			for( st=1;st<=(row*2)-1;st++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		}
	void downpyramid()
	{		
		for( row=1;row<=tnum;row++) {		
			for(sp=1;sp<=row-1;sp++) {			
				System.out.print(" ");}		
			for(st=1;st<=((tnum*2)-(row*2)+1);st++){ 
				System.out.print("*");			
			}
			System.out.println();			}	
}
}

















