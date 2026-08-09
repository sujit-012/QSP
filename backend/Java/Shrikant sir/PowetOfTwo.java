import java.util.Scanner;
class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente a number : ");
		int n = sc.nextInt();
		
		System.out.println(powerOfTwo(n));
	}
	
	public static boolean powerOfTwo(int n)
	{
		if(n == 1) return true;

        long pow = 1;
        
        for(int i = 1; pow < n; i++)
        {
            pow = pow * 2;

            if(pow == n) return true;
        }

        return false;
	}
}
