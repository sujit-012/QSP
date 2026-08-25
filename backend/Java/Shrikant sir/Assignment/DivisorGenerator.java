import java.util.Scanner;
class DivisorGenerator 
{
	static int num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		divisorGenerator();
	}
	
	public static void divisorGenerator(){
		int count = 0;
		int div = 1;
		
		for(int i = num; i != 0; i /= 10)
		{
			count++;
		}
		
		while(count > 1)
		{
			div *= 10;
			count--;
		}
			
		System.out.println("Divisor of a " + num + " is " + div);
	}
			
}
