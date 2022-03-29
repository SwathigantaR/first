package MEthodPrograms;

import java.util.Scanner;

public class studentInheritance {//MULTILEVEL INHERITANCE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentAddress st= new studentAddress();
		//Scanner sc=new Scanner(System.in);
		//String Firstname = sc.toString();
		//String Lastname = sc.toString();
		//studentAddress st= new studentAddress();
		st.Fullname();
		st.Address();
		st.Course();
	}
}
class StudentFullname 
{
	String Firstname="abc";
	String Lastename="xyz";
	void Fullname() {
		System.out.println("Fullname ="+Firstname+" "+Lastename);
	}
}
class studentCourse extends StudentFullname {
	String Coursename="java";
	int year=2001;
	void Course() {
		System.out.println("Coursename ="+Coursename);
		System.out.println("Year ="+year);
	}
}
class studentAddress extends studentCourse{
	String Address="NewYork";
	void Address() {
		System.out.println("Address ="+Address);
	}
}