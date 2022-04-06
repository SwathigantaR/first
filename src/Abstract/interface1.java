package Abstract;

public class interface1 {
//having a class extends  with class which is implements 2 interfaces 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
child1 C;
C= new child1();
//C.show();
//		Parent  ch;
//        ch=new Parent();
//        ch.print();
//        ch.show();
//        ch.display();
		CC a;
		a=new Parent();
		a.show();
	     ((Parent) a).print();
		 a.display();
		 a.print1();
		//a.show();
		//((Parent) a).print();
	}
}
interface AA
{
	void show();
}
interface BB
{
	void display();	
}
interface CC extends AA,BB{
	void print1();
}
class child1 implements CC{
	public void show() {
		System.out.println("this is mulitiple inheritace");
	}
	public void display() {
	System.out.println("this is intherface BB method");
	}
	public void print1() {
		System.out.println("this is CC menthod");
	}
}
class Parent extends child1{
	void print() {
		System.out.println("this is parent of child1");
	}
	
}

	
