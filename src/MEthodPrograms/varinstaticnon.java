package MEthodPrograms;

public class varinstaticnon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
variabledemo.display();//static method called directly or without creating obj
variabledemo v=new variabledemo();
v.show();

	}

}
class variabledemo
{
	int a=30;
	static int  b=40;
	static void display() {
		variabledemo v1=new variabledemo();//non static method is called by creating obj
		v1.print ();
		System.out.println("***************");
		System.out.println("this is static method");
		System.out.println(b);
	}
	void print() { 
		System.out.println("this is non static method");
	}
	void show() {
		System.out.println("this is show menthod");
		System.out.println("-------------------");
		display();//static method called directly in non static
	}
}