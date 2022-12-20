package assignment3;

public class Q4 {

	public static void main(String[] args) {
		int large,small,i;
		int a[] = new int[]{1, 2, 3, 4, 5};
		int n = a.length;
		large=small=a[0];
		for(i=1;i<n;++i)
		{
		if(a[i]>large)
		large=a[i];

		if(a[i]<small)
		small=a[i];
		}

		System.out.print("The smallest element is " + small );
		System.out.print(“\nThe largest element is ” + large );

	}

}
