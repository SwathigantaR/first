package firstproject;

public class maxArray {

	public static void main(String[] args) {
		int a[]= {12,34,54,62,1,76};
		int max=0;
		for (int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("maxnumber in the Array ="+max);

	}

}
