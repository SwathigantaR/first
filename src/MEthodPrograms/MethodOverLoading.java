package MEthodPrograms;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading m=new MethodOverLoading();
		System.out.println(m.add(20.78f,20 ));
		System.out.println(m.add(30,67 ));
		System.out.println(m.add(30,20.5f, 40));
		
	}
int add(int a,int b) {
return a+b;
}
int add(int a,int b,int c) {
	return a+b+c;
}
float add(float a,int b) {
	return a+b;
}
float add(int a,float b,int c) {
	return a+b+c;
}
}