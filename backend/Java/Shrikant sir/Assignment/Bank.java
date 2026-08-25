import java.util.Scanner;
import java.util.ArrayList;
class Bank 
{
	static String name;
	static String password;
	static double balance;
	static int upiPin;
	static ArrayList<String> transaction = new ArrayList<String>();
	
	public static void main(String[] args) 
	{
		launchApplication();
	}
	
	public static void launchApplication()
	{
		while(true)
		{
			System.out.println("\n *********WELCOME*********\n");
			System.out.println("1.Create Account \n2.Login");
			
			System.out.print("Enter a option : ");
			int opt = new Scanner(System.in).nextInt();
			
			switch(opt)
			{
				case 1 -> createAccount();
				case 2 -> login();
				default -> System.out.println("\n INVALID OPTION \n");
			}
		}
	}
	
	//Login
	public static void login()
	{
		if(name == null)
		{
			System.out.println("\n CREATE YOUR ACCOUNT FIRST \n");
			return ;
		}
		
		System.out.println("\n ********* LOGIN *********\n");
		
		int attempt = 3;
		do
		{
			System.out.print("Username : ");
			String userName1 = new Scanner(System.in).next();
			
			System.out.print("Password : ");
			String password1 = new Scanner(System.in).next();
			
			if(name.equals(userName1) && password.equals(password1))
			{
				homePage();
				return;
			}
			
			System.out.println("\n INVALID CREDENTIAL ");
			System.out.println("Attempts left : " + (--attempt));
		}
		while (attempt >= 1);
		
		System.out.print("\n YOUR ACCOUT IS LOCKED FOR 48 HOURS \n");
		System.exit(0);
	}
	
	//HomePage
	public static void homePage()
	{
		while(true)
		{
			System.out.println("\n ********* Home Page *********\n");
			System.out.println("1.Deposite \n2.Withdraw \n3.Check Balance \n4.Statement \n5.logout");
			
			System.out.print("Enter your option : ");
			int opt = new Scanner(System.in).nextInt();
			
			switch(opt)
			{
				case 1 -> depositeAmount();
				case 2 -> withdrawAmount();
				case 3 -> checkBalance();
				case 4 -> statement();
				case 5 -> logout();
				default -> System.out.println("\n INVALID OPTION ");
			}
		}
	}
	
	//depositeAmount
	public static void depositeAmount()
	{
		System.out.println("\n ********* Deposite Module *********\n");
		
		System.out.print("Enter an amount : ");
		double dpAmt = new Scanner(System.in).nextDouble();
		
		if(dpAmt <= 0)
		{
			System.out.println("\n INVALID AMOUNT \n");
			return;
		}
		
		balance += dpAmt;
		transaction.add("Credited : " + dpAmt);
		System.out.println("\n Amount Deposited Successfully \n");
	}

	
	//withdrawAmount
	public static void withdrawAmount()
	{
		System.out.println("\n ********* WithDraw Module *********\n");
		
		System.out.print("Enter an amount : ");
		double wtdAmt = new Scanner(System.in).nextDouble();
		
		System.out.print("Enter Upi Pin : ");
		int upiPin1 = new Scanner(System.in).nextInt();
		
		if(upiPin == upiPin1)
		{
			if(wtdAmt > balance)
			{
				System.out.println("\n INSUFFICIENT BALANCE \n");
			}
			else if(wtdAmt <= 0)
			{
				System.out.println("\n INVALID AMOUNT \n");
			}
			else
			{
				System.out.println("\n AMOUNT DEBITED SUCCESSFULLY \n");
				transaction.add("Debited " + wtdAmt);
				balance -= wtdAmt;
				
				System.out.println("DO YOU WANT TO VIEW YOUR BALANCE (YES/NO) : ");
				String resp = new Scanner(System.in).next().toUpperCase();
				
				if(resp.equals("YES"))
				{
					System.out.println("YOUR ACCOUTN BALACE : " + balance + "rs");
				}
			}
		}
		else
		{
			System.out.println("\n INVALID PIN \n");
		}

	}
	
	//Check Balance
	public static void checkBalance()
	{
		System.out.println("\n ********* Check Balance Module *********\n");
		
		System.out.print("Enter your pin : ");
		int upiPin1 = new Scanner(System.in).nextInt();
		
		if(upiPin1 == upiPin)
		{
			System.out.println(name + " Your account balance is : " + balance + "rs");
		}
		else
		{
			System.out.println("\n INVALID PIN \n");
		}
	}

	
	//Statement
	public static void statement()
	{
		System.out.println("\n ********* Statement Module *********\n");
		
		for(String i : transaction)
		{
			System.out.println(i);
		}
	}

	
	//Logout
	public static void logout()
	{
		System.out.println("\n ********* THANK YOU AND VISIT AGAIN *********\n");
		launchApplication();
	}

	
	//Create Account
	public static void createAccount()
	{
		if(name != null)
		{
			System.out.println("\n ACCOUNT ALREADY EXIST \n");
			return;
		}
		
		System.out.println("\n *********CREATE ACCOUNT*********\n");
		
		System.out.print("Username : ");
		name = new Scanner(System.in).nextLine();
		
		System.out.print("Password : ");
		password = new Scanner(System.in).next();
		
		System.out.print("Amount : ");
		balance = new Scanner(System.in).nextDouble();
		
		transaction.add("Deposit : " + balance);
		
		System.out.print("Upi Pin : ");
		upiPin = new Scanner(System.in).nextInt();
	}

}
