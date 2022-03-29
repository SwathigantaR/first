package MEthodPrograms;

public class MaxArray {

	
int  maxarry(int max){
	int  a[]= {12,34,54,67,87,90,1034};
	//max=0;
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
			
		}
		
		
	}
	
	return max;
}
}