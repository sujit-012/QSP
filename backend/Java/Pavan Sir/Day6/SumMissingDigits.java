import java.util.Scanner;

public class SumMissingDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= 9; i++) {

            int count = 0;
            int temp = num;

            while (temp != 0) {

                int digit = temp % 10;

                if (digit == i) {
                    count++;
                }

                temp = temp / 10;
            }

            if (count == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of missing digits = " + sum);
    }
}