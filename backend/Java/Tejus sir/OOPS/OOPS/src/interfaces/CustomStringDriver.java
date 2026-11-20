package interfaces;

public class CustomStringDriver {

    public static void main(String[] args) {

        CustomString cstr = new CustomStringChild("Hello");

        System.out.println("Length: " + cstr.length());

        System.out.println("Is Empty: " + cstr.isEmpty());

        System.out.println("Character: " + cstr.charAt(1));

        System.out.println("String: " + cstr.toString());

        System.out.println("Character Array: ");

        System.out.println(cstr.toCharArray());
    }
}