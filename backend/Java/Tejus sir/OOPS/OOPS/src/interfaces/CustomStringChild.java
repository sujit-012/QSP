package interfaces;

public class CustomStringChild extends CustomString{
	
	public CustomStringChild()
	{
		value = new char[0];
	}
	
	public CustomStringChild(String str)
	{
		value = new char[str.length()];
		
		for(int i = 0; i < value.length; i++)
		{
			value[i] = str.charAt(i);
		}
	}
	
	public CustomStringChild(char [] ch)
	{
		value = new char[ch.length];
		
		for(int i = 0; i < value.length; i++)
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
	
	public String toString()
	{
		if(isEmpty()) {
			return "";
		}
		
		return new String(value);
	}
	
	public char charAt(int index)
	{
		if(index < 0 || index >= value.length)
		{
			throw new StringIndexOutOfBoundsException();
		}
		
		return value[index];
	}
}
