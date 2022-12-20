package assignment3;

import java.util.Scanner;
class A3_Q2{
	 void rotate(int arr[], int n, int k){
		 
		 if(k>0) {
			 
			 while(k>0) {
				 
				 int temp = arr[n-1];
				 
			 
			 for(int i =n-2;i>=0;i--) {
				 arr[i+1]=arr[i];
				 
			 }
			 arr[0] = temp;
			 k--;
			 }
			 
			 
			 for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }
		 }
		 else {
			 
			 while(k<0) {
				 
				 int temp = arr[0];
				 
			 
			 for(int i =0;i<n-1;i++) {
				 arr[i]=arr[i+1];
				 
			 }
			 arr[n-1] = temp;
			 k++;
			 }
			 
			
			 for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }
		 }
		 
	 }
}

public class rotatearray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int x =0;
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i =0;i<n;i++) {
			
			x = sc.nextInt();
			arr[i]= x;
			
		}
		System.out.println("Enter number of rotations k");
		int k = sc.nextInt();
		A3_Q2 q2 = new A3_Q2();
		q2.rotate(arr,n,k);
		sc.close();

	}

}
