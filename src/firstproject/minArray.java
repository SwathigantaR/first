package firstproject;

public class minArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {29,45,87,2,23,5};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
		}
		
	}
		
		System.out.println("min= "+min);
}
}