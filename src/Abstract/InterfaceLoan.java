package Abstract;

public class InterfaceLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loan L;
		TypesOfLoan L;
		//L= new TypesOfLoan();
		L=new TypesOfLoan();
		L.MortigageLoan();
		L.AutoLoan();
		L.PersonalLoan();
		L.CardLoan();
		//((Op) L).Add();
		//((Op) L).Sub();
		//((Op) L).Multi();
		//((Op)L).divi();
		L.Add();
		L.Sub();
		L.Multi();
		L.divi();		
	}

}
class Op{
	void Add() {
		int f=Loan.a+Loan.b;
		System.out.println("Addition ="+f);
	}
	void Sub() {
		float g=Loan.e-Loan.c;
		System.out.println("subtration ="+g);
	}
	void Multi() {
		int h=Loan.b*Loan.c;
		System.out.println("Multiplication ="+h);		
	}
	void divi() {
		float i=Loan.e/Loan.a;
		System.out.println("Division ="+i);
	}
}
interface Loan{
	int a=20,b=30,c=50;//variables in interface by default public static final 
	float d=24.5f,e=55.6f;//can't change the values of interface variables,
	                      //need to initialize the vales to variable
	
	void MortigageLoan();//by default Abstract and public
	void AutoLoan();     //no body for methods which are in interface bcz these methods are by default Abstract
	void PersonalLoan();
	void CardLoan();
}
class TypesOfLoan extends Op implements Loan{
	public void MortigageLoan() //when implementing the interface we need to implement the method in the class
	{
		System.out.println("Home load");
	}
	public void AutoLoan()//while Overriding the method we can see the white trangle
	{
		System.out.println("AutoLoan");
	}
	public void PersonalLoan()
	{
		System.out.println("PersonalLoan");
	}
	public void CardLoan()
	{
		System.out.println("CardLoan");
	}	
	}
