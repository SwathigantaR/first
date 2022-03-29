package MEthodPrograms;

public class hierachiInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 obj1=new C2();
		obj1.Add();
		obj1.sub();
		System.out.println("*************************");
		C3 obj2=new C3();
		obj2.Add();
		obj2.Multi();
		

	}

}
class C1
{
	int a=30,b=40,c;
	void Add() {
	c=a+b;
	System.out.println("Addition ="+c);
}
}
class C2 extends C1
{
	int d=90,e=20,f;
	void sub()
	{
		f=d-e;
		System.out.println("Subtration ="+f);
	}
}
class C3 extends C1
{
	int g=30,h=70,i;
	void Multi() {
		i=g*h;
		System.out.println("Multipition ="+i);
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
