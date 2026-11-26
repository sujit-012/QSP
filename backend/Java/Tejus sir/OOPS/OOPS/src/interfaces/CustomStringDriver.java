package interfaces;

public class CustomStringDriver {

    public static void main(String[] args) {
    	
    		String str = new String("Hello");
    		System.out.println(str.endsWith("loo"));

        CustomString cstr = new CustomStringChild("Hello");
        System.out.println(cstr.endsWith("loo"));
        
        
    }
}
