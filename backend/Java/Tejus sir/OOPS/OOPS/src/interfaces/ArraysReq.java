package interfaces;

public interface ArraysReq {

	boolean palindromeArray(int [] ar);
	int binarySearch(int [] ar, int key);
	
	void mergeSort(int [] ar);
	
	void halfReverseArrayAfterSorting(int [] ar);
	
	static void bubbleSort(int [] ar)
	{
		for(int i = 0; i < ar.length - 1; i++)
		{
			for(int j = 0; j < ar.length - 1 - i; j++)
			{
				if(ar[i] > ar[i + 1])
				{
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
			}
		}
	}
}
