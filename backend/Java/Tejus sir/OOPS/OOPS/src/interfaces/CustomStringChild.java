package interfaces;

public class CustomStringChild extends CustomString{
	
	public CustomStringChild() {
		value = new char[0];
	}
	
	public CustomStringChild(String str)
	{
		value = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			value[i] = str.charAt(i);
		}
	}
	
	public CustomStringChild(char [] ch)
	{
		value = new char[ch.length];
		
		for(int i = 0; i < ch.length; i++)
		{
			value[i] = ch[i];
		}
	}
	
	public CustomStringChild(StringBuffer sb)
	{
		value = new char[sb.length()];
		
		for(int i = 0; i < sb.length(); i++)
		{
			value[i] = sb.charAt(i);
		}
	}
	
	public CustomStringChild(StringBuilder sb)
	{
		value = new char[sb.length()];
		
		for(int i = 0; i < sb.length(); i++)
		{
			value[i] = sb.charAt(i);
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
		
		return new String(value);
	}
	
	public int indexOf(int ch, int fromIndex)
	{
		for(int i = fromIndex; i < value.length; i++)
		{
			if(value[i] == ch)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public int indexOf(int ch)
	{
		return indexOf(ch, 0);
	}
	
	public int lastIndexOf(int ch, int fromIndex)
	{
		for(int i = fromIndex; i >= 0; i--)
		{
			if(value[i] == ch)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public int lastIndexOf(int ch)
	{
		return lastIndexOf(ch, value.length - 1);
	}
}
