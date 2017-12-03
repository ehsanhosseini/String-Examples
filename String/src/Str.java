
public class Str{
	public static void main(String args[]){
	String s1="Ehsan";
	String s2="Ehsanhffre";
	String s3=new String("eHsan");
	String s4=new String("Ehsan");
	String s5="Ehsan";
	String s6="ehsan";
	String s7=" ";
	String s8="";

	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s5));
	System.out.println(s1.compareTo(s6));
	System.out.println(s2.compareTo(s1));
	System.out.println(s1.compareTo(s4));
	System.out.println(s1.compareTo(s3));
	System.out.println(s3.compareTo(s4));
	System.out.println(s5.compareTo(s3));
	System.out.println(s1.compareTo(s1));
	System.out.println(s6.compareTo(s7));
	System.out.println(s6.compareTo(s8));
	System.out.println(s1.compareTo(s7));
	System.out.println(s1.compareTo(s8));
	
	int a=10;
	String s9=String.valueOf(a);
	System.out.println("convert integer to string="+s9+10);
	
	StringBuffer st1=new StringBuffer("Ehsan");
	st1.insert(st1.length()-1,"TTTT");
//	st1.insert(1,"TTTT");
	System.out.println(st1);
	
	
	
	
	
}
}