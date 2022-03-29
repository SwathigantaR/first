package TRYCATCH;

public class account {
int balance=30000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
account a=new account();
a.withdrow(45000);
	}
	void withdrow(int amount) {
		if(balance>amount) {
			balance =balance-amount;
			System.out.println("trancatio done");
		}
		else {
			//throw new ArithmeticException();//o/p gives like this
			//Exception in thread "main" java.lang.ArithmeticException
			//at TRYCATCH.account.withdrow(account.java:16)
			//at TRYCATCH.account.main(account.java:8)
//			you can create your own exception and pass the message to the user understand								
		throw new Account1("your Account Balance is low");
//		by creating your own Exception you can pass the msg in throw block so the user can understand
		// you can understands whst's exception means
		}
}
} 