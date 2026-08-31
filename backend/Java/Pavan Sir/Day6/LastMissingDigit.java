import java.util.Scanner;

public class LastMissingDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 9; i >= 0; i--) {

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
                System.out.println("Last missing digit = " + i);
                break;
            }
        }
    }
}