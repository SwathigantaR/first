package Collections;
import java.util.ArrayList;
public class ArrayListsample {
	public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	ArrayList al2=new ArrayList<>();
	al.add(10);
	al.add(25.67f);
	al.add("swathi");
	al.add("johnson");
	al.add(25.67f);//Duplicates are allowed
	al.add('B');
	al.add(null);
	System.out.println(al);
		for(Object ele:al ) {//to print elements one by one:here  
			System.out.println(ele);
		}
	}
}
