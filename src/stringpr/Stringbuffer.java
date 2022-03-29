package stringpr;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="San Antonio ";// String is synchronized
StringBuffer sb= new StringBuffer("Most Happening place ");
	
	System.out.println("After concat="+st.concat("is in Texas"));
	System.out.println(st);//here String didn't change after concat bcz String is immutable
	//System.out.println(sb.append("in Texas"));
	sb.append("in Texas");
	System.out.println(sb);//here StringBuffer is changed after concant BCZ StringBuffer MUTTABLE
	StringBuilder sb1=new StringBuilder("Most Happening place ");
	sb1.append("in NewYork");
	System.out.println(sb1);//StringBuilder works same as StringBuffer but StringBuilder Performance is faster than StringBuffer bcz it is non synchronized 
}
}
