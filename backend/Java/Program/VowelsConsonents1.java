import java.util.Scanner;
class VowelsConsonents1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || 
		   ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || 
		   ch == 'u' || ch == 'U')
		{
			System.out.println("Character is Vowel");
		}
		else
		{
			System.out.println("Character is Consonent");
		}
	}
}
