import java.util.Scanner;
class ProductPrimeDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int pro = 1;
		
		while(num > 0)
		{
			int dig = num % 10;
			if(dig == 2 || dig == 3 || dig == 5 || dig == 7)
			{
				pro *= dig;
			}
			
			num /= 10;
		}
		
		System.out.println(pro);

	}
}
