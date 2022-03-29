package MEthodPrograms;

//import java.util.Scanner;

public class CallHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithameticOP Ar=new ArithameticOP ();
		int result=Ar.Addition(30,40);
		System.out.println("Addition="+result);
		float result1=Ar.subtration(50.5f,24.567f);
		System.out.println("subtration="+result1);
		char result2=Ar.initials('G','S');
		System.out.println("intitials="+result2);
		String result3=Ar.fullname("Swathi","Ganta");
		System.out.println("fullname="+result3);
		EvenOdd eo= new EvenOdd();
	    boolean result4=eo.EvenOddp(46);
	    if(result4) {
	    	System.out.println("number is even");
	    }
	    else
	    	System.out.println("number is odd");
		//System.out.println(");
	    MaxArray ma=new MaxArray();
	    int result5=ma.maxarry(0);
	    System.out.println("maxnumberis="+result5);
	    
	}
	}


