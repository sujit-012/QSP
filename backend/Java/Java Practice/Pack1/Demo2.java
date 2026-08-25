class Demo2 
{
	String str ="Non-static variable";
	
	{
		System.out.println("Non-static block");
	}
	
	public void m1(){
		System.out.println("m1() Non-static OuterClass");
		System.out.println(str);
	}
	
	public static void m2(){
		System.out.println("m2() Static method OuterClass");
	}
	
	class InnerClass
	{
		public void m3(){
			System.out.println("m3() Not-static InnerClass");
		}
		
		public static void m4(){
			System.out.println("m4() static InnerClass");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main()");
		Demo2 obj = new Demo2();
		Demo2.InnerClass obj2 = obj.new InnerClass();
		obj2.m3();
		m2();
		
		Demo2.InnerClass.m4();
	}
}
