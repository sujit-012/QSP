package JAVA;

public class ShoppingCartDriver {
	
	public static void main(String args[])
	{
		ShoppingCart sc = new ShoppingCart("Sujit", "123");
		
		sc.addItem(2, "Sujit", "123");
		sc.addItem(5, "Sujit", "123");
		
		sc.removeItem(2, "Sujit", "123");
		
		sc.showCart("Sujit", "123");
		
		System.out.println("-------------------------------------------------");
		
        ShoppingCart sc2 = new ShoppingCart("Pappu", "005");
		
		sc2.addItem(2, "Pappu", "005");
		sc2.addItem(10, "Pappu", "005");
		
		sc2.removeItem(2, "Pappu", "005");
		
		sc2.showCart("Pappu", "005");

	}
}
