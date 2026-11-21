package interfaces;

public interface StudentManagment {

	int[] removeDuplicateMarks(int [] ar);
	
	void sortMarks(int [] ar);
	
	int[] mergeTwoMarkSheet(int[] ar1, int[] ar2);
	
	int averageMarks(int [] ar);
	
	int leastMark(int [] ar);
	
	int highestMark(int [] ar);
	
	int[] topThreeMarks(int [] ar);
}
