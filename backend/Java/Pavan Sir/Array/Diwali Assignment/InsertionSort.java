import java.util.Arrays;

class InsertionSort 
{
	public static void main(String[] args) 
	{
		int [] a = {50, 30, 40, 10, 20};
		System.out.println(Arrays.toString(a));
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void insertionSort(int [] n)
	{
		for(int i = 1; i < n.length; i++)
		{
			int key = n[i];
			
			int j = i - 1;
			
			while(j >= 0 && n[j] > key)
			{
				n[j+1] = n[j];
				j--;
			}
			
			n[j + 1] = key;
		}
	}
}
