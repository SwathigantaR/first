package MEthodPrograms;

public class Constructorinjava{
	
	Constructorinjava()//defalut Constructor
	{
		System.out.println("this is defalut Constructor");
	}
	Constructorinjava(int a){
		System.out.println("this one arg Constructor");
	}
	Constructorinjava(int a,int b){
	System.out.println("this is 2 arg Constructor");
	}
	Constructorinjava(int a,int b,int c){
		System.out.println("this 3 arg Constructor");
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Constructorinjava c=new Constructorinjava();
	Constructorinjava c1=new Constructorinjava(10);
	Constructorinjava c3=new Constructorinjava(20,30);
	Constructorinjava c4=new Constructorinjava(40,50,60);
	}

}
