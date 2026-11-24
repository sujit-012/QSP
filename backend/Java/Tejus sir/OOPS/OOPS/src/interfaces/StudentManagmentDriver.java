package interfaces;

import java.util.Arrays;

public class StudentManagmentDriver {

    public static void main(String[] args) {

        StudentManagment obj = new StudentManagmentImp();

        int[] marks1 = {85, 90, 75, 90, 60, 85, 95};
        int[] marks2 = {70, 80, 65, 95, 55};

        int[] uniqueMarks = obj.removeDuplicateMarks(marks1);
        System.out.println("Unique Marks: " + Arrays.toString(uniqueMarks));

        int[] sortArray = marks1.clone();
        obj.sortMarks(sortArray);
        System.out.println("Sorted Marks: " + Arrays.toString(sortArray));

        int[] mergedMarks = obj.mergeTwoMarkSheet(marks1, marks2);
        System.out.println("Merged Marks: " + Arrays.toString(mergedMarks));

        System.out.println("Average Marks: " + obj.averageMarks(marks1));

        System.out.println("Least Mark: " + obj.leastMark(marks1));

        System.out.println("Highest Mark: " + obj.highestMark(marks1));

        int[] topThree = obj.topThreeMarks(marks1.clone());
        System.out.println("Top Three Marks: " + Arrays.toString(topThree));

    }
}