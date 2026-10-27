import java.util.Arrays;
class SegPosNeg2 
{
	public static void main(String[] args) 
	{
		int [] a = {10, -9, 98, -23, -34, 87};
		System.out.println(Arrays.toString(a));
		segPosNeg(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void segPosNeg(int [] n)
	{
		int i = 0;
		int j = n.length - 1;
		
		while(i < j)
		{
			if(n[i] > 0)
			{
				i++;
			}
			else if(n[j] < 0)
			{
				j--;
			}
			else
			{
				int temp = n[i];
				n[i] = n[j]; 
				n[j] = temp;
			}
		}
	}
}
