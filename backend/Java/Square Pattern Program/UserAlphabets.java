import java.util.Scanner;
class UserAlphabets 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 9;
		
		while(true)
		{
			System.out.print("Enter a Upper case character : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'A')
			{
				//A
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i + j == n/2 || i == n/2 || j == 0 && i > n/2 || j == n-1 && i > n/2 || j-i == n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			else if(ch == 'B')
			{
				//B
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || j == 0 || i == n-1 || j == n-1 || i == n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'C')
			{
			
			//c
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || i == n-1 || j == 0)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			else if(ch == 'D')
			{	
				//D
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || j == 0 || i == n-1 || j == n-1)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'E')
			{
				//E
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || i == n/2 || i == n-1 || j == 0)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
			
				System.out.println();
			}
			
			else if(ch == 'F')
			{
				//F
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || i == n/2 || j == 0)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();	
			}	
			
			else if(ch == 'G')
			{
				
			//G
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || j == 0 || i == n-1 || j == n-1 && i > n/2 ||i == n/2 && j > n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'H')
			{
				//H
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || j == n-1 || i == n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'I')
			{
				//I
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || i == n-1 || j == n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'J')
			{
				//J
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || j == n/2 || i == n-1 && j < n/2 || j == 0 && i > n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'K')
			{
				//K
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || i + j == n/2 || i-j == n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'L')
			{
				//L
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || i == n-1 && j < n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}	
			
			else if(ch == 'M')
			{
				//M
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || j == n - 1 || i == j && j <= n/2 || i+j == n-1 && j > n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'N')
			{
				
				//N
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || j == n-1 || i == j)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'O')
			{
				//O
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || j == 0 || i == n-1 || j == n-1)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'P')
			{
				//p
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || i == 0 && j < n/2 || j == n/2 && i <= n/2 || i == n/2 && j < n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'Q')
			{
				//Q
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 1 && j > 0 && j < n - 1|| i > 0 && j == 1 && i < n-1 ||  i == j && j > n/2 || j == n-2 && i > 0 && i < n-1 || i == n-2 && j > 0 && j < n-1)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'R')
			{
				//R
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || i == 0 && j < n/2 || j == n/2 && i <= n/2 || i == n/2 && j < n/2 || i-j == n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'S')
			{
				//S
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || i == n/2 || i == n-1 || i < n/2 && j == 0 || i > n/2 && j == n-1)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'T')
			{
				//T
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i == 0 || j == n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}	
			
			else if(ch == 'U')
			{
				//U
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || j == n-1 || i == n-1)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'V')
			{
				//V
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 && i < n/2 || i-j == n/2 || j == n-1 && i < n/2 || i+j == n/2 + (n-1) )
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'W')
			{
				//W
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(j == 0 || j == n-1 || i + j == n-1 && j <= n/2 || i == j && j > n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'X')
			{
				//X
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i==j || i+j == n-1)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'Y')
			{
				//Y
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i==j && j <= n/2 || i+j == n-1 && j > n/2 || j == n/2 && i > n/2)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				}
				
				System.out.println();
			}
			
			else if(ch == 'Z')
			{
				//Z
				for(int i = 0; i < n; i++)
				{
					for(int j = 0; j < n; j++)
					{
						if(i==0 || i == n-1 || i+j == n-1)
						{
							System.out.print("*" + " ");
						}
						else
						{
							System.out.print(" " + " ");
						}
					}
					System.out.println();
				
				}
			}
			else
			{
				System.out.println("Enter a valid Upper case character !");
			}
			
		}
	}
}
