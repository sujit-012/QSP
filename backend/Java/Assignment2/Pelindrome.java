import java.util.Scanner;
class Pelindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		System.out.println(isPelindrome(n));
	}
	
	public static boolean isPelindrome(int num)
	{
		if(num < 0) return false;
		
		String str = num+"";
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
}
