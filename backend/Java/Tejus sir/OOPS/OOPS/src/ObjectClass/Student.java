package ObjectClass;

import java.util.Objects;

class Student
{
	String name;
	int roll;
	double mark;
	String coll;
	int age;
	
	
	public Student() {
		
	}
	
	public Student(String name, int roll, double mark, String coll, int age)
	{
		this.name = name;
		this.roll = roll;
		this.mark = mark;
		this.coll = coll;
		this.age = age;
	}
	
	public String toString()
	{
		return "Name : " + name + ", Roll Number : " + roll + ", age : " + age;
	}
	
	public boolean equals(Object ref)
	{
		if(ref != null)
		{
			
		}
		
		return false;
	}
}
