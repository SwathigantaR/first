package firstproject;

public class ascendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,32,103,45,67,90};
		int temp=0;
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);	
		}
System.out.println("print Ascending order of Array");
	for (int i=0;i<a.length;i++) {
	for(int j=i;j<a.length;j++) {
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;	
		}
	}
	System.out.println(a[i]);	
	}
	}

	}



