package stringpr;

public class StringConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=" Hello String ";
System.out.println(s);
StringBuffer SB=new StringBuffer("Hello StringBuffer");
System.out.println(SB);
StringBuilder SBI=new StringBuilder("Hello StringBuilder");
System.out.println(SBI);
String s3=new String();// Creating empty String Constructor & when u Print it give empty line
System.out.println(s3);
String s4=new String("Hello world");//this is String parameter Constructor use to assign/passing string directly
System.out.println(s4);
String s5=new String(SB);//This Constructor convert StringBuffer to String
System.out.println(s5);
String s6=new String(SBI);//This Constructor convert StringBuilder to String	
System.out.println(s6);	
char ch[]= {'s','w','a','t','h','i'};
	String s1=new String(ch);//Here Constructor convert charArray to String
	System.out.println(s1);
	
	char ch1[]= {83,87,65,84,72,73};
	String s7=new String(ch1);
	System.out.println(s7);
	byte b[]= {'A','b','c'};
	String s2=new String(b);//here Constructor convert byteArray to String
	System.out.println(s2);
	}

}
