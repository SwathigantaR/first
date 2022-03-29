package MEthodPrograms;

public class studentcons1 {
		String Name;
		int Rollnumber;
		String address;
		studentcons1(String Name,int Rollnumber,String address){
			//Name=Studentname;
			//Rollnumber=studentrollnumber;
			//address=studentaddress;
			System.out.print("Name = "+Name);
			System.out.print("  Rollnumber = "+Rollnumber);
			System.out.print("  address = "+address);
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			studentcons1 sony=new studentcons1("Sony",203,"dubai");
			//sony.studentinfo();
			System.out.println();
			studentcons1 Bunny=new studentcons1("Bunny",765,"UK");
			//Bunny.studentinfo();
			}

	}



