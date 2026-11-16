class FrequencyOfVowels 
{
	public static void main(String[] args) 
	{
		char[] ch = {'a', 'b', 'E', 'A', 'i', 'o', 'b', 'U'};
		System.out.println(frequencyOfVowels(ch));
	}
	
	public static int frequencyOfVowels(char [] n)
	{
		int count = 0;
		
		for(int i = 0; i < n.length; i++)
		{
			if(n[i] == 'A' || n[i] == 'a' ||
				n[i] == 'E' || n[i] == 'e' ||
				n[i] == 'I' || n[i] == 'i' || 
				n[i] == 'O' || n[i] == 'o' || 
				n[i] == 'U' || n[i] == 'u')
			{
				count++;
			}
		}
		
		return count;
	}
}
