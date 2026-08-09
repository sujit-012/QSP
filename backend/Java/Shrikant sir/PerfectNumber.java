import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of rows : ");
		int n = sc.nextInt();
		
		System.out.println(perfect(n));
	}
	
	public static boolean perfect(int num)
	{
		if(num < 0) return false;

        int sum = 0;

        for(int i = 1; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}
