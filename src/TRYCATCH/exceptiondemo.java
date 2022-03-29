package TRYCATCH;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s=null;
		int[] a= {20,45,65,23};//program start from 
		System.out.println(a[4]);
		int b= a[1]/0;
		s.length();
	}
		catch(NullPointerException e) {
			System.out.println("NullPointerException Block");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Block");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Block");
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("ArithmeticException Block");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception block");
			System.out.println(e.getMessage());
		}
	
			
			
	
		
	
	}
}
