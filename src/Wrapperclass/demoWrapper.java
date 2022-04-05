package Wrapperclass;

public class demoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Integer i1=new Integer(i);//here convert primitive to object data type
		System.out.println(i1);//in co
		//int i3=i1;//here atuomatically conevert from object data type to primitive data type
		//or
		int i3= i1.intValue();//here also convert object dt to primitive data  type
		System.out.println(i3);//here convert 
		
		float f=10.23f;
		Float f1= new Float(f);//here convert primitive data type  to object data type
		System.out.println(f);
		float f2=f1.floatValue();//conevert from object data type to primitive data type
		
		
	}

}
