import java.util.Scanner;
class PinValidate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int attempt = 0;
		
		int pinStored = 1234;
		
		do
		{
			System.out.print("Enter a Pin : ");
			int pin = sc.nextInt();
			
			if(pin == pinStored)
			{
				System.out.println("Login Successful!");
				break;
			}
			else
			{
				System.out.println("Invalid pin");
				attempt++;
			}
		}
		while(attempt < 3);
		
		if(attempt == 3)
		{
			System.out.println("Maximum attempt reached!");
		}
	}
}
