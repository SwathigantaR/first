package firstproject;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("eneter the number");
int number=sc.nextInt();
int temp=number;
int rem;
int swap=0;
while(number>0) {
	rem=number%10;
	swap=(swap*10)+rem;
	number=number/10;
}    
if(temp==swap)
	System.out.println(temp+" is palindrome");

else
	System.out.println(temp+" is not palindrome");
	}

}
