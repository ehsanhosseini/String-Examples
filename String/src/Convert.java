
public class Convert {
public static void main(String args[]){
	
	int a=20;
	String s1=String.valueOf(a); // convert (int,float,long,...) to String	
	System.out.println(s1+10);
	System.out.println(a+10);
	
	String s2="100";
	int i=Integer.parseInt(s2); // convert String to int
	System.out.println(i+s2);
	System.out.println(i+100);
	
	int a1=30;
	String s3=Integer.toString(a1);  //convert int to string (using tostring method)
	System.out.println(s3);
	System.out.println(s3+a1);
	System.out.println(s3+100);
	
	String s4="6584398645";
	long l=Long.parseLong(s4);
	System.out.println(l);       // string to long
	
	long l1=78456857836L;
	String s5=String.valueOf(l1);  // long to String 
	System.out.println(s5);
	
	long l2=78456857836L;
	String s6=Long.toString(l2);  // long to String (using tostring method)
	System.out.println(s6);
	
	
	String s7="12.4";
	float f=Float.parseFloat(s7);   // String to float
	System.out.println(f);
	
	
	float f1=2.3F;
	String s8=String.valueOf(f1);  // float to String
	System.out.println(s8);
	
	float f2=2.3F;
	String s9=Float.toString(f1);   // float to string using toString method
	System.out.println(s9);
	
	String s10="30.5";
	double d=Double.parseDouble(s10);  // String to double
	System.out.println(d);
	
	double d1=234567;
	String s11=String.valueOf(d1);    // double to string
	System.out.println(s11);
	
	double d2=234567D;
	String s12=Double.toString(d2);  // double to string using toString method 
	System.out.println(s12);
	
	
}
}
