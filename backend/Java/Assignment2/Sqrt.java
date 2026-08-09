import java.util.Scanner;
class Sqrt 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		System.out.println(sqrt(n));
	}
	
	public static int sqrt(int x)
	{
		if (x == 0)
        {
            return 0;
        }

        for (int i = 1; ; i++) {

            long square = (long)i * i;

            if (square == x)
            {
                return i;
            }

            if (((long)(i-1) * (i-1)) < x && square > x)
            {
                return i - 1;
            }
        }
	}
}
