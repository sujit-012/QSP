package JAVA;

public class StudentMan {
	private String admin = "Sujit";
	private String pass = "123";
	private String name;
	private int rollNo;
	private double mMark;
	private double eMark;
	private double sMark;
	
	StudentMan(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	private boolean verifyAdmin(String admin, String pass)
	{
		return this.admin == admin && this.pass == pass;
	}
	
	//set math
	public void setMMarks(String admin, String pass, double mMark)
	{
		if(mMark >= 0 && mMark <= 100)
		{
			if(verifyAdmin(admin, pass))
			{
				this.mMark = mMark;
				System.out.println("math marks updated !!");
				System.out.println("Your Total Mark is : " + (mMark + eMark + sMark)); 
			
			}
			else
			{
				System.out.println("Unautorized person");
			}
			
		}  
		else
		{
			System.out.println("Invalid marks");
		}
	}
	
	//set English
	public void setEMarks(String admin, String pass, double eMark)
	{
		if(eMark >= 0 && eMark <= 100)
		{
			if(verifyAdmin(admin, pass))
			{
				this.eMark = eMark;
				System.out.println("English marks updated !!");
				System.out.println("Your Total Mark is : " + (mMark + eMark + sMark));
			}
			else
			{
				System.out.println("Unautorized person");
			}
			
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}
	
	//set science
	public void setSMarks(String admin, String pass, double sMark)
	{
		if(sMark >= 0 && sMark <= 100)
		{
			if(verifyAdmin(admin, pass))
			{
				this.sMark = sMark;
				System.out.println("Science marks updated !!");
				System.out.println("Your Total Mark is : " + (mMark + eMark + sMark));
			}
			else
			{
				System.out.println("Unautorized person");
			}
			
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}
	
	//get Math
	public double getMMarks(String admin, String pass)
	{
		if(verifyAdmin(admin, pass))
		{
			return mMark;
		}
		else
		{
			System.out.println("Unautorized person");
			return -1;
		}
	}


	//get English
		public double getEMarks(String admin, String pass)
		{
			if(verifyAdmin(admin, pass))
			{
				return eMark;
			}
			else
			{
				System.out.println("Unautorized person");
				return -1;
			}
		}
		
		//get Science
		public double getSMarks(String admin, String pass)
		{
			if(verifyAdmin(admin, pass))
			{
				return sMark;
			}
			else
			{
				System.out.println("Unautorized person");
				return -1;
			}
		}
		
		//get Marks
		public double getMarks(String admin, String pass)
		{
			if(verifyAdmin(admin, pass))
			{
				return sMark + mMark + eMark;
			}
			else
			{
				System.out.println("Unautorized person");
				return -1;
			}
		} 
	
}
