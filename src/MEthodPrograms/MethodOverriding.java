package MEthodPrograms;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empFullname EF= new empFullname();
		EF.EmpDetails();
		empAddress EA= new empAddress();
		EA.EmpDetails1();
		
	}
}
class empFullname{
	String Firstname="Sony";
	String Lastname="ABC";
	void EmpDetails()
	{
		System.out.println("Employee Fullname ="+Firstname+" "+Lastname);
	}
}
class empAddress extends empFullname{
	String Address="Texas";
	void EmpDetails1()
	{
		System.out.println("Employee Address ="+Address);
	}
}

