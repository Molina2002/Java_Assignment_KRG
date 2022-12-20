package ass2;
import java.util.*;
abstract class Details{
	String Name ;
	String Gender ;
	String Address ;
	void entry(String Name, String Gender,String Address) {}
}
abstract class books{
	String Book_Name;
	String Author;
	void issue(String Book_Name,String Author) {}
}
class Student extends Details{
	void entry(String Name, String Gender,String Address) {
	System.out.println("Student Name: "+Name+"  Gender: "+ Gender+"  Address: "+Address);
	}
	

}
class student_entry extends books{
void issue(String Book_Name,String Author) {
	System.out.println("Book Name: "+Book_Name+"  Author Name: "+Author);

}
}
class Teacher extends Details{
	void entry(String Name, String Gender,String Address) {
		System.out.println("Teacher Name: "+Name+"  Gender: "+ Gender+"  Address: "+Address);
		}
	
}
class Teacher_Entry extends books{
	void issue(String Book_Name,String Author) {
		System.out.println("Book Name: "+Book_Name+"  Author Name: "+Author);

	}
}
public class Lib_Management {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Name ");
   String Name = sc.nextLine();
   System.out.println("Enter gender ");
   String Gender = sc.nextLine();
   System.out.println("Enter Address ");
   String Address = sc.nextLine();
   System.out.println("Enter book name ");
   String bname = sc.nextLine();

   System.out.println("Enter Author");
   String author = sc.nextLine();

   System.out.println("Enter Occupation ");
   String occ = sc.nextLine();
   if(occ.equalsIgnoreCase("Teacher")) {
	   Teacher T1 = new Teacher();
	   T1.entry(Name, Gender,Address);
	   Teacher_Entry T2 = new Teacher_Entry();
	   T2.issue(bname, author);
   }
   else if(occ.equalsIgnoreCase("Student"))
   
   {
	   Student S1 = new Student();
	   S1.entry(Name, Gender,Address);
	  
	   student_entry S2 = new student_entry();
	   S2.issue(bname, author);
   }
	}

}
