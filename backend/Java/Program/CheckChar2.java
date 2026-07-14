import java.util.Scanner;
class CheckChar2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		int ch = sc.next().charAt(0);
		
		if(ch >= 65 && ch <= 90)
		{
			System.out.println("Character is Uppercase");
		}
		
		if(ch >= 97 && ch <= 122)
		{
			System.out.println("Character is Lowercase");
		}
		
		if(ch >= 48 && ch <= 57)
		{
			System.out.println("Character is Digit");
		}
		
		if(!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)))
		{
			System.out.println("Character is Special Character");
		}
	}
}
