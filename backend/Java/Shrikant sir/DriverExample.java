import java.util.Scanner;
class DriverExample 
{
	static int num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		rev();
		sumOfDigit();
		proOfDigit();
	}
	
	public static void rev(){
		int rev = 0;
		
		for(int i = num; i != 0; i/=10)
		{
			rev = rev * 10 + i%10;
		}
		
		System.out.println("Rev of Digit : " + rev);
	}
	
	public static void sumOfDigit(){
		int sum = 0;
		
		for(int i = num; i != 0; i/= 10){
			sum += i%10;
		}
		
		System.out.println("Sum of Digit : " + sum);
	}
	
	public static void proOfDigit(){
		int pro = 1;
		
		for(int i = num; i != 0; i /= 10){
			pro *= i%10;
		}
		
		System.out.println("Product of Digit : " + pro);
	}
}
