package interfaces;

public class CustomStringDriver {

    public static void main(String[] args) {
    	
    		String str = new String("Hello");
    		System.out.println(str.contains("loo"));

        CustomString cstr = new CustomStringChild("Hello");
        System.out.println(cstr.contains("loo"));
    }
}
