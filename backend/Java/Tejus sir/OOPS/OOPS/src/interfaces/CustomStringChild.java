package interfaces;

public class CustomStringChild extends CustomString{
	public CustomStringChild()
	{
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
	
	public CustomStringChild(char[] ch)
	{
		value = new char[ch.length];
		
		for(int i = 0; i < ch.length; i++)
		{
			value[i] = ch[i];
		}
	}
	
	public CustomStringChild(StringBuilder sb)
	{
		value = new char[sb.length()];
		
		for(int i = 0; i < value.length; i++)
		{
			value[i] = sb.charAt(i);
		}
	}
	
	public CustomStringChild(StringBuffer sb)
	{
		value = new char[sb.length()];
		
		for(int i = 0; i < value.length; i++)
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
	
	public String toString()
	{
		if(isEmpty())
		{
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
			if(ch == value[i])
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
	
	public boolean contains(String str)
	{
		if(str.length() > value.length)
		{
			return false;
		}
		
		for(int i = 0; i < value.length; i++)
		{
			int count = 0;
			
			for(int j = 0; j < str.length() && (i + j) < value.length; j++)
			{ 
				if(value[i + j] == str.charAt(j))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			
			if(count == str.length()) {
				return true;
			}
		}
		
		return false;
	}
	
	public CustomStringChild replace(char oldChar, char newChar)
	{
		char[] res = new char[value.length];
		
		for(int i = 0; i < value.length; i++)
		{
			if(value[i] == oldChar)
			{
				res[i] = newChar;
			}
			else
			{
				res[i] = value[i];
			}
		}
		
		return new CustomStringChild(res);
	}
	
	public CustomStringChild concat(String str)
	{
		if(str.isEmpty())
		{
			return this;
		}
		
		char[] res = new char[value.length + str.length()];
		int index = 0;
		
		for(int i = 0; i < value.length; i++)
		{
			res[index++] = value[i];
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			res[index++] = str.charAt(i);
		}
		
		return new CustomStringChild(res);
	}
	
	public CustomStringChild toUpperCase()
	{
		char[] res = new char[value.length];
		
		for(int i = 0; i < value.length; i++)
		{
			if(value[i] >= 'a' && value[i] <= 'z')
			{
				res[i] = (char) (value[i] - 32);
			}
			else
			{
				res[i] = value[i];
			}
		}
		
		return new CustomStringChild(res);
	}
	
	public CustomStringChild toLowerCase()
	{
		char[] res = new char[value.length];
		
		for(int i = 0; i < res.length; i++)
		{
			if(value[i] >= 'A' && value[i] <= 'Z')
			{
				res[i] = (char) (value[i] + 32);
			}
			else
			{
				res[i] = value[i];
			}
		}
		
		return new CustomStringChild(res);
	}
	
	public CustomStringChild substring(int beginIndex, int endIndex)
	{
		if(beginIndex < 0 || beginIndex >= value.length || endIndex < 0 || endIndex  > value.length || beginIndex > endIndex)
		{
			throw new StringIndexOutOfBoundsException();
		}
		
		char[] res = new char[endIndex - beginIndex];
		int index = 0;
		
		for(int i = beginIndex; i < endIndex; i++)
		{
			res[index++] = value[i];
		}
		
		return new CustomStringChild(res);	
	}
	
	public CustomStringChild substring(int beginIndex)
	{
		return substring(beginIndex, value.length);
	}
	
	public boolean equalIgnoreCase(CustomString str)
	{
		if(str == null)
		{
			return false;
		}
		
		if(str.length() != this.length())
		{
			return false;
		}
		
		if(str == this)
		{
			return true;
		}
		
		for(int i = 0; i < value.length; i++)
		{
			char ch1 = value[i];
			char ch2 = str.charAt(i);
			
			if(ch1 >= 'A' && ch1 <= 'Z')
			{
				ch1 = (char) (ch1 + 32);
			}
			
			if(ch2 >= 'A' && ch2 <= 'Z')
			{
				ch2 = (char) (ch2 + 32);
			}
			
			if(ch1 != ch2)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
		{
			return false;
		}
		
		if(!(obj instanceof CustomString))
		{
			return false;
		}
		
		CustomStringChild cs = (CustomStringChild) obj;
		
		if(cs.length() != value.length)
		{
			return false;
		}
		
		if(cs == this)
		{
			return true;
		}
		
		for(int i = 0; i < value.length; i++)
		{
			if(value[i] != cs.charAt(i))
			{
				return false;
			}
		}
		
		return true;
	}
}
