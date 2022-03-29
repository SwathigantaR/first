package Abstract;

public class SuperDemo {
	public static void main(String[] args)
			{
		BC b;
		b=new BC();
		b.display();
	}

}
class AB{
	int a=70;
}
class BC extends AB{
	int a=88;
	void display() {
		System.out.println(a);
		System.out.println(super.a);
	}
}