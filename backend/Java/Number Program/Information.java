import java.util.Scanner;

public class Information
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Your Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Your Date of Birth (DD/MM/YYYY): ");
        String dob = sc.nextLine();

        System.out.print("Enter Your Mobile Number: ");
        long mobile = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Your Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Your Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Your City: ");
        String city = sc.nextLine();

        System.out.print("Enter Your State: ");
        String state = sc.nextLine();

        System.out.print("Enter Your Country: ");
        String country = sc.nextLine();

        System.out.print("Enter Your Pincode: ");
        int pincode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your College Name: ");
        String college = sc.nextLine();

        System.out.print("Enter Your University Name: ");
        String university = sc.nextLine();

        System.out.print("Enter Your Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Your Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Your Percentage of 12th: ");
        float percentage = sc.nextFloat();
        sc.nextLine();


        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Date of Birth : " + dob);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Email : " + email);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Country : " + country);
        System.out.println("Pincode : " + pincode);
        System.out.println("College : " + college);
        System.out.println("University : " + university);
        System.out.println("Branch : " + branch);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Percentage : " + percentage);
    }
}