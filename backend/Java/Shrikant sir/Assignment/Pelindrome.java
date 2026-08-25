import java.util.Scanner;
class Pelindrome 
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		
		str = sc.next();
		
		pelindrome();
	}
		
		
	public static void pelindrome()
	{
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				System.out.println("Given string is not a pelindrome");
				return;
			}
			
			i++;
			j--;
		}
		
		System.out.println("Given string is pelindrome");
	}
}
