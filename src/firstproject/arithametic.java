package firstproject;

public class arithametic {
	int a=30;int b=40;
	int c=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithametic at=new arithametic();
		at.Add(20,40);
		at.subtration(30,20);at.mul();
	}
	
int  Add(int a,int b) {
	int c=a+b;
	//System.out.println("add="+c);
	return c;
}
int subtration(int a,int b) {
	int c=a-b;
	//System.out.println("subtration="+c);
	return c;
}
void mul() {
	c=a*b;
	System.out.println("mul="+c);
}
}




	



	

	
		
	

