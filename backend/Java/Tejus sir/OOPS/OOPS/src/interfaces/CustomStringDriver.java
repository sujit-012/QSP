package interfaces;

public class CustomStringDriver {

    public static void main(String[] args) {
    	
    		String str = new String("Hello");
    		System.out.println(str.indexOf('l', 1));

        CustomString cstr = new CustomStringChild("hello");
        System.out.println(cstr.indexOf('l', 1));
    }
}
