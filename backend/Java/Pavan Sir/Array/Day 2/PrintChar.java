import java.util.Scanner;
class PrintChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of Array");
		int size = sc.nextInt();
		
		char [] c = new char[size];
		
		for(int i = 0; i < size; i++)
		{
			System.out.print("Enter a data : ");
			c[i] = sc.next().charAt(0);
		}
		
		printChar(c);
	}
	
	public static void printChar(char [] c)
	{
		for(int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
		}
	}
}
