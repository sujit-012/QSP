package interfaces;

public class StudentManagmentImp implements StudentManagment{

	public int[] removeDuplicateMarks(int[] ar) {
		boolean[] visited = new boolean[ar.length];
		int count = countOfDist(ar, visited);
		int [] ans = new int[count];
		
		int index = 0;
		
		for(int i = 0; i < ar.length; i++)
		{
			if(!visited[i])
			{
				ans[index++] = ar[i];
			}
		}
		
		return ans;
	}
	
	private int countOfDist(int [] ar, boolean [] visited)
	{
		int count = 0;
		
		for(int i = 0; i < ar.length; i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			for(int j = i + 1; j < ar.length; j++)
			{
				if(ar[i] == ar[j])
				{
					visited[j] = true;
				}
			}
			
			count++;
		}
		
		return count;
	}
	
	public void sortMarks(int [] n)
	{
		if(n.length == 1)
		{
			return;
		}
		
		int[] left = new int[n.length/2];
		int[] right = new int[n.length - left.length];
		
		for(int i = 0; i < left.length; i++)
		{
			left[i] = n[i];
		}
		
		for(int i = 0; i < right.length; i++)
		{
			right[i] = n[left.length + i];
		}
		
		sortMarks(left);
		sortMarks(right);
		merge(left, right, n);
	}
	
	private void merge(int[] left, int[] right, int[] n)
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
	
	public int[] mergeTwoMarkSheet(int [] ar1, int[] ar2)
	{
		int[] ans = new int[ar1.length + ar2.length];
		
		for(int i = 0; i < ar1.length; i++)
		{
			ans[i] = ar1[i];
		}
		
		for(int i = 0; i < ar2.length; i++)
		{
			ans[ar1.length + i] = ar2[i];
		}
		
		return ans;
	}
	
	public int averageMarks(int [] ar)
	{
		int sum = 0;
		
		for(int i : ar)
		{
			sum += i;
		}
		
		return sum / ar.length;
	}
	
	public int leastMark(int [] ar)
	{
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] < min)
			{
				min = ar[i];
			}
		}
		
		return min;
	}
	
	public int highestMark(int [] ar)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] > max)
			{
				max = ar[i];
			}
		}
		
		return max;
	}
	
	public int[] topThreeMarks(int [] ar)
	{
		sortMarks(ar);
		
		if(ar.length == 1) return new int[] {ar[0]};
		
		if(ar.length == 2) return new int[] {ar[1], ar[0]};
		
		return new int[]{ar[ar.length - 1], ar[ar.length - 2], ar[ar.length - 3]};
	}
}
