package interfaces;

public class NumberProgramsDriver {
	
	public static void main(String[] args)
	{
		NumberPrograms n1 = new NumberProgramsImp();
		System.out.println(n1.isArmstrong(153));
		System.out.println(n1.isPalindrome(1221221));
		System.out.println(n1.twistedPrime(13));
		n1.squarePattern(5);
	}
}
