package interfaces;

import java.util.Arrays;

public class ArraysReqDriver {

	public static void main(String[] args)
	{
		ArraysReq arr = new ArrayReqImp();
		
		int [] num = {5, 8, 3, 18, 7};
		arr.halfReverseArrayAfterSorting(num);
		System.out.println(Arrays.toString(num));
		
		int [] num1 = {1, 2, 1, 2, 1, 2};
		System.out.println(arr.palindromeArray(num1));
	}
}
