package assignment3;


class A3_Q1{
	 void sort() {
	        int n = 6;
	        int a[] = { 0, 0, 1, 1, 0, 0 };
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (a[i] > a[j]) {
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
}
public class sortarray {

	public static void main(String[] args) {
		A3_Q1 q1 = new A3_Q1();
		q1.sort();

	}

}
