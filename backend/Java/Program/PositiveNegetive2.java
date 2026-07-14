import java.util.Scanner;
class PositiveNegetive2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		String result = (num >= 0) ? "Positive Number" : "Negetive Number";
		
		System.out.println(result);
	}
}
