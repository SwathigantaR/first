package MEthodPrograms;

public class staticblock {
	{
		System.out.println("this is instance block");
	}
	static {
		System.out.println("this is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method");
		staticblock s=new staticblock();
	}

}
