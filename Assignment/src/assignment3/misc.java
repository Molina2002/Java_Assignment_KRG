package assignment3;
class MyException extends Exception{
	public MyException() {
	
	}
	public MyException(String S) {
	super(S+" Error found");
	}
}
public class misc{
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		String s ="hello";
//		throw new ArithmeticException("/ by zero");
  int i =7;
  int age =5;
  try {
  if(age<i) {
	  throw new MyException("Kindergarten");
  }
  }
  catch(MyException e) {
	  System.out.println(e.getMessage());
  }
	}

}
