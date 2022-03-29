package stringpr;

import java.util.Scanner;

public class strpalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rv="";
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
       for(int i=st.length()-1;i>=0;i--) {
    	   //System.out.print(st.charAt(i));
    	   char ch=st.charAt(i);
    	   rv=rv+ch;
       }
       System.out.println(rv);
    	   if (st.equals(rv)) 
    		   System.out.println("given String is Palindrom");
    		   else
    			   System.out.println("given string is not palindrom");
	}
}
