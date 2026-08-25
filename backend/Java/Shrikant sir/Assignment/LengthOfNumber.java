import java.util.Scanner;
class LengthOfNumber 
{
	static int num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		lengthOfNumber();
	}
	
	public static void lengthOfNumber()
	{
		int count = 0;
		
		while(num != 0)
		{
			num /= 10;
			count++;
		}
		
		System.out.println("Length of a nnumber is : " + count);
	}
}
