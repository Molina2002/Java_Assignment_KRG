package assignment3;

public class TestThrows {
public static int divideNum(int m,int n) throws ArithmeticException{
	int div = m/n;
	return div;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows obj = new TestThrows();
		try {
			System.out.println(obj.divideNum(45,0));
		}
		catch(ArithmeticException e) {
			System.out.println("number can't be divided by 0");
			
		}
		System.out.println("rest of the code");
	
		


	}

}
