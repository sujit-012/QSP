import java.util.Arrays;
class MergeSort 
{
	public static void main(String[] args) 
	{
		int [] a = {50, 40, 30, 10, 20};
		System.out.println(Arrays.toString(a));
		divide(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void divide(int [] n)
	{
		if(n.length == 1)
		{
			return;
		}
		
		int[] left = new int[n.length/2];
		int[] rigth = new int[n.length - left.length];
		
		for(int i = 0; i < left.length; i++)
		{
			left[i] = n[i];
		}
		
		for(int i = 0; i < rigth.length; j++)
		{
			right[i] = n[left.length + i];
		}
		
		divide(
}
