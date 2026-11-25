package interfaces;

abstract class CustomString {
	protected char[] value;
	
	public abstract int length();
	
	public abstract boolean isEmpty();
	
	public abstract char charAt(int index);
	
	public abstract char[] toCharArray();
	
	public abstract String toString();
	
	public abstract int indexOf(int ch, int fromIndex);
	
	public abstract int indexOf(int ch);
	
	public abstract int lastIndexOf(int ch, int fromIndex);
	
	public abstract int lastIndexOf(int ch);
	
	public abstract boolean contains(String str);
	
	public abstract CustomString replace(char oldChar, char newChar);
	
	public abstract CustomString concat(String str);
	
	public abstract CustomString toUpperCase();
	
	public abstract CustomString toLowerCase();
	
	public abstract CustomString substring(int beginIndex, int endIndex);
	
	public abstract CustomString substring(int beginIndex);
	
	public abstract boolean equals(Object obj);
	
	public abstract boolean equalIgnoreCase(CustomString str);
}
