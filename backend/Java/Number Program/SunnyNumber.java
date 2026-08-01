import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int sq = num + 1;
		
		boolean isSunny = false;
		
		for(int i = 1; i <= num; i++)
		{
			if((i * i) == sq)
			{
				isSunny = true;
				break;
			}
		}
		
		if(isSunny)
		{
			System.out.println("Number is a sunny Number ");
		}
		else 
		{
			System.out.println("Number is not sunny Number");
			
		}
	}
}
