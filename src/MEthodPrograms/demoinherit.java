package MEthodPrograms;

public class demoinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println("b ="+b.b);
		System.out.println("c ="+b.c);
		b.display();
		b.print();

	}

}
class A
{
	int b=30;
	int c=90;
	void display() {
		int d=b*c;
		System.out.println("d ="+d);
	}
}
class B extends A{
	int e=90;
	int f=40;
	void print() {
		int h=e-f;
		System.out.println("h ="+h);
	}
	
	
}