package firstproject;

public class variabletype {
	int a=20;
	
	
	void display() {
		int d=10;
		int c=0;
		//c=a+d;
		System.out.println(d);
		System.out.println(a);
		System.out.println("c="+(a+d));
		
		
	}
	public static void main(String[] args) {
		variabletype obj1=new variabletype();
		obj1.display();
	}

}
