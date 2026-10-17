package JAVA;

public class ShoppingCart {
	private String userName;
	private String pass;
	private int items;
	private double toPrice;
	private double price = 100;
	
	ShoppingCart(String userName, String pass)
	{
		this.userName = userName;
		this.pass = pass;
	}
	
	public boolean verifyUser(String userName, String pass)
	{
		return this.userName == userName && this.pass == pass;
	}
	
	//setter methods add and remove
	
	public void addItem(int items, String userName, String pass)
	{
		if(verifyUser(userName, pass))
		{
			if(items >= 1)
			{
				this.items = this.items + items;
				toPrice = toPrice +  (items * price);
				System.out.println("Item added Successfully !!");
				System.out.println("Total items : " + this.items);
				System.out.println("Total Price : " + toPrice);
			}
			else
			{
				System.out.println("Invalid items");
			}
		}
		else
		{
			System.out.println("Invalid credentials !! ");
		}
	}
	
	public void removeItem(int items, String userName, String pass)
	{
		if(verifyUser(userName, pass))
		{
			if((this.items - items) >= 0  && items >= 1)
			{
				this.items = this.items - items;
				toPrice = toPrice -  (items * price);
				System.out.println("Item remove Successfully !!");
				System.out.println("Total items : " + this.items);
				System.out.println("Total Price : " + toPrice);
			}
			else
			{
				System.out.println("Insufficient items in cart !!");
			}
		}
		else
		{
			System.out.println("Invalid credentials !! ");
		}
	}
	
	//getter
	public void showCart(String userName, String pass)
	{
		if(verifyUser(userName, pass))
		{
			System.out.println("Total items : " + this.items);
			System.out.println("price :" + price);
			System.out.println("Total Price : " + toPrice);
		}
		else
		{
			System.out.println("Invalid credentials !!");
		}
	}
}
