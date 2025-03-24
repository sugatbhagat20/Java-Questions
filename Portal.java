package com.problems;

import java.util.ArrayList;

class Student2
{
	String name;
	String collegeName;
    float percentage;
    private float scholarship;
	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + ", percentage=" + percentage
				+ ", scholarship=" + scholarship + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float getScholarship() {
		return scholarship;
	}
	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}
	public Student2(String name, String collegeName, float percentage) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.percentage = percentage;
	}
	public Student2() {
		// TODO Auto-generated constructor stub
	}
}

class Scholarship
{
	ArrayList<Student2> studentList=new ArrayList();
	void assignScholarship()
	{
		for(Student2 item:studentList)
		{
			if(item.getPercentage()>=91)
			{
				item.setScholarship(10000);
			}
			else if(item.getPercentage()>=81)
			{
				item.setScholarship(5000);
			}
			else if(item.getPercentage()<81)
			{
				item.setScholarship(0);
			}
		}
	}
	
	float  totalScholarship()
	{
		float total=0;
		for(Student2 item:studentList)
		{
			total+=item.getScholarship();
		}
		
		return total;
		
	}
	String totalMaxScholarshipOfCollege()
	{
		float max=0;
		String res="";
		for(Student2 item:studentList)
		{
			float local=item.getScholarship();
			if(local>max)
			{
				max=local;
				res=item.getCollegeName();
			}
		}
		return res;
		
	}
}

public class Portal 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2();
		Scholarship sc=new Scholarship();
		sc.studentList.add(new Student2("Steve", "IIT", 89));
		sc.studentList.add(new Student2("Bob", "NIT", 94));
		sc.studentList.add(new Student2("Alice", "Abcd", 59));
		sc.assignScholarship();
		System.out.println(sc.totalScholarship());
		System.out.println(sc.totalMaxScholarshipOfCollege());
		

	}

}
