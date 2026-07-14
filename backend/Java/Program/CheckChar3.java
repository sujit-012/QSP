import java.util.Scanner;
class CheckChar3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z') ? "Character is Uppercase" : ((ch >= 'a' && ch <= 'z') ? "character is Lowercase" : ((ch >= '0' && ch <= '9') ? "character is Digit" : "Character is Special Character"));
		
		System.out.println(result);
	}
}
