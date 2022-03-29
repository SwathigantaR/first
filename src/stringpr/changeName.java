package stringpr;

public class changeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ss="Swathi Reddy Ganta";

String temp="";
String ss2=(String)ss.subSequence(0, 12);
String ss1[]=ss.split(" ");

for(int i=0;i<ss1.length;i++) {
	System.out.println(ss1[i]);
	temp=ss1[i];
}
	//System.out.println(ss2);
	System.out.println(temp+" "+ss2);
	}
	
}
