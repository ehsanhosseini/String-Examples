class Tostr{  
 int rollno;  
 String name;  
 String city;  
  
 Tostr(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
 
 public String toString(){
	 
	 return rollno+" "+name+" "+city;
 }
  
 public static void main(String args[]){  
	 Tostr s1=new Tostr(101,"Raj","lucknow");  
	 Tostr s2=new Tostr(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}
