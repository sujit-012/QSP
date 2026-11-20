import java.util.Arrays;
class CustomString
{
	private char[] value;
	
	public CustomString()
	{
		value = new char[0];
	}
	
	public CustomString(String str)
	{
		value = new char[str.length()];
		
		for(int i = 0; i < value.length; i++)
		{
			value[i] = str.charAt(i);
		}
	}
	
	public CustomString(char[] ch)
	{
		value = new char[ch.length];
		
		for(int i = 0; i < ch.length; i++)
		{
			value[i] = ch[i];
		}
	}
	
	public int length()
	{
		return value.length;
	}
	
	public boolean isEmpty()
	{
		return value.length == 0;
	}
	
	public char[] toCharArray()
	{
		return value;
	}
	
	public char charAt(int index)
	{
		if(index < 0 || index >= value.length)
		{  
			throw new StringIndexOutOfBoundsException();
		}
		
		return value[index];
	}
	
	public String toString()
	{
		if(isEmpty())
		{
			return "";
		}
		
		return new String(value);
	}
}

public class CustomStringDriver
{
	public static void main(String [] args)
	{
		char [] c = {'S', 'u', 'j', 'i', 't'};
		String str = new String(c);
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(Arrays.toString(str.toCharArray()));
		
		System.out.println("==========================================");
		
		CustomString cstr = new CustomString(c);
		System.out.println(cstr.length());
		System.out.println(cstr);
		System.out.println(cstr.charAt(0));
		System.out.println(Arrays.toString(cstr.toCharArray()));

	}
}
