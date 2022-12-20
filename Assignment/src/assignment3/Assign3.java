package assignment3;
import java.util.*;
 class ques1{
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
 class Q2{
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
 class Q3{
	 void minmax(int arr[],int n) {
		int min =arr[0],max = arr[0];
		
			 for(int j = 1;j<n;j++) {
				 if(min>arr[j]) {
					min = arr[j];
				 }
			 }
		 }
	 }
 
public class Assign3 {

	public static void main(String[] args) {
		ques1 Q1 = new ques1();
		Q1.sort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x =0;
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			System.out.println("Enter: ");
			x = sc.nextInt();
			arr[i]= x;
			
		}
		System.out.println("Enter k");
		int k = sc.nextInt();
		Q2 q2 = new Q2();
		q2.rotate(arr,n,k);
		
		Q3 q3 = new Q3();
		q3.minmax(arr,n);
	}

}
