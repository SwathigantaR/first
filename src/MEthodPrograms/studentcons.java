package MEthodPrograms;

public class studentcons {
	String Name;
	int Rollnumber;
	String address;
	studentcons(String Studentname,int studentrollnumber,String studentaddress){
		Name=Studentname;
		Rollnumber=studentrollnumber;
		address=studentaddress;
	}
void studentinfo() {
	System.out.print("Name = "+Name);
	System.out.print("  Rollnumber = "+Rollnumber);
	System.out.print("  address = "+address);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentcons sony=new studentcons("Sony",203,"dubai");
		sony.studentinfo();
		System.out.println();
		studentcons Bunny=new studentcons("Bunny",765,"UK");
		Bunny.studentinfo();
		}

}
