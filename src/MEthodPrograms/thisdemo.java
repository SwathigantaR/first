package MEthodPrograms;

public class thisdemo {//using constructor with this keyword
		String Name;
		int Rollnumber;
		String address;
		thisdemo(String name,int rollnumber,String address){
			this.Name=name;
			this.Rollnumber=rollnumber;
			this.address=address;//this refers instance variable of the class
		}
	void studentinfo() {
		System.out.print("Name = "+Name);
		System.out.print("  Rollnumber = "+Rollnumber);
		System.out.print("  address = "+address);
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			thisdemo sony=new thisdemo("Sony",203,"dubai");
			sony.studentinfo();
			System.out.println();
			thisdemo Bunny=new thisdemo("Bunny",765,"UK");
			Bunny.studentinfo();
			}

	}
