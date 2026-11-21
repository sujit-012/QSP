package interfaces;

public class ArrayReqImp implements ArraysReq {
	
	public boolean palindromeArray(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i <= j)
		{
			if(n[i] != n[j])
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public int binarySearch(int [] ar, int key)
	{
		mergeSort(ar);
		int i = 0; 
		int j = ar.length - 1;
		
		while(i <= j)
		{
			int mid = (i + j)/2;
			
			if(ar[mid] == key)
			{
				return mid;
			}
			
			if(key > ar[mid])
			{
				i = mid + 1;
			}
			else
			{
				j = mid - 1;
			}
		}
		
		return -1;
	}
	
	public void mergeSort(int [] ar)
	{
		if(ar.length == 1)
		{
			return;
		}
		
		int[] left = new int[ar.length/2];
		int[] right = new int[ar.length - left.length];
		
		for(int i = 0; i < left.length; i++)
		{
			left[i] = ar[i];
		}
		
		for(int i = 0; i < right.length; i++)
		{
			right[i] = ar[left.length + i];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, ar);
	}
	
	private void merge(int [] left, int [] right, int [] n)
	{
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left.length && j < right.length)
		{
			if(left[i] < right[j])
			{
				n[k] = left[i];
				i++;
				k++;
			}
			else
			{
				n[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i < left.length)
		{
			n[k] = left[i];
			i++;
			k++;
		}
		
		while(j < right.length)
		{
			n[k] = right[j];
			j++;
			k++;
		}
	}
	
	public void halfReverseArrayAfterSorting(int [] ar)
	{
		mergeSort(ar);
		
		int i = (ar.length / 2);
		int j = ar.length - 1;
		
		while(i < j)
		{
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			
			i++;
			j--;
		}
	}
}
