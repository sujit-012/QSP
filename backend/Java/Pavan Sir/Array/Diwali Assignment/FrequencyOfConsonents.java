class FrequencyOfConsonents 
{
	public static void main(String[] args) 
	{
		char[] ch = {'a', '0', 'b', 'E', 'A', '8' , 'i', 'o', 'b', '5', 'U'};
		System.out.println(frequencyOfConsonents(ch));
	}
	
	public static int frequencyOfConsonents(char [] n)
	{
		int count = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(((n[i] >= 'A' && n[i] <= 'Z') || (n[i] >= 'a' && n[i] <= 'z')) &&
				!(n[i] == 'A' || n[i] == 'a' ||
				n[i] == 'E' || n[i] == 'e' ||
				n[i] == 'I' || n[i] == 'i' || 
				n[i] == 'O' || n[i] == 'o' || 
				n[i] == 'U' || n[i] == 'u'))
			{
				count++;
			}
		}
		
		return count;
	}
}
