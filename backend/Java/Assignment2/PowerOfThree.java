import java.util.Scanner;
class PowerOfThree 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente a number : ");
		int n = sc.nextInt();
		
		System.out.println(powerOfThree(n));
	}
	
	public static boolean powerOfThree(int n)
	{
		if(n == 1) return true;

        long pow = 1;
        
        for(int i = 1; pow < n; i++)
        {
            pow = pow * 3;

            if(pow == n) return true;
        }

        return false;
	}
}
