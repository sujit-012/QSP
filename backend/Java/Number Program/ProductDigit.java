import java.util.Scanner;
class ProductDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int num = sc.nextInt();
		
		int product = 1;
		
		if(num == 0)
		{
			product = 0;
		}
		
		while(num > 0)
		{
			int last = num % 10;
			
			product = product * last;
			
			num = num / 10;
		}
		
		System.out.println("Product of number is " + product);
	}
}
