import java.util.Scanner;
class Automorphic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sq = num * num ;
			
		int dig = 1;
			
		for(int i = num; i != 0; i /= 10)
		{
			dig = dig * 10;
		}
			
		if((sq % dig) == num)
		{
			System.out.println(num + " is Automorphic Number ");
		}
		else
		{
			System.out.println(num + " is not a Automorphic Number ");
		}
	}
}
