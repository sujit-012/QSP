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
}
