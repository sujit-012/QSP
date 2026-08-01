import java.util.Scanner;

class IndianSeason
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number between 1 to 12: ");
        int month = sc.nextInt();

        if(month < 1 || month > 12)
        {
            System.out.println("Invalid month number");
        }
        else if(month == 3 || month == 4)
        {
            System.out.println("Season: Spring");
        }
        else if(month == 5 || month == 6)
        {
            System.out.println("Season: Summer");
        }
        else if(month == 7 || month == 8)
        {
            System.out.println("Season: Monsoon");
        }
        else if(month == 9 || month == 10)
        {
            System.out.println("Season: Autumn");
        }
        else if(month == 11 || month == 12)
        {
            System.out.println("Season: Pre-Winter");
        }
        else
        {
            System.out.println("Season: Winter");
        }
    }
}