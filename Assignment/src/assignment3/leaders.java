package assignment3;

class leaders
{

	void print(int arr[], int size)
	{
		for (int i = 0; i < size; i++)
		{
			int j;
			for (j = i + 1; j < size; j++)
			{
				if (arr[i] <=arr[j])
					break;
			}
			if (j == size)
				System.out.print(arr[i] + " ");
		}
	}

	
	public static void main(String[] args)
	{
		leaders lead = new leaders();
		int arr[] = new int[]{15,11,12,4,2,6,1};
		int n = arr.length;
		lead.print(arr, n);
	}
}

