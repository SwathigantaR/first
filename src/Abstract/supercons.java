package Abstract;

public class supercons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zz a=new zz(3);
//		zz a=new zz();
	}

}
class xx{
	xx()
	{
		System.out.println("This xx constructor ");
	}
	xx(int a){
		System.out.println("This 1 arg Constructor");
	int b=10,c=40;
	int e=b*c;
	System.out.println("e="+e);
	}
}
class yy extends xx{
	yy(){
		System.out.println("This is yy constructor");		
	}
yy(int a){
	super(1);
			int c=5,b=20;			
				int d =a-c;
	System.out.println("d ="+d);
	}
}
class zz extends yy{
	zz(){		
		System.out.println("This is zz constructor");
	}
	zz(int a){
		super(23);
		int c=5,b=20;			
		int d =b/c;
		System.out.println("d="+d);
	}
	
}