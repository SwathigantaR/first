package stringpr;

import java.util.Scanner;

public class duplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the String");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("duplicate words are : ");
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++) {
		for(int j=i+1;j<st.length;j++) {
			if(st[i].equals(st[j])) {
				System.out.println(st[i]);
				break;
			}
		}
		}
	}

}
