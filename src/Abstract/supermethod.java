package Abstract;

public class supermethod {
	public static void main(String[] args) {
		CD1 b;
		b=new CD1();
		b.ab3();  //b.ab1();
		
	}
}
class AB1{
	int a=5,b=20;
	void ab1() 
	{
		int c=a+b;
	System.out.println("c ="+c);
	}
}
class BC1 extends AB1 {
	int a=5,b=20;
	void ab2() {     //void ab1
		super.ab1();
		int d =a-b;
		System.out.println("d ="+d);
		
	}
}
class CD1 extends BC1{
	int a=5,b=20;
	void ab3() {   //void ab1
		super.ab2();  //void ab1
		int e =a*b;
		System.out.println("e ="+e);
	}
}