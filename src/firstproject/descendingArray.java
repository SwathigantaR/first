package firstproject;

public class descendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,32,13,45,67,90};
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);	
		}
System.out.println("print descending order of Array");
	int temp=0;
	for (int i=0;i<a.length;i++) {
	for(int j=i;j<a.length;j++) {
		if(a[j]>a[i]) {
			//a[j]=a[i];
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	System.out.println(a[i]);	
	}
}
}
